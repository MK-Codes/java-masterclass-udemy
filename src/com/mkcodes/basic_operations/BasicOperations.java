package com.mkcodes.basic_operations;

public class BasicOperations {

	public static void main(String[] args) {

		// Addition - "+"
		// Subtraction - "-"
		// Multiplication - "*"
		// Division - "/"
		// Remainder - "%"

		int firstNum = 34;
		int secondNum = 3;

		double firstDouble = firstNum;
		double secondDouble = secondNum;

		System.out.println("Addition: " + (firstNum + secondNum));
		System.out.println("Subtraction: " + (firstNum - secondNum));
		System.out.println("Multiplication: " + (firstNum * secondNum));
		System.out.println("Division: " + (firstNum / secondNum));
		System.out.println("Divsion is wrong! Rounding. Needs doubles.");
		System.out.println("True division: " + (firstDouble / secondDouble));
		System.out.println("Remainder: " + (firstNum % secondNum));
	}
}
