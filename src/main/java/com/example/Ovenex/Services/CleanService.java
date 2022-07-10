package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.UserData;

public class CleanService {
    /**
     * ovenDirty:
     * 0: clean
     * 1-4: can be cleaned
     * 5-7: needs to bebe cleaned
     * 8-10: Call to cleaning service.
     */

    UserData userData = new UserData();
    Integer timesCleaned = userData.timesCleaned;

    boolean piroMotor = false;
    int[] ovenDirty = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void scanDirty() {
        switch (ovenDirty[0]) {
            case 0:
                System.out.println("Your Ovenex is clean");
                break;
            case 1, 2, 3, 4:
                System.out.println("Your Ovenex can becleaned");
                piroClean();
                break;
            case 5, 6, 7:
                System.out.println("Your Ovenex needs to be cleaned");
                piroClean();
                break;
            case 8, 9, 10:
                System.out.println("The clean motor is broken, please call customer service");
                break;
            default:
                System.out.println("Oven is clean");
                break;
        }
    }

    public void piroClean() {
        piroMotor = true;
        timesCleaned++;
        System.out.println("Cleaning your Ovenex");
    }
}
