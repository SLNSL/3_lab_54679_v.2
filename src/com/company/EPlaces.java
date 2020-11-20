package com.company;

public enum EPlaces {
    DOGSPARK("Собачий Парк"),
    GARDEN("Сад"),
    DOGSRESTAURANT("Собачий Ресторан"),
    TOWN("Город"),
    HOME("Дом");

    private String name;

    EPlaces(String NameOfPlace){
        name = NameOfPlace;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EPlaces{" +
                "name='" + name + '\'' +
                '}';
    }
}
