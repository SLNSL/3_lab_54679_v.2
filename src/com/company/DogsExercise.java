package com.company;

public class DogsExercise {
    static void DoExercise(ADog dog){
        Action.doing(dog.getName(), " бегает за существом: ", "Незнайка");
        Action.doing(dog.getName(), " прыгает через ", "кусты и цветочные клумбы");
        dog.setExercised(true);
    }

}
