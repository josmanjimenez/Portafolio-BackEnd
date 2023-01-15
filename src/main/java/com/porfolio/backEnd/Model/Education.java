package com.porfolio.backEnd.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id_education ;

    @Column(columnDefinition = "varchar(45)",nullable = false)
    private String institution;

    @Column(columnDefinition = "mediumtext",nullable = false)
    private String image_education;

    @Column(columnDefinition = "varchar(45)",nullable = false)
    private String title;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date start_date_education;

    @Column
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ending_date_education;

    @Column
    private Boolean  finish;



    public Education() {
    }

    public Education(Long id, String institution, String image_education, String title, Date start_date_education, Date ending_date_education, Boolean finish) {
        this.id_education = id;
        this.institution = institution;
        this.image_education = image_education;
        this.title = title;
        this.start_date_education = start_date_education;
        this.ending_date_education = ending_date_education;
        this.finish = finish;
    }
    @JsonIgnore
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User user;


}
