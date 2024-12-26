package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_SigninPage;
//import com.utility.amazon.ExcelDP;
import com.utility.amazon.ExcelDP;

public class TC003_Signin_Invalid extends A_Browser_LQ {

	@Test(dataProvider = "ExcelData", dataProviderClass = ExcelDP.class)
	public void login(String uName, String pwd) {

		B_HomePage hp = new B_HomePage(driver);
		hp.signIn();
		PO_002_SigninPage si = new PO_002_SigninPage(driver);
		si.email(uName);
		si.ctnButton();
		si.password(pwd);
		si.submit();

	}

}
