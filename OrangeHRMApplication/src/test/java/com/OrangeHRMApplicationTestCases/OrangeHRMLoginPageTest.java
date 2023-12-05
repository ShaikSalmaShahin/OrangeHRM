package com.OrangeHRMApplicationTestCases;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMLoginPage;

public class OrangeHRMLoginPageTest extends BaseTest{
	
	@Test(priority=1,description="Validating Login Page Login Panel Text")
	public void validatingLoginPanelTextTest ()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.ValidatingLoginPanelText();
	}
	@Test(priority=2,description="Validating Login Page Login Panel Text")
	public void validatingLoginPageLogoTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingLoginPageLogo();
	}
	@Test(priority=3,description="Validating Login Page Login Functionality")
	public void validatingLoginFunctionalityTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingLoginFunctionality("Admin", "Qedge123!@#");
	}
	/*@Test(priority=4,description="Validating Login Page Circle Logo")
	public void validatingOrangeHRMApplicationCircleLogoTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingOrangeHRMApplicationCircleLogo();
	}
	*/
	@Test(priority=5,description="Validating Login Page Forgot Password Functionality")
	public void validatingOrangeHRMApplicationForgotPasswordFunctionalityTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingOrangeHRMApplicationForgotPasswordFunctionality();
	}
	@Test(priority=6,description="Validating Login Page OrangeHRMInc Functionality")
	public void validatingOrangeHRMApplicationOrangeHRMIncFunctionalityTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingOrangeHRMApplicationOrangeHRMIncFunctionality();
	}
	@Test(priority=7,description="Validating Login Page Linkedin Image and Link")
	public void validatingorangeHRMLoginPageLinkedinTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingorangeHRMLoginPageLinkedin();
	}
	@Test(priority=8,description="Validating Login Page Facebook Image and Link")
	public void validatingorangeHRMLoginPageFacebookTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingorangeHRMLoginPageFacebook();
	}
	@Test(priority=9,description="Validating Login Page Twitter Image and Link")
	public void validatingorangeHRMLoginPageTwitterTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingorangeHRMLoginPageTwitter();
	}
	@Test(priority=10,description="Validating Login Page YouTube Image and Link")
	public void validatingorangeHRMLoginPageYouTubeTest()
	{
		OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage();
		loginPage.validatingorangeHRMLoginPageYouTube();
	}
	
	
	

}
