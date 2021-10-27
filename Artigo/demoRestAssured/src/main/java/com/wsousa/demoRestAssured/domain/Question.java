package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "question")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_seq")
    @SequenceGenerator(sequenceName = "question_seq", allocationSize = 1, name = "question_seq")
    @Column(name = "id_question", unique = true, nullable = false)
    private long idQuestion;

    @Column(name="dyn_id")
    private String id;

    private String question;
    private String agency;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="answers")
    private String answer;

    private String state;
    private String licao;
    private String jury;

    @Column(name="year_question")
    private String year;

    @Column(name="number_question")
    private long number;

    private double duration;
    private String title;
    private String explanation;

    @OneToMany(
            mappedBy="question",
            cascade = CascadeType.ALL
    )
    private List<Answers> answers;

    @Override
    public String toString() {
        return "Question{" +
                "idQuestion=" + idQuestion +
                ", id='" + id + '\'' +
                ", question='" + question + '\'' +
                ", agency='" + agency + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", answer='" + answer + '\'' +
                ", state='" + state + '\'' +
                ", licao='" + licao + '\'' +
                ", jury='" + jury + '\'' +
                ", year='" + year + '\'' +
                ", number=" + number +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                ", explanation='" + explanation + '\'' +
                ", answers=" + answers +
                '}';
    }
}
