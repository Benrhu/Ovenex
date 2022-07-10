package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.Oven;

public class PuertaService {

    Oven oven;
    boolean mainDoor = oven.mainDoor;;

    public void closeDoor() {
        mainDoor = false;
        System.out.println("Closing door...");
    }

    public void openDoor() {
        if (!mainDoor)
            mainDoor = true;
            System.out.println("Opening door...");
        }

}
