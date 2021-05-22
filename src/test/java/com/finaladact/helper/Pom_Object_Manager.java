package com.finaladact.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.Book_Hotel;
import com.pom.com.Login_Hotel;
import com.pom.com.Logout_Hotel;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

public class Pom_Object_Manager {
	
	public static WebDriver driver;
	
	private Login_Hotel login;
	
	private Search_Hotel search;
	
	private Book_Hotel book;
	
	private Select_Hotel select;
	
	private Logout_Hotel logout;
	
	
	public Pom_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public Login_Hotel getInstanceLogin() {
		
		login=new Login_Hotel(driver);
		
		return login;

	}
	
	public Search_Hotel getInstanceSearch() {
		
		search=new Search_Hotel(driver);
		
		return search;

	}
	
	public Book_Hotel getInstanceBook() {
		
		book=new Book_Hotel(driver);
		
		return book;

	}
	
	public Select_Hotel getInstanceSelect() {
		
		select=new Select_Hotel(driver);
		
		return select;

	}
	
	
	public Logout_Hotel getInstanceLogout() {
		
		logout=new Logout_Hotel(driver);
		
		return logout;

	}


}
