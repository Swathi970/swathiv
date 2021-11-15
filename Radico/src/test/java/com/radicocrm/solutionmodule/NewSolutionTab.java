package com.radicocrm.solutionmodule;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.NewSolutionPage;
import com.radicocrm.pages.Signin;
import com.radicocrm.pages.SolutionsPage;

public class NewSolutionTab extends BaseTest
{
@Test
		public  void SigninPage() throws Throwable
		{	
	
         Signin sp = new Signin();
     	 FileLib fl = new FileLib();
     	WebDriverCommonLib wlib = new WebDriverCommonLib();
     	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
     	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
	     
	     SolutionsPage sol = new SolutionsPage();
		 sol.solutions();
		 Thread.sleep(3000);
		 
		 NewSolutionPage ns = new NewSolutionPage();	
		 ns.Newsolution();
		 Thread.sleep(3000);
		}
}
