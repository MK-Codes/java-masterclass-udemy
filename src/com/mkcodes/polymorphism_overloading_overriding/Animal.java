package com.mkcodes.polymorphism_overloading_overriding;

public abstract class Animal {

	private String name;

	public abstract void makeSound();

	// method overloading
	public void makeSound(String soundType) {
		System.out.println(soundType);
	}

	public void makeSound(String soundType, String loudness) {
		System.out.println(soundType + ", " + loudness);
	}
}
