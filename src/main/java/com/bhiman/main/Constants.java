package com.bhiman.main;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import ru.yandex.qatools.ashot.AShot;

public class Constants {
	public static WebDriver driver;
	public static WebElement element;
	public static Actions action;
	public static Object obj;

	public static List<String> expectedList;
	public static ArrayList<String> actualList;
	public static boolean isDisplay;
	public static String actual;
	public static String expected;

	public static Logger logger;

	public static AShot ashot;

	
}
