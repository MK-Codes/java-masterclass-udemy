package com.mkcodes.lambda;

public class Main {

	public static void main(String[] args) {

		Drawable drawable = () -> System.out.println("Drawing");
		drawable.draw();

		// Old school
		/*
		 * Drawable drawable = new Drawable() {
		 * 
		 * @Override public void draw() { System.out.println("Drawing"); } };
		 * drawable.draw(); }
		 */
	}
}

interface Drawable {
	public void draw();
}