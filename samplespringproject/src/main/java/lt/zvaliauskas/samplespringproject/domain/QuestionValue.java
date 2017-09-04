package lt.zvaliauskas.samplespringproject.domain;

import javax.persistence.*;

@Entity
@Table(name = "QUESTIONS_VALUES")
public class QuestionValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "QUEST_ID")
    private Integer questId;


    //For Hibernate
    QuestionValue() {
    }

    public QuestionValue(String text, Integer questId) {
        this.text = text;
        this.questId = questId;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getQuestId() {
        return questId;
    }
}
