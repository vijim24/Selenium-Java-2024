package com.viji.selenium.java.loops;

public class Loops {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
//		******While Loop*******
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*************");
//		******* do ..while********
		do {
			j++;
			System.out.println(j);

		} while (j <= 10);

//		*******Nested Loop*******

		for (int k = 0; k <= 3; k++) {
			System.out.println("Outer Loop started");
			for (int l = 1; l <= 2; l++) {
				System.out.println("Inner Loop started");
			}
			System.out.println("Outer Loop ended");
		}
	}

}
