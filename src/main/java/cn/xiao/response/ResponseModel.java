package cn.xiao.response;

import cn.xiao.model.Choices;
import cn.xiao.model.Usage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModel {

        private String id;
        private String object;
        private long created;
        private List<Choices> choices;
        private Usage usage;


    }

