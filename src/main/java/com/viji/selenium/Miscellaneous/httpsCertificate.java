package com.viji.selenium.Miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class httpsCertificate {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
//		FirefoxOptions option1 = new FirefoxOptions();
//		SafariOptions option2 = new SafariOptions();
//		EdgeOptions option3 = new EdgeOptions();
		option.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(option);
//		WebDriver driver1 = new FirefoxDriver(option1);
//		WebDriver driver2 = new SafariDriver(option2);
//		WebDriver driver3 = new EdgeDriver(option3);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
