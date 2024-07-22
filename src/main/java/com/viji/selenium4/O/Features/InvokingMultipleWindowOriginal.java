package com.viji.selenium4.O.Features;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowOriginal {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/");
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		List<WebElement> elements = driver
				.findElements(By.cssSelector("#courses-block div div div:nth-child(2) div:nth-child(1) h2"));
		String text = " ";
		for (WebElement element : elements) {
			text = element.getText();
			break;

		}
		driver.switchTo().window(parentId);

		driver.findElement(By.name("name")).sendKeys(text);

	}

}
