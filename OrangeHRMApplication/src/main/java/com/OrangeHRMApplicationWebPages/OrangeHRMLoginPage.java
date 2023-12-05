package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMLoginPage extends BaseTest{
	// It is an "Object Repository" Class
	public OrangeHRMLoginPage() // This is called as a constructor-when a class name is similar to method name
	{
		PageFactory.initElements(driver, this);
	}

	//id="logInPanelHeading"
	//@FindBy is an annotation of POM, used to locate an element
	
	//1. Identifying the Element in the WebPage
	@FindBy(id="logInPanelHeading")
	WebElement LoginPanel;
	
	///html/body/div[1]/div/div[2]/div[1]/img
	
	@FindBy(xpath ="html/body/div[1]/div/div[2]/div[1]/img")
	WebElement orangrHRMApplicationLoginPageLogo;
	
	//<input name="txtUsername" id="txtUsername" type="text">
	@FindBy(id="txtUsername")
	WebElement userName;
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	@FindBy(id="txtPassword")
	WebElement password;
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	@FindBy(className="button" )
	WebElement orangeHRMApplicationLoginFunctionality;
	///html/body/div[1]/div/div[2]/div[2]/div[1]/svg/switch/g/circle[2]
	///html/body/div[1]/div/div[2]/div[2]/div[1]/svg/switch/g/circle[2]
	//@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/svg/switch/g/circle[2]")
	//WebElement orangeHRMApplicationCircleLogo;
	
	
	
	//<a href="/symfony/web/index.php/auth/requestPasswordResetCode">Forgot your password?</a>
	 //locator of WebDriver - linkText / partialLinkText
		// selector should be the text of the link -Forgot your password?
	@FindBy(linkText = "Forgot your password?")
		WebElement orangeHRMApplicationForgotPasswordFunctionality;
	
	//<a href="http://www.orangehrm.com" target="_blank">OrangeHRM, Inc</a>
	 //locator of WebDriver - linkText / partialLinkText
	// selector should be the text of the link - OrangeHRM, Inc
	@FindBy(linkText ="OrangeHRM, Inc" )
	WebElement orangeHRMApplicationOrangeHRMIncFunctionality;
	
	//<a href="http://www.linkedin.com/groups?home=&amp;gid=891077" target="_blank">
	   // <img src="/symfony/web/webres_6494368c2feec6.62592824/themes/default/images/login/linkedin.png" 
	   // alt="LinkedIn OrangeHRM group"></a>
		
		///html/body/div[1]/div/div[4]/div[2]/a[1]/img
	    ///html/body/div[1]/div/div[4]/div[2]/a[1]
		@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[1]")
		WebElement orangeHRMLoginPageLinkedin;
		
		//<img src="/symfony/web/webres_6494368c2feec6.62592824/themes/default/images/login/facebook.png" 
		//alt="OrangeHRM on Facebook">
		
		///html/body/div[1]/div/div[4]/div[2]/a[2]/img
		///html/body/div[1]/div/div[4]/div[2]/a[2]
		@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[2]")
		WebElement orangeHRMLoginPageFacebook;
		
		///html/body/div[1]/div/div[4]/div[2]/a[3]/img
		///html/body/div[1]/div/div[4]/div[2]/a[3]
		@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[3]")
		WebElement orangeHRMLoginPagetwitter;
		
		///html/body/div[1]/div/div[4]/div[2]/a[4]/img
		///html/body/div[1]/div/div[4]/div[2]/a[4]
		@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[4]")
		WebElement orangeHRMLoginPageYouTube;
		
		
	
	//2. Performing an operation on the element
	public void ValidatingLoginPanelText()  //Bussiness Logic
	{
		
		String expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";
		Log.info("The Expected OrangeHRM Application Login Page Text is:-"+expected_OrangeHRMApplicationLoginPageText);
		
        String actual_OrangeHRMApplicationLoginPageText=LoginPanel.getText();
        Log.info("The Actual OrangeHRM Application Login Page Text is:-"+actual_OrangeHRMApplicationLoginPageText);
        
        if(actual_OrangeHRMApplicationLoginPageText.equals(expected_OrangeHRMApplicationLoginPageText))
        	
        {
        	Log.info("OrangeHRM Application is opened successfully-Pass");
        }
        else
        {
        	Log.info("OrangeHRM Application is not opened successfully-Fail");
        }
        
	}
	
	public void validatingLoginPageLogo()
	{
		boolean Flag=orangrHRMApplicationLoginPageLogo.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application LoginPage Contains Logo -Pass");
		}
		else
		{
			Log.info("OrangeHRM Application Login Page Does not Contain Logo-Fail ");
		}
	}
	
	public void validatingLoginFunctionality(String username,String passWord)
	{
	userName.sendKeys(username);
	password.sendKeys(passWord);
	orangeHRMApplicationLoginFunctionality.click();
	}
	
	/*public void validatingOrangeHRMApplicationCircleLogo()
	{
		boolean Flag=orangeHRMApplicationCircleLogo.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application Login Page Contains Circle Logo-Pass");
		}
		else
		{
			Log.info("OrangrHRM Application Login Page Does Not Contain Circle Logo-Fail");
		}
	
	}
	*/
	public void validatingOrangeHRMApplicationForgotPasswordFunctionality()
	{
		orangeHRMApplicationForgotPasswordFunctionality.click();
		Log.info("Forgot Password Functionality is working Suucessfully");
	}
	
	public void validatingOrangeHRMApplicationOrangeHRMIncFunctionality()
	{
		orangeHRMApplicationOrangeHRMIncFunctionality.click();
		Log.info("OrangeHRM,Inc link is working successfully");
	}
	
	public void validatingorangeHRMLoginPageLinkedin()
	{
		boolean Flag=orangeHRMLoginPageLinkedin.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application Login Page Contains Linkedin Image");
		}
		else
		{
			Log.info("OrangeHRM Application Login Page Does Not Contain Linkedin Image");
		}
		orangeHRMLoginPageLinkedin.click();
		
		
		Log.info("OrangeHRM Application Linkedin Link is Working Successfully");
	}
	
	public void validatingorangeHRMLoginPageFacebook()
	{
		boolean Flag=orangeHRMLoginPageFacebook.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application Login Page Contains Facebook Image");
		}
		else
		{
			Log.info("OrangeHRM Application Login Page Does Not Contain Facebook Image");
		}
		orangeHRMLoginPageFacebook.click();
		Log.info("OrangeHRM Application Facebook Link is Working Successfully");
	}
	public void validatingorangeHRMLoginPageTwitter()
	{
		boolean Flag=orangeHRMLoginPagetwitter.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application Login Page Contains Twitter Image");
		}
		else
		{
			Log.info("OrangeHRM Application Login Page Does Not Contain Twitter Image");
		}
		orangeHRMLoginPagetwitter.click();
		Log.info("OrangeHRM Application Twitter Link is Working Successfully");
	}
	
	public void validatingorangeHRMLoginPageYouTube()
	{
		boolean Flag=orangeHRMLoginPageYouTube.isDisplayed();
		if(Flag)
		{
			Log.info("OrangeHRM Application Login Page Contains YouTube Image");
		}
		else
		{
			Log.info("OrangeHRM Application Login Page Does Not Contain YouTube Image");
		}
		orangeHRMLoginPageYouTube.click();
		Log.info("OrangeHRM Application YouTube Link is Working Successfully");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
