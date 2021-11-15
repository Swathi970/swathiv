package com.radicocrm.casesmodule;

import org.testng.annotations.Test;

import com.radicocrm.genericLib.BaseTest;
import com.radicocrm.genericLib.CaseCancel;
import com.radicocrm.genericLib.FileLib;
//import com.radicocrm.genericLib.WebDriverCommonLib;
import com.radicocrm.pages.CasePage;
import com.radicocrm.pages.Clone;
import com.radicocrm.pages.CreatePage;
import com.radicocrm.pages.Dnmslokesh;
import com.radicocrm.pages.Edit;
import com.radicocrm.pages.EditData;
import com.radicocrm.pages.NewCasePage;
import com.radicocrm.pages.SaveAndNew;
import com.radicocrm.pages.Signin;
import com.radicocrm.pages.Subject;

public class CaseTab extends BaseTest {

	@Test
	public void SigninPage() throws Throwable {

		Signin sp = new Signin();
		FileLib fl = new FileLib();
		//WebDriverCommonLib wlib = new WebDriverCommonLib();
		sp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password"));

		CasePage Cp = new CasePage();
		Cp.CaseTab();
		NewCasePage nc = new NewCasePage();
		nc.NewTab();

		CreatePage cp = new CreatePage();

		cp.Create(fl.readPropData(PROP_PATH, "sub"));

		Edit ed = new Edit();
		ed.edi();

		EditData edt = new EditData();
		edt.Editd(fl.readPropData(PROP_PATH, "st"));

		SaveAndNew sn = new SaveAndNew();
		sn.savenew(fl.readPropData(PROP_PATH, "pn"));

		CaseCancel cc = new CaseCancel();
		cc.cancel();
		Subject su = new Subject();
		su.sub();
		Dnmslokesh dn = new Dnmslokesh();
		dn.loki();
        Clone cl = new Clone();
        cl.clon();
	}

}
