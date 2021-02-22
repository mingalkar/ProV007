package com.bhiman.main.masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enquiry {

	// locators
	@FindBy(id = "name")
	public WebElement username;
	
	@FindBy(xpath = "//*[@id='datatable3']//tr[1]/td[2]")
	public WebElement savedUser;
	
	
	// public methods
	public void addEnquiry(String name, int mobileNumber, String purpose, String reference){
		// click on enquiry button
		
		// enter name
		username.sendKeys(name);
		
		// enter mobile number
		
		// enter purpose
		
		// enter reference
		
		// click on subimt button
	}
}
