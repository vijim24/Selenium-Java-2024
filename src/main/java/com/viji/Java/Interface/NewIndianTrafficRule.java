package com.viji.Java.Interface;

public class NewIndianTrafficRule implements TrafficRulesInterface{

	@Override
	public void goGrenn() {
		System.out.println("You cannot drive!!!");
	}

	@Override
	public void stopRed() {
		System.out.println("You should not stop!!!");
	}

	@Override
	public void waitYellow() {
		System.out.println("System.out.println(\"\");");
	}
	


}
