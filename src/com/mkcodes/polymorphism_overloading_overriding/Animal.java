package com.mkcodes.polymorphism_overloading_overriding;

public class Animal {

	private String name;
	
	public void makeSound() {
		System.out.println("Grrrr!");
	}
	// method overloading
	public void makeSound(String soundType) {
		System.out.println(soundType);
	}
	
	public void makeSound(String soundType, String loudness) {
		System.out.println(soundType + ", " + loudness);
	}
}
