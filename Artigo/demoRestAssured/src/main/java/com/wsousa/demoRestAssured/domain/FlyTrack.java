package com.wsousa.demoRestAssured.domain;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Entity
@Table(name = "fly_track")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class FlyTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fly_track_seq")
    @SequenceGenerator(sequenceName = "fly_track_seq", allocationSize = 1, name = "fly_track_seq")
    @Column(name = "id_fly_track", unique = true, nullable = false)
    private long idFlyTrack;

    @Column(name="dyn_id")
    private String id;

    @Column(name="type_name")
    private String typeName;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="created_at")
    private Timestamp createdAt;

    private String status;

    @Column(name="dyn_owner")
    private String owner;

    private long trackId;

    private long userId;

    private String flyTrackTrackId;

    @OneToMany(
        mappedBy="flyTrack",
        cascade = CascadeType.ALL
    )
    private List<QuestionResponse> answers;


}
