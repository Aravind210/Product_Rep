package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Hotel {
	
	public static WebDriver driver;
	
	@FindBy (id="username")
	
	private WebElement uname;
	
	@FindBy (id="password")
	
	private WebElement pword;
	
	@FindBy (id="login")
	
	private WebElement enter;


	

	public Login_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPword() {
		return pword;
	}

	public WebElement getEnter() {
		return enter;
	}
	
	

	
}
