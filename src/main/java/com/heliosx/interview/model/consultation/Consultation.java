package com.heliosx.interview.model.consultation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
public class Consultation {
    @JsonProperty("id")
    private final UUID id;
    @JsonProperty("questions")
    private final List<Question> questions;
    @JsonProperty("answers")
    private final List<Answer> answers;
    @JsonProperty("productEligibility")
    private boolean productEligibility;

    public Consultation(List<Question> questions, List<Answer> answers) {
        this.id = UUID.randomUUID();
        this.questions = questions;
        this.answers = answers;
    }
}
