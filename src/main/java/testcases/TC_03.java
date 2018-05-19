package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_03 extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003";
		testDescription="Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Ismail";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void Createlead(String uName,String pwd, String cname , String fname , String lname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmsfa()
		.clickcreatelead()
		.entercname(cname)
		.enterfname(fname)
		.enterlname(lname)
		.clicksubmitlead()
		.verifycName(cname)
		.verifyfname(fname)
		.verifylname(lname);
	}

}


