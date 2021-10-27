package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "track_question")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class QuestionTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "track_question_seq")
    @SequenceGenerator(sequenceName = "track_question_seq", allocationSize = 1, name = "track_question_seq")
    private long idQuestionTrack;

    @Column(name="dyn_id")
    private String id;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="created_at")
    private Timestamp createdAt;

    private String questionTracksQuestionId;

    private String questionTracksTrackId;

    private long trackId;

    private long questionId;

}
