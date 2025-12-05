package com.automation.e2eTests.page_Objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utlis.BasePage;
import com.automation.e2eTests.utlis.Setup;
import com.automation.e2eTests.utlis.Wait;

public class LogoutPage extends BasePage {

	private Wait wait;

	/* Retrieve element */
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	private static WebElement btnMenu;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Password for all users:']")
	private static WebElement titlePassword;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Products']")
	private static WebElement titleProducts;
	
	public LogoutPage() {
		super(Setup.getDriver());
		this.wait = new Wait(driver);
	}
	
	public WebElement getBtnMenu() {
		wait.forLoading(Duration.ofSeconds(10));
		return btnMenu;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
	public WebElement getTitlePassword() {
		return titlePassword;
	}
	
	public WebElement getTitleProducts() {
		wait.forLoading(Duration.ofSeconds(10));
		return titleProducts;
	}
	
	}


