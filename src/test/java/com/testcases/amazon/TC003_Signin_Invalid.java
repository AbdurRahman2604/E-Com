package com.testcases.amazon;

import org.testng.annotations.Test;


import com.pageobjects.amazon.PO_002_Signin;
//import com.utility.amazon.ExcelDP;

public class TC003_Signin_Invalid extends A_Browser_LQ {


 @Test//(dataProvider="ExcelData",dataProviderClass =ExcelDP.class)
public void login(String uName,String pwd){
	
	
	PO_002_Signin si=new PO_002_Signin(driver);
	si.email(uName);
	si.ctnButton();
	si.password(pwd);
	si.verify();
	
 }


}
