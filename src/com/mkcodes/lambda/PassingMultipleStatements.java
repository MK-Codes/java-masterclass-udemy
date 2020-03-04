package com.mkcodes.lambda;

public class PassingMultipleStatements {

	public static void main(String[] args) {

		Speakable speakable = (message) -> {
			String message1 = "Hello world";
			String message2 = message1 + " Another message";
			return message2;
		};
		System.out.println(speakable.speak("Here"));
	}

}

interface Speakable {
	String speak(String message);
}

interface AddablePMS {
	int add(int a, int b);
}

interface DrawablePMS {
	void draw(int width, int height);
}