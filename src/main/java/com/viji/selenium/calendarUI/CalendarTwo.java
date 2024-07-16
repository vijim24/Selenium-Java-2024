package com.viji.selenium.calendarUI;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTwo {

	public static void main(String[] args) {

		String date = "23";
		String month = "6";
		String year = "2027";
		String[] expectedList = { month, date, year };
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		driver.findElement(By.xpath("//a[@class='cart-header-navlink'][1]")).click();

		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon.react-date-picker__button__icon"))
				.click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		List<WebElement> elements = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getAttribute("value"));
			Assert.assertEquals(elements.get(i).getAttribute("value"), expectedList[i]);
		}

	}

}
