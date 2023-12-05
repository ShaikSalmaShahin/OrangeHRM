package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@Test(priority=1,description="Validating Gmail Apllication Login Page")
	public void gmailApplicatioLoginTest()
	{
		System.out.println("Gmail Applicatin Login Page is Successfully Launched");
	}
	@Test(priority=2,description="Validating Gmail Application InBox Page")
	public void GmailApplicationInBoxTest()
	{
		System.out.println("Gmail Application InBox Page is Successfully Launched");
	}
	@BeforeTest
public void gmailApplicationLaunch()
{
	System.out.println("Gmail Application is Successfully Launched");
}
	@AfterTest
public void gmailApplicationClose()
{
	System.out.println("Browser Along With Gmail Application is Successfully Closed ");
	
}
}
