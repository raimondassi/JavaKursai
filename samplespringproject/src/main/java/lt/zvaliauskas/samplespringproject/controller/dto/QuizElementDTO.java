package lt.zvaliauskas.samplespringproject.controller.dto;

import java.util.List;

public class QuizElementDTO {
    private String questionText;
    private List<String> answers;

    public QuizElementDTO(String questionText, List<String> answers) {
        this.questionText = questionText;
        this.answers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
