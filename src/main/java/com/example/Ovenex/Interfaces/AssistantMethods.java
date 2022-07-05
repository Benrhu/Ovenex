package com.example.Ovenex.Interfaces;

public interface AssistantMethods {

    /*
    * Methods:
    * toCook() -> this method allow you to cook your meal.
    * dirtyOvenex() -> Calculate how dirty the oven is and if it is dirty, the system cleans it.
    * emergencyProtocol() -> Make emergency calls on a case-by-case basis.
    * scanTemperature() -> Calculate the temperature of yor Ovenex.
    * foodReady() -> Notifies you that the food is ready and turns off the oven.
    * hotOvenex() -> Alerts you when the oven is at various temperatures.
    * coldOvenex() -> Notifies you that the oven is cold and needs to heat up, invites you to choose the dish.
    * foodAsesor() -> Advises you if you don't know what to make for lunch or dinner.
    * musicBackground() -> Play music from YouTube or Ovenex while you wait for your meal.
     */

    void toCook();
    void musicBackground();
    void foodAsesor();
    void foodReady();
    void tempScan();
    void dirtyOvenex();
    void EmergencyProtocol();
}
