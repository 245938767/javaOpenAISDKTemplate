package cn.xiao.response;

import lombok.Data;

import java.util.List;

@Data
public class ImagesResponse {
    private String created;
    private List<UrlData> data;

    @Data
    public class UrlData {
        private String url;
    }
}

