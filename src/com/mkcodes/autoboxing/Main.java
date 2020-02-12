package com.mkcodes.autoboxing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// primitives - int, chars, long, float, etc.
		// boxed - Integer, Character, Long, Float, etc.
		
		int i = 32;
		int b = 23;
		// physically wrapping up an int primitive as an Integer
		Integer myObject = new Integer(b);
		// unwrapping Integer object back to primitive
		int recoverInt = myObject.intValue();
		
		char myChar = 'D';
		Character myCharacter = new Character(myChar);
		
		// autoboxing happens automatically
		ArrayList<Integer> myArray = new ArrayList();
		myArray.add(i);
		int myItem = myArray.get(0);
	}

}
