package com.viji.Java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
//		Print the names which has more than 4 characters in Upper Case - Using Normal method
		List<String> elements = List.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");

		for (String element : elements) {
			if (element.length() > 4) {
				System.out.println(element.toUpperCase());

			}
		}

		System.out.println("----------------------------------------------------------");
//		Print the names which has more than 4 characters in Upper Case - Using Streams method
		Stream.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa").filter(s -> s.length() > 4).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

//		Print the names which has last letter as "a" in Upper Case - Using Normal method		
		for (String element : elements) {
			if (element.endsWith("a")) {
				System.out.println(element.toUpperCase());

			}
		}
		System.out.println("----------------------------------------------------------");
//		Print the names which has more than 4 characters in Upper Case - Using Streams method
		Stream.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa").filter(s -> s.endsWith("a")).limit(1)
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("----------------------------------------------------------");

//		Print the elements with First letter a with upperCase and sorted -- Using Normal Method
		ArrayList<String> mutableList = new ArrayList<>(elements);
		Collections.sort(mutableList);
		mutableList.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A"))
				.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------------------");
//		Print the elements with First letter a with upperCase and sorted -- Using Stream Method
		Stream.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa").sorted().map(s -> s.toUpperCase())
				.filter(s -> s.startsWith("V")).forEach(s -> System.out.println(s));
	}

}
