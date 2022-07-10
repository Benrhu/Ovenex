package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.Oven;
import com.example.Ovenex.OvenexApplication;

import java.util.Scanner;

public class TermostateService {

    Oven oven;

    Scanner input = new Scanner(System.in);

    int temperature = oven.currentTemperature;

    int scanTemperature() {
        return temperature;
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
