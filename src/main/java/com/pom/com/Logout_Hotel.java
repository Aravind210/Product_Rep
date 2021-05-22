package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Hotel {
	
	public static WebDriver driver;
	
	
	@FindBy (id="logout")
	
	private WebElement exit;

	public Logout_Hotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getExit() {
		return exit;
	}
	
	
	
	

}
