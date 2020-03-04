package com.mkcodes.lambda;

public class Main {

	public static void main(String[] args) {

		Drawable drawable = (width, height) -> System.out.println("Drawing " + width + "x" + height);
		drawable.draw(10, 100);

		Addable addable = (a, b) -> (a + b);
		System.out.println(addable.add(9, 14));
		Addable addable1 = (int a, int b) -> (a + b);
		System.out.println(addable1.add(10, 3));

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
	public void draw(int width, int height);
}

interface Addable {
	int add(int a, int b);
}