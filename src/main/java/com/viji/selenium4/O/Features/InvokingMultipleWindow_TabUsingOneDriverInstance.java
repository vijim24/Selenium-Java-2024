package com.viji.selenium4.O.Features;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindow_TabUsingOneDriverInstance {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		Set<String> windowHandles = driver.getWindowHandles();
		String parentId = StringUtils.EMPTY;
		String childId = StringUtils.EMPTY;
		Iterator<String> iterator = windowHandles.iterator();
		if (iterator.hasNext()) {
			parentId = iterator.next();
		}
		if (iterator.hasNext()) {
			childId = iterator.next();
		}

		driver.switchTo().window(childId);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		List<WebElement> elements = driver
				.findElements(By.cssSelector("#courses-block div div div:nth-child(2) div:nth-child(1) h2"));
//		String text = " ";
//		for (WebElement element : elements) {
//			text = element.getText();
//			break;
//
//		}
//		System.out.println(text);

		String courseName = StringUtils.EMPTY;
		List<String> courseNames = elements.stream().limit(1).map(element -> element.getText())
				.collect(Collectors.toList());
		if (CollectionUtils.isNotEmpty(courseNames)) {
			courseName = courseNames.get(0);
		}
		System.out.println(courseName);
	}

}
