package lt.zvaliauskas.samplespringproject.controller.dto;

import lt.zvaliauskas.samplespringproject.domain.AnswerType;

public class QuestionValueDTO {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuestionValueDTO() {
    }

    @Override
    public String toString() {
        return "QuestionValueDTO{" +
                "text='" + text + '\'' +
                '}';
    }
}
