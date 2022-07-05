package com.example.Ovenex.Entities;

import javax.persistence.*;

@Entity
@Table(name = "UserData")
public class UserData {

    Oven oven = new Oven();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id = oven.getId();

    public Integer timesUsed;
    public Integer timesCleaned;
    private String statsFood;

    public UserData() {
    }

    public UserData(Integer timesUsed, Integer timesCleaned, String statsFood) {
        this.timesUsed = timesUsed;
        this.timesCleaned = timesCleaned;
        this.statsFood = statsFood;
    }
}