package uk.ac.belfastmet.examples1;

import java.util.ArrayList;

public class Animal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		ArrayList<String> listOfAnimals = animal.createAnimalArray();
		ArrayList<String> listOfAnimalsExtra =  animal.addDogAndCat(listOfAnimals);
		
		ArrayList<String> listOfAnimalsLess = animal.removeElephant(listOfAnimalsExtra);
		
		System.out.println(listOfAnimalsExtra.size());
	}
	
	public ArrayList<String> createAnimalArray() {
		ArrayList<String> animalList = new ArrayList<String>();
		animalList.add("Elephant");
		animalList.add("lion");
		return animalList;
	}
	
	public ArrayList<String> addDogAndCat( ArrayList<String> animalList) {
		animalList.add("Dog");
		animalList.add("Cat");
		return animalList;
	}
	
	public ArrayList<String> removeElephant( ArrayList<String> animalList) {
		if (animalList.contains("Elephant")) {
			animalList.remove("Elephant");
		}
		return animalList;
	}
	
	

}
