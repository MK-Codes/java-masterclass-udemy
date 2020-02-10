package com.mkcodes.composition;

public class Main {

	public static void main(String[] args) {
		Tub myTub = new Tub(13);
		System.out.println(myTub.getSize() + " " + myTub.getBubbleColour());

		Bathroom bathroom = new Bathroom("blue", 14);
		System.out.println("Bathroom floor: " + bathroom.getFloorColour() + "\nTub size: " + bathroom.getTubSize());
	}
}
