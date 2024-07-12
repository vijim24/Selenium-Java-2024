package com.viji.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators03 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//		driver.findElement(By.xpath("//div /button[1]")).click();   //Relative XPath
//		driver.findElement(By.xpath("/html/body/header/div/button[1]")).click(); //Absolute XPath

//		Traversing from sibling to sibling
		String text = driver.findElement(By.xpath("/html/body/header/div/button[1]/following-sibling::button[1]"))
				.getText();
		System.out.println(text);
//		Traversing from child to parent
		String text1 = driver.findElement(By.xpath("/html/body/header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(text1);

	}

}
