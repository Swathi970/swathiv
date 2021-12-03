package com.radicocrm.forecastmodule;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.ForecastsPage;
import com.radicocrm.pages.NewForecastspage;
import com.radicocrm.pages.Signin;

public class NewForecastsTab extends BaseTest
{
	@Test
	public  void SigninPage() throws Throwable
	{	

     Signin sp = new Signin();
 	 FileLib fl = new FileLib();
 	  WebDriverCommonLib wlib = new WebDriverCommonLib();
 	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
 	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
     
     ForecastsPage fst = new ForecastsPage();
     fst.ForeCast();
     Thread.sleep(3000);
     
   NewForecastspage nfc = new NewForecastspage();
   nfc.NewForeCast();
}
}