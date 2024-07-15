package com.viji.selenium.Miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LinkCount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int countOfLinks = driver.findElements(By.tagName("a")).size();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Assert.assertEquals(countOfLinks, 27);
//		int countOfLinkInFooter = driver.findElements(By.cssSelector("div[id='gf-BIG'] table tbody tr td ul li a")).size();

//		LIMITING WEB DRIVER SCOPE ----Find the number of Webelement only in the footer section

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

//		LIMITING SCOPE FROM THAT FOOTER SECTION TO COLUMN1 PRESENT IN THAT FOOTER SECTION

		WebElement columnOneFooter = footerDriver
				.findElement(By.xpath("//div[@id='gf-BIG'] //table //tbody //tr //td[1] "));

		int countOfColumnOneLinks = columnOneFooter.findElements(By.tagName("a")).size();
		System.out.println(countOfColumnOneLinks);
		Actions a = new Actions(driver);
//		Click every link from the column One Footer[One way of clicking using action class
		List<WebElement> elements = columnOneFooter.findElements(By.tagName("a"));
//
//		for (int i = 0; i < elements.size() - 1; i++) {
//			a.moveToElement(elements.get(i)).keyDown(Keys.CONTROL).click().build().perform();
//		}
//		Click every link from the column One Footer[Another way of clicking using keys chord]
		String chord = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 0; i < countOfColumnOneLinks; i++) {
			elements.get(i).sendKeys(chord);
		}
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(2000));

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			driver.switchTo().window(next);

			System.out.println(driver.getTitle());

		}
	}

}
