package com.viji.SeleniumUsingStreams;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebTableSortingUsingStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click(); // Clicking the first column so it gets sorted

		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> originalList = elements.stream().map(element -> element.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		
		Assert.assertTrue(originalList.equals(sortedList));

		for (int i = 0; i < originalList.size(); i++) {
			if (originalList.get(i).equalsIgnoreCase(originalList.get(i))) {

				StringBuilder string = new StringBuilder();
				string.append("Original Element : ").append(originalList.get(i)).append(" Sorted Element : ")
						.append(sortedList.get(i));

				System.out.println(string);
			} else {
				System.out.println("Not Equal");
			}
		}
	}

}
