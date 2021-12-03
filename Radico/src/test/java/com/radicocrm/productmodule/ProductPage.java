package com.radicocrm.productmodule;

import org.testng.annotations.Test;
import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.FileLib;
import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CreateproductPage;
import com.radicocrm.pages.NewProductPage;
import com.radicocrm.pages.Signin;

public class ProductPage extends BaseTest
{
  @Test
  public  void SigninPage() throws Throwable
	
  {
	    Signin sp = new Signin();
  	    FileLib fl = new FileLib();
  	  WebDriverCommonLib wlib = new WebDriverCommonLib();
  	  sp.login(fl.readPropData(PROP_PATH,"username"),fl.readPropData(PROP_PATH,"password"));
  	  wlib.verify(fl.readPropData(PROP_PATH,"loginTitle"), "Zoho CRM - Sign in",fl.readPropData(PROP_PATH,"loginTitle") );

              ProductPage pdpg=new ProductPage();
              pdpg.product();
		 
		
		 NewProductPage ntb = new NewProductPage();
		 ntb.NewProdut();
		  
		 
		 CreateproductPage cpt = new CreateproductPage();
		 cpt.createProduct(fl.readPropData(PROP_PATH,"productcode"),fl.readPropData(PROP_PATH,"productname"), fl.readPropData(PROP_PATH,"vendorname"));
		 Thread.sleep(3000);
  }

public void product() {
	// TODO Auto-generated method stub
	
}


	
}


      

	


