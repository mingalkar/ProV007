package com.bhiman.main;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class UIKeywords {
	private static Logger LOG = Logger.getLogger(UIKeywords.class);
	private static final WebElement WebElement = null;
	/**
	 * Use this method to open Specified Browser
	 */
	public void opnBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			LOG.info("Opening chrome Browse");
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;
		case "firefox":
			LOG.info("Opening Firefox Browse");
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			break;	
		default:
			System.out.println("Invaild Browser Name :");
			break;
		}

	}
	/**
	 * @return driver instance if browser is open else return null {@code}
	 */
	public WebDriver getdriver() {
		if(Constants.driver.equals(null)) {
			throw new NullPointerException("driver instance is not initilised ");
		}
		return Constants.driver;
		

	}
	/**
	 * this method is used to get current URL
	 * @param Url 
	 */
	public void geturl(String url) {
		LOG.info("Launching App url");
		Constants.driver.get(url);

	}
	/**
	 * use this method for click on Radio button,check box,button or link
	 * @param element
	 */
	public void click(WebElement element) {
		LOG.info("Click on webelemwnt");
		element.click();

	}
	
	public void enterText(WebElement element, String text) {
		LOG.info("find element and send keys");
		element.sendKeys(text);

	}
	/**
	 * 
	 * @param by use to find Web Element (by css, by Xpath, by id, by Text etc.)
	 * @param text use this for send text or key.
	 */
	public void enterText(By by, String text) {
		LOG.info("find by and send keys");
		Constants.driver.findElement(by).sendKeys(text);

	}
	/**
	 * @param by using this method click on Web Element
	 */
	public void click(By by) {
		LOG.info("click on web element");
		Constants.driver.findElement(by).click();
		

	}
	/**
	 * @param by use only for element selection
	 * @return 
	 */
	public WebElement selectElement(By by) {
		LOG.info("Select Element");
		Constants.driver.findElement(by);
		return WebElement;
	}
	/**
	 * this method is use for Window maximization 
	 */
	public void ToMaximizeWindow() {
		LOG.info("To maximize window");
		Constants.driver.manage().window().maximize();
	}
	
}
	