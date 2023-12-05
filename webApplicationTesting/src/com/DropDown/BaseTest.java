package com.DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";

	public void setup()
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
	driver= new EdgeDriver();

	System.out.println(" *** Edge Browser Launched Successfully *****");

	driver.get(applicationUrlAddress);
	System.out.println(" Sucessfully Navigated to Osmania Appliction ");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	public void tearDown()
	{
	driver.quit();
	System.out.println(" **** Edge Browser along with Application is Closed Successfully ***** ");
	}


}
