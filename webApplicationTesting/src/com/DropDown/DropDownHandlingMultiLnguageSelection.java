package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingMultiLnguageSelection extends BaseTest{
	public void selectionofOptionalValues_SelectMultiLanguage()
	{
		By dropDown_SelectLanguageProperty=By.id("gtranslate_selector");
		WebElement dropDown_SelectLanguage=driver.findElement(dropDown_SelectLanguageProperty);
		Select languageSelection = new Select(dropDown_SelectLanguage);
		//languageSelection.selectByIndex(2);
		//<option value="en|ml">Malayalam</option>
		languageSelection.selectByValue("en|ml");
		//<option value="en|ta">Tamil</option>
		//languageSelection.selectByVisibleText("Tamil");
		driver.navigate().back();
	 dropDown_SelectLanguage=driver.findElement(dropDown_SelectLanguageProperty);
	}
public static void main(String[] args) {
	
	DropDownHandling dropDown = new DropDownHandling();
	dropDown.setup();
	dropDown.selectionofOptionalValue_SelectLanguage();
	
}
}
