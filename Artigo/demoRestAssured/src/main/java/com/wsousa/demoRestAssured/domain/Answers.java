package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "answers")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answer_seq")
    @SequenceGenerator(sequenceName = "answer_seq", allocationSize = 1, name = "answer_seq")
    private long id;

    @Column(name="text_answers")
    private String text;

    @Column(name="ok")
    private boolean ok;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idQuestion", referencedColumnName = "id_question")
    private Question question;
}
