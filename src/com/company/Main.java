package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

		//--------------------------------------------------------------------------------------
		Human neznayka = new Human("Незнайка");
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog(neznayka, "Мимишка"));
		dogs.add(new Dog(neznayka, "Роланд"));
		//--------------------------------------------------------------------------------------
		Event.ends("Завтрак");
		System.out.println();
		Event.starts("Прогулка");
		//--------------------------------------------------------------------------------------
		Place dogsPark = new Place(EPlaces.DOGSPARK);
		long counfOfNannies = Math.round(Math.random() * 4 + 1);
		ArrayList<Human> nannies = new ArrayList<Human>();
		for (int i = 0; i < counfOfNannies; i++){
			nannies.add(new Human("Няня"));
			Dog dogOfNanny = new Dog(nannies.get(i));
			Action.doing(nannies.get(i), " гуляет в ", dogsPark.getName());
			Action.doing(dogOfNanny, " гуляет в ", dogsPark.getName());
		}
		Action.doing(neznayka, " гуляет в ", dogsPark.getName());
		for (Dog dog : dogs){
			Action.doing(dog, " гуляет в ", dogsPark.getName());
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Прогулка");
		System.out.println();
		Event.starts("Купание");
		//--------------------------------------------------------------------------------------
		Place Home = new Place(EPlaces.HOME);
		Action.doing(neznayka,"вторично", "купает собаку", dogs.get(0).getName());
		Place garden = new Place(EPlaces.GARDEN);
		ArrayList<EBugs> bugs = new ArrayList<EBugs>();
		bugs.add(EBugs.GRASSHOPPER);
		bugs.add(EBugs.СRICKET);
		Action.doing(dogs.get(1), "развлекается тем, что", " ловит в " + garden.getName() + "у ",
				"жуков типа: " + bugs.get(0).getType() + " и " + bugs.get(1).getType() );
		//--------------------------------------------------------------------------------------
		Event.ends("Купание");
		System.out.println();
		Event.starts("Обед");
		//--------------------------------------------------------------------------------------
		Place dogsRestaurant = new Place(EPlaces.DOGSRESTAURANT);
		Action.doing(neznayka, " идёт обедать в ", dogsRestaurant.getName());
		for (Dog dog : dogs){
			Action.doing(dog, " идёт обедать в ", dogsRestaurant.getName());
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Обед");
		Action.doing(neznayka, " стал ", ASomeone.getEmotion());
		Action.doing(dogs.get(0), " стал ", ASomeone.getEmotion());
		Action.doing(dogs.get(1), " стал ", ASomeone.getEmotion());
		System.out.println();
		Event.starts("Сон");
		//--------------------------------------------------------------------------------------
		EBugs flies = EBugs.FLY;
		for (Dog dog : dogs){
			Action.doing(dog, " лёг спать ", "на часика полтора");
		}
		Action.doing(neznayka, " следит чтобы их не кусали насекомые, типа: ", flies.getType());
		//--------------------------------------------------------------------------------------
		Event.ends("Сон");
		System.out.println();
		Event.starts("Прогулка");
		//--------------------------------------------------------------------------------------
		Place town = new Place(EPlaces.TOWN);
		Action.doing(neznayka, " идёт гулять в ", town.getName());
		for (Dog dog : dogs){
			Action.doing(dog, " идёт гулять в ", town.getName());
		}
		for (Dog dog : dogs){
			DogsLove.WhatDoesHeLoves(dog);
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Прогулка");
		System.out.println();
		Event.starts("Физ-зарядка");
		//--------------------------------------------------------------------------------------
		Human gardenWorker = new Human("Садовник");
		Action.doing(dogs.get(0), " делают ", "физ-зарядку");
		Action.doing(dogs.get(1), " делают ", "физ-зарядку");
		for (Dog dog : dogs){
			DogsExercise.DoExercise(dog);
			}
		for (Dog dog : dogs){
			if (dog.getExercised()){
				ResultOfExercises.HealthAndAngry(dog, gardenWorker);
			}
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Физ-зарядка");
		Action.doing(dogs.get(0), " стал ", ASomeone.getEmotion());
		Action.doing(dogs.get(1), " стал ", ASomeone.getEmotion());
		System.out.println();
		Event.starts("Отдых");
		//--------------------------------------------------------------------------------------
		Thing book = new Thing("Собачий журнал");
		Action.doing(neznayka, " заполняет " + book.getName(), "");
		Action.doing(book, "обычно заполняется",
				"всеми сколько-нибудь значительными и даже не значительными случаями из жизни собак: "
		+ dogs.get(0).getName() + " и " + dogs.get(1).getName());

		
    }
}
