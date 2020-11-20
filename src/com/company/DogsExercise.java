package com.company;

public class DogsExercise {
    static void DoExercise(ADog dog){
        Action.doing(dog, " бегает за существом: ", "Незнайка");
        Action.doing(dog, " прыгает через ", "кусты и цветочные клумбы");
        dog.setExercised(true);
    }

}
