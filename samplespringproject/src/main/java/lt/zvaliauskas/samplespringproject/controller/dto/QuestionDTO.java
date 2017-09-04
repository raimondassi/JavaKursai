package lt.zvaliauskas.samplespringproject.controller.dto;

import lt.zvaliauskas.samplespringproject.domain.AnswerType;

import java.util.List;

public class QuestionDTO {
    private String text;
    private AnswerType type;
    private List<QuestionValueDTO> answerValues;

    public QuestionDTO() {
    }

    public QuestionDTO(String text, AnswerType type, List<QuestionValueDTO> answerValues) {
        this.text = text;
        this.type = type;
        this.answerValues = answerValues;
    }

    public String getText() {
        return text;
    }

    public List<QuestionValueDTO> getAnswerValues() {
        return answerValues;
    }

    public AnswerType getType() {
        return type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(AnswerType type) {
        this.type = type;
    }

    public void setAnswerValues(List<QuestionValueDTO> answerValues) {
        this.answerValues = answerValues;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "text='" + text + '\'' +
                ", type=" + type +
                ", answerValues=" + answerValues +
                '}';
    }
}
