package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDetails {
	//<input name="txtUsername" id="txtUsername" type="text">
			@FindBy(id="txtUsername")
			WebElement userName;
			
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			@FindBy(id="txtPassword")
			WebElement password;
			
			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			@FindBy(className="button" )
			WebElement orangeHRMApplicationLoginFunctionality;
	
	public void loginPageLoginDetails(String username,String passWord)
	{
		
		
		userName.sendKeys(username);
		password.sendKeys(passWord);
		orangeHRMApplicationLoginFunctionality.click();
	}

}
