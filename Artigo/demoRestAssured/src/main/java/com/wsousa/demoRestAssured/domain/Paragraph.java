package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "paragraph")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Paragraph {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paragraph_seq")
    @SequenceGenerator(sequenceName = "paragraph_seq", allocationSize = 1, name = "paragraph_seq")
    private long id;

    private String paragraph;

    @Column(name="begin_book")
    private double begin;

    @Column(name="end_book")
    private double end;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idVideoBook", referencedColumnName = "id_video_book")
    private VideoBook videoBook;
}
