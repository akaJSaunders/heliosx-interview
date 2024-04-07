package com.heliosx.interview.service.consultation;

import com.heliosx.interview.model.consultation.Answer;
import com.heliosx.interview.model.consultation.Consultation;
import com.heliosx.interview.model.consultation.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EligibilityService {
    private final Consultation consultation;
    private final Map<Long, Answer> answerMap;
    private final List<Question> questions;

    public EligibilityService(Consultation consultation) {
        this.consultation = consultation;
        this.questions = consultation.getQuestions();
        this.answerMap = createAnswerMap();
    }

    public Boolean isEligible(){
        for (Question question : questions){
            Answer answer = answerMap.get(question.getId());
            if(answer == null || !answer.getText().equals(question.getCorrectAnswer())){
                return false;
            }
        }

        return true;
    }

    private Map<Long, Answer> createAnswerMap() {
        Map<Long, Answer> questionMap = new HashMap<>();

        for (Answer answer : consultation.getAnswers()) {
            questionMap.put(answer.getQuestionId(), answer);
        }

        return questionMap;
    }
}
