package com.viji.selenium.java;

public class JavaExercise {

	public static void main(String[] args) {

		// Printing Array Elements in reverse order
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.println(numbers[i]);

		}

		System.out.println("Size of the Array " + numbers.length);

	}

}
