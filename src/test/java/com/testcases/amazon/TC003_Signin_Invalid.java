package com.testcases.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;



import com.pageobjects.amazon.B_HomePage;
import com.pageobjects.amazon.PO_002_SigninPage;
import com.testbase.amazon.BaseClass;
import com.utility.amazon.ExcelDP;

public class TC003_Signin_Invalid extends BaseClass {

	@Test(dataProvider = "ExcelData", dataProviderClass = ExcelDP.class) //,retryAnalyzer =com.testbase.amazon.RetryAnalyzer.class
	public void login(String uName, String pwd,String expectedErrorMsg) {

		B_HomePage hp = new B_HomePage(driver);
		hp.signIn();
		PO_002_SigninPage si = new PO_002_SigninPage(driver);
		si.email(uName);
		si.ctnButton();
		 // Check for error message after entering the mobile number
	  

	    // Proceed only if no error is displayed for mobile number
		si.password(pwd);
		si.submit();

	    // Check for the password error message
		String  actualErrorMsg = si.getErrorMsg();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg,"Error msg is not displayed");
		

	}

}
