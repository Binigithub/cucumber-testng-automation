package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class SuiteCRMCreateContactPage {
	private WebDriver driver;

	public SuiteCRMCreateContactPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	public WebElement firsName;

	@FindBy(id = "last_name")
	public WebElement lastName;

	@FindBy(id = "phone_work")
	public WebElement officePhoneNumber;

	@FindBy(id = "department")
	public WebElement department;

	@FindBy(id = "SAVE")
	public WebElement save;
}









