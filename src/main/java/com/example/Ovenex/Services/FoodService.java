package com.example.Ovenex.Services;

import com.example.Ovenex.Entities.UserData;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static com.example.Ovenex.Services.Core.comeBack;

/**
 * This class is the tool that helps you to choose your food.
 */

public class FoodService {
    UserData userData = new UserData();
    Integer timesUsed = userData.timesUsed;
    Integer recipesUsed = userData.recipesUsed;
    Integer ingredientsUsed = userData.ingredientsUsed;
    Scanner input = new Scanner(System.in);
    CleanService cleaner = new CleanService();

    private String[] ingredients = {
        "Tomato",
        "Cheese",
        "Lettuce",
        "Chicken",
        "Meat",
        "Fish",
        "Eggs",
        "Bread",
        "Oil",
        "Salt",
        "Sugar",
        "Milk",
        "Butter",
        "Flour",
        "Hamburguer",
        "Legumes",
        "Turkey",
        "Onion",
        "Bell pepper",
        "Duck"
    };

    private String[] recipes = {
            "Hamburguer",
            "Pizza",
            "Chiken",
            "Fried chicken",
            "Fried chicken with vegetables and onions",
            "Fried chicken with vegetables and onions and tomatoes",
            "Fried chicken with lemon and onion and tomato and lettuce",
            "Fried duck",
            "Fried duck with onions",
            "Fried duck with onions and tomatoes",
            "Duck in orange sauce",
            "Pekin duck",
            "Cheeseburguer",
            "Cheeseburger with onions",
            "Cheeseburger with onions and tomatoes",
            "Cheeseburger with onion and cheese and tomato and lettuce",
            "Cheese pizza",
            "Pizza with cheese and onions",
            "Pizza with cheese and onion and tomato",
            "Pizza with cheese and onion and tomato and lettuce",
    };

    public String getRandomRecipe() {
        return recipes[(int) (Math.random() * recipes.length)];
    }

    public void showIngredients() {
        System.out.println("Showing ingredients");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(ingredients[i]);
            ingredientsUsed++;
        }
        comeBack();
    }
    public void showRecipes() {
        System.out.println("Showing recipes");
        for (int i = 0; i < recipes.length; i++) {
            System.out.println(recipes[i]);
            recipesUsed++;
        }
        System.out.println("Are you sure or do you want us to recommend a random recipe?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        System.out.println("Enter an option: ");

        int opcion = input.nextInt();

        if (opcion == 1) {
            System.out.println("Accessing a random recipe");
            System.out.println(getRandomRecipe());
            System.out.println("We hope we have helped you choose your meal. \n" +
                    "Once you have introduced all the ingredients, you can start the preparation process.");
            comeBack();
        } else if (opcion == 2) {
            comeBack();
        }
    }

    /**
     * Hacer que tarde 2 segundos
     */
    public void toCook() {
        timesUsed++;
        System.out.println("Preparing your food");
        System.out.println("Enjoy your food");
        try {
            TimeUnit.SECONDS.sleep(2);
            cleaner.scanDirty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void foodAssistant() {
        System.out.println("Welcome tot he food assistant");
        System.out.println("What do you want to do?");
        System.out.println("1. showing recipes");
        System.out.println("2. Showing ingredients");

        System.out.println("Enter an option: ");

        int opcion = input.nextInt();

        if (opcion == 1) {
            showRecipes();
            System.out.println("We hope we have helped you choose your meal. \n" +
                    "Once you have introduced all the ingredients, you can start the preparation process.");
            comeBack();
        } else if (opcion == 2) {
            showIngredients();
            System.out.println("We hope we have helped you choose your meal. \n" +
                    "Once you have introduced all the ingredients, you can start the preparation process.");
            comeBack();
        }
    }
}