package com.wsousa.demoRestAssured.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "question_response")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class QuestionResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_response_seq")
	@SequenceGenerator(sequenceName = "question_response_seq", allocationSize = 1, name = "question_response_seq")
	private long id;

	private String question;

	private long questionId;

	private boolean ok;


	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="idFlyTrack", referencedColumnName = "id_fly_track")
	private FlyTrack flyTrack;

	@Override
	public String toString() {
		return "QuestionResponse{" +
			"id=" + id +
			", question='" + question + '\'' +
			", ok='" + ok + '\'' +
			'}';
	}
}
