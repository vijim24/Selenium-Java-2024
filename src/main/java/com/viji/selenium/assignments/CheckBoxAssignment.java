package com.viji.selenium.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		Count of Checkbox
		int countOfCheckBoxExample= driver.findElements(By.cssSelector("div[class='right-align'] label")).size();
		Assert.assertEquals(countOfCheckBoxExample, 3);
		
//		Checkbox Handling 
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		List<WebElement> elements = driver.findElements(By.cssSelector("div[class='right-align'] label"));
		for(WebElement element:elements) {
			System.out.println(element.getText());
			if("option1".equalsIgnoreCase(element.getText())) {
				driver.findElement(By.id("checkBoxOption1")).click();
				break;
			}
		}
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		


	}

}
