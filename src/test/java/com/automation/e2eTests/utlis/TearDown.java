package com.automation.e2eTests.utlis;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class TearDown {

	/**
	 * This method is used to close browser. This method is called after the
	 * invocation of each test method in given class.
	 * 
	 * @After Methods annotated with @After execute after every scenario.
	 */
	@After
	public void quitDriver(Scenario scenario) {

		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed step", new ByteArrayInputStream(screenshot));
		}

		Setup.getDriver().quit();
		Setup.getLogger().info("Scenario: " + scenario.getName() + " - finished" + scenario.getStatus());
	}

}
