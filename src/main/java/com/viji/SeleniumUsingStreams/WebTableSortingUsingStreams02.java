package com.viji.SeleniumUsingStreams;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSortingUsingStreams02 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.cssSelector(".cart-header-navlink:nth-child(2)")).sendKeys(keys);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentID = iterator.next();
		String childID = iterator.next();
		driver.switchTo().window(childID);
		driver.findElement(By.cssSelector(".table.table-bordered tr th:nth-child(1)")).click();
//		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
//		elements.stream().map(element -> {
//			String text = element.getText();
//			if (text.equalsIgnoreCase("Rice")) {
//				String price = element.findElement(By.xpath("following-sibling::td[1]")).getText();
//				return price;
//			}
//			return "RiceNotFound";
//
//		}).forEach(element -> System.out.println(element));

//		elements.stream().filter(element -> element.getText().equalsIgnoreCase("rice"))
//		.map(element -> getPriceOfVeggies(element)).forEach(element -> System.out.println(element));

		WebElement nextButton = driver.findElement(By.cssSelector(".pagination.pull-right li:nth-child(7)"));
		boolean isPriceOfRiceFound = false;
		int pageCount = 1;
		List<String> priceList = new ArrayList<>();
		while (nextButton.isEnabled() && !isPriceOfRiceFound) {
			List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
			priceList = elements.stream().filter(element -> element.getText().equalsIgnoreCase("rice"))
					.map(element -> getPriceOfVeggies(element)).collect(Collectors.toList());
			boolean isEmptyList = CollectionUtils.isEmpty(priceList);
			if (isEmptyList) {
				nextButton.click();
				pageCount++;
			} else {
				break;
			}
		}
		StringBuilder sb = new StringBuilder("Price of Rice: ");
		sb.append(priceList).append("\nPage in which rice was found: ").append(pageCount);
		System.out.println(sb.toString());

	}

	public static String getPriceOfVeggies(WebElement element) {
		String priceValue = element.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
