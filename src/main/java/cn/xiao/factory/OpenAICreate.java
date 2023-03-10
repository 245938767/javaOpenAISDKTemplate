package cn.xiao.factory;


import cn.xiao.factory.chat.Chat;
import cn.xiao.factory.chat.ChatRequestModel;
import cn.xiao.factory.completions.Completions;
import cn.xiao.factory.completions.CompletionsRequestModel;
import cn.xiao.factory.image.Images;
import cn.xiao.factory.image.ImagesRequestModel;
import cn.xiao.response.ImagesResponse;
import cn.xiao.response.ResponseModel;

import java.util.function.Consumer;

public class OpenAICreate {
    /**
     * @param consumer
     * @return
     */
    public static Post<ResponseModel> getCompletions(Consumer<CompletionsRequestModel> consumer) {
        return new Completions<>(consumer);
    }

    /**
     * @param consumer
     * @return
     */
    public static Post<ResponseModel> getChat(Consumer<ChatRequestModel> consumer) {
        return new Chat<>(consumer);
    }

    /**
     * @param consumer
     * @return
     */
    public static Post<ImagesResponse> getImages(Consumer<ImagesRequestModel> consumer) {
        return new Images<>(consumer);
    }
}
