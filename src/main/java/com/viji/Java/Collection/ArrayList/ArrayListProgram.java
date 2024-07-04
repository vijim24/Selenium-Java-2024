package com.viji.Java.Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.contains("apple")) {
				a.remove("apple");
				System.out.println(a);
				break;
			}
		}
		if (a.contains("orange")) {
			System.out.println("Orange is found");

		} else {
			System.out.println("Orange is not found");
		}

		System.out.println(a.size());

	}

}


//import java.util.ArrayList;
//public class Exercise {
// 
// 
//public static void main(String[] args) {
//        // 1. Create and Populate ArrayList
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("cherry");
//        fruits.add("mango");
//        fruits.add("apple"); // Add duplicate
// 
//        System.out.println("Fruits (after adding): " + fruits);
// 
//        // 2. Remove element
//        fruits.remove("apple"); // Removes the first occurrence
// 
//        System.out.println("Fruits (after removing apple): " + fruits);
// 
//        // 3. Search element
//        if (fruits.contains("orange")) {
//            System.out.println("Orange is found in the list.");
//        } else {
//            System.out.println("Orange is not found in the list.");
//        }
// 
//        // 4. Size and content check
//        System.out.println("Size of the ArrayList: " + fruits.size());
// 
//        System.out.println("Elements (index, value):");
//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println("  - Index: " + i + ", Value: " + fruits.get(i));
//        }
//    }
//}

