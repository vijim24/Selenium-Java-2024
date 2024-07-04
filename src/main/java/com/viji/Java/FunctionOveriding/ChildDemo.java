package com.viji.Java.FunctionOveriding;

public class ChildDemo extends ParentDemo {

	public static void main(String[] args) {
		ParentDemo  a = new ChildDemo();
		
		a.audioSystem();
	}
	public void audioSystem() {
		System.out.println("The audio system is overided");
	}
}
