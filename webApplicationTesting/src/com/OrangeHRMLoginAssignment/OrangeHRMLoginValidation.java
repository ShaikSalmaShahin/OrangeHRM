package com.OrangeHRMLoginAssignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMLoginValidation {
	public static void main(String[] args) throws IOException {
	WebDriver driver;	
	String applicationUrlAddress="http://orangehrm.qedgetech.com ";	
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
	 driver= new EdgeDriver();
	 
	 driver.get(applicationUrlAddress);
	 //Validation of OrangeHRM LoginPage
	 //1. Title of the LogIn Page - should be "OrangeHRM"
	String expected_OrangeHRMTitle="OrangeHRM";
	System.out.println("The Expected Title is:-"+expected_OrangeHRMTitle);
	String actual_OrangeHRMTitle=driver.getTitle();
	System.out.println("The Actual Titleis:-"+actual_OrangeHRMTitle);
	if(actual_OrangeHRMTitle.equals(expected_OrangeHRMTitle))
	{
		System.out.println("The OrangeHRM Title is Matched-Pass");
	}
	else
	{
		System.out.println("The OrangeHRM Title is Not Matched-Fail");
	
	}
	//2. Url Address - should have "orangehrm"	
	String expected_OrangeHRMUrl="orangehrm";
	System.out.println("The Expected OrangeHRM Url is:-"+expected_OrangeHRMUrl);
	
	String actual_OrangeHRMUrl=driver.getCurrentUrl();
	System.out.println("The Actual OrangeHRM Url is:-"+actual_OrangeHRMUrl);
	if(actual_OrangeHRMUrl.contains(expected_OrangeHRMUrl))
	{
		System.out.println("The OrangeHRM Url is Matched-Pass");

	}
	else
	{
		System.out.println("The OrangeHRM Url is Not Matched-Fail");

	}
		
	//3. Expected Text - LOGIN Panel
	//<div id="logInPanelHeading">LOGIN Panel</div>
	String expected_OrangeHRMLoginPanelHeading="LOGIN Panel";
	System.out.println("The Expected OrangeHRM Login Panel Heading is :-"+ expected_OrangeHRMLoginPanelHeading);
	
By loginpanelproperty=By.id("logInPanelHeading");
WebElement loginpanelElement=driver.findElement(loginpanelproperty);
String actual_OrangeHRMLoginPanelHeading=loginpanelElement.getText();
	System.out.println("The Actual OrangeHRM Login Panel Heading is :-"+ actual_OrangeHRMLoginPanelHeading);
	
	if( actual_OrangeHRMLoginPanelHeading.equalsIgnoreCase(expected_OrangeHRMLoginPanelHeading))
	{
		System.out.println("The OrangeHRM Login panel Heading is Matched-Pass");
	
	}
	else
	{
		System.out.println("The OrangeHRM Login panel Heading is Not Matched-Fail");

	}
	
	FileInputStream testDataFile = new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\OrangeHRMLoginValidation\\OrangeHRMLoginValidation.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
	 
	 
	 
		 XSSFRow dataRows=testDataSheet.getRow(1);
       	XSSFCell datarowofcells=dataRows.getCell(0); 
		    String testData=datarowofcells.getStringCellValue();
		    System.out.print(testData+" ");
		    System.out.println();
		    //<input name="txtUsername" id="txtUsername" type="text">
		    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		    By userNameProperty=By.id("txtUsername");
		    WebElement userNameElement=driver.findElement(userNameProperty);
		    userNameElement.sendKeys(testData);
		    XSSFCell passwordcell=dataRows.getCell(1);
		    String passwordTestData=passwordcell.getStringCellValue();		    
		    
		    By passwordProperty=By.id("txtPassword");
		    WebElement passwordElement=driver.findElement(passwordProperty);
		    passwordElement.sendKeys(testData);
	
	 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
 	
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	


