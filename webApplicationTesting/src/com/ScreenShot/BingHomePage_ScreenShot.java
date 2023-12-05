package com.ScreenShot;


import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BingHomePage_ScreenShot {
	WebDriver driver;
	String applicationUrlAddress="https://www.bing.com/";
	public void applicationLaunch()
	{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\9AmOctBatch\\webApplicationTesting\\browserdriverfiles\\msedgedriver.exe");
	driver= new EdgeDriver();
	driver.get(applicationUrlAddress);
	
	}
	public void capturingScreenShot() throws IOException
	{
		//pressing the printscreen button of the keyboard
		//of the current webpage- the screenshot should be captured
		File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot, new File("./Screenshot/bing.png"));
	}
		
public static void main(String[] args) throws IOException {
	BingHomePage_ScreenShot screenshot = new BingHomePage_ScreenShot();
	screenshot.applicationLaunch();
	screenshot.capturingScreenShot();
	
	
}








}