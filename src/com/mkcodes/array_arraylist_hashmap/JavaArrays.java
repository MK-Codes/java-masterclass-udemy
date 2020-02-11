package com.mkcodes.array_arraylist_hashmap;

public class JavaArrays {

	public static void main(String[] args) {

		int[] arrInts = {2, 4, 5, 8};
		String[] arrStrings = {"Midgard", "Helheim", "Vanheim", "Asgard", "Jötunheim", "Alfheim", "Svartálfheim", "Niflheim", "Muspelheim", "Nidavellir (bonus round)"};

		// declaring empty array
		int[] newIntArray = new int[5];
		String[] newStrArray = new String[5];

		System.out.println(arrInts[0]); // zero indexed - first position is 0
		System.out.println(arrInts.length);
		for(int i = 0; i < arrInts.length; i++) {
			System.out.println("Item no.: " + i + "\tValue: " + arrInts[i]);
		}
		
		for (int i = 0; i < arrStrings.length; i++) {
			System.out.println("Nine worlds: " + arrStrings[i]);
		}

		// adding to empty arrays
		newIntArray[0] = 3;
		newIntArray[1] = 4;
		newIntArray[2] = 6;
		newIntArray[3] = 1;
		newIntArray[4] = 12;

		newStrArray[0] = "Ymir";
		newStrArray[1] = "Týr";
		newStrArray[2] = "Vidar";
		newStrArray[3] = "Bragi";
		newStrArray[4] = "Frigg";

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ": " + newStrArray[i]);
		}
	}
}
