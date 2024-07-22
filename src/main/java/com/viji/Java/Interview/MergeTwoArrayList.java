package com.viji.Java.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrayList {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa"); // It is a list backed up by an array
//		It is not possible to add or remove elements from this list

		List<String> immutableArray = List.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa"); // immutable

		List<String> element = new ArrayList<>(immutableArray); // Mutable

		element.addAll(asList);
		System.out.println(element.toString());
		
		
		
		
		
	}

}
