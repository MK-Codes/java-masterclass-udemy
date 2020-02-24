package com.mkcodes.polymorphism_overloading_overriding;

public class Dog extends Animal {

	private String name;

	public void move() {
		System.out.println("Doggo moves");
	}

	// method overriding
	@Override
	public void makeSound() {
		System.out.println("Woofy woo");
	}
}
