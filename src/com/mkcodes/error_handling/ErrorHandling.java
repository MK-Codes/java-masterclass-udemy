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
			} catch (Exception e) {

			}
		}

		System.out.println("Sum is: " + sum);

		int[] number = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < number.length; i++) {
			try {
				System.out.println(number[i] + " / " + denom[i] + " is " + number[i] / denom[i]);
			} catch (ArithmeticException e) {
				System.out.println("Can't divide by zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching element found");
			} finally {
				System.out.println("Running");
			}
		}
	}

}
