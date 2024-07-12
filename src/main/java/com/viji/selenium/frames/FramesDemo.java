package com.viji.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement dragabbleElement = driver.findElement(By.cssSelector(".ui-draggable-handle"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		dragabbleElement.click();
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).click().dragAndDrop(dragabbleElement, dropLocation).build().perform();
		driver.switchTo().defaultContent();

	}

}
