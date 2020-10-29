package com.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	WebDriver driver;

	@FindBy(xpath = "//a[@title='Selenium GRID Full Course by Bakkappa N']")
	WebElement channel;

	@FindBy(xpath = "//title[contains(text(),'Selenium GRID Full Course by Bakkappa N - YouTube')]")
	WebElement title;

	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickChannel() {
		waitForElement(channel);
		channel.click();
	}

	public String validateTitle() {

		return driver.getTitle();

	}
	
	public void tearDown()
	{
		driver.quit();
	}
	

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
