package com.viji.selenium.assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitAssignmentDummy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String text = driver.findElement(By.xpath("//div[@class='form-group'] //p")).getText();
		String[] splittedText = text.split(" ");
		List<String> splittedTextList = Arrays.asList(splittedText);
		String userName = user(splittedTextList);
		String password = pwd(splittedTextList);
		System.out.println(userName);
		System.out.println(password);

	}

	private static String user(List<String> splittedTextList) {
		String name = " ";

		for (int i = 0; i < splittedTextList.size(); i++) {
			if (splittedTextList.get(i).contains("rahulshettyacademy")) {
				name = splittedTextList.get(i);
				break;
			}

		}
		return name;

	}

	private static String pwd(List<String> splittedTextList) {
		String pwd = " ";
		for (int i = 0; i < splittedTextList.size(); i++) {
			if (splittedTextList.get(i).contains("learning")) {
				pwd = splittedTextList.get(i).substring(0,splittedTextList.get(i).length()-1);
				break;
			}
		}
		return pwd;

	}

}
