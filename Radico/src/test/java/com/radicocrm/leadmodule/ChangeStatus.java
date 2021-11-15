package com.radicocrm.leadmodule;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.ChangeStatusPage;
import com.radicocrm.pages.LeadCreateTask;
import com.radicocrm.pages.LeadPage;
import com.radicocrm.pages.LeadslistPage;
import com.radicocrm.pages.NewTaskPage;
import com.radicocrm.pages.Signin;

public class ChangeStatus extends BaseTest
{
	  @Test
	  public  void SigninPage() throws Throwable
		
	  {
		    Signin sp = new Signin();
	  	    FileLib fl = new FileLib();
	  	    WebDriverCommonLib wlib = new WebDriverCommonLib();
	  	    sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
	  	    wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );
		    
		    LeadPage lp = new LeadPage();
	        lp.Lead();
	        Thread.sleep(2000);
	        
	        LeadslistPage lpage = new LeadslistPage();
	        lpage.Leadlist();
	        Thread.sleep(2000);
	        
	        ChangeStatusPage cspage = new ChangeStatusPage();
	        cspage.NewStatus();
	        Thread.sleep(2000);
	       
	        LeadCreateTask lct = new LeadCreateTask();
	        lct.CreateTasktoLead();
	        Thread.sleep(2000);
	         
	      NewTaskPage ntask = new NewTaskPage();
	      ntask.CreateTask(fl.readPropData(PROP_PATH,"Sub"), fl.readPropData(PROP_PATH,"Description"), fl.readPropData(PROP_PATH,"DueDate"));
	      Thread.sleep(2000);
}
}