package com.MultiTestDataExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultiTestDataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream TestDataFile= new FileInputStream("./src/com/MultipleExcelData/MultiTestDataExcel.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(TestDataFile);
XSSFSheet testDataSheet=workbook.getSheet("Sheet1");
// go to ACTIVE ROWS
int activeRowCount=testDataSheet.getLastRowNum();
for(int rowindex=0;rowindex<activeRowCount;rowindex++)
{
	XSSFRow rowTestData=testDataSheet.getRow(rowindex);
	// In Current Active row go to active cell	
	 int activeRowOfCellcount=rowTestData.getLastCellNum();
	 
	 for(int rowofcell=0;rowofcell<activeRowOfCellcount;rowofcell++)
	 {
		 XSSFCell rowofcellActiveTestData=rowTestData.getCell(rowofcell); 
		  String testData=rowofcellActiveTestData.getStringCellValue();
		  System.out.print(testData+" ");
	 }
	System.out.println();
	
}



	}

}
