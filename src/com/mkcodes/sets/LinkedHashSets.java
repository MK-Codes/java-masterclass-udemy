package com.mkcodes.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {

		// LinkedHashSets - permits null

		try {
			LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add("Java");
			linkedHashSet.add("Green");
			linkedHashSet.add("Milk");
			linkedHashSet.add("Capital FM");
			linkedHashSet.add("Tom From Primary School");

			Iterator<String> iterator = linkedHashSet.iterator();
			while (iterator.hasNext()) {
				System.out.println("Items: " + iterator.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
