package com.company;

public abstract class Action {

    public static void doing(String character, String nameOfAction, String info) {
        System.out.println(character + ' ' + nameOfAction + ' ' + info);

    }

    public static void doing(String character, String otherInformationAboutAction, String nameOfAction, String info) {
        System.out.println(character + ' ' + otherInformationAboutAction + ' ' + nameOfAction + ' ' + info);

    }
}