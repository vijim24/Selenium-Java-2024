package com.viji.selenium.Miscellaneous;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeOptions;

public class BlockPop {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
	}

}
