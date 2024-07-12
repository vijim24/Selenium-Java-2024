package com.viji.Java.InterviewPrograms;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringPractise2 {

	public static void main(String[] args) {
		String str = "I am Viji My Name is Viji";
		String[] splittedStrings = str.split(" ");
//		for(String splittedString:splittedStrings)
//		{
//			System.out.println(splittedString);
//		}

		Map<Integer, String> newMap = new HashMap<>();

		Map<String, Integer> newMap2 = new HashMap<>();

		for (int i = 0; i < splittedStrings.length; i++) {
			System.out.println(splittedStrings[i]);
			newMap.put(i, splittedStrings[i]);

			if (newMap2.containsKey(splittedStrings[i])) {
				newMap2.put(splittedStrings[i], newMap2.get(splittedStrings[i]) + 1);
			} else {
				newMap2.put(splittedStrings[i], 1);
			}

		}
		System.out.println("map " + newMap);
		System.out.println("map2 " + newMap2);

		boolean resultKey = newMap.containsKey(5);
		boolean resultKey1 = newMap.containsValue("Viji");
		System.out.println("Does the new map contains the key 5:" + resultKey);
		System.out.println("Does the new map contains the value Viji:" + resultKey1);

//		Converting List to Immutable List - Cannot Modify the list
		List<String> newImmutableSplittedList = Arrays.asList(splittedStrings);

//		Converting List to mutable List
		List<String> newmutableSplittedList = new ArrayList<>(newImmutableSplittedList);

//		Cannot convert arrays to set directly instead converting list to set
		Set<String> newmutableSplittedSet = new HashSet<>(newImmutableSplittedList);

	}
}
