package com.porfolio.backEnd.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class DtoUpdateExperience {

    private String company_name;
    private String position;
    private String image_logo;
    private Date start_date_experience;
    private Date ending_date_experience;
    private String description_experience;
}
