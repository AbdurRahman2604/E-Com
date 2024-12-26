package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;

public class TC005_Search extends A_Browser_LQ {

@Test	
public void searchProduct() {
	
	PO_005_SearchPage sp=new PO_005_SearchPage(driver);
	sp.search();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
