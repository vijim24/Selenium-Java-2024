package com.viji.selenium.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

//		SELECTING IN DYNAMIX DROPDOWN - USING INDEXES

//		driver.findElement(By.xpath("//a[@value='MAA']")).click(); // Selecting Chennai in From

//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click(); Selecting Bengaluru in To

//		SELECTING IN DYNAMIC DROPDOWN -Using Parent child traversal

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR\'] //a[@value='BLR']"))
				.click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdownDiv'] /ul / li"));
//		System.out.println(elements);

	}

}
