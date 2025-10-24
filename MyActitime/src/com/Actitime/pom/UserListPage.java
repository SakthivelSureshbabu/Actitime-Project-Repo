package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	@FindBy(xpath="//*[text()='Add User']")
	private WebElement newUserBtn;
	@FindBy(name="firstName")
	private WebElement firstNameTbx;
	@FindBy(name="lastName")
	private WebElement lastNameTbx;
	@FindBy(name="email")
	private WebElement emailTbx;
	@FindBy(name="username")
	private WebElement usernameTbx;
	@FindBy(name="password")
	private WebElement passwordTbx;
	@FindBy(name="passwordCopy")
	private WebElement passwordCopyTbx;
	@FindBy(xpath="//*[text()='Create User']")
	private WebElement createUserBtn;
	@FindBy(xpath="//li[@class='firstWarning']/../../..//span[@class='userNameSpan']")
	private WebElement userNameLink;
	@FindBy(xpath="//*[contains(text(),'Delete')]")
	private WebElement deleteUserBtn;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewUserBtn() {
		return newUserBtn;
	}

	public WebElement getFirstNameTbx() {
		return firstNameTbx;
	}

	public WebElement getLastNameTbx() {
		return lastNameTbx;
	}

	public WebElement getEmailTbx() {
		return emailTbx;
	}

	public WebElement getUsernameTbx() {
		return usernameTbx;
	}

	public WebElement getPasswordTbx() {
		return passwordTbx;
	}

	public WebElement getPasswordCopyTbx() {
		return passwordCopyTbx;
	}

	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}

	public WebElement getUserNameLink() {
		return userNameLink;
	}

	public WebElement getDeleteUserBtn() {
		return deleteUserBtn;
	}

}
