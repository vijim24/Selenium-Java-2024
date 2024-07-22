package com.viji.selenium.Miscellaneous;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyDemo {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("IPaddress:PortNo");
		option.setCapability("proxy", proxy);
		WebDriver driver = new ChromeDriver(option);
	}

}
