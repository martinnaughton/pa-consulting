package uk.ac.belfastment.examples;

import uk.ac.belfastment.examples.domain.Dog;

public class DogApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		String fetch = dog.fetch();
		dog.bark();
		System.out.println(fetch);
	}
}
