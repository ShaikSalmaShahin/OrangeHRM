package com.google;

import org.openqa.selenium.edge.EdgeDriver;

public class Googlenavigating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
EdgeDriver google = new EdgeDriver();
google.get("http://google.com");
String expected_googleHomePageTitle="google";
System.out.println(expected_googleHomePageTitle);
String actual_googleHomePageTitle=google.getTitle();
System.out.println(actual_googleHomePageTitle);
if(actual_googleHomePageTitle.equals(expected_googleHomePageTitle))
{
	System.out.println("The Title of the google home page is Matched-Pass");

}
else
{
	System.out.println("The Title of the google home page is Not Matched-Fail");
}
google.close();
	}

}
