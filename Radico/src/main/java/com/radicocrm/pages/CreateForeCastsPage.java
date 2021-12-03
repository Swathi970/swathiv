package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.WebDriverCommonLib;

public class CreateForeCastsPage 
{
@FindBy(xpath="//select[@name='forecastYear']") private WebElement year;
@FindBy(xpath="//select[@name='forecastQuarter']") private WebElement quarter;
@FindBy(xpath="//input[@value='Next']") private WebElement next;


public WebElement getYear() {
	return year;
}
public WebElement getQuarter() {
	return quarter;
}
public WebElement getNext() {
	return next;
}
public CreateForeCastsPage() 
{
  PageFactory.initElements(BaseTest.driver,this);
}
public void CreateForecasts()
{
 WebDriverCommonLib wlib = new WebDriverCommonLib();
 wlib.selectOption(year, "2007");
 wlib.selectOption(quarter,"3");
 next.click();
}
}
