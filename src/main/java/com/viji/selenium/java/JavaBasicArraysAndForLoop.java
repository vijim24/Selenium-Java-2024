package com.viji.selenium.java;

public class JavaBasicArraysAndForLoop
{

	public static void main(String[] args) {
//		Arrays - Stores multiple value of the same datatype

//		INTEGER ARRAY
		int[] arr = new int[5]; // Array Declaration
		arr[0] = 1;
		arr[0] = 2;
		arr[0] = 3;
		arr[0] = 4;
		arr[0] = 5;
		System.out.println(arr[3]); // Retreving specific elements

		// Retreving all array elements using for loop
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(numbers[1]); // Retreving specific elements

		for (int number : numbers) {
			System.out.println(number);
		}

//		STRING ARRAY
		String[] names = { "Viji", "Vinayagar" };
		for (String name : names) {
			System.out.println(name);
		}

	}

}
