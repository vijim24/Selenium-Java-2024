package com.viji.selenium.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Login Page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		// Incorrect pwd so received pop up
		String errorText = driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(errorText);
		// Forgot login - To get the pwd
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahul@rahulshetty.com");
		// Xpath - Using Indexing
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		// CSS- Using Indexing
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Rahul@gmail.com");
		// Xpath- Parent child traversing
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// CSS- Parent child traversing
		String tempPwd = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(tempPwd);

		// Customized Traversing
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);

		// User Name
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Viji");
		// Using Regular expression CSS
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		// Using Regular expression Xpath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

//		driver.quit();

	}

}
