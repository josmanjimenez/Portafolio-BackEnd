package com.porfolio.backEnd.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoUpdateUser {
    private String image_user;
    private String description_user;
    private String name_user;
    private String lastName_user;
    private String email;
    private String last_profession;
    private String trade_profession;
    private String user_password;
    private String phone_number;
}
