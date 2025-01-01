package com.testcases.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;
import com.testbase.amazon.BaseClass;

public class TC009_AddToCart extends BaseClass{
	
	@Test
	public void addToCart() {
		
		
		PO_005_SearchPage search = new PO_005_SearchPage(driver);

		search.search();
		search.checkBoxClick();
		search.selectProduct();
		search.handleNewWindow();
		PO_007_ProductDetailsVerifyPage pp=new PO_007_ProductDetailsVerifyPage(driver);
		pp.addToCart();
		String actualText = pp.verifyCart();
		
		String expectedText="Added to cart";
		Assert.assertEquals(actualText, expectedText,"added to cart is not displayed");
	}
	

}
