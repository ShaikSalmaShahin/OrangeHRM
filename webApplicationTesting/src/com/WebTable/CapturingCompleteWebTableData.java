package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingCompleteWebTableData extends BaseTest{
	public void capturingCompleteWebTableData()
	{
	// First Row of First Row Of Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// // First Row of First Row Of Last Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]

	// Last Row of Last Cell
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

	// TO goto every Row
	for(int rowOfIndex=1;rowOfIndex<=36;rowOfIndex++)
	{
	// To goto Every Row of All the Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By tableDataProperty=By.xpath
	("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowOfIndex+
	"]/td["+rowOfCellIndex+"]");

	WebElement tableData=driver.findElement(tableDataProperty);

	String tableDataText=tableData.getText();
	System.out.print(tableDataText+" | ");

	}
	System.out.println();
	}

	}

	public static void main(String[] args) {

	CapturingCompleteWebTableData getTableData = new CapturingCompleteWebTableData();
	getTableData.applicationLaunch();
	getTableData.capturingCompleteWebTableData();
	getTableData.applicationClose();

	}

}
