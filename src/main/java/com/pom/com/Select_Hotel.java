package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy (id="radiobutton_0")
	
	private WebElement select;
	
	@FindBy (id="continue")
	
	private WebElement submit;
	
	@FindBy (id="cancel")
	
	private WebElement reject;

	public Select_Hotel(WebDriver driver) {
		
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReject() {
		return reject;
	}
	
	
	

}
