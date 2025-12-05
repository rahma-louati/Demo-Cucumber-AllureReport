package com.automation.e2eTests.step_Definitions;

import com.automation.e2eTests.page_Objects.ProductPage;
import com.automation.e2eTests.utlis.ConfigFileReader;
import com.automation.e2eTests.utlis.SeleniumUtils;
import com.automation.e2eTests.utlis.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepsDefintions {
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public ProductPage productPage;
	public Validations validations;

	public ProductStepsDefintions() {
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		productPage = new ProductPage();
		validations = new Validations();
	}

	@When("J ajoute le produit au panier {string}")
	public void jAjouteLeProduitAuPanier(String string) {
		seleniumUtils.click(productPage.getBtaddToCare());
	}

	@When("je clique sur l icône du panier")
	public void jeCliqueSurLIcôneDuPanier() {
		seleniumUtils.waitForElementToBeClickable(productPage.getBtnPanier());
		seleniumUtils.click(productPage.getBtnPanier());
	}

	@Then("je verifie que le produit {string} est bien dans le panier")
	public void jeVerifieQueLeProduitEstBienDansLePanier(String string) {
		seleniumUtils.waitvisibilityOf(productPage.getTitle());
		validations.assertEquals(productPage.getTitle(), string);
	}

	@When("je clique sur le bouton {string}")
	public void jeCliqueSurLeBouton(String string) {
		seleniumUtils.waitForElementToBeClickable(productPage.getBtnCheckout());
		seleniumUtils.click(productPage.getBtnCheckout());
	}

	@When("je saisis les informations : prenom {string}, nom {string}, code postal {string}")
	public void jeSaisisLesInformationsPrenomNomCodePostal(String string, String string2, String string3) {
		seleniumUtils.writeText(productPage.getFirstName(), string);
		seleniumUtils.writeText(productPage.getLastName(), string2);
		seleniumUtils.writeText(productPage.getPostalCode(), string3);
	}

	@When("je clique sur le bouton  {string}")
	public void jeCliqueSurLeBouton1(String string) {
		seleniumUtils.waitForElementToBeClickable(productPage.getBtnContinue());
		seleniumUtils.click(productPage.getBtnContinue());
	}

	@When("je clique sur le bouton    {string}")
	public void jeCliqueSurLeBouton2(String string) {
		seleniumUtils.waitForElementToBeClickable(productPage.getBtnFinish());
		seleniumUtils.click(productPage.getBtnFinish());
	}

	@Then("je verifie que le message {string} s affiche")
	public void jeVerifieQueLeMessageSAffiche(String string) {
		seleniumUtils.waitvisibilityOf(productPage.getTitle2());
		validations.assertEquals(productPage.getTitle2(), string);
	}
	

	@When("je clique sur le bouton     {string}")
	public void jeCliqueSurLeBouton3(String string) {
		seleniumUtils.waitForElementToBeClickable(productPage.getBtnBackHome());
		seleniumUtils.click(productPage.getBtnBackHome());
	}

}
