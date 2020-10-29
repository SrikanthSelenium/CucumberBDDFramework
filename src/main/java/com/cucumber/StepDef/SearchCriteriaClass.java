package com.cucumber.StepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cucumber.PageObjects.SearchPage;
import com.cucumber.PageObjects.SearchResultPage;
import com.cucumber.Utility.BrowseUtility;
import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.helper.ResourceHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCriteriaClass {
	public WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^Launch browser and enter url$")
	public void launch_browser_and_enter_url() throws Throwable {
		Properties prop = obj.getProperty();
		driver = BrowseUtility.getBrowser(ResourceHelper.systemPath(prop.getProperty("browser.driver")),prop.getProperty("browser.name"), prop.getProperty("browser.baseURL"));
	}

	@When("^Enter searching \"([^\"]*)\" criteria$")
	public void enter_searching_criteria(String arg1) throws Throwable {
		new SearchPage(driver).searchCriteria(arg1);
	}

	@When("^Click on channel link$")
	public void click_on_channel_link() throws Throwable {
		new SearchPage(driver).searchBtn();
		Thread.sleep(3000);
	}

	@Then("^Validate channel name$")
	public void validate_channel_name() throws Throwable {
		String title = new SearchResultPage(driver).validateTitle();
		String actTitle = "cucumber architecture - YouTube";
		Assert.assertTrue(title.contains(actTitle), "Title Not Matched");

	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		new SearchResultPage(driver).tearDown();
	}

}
