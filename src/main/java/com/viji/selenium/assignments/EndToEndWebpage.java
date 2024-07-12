package com.viji.selenium.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEndWebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
//		AutoSuggestive DropDown
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> elements = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li a"));
		for (WebElement element : elements) {
			System.out.println(element.getText());

			if ("India".contains(element.getText())) {
				Thread.sleep(1000);
				element.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_originStation1_CTNR'] a[value='DEL']"))
				.click();
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']"))
				.click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		String attributeReturnDate = driver.findElement(By.id("Div1")).getAttribute("style");

		if ("1".contains(attributeReturnDate)) {
			System.out.println("It is enabled");
			Assert.assertFalse(false);
		} else {
			Assert.assertTrue(true);
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // Getting the initial passenger dropdown
		// value
		int count = 0;
		driver.findElement(By.id("divpaxinfo")).click();
		while (count <= 3) {
			driver.findElement(By.id("hrefIncAdt")).click();
			count++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}

}
