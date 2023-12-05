package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseTest.BaseTest;
import com.Utility.Log;



public class OrangeHRMHomePage extends BaseTest{
	///html/body/div[1]/div[1]/a[1]/img

	@FindBy(xpath="/html/body/div[1]/div[1]/a[1]/img")
	WebElement orangeHRMLogo;
	
	///html/body/div[1]/div[2]/ul/li[1]/a/b
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[1]/a/b")
	WebElement homePageAdmin;
	//<span class="quickLinkText">Apply Leave</span>
	@FindBy(className="quickLinkText")
	WebElement homePageApplyLeave;



public void validationofOrangeHRMApplicationHomePageLogo()
{
	
	boolean Flag=orangeHRMLogo.isDisplayed();
	if(Flag)
	{
		Log.info("OrangeHRM Application Home Page Contains Logo-Pass");
	}
	else
	{
		Log.info("OrangeHRM Application Home Page Does not Contain Logo-Fail");
	
	}
}


}
















