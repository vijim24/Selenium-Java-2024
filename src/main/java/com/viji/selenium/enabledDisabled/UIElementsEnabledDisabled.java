package com.viji.selenium.enabledDisabled;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIElementsEnabledDisabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();  // RoundTrip RadioButton
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// Is enabled is not working in certain scenarios in that case, Find the
		// attribute which is changing
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String attributeReturnDate = driver.findElement(By.id("Div1")).getAttribute("style");
		
		if("1".contains(attributeReturnDate)) {
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
//		String num = "123";
//		System.out.println(num.contains("1"));    true
//		System.out.println(num.equalsIgnoreCase("1")); false
		
		
	}

}
