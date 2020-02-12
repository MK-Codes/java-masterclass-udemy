package com.mkcodes.array_arraylist_hashmap_iterator_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaHashMaps {

	public static void main(String[] args) {

		// hashmaps are key/value pairs
		HashMap users = new HashMap<>(); // should use parameters (like in newUser)
		HashMap<Integer, String> newUser = new HashMap<>(); // cannot use primitives - must use Integer over int, etc.

		users.put("Kealy", 34);
		users.put("Bonni", 25);

		newUser.put(23, "Sandra");

		if (users.containsKey("Bonni")) {
			System.out.println("Bonni's in there");
		} else {
			System.out.println("Where did Bonni go?");
		}

		System.out.println("Values: " + users.values()); // getting the key
		System.out.println("Entire values: " + users.entrySet());

		Iterator it = users.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}
}
