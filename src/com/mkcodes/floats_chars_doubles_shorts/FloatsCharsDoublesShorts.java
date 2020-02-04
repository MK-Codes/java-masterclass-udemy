package com.mkcodes.floats_chars_doubles_shorts;

public class FloatsCharsDoublesShorts {

	public static void main(String[] args) {

		int myInt = 12;
		int intMax = Integer.MAX_VALUE;
		byte myByte = 23;
		byte byteMax = Byte.MAX_VALUE;
		float myFloat = 23.4f;
		float floatMax = Float.MAX_VALUE;
		double myDouble = 122.3;
		double doubleMax = Double.MAX_VALUE;
		short myShort = 239;
		short shortMax = Short.MAX_VALUE;
		char myChar = 'M';
		boolean myBool = true;

		System.out.println("My int: " + myInt);
		System.out.println("My byte: " + myByte);
		System.out.println("My float: " + myFloat);
		System.out.println("My double: " + myDouble);
		System.out.println("My short: " + myShort);
		System.out.println("My char: " + myChar);
		System.out.println("My boolean: " + myBool);

		System.out.println("Integers (int) goes to " + intMax + ".");
		System.out.println("Bytes go to " + byteMax + ".");
		System.out.println("Floats go to " + floatMax + " (standard notation).");
		System.out.println("Doubles go to " + doubleMax + " (standard notation).");
		System.out.println("Shorts go to " + shortMax + ".");
	}
}
