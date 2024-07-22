package com.viji.Java.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WayOfConvertingArraystoList {

	public static void main(String[] args) {
		String[] names = { "Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa" };

		Arrays.asList(names);
		List<String> asList = Arrays.asList("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa"); 

		List<String> immutableArray = List.of("Viji", "Vicky", "Muruga", "Anjenaya", "Ayappa");  // immutable

		List<String> element = new ArrayList<>(immutableArray);  // Mutable
	}
	}


