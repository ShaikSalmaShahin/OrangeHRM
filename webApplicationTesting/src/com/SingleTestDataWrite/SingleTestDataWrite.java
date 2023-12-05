package com.SingleTestDataWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleTestDataWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream testDataFile= new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\WriteExcelFile\\SingleTestDataWritee.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(testDataFile);
XSSFSheet testDataSheet=workbook.getSheet("Sheet1");
XSSFRow testDataRowCreate=testDataSheet.createRow(0);
XSSFCell testDataRowOfCellCreate=testDataRowCreate.createCell(0);
testDataRowOfCellCreate.setCellValue("functional testing");

// Saving the File
FileOutputStream testResult = new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\WriteExcelFile\\SingleTestDataWritee.xlsx");
workbook.write(testResult);





	}

}
