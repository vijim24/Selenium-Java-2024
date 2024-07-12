package com.viji.selenium.WindowActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

//		Maximize the window
		driver.manage().window().maximize();
//		Minimize the window
//		driver.manage().window().minimize();
//		Fullscreen the window
		driver.manage().window().fullscreen();
//		Navigate - Loads a new webpage in the current browser window
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
