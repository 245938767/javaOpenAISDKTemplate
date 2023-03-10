package cn.xiao.response;

import cn.xiao.model.UrlData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagesResponse {
    private String created;
    private List<UrlData> data;


}


