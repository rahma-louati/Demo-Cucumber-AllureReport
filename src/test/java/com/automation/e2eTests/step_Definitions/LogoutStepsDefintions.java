package com.automation.e2eTests.step_Definitions;

import com.automation.e2eTests.page_Objects.LogoutPage;
import com.automation.e2eTests.utlis.ConfigFileReader;
import com.automation.e2eTests.utlis.SeleniumUtils;
import com.automation.e2eTests.utlis.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepsDefintions {

	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public LogoutPage logoutPage;
	public Validations validations;

	public LogoutStepsDefintions() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		logoutPage = new LogoutPage();
		validations = new Validations();
	}

	@When("je clique sur le bouton menu")
	public void jeCliqueSurLeBoutonMenu() {
		seleniumUtils.waitForElementToBeClickable(logoutPage.getBtnMenu());
		seleniumUtils.click(logoutPage.getBtnMenu());
	}

	@When("je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		seleniumUtils.waitForElementToBeClickable(logoutPage.getBtnLogout());
		seleniumUtils.click(logoutPage.getBtnLogout());
	}

	@Then("je verifie que la page de connexion saffiche avec le texte {string}")
	public void jeVerifieQueLaPageDeConnexionSafficheAvecLeTexte(String string) {
		seleniumUtils.waitvisibilityOf(logoutPage.getTitlePassword());
		validations.assertEquals(logoutPage.getTitlePassword(), string);
	}
	
	@Then("je me dirige vers la page dacceuil {string}")
	public void jeMeDirigeVersLaPageDacceuil(String string) {
		seleniumUtils.waitvisibilityOf(logoutPage.getTitleProducts());
		validations.assertEquals(logoutPage.getTitleProducts(), string);
	}




}
