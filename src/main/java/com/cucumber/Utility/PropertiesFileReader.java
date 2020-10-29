package com.cucumber.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

	private FileInputStream file;
	public Properties OR;

	public Properties getProperty() throws Exception {

		String filepath = "E:\\MyFrameworks\\SeleniumCucumberBDDFramework\\resources\\config.properties";

		file = new FileInputStream(new File(filepath));
		OR = new Properties();
		OR.load(file);

		return OR;

	}

}
