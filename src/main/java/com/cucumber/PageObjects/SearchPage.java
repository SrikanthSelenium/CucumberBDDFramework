package com.cucumber.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	WebDriver driver;

	@FindBy(xpath = ".//*[@name='search_query']")
	WebElement search;

	@FindBy(xpath = "//button[@id='search-icon-legacy']")
	WebElement searchBtn;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchCriteria(String arg1) {
		waitForElement(search);
		search.sendKeys(arg1);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
	}
	
	public void searchBtn()
	{
		waitForElement(searchBtn);
		searchBtn.click();
		}

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
