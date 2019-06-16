package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonPage.commonFunction;

public class RegisterPage extends commonFunction {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;

	@FindBy(name = "btnLogin")
	WebElement SUBMIT_BTN;

	@FindBy(css = "td[text=User ID]+td")
	WebElement USER_LBL;

	@FindBy(css = "td[text=Password]+td")
	WebElement PASS_LBL;

	public void inputEmailToRegister(String value) {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, value);
	}

	public void clickSubmit() {
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
	}

	public String getUserName() {
		waitVisible(USER_LBL);
		return getText(USER_LBL);
	}

	public String getPass() {
		waitVisible(PASS_LBL);
		return getText(PASS_LBL);
	}

	public LoginPage navagateToLoginPage(String url) {
		openUrl(url);
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
