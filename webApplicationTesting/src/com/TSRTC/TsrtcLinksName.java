package com.TSRTC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TsrtcLinksName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//automating edge browser
		//WebDriver driver;
		String applicationaddress="https://www.tsrtconline.in/oprs-web/";
System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
  driver=new EdgeDriver();
 // Navigating to TSRTC browser
 driver.get(applicationaddress);
 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 //<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
 //locator of WebDriver- Linktext/partial link text
 //selector-should be text of link-Enquiry
 By EnquiryPROPERTY= By.linkText("Enquiry");
 WebElement Enquiry=driver.findElement(EnquiryPROPERTY);
 Enquiry.click();
 //getting number of links from the tsrtc website
 //Whenever we work on group of similar type of Elements- look for a common property existing in the elements properties
 
 //The common property which is found in group of similar type of elements-link is anchor tag
 By linksCommonProperty=By.tagName("a");
 List<WebElement>salma=driver.findElements(linksCommonProperty);
 int tsrtc_HomePage_Count=salma.size(); 
 System.out.println("the number of links on the tsrtc application home page are:-"+tsrtc_HomePage_Count);
 for(int index=0;index<tsrtc_HomePage_Count;index++)
 {	 
 String tsrtc_homepage_linksname=salma.get(index).getText();
 System.out.println(tsrtc_homepage_linksname); 
  }
 
 
 
 
 
 
 
 //driver.quit();
	}

}
