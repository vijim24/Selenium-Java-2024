package com.viji.Java.Arrays;

public class ArrayBasicMultiDimen {

	public static void main(String[] args) {

//		Printing Matrix Elements

		int a[][] = new int[2][3];
		a[0][0] = 22;
		a[0][1] = 32;
		a[0][2] = 42;
		a[1][0] = 52;
		a[1][1] = 62;
		a[1][2] = 72;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
		System.out.println("*****************************************");
		int b[][] = { { 5, 2, 3 }, { 4, 1, 6 }, { 7, 8, 9 } };
		int minNumber = b[0][0];
		int maxNumber = 0;
		int columnNumber = 0;

//		Print the smallest number from a 3*3 matrix

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] < minNumber) {
					minNumber = b[i][j];
					columnNumber = j;
				}

			}

		}

		System.out.println("Minimum Number and row position of smallest value " + minNumber + " " + columnNumber);
		int k = 0;
		while (k < 3) {
			if (b[k][columnNumber] > maxNumber) {
				maxNumber = b[k][columnNumber];

			}
			k++;

		}
		System.out.println("MaxNumber from the columnNumber " + maxNumber);
		System.out.println("*****************************************");
//		Print the Largest number from a 3*3 matrix
		int max = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] > max) {
					max = b[i][j];
				}

			}
		}
		System.out.println("Maximum Number " + max);

	}
}
