package com.viji.SeleniumUsingStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSortingUsingStreams03 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		List<WebElement> elements = driver.findElements(By.cssSelector(".table.table-bordered tr td:nth-child(1)"));
		List<String> collectList = elements.stream().filter(element -> element.getText().contains("Rice"))
				.map(element -> element.getText()).collect(Collectors.toList());
		System.out.println(collectList.toString());
	
	
	}

}
