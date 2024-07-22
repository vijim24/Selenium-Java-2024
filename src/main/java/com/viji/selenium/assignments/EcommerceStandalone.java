package com.viji.selenium.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceStandalone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		// Entering the username and the password and clicking the login button
		String username = "abc124@gmail.com";
		String pwd = "Qwertyuiop@123";
		driver.findElement(By.cssSelector("#userEmail")).sendKeys(username);
		driver.findElement(By.cssSelector("#userPassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login")).click();
		Thread.sleep(2000);
		// Getting all the elements present in the cart and selecting ZARA COAT 3 and
		// ADDIDAS OROGINAL
		List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='row'])[3]/div/div/div/h5"));
		List<String> addToCart = List.of("ZARA COAT 3", "ADIDAS ORIGINAL");
		List<String> addToCartList = new ArrayList<>(addToCart);
		List<WebElement> elements2 = driver.findElements(By.cssSelector(".btn.w-10.rounded"));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			String string = addToCartList.get(i);
			if (text.equalsIgnoreCase(string)) {
				elements2.get(i).click();
				Thread.sleep(5000);
			}
		}

//		elements.stream().filter(element->{
//			String text = element.getText();
//			if(text.equalsIgnoreCase("zara coat 3")|| text.equalsIgnoreCase("adidas original")) {
//				
//			}
//			
//			});

	}

}
