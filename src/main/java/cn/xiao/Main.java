package cn.xiao;

import cn.xiao.factory.OpenAICreate;
import cn.xiao.factory.OpenAIExecutor;
import cn.xiao.response.ResponseModel;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //图片请求
        Optional<ResponseModel> image = OpenAICreate.getImages(x -> x.setPrompt("企鹅图片")).post().execute();
        //gpt对话
        Optional<ResponseModel> gpt = OpenAICreate.getChat(x -> {
            x.addSystemMessages("你好AI").addSystemMessages("世界上最好的语言是什么");
        }).post().execute();
        Optional<ResponseModel> text = OpenAICreate.getCompletions(x -> x.setPrompt("静夜思")).post().execute();

    }
}