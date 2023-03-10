package cn.xiao.factory.chat;


import cn.xiao.factory.OpenAiRequest;
import cn.xiao.model.Message;

import java.util.ArrayList;
import java.util.List;

public class ChatRequestModel implements OpenAiRequest {
    private String model = "gpt-3.5-turbo";
    private List<Message> messages;

    public ChatRequestModel() {
        this.messages = new ArrayList<>();
    }

    public ChatRequestModel addMessages(String user, String content) {
        messages.add(new Message(user, content));
        return this;
    }
    public ChatRequestModel addSystemMessages( String content) {
        messages.add(new Message("system", content));
        return this;
    }
    public ChatRequestModel addAssistantMessages( String content) {
        messages.add(new Message("assistant", content));
        return this;
    }
    public ChatRequestModel addUserMessages( String content) {
        messages.add(new Message("user", content));
        return this;
    }


    public String getModel() {
        return model;
    }

    public List<Message> getMessages() {
        return messages;
    }

}
