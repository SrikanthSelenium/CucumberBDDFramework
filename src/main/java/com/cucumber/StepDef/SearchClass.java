package com.cucumber.StepDef;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@SuppressWarnings("deprecation")
public class SearchClass extends TestBase {

	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^Open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {
		Properties prop = obj.getProperty();
		driver.get(prop.getProperty("browser.baseURL"));
		Thread.sleep(3000);
	}

	@Then("^Enter search criteria$")
	public void enter_search_criteria() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@name='search_query']"))));
		driver.findElement(By.xpath(".//*[@name='search_query']")).sendKeys("cucumber architecture");
		Thread.sleep(1000);

	}

	@And("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='search-icon-legacy']"))));
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
	}

}
