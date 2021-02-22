package com.bhiman.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bhiman.main.masters.Enquiry;

public class BaseTest {
	
	public Enquiry enquiry;

	
	@BeforeMethod
	public void setUp() {
		enquiry = new Enquiry();
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}
