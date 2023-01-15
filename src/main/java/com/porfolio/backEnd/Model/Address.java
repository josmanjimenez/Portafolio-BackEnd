package com.porfolio.backEnd.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private  Long id_addres;

    @Column(columnDefinition = "varchar(45)",nullable = false)
    private String contry;

    @Column(columnDefinition = "varchar(45)",nullable = false)
    private String city;

    @Column(columnDefinition = "varchar(45)")
    private String location;

    public Address() {
    }

    public Address(Long id, String contry, String city, String location) {
        this.id_addres = id;
        this.contry = contry;
        this.city = city;
        this.location = location;
    }
    @JsonIgnore
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_user")
    private User user;
}
