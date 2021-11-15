package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class SolutionsPage {
@FindBy(xpath="//a[text()='Solutions']") private WebElement sol;

public WebElement getSol() {
	return sol;
}
public SolutionsPage() 
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void solutions()
{
	sol.click();
}
}
