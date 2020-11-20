package com.company;

import java.util.Objects;

public class Human extends ASomeone{

    private String name;
    

    public Human(String NameOfHuman){
        setName(NameOfHuman);
        System.out.println("Существо " + getName() + " создано");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String NameOfSomeone) {
        this.name = NameOfSomeone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
