package com.cucumber.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

	private FileInputStream file;
	public Properties OR;
	public String projPath = System.getProperty("user.dir");
	public Properties getProperty() throws Exception {

		String filepath = projPath+"\\resources\\config.properties";

		file = new FileInputStream(new File(filepath));
		OR = new Properties();
		OR.load(file);

		return OR;

	}

}
