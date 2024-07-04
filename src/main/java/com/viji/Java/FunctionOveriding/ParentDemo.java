package com.viji.Java.FunctionOveriding;

public class ParentDemo {
	public void audioSystem() {
		System.out.println("The audio system");
	}

	public void getData(int a) {
		System.out.println("Print the value of a " + a);
	}

	public void getData(int a, int b) {
//		System.out.println("Print the value of a"+a+ "and b "+ b);
		System.out.println("Print the value of a and b" + a + b);
	}

	public void getData(String a) {
		System.out.println("Print the value of the string a" + a);

	}
}
