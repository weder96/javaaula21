package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "videobook")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class VideoBook {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "videobook_seq")
    @SequenceGenerator(sequenceName = "videobook_seq", allocationSize = 1, name = "videobook_seq")
    @Column(name = "id_video_book", unique = true, nullable = false)
    private long idVideoBook;

    @Column(name="dyn_id")
    private String id;

    @Column(name="type_name")
    private String typeName;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="video")
    private String video;

    @Column(name="ebook")
    private String ebook;

    @Column(name="duration")
    private double duration;

    @Column(name="title")
    private String title;

    @Column(name="paragraph")
    private String paragraph;

    @OneToMany(
            mappedBy="videoBook",
            cascade = CascadeType.ALL
    )
    private List<Paragraph> text;


}
