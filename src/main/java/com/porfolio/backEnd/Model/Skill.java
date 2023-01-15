package com.porfolio.backEnd.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id_skill;

    @Column(columnDefinition = "varchar(45)",nullable = false)
    private String skill_name;

    @Column(nullable = false, columnDefinition = "INTEGER")
    private int  domain_skill;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String  color_skill;
    public Skill() {
    }

    public Skill(Long id, String skill_name, int domain_skill,String color_skill) {
        this.id_skill = id;
        this.skill_name = skill_name;
        this.domain_skill = domain_skill;
        this.color_skill= color_skill;
    }
    @JsonIgnore
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User user;

}
