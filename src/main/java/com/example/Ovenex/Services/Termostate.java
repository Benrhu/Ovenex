package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.Oven;
import com.example.Ovenex.OvenexApplication;

import java.util.Scanner;

public class Termostate {

    Oven oven = new Oven();

    Scanner input = new Scanner(System.in);

    int temperature = Oven.currentTemperature;

    int scanTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {

        System.out.println("What temperature do you want to set?");

        int newTemperature = input.nextInt();

        System.out.println("Setting temperature to " + newTemperature + " degrees...");
    }

    void TooHot(){
        System.out.println("Temperature is too high");
        System.out.println("Do you want to reset the oven or call customer service?");
        System.out.println("1. Reset your Ovenex");
            System.out.println("2. Do you want to reset the oven or call customer service?");

        int option = input.nextInt();

        if (option == 1) {
            System.out.println("Restart your Ovenex");
            OvenexApplication.restart();

        } else if (option == 2) {
            System.out.println("Calling customer service");
        }
    }
}
