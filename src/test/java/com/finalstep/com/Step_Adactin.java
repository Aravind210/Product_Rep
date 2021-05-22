package com.finalstep.com;

import org.openqa.selenium.WebDriver;

import com.base.com.Baseclass;
import com.finaladact.helper.File_Reader_Manager;
import com.finaladact.helper.Pom_Object_Manager;
import com.finalrunner.com.Runner_Adactin;
import com.pom.com.Book_Hotel;
import com.pom.com.Login_Hotel;
import com.pom.com.Logout_Hotel;
import com.pom.com.Search_Hotel;
import com.pom.com.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Adactin extends Baseclass {
	
	public static WebDriver driver=Runner_Adactin.driver;
	
	public static Pom_Object_Manager pom=new Pom_Object_Manager(driver);
	

	@Given("^Enter The Url$")
	public void enter_The_Url() throws Throwable {
		
		Thread.sleep(5000);
		
		//Startlink("https://adactinhotelapp.com/");
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().openurl();
		
		Startlink(url);
		
	}
	
	@When("^User Enter The \"([^\"]*)\" In the Username Field$")
	public void user_Enter_The_In_the_Username_Field(String username) throws Throwable {
		
	    Passvalues(pom.getInstanceLogin().getUname(), username);
	   
	}

	@When("^User Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		
	   Passvalues(pom.getInstanceLogin().getPword(), password);
	    
	}
	

//	@When("^User Enter The Username In the Username Field$")
//	public void user_Enter_The_Username_In_the_Username_Field() throws Throwable {
//		
//		 Impliciteresponse();
//		 
//		 Passvalues(pom.getInstanceLogin().getUname(), "Aravind12");
//		 
//		//Passvalues(login.getUname(), "Aravind12");
//	    
//	}
//
//	@When("^User Enter The Password In The Password Field$")
//	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
//		
//		Passvalues(pom.getInstanceLogin().getPword(), "aravind12");
//		
//	   // Passvalues(login.getPword(), "aravind12");
//	    
//	}

	@Then("^User Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		
		Tapon(pom.getInstanceLogin().getEnter());
		
	   // Tapon(login.getEnter());
	    
	    
	}

	@When("^User Select The Location in the Location Field$")
	public void user_Select_The_Location_in_the_Location_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getLocation(), "text", "Sydney");
		
	    //Ddselectivt(search.getLocation(), "text", "Sydney");
	   
	}

	@When("^User Select The Hotel Name In the Hotel Field$")
	public void user_Select_The_Hotel_Name_In_the_Hotel_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getHotel(), "text", "Hotel Sunshine");
		
	    //Ddselectivt(search.getHotel(), "text", "Hotel Sunshine");
	   
	}

	@When("^User Select The Room Type In The Room Type Field$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getRoomtype(), "text", "Standard");
		
	   // Ddselectivt(search.getRoomtype(), "text", "Standard");
	   
	}

	@When("^User Select The Number Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getRoomno(), "value", "2");
		
		
	   // Ddselectivt(search.getRoomno(), "value", "2");
	    
	}

	@When("^User Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		
		Passvalues(pom.getInstanceSearch().getIndate(), "16/5/2021");
		
		
	   // Passvalues(search.getIndate(), "15/5/2021");
	   
	}

	@When("^User Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		
		Passvalues(pom.getInstanceSearch().getOutdate(), "18/5/2021");
		
		
	 // Passvalues(search.getOutdate(), "17/5/2021");
	    
	}

	@When("^User Enetr The Adults Per Room Detail In Adults Per Room Field$")
	public void user_Enetr_The_Adults_Per_Room_Detail_In_Adults_Per_Room_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getAdult(), "value", "2");
		
		
	    //Ddselectivt(search.getAdult(), "value", "2");
	    
	}

	@When("^User Enter The Children Per Room Detail In Children Per Room Field$")
	public void user_Enter_The_Children_Per_Room_Detail_In_Children_Per_Room_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceSearch().getChild(), "value", "1");
		
	   // Ddselectivt(search.getChild(), "value", "1");
	   
	}

	@Then("^User Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		
		Tapon(pom.getInstanceSearch().getSubmit());
		
	   // Tapon(search.getSubmit());
	    
	}
	
	@When("^User Select The Hotel Details In Select Field$")
	public void user_Select_The_Hotel_Details_In_Select_Field() throws Throwable {
		
		Tapon(pom.getInstanceSelect().getSelect());
		
	    //Tapon(select.getSelect());
	    
	}

	@Then("^User click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		
		Tapon(pom.getInstanceSelect().getSubmit());
		
	  //Tapon(select.getSubmit());
	    
	}

	@When("^User Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		
		Passvalues(pom.getInstanceBook().getFname(), "Aravind");
		
	   // Passvalues(book.getFname(), "Aravind");
	    
	}

	@When("^User Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		
		Passvalues(pom.getInstanceBook().getLname(), "Paramasivam");
		
	   //Passvalues(book.getLname(), "Paramasivam");
	    
	}

	@When("^User Enter the Billing Address In The Billing Address Field$")
	public void user_Enter_the_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		
		Passvalues(pom.getInstanceBook().getBillingadd(),"Trichy");
		
	    //Passvalues(book.getBillingadd(), "Trichy");
	}

	@When("^User Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		
		Passvalues(pom.getInstanceBook().getCardno(), "2222333344445555");
		
	  // Passvalues(book.getCardno(), "1111222233334444");
	    
	}

	@When("^User Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceBook().getCardtype(), "text", "VISA");
	    
		//Ddselectivt(book.getCardtype(), "text", "VISA");
	    
	}

	@When("^User Select The Expiry Date In The Select Date Field$")
	public void user_Select_The_Expiry_Date_In_The_Select_Date_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceBook().getMonth(), "text", "February");
		
	    //Ddselectivt(book.getMonth(), "text", "February");
	    
	}

	@When("^User Select The Expiry Year In The Select Year Field$")
	public void user_Select_The_Expiry_Year_In_The_Select_Year_Field() throws Throwable {
		
		Ddselectivt(pom.getInstanceBook().getYear(), "text", "2022");
		
	   //Ddselectivt(book.getYear(), "text", "2022");
	    
	}

	@When("^User Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		
		Passvalues(pom.getInstanceBook().getCvvnumber(), "789");
		
	   // Passvalues(book.getCvvnumber(), "321");
	    
	}

//	@Then("^User Click The Book Now Button And It Navigates To Booked Itinerary$")
//	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booked_Itinerary() throws Throwable {
//		
//	      Tapon(pom.getInstanceBook().getBooking());
//		
//	    //Tapon(book.getBooking());
	    
//	}
	
	@Then("^User Click The Book Now Button And It Navigates To Logout$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Logout() throws Throwable {
		
		Tapon(pom.getInstanceLogout().getExit());
		
		
	   
	}


		

}
