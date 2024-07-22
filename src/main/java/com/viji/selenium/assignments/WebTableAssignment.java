package com.viji.selenium.assignments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement element = driver.findElement(By.cssSelector(".table-display"));
		int columnSize = element.findElements(By.cssSelector("tbody th")).size();
		int rowSize = element.findElements(By.cssSelector(" .table-display tbody tr")).size();
		System.out.println(columnSize);
		System.out.println(rowSize);
		String attribute = element.findElement(By.cssSelector(" .table-display tbody tr:nth-child(3)")).getText();
		System.out.println(attribute);
	}
}
