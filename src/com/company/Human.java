package com.company;

import java.util.Objects;

public class Human extends ASomeone {


    public Human(String nameOfHuman) {
        setName(nameOfHuman);
        System.out.println("Существо " + getName() + " создано");
    }


}