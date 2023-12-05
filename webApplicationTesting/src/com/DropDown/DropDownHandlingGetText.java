package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingGetText extends BaseTest{
	public void selectionofOptionalValues_SelectLanguageText()
	{
		By dropDown_SelectLanguageProperty=By.id("gtranslate_selector");
		WebElement dropDown_SelectLanguage=driver.findElement(dropDown_SelectLanguageProperty);
		Select languageSelection = new Select(dropDown_SelectLanguage);
		String dropDownText=dropDown_SelectLanguage.getText();
}
	public static void main(String[] args) {
		DropDownHandlingGetText dropDownHandlingGetText= new DropDownHandlingGetText();
		dropDownHandlingGetText.setup();
		dropDownHandlingGetText.selectionofOptionalValues_SelectLanguageText();
		
		
	}
}
