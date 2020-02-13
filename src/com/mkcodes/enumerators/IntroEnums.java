package com.mkcodes.enumerators;

public class IntroEnums {

	// old way of these
	public static final int JERRY = 1;
	public static final int BOBBY = 2;
	public static final int LARRY = 3;

	// using enums
	public enum Members {
		JERRY, BOBBY, LARRY
	}

	public static Members selectedPerson;

	public static void main(String[] args) {

		// old way of access
		int selectedPersonOld = 1;

		if (selectedPersonOld == JERRY) {
			System.out.println("Jerry!");
		}

		// using enums

		selectedPerson = Members.BOBBY;

		if (selectedPerson.equals(Members.BOBBY)) {
			System.out.println("Bobby");
		}
	}

}
