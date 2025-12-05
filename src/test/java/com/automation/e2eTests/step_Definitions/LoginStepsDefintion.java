package com.automation.e2eTests.step_Definitions;

import com.automation.e2eTests.page_Objects.LoginPage;
import com.automation.e2eTests.utlis.ConfigFileReader;
import com.automation.e2eTests.utlis.SeleniumUtils;
import com.automation.e2eTests.utlis.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefintion {

	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public LoginPage loginPage;
	public Validations validations;

	public LoginStepsDefintion() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		validations = new Validations();
	}

	@Given("j ouvre le navigateur avec l url swaglabs")
	public void jOuvreLeNavigateurAvecLUrlSwaglabs() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("je saisi le username {string}")
	public void jeSaisiLeUsername(String string) {
		seleniumUtils.writeText(LoginPage.getusername(), configFileReader.getProperties("home.username"));
	}

	@When("je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String string) {
		seleniumUtils.writeText(LoginPage.getPassword(), configFileReader.getProperties("home.password"));
	}

	@When("je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {
		seleniumUtils.click(LoginPage.getBtnLogin());
	}

}