package com.viji.selenium.java.loops;

public class LoopsExercise {

	public static void main(String[] args) {

		/*
		 * ***Pattern 1 2 3 4 
		 * 			  5 6 7
		 *            8 9 
		 *            10
		 */
		int k = 1;
		int l = 1;
		int m = 3;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;

			}

			System.out.println(" ");

		}
		System.out.println("***************");
//		Pattern
		/*
		 * 1 
		 * 2 3 
		 * 4 5 6
		 * 7 8 9 10
		 * 
		 * 
		 */
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println(" ");
		}
		System.out.println("***************");
/*		Pattern
		1
		1 2
		1 2 3 
		1 2 3 4
		*/
		for(int i =1;i<=4;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
		System.out.println("***************");
/*		Pattern
 * 		3
 * 		3 6
 * 		3 6 9
 */
		for(int i =0;i<=4;i++) {
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(m);
				System.out.print("\t");
				m+=3;
			}
			m=3;
			System.out.println(" ");
		}
		
	}

}
