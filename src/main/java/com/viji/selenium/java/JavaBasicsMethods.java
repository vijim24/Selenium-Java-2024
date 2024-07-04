package com.viji.selenium.java;

public class JavaBasicsMethods {

	public static void main(String[] args) {
		JavaBasicsMethods a = new JavaBasicsMethods();
		a.getData();
		getData2(); // Since this method is declared as static need not call using object

	}

	public void getData() {
		System.out.println("Non Static Method!!!");
	}

	public static void getData2() {
		System.out.println("Static method!!!");
	}
}
