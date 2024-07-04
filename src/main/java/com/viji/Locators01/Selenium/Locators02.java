package com.viji.Locators01.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators02 {

	public static void main(String[] args) throws InterruptedException {
		// Logging into the page and getting data
		String name = "Viji";

		WebDriver driver = new ChromeDriver();
		String websitePwd = getPwd(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys(name);

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(websitePwd);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		driver.quit();

	}

	public static String getPwd(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// Forgot login - To get the pwd
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// CSS- Parent child traversing
		String tempPwd = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(tempPwd);

		String[] splittedPwd = tempPwd.split("'");

		String[] splittedPwd2 = splittedPwd[1].split("'");

		String finalPwd = splittedPwd2[0];

		return finalPwd;

//	int i = 0;i<splittedPwdList.size();i++)
//	{
//		if (splittedPwdList.contains("rahulshettyacademy")) {
//
//		}
//	}
//	char[] splittedtextPwd1 = null;System.out.println(splittedtextPwd1);

	}

}
