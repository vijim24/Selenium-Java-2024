package com.viji.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement helloAndSignIn = driver.findElement(By.id("nav-link-accountList"));
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		
		
		//Moves and rightclick over that specific element
		a.moveToElement(helloAndSignIn).contextClick().build().perform();
		
		//Moves and hovers over that specific element
		a.moveToElement(helloAndSignIn).contextClick().build().perform();
		
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

	}

}
