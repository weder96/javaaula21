package com.wsousa.demoRestAssured.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "project")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Project implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
	@SequenceGenerator(sequenceName = "project_seq", allocationSize = 1, name = "project_seq")
	private Long id;

	private String nome;
	private String email;
	private String cpf;

}
