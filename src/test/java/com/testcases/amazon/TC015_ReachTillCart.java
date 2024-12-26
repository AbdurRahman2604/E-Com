package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;

public class TC015_ReachTillCart extends A_Browser_LQ {
	
	
	@Test
	public void reachToCart() {
		
		PO_005_SearchPage search = new PO_005_SearchPage(driver);

		search.search();
		search.checkBoxClick();
		search.selectProduct();
		search.handleNewWindow();
		PO_007_ProductDetailsVerifyPage pp=new PO_007_ProductDetailsVerifyPage(driver);
		pp.addToCart();
		pp.cartClick();
		
		
	}

}
