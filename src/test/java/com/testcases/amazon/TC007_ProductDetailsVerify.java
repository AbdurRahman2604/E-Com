package com.testcases.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_007_ProductDetailsVerifyPage;

public class TC007_ProductDetailsVerify extends A_Browser_LQ {

	@Test
	public void verifyProduct() {
		PO_005_SearchPage search = new PO_005_SearchPage(driver);

		search.search();
		search.checkBoxClick();
		search.selectProduct();

		search.handleNewWindow();
		String newWindowTitle = search.getProductTitle();
		System.out.println("New Window Title: " + newWindowTitle);

		
		PO_007_ProductDetailsVerifyPage product=new PO_007_ProductDetailsVerifyPage(driver);
		
		String actual = product.productdetails();
		String expected="Product details";
		
		Assert.assertEquals(actual,expected,"product details not found");
		
		
	}

}
