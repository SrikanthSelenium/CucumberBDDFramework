package com.cucumber.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseUtility {

	static WebDriver driver;

	public static WebDriver getBrowser(String browserDriver, String browserName, String url) throws Exception {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",browserDriver);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(3000);
		}
		return driver;
	}

}
