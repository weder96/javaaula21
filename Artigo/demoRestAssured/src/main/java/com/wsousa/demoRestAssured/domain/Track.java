package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "track")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "track_seq")
    @SequenceGenerator(sequenceName = "track_seq", allocationSize = 1, name = "track_seq")
    private long idTrack;

    @Column(name="dyn_id")
    private String id;

    @Column(name="type_name")
    private String typeName;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="created_at")
    private Timestamp createdAt;


    private String poster;
    private String subtitle;

    @Column(name="order_track")
    private String order;
    private String strategyTracksId;
    private String title;

    @Column(name="type_track")
    private String type;

    private long idStrategy;

    @Override
    public String toString() {
        return "Track{" +
                "idTrack=" + idTrack +
                ", id='" + id + '\'' +
                ", typeName='" + typeName + '\'' +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", poster='" + poster + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", order='" + order + '\'' +
                ", idStrategy='" + idStrategy + '\'' +
                ", strategyTracksId='" + strategyTracksId + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
