package cn.xiao.factory;


import cn.xiao.model.OpenAIErrorCode;

import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.ServerException;

/**
 * 抽象类（用于定义一些共用的方法）
 */
public abstract class BaseOpenAIOperation implements OpenAIOperation {
    protected HttpURLConnection con;
    // 连接超时(豪秒)
    private static final int CONNECT_TIMEOUT = 60000;
    // 接收数据超时(豪秒)
    private static final int RECEIVE_TIMEOUT = 60000;

    /**
     * 初始化（每个继承类必须调用）
     *
     * @param url
     */
    protected BaseOpenAIOperation(String url) {
        try {
            if (url.isEmpty()) {
                throw new ServerException(OpenAIErrorCode.OPEN_AI_API_URL_NOTFOUND.getName());
            }
            con = (HttpURLConnection) new URL(url).openConnection();
            con.setConnectTimeout(CONNECT_TIMEOUT);
            con.setReadTimeout(RECEIVE_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    protected final void initOpenAI(String method, String jsonObject) {
        try {
            con.setRequestMethod(method);
            con.setRequestProperty("Content-Type", "application/json");
            //获得key的方式可以放在spring的Application.yml中，方便管理
            con.setRequestProperty("Authorization", "Bearer yourKey");
            con.setDoOutput(true);
            con.getOutputStream().write(jsonObject.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(OpenAIErrorCode.OPEN_AI_NETWORK_SEND_ERROR.getName());
        }
    }


}
