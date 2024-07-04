package com.viji.Java.inheritance;

public class ChildClassDemo extends ParentClassDemo{
	public void engine() {
		System.out.println("New Engine");
	
	}
	
	public void color() {
		System.out.println(colour);
	}
	public static void main(String[] args) {
		ParentClassDemo a = new ParentClassDemo();
	}

}
