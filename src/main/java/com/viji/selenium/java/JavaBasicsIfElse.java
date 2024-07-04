package com.viji.selenium.java;

public class JavaBasicsIfElse {

	public static void main(String[] args) {
		// Print multiples of 2 numbers from the array
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			} else {
				System.out.println("Is not multiple of 2 " + number);
			}
		}

		// Exit the loop if multiple of 2 numbers found
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
				break;
			} else {
				System.out.println("Is not multiple of 2 " + number);
			}
		}
	}

}
