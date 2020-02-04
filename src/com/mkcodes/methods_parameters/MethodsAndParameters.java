package com.mkcodes.methods_parameters;

public class MethodsAndParameters {

	public static void main(String[] args) {

		myName("Matthew Kaye");
		addNums(4, 3);
		anotherMethod();
	}

	public static void myName(String myName) {
		System.out.println(myName);
	}
	// TODO Auto-generated method stub
	public static void addNums(int a, int b) {
		System.out.println(a + b);
	}

	public static void anotherMethod() {
		System.out.println("Greedy for methods");
	}
}
