package com.company;

public abstract class Action {

    public static void doing(ASomeone character, String nameOfAction, String info) {
        System.out.println(character.getName() + ' ' + nameOfAction + ' ' + info);

    }

    public static void doing(ASomeone character, String otherInformationAboutAction, String nameOfAction, String info) {
        System.out.println(character.getName() + ' ' + otherInformationAboutAction + ' ' + nameOfAction + ' ' + info);

    }

    public static void doing(String nameOfEvent, String typeOfEvent){
        System.out.println(nameOfEvent + typeOfEvent);
    }
}