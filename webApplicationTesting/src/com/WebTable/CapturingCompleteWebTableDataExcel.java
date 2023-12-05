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

public class CapturingCompleteWebTableDataExcel extends BaseTest {
	public void capturingCompleteWebTableData() throws IOException
	{
	// First Row of First Row Of Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// // First Row of First Row Of Last Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]

	// Last Row of Last Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		FileInputStream testDataFile = new FileInputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\TimeAndDateWebTableData\\capturingWebTabledata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workbook.getSheet("Sheet1");
	// TO goto every Row
	for(int rowOfIndex=1;rowOfIndex<=36;rowOfIndex++)
	{
		
		 XSSFRow rowTestData=testDataSheet.createRow(rowOfIndex);
		
	// To goto Every Row of All the Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By tableDataProperty=By.xpath
	("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowOfIndex+
	"]/td["+rowOfCellIndex+"]");

	WebElement tableData=driver.findElement(tableDataProperty);

	String tableDataText=tableData.getText();
	
	XSSFCell rowofcellTestData=rowTestData.createCell(rowOfCellIndex);
	rowofcellTestData.setCellValue(tableDataText);
	FileOutputStream testResult = new FileOutputStream("C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\src\\com\\TimeAndDateWebTableData\\capturingWebTabledata.xlsx");
	workbook.write(testResult);
	System.out.print(tableDataText+" | ");

	}
	System.out.println();
	}
	}

	public static void main(String[] args) throws IOException {

	CapturingCompleteWebTableDataExcel getTableData = new CapturingCompleteWebTableDataExcel();
	getTableData.applicationLaunch();
	getTableData.capturingCompleteWebTableData();
	getTableData.applicationClose();

	}

}
