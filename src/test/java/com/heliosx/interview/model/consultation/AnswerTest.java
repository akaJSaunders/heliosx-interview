package com.heliosx.interview.model.consultation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnswerTest {

    @Test
    public void testConstructor() {
        // Given
        Long expectedQuestionId = 1L;
        String expectedText = "Yes";

        // When
        Answer answer = new Answer(expectedQuestionId, expectedText);

        // Then
        assertNotNull(answer);
        assertEquals(expectedQuestionId, answer.getQuestionId());
        assertEquals(expectedText, answer.getText());
    }
}