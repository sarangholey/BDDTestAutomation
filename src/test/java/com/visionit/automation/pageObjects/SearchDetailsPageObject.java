package com.visionit.automation.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class SearchDetailsPageObject {

	private static final Logger logger = LogManager.getLogger(SearchDetailsPageObject.class);

	//Section1:  Declare a driver object
	private WebDriver driver;
	Scenario scn;

	public SearchDetailsPageObject(WebDriver driver, Scenario scn)
	{
		this.driver = driver;
		this.scn = scn;
	}

	//Section 2 : Define the locators





	// Associated Methods
	public void validationProdNameTitle(String prodNameInTitle)
	{
		//Wait for titile
		WebDriverWait webDriverWait1 = new WebDriverWait(driver,20);
		webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : " + prodNameInTitle));

		//Assertion for Page Title
		Assert.assertEquals("Page Title validation","Amazon.in : " + prodNameInTitle, driver.getTitle());
		scn.log("Page title validation for Product name in title ->" + prodNameInTitle + " is successful");
		logger.info("Page title validation for Product name in title ->" + prodNameInTitle + " is successful");
	}


}
