package com.company;

import java.util.Objects;

public class Thing extends ASomeone{
    Thing(String name){
        createAndPrint(name);
    }

    public void create(String name){
        setName(name);
    }

    public void print(String name){
        Action.doing("Предмет " + getName(), " создан");
    }

    public void createAndPrint(String name){
        create(name);
        print(name);
    }
}
