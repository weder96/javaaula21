package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "strategy")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Strategy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "strategy_seq")
    @SequenceGenerator(sequenceName = "strategy_seq", allocationSize = 1, name = "strategy_seq")
    private long id;

    @Column(name="dyn_id")
    private String dyn;

    @Column(name="type_name")
    private String typeName;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="order_strategy")
    private int order;

    private String title;

    @Column(name="type_strategy")
    private String  type;

    @Override
    public String toString() {
        return "Strategy{" +
                "__typename='" + typeName + '\'' +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", order=" + order +
                ", id='" + id + '\'' +
                ", dyn='" + dyn + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
