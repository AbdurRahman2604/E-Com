package com.testcases.amazon;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.pageobjects.amazon.PO_005_SearchPage;
import com.testbase.amazon.BaseClass;
import com.testbase.amazon.Listener;



public class TC005_Search extends BaseClass {

@Test
public void searchProduct() {
	
	PO_005_SearchPage sp=new PO_005_SearchPage(driver);
	sp.search();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
