package com.porfolio.backEnd.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoUpdateAddress {
    private String contry;
    private String city;
    private String location;
}
