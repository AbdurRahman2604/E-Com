package com.testcases.amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;

public class TC006_Filter extends A_Browser_LQ {
	
	@Test
	public void filter() {
		PO_005_SearchPage sp=new PO_005_SearchPage(driver);
		sp.search();
		//sp.checkBox("Bata");
		sp.checkBoxClick();
		String actualProduct = sp.verifyFilterProduct();
		
		String expected="Bata";
		
		Assert.assertEquals(actualProduct, expected,"Filter doesnt match");
		
		
		
	}

}