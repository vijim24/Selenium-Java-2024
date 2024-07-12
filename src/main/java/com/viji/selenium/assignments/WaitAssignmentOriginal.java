package com.viji.selenium.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignmentOriginal {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		String text = driver.findElement(By.xpath("//div[@class='form-group'] //p")).getText();
		String[] splittedText1 = text.split(" is ");

		String name = userName(splittedText1);
		String pwd = passWord(splittedText1);

		loginPage(driver, name, pwd);

	}

	private static void loginPage(WebDriver driver, String name, String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//label[@class='customradio'][2] //span[@class='checkmark']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		select.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));

		List<WebElement> elements = driver.findElements(By.className("btn-info"));
		for (WebElement element : elements) {
			element.click();
		}
		driver.findElement(By.className("btn-primary")).click();

	}

	private static String passWord(String[] splittedText1) {
		String password = splittedText1[2].substring(0, splittedText1[2].length() - 1);
		return password;
	}

	private static String userName(String[] splittedText1) {
		String userName = splittedText1[1].split(" and Password")[0];
		return userName;
	}
}
