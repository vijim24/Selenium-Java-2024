package com.viji;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); // Chrome Driver
//		WebDriver driver = new FirefoxDriver();	Firefox driver
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
