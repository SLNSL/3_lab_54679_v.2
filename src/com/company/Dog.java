package com.company;

import java.util.Objects;

public class Dog extends ADog {
    private ASomeone owner;
    private boolean exercised;

    public Dog(ASomeone owner_){
        owner = owner_;
        setName("Собака Няни");
        Action.doing(getName()," созданно");
    }

    public Dog(ASomeone owner_, String nameOfDog){
        owner = owner_;
        setName(nameOfDog);
        Action.doing(" Собака " + nameOfDog, " созданно.");
    }

    @Override
    public boolean getExercised(){
        return exercised;
    }

    @Override
    public void setExercised(boolean exercised_) {
        exercised = exercised_;
    }


    @Override
    public String getOwner(){
        return owner.getName();
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return exercised == dog.exercised &&
                Objects.equals(owner, dog.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner, exercised);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "owner=" + owner +
                ", exercised=" + exercised +
                '}';
    }
}
