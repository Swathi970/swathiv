package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class Subject {
	@FindBy(xpath="//a[text()='Cases']")private WebElement Cases;




public WebElement getCases() {
	return Cases;
}

public Subject() {
	PageFactory.initElements(BaseTest.driver, this);
}


public void sub() {
	Cases.click();
	
}

}