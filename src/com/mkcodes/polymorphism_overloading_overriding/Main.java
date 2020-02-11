package com.mkcodes.polymorphism_overloading_overriding;

public class Main {

	public static void main(String[] args) {

		Dog myDog = new Dog();

		myDog.makeSound();
		myDog.makeSound("Woof and bork");
		myDog.makeSound("Woof", "loudly!");

		myDog.move();
		
		Vet myVet = new Vet();
		Cat myCat = new Cat();
		myVet.giveShot(myCat);
		myVet.giveShot(myDog);
	}

}
