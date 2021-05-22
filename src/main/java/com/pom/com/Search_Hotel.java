package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	
	@FindBy (id="location")
	
	private WebElement location;
	
	@FindBy (id="hotels")
	
	private WebElement hotel;
	
	@FindBy (id="room_type")
	
	private WebElement roomtype;
	
	@FindBy (id="room_nos")
	
	private WebElement roomno;
	
	@FindBy (id="datepick_in")
	
	private WebElement indate;
	
	@FindBy (id="datepick_out")
	
	private WebElement outdate;
	
	@FindBy (id="adult_room")
	
	private WebElement adult;
	
	@FindBy (id="child_room")
	
	private WebElement child;
	
	@FindBy (id="Submit")
	
	private WebElement submit;
	
	@FindBy (id="Reset")
	
	private WebElement reset;



	public Search_Hotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
	
	
	
	

}
