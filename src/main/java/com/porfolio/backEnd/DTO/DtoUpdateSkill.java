package com.porfolio.backEnd.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoUpdateSkill {

    private String skill_name;
    private int  domain_skill;
    private String color_skill;
}
