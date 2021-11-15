package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.WebDriverCommonLib;

public class ChangeStatusPage 
{
 @FindBy(xpath="//select[@name='leadstatus']") private WebElement newstatus;
 @FindBy(xpath="//input[@value='Save']") private WebElement save;
public WebElement getNewstatus() {
	return newstatus;
}
public WebElement getSave() {
	return save;
}
 public ChangeStatusPage()
 {
	 PageFactory.initElements(BaseTest.driver,this);
 }
 public void NewStatus()
 {
 WebDriverCommonLib wlib = new WebDriverCommonLib();
 wlib.selectOption(newstatus, "Attempted to Contact");
 save.click();
 }
 }

