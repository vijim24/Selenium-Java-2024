package com.viji.selenium.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.opentelemetry.api.internal.StringUtils;

public class Doubts {

	public static void main(String[] args) {
		String names = "Apple Orange Papaya";
		String[] splittedNames = names.toLowerCase().split("a");
		for (String sp : splittedNames) {
			if (!StringUtils.isNullOrEmpty(sp)) {
				System.out.println(sp);
			}
		}
		for (int i = 0; i <= names.length() - 1; i++) {
			names.charAt(i);
		}

		List<String> nameList = List.of("Viji", "Vinayagar");
		List<String> nameAl = new ArrayList<>(nameList);
		System.out.println("**********************************");
		Iterator<String> nameIterator = nameAl.iterator();
//		while (nameIterator.hasNext()) {
//			String next = nameIterator.next();
//			if (!"Vinayagar".equals(next))
//				System.out.println(next);
//		}
		while (nameIterator.hasNext()) {
			String next = nameIterator.next();
//			System.out.println(next);
			if (next.equalsIgnoreCase("viji")) {
				break;
			}

		}
		System.out.println("**********************************");
		List<String> nList = new ArrayList<>();
		nList.add("Viji");

		for (int i = 0; i <= splittedNames.length; i++) {

		}

	}

}
