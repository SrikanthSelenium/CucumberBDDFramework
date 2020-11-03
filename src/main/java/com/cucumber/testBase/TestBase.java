package com.cucumber.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.enums.Browsers;
import com.cucumber.enums.OS;

public class TestBase {
	public static WebDriver driver;

	public WebDriver selectBrowser(String browserName, String browserDriver) throws Exception {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOWS.name().toLowerCase())) {
			if (browserName.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + browserDriver);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);

			}
		}
		return driver;
	}
}
