package cn.xiao.factory.completions;


import cn.xiao.factory.OpenAiRequest;

public class CompletionsRequestModel implements OpenAiRequest {
    private String model = "text-davinci-003";
    private String prompt;
    private float temperature = TEMPERATURE;
    private int max_tokens = MAX_TOKENS;
    private static final float TEMPERATURE = 1.0f;
    private static final int MAX_TOKENS = 400;

    public CompletionsRequestModel(String prompt, int temperature, int maxTokens) {
        this.prompt = prompt;
    }

    public CompletionsRequestModel(String prompt) {
        this.prompt = prompt;
    }

    public String getModel() {
        return model;
    }


    public String getPrompt() {
        return prompt;
    }

    public CompletionsRequestModel setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public float getTemperature() {
        return temperature;
    }


    public int getMax_tokens() {
        return max_tokens;
    }

}
