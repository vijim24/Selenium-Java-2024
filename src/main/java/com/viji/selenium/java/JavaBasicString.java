package com.viji.selenium.java;

public class JavaBasicString {

	public static void main(String[] args) {
//		One way - Using Literal
//		s and s1,gets stored in the same memory location since it has same value
		String s = "Vinayagar Viji";
		String s1 = "Vinayagar Viji";

//		Second way - Using the NEW Keyword
//		s2 and s3, gets stored in different memory location even though having the same value
		String s2 = new String("Welcome Vicky");
		String s3 = new String("Welcome Vicky");

		String[] splittedS = s.split("V");
		System.out.println(splittedS[0]);
		System.out.println(splittedS[1]);
		System.out.println(splittedS[2]);

//		Print String in Reverse Order
		for (int i = s.length() - 1; i > 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
