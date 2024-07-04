package com.viji.Java.FunctionOverloading;

public class ChildDemo extends ParentDemo{

	public static void main(String[] args) {
		ParentDemo a =new ChildDemo();
		a.getData(5);
		a.getData("Viji");
		a.getData(5, 6);
	}

}
