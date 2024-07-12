package com.viji.selenium.checkBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		boolean isFamilyFriendsSelected = driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
//		Depart Date-
		System.out.println("Is Family and Friends Selected:"+ isFamilyFriendsSelected);
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();   // Using CSS Regular Expression
		System.out.println("Is Family and Friends Selected:"+ isFamilyFriendsSelected);
//		input[id*='friendsandfamily']
		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		
//		Count the Number of Checkboxes in the section below search
		List<WebElement> elements = driver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes'] div"));
		int count =0;
		for(WebElement element:elements) {
			count++;
		}
 		System.out.println("Number of Checkboxes:"+count);
		Assert.assertEquals(count, 6);
		
//		Count of checkbox in the entire page
		int sixeOfCheckBoxInThePage = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(sixeOfCheckBoxInThePage);
		
	}

}
