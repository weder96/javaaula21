package com.wsousa.demoRestAssured.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "users")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(sequenceName = "users_seq", allocationSize = 1, name = "users_seq")
    private long id;

    @Column(name="dyn_id")
    private String owner;

    @Column(name="email")
    private String email;


    @Override
    public String toString() {
        return "Users{" +
                "id_users=" + id +
                ", owner='" + owner + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
