package com.OrangeHRMLogin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;




public class OrangeHRMLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://orangehrm.qedgetech.com ";

		// Automating Edge Browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("  Successfully launched Edge Browser ");

		//Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Successfully navigated to OrangeHRM Application ");
		

		// Validating OrangeHRM Application LogIn Page

		// Identifying UserName Element on the WebPage
		// identifying  Properties of UserName Element -  inspecting
		//<input name="txtUsername" id="txtUsername" type="text">
		// id - locator
		// txtUsername - selector

		// driver.findElement(By.id("txtUsername")).sendKeys("salma");

		FileInputStream oHRMUserNameFile= new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\OrangeHRMLoginExcelFile\\OrangeHRMLogin.xlsx");		
		XSSFWorkbook workbook = new XSSFWorkbook(oHRMUserNameFile);
		XSSFSheet oHRMSheet= workbook.getSheet("Sheet1");
		XSSFRow oHRMRow=oHRMSheet.getRow(1);
		XSSFCell userNameRowOfCell=oHRMRow.getCell(0);
		 String userNameTestData=userNameRowOfCell.getStringCellValue();		
		
	   // String userNameTestData="Admin";
	 // Identifying the property of an element
		By userNameProperty=By.id("txtUsername"); 
		// finding an element with the property in the current webpage
		WebElement userName=driver.findElement(userNameProperty);

		// Operation should be performed on the element - userName
		userName.sendKeys(userNameTestData);

		// Identifying properties of Password Element
		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		//XSSFRow passwordRow=oHRMSheet.getRow(1);
		XSSFCell passwordRowOfCell=oHRMRow.getCell(1);
		 String passwordTestData=passwordRowOfCell.getStringCellValue();
		//String passwordTestData="Qedge123!@#";

		// identify the property of Password Element
		By passwordProperty=By.name("txtPassword");
		// identifying the element password with its property
		WebElement password=driver.findElement(passwordProperty);
		// Performing an operation on the WebElement Password
		password.sendKeys(passwordTestData);
		

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		String expected_OrangeHRMApplicationHomePageText="Welcome";
		System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Sureshganigani</a>
		By welcomesureshganiganiProperty=By.id("welcome");
		WebElement welcomeSureshganigani=driver.findElement(welcomesureshganiganiProperty);
		
		String actual_OrangeHRMApplicationHomePageText=welcomeSureshganigani.getText();
		System.out.println("The Actual Text of OrangeHRM Application HomePage is:-"+actual_OrangeHRMApplicationHomePageText);
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
			XSSFCell resultRowOfCell=oHRMRow.createCell(2);
			resultRowOfCell.setCellValue("succesfully login in to OrangeHRM Application-Pass");
			FileOutputStream testResult= new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\OrangeHRMLoginExcelFile\\OrangeHRMLoginresult.xlsx");
			workbook.write(testResult);
		}
	
		else
		
		{
		XSSFCell resultRowOfCell=oHRMRow.createCell(2);
		resultRowOfCell.setCellValue("Failed succesfully login in to OrangeHRM Application-Fail");
		FileOutputStream testResult= new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\OrangeHRMLoginExcelFile\\OrangeHRMLoginresult.xlsx");
		workbook.write(testResult);
		}
	}

}
