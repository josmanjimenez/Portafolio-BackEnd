package com.porfolio.backEnd.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id_project;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String name_project;

    @Column(columnDefinition = "varchar(1000)", nullable = false)
    private String image_project;

    @Column(columnDefinition = "varchar(5000)", nullable = false)
    private String description_project;

    @Column(columnDefinition = "varchar(1000)", nullable = false)
    private String url_project;

    public Project() {
    }

    public Project(Long id, String name_proyect, String image_project, String description_project, String url_project) {
        this.id_project = id;
        this.name_project = name_proyect;
        this.image_project = image_project;
        this.description_project = description_project;
        this.url_project = url_project;
    }
    @JsonIgnore
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User user;

}
