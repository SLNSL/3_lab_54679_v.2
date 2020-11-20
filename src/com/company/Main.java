package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
		//--------------------------------------------------------------------------------------
		Human Neznayka = new Human("Незнайка");
		ArrayList<Dog> Dogs = new ArrayList<Dog>();
		Dogs.add(new Dog(Neznayka, "Мимишка"));
		Dogs.add(new Dog(Neznayka, "Роланд"));
		//--------------------------------------------------------------------------------------
		Event.ends("Завтрак");
		Event.starts("Прогулка");
		//--------------------------------------------------------------------------------------
		Place DogsPark = new Place(EPlaces.DOGSPARK);
		long CountOfNannies = Math.round(Math.random() * 4 + 1);
		ArrayList<Human> Nannies = new ArrayList<Human>();
		for (int i = 0; i < CountOfNannies; i++){
			Nannies.add(new Human("Няня"));
			Dog dogOfNanny = new Dog(Nannies.get(i));
		}
		Action.doing(Neznayka.getName(), " гуляют в ", DogsPark.getName());
		for (Dog dogs : Dogs){
			Action.doing(dogs.getName(), " гуляют в ", DogsPark.getName());
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Прогулка");
		Event.starts("Купание");
		//--------------------------------------------------------------------------------------
		Place Home = new Place(EPlaces.HOME);
		Action.doing(Neznayka.getName(), " купает собаку ", Dogs.get(0).getName());
		Place Garden = new Place(EPlaces.GARDEN);
		ArrayList<EBugs> Bugs = new ArrayList<EBugs>();
		Bugs.add(EBugs.GRASSHOPPER);
		Bugs.add(EBugs.СRICKET);
		Action.doing(Dogs.get(1).getName(), " ловит в " + Garden.getName() + "у ",
				"жуков типа: " + Bugs.get(0).getType() + " и " + Bugs.get(1).getType() );
		//--------------------------------------------------------------------------------------
		Event.ends("Купание");
		Event.starts("Обед");
		//--------------------------------------------------------------------------------------
		Place DogsRestaurant = new Place(EPlaces.DOGSRESTAURANT);
		Action.doing(Neznayka.getName(), " идёт обедать в ", DogsRestaurant.getName());
		for (Dog dogs : Dogs){
			Action.doing(dogs.getName(), " идёт обедать в ", DogsRestaurant.getName());
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Обед");
		Event.starts("Сон");
		//--------------------------------------------------------------------------------------
		EBugs Flies = EBugs.FLY;
		for (Dog dogs : Dogs){
			Action.doing(dogs.getName(), " лёг спать ", "на часика полтора");
		}
		Action.doing(Neznayka.getName(), " следит чтобы их не кусали насекомые, типа: ", Flies.getType());
		//--------------------------------------------------------------------------------------
		Event.ends("Сон");
		Event.starts("Прогулка");
		//--------------------------------------------------------------------------------------
		Place Town = new Place(EPlaces.TOWN);
		Action.doing(Neznayka.getName(), " идёт гулять в ", Town.getName());
		for (Dog dogs : Dogs){
			Action.doing(dogs.getName(), " идёт гулять в ", Town.getName());
		}
		for (Dog dogs : Dogs){
			DogsLove.WhatDoesHeLoves(dogs);
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Прогулка");
		Event.starts("Физ-зарядка");
		//--------------------------------------------------------------------------------------
		Human gardenWorker = new Human("Садовник");
		Action.doing("Собаки", " делают ", "физ-зарядку");
		for (Dog dogs : Dogs){
			DogsExercise.DoExercise(dogs);
			}
		boolean angry = true;
		for (Dog dogs : Dogs){
			if (dogs.getExercised()){
				DogsAngry.MakeSOAngry(dogs, gardenWorker);
			}
		}
		//--------------------------------------------------------------------------------------
		Event.ends("Физ-зарядка");
		Event.starts("Отдых");
		//--------------------------------------------------------------------------------------
		Action.doing(Neznayka.getName(), " заполняет собачий журнал ",
				"всеми сколько-нибудь значительными и даже не значительными случаями из жизни собак: "
						+ Dogs.get(0).getName() + " и " + Dogs.get(1).getName());

    }
}
