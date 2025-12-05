package com.automation.e2eTests.page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utlis.BasePage;
import com.automation.e2eTests.utlis.Setup;
import com.automation.e2eTests.utlis.Wait;

public class LoginPage extends BasePage {
	private Wait wait;

	/* Retrieve element */
	@FindBy(how = How.ID, using = "user-name")
	private static WebElement username;

	@FindBy(how = How.ID, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\"]")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
	private static WebElement titleDashbord;

	public LoginPage() {
		super(Setup.getDriver());
		this.wait = new Wait(driver);
	}

	public static WebElement getusername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTitleDashbord() {
		wait.forLoading(Duration.ofSeconds(10));
		return titleDashbord;
	}




}

