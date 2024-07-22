package com.viji.selenium4.O.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightWidthOfWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameTextBox = driver.findElement(By.name("name"));
		nameTextBox.sendKeys("All-Access Membership-Complete Access To 25+ Courses (And Counting!)");
		int height = nameTextBox.getRect().getDimension().getHeight();
		int width = nameTextBox.getRect().getDimension().getWidth();
		System.out.println(height);
		System.out.println(width);
	}

}
