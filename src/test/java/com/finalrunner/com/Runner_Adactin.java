package com.finalrunner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.com.Baseclass;
import com.finaladact.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//finalfeatures",
glue="com.finalstep.com",
monochrome = true,
dryRun = false,
strict = true,
tags =("~@regressionTest"),
plugin = {"html:FinalReport/Html_FinalReport",
		
		"pretty",
		
		"json:FinalReports/Cucumber.json",
		
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentFinalReports.html"
}
)

public class Runner_Adactin {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void setup() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().openbrowser();
		
	    driver=Baseclass.Getbrowser(browser);

	}
	
	@AfterClass
	
	public static void  tearDown() {
		
		driver.close();
		
	}
}
