package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;
import com.testbase.amazon.BaseClass;

public class TC010_CartAddRemoveItem extends BaseClass{
	
	@Test
	public void addRemoveItem() {
		
		PO_005_SearchPage search = new PO_005_SearchPage(driver);

		search.search();
		search.checkBoxClick();
		search.selectProduct();
		search.handleNewWindow();
		PO_007_ProductDetailsVerifyPage pp=new PO_007_ProductDetailsVerifyPage(driver);
		pp.addToCart();
		pp.cartClick();
		pp.addItemCount();
		pp.removeItemCount();
		
		
	}

}
