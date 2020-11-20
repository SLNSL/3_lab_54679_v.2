package com.company;

public class Event {
    public static void ends(String NameOfEvent){
        System.out.println("Завершилось событие: " + NameOfEvent);
        System.out.println();
    }
    public static void starts(String NameOfEvent){
        System.out.println("Началось событие: " + NameOfEvent);
    }
}
