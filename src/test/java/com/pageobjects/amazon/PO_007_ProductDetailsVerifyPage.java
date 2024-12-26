package com.pageobjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_007_ProductDetailsVerifyPage extends A_Basepage {

	public PO_007_ProductDetailsVerifyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
@FindBy(xpath="//h3[@class='product-facts-title']")
WebElement product;
	
//PO_009
@FindBy(id="add-to-cart-button")
WebElement addProduct;
@FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
WebElement verifyCart;

//PO_010
@FindBy(id="nav-cart-count")
WebElement cart;

@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
WebElement addItemCount;

@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")
WebElement removeItemCount;

//PO_011
@FindBy(name="proceedToRetailCheckout")
WebElement proceed;

public String productdetails() {
	return product.getText();
	
}

public void addToCart() {
	addProduct.click();
}

public String verifyCart() {
	return verifyCart.getText();
}

//PO_010
public void cartClick() {
	cart.click();
}

public void addItemCount() {
	addItemCount.click();
}
public void removeItemCount() {
	removeItemCount.click();
}

//PO_011
public void proceedTCO() {
	proceed.click();
}


}
