package com.example.Ovenex.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;


@Table(name = "UserData")
public @Data @Entity class UserData {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userDataId")
    public Long userId;

    @Column(name = "email")
    public String email;

    @Column(name = "name")
    public String name;

    @Column(name = "surname")
    public String surname;

    @Column(name = "phone")
    public String phone;

    @Column(name = "location")
    public String location;

    @OneToOne(targetEntity = Oven.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ovenexId", referencedColumnName = "Id")
    private Oven oven;

    @Column(name = "timesUsed")
    public Integer timesUsed;

    @Column(name = "timesCleaned")
    public Integer timesCleaned;

    @Column(name = "recipesUsed")
    public Integer recipesUsed;

    @Column(name = "ingredientsUsed")
    public Integer ingredientsUsed;

    @Column(name = "comeBackUsed")
    public Integer comeBackUsed;

    @Column(name = "foodHistoryUsed")
    public Integer foodHistoryUsed;


    public UserData() {
    }

    public UserData(Long userId, String email, String name, String surname, Integer phone, String location, Long Id,Integer timesUsed, Integer timesCleaned, Integer recipesUsed, Integer ingredientsUsed, Integer comeBackUsed, Integer foodHistoryUsed) {
        this.userId = userId;
        this.timesUsed = timesUsed;
        this.timesCleaned = timesCleaned;
        this.recipesUsed = recipesUsed;
        this.ingredientsUsed = ingredientsUsed;
        this.comeBackUsed = comeBackUsed;
        this.foodHistoryUsed = foodHistoryUsed;
        //this.id = ovenexId;
    }
}