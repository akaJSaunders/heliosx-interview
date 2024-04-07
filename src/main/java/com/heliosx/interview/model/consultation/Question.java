package com.heliosx.interview.model.consultation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Question {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("validAnswers")
    private String[] validAnswers ;
    @JsonProperty("correctAnswer")
    private String correctAnswer ;

    public Question(Long id, String text, String[] validAnswers, String correctAnswer) {
        this.id = id;
        this.text = text;
        this.validAnswers = validAnswers;
        this.correctAnswer = correctAnswer;
    }
}
