package com.viji.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//label[@for='benz'] //input[@id='checkBoxOption2']")).click();
		String text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
//		driver.findElement(By.id("dropdown-class-example")).click();
		s.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		if (text2.contains(text)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		alert.accept();
	}

}
