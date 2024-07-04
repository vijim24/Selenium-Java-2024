package com.viji.Java.Interface;

public class IndianTrafficRuleRunner {

	public static void main(String[] args) {
		TrafficRulesInterface rule = new IndianTrafficRule();
		ContinentalTrafficRulesInterface rule2 = new IndianTrafficRule();
		rule.goGrenn();
		rule.stopRed();
		rule.waitYellow();
		rule2.trainSymbol();
	}

}
