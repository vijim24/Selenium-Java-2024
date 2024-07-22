package com.viji.selenium4.O.Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureWebElementScreenshot {

	public static void main(String[] args) throws IOException {

//Taking Screenshot of the whole page
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		try {
//			FileUtils.copyFile(src, new File("C:\\Viji\\Output_File\\screenshot.png"));
//		} catch (IOException exception) {
//			System.out.println("IOException obtained while coping the src file to local destination");
//		}
//		

//		Taking partial screenshot
		WebElement nameTextBox = driver.findElement(By.name("name"));
		nameTextBox.sendKeys("All-Access Membership-Complete Access To 25+ Courses (And Counting!)");
		File screenshotAs = nameTextBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("partialScreenshot.png"));

	}

}
