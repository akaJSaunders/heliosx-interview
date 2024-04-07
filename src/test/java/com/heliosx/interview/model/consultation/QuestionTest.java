package com.heliosx.interview.model.consultation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuestionTest {
    @Test
    public void testConstructor() {
        // Given
        Long id = 1L;
        String text = "What is the capital of France?";
        String[] validAnswers = { "Paris", "London", "Rome" };
        String correctAnswer = "Paris";

        // When
        Question question = new Question(id, text, validAnswers, correctAnswer);

        // Then
        assertNotNull(question);
        assertEquals(id, question.getId());
        assertEquals(text, question.getText());
        assertEquals(validAnswers, question.getValidAnswers());
        assertEquals(correctAnswer, question.getCorrectAnswer());
    }
}
