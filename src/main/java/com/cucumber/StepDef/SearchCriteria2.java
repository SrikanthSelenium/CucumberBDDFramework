package com.cucumber.StepDef;

import java.util.List;
import java.util.Properties;

import org.testng.Assert;

import com.cucumber.PageObjects.SearchPage;
import com.cucumber.PageObjects.SearchResultPage;
import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.testBase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCriteria2 extends TestBase{
	SearchPage searchPage = new SearchPage(driver);

	PropertiesFileReader obj = new PropertiesFileReader();
	
	@Given("^Launch browser and enter appsite$")
	public void launch_browser_and_enter_appsite() throws Throwable {
		Properties prop = obj.getProperty();
		driver.get(prop.getProperty("browser.baseURL"));
	}

	@When("^Enter searching criteria$")
	public void enter_searching_criteria(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		
		searchPage.searchCriteria(data.get(0).get(0));
		
	}

	@And("^Click on channel button$")
	public void click_on_channel_button() throws Throwable {
		searchPage.searchBtn();
		Thread.sleep(3000);
	}

	@Then("^Validate channel name with actual name$")
	public void validate_channel_name_with_actual_name() throws Throwable {
		String title = new SearchResultPage(driver).validateTitle();
		String actTitle = "cucumber architecture - YouTube";
		Assert.assertTrue(title.contains(actTitle), "Title Not Matched");
	}

}
