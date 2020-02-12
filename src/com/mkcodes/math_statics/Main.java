package com.mkcodes.math_statics;

public class Main {

	private static String name;

	public static void main(String[] args) {

		// Math is static class
		int myValue = -45;
		int secondValue = 56;
		int x = Math.min(myValue, secondValue);
		int y = Math.abs(myValue);

		System.out.println("X: " + x + "\nY: " + y);

		System.out.println(name); // needs to refer to a static var (name)

		Main main = new Main();
		main.setName("FJFJ");
		System.out.println(main.name);
	}

	public void setName(String n) {
		name = n;
	}
}
