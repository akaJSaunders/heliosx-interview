package com.heliosx.interview.service;

import com.heliosx.interview.model.consultation.Answer;
import com.heliosx.interview.model.consultation.Consultation;
import com.heliosx.interview.model.consultation.Question;
import com.heliosx.interview.service.consultation.EligibilityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EligibilityServiceTest {

    private EligibilityService eligibilityService;
    private Consultation consultation;

    @BeforeEach
    public void setUp() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1L, "What is the capital of France?", new String[]{"Paris", "London", "Berlin"}, "Paris"));
        questions.add(new Question(2L, "What is 2 + 2?", new String[]{"3", "4", "5"}, "4"));

        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer(1L, "Paris"));
        answers.add(new Answer(2L, "4"));

        this.consultation = new Consultation(questions, answers);
    }

    @Test
    public void testIsEligible_AllCorrectAnswers() {
        // Given
        eligibilityService = new EligibilityService(consultation);

        // When Then
        assertTrue(eligibilityService.isEligible(), "Consultation should be eligible");
    }

    @Test
    public void testIsEligible_IncorrectAnswer() {
        // Given
        List<Answer> answers = consultation.getAnswers();
        answers.get(1).setText("5");
        eligibilityService = new EligibilityService(consultation);

        // When Then
        assertFalse(eligibilityService.isEligible(), "Consultation should not be eligible");
    }

    @Test
    public void testIsEligible_MissingAnswer() {
        // Given
        List<Answer> answers = consultation.getAnswers();
        answers.remove(0);
        eligibilityService = new EligibilityService(consultation);

        // When Then
        assertFalse(eligibilityService.isEligible(), "Consultation should not be eligible");
    }
}