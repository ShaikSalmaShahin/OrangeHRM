package com.TSRTC;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//automating edge browser
		//WebDriver driver;
		String applicationaddress="https://www.tsrtc.telangana.gov.in/";
System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
  driver=new EdgeDriver();
 // Navigating to TSRTC browser
 driver.get(applicationaddress);
 //<a href="">ABOUT US</a>
 //locator of webdriver- linktext/partial link text
 //selector-should be text of link-ABOUT US
 By aboutusproperty= By.linkText("ABOUT US");
 WebElement aboutus=driver.findElement(aboutusproperty);
 aboutus.click();
 //getting number of links from the tsrtc website
 //Whenever we work on group of similar type of Elements- look for a common property existing in the elements properties
 
 //The common property which is found in group of similar type of elements-link is anchor tag
 By linksCommonProperty=By.tagName("a");
 List<WebElement>salma=driver.findElements(linksCommonProperty);
 int tsrtc_HomePage_Count=salma.size(); 
 System.out.println("the number of links on the tsrtc application home page are:-"+tsrtc_HomePage_Count);
 driver.quit();
	}

}
