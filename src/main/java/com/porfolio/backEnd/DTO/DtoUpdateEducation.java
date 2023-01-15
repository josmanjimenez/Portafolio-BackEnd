package com.porfolio.backEnd.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class DtoUpdateEducation {

    private String institution;
    private String image_education;
    private String title;
    private Date start_date_education;
    private Date ending_date_education;
    private Boolean  finish;

}
