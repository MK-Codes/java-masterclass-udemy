package com.mkcodes.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {

		// Treeset good for sorting
		int[] count = { 4, 3, 23, 9, 10, 23 };
		Set<Object> set = new TreeSet<>();

		try {
			set.add("Harald Hardrada");
			set.add("Tony Iommi");
			set.add("A Tall Dolphin");
			set.add("Only Connect Is Tough");
			System.out.println("Sorted list: " + set);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
