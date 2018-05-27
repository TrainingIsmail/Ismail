package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignupPaypal;
import wdMethods.ProjectMethods;

public class TC_01_PayPal extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_PayPal";
		testDescription="PayPal";
		testNodes="PayPal";
		category="Smoke";
		authors="Ismail";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void Paypal(String country,String email, String password , String confirmpassword) {
		
		new SignupPaypal()
		.clicksignup()
		.clickshoppers()
		.clicknext()
		.selectcountry(country)
		.enteremail(email)
		.elepassword(password)
		.elecpassword(confirmpassword)
		.clickcontinue();
	}


}
