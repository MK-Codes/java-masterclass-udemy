package com.mkcodes.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {

		// Sets - do not accept duplicates
		Set<Integer> set = new HashSet<>();
		int[] count = { 3, 4, 6, 9, 10, 23 };

		try {
			for (int i = 0; i < count.length; i++) {
				set.add(count[i]);
			}
			System.out.println("Our set: " + set);
			System.out.println("Size: " + set.size());
			set.remove(count[0]);
			System.out.println("New set: " + set);
			System.out.println("New size: " + set.size());

			if (set.contains(3)) {
				System.out.println("Set contains 3");
			} else {
				System.out.println("Set does not contain 3");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
