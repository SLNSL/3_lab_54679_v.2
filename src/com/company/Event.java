package com.company;

public class Event {
    public static void ends(String nameOfEvent){
        System.out.println("Завершилось событие: " + nameOfEvent);
        System.out.println();
    }
    public static void starts(String nameOfEvent){
        System.out.println("Началось событие: " + nameOfEvent);
    }
}
