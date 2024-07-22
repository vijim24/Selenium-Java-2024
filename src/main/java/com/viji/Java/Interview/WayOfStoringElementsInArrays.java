package com.viji.Java.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WayOfStoringElementsInArrays {

	public static void main(String[] args) {
		// StringArray to List
		String[] stringArray = { "Viji", "Vinayagar", "Anjenayar", "Murugar", "Ayyapan" };

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

		System.out.println("------------------------------------------------------------------------");

		String[] intArray = { "1", "2", "3" };
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(Integer.parseInt(intArray[i]));
		}

		List<String> asList = Arrays.asList(stringArray);
		System.out.println("StringArray to List " + asList.toString());

		// Adding elements one by one to an ArrayList by object creation using
		// constructor [Mutable]

		System.out.println("------------------------------------------------------------------------");
		List<String> element = new ArrayList<>();
		element.add("Viji");
		element.add("Vinayagar");
		element.add("Anjenayar");
		element.add("Murugar");
		element.add("Ayyapan");

		System.out.println("Mutable Array " + element.toString());
		int count = 0;
		// Creating a immutable array
		List<String> elements = List.of("Viji", "Vinayagar", "Anjenayar", "Murugar", "Ayyapan");
		System.out.println("Immutable Array " + elements.toString());
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).startsWith("a") || elements.get(i).startsWith("A")) {
				System.out.println(elements.get(i));
				count++;
			}

		}
		System.out.println("Count of elements which starts with  A: " + count);

		System.out.println("------------------------------------------------------------------------");

	}

}
