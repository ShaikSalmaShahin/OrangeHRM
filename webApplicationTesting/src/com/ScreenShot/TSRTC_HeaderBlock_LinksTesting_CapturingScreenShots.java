package com.ScreenShot;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HeaderBlock_LinksTesting_CapturingScreenShots{

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.get(applicationUrlAddress);
		//<div class="menu-wrap">
		
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		//Identifying properties of the Header Block Elements
		
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		By headerBlockElementsProperties=By.tagName("a");
		List<WebElement> headerBlockElements=tsrtc_HeaderBlock.findElements(headerBlockElementsProperties);
		int headerBlock_Count=headerBlockElements.size();		
		System.out.println("The count of the elements ont he tsrtc header block is "+headerBlock_Count);
		
		for(int linksIndex=0;linksIndex<headerBlock_Count;linksIndex++)
		{
			String headerBlockLinksName=headerBlockElements.get(linksIndex).getText();
			System.out.println(linksIndex+headerBlockLinksName);
			
			String expected_LinkPageCurrentUrlAddress=headerBlockElements.get(linksIndex).getAttribute("href");
			System.out.println(expected_LinkPageCurrentUrlAddress);
			headerBlockElements.get(linksIndex).click();
			String actual_LinkPageTitle=driver.getTitle();
			String actual_LinkPageCurrentUrlAddress=driver.getCurrentUrl();

			System.out.println(actual_LinkPageTitle);
			System.out.println(actual_LinkPageCurrentUrlAddress);

			if(actual_LinkPageCurrentUrlAddress.equals(expected_LinkPageCurrentUrlAddress))
			{
			System.out.println(" Url Address Matched - Successfully Navigated to Expected Link WebPage - PASS");
			}
			else
			{
			System.out.println(" Url Address NOT Matched - Failed to Navigat to Expected Link WebPage - FAIL");
			}

			System.out.println();
			File currentWebPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(currentWebPageScreenShot, new File("./TSRTC_HeaderBlockSceenShots/"+headerBlockLinksName+".png"));



			// since the driver focus is in the next webPage after click operation is done
//			    the driver object should be shifted to the previous WebPage
			driver.navigate().back();

			// Identifying the Header Block again
			tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
			// Of the Header Block finding all the Elements and saving back into arrayList
			headerBlockElements=tsrtc_HeaderBlock.findElements(headerBlockElementsProperties);
			
		}
		
		driver.quit();		
		
		
		
	}
}
