package com.mkcodes.classes;

public class Main {

	public static void main(String[] args) {
		Person myPerson = new Person("Alan", 23, 4);
		Person secondPerson = new Person("Dolphin Derek", 15, 4);

		System.out.println("GetClass: " + myPerson.getClass());
		System.out.println("GetClass SimpleName: " + myPerson.getClass().getSimpleName());
		System.out.println("GetClass HashCode: " + myPerson.hashCode());

		if (myPerson.equals(secondPerson)) {
			System.out.println("Two objects are the same");
		} else {
			System.out.println("Not the momma!");
		}

		System.out.println("toString(): " + myPerson.toString());

	}

}
