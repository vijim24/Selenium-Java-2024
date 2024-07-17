package com.viji.Java.streams;

import java.util.List;
import java.util.stream.Stream;

public class PrintAllTheNamesPresent {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------");
//		Print all the string which has more than 4 characters- normal method
		List<String> elements = List.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");
		for (String element : elements) {
			if (element.length() > 4) {
				System.out.println(element);

			}
		}
		System.out.println("----------------------------------------------------------");
//		Print all the string which has more than 4 characters - Using Streams
		Stream.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa").filter(s -> s.length() > 4)
				.forEach(s -> System.out.println(s));
		System.out.println("----------------------------------------------------------");
//		Print only the first string which has more than 4 characters

		for (String element : elements) {
			if (element.length() > 4) {
				System.out.println(element);
				break;
			}
		}
		System.out.println("----------------------------------------------------------");
		
		Stream.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa").filter(s -> s.length() > 4).limit(1)
				.forEach(s -> System.out.println(s));
		System.out.println("----------------------------------------------------------");
	}

}
