package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy (id="hotel_name_dis")
	
	private WebElement name;
	
	@FindBy (id="location_dis")
	
	private WebElement place;
	
	@FindBy (id="room_type_dis")
	
	private WebElement room;
	
	@FindBy (id="room_num_dis")
	
	private WebElement number;
	
	@FindBy (id="total_days_dis")
	
	private WebElement totalday;
	
	@FindBy (id="price_night_dis")
	
	private WebElement price;
	
	@FindBy (id="total_price_dis")
	
	private WebElement total;
	
	@FindBy (id="gst_dis")
	
	private WebElement tax;
	
	@FindBy (id="final_price_dis")
	
	private WebElement totalprice;
	
	@FindBy (id="first_name")
	
	private WebElement fname;
	
	@FindBy (id="last_name")
	
	private WebElement lname;
	
	@FindBy (id="address")
	
	private WebElement billingadd;
	
	@FindBy (id="cc_num")
	
	private WebElement cardno;
	
	@FindBy (id="cc_type")
	
	private WebElement cardtype;
	
	@FindBy (id="cc_exp_month")
	
	private WebElement month;
	
	@FindBy (id="cc_exp_year")
	
	private WebElement year;
	
	@FindBy (id="cc_cvv")
	
	private WebElement cvvnumber;
	
	@FindBy (id="book_now")
	
	private WebElement booking;
	
	@FindBy (id="cancel")
	
	private WebElement rejection;

	public Book_Hotel(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getTotalday() {
		return totalday;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getTotal() {
		return total;
	}

	public WebElement getTax() {
		return tax;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBillingadd() {
		return billingadd;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getRejection() {
		return rejection;
	}
	
	

}
