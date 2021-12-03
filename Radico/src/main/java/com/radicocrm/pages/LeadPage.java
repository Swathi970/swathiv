package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class LeadPage 
{
 @FindBy(xpath="//a[text()='Leads']")private WebElement leadbtn;

public WebElement getLeadbtn() {
	return leadbtn;
}
 public LeadPage()
 {
	 PageFactory.initElements(BaseTest.driver,this);
 }
 public void Lead()
 {
	 leadbtn.click();
 }
}
