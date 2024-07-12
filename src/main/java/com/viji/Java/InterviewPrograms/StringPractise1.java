package com.viji.Java.InterviewPrograms;

import java.util.Arrays;

public class StringPractise1 {

	public static void main(String[] args) {
		String str = "I am Viji";
		char[] charArray = str.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		String charStr = new String(charArray);
//		String charStr = charArray.toString();
		String result = charStr.strip();
		System.out.println(" Final result = " + result);
	}

}
