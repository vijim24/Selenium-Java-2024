package com.viji.selenium.Dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
		List<WebElement> autoSuggestedElements = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement autoSuggestedElement:autoSuggestedElements) {
			
			if(autoSuggestedElement.getText().equalsIgnoreCase("Australia")){
				Thread.sleep(1000);
				autoSuggestedElement.click();
			}
		}

//		Iterator<WebElement> suggestedElements = autoSuggestedElements.iterator();
//		while (suggestedElements.hasNext()) {
//			WebElement suggestedElement = suggestedElements.next();
//			if("Indonesia".contains(suggestedElement.getText())) {
//				suggestedElement.click();
//				break;
//			}
//	}

	}

}
