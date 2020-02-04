package com.mkcodes.return_types;

public class ReturnTypes {

	public static void main(String[] args) {

		int width = 20;
		int height = 5;
		int area = getArea(width, height);
		
		String firstName = "Matthew";
		String lastName = "Kaye";

		System.out.println("Area: " + area + " arbitrary measurements²");
		System.out.println(fullName(firstName, lastName));
}

	public static int getArea(int width, int height) {
		return width * height;
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}
