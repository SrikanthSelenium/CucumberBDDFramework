package com.cucumber.StepDef;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.Utility.PropertiesFileReader;
import com.cucumber.enums.Browsers;
import com.cucumber.testBase.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@SuppressWarnings("deprecation")
public class ServiceHooks {

	TestBase testBase;
	PropertiesFileReader p = new PropertiesFileReader();
	@Before
	public void intializeTest() throws Exception {
		Properties prop = p.getProperty();
		testBase = new TestBase();
		testBase.selectBrowser(Browsers.CHROME.name(),prop.getProperty("browser.driver"));
		
	}

	@After
	public void endTest(Scenario scenario) {
		if(scenario.isFailed())
		{
			try {
			final byte[] screenShot  = ((TakesScreenshot)testBase.driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShot, "image/png");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		testBase.driver.quit();
	}

}
