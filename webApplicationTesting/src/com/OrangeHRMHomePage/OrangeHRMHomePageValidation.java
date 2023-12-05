package com.OrangeHRMHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMHomePageValidation {
	WebDriver driver;
	String applicationUrlAddress="http://orangehrm.qedgetech.com ";
	public void applicationLaunch()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.get(applicationUrlAddress);
			}
	public void applicationLogin()
	{
		//<input name="txtUsername" id="txtUsername" type="text">
				By userNameProperty=By.id("txtUsername");
				WebElement userName=driver.findElement(userNameProperty);
				userName.sendKeys("Admin");
				// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				By passwordProperty=By.id("txtPassword");
				WebElement password=driver.findElement(passwordProperty);
				password.sendKeys("Qedge123!@#");
				// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN"> 
				By loginProperty=By.id("btnLogin");
				WebElement login=driver.findElement(loginProperty);
				login.click();
			}
	
	public void applicationHomePage()
	{
		
	}
	
	
	
public static void main(String[] args) {
	OrangeHRMHomePageValidation homePage = new OrangeHRMHomePageValidation();
	homePage.applicationLaunch();
	homePage.applicationLogin();
	
}	
	
	

}
