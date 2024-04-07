package com.heliosx.interview.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heliosx.interview.model.consultation.Answer;
import com.heliosx.interview.model.consultation.Consultation;
import com.heliosx.interview.model.consultation.Question;
import com.heliosx.interview.service.consultation.EligibilityService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/consultation")
public class ConsultationController {

    List<Question> consultationQuestions = new ArrayList<>();
    List<Answer> consultationAnswers = new ArrayList<>();

    public ConsultationController() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Question[] questionArray = objectMapper.readValue(
            new ClassPathResource("/consultation/questions.json").getInputStream(),
            Question[].class
        );

        Collections.addAll(consultationQuestions, questionArray);
    }

    @PostMapping("")
    public Consultation createConsultation(@RequestBody List<Answer> answers) {
        consultationAnswers.addAll(answers);
        Consultation consultation = new Consultation(consultationQuestions, consultationAnswers);

        EligibilityService eligibilityService = new EligibilityService(consultation);
        consultation.setProductEligibility(eligibilityService.isEligible());
        return consultation;
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return consultationQuestions;
    }
}