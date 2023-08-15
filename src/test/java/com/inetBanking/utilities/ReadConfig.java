package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;	
	}
	public String getUserName() {
		String username = pro.getProperty("userName");
		return username;
	}
	public String passWord() {
		String password = pro.getProperty("passWord");
		return password;
	}	
	public String getBrowserName() {
		String browsername = pro.getProperty("browserName");
		return browsername;
	}
	
}
