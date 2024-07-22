package com.viji.selenium.Miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksUsingNormalMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exception) {
			System.out.println("Interrupted Exception is throwed when sleep is called");
		}
		String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.cssSelector("#gf-BIG td a"));
		for (WebElement element : elements) {
			element.sendKeys(click);
		}
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();

		while (iterator.hasNext()) {

			String title = driver.switchTo().window(iterator.next()).getTitle();
			if (title.contains("Not Found"))
				
				System.out.println(driver.getCurrentUrl());
		}
	}

}
