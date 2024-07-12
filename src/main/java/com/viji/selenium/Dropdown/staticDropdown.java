package com.viji.selenium.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class staticDropdown {

	public static void main(String[] args) {
		int count = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		CURRENCY DROPDOWN
		WebElement currencyDropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select staticdropDown = new Select(currencyDropdown);
		staticdropDown.selectByIndex(1);
		Assert.assertEquals(staticdropDown.getFirstSelectedOption().getText(), "INR");

		staticdropDown.selectByValue("AED");
		Assert.assertEquals(staticdropDown.getFirstSelectedOption().getText(), "AED");

		staticdropDown.selectByValue("USD");
		Assert.assertEquals(staticdropDown.getFirstSelectedOption().getText(), "USD");

//		PASSENGER DROPDOWN
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Getting the initial passenger dropdown
																				// value
		driver.findElement(By.id("divpaxinfo")).click();
		while (count <= 3) {
			driver.findElement(By.id("hrefIncAdt")).click();
			count++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Getting the final passenger dropdown
																				// value after clicking.
//		driver.quit();

	}

}
