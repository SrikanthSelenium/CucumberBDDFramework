package com.cucumber.StepDef;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.helper.ResourceHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchClass {

	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {
		Properties prop = obj.getProperty();
		System.setProperty("webdriver.chrome.driver",ResourceHelper.systemPath(prop.getProperty("browser.driver")));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("browser.baseURL"));
		Thread.sleep(3000);

	}

	@When("^Enter search criteria$")
	public void enter_search_criteria() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@name='search_query']"))));
		driver.findElement(By.xpath(".//*[@name='search_query']")).sendKeys("cucumber architecture");
		Thread.sleep(1000);

	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='search-icon-legacy']"))));
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
