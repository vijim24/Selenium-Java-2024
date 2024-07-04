package com.viji.Java.Super;

public class ChildSuper extends ParentSuper {
	
//  Redundant variable name present in both the parent and in the child class

	public ChildSuper() {
		super();
		System.out.println("Child Class construtor");
	}
	String name = "Viji";

	public void getString() {
		System.out.println(name);
		System.out.println(super.name);
	}
	

//  Same method name present in the parent and in the child class
	
	public void getData() {
		super.getData();
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		ChildSuper cd = new ChildSuper();
		cd.getString();
		cd.getData();
	}

}
