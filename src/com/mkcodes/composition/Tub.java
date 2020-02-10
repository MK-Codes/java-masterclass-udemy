package com.mkcodes.composition;

public class Tub {
	private int size;
	private Bubble bubble;

	public Tub(int mSize) {
		size = mSize;
		bubble = new Bubble();
		bubble.setColour("Blue");
		bubble.setRadius(10);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int mSize) {
		size = mSize;
	}

	public String getBubbleColour() {
		return bubble.getColour();
	}
}
