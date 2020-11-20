package com.company;

public class ResultOfExercises {
    public static void HealthAndAngry(ADog dog, ASomeone human) {
       Health(dog);
        System.out.print(", но");
        Angry(human);
        System.out.println();
    }

    public static void Health(ADog dog){
        System.out.print("Физ-зарядка была полезной для самочувствия собаки: " + dog.getName());
    }

    public static void Angry(ASomeone human){
        System.out.print("это разозлило человека типа: " + human.getName()  + ", ведь его обязанности: следить за садом");
    }
}

