package com.mkcodes.for_while_loops;

public class ForAndWhileLoops {

	public static void main(String[] args) {

		/*
		 * for loop
		 * while loop
		 * 
		 */
		
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Multiple of two: " + i);
			}
			if (i % 3 == 0) {
				System.out.println("Multiple of three: " + i);
			}
		}
		
		int i = 0;
		while (i < 5) {
			System.out.println("Counting: " + i);
			i++;
		}
	}
}
