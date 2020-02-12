package com.mkcodes.array_arraylist_hashmap_iterator_map;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<>();
		animals.add("Cat");
		animals.add("Kitten");
		animals.add("Maine Coon");
		animals.add("A different cat");
		animals.add("My cat in particular");
		animals.remove(3);

		if (animals.contains("Kitten")) {
			animals.remove("Kitten");
			animals.add("Dog!");
		}
		
		if (animals.isEmpty()) {
			System.out.println("No animals. What a depressing zoo.");
		}


		System.out.println("Size: " + animals.size());
	
		for (String animal : animals) {
			System.out.println("Animals: " + animal);
		}
		
		ArrayList multiTypeList = new ArrayList();
		multiTypeList.add(34);
		multiTypeList.add("Sausage");
		multiTypeList.add(false);
		
		multiTypeList.remove("Sausage");
		multiTypeList.add(0, "First place");
		for (Object thing : multiTypeList) {
			System.out.println(thing);
		}
		
		if (multiTypeList.contains("First place")) {
			multiTypeList.remove("First place");
		} else {
			System.out.println("Did not remove first");
		}
	}

}
