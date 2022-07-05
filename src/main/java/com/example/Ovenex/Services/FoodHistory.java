package com.example.Ovenex.Services;

public class FoodHistory {

    private String[] history = {
            "Pollo frito",
            "Pollo frito con legumbres y cebolla",
            "Pollo frito con verduras y cebolla y tomate",
            "Pollo frito al limón y cebolla y tomate y lechuga",
    };

    public void showHistory() {

        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
            Core.comeBack();
        }
    }
}
