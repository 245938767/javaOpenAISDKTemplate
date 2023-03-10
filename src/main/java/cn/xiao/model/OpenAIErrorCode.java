package cn.xiao.model;


import java.util.Optional;

public enum OpenAIErrorCode implements BaseEnum<OpenAIErrorCode> {

    OPEN_AI_NETWORK_ERROR(10020001,"网络连接失败"),
    OPEN_AI_API_URL_NOTFOUND(10020002,"未初始化Api URL"),
    OPEN_AI_NETWORK_SEND_ERROR(10020003,"发送请求接口失败")
    ;

    OpenAIErrorCode(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    private final Integer code;
    private final String name;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static Optional<OpenAIErrorCode> of(Integer code) {
        return Optional.ofNullable(BaseEnum.parseByCode(OpenAIErrorCode.class, code));
    }
}
