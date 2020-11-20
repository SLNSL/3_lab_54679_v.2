package com.company;

import java.util.Objects;

public class Dog extends ADog {
    private ASomeone Owner;
    private boolean Exercised;

    public Dog(ASomeone owner){
        Owner = owner;
        System.out.println("Собака создано. Владелец: " + getOwner());
    }

    public Dog(ASomeone owner, String NameOfDog){
        Owner = owner;
        setName(NameOfDog);
        System.out.println("Собака " + getName() + " создано. Владелец: " + getOwner());
    }

    @Override
    public boolean getExercised(){
        return Exercised;
    }

    @Override
    public void setExercised(boolean exercised) {
        Exercised = exercised;
    }


    @Override
    public String getOwner(){
        return Owner.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Exercised == dog.Exercised &&
                Objects.equals(Owner, dog.Owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Owner, Exercised);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Owner=" + Owner +
                ", Exercised=" + Exercised +
                '}';
    }
}
