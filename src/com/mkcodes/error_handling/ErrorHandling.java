package com.mkcodes.error_handling;

public class ErrorHandling {

	public static void main(String[] args) {

		String[] myArray = { "Hello", "Hi", "I don't know James" };

		// Runtime error
//		System.out.println(myArray[3]);

		float sum = 0;

		// args have been added in run configuration
		// args = {1, 3, 4, 7, +}
		for (String argument : args) {
			try {
				sum = sum + Float.parseFloat(argument);
			} catch (NumberFormatException e) {
				System.out.println("Exception message: " + e.getMessage());
				System.out.println(argument + " is not a number");
			}
		}

		System.out.println("Sum is: " + sum);
	}

}
