package com.bhiman.main;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	private static Logger LOG = Logger.getLogger(UIKeywords.class);
		
	/**
	 * Launch specified web browser. Only @browserName as chrome, firefox, edge, ie and opera are allowed.
	 * Others are not allowed.
	 * 
	 * @param browserName as {@code String}. 
	 */	
		public static void opnBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			LOG.info("Opening chrome Browse");
			WebDriverManager.chromedriver().setup();
			Constants.driver = new ChromeDriver();
			break;
		case "Firefox":
			LOG.info("Opening Firefox Browse");
			WebDriverManager.firefoxdriver().setup();
			Constants.driver = new FirefoxDriver();
			break;
		case "Edge":
			LOG.info("Opening Edge Browse");
			WebDriverManager.edgedriver().setup();
			Constants.driver = new EdgeDriver();
			break;
		case "IE":
			LOG.info("Opening Internet Explorer Browse");
			WebDriverManager.iedriver().setup();
			Constants.driver = new InternetExplorerDriver();
			break;
		case "Opera":
			LOG.info("Opening Opera Browse");
			WebDriverManager.operadriver().setup();
			Constants.driver = new OperaDriver();
			break;
		default:
			LOG.info("Invalid browser name: "+browserName+".\nExpected: 'chrome','firefox','edge','ie','opera'.");
			break;
		}
	}
		
		/**
		 * Close the current browser window, or last browser window associated with this driver.
		 */
		public static void closeBrowser() {
			Constants.driver.close();
		}

		/**
		 * Close all browser window associated with this driver.
		 */
		public static void closeAllBrowser() {
			Constants.driver.quit();
		}
	
	/**
	 * @return driver instance if browser is open else return null {@code}
	 */
	public static WebDriver getdriver() {
		if(Constants.driver.equals(null)) {
			throw new NullPointerException("driver instance is not initilised ");
		}
		return Constants.driver;
	}
	
	/**
	 * this method is used to get current URL
	 * @param Url 
	 */
	public static void openUrl(String url) {
		LOG.info("Launching App url");
		Constants.driver.get(url);
	}
	/**
	 * use this method for click on Radio button,check box,button or link
	 * @param element
	 */
	public static void clickOnElement(WebElement element) {
		LOG.info("Click on webelemwnt");
		element.click();
	}
	
	/**
	 * @param by using this method click on Web Element
	 */
	public static void clickOnElement(By by) {
		LOG.info("click on web element");
		Constants.driver.findElement(by).click();
	}

	public static void enterText(WebElement element, String text) {
		LOG.info("find element and send keys");
		element.sendKeys(text);
	}
	/**
	 * 
	 * @param by use to find Web Element (by css, by Xpath, by id, by Text etc.)
	 * @param text use this for send text or key.
	 */
	public static void enterText(By by, String text) {
		LOG.info("find by and send keys");
		Constants.driver.findElement(by).sendKeys(text);
	}
		
	/**
	 * @param by use only for element selection
	 * @return 
	 */
	public static WebElement selectElement(By by) {
		LOG.info("Select Element");
		Constants.driver.findElement(by);
		return Constants.element;
	}
	
	/**
	 * this method is use for Window maximization 
	 */
	public static void maximizeWindow() {
		LOG.info("To maximize window");
		Constants.driver.manage().window().maximize();
	}	
}