package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonPage.commonFunction;

public class LoginPage extends commonFunction {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "here")
	WebElement HERE_LINK;

	@FindBy(name = "uid")
	WebElement USER_TXT;

	@FindBy(name = "password")
	WebElement PASS_TXT;

	@FindBy(name = "btnLogin")
	WebElement LOGIN_BTN;

	public RegisterPage clickHereLink() {
		waitVisible(HERE_LINK);
		click(HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);
	}

	public void inputUserName(String value) {
		waitVisible(USER_TXT);
		input(USER_TXT, value);
	}

	public void inputPass(String value) {
		waitVisible(PASS_TXT);
		input(PASS_TXT, value);
	}

	public HomePage clickLogin() {
		waitVisible(LOGIN_BTN);
		click(LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
