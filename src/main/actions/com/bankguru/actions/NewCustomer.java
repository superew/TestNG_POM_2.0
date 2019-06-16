package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonPage.commonFunction;

public class NewCustomer extends commonFunction {

	public NewCustomer(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "name")
	WebElement CUS_NAME;

	@FindBy(id = "message")
	WebElement CUS_MSG;

	@FindBy(css = "input[value=m]")
	WebElement GEN_MALE_CBX;

	@FindBy(css = "input[value=f]")
	WebElement GEN_FEMALE_CBX;

	@FindBy(css = "input#dod")
	WebElement DOB_TXT;

	@FindBy(css = "textarea[name=addr]")
	WebElement ADD_TXT;

	@FindBy(id = "message3")
	WebElement ADD_MSG;

	@FindBy(name = "city")
	WebElement CITY_TXT;

	@FindBy(id = "message4")
	WebElement CITY_MSG;

	@FindBy(name = "state")
	WebElement STATE_TXT;

	@FindBy(id = "message5")
	WebElement STATE_MSG;

	@FindBy(name = "pinno")
	WebElement PIN_TXT;

	@FindBy(id = "message6")
	WebElement PIN_MSG;

	@FindBy(name = "telephoneno")
	WebElement MOBILE_TXT;

	@FindBy(id = "message7")
	WebElement MOBILE_MSG;

	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;

	@FindBy(id = "message9")
	WebElement EMAIL_MSG;

	@FindBy(name = "password")
	WebElement PASS_TXT;

	@FindBy(id = "message18")
	WebElement PASS_MSG;

	public void inputCustomerName(String value) {
		waitVisible(CUS_NAME);
		input(CUS_NAME, value);
	}

	public String getMsgCustomerLabel() {
		waitVisible(CUS_MSG);
		return getText(CUS_MSG);
	}

	public void inputKeysCustomerName(Keys key) {
		waitVisible(CUS_NAME);
		inputKeys(CUS_NAME, key);
	}

	public void selectGenderMale() {
		waitVisible(GEN_MALE_CBX);
		click(GEN_MALE_CBX);
	}

	public void inputDOB(String value) {
		waitVisible(DOB_TXT);
		input(DOB_TXT, value);
	}

	public void inputKeysAddress(Keys key) {
		waitVisible(ADD_TXT);
		inputKeys(ADD_TXT, key);
	}

	public String getMsgAddress() {
		waitVisible(ADD_MSG);
		return getText(ADD_MSG);
	}

	public void inputAddress(String value) {
		waitVisible(ADD_TXT);
		input(ADD_TXT, value);
	}

	public void inputKeysCity(Keys key) {
		waitVisible(CITY_TXT);
		inputKeys(CITY_TXT, key);
	}

	public String getMsgCity() {
		waitVisible(CITY_MSG);
		return getText(CITY_MSG);
	}

	public void inputCity(String value) {
		waitVisible(CITY_TXT);
		input(CITY_TXT, value);
	}

	public void inputKeysState(Keys key) {
		waitVisible(STATE_TXT);
		inputKeys(STATE_TXT, key);
	}

	public String getMsgState() {
		waitVisible(STATE_MSG);
		return getText(STATE_MSG);
	}

	public void inputState(String value) {
		waitVisible(STATE_TXT);
		input(STATE_TXT, value);
	}

	public void inputKeysPin(Keys key) {
		waitVisible(PIN_TXT);
		inputKeys(PIN_TXT, key);
	}

	public String getMsgPin() {
		waitVisible(PIN_MSG);
		return getText(PIN_MSG);
	}

	public void inputPin(String value) {
		waitVisible(PIN_TXT);
		input(PIN_TXT, value);
	}

	public void inputKeysPhone(Keys key) {
		waitVisible(MOBILE_TXT);
		inputKeys(MOBILE_TXT, key);
	}

	public String getMsgPhone() {
		waitVisible(MOBILE_MSG);
		return getText(MOBILE_MSG);
	}

	public void inputPhone(String value) {
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, value);
	}
}
