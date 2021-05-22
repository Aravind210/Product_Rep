package com.finaladact.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable {
		
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Final_Adactin\\src\\test\\java\\com\\finaladact\\properties\\Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
		
		
	}
	
	public String openbrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String openurl() {
		
		String url = p.getProperty("url");
		
		return url;

	}

}
