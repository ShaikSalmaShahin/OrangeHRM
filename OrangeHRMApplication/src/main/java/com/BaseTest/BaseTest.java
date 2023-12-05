package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="http://orangehrm.qedgetech.com ";
@BeforeMethod
	public void setup()
	{
	//Automating EdgeBrowser
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\OrangeHRMApplication\\BrowserDriverFiles\\msedgedriver.exe");
	driver= new EdgeDriver();

	//System.out.println(" *** Edge Browser Launched Successfully *****");
	
    Log.info(" *** Edge Browser Launched Successfully *****");
    //Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	//System.out.println(" Sucessfully Navigated to OrangeHRM Appliction ");
	
	Log.info("Sucessfully Navigated to OrangeHRM Appliction ");
	//its a timeout related to the application webpage to be loaded on the browser
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	// Elements to be identified with the given property
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//To maximise the browser
	driver.manage().window().maximize();
	}


@AfterMethod
	public void tearDown()
	{
	
	driver.quit();
	//System.out.println(" **** Edge Browser along with Application is Closed Successfully ***** ");
	Log.info(" **** Edge Browser along with OrangeHRM Application is Closed Successfully ***** ");
	}



}
