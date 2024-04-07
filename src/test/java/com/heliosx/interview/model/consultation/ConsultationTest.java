package com.heliosx.interview.model.consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConsultationTest {

    private List<Question> questions;
    private List<Answer> answers;

    @BeforeEach
    public void setUp() {
        String[] validAnswers = {"yes", "no"};

        questions = new ArrayList<>();
        questions.add(new Question(1L, "Do you like star wars?", validAnswers, "Yes"));
        questions.add(new Question(2L, "Are you sure you do?", validAnswers, "Yes"));

        answers = new ArrayList<>();
        answers.add(new Answer(1L, "Yes"));
        answers.add(new Answer(2L, "Yes"));
    }

    @Test
    public void testConstructor() {
        // Given
        Consultation consultation = new Consultation(questions, answers);

        // Then
        assertNotNull(consultation);
        assertNotNull(consultation.getId());
        assertEquals(questions, consultation.getQuestions());
        assertEquals(answers, consultation.getAnswers());
    }
}