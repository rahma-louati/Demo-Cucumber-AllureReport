package com.automation.e2eTests.page_Objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utlis.BasePage;
import com.automation.e2eTests.utlis.Setup;

public class ProductPage extends BasePage{

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private static WebElement btnAddToCare;
	
	@FindBy(how = How.ID, using = "shopping_cart_container")
	private static WebElement btnPanier;
	
	@FindBy(how = How.XPATH, using = "//div[@class='inventory_item_name']")
	private static WebElement title;
	
	@FindBy(how = How.ID, using = "checkout")
	private static WebElement btnCheckout;

	@FindBy(how = How.ID, using = "first-name")
	private static WebElement firstName;

	@FindBy(how = How.ID, using = "last-name")
	private static WebElement lastName;

	@FindBy(how = How.ID, using = "postal-code")
	private static WebElement postalCode;
	
	@FindBy(how = How.ID, using = "continue")
	private static WebElement btnContiune;
	
	@FindBy(how = How.ID, using = "finish")
	private static WebElement btnFinish;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Thank you for your order!']")
	private static WebElement title2;
	
	@FindBy(how = How.ID, using = "back-to-products")
	private static WebElement btnBackHome;
	
	public ProductPage() {
		super(Setup.getDriver());
	}
	
	public WebElement getBtaddToCare() {
		return btnAddToCare;
	}
	
	public WebElement getBtnPanier() {
		return btnPanier;
	}
	
	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getBtnCheckout() {
		return btnCheckout;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getPostalCode() {
		return postalCode;
	}
	
	public WebElement getBtnContinue() {
		return btnContiune;
	}
	
	public WebElement getBtnFinish() {
		return btnFinish;
	}
	
	public WebElement getTitle2() {
		return title2;
	}
	
	public WebElement getBtnBackHome() {
		return btnBackHome;
	}
	
}
