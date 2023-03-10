package cn.xiao.factory.image;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImagesRequestModel {
    private String prompt;
    private Integer n = DEFAULT_NUM;
    private String size = DEFAULT_SIZE;
    private static final String DEFAULT_SIZE = "1024x1024";
    private static final Integer DEFAULT_NUM = 2;

    public ImagesRequestModel() {
        this.prompt = "";
    }

    public ImagesRequestModel setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    public ImagesRequestModel setN(Integer n) {
        this.n = n;
        return this;
    }

    public ImagesRequestModel setSize(String size) {
        this.size = size;
        return this;
    }

    public String getPrompt() {
        return prompt;
    }

    public Integer getN() {
        return n;
    }

    public String getSize() {
        return size;
    }
}
