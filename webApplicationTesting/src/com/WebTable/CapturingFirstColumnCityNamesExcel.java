package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class CapturingFirstColumnCityNamesExcel extends BaseTest {
	public void capturingFirstColumnCityNames() throws IOException
	{
	// First Row of First Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]

	// Last Row of First Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

	String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String xpathExpressionPart2="]/td[1]";

	// To goto every Row of the Table
	for(int tableRowIndex=1;tableRowIndex<=36;tableRowIndex++)
	{
	/*
	By cityNameProperty=By.xpath
	("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tableRowIndex+"]/td[1]");
	*/

	                 // OR
	
		
	By cityNameProperty=By.xpath(xpathExpressionPart1+tableRowIndex+xpathExpressionPart2);

	WebElement cityName=driver.findElement(cityNameProperty);

	String cityNameText=cityName.getText();
	FileInputStream testDataFile= new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\TimeandDateFirstColumnWrite\\capturingfirstcolumndata.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
	XSSFRow rowTestData=testDataSheet.createRow(tableRowIndex);
	XSSFCell rowofcellTestData=rowTestData.createCell(0);
	rowofcellTestData.setCellValue(cityNameText);
	FileOutputStream testResult= new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\TimeandDateFirstColumnWrite\\capturingfirstcolumndata.xlsx");
	workbook.write(testResult);

	System.out.println(cityNameText);

	}


	}

	public static void main(String[] args) throws IOException {

	CapturingFirstColumnCityNamesExcel getCityName = new CapturingFirstColumnCityNamesExcel();

	getCityName.applicationLaunch();
	getCityName.capturingFirstColumnCityNames();
	getCityName.applicationClose();



	}


}
