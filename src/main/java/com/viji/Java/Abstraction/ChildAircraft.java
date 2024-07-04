package com.viji.Java.Abstraction;

public class ChildAircraft extends ParentAirCraft {

	public static void main(String[] args) {
			ChildAircraft a = new ChildAircraft();
			a.bodyColor();
			a.engine();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color");
	}

}
