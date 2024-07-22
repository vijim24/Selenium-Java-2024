package com.viji.selenium.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN, Keys.DOWN);
		String attribute = driver.findElement(By.id("autocomplete")).getAttribute("value");
		System.out.println(attribute);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector('.ui-menu-item-wrapper')");

//		List<WebElement> elements = driver
//				.findElements(By.cssSelector(".ui-menu.ui-widget.ui-widget-content.ui-autocomplete.ui-front li"));
//		for (WebElement element : elements) {
//			System.out.println(element.getText());
//			if (element.getText().equalsIgnoreCase("Egypt")) {
//				element.click();
//			}
//		}
	}

}
