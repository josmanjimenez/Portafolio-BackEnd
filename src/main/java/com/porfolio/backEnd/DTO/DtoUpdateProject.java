package com.porfolio.backEnd.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoUpdateProject {

    private String name_project;
    private String image_project;
    private String description_project;
    private String url_project;
}
