package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonPage.commonFunction;

public class HomePage extends commonFunction {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(tagName = "marquee")
	WebElement WELCOME_LBL;

	@FindBy(linkText = "New Customer")
	WebElement NEW_CUSTOMER_LINK;

	public String getTextWelcome() {
		waitVisible(WELCOME_LBL);
		return getText(WELCOME_LBL);
	}

	public NewCustomer clickNewCustomer() {
		waitVisible(NEW_CUSTOMER_LINK);
		click(NEW_CUSTOMER_LINK);
		return PageFactory.initElements(driver, NewCustomer.class);
	}
}
