package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gettingExcelLoginTestData {
	//User Defined Method - working with Excel Test Data - Single test data


	      

	       // Creating a UserDefined Method - with parameters

	       public static String getData(String fileName,int row, int cell) throws IOException

	       {

	       // Identifying the path of the Location of the File - saving into a variable

	              String filePath="./src/main/java/com/OrangeHRMApplicationTestDataFile/"+fileName+".xlsx";

	             

	              // Identifying the file of the System

	              FileInputStream file = new FileInputStream(filePath);

	             

	              // Identifying the workBook of the file

	              XSSFWorkbook workBook = new XSSFWorkbook(file);

	             

	              // Identify the Sheet of the workBook

	              XSSFSheet sheet = workBook.getSheet("Sheet1");

	             

	              // from the sheet getting the row of a cell value - saved into a variable

	             String testData=sheet.getRow(row).getCell(cell).getStringCellValue();
	           
                             // method returns a string value - testData

	              return testData;

	       }
	       public static int getRowValue(String filepath,String sheetName ) throws IOException
	       {
	    	   FileInputStream excelFile = new FileInputStream(filepath);
	    	   XSSFWorkbook workbook= new XSSFWorkbook(excelFile);
	    	   XSSFSheet excelsheet=workbook.getSheet(sheetName);
	    			  int  activeRowCount=excelsheet.getLastRowNum();
	    	   
			return activeRowCount;
	    	   
	       }
	       public static int getCellValue(String filepath,String sheetName,int rowIndex) throws IOException 
	       {
	    	   FileInputStream excelFile = new FileInputStream(filepath);
	    	   XSSFWorkbook workbook= new XSSFWorkbook(excelFile);
	    	   XSSFSheet excelsheet=workbook.getSheet(sheetName);  
	    	   XSSFRow rowValue=excelsheet.getRow(rowIndex);
	    	   int activeRowofCellCount =rowValue.getLastCellNum();
			return activeRowofCellCount;
	    	   
	       }

	      

	       

	       

	 

	}


