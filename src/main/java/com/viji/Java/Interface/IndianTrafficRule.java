package com.viji.Java.Interface;

public class IndianTrafficRule implements TrafficRulesInterface,ContinentalTrafficRulesInterface{

	@Override
	public void goGrenn() {
		System.out.println("You can drive!!!");
	}

	@Override
	public void stopRed() {
		System.out.println("You should stop!!!");
	}

	@Override
	public void waitYellow() {
		System.out.println("You should wait!!!");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Walking!!!");
		
	}
	


}
 