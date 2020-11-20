package com.company;

import java.util.Objects;

public class Thing extends ASomeone{
    Thing(String name){
        setName(name);
        Action.doing("Предмет " + getName(), " создан");
    }

}
