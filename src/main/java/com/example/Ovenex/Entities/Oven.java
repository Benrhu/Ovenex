package com.example.Ovenex.Entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;

/*
* The goal os this project is to create a virtual oven, the future of ovens is Ovenex :)
*
* Ovenex has functionalities like:
* -> Cookrain: this system allow you rest in calm while yur Ovenex is preparing and cooking your meal.
*    You only have to put the ingredients is a space A end you can keep reading your favourite book.
* -> Oven to choose your meal based of your {UserData} which collect data of your experience with your Ovenex.
*
* Creamos la clase HornoObj con lo que queremos que contenga nuestro horno.
* Implementamos la interfaz MethodsOvenex.
 */


@Table(name="Oven")
public @Data @Entity class Oven {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ovenexId")
    private Long ovenexId;

    @Column(name="Model")
    private String model;

    @Column(name="MinTemperature")
    public Integer minTemperature;

    @Column(name="MaxTemperature")
    public Integer maxTemperature;

    @Column(name="CurrentTemperature")
    public static Integer currentTemperature;

    @Column(name="IsOn")
    public Boolean isRunning;

    public Boolean mainDoor = false;

    public Boolean piroMotor;

    @Column(name="Color")
    private String color;

    @Column(name="Height")
    private Double height;

    @Column(name="Width")
    private Double width;

    public Oven() {
    }

    public Oven(Long ovenexid, String model, Integer minTemperature, Integer maxTemperature, Integer currentTemperature, Boolean isRunning, Boolean mainDoor, Boolean piroDoor, String color, Double height, Double width) {
        this.ovenexId = ovenexid;
        this.model = model;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.currentTemperature = currentTemperature;
        this.isRunning = isRunning;
        this.mainDoor = mainDoor;
        this.piroMotor = piroDoor;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void turnOn(){
        System.out.println("Hello " + "name, " + "welcome to your Ovenex ");
        isRunning = true;
    }

    public void turnOff(){
        System.out.println("Turning off your Ovenex...");
        isRunning = false;
    }
}