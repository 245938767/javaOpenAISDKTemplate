package cn.xiao;

import cn.xiao.factory.OpenAICreate;
import cn.xiao.model.UrlData;
import cn.xiao.response.ImagesResponse;
import cn.xiao.response.ResponseModel;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2,SSLv3");
        //图片请求
        Optional<ImagesResponse> image = OpenAICreate.getImages(x -> x.setPrompt("企鹅图片")).post().execute();
        for (UrlData datum : image.get().getData()) {
            System.out.println(datum);
        }
        //gpt对话
        Optional<ResponseModel> gpt = OpenAICreate.getChat(x -> {
            x.addSystemMessages("你好AI").addSystemMessages("世界上最好的语言是什么");
        }).post().execute();
        System.out.println(gpt.get().getChoices().get(0).getMessage().getContent());
        Optional<ResponseModel> text = OpenAICreate.getCompletions(x -> x.setPrompt("静夜思")).post().execute();
        System.out.println(text.get().getChoices().get(0).getText());

        System.out.println("");
    }
}