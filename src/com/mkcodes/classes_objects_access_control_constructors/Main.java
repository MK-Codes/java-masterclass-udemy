package com.mkcodes.classes_objects_access_control_constructors;

public class Main {

	public static void main(String[] args) {

		Ball myBall = new Ball("Ballo", "", 1, 1);
		Ball secondBall = new Ball("Ballzie", "Green", 2, 2);

		System.out.println("My ball, " + myBall.getName() + ", is " + myBall.getColour() + ".");
		System.out.println("The other ball, " + secondBall.getName() + ", is " + secondBall.getColour() + ".");
	}

}
