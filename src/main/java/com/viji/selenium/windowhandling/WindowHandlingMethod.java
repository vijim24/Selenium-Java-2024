package com.viji.selenium.windowhandling;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();

		driver.switchTo().window(childId);

		String text = driver.findElement(By.xpath("//div[@class='col-md-8'] //p[@class='im-para red']")).getText();
		System.out.println(text);
		String[] splittedText = text.split(" ");
		List<String> asList = Arrays.asList(splittedText);
		String userName=" ";
		for(int i=0;i<asList.size();i++) {
			if(asList.get(i).contains("@")) {
				userName = asList.get(i);
				System.out.println(userName);
				break;
			}
			
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(userName);
		
	}

}
