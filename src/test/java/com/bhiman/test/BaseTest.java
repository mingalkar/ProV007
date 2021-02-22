package com.bhiman.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.bhiman.main.UIKeywords;

/**
 * Contains setUp {@BeforeMethod} and tearDown {@AfterMethod} annotated methods compulsorily required 
 * to run before & after every @Test annotated Test cases.
 * 
 * @author Dharmik Mehta
 */
public class BaseTest extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(BaseTest.class);
	@BeforeMethod
	public void setUp() {
		UIKeywords.opnBrowser("Chrome");
		UIKeywords.openUrl("http://103.50.162.196/testing/user-login.php");
	}
	
	@AfterMethod
	public void tearDown() {
		UIKeywords.closeAllBrowser();
	}
}