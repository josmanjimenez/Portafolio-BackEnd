package com.porfolio.backEnd.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id_user;

    @Column(columnDefinition = "varchar(1000)")
    private String image_user;

    @Column(columnDefinition = "varchar(5000)", nullable = false)
    private String description_user;

    @Column(columnDefinition = "varchar (255)", nullable = false)
    private String name_user;

    @Column(columnDefinition = "varchar (255)", nullable = false)
    private String lastName_user;
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String last_profession;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String trade_profession;

    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String user_password;

    @Column(columnDefinition = "varchar(12)", nullable = false)
    private String phone_number;

    public User() {
    }

    public User(Long id_user, String image_user, String description_user, String name_user, String lastName_user, String email, String last_profession, String trade_profession, String user_password, String phone_number) {
        this.id_user = id_user;
        this.image_user = image_user;
        this.description_user = description_user;
        this.name_user = name_user;
        this.lastName_user = lastName_user;
        this.email = email;
        this.last_profession = last_profession;
        this.trade_profession = trade_profession;
        this.user_password = user_password;
        this.phone_number = phone_number;
    }
    @JsonIgnore
    @OneToMany( mappedBy = "user", cascade = CascadeType.ALL)
    private List<Education> educations;

    @JsonIgnore
    @OneToMany( mappedBy = "user")
    private List<Experience> experiences;

    @JsonIgnore
    @OneToMany( mappedBy = "user")
    private List<Project> projects;

    @JsonIgnore
    @OneToMany( mappedBy = "user")
    private List<Skill> skills;

    @JsonIgnore
    @OneToOne( mappedBy = "user")
    private Address address;
}
//fetch =  FetchType.LAZY ,      ,optional = false