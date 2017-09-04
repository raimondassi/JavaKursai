package lt.zvaliauskas.samplespringproject.service;

import lt.zvaliauskas.samplespringproject.domain.AnswerType;
import lt.zvaliauskas.samplespringproject.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class QuestionService {

    private QuestionRepository questionRepository;
    private QuestionValuesService questionValuesService;

    @Autowired // Nebutina
    public QuestionService(QuestionRepository questionRepository,
                           QuestionValuesService questionValuesService) {
        this.questionRepository = questionRepository;
        this.questionValuesService = questionValuesService;
    }

    @Transactional(readOnly = true)
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Transactional
    public void createQuestion(Question question) {
        questionRepository.save(question);
    }

    @Transactional
    public void createQuestion(String text, AnswerType type, List<String> answerValues) {
        Question question = questionRepository.saveAndFlush(new Question(text, type));
        questionValuesService.createValuesForQuestion(question.getId(), answerValues);
    }
}
