package com.viji.selenium4.O.Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameTextBox = driver.findElement(By.name("name"));
//		driver.findElement(withTagName("label").above(nameTextBox));
		String text = driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText();
		System.out.println(text);
		WebElement DOB = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(DOB)).click();
		WebElement checkBoxText = driver.findElement(By.xpath("(//label[@class='form-check-label'])[1]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxText)).click();
		WebElement studentRadio = driver.findElement(By.cssSelector("#inlineRadio1"));
		String text2 = driver.findElement(with(By.tagName("label")).toRightOf(studentRadio)).getText();
		System.out.println(text2);
	}

}
