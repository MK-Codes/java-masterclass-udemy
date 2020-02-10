package com.mkcodes.composition;

public class Bathroom {
	private String floorColour;
	private int noOfSinks;
	private Tub bathtub;

	public Bathroom(String mFloorColour, int mNoOfSinks) {
		floorColour = mFloorColour;
		noOfSinks = mNoOfSinks;
		bathtub = new Tub(14);
	}

	public String getFloorColour() {
		return floorColour;
	}

	public int getTubSize() {
		return bathtub.getSize();
	}
}
