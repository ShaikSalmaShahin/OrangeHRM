package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_SingleTestData {
	public static void main(String[] args) throws IOException {
		//Identifying the file(ExcelFile) in the system
	FileInputStream testDataFile = new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\ExcelFile\\SingleTestData.xlsx");
	// Identifying the workbook in the file
	XSSFWorkbook workbook= new XSSFWorkbook(testDataFile);
	// Identifying a particular sheet in the workbook
	XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
	//Identifying a particular Row in the sheet
	XSSFRow testDataRow=testDataSheet.getRow(0);
	//Identifying a particular cell in a row
	XSSFCell testDataRowofCell=testDataRow.getCell(0);
	// Getting Test Data value from testDataRowofCell
	String testData=testDataRowofCell.getStringCellValue();
	System.out.println(testData);
	
	
	//2nd Row of 2nd Cell Data
	
	XSSFRow secondTestDataRow=testDataSheet.getRow(1);
	
	XSSFCell secondTestDataRowOfCell=secondTestDataRow.getCell(1);
	
	String secondTestData=secondTestDataRowOfCell.getStringCellValue();	
	System.out.println(secondTestData);
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
	
	}

}
