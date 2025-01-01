package com.testcases.amazon;

import org.testng.annotations.Test;

import com.pageobjects.amazon.PO_005_SearchPage;
import com.pageobjects.amazon.PO_008_SortByPricePage;
import com.testbase.amazon.BaseClass;

public class TC008_Sort extends BaseClass{

	
	@Test
public void sortByPrice() {
	PO_005_SearchPage sp=new PO_005_SearchPage(driver);
	sp.search();
	PO_008_SortByPricePage sort=new PO_008_SortByPricePage(driver);
	sort.select();

}
	
	
	
	
	
}
