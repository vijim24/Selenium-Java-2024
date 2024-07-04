package com.viji.selenium.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBasicArrayList {

	public static void main(String[] args) {
		String[] vegetables = { "Tomato", "Potato" };
		ArrayList<String> names = new ArrayList<>();
//		add
		names.add("Vinayagar");
		names.add("Mango");
		System.out.println(names);
		names.add(2, "Pineapple");
//		remove
		names.remove("Mango");
		names.remove(2);
		System.out.println(names);

//		get-- Extract values from certain position
		System.out.println("Element from the 0th Index: " + names.get(0));

//		For loop to print elements using ArrayList
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

//		Enhanced - For loop to print elements using ArrayList
		for (String name : names) {
			System.out.println(name);
		}

//		Check if Vinayagar is present in the arraylist

		System.out.println("Is Vinayagar present in the list: " + names.contains("Vinayagar"));

// 		Convert array to ArrayList
		List<String> vegetablesAl = Arrays.asList(vegetables);
		System.out.println(vegetablesAl);
	}

}
