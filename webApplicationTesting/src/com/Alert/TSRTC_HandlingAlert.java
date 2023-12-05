package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TSRTC_HandlingAlert extends BaseTest {

public void checkAvailabilityTest()
{
	//<input type="button" name="searchBtn" id="searchBtn" 
	//class="chkavailabilityBtn" value="Check Availability"
	//title="Search"onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
	
	By checkAvailabilityProperty=By.id("searchBtn");
	WebElement checkAvailability= driver.findElement(checkAvailabilityProperty);
	checkAvailability.click();
	}

public void handlingAlert() throws InterruptedException
{
	Thread.sleep(5000);
	Alert alertWindow=driver.switchTo().alert();
	 String expected_Alert="please select start place.";
	 System.out.println("The Expected Alert is "+expected_Alert );
	 String actual_Alert=alertWindow.getText();
	 System.out.println("The Actual Alert is "+ actual_Alert);
	 if(actual_Alert.equals(expected_Alert))
	 {
		 System.out.println("Navigated to Alert Window-Pass");
	 }
	 else
	 {
		 System.out.println("Failed to Navigate to Alert Window-Fail");
		 
	 }
	 alertWindow.accept();
	 //alertWindow.dismiss();
	 //alertWindow.sendKeys();
	 
	 }
public static void main(String[] args) throws InterruptedException {
	TSRTC_HandlingAlert alert = new TSRTC_HandlingAlert();
	alert.setup();
	alert.checkAvailabilityTest();
	alert.handlingAlert();
	alert.tearDown();
}
}
