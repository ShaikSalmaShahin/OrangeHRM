package com.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web";

	public void setup()
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
	driver= new EdgeDriver();

	System.out.println(" *** Edge Browser Launched Successfully *****");

	driver.get(applicationUrlAddress);
	System.out.println(" Sucessfully Navigated to TSRTC Appliction ");
	}

	public void tearDown()
	{
	driver.quit();
	System.out.println(" **** Edge Browser along with Application is Closed Successfully ***** ");
	}

}

