package com.viji.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//div[@id='start'] //button")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish'] //h4")));
		System.out.println(driver.findElement(By.xpath("//div[@id='finish'] //h4")).getText());

	}

}
