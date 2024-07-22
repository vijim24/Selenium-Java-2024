package com.viji.selenium.Miscellaneous;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingOfWebpages {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)"); // Scroll Down the WebPage
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		List<WebElement> elements = driver
				.findElements(By.cssSelector("div[class='tableFixHead'] table tbody tr td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < elements.size(); i++) {
			sum = sum + Integer.parseInt(elements.get(i).getText());
		}
		System.out.println(sum);
		String[] split = driver.findElement(By.className("totalAmount")).getText().split(": ");
		System.out.println(split[1]);
		Assert.assertEquals(Integer.parseInt(split[1]) , sum);
	}

}
