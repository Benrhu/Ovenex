package com.example.Ovenex.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Table(name = "UserData")
@Component
public @Data @Entity class UserData {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "userDataId")
    @Column(name = "userDataId")
    public Long userDataId;

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
    public Integer timesUsed = 0;

    @Column(name = "timesCleaned")
    public Integer timesCleaned = 0;

    @Column(name = "recipesUsed")
    public Integer recipesUsed = 0;

    @Column(name = "ingredientsUsed")
    public Integer ingredientsUsed = 0;

    @Column(name = "comeBackUsed")
    public Integer comeBackUsed = 0;

    @Column(name = "foodHistoryUsed")
    public Integer foodHistoryUsed = 0;


    public UserData() {
    }

    public UserData(Long userDataId, String email, String name, String surname, Integer phone, String location, Oven oven,Integer timesUsed, Integer timesCleaned, Integer recipesUsed, Integer ingredientsUsed, Integer comeBackUsed, Integer foodHistoryUsed) {
        this.userDataId = userDataId;
        this.timesUsed = timesUsed;
        this.timesCleaned = timesCleaned;
        this.recipesUsed = recipesUsed;
        this.ingredientsUsed = ingredientsUsed;
        this.comeBackUsed = comeBackUsed;
        this.foodHistoryUsed = foodHistoryUsed;
        this.oven = oven;
    }
}