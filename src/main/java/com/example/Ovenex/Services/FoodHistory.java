package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.UserData;

public class FoodHistory {
    UserData userData = new UserData();

    Integer foodHistoryUsed = userData.foodHistoryUsed;

    private String[] history = {
            "Pollo frito",
            "Pollo frito con legumbres y cebolla",
            "Pollo frito con verduras y cebolla y tomate",
            "Pollo frito al limón y cebolla y tomate y lechuga",
    };

    public void showHistory() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
            foodHistoryUsed++;
            Core.comeBack();
        }
    }
}
