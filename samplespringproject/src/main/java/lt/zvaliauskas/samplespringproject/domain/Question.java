package lt.zvaliauskas.samplespringproject.domain;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "QUESTIONS")
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private AnswerType type;

    @OneToMany(mappedBy = "questId")
    private List<QuestionValue> answers;

    Question() {
    }

    public Question(String text, AnswerType type) {
        this.text = text;
        this.type = type;
    }

    public List<QuestionValue> getAnswers() {
        return answers;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public AnswerType getType() {
        return type;
    }
}
