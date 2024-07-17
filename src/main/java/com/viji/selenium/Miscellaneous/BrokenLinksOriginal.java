package com.viji.selenium.Miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinksOriginal {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,2000)");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException exception) {
			System.out.println("Interrupted Exception is throwed when sleep is called");
		}

		List<WebElement> elements = driver.findElements(By.cssSelector("#gf-BIG td a"));

		elements.stream().forEach(element -> {
			String links = element.getAttribute("href");
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(links).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
//				System.out.println(conn.getResponseCode());
				int responseCode = conn.getResponseCode();
//				if (responseCode >= 400) {

				StringBuilder sb = new StringBuilder("Link Text: ");

				SoftAssert softAssert = new SoftAssert();
				System.out.println(responseCode);
				softAssert.assertTrue(responseCode < 400, sb.append(element.getText()).append(" Broken Link: ")
						.append(conn.getURL()).append(" Response Code: ").append(responseCode).toString());

//					sb.append(element.getText()).append(" Broken Link: ").append(conn.getURL())
//							.append(" Response Code: ").append(responseCode);
//					System.out.println(sb);
//					System.out.println("Broken URL " + conn.getURL() + " Response Code: " + responseCode);
//				}
				softAssert.assertAll();
			} catch (IOException e) {
				System.out.println(" IOException caught");
			}

		});

//		elements.stream().forEach(element->System.out.println(element.getAttribute("href")));
//		for (WebElement element : elements) {
//			System.out.println(element.getAttribute("href"));
//		}

	}

}
