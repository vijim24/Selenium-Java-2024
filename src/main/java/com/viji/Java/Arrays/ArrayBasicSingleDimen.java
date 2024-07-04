package com.viji.Java.Arrays;

public class ArrayBasicSingleDimen {

	public static void main(String[] args) {
		
//		METHOD 1:
		int[] a = new int[5];  //Declaring arrays and allocated memory
		//Initialization values into arrays
		a[0]=1;
		a[1]=13;
		a[2]=15;
		a[3]=16;
		a[4]=17;
		//Retriving values from arrays
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
//		Method 2:[Using Literal]
		
		int[] b = {1,2,3,4,5};
		for(int i=0;i<=b.length-1;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
