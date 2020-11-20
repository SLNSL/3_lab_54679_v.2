package com.company;

import java.util.Objects;

public class Human extends ASomeone {


    public Human(String nameOfHuman) {
        createAndPrint(nameOfHuman);
    }

    public void createAndPrint(String nameOfHuman){
        create(nameOfHuman);
        print(nameOfHuman);
    }

    public void create(String nameOfHuman){
        setName(nameOfHuman);
    }

    public void print(String nameOfHuman){
        Action.doing("Существо " + nameOfHuman, " созданно");
    }
}