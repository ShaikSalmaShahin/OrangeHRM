package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HeaderBlockLinkTesting {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationURLaddress="https://www.tsrtconline.in/oprs-web/";
//Automate the Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
		 driver=new EdgeDriver();
	//Navigate to TSRTC HomePage	 
	driver.get(applicationURLaddress);	
	//Identify the Header Block of the WebPage
	//<div class="menu-wrap"
	By HeaderBlockProperty=By.className("menu-wrap");
	WebElement HeaderBlock=driver.findElement(HeaderBlockProperty);
	By HeaderBlockLinksproperty=By.tagName("a");
	List<WebElement>HeaderBlocklinks=HeaderBlock.findElements(HeaderBlockLinksproperty);
	int HeaderBlockCount=HeaderBlocklinks.size();
	System.out.println(HeaderBlockCount);
	for(int index=0;index<HeaderBlockCount;index++)
	{
		String HeaderBlockLinksText=HeaderBlocklinks.get(index).getText();
		System.out.println(HeaderBlockLinksText);
	}
	
	
	
	
	
		}
	

}
