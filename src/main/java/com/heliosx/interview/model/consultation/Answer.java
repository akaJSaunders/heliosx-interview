package com.heliosx.interview.model.consultation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Answer {
    @JsonProperty("questionId")
    private Long questionId;
    @JsonProperty("text")
    private String text;

    public Answer(Long questionId, String text) {
        this.questionId = questionId;
        this.text = text;
    }
}
