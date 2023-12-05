package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends BaseTest{
public void selectionofOptionalValue_SelectLanguage()

{
//<select onchange="doGTranslate(this);" class="notranslate" 
	//id="gtranslate_selector" aria-label="Website Language Selector" align="right" 
	//style="position:relative; z-index:1000">
	By dropDown_SelectLanguageProperty=By.id("gtranslate_selector");
	WebElement dropDown_SelectLanguage=driver.findElement(dropDown_SelectLanguageProperty);
	Select languageSelection = new Select(dropDown_SelectLanguage);
	languageSelection.selectByIndex(7);
	//<option value="en|de">German</option>
	//languageSelection.deselectByValue("en|de");
	driver.navigate().back();
	 dropDown_SelectLanguage=driver.findElement(dropDown_SelectLanguageProperty);
	
}
public static void main(String[] args) {
	DropDownHandling dropDown = new DropDownHandling();
	dropDown.setup();
	dropDown.selectionofOptionalValue_SelectLanguage();
}
}
