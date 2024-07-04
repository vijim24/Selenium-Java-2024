package com.viji.Java.Constructor;

public class ConstructorDemo {
	// Default Constructor
	public ConstructorDemo() {
		System.out.println("I am Default constructor");
	}

//	Parameterized Constructor
	public ConstructorDemo(int a, int b) {
		System.out.println("I am Parameterized constructor");
		System.out.println(a+b);
	}

	public ConstructorDemo(String b) {
		System.out.println(b);
	}

	public void getData() {
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {
		ConstructorDemo conObj = new ConstructorDemo(); // Calls the default constructor
		ConstructorDemo cd = new ConstructorDemo(4, 5); // Calls the parameterized constructor
		ConstructorDemo cdg = new ConstructorDemo("Hello");
		conObj.getData();
	}

}
