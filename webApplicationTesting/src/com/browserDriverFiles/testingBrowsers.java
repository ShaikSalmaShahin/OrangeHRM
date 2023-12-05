package com.browserDriverFiles;

import org.openqa.selenium.edge.EdgeDriver;

public class testingBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","./browserdriverfiles/msedgedriver.exe" );

EdgeDriver testing = new EdgeDriver();
testing.navigate().to("http://bing.com");
String expected_BingHomePageTitle="Bing";
System.out.println(expected_BingHomePageTitle);
testing.close();

	}

}
