package com.porfolio.backEnd.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private  Long id_experience;

    @Column(columnDefinition = "varchar(45)", nullable = false)
    private String company_name;

    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String position;

    @Column(columnDefinition = "varchar(10000)", nullable = false)
    private String image_logo;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date start_date_experience;

    @Column()
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ending_date_experience;

    @Column(columnDefinition = "varchar(2000)", nullable = false)
    private String description_experience;

    public Experience() {
    }

    public Experience(Long id, String company_name, String position, String image_logo, Date start_date_experience, Date ending_date_experience, String description_experience) {
        this.id_experience = id;
        this.company_name = company_name;
        this.position = position;
        this.image_logo = image_logo;
        this.start_date_experience = start_date_experience;
        this.ending_date_experience = ending_date_experience;
        this.description_experience = description_experience;
    }
    @JsonIgnore
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User user;

}
