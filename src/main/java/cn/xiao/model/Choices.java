package cn.xiao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choices {

    private int index;
    private Message message;
    private String finish_reason;
    private String text;
    private String logprobs;
}
