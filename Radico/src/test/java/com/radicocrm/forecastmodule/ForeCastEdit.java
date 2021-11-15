package com.radicocrm.forecastmodule;


import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CreateForeCastsPage;
import com.radicocrm.pages.ForeCastEditPage;
import com.radicocrm.pages.ForecastsPage;
import com.radicocrm.pages.NewForecastspage;
import com.radicocrm.pages.Signin;

public class ForeCastEdit extends BaseTest
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
  Thread.sleep(3000);
  
  CreateForeCastsPage nfcp = new CreateForeCastsPage();
  nfcp.CreateForecasts();
  Thread.sleep(3000);
  
  ForeCastEditPage fcep = new ForeCastEditPage();
  fcep.ForeCastEdit1(fl.readPropData(PROP_PATH,"april1"),fl.readPropData(PROP_PATH,"committedamount"),fl.readPropData(PROP_PATH,"bestcaseamount"));
  Thread.sleep(3000);
}
}
