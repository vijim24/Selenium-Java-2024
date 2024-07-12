package com.viji.selenium.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertDemo {

	public static void main(String[] args) {
		String name = "Viji M";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "Hello Viji M, share this practice page and share your knowledge");
		System.out.println(alert.getText());
		alert.accept();

		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(alert.getText());
		driver.switchTo().alert().dismiss();

	}

}
