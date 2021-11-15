package com.radicocrm.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" started",true);
	}
	
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" ended",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method FAILED",true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.fullPageScreenshot("./Screenshots/"+result.getName()+".png");
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method SKIPPED",true);
	}

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method STARTED",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method PASSED",true);
	}

	
}
