package com.example.Ovenex.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;
import javax.persistence.*;
import java.lang.reflect.Type;

@Entity
@Data
@Table(name = "User")
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "userId")
    @Column(name = "userId")
    private Long userId;

    private enum Roles {
        MANAGER,
        CUSTOMER
    }

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "role")
    private Roles role;

    // private String userToken;

    public User() {}

    public User(String email, String password, String name, String surname, String phone, String address, String country, String city, Roles role) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.city = city;
        this.role = role;
    }
}
