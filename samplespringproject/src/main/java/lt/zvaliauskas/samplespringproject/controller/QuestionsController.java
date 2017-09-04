package lt.zvaliauskas.samplespringproject.controller;

import lt.zvaliauskas.samplespringproject.controller.dto.QuestionDTO;
import lt.zvaliauskas.samplespringproject.controller.dto.QuizElementDTO;
import lt.zvaliauskas.samplespringproject.domain.Question;
import lt.zvaliauskas.samplespringproject.domain.QuestionValue;
import lt.zvaliauskas.samplespringproject.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class QuestionsController {

    private QuestionService questionService;

    @Autowired
    public QuestionsController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(value = "/question", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<QuizElementDTO> getQuizElements() {
        List<QuizElementDTO> elements = new ArrayList<QuizElementDTO>();

        for(Question question : questionService.getAllQuestions()) {
            List<String> answerTexts = new ArrayList<String>();
            for(QuestionValue value : question.getAnswers()) {
                answerTexts.add(value.getText());
            }

            elements.add(new QuizElementDTO(question.getText(), answerTexts));
        }

        return elements;
    }

    /**
     *
     {
        "text": "Klausimas numeris 2?",
        "type": "INPUT",
        "dtos": [
            {
                "text": "Iveskite atsakyma:"
            }
        ]
     }
     *
     * @param questionDTO
     * @return
     */
    @RequestMapping(value = "/question", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> createQuestion(@RequestBody QuestionDTO questionDTO) {

        questionService.createQuestion(questionDTO.getText(), questionDTO.getType(),
                questionDTO.getAnswerValues()
                        .stream()
                        .map(value -> value.getText())
                .collect(toList()));

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
