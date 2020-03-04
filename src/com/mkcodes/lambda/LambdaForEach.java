package com.mkcodes.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("Tom");
		nameList.add("Ryan");
		nameList.add("Jennifer");
		nameList.add("Alan");
		nameList.add("Albanque");
		nameList.add("Yessir");

		nameList.forEach((names) -> System.out.println(names));

	}

}
