package com.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_YourWishList_Click {
	WebDriver driver;
	String applicationUrlAddress="https://www.amazon.in/";
	public void applicationLaunch()
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe" );
	driver= new EdgeDriver();
	System.out.println("......Edge Browser Successfully Launched.......");
	//Navigating to Application
	driver.get(applicationUrlAddress);
	System.out.println(".....Amazon Application is Successfully Navigated......");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	// Hello SignIn Element-Mouse Hover Operation
	public void helloSignIn()
	{
	//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>	
	By helloSignInProperty=By.id("nav-link-accountList-nav-line-1");
	WebElement helloSignIn=driver.findElement(helloSignInProperty);
	System.out.println(",,,,,,,,Hello Sign In Element is Found,,,,,,,,");
	//Actions- It is Used to Perform Operations on Mouse and Keyboard
	Actions hellosignInMouseHover= new Actions(driver);
	//1. Where to Perform the Operation
	//2. What Operation Should be Performed
	hellosignInMouseHover.moveToElement(helloSignIn).build().perform();
	
	
	}
	
	public static void main(String[] args) {
	
		 Amazon_YourWishList_Click amazon= new  Amazon_YourWishList_Click();
		 amazon.applicationLaunch();
		 amazon.helloSignIn();
		amazon.WishListClick();
		 amazon.applicationClose();
	}
	public void WishListClick()
	{
		// "Your Wish List" - is an element of Type link
		// Locator - linkText / partialLinkText
		// selector - Your Wish List
		By wishListProperty=By.linkText("Your Wish List");
		 WebElement wishList=driver.findElement(wishListProperty);
		 wishList.click();
	}
	
	public void applicationClose()
	{
		driver.quit();
		System.out.println("The Application is Closed");
	}
	
	
	
	

}
