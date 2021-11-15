package com.radicocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.radicocrm.genericLib.BaseTest;

public class Signin {
	
	@FindBy(id="userName") private WebElement usernametab;
	@FindBy(id="passWord") private WebElement password;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signinbutton;
	
	public Signin(){
		
		PageFactory.initElements(BaseTest.driver,this);
		
	}

	public WebElement getUntb() {
		return usernametab;
	}

	public WebElement getPwd() {
		return password;
	}
	
	public WebElement getSigninbtn() {
		return signinbutton;
	}
	
	public void login(String un, String pw)
	{
		usernametab.sendKeys(un);
		
		password.sendKeys(pw);
		signinbutton.click();	
		
	}

//	public void login(String readPropData, String readPropData2, String readPropData3) {
//		// TODO Auto-generated method stub
		
	}		
		
	
	
