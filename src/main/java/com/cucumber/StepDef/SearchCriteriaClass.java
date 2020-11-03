package com.cucumber.StepDef;

import java.util.Properties;

import org.testng.Assert;

import com.cucumber.PageObjects.SearchPage;
import com.cucumber.PageObjects.SearchResultPage;
import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@SuppressWarnings("deprecation")
public class SearchCriteriaClass extends TestBase {

	SearchPage searchPage = new SearchPage(driver);

	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^Launch browser and enter url$")
	public void launch_browser_and_enter_url() throws Throwable {
		Properties prop = obj.getProperty();
		driver.get(prop.getProperty("browser.baseURL"));
	}
		

	@Then("^Enter searching \"([^\"]*)\" criteria$")
	public void enter_searching_criteria(String arg1) throws Throwable {
		searchPage.searchCriteria(arg1);
	}

	@Then("^Click on channel link$")
	public void click_on_channel_link() throws Throwable {
		searchPage.searchBtn();
		Thread.sleep(3000);

	}

	@And("^Validate channel name$")
	public void validate_channel_name() throws Throwable {
		String title = new SearchResultPage(driver).validateTitle();
		String actTitle = "cucumber architecture - YouTube";
		Assert.assertTrue(title.contains(actTitle), "Title Not Matched");
	}

}
