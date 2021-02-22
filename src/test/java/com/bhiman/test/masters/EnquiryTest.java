package com.bhiman.test.masters;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.test.BaseTest;

public class EnquiryTest extends BaseTest {
	
	@Test
	public void userShouldAbleToAddEnquiry(){
		enquiry.addEnquiry("Fareen", 123456789, "Visit", "Client");
		Assert.assertEquals(enquiry.savedUser.getText(), "Fareen");
		// mobile number assert
		
		// purpose assert
		
		// reference assert
	}
}
