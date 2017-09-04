package lt.zvaliauskas.samplespringproject.service;

import lt.zvaliauskas.samplespringproject.domain.QuestionValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionValuesService {

    private QuestionValuesRepository questionValuesRepository;

    public QuestionValuesService(QuestionValuesRepository questionValuesRepository) {
        this.questionValuesRepository = questionValuesRepository;
    }

    public void createValuesForQuestion(Integer questionId, List<String> answerValues) {
        for (String value : answerValues) {
            QuestionValue questionValue = new QuestionValue(value, questionId);
            questionValuesRepository.save(questionValue);
        }
    }
}
