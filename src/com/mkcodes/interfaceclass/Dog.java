package com.mkcodes.interfaceclass;

public class Dog extends Canine implements Pet {

	@Override
	public void beFriendly() {
		System.out.println("The dog licks your face. Eurgh.");
	}

	@Override
	public void play() {
		System.out.println("The dog rolls about. \"Woof!\"");
	}

}
