package com.cucumber.helper;

public class ResourceHelper {

	public static String systemPath(String path) {
		String basepath = System.getProperty("user.dir");
		return basepath + "/" +path;

	}

}
