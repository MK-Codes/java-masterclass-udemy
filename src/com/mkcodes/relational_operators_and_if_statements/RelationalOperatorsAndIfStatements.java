package com.mkcodes.relational_operators_and_if_statements;

public class RelationalOperatorsAndIfStatements {

	public static void main(String[] args) {

		double firstNum = 10;
		double secondNum = 3;
		double result = 0;
		result = firstNum % secondNum;

		// Relational operators
		/*
		 * == comparison (not assignment)
		 * != is NOT equal
		 * > greater than
		 * < less than
		 * >= greater than or equal to
		 * <= less than or equal to
		 * 
		*/

		// If statements
		if (firstNum != secondNum) {
			System.out.println("The remainder is " + result);
		} else {
			System.out.println("Numbers aren't equal");
		}

		if (firstNum > secondNum) {
			System.out.println("First num is greater than second num");
		}

		if (firstNum <= secondNum) {
			System.out.println("First num is less than or equal to second num");
		}
	}
}
