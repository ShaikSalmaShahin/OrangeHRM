package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="http://orangehrm.qedgetech.com ";
@BeforeTest
	public void setup()
	{
		//Automating Edge Browser
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\MyMavenProject\\BrowserDriverFiles\\msedgedriver.exe");
	driver= new EdgeDriver();

	//System.out.println(" *** Edge Browser Launched Successfully *****");
    Log.info(" *** Edge Browser Launched Successfully *****");
    
    //Navigating to OrangeHRM Application
	driver.get(applicationUrlAddress);
	
	//System.out.println(" Sucessfully Navigated to OrangeHRM Appliction ");
	
	Log.info("Sucessfully Navigated to OrangeHRM Appliction ");
	
	//its a timeout related to the application webpage to be loaded on to the browser
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	//Element to be identified with the given property
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//To Maximise the Browser
	driver.manage().window().maximize();
	}
	
	
@AfterTest
	public void tearDown()
	{
	driver.quit();
	
	//System.out.println(" **** Edge Browser along with Application is Closed Successfully ***** ");
	
	Log.info(" **** Edge Browser along with Application is Closed Successfully ***** ");
	}




}
