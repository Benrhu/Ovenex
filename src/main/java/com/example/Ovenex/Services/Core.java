package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.UserData;

import java.util.Scanner;

public class Core {

    static UserData userData = new UserData();
    static Integer comeBackUsed = userData.comeBackUsed;
    static Scanner input = new Scanner(System.in);
    static Food food = new Food();
    static FoodHistory foodHistory = new FoodHistory();
    static Puerta puerta = new Puerta();
    static Clean cleaner = new Clean();


     public static void mainMenu(){
         System.out.println("What do you want to do?");
         System.out.println("1. Show culinary history.");
         System.out.println("2. Assistant to choose food.");
         System.out.println("3. Preparing your food.");

         System.out.println("Enter an option: ");

         int option = input.nextInt();

         if (option == 1) {
             System.out.println("Showing culinary history...");
             foodHistory.showHistory();
             mainMenu();
         } else if (option == 2) {
             food.foodAssistant();
         } else if (option == 3) {
             food.toCook();
         }
     }
    public static void comeBack() {
         comeBackUsed++;
        System.out.println("Do you want to return to the main menu?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Enter an option: ");
        int comeBack = input.nextInt();

        if (comeBack == 1) {
            System.out.println("Back to the main menu...");
            mainMenu();
        } else if (comeBack == 2) {

        }
    }
    public static void welcome(){
        System.out.println("Starting your Ovenex...");

        // System.out.println("Hola " + "nombre, " + "bievenid@ a Ovenex ");
    }
}
