package com.viji.selenium.AddingItemsToEcomWeb;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EcommerceWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		List<WebElement> elements = driver.findElements(By.xpath("//h4[@class='product-name']"));
		addingElementsToCart(driver, elements);
		checkOutPage(driver);

	}

	private static void addingElementsToCart(WebDriver driver, List<WebElement> elements) {
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[@class='product-action']/button"));

		List<String> groceryList1 = List.of("Almonds", "Nuts Mixture", "Beetroot");
//		List<String> groceryList= Arrays.asList("Almonds","Nuts Mixture","Beetroot","Almonds");
		int count = 0;
		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i).getText());
			String greenCartGrocery = elements.get(i).getText().split("-")[0].strip();
			if (groceryList1.contains(greenCartGrocery)) {
//			if (elements.get(i).getText().contains("Cucumber - 1 Kg")) {
//				if("Cucumber - 1 Kg".contains(element.getText())) {
				elements2.get(i).click();
				count++;
				if (count == (groceryList1.size())) {
					break;
				}
			}
			elements.get(i).getText();

		}

		driver.findElement(By.cssSelector("img[alt='Cart']")).click(); // Clicking the Cart Icon
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

//		for(WebElement element:elements) {
//			System.out.println(element.getText());
//			if(element.getText().contains("Cucumber - 1 Kg")) {
//			if("Cucumber - 1 Kg".contains(element.getText())) {
//				element2.click();  
//			}
//		}
	}

	private static void checkOutPage(WebDriver driver) {
		String promoCode = "rahulshettyacademy";
		driver.findElement(By.className("promoCode")).sendKeys(promoCode);
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		Assert.assertEquals(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText(), "Code applied ..!");
	}

}
