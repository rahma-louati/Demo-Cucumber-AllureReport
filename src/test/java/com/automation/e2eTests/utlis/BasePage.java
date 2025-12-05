package com.automation.e2eTests.utlis;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;
	protected static Logger Log = LogManager.getLogger();
	
	public BasePage(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	
	}
	
}
