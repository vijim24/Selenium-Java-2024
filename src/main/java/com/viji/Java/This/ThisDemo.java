package com.viji.Java.This;

public class ThisDemo {
	int a = 10;

	public void getData() {
		int a = 15;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("Sum of the local and global variable" + (this.a + a));
	}

	public static void main(String[] args) {
		ThisDemo ct = new ThisDemo();
		ct.getData();
	}

}
