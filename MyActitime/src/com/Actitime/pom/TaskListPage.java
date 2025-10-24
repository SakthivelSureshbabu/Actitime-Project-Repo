package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement newTaskBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDescTbx;
	@FindBy(id="customerLightBox_customerSelectorPlaceholder")
	private WebElement existingCustomerDropdown;
	@FindBy(xpath="//*[text()='Our Company']")
	private WebElement ourCompanyLink;
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	@FindBy(className = "innerHtml")
	private WebElement confirmationMsg;
	@FindBy(xpath="//*[@placeholder='Start typing name ...']")
	private WebElement searchBox;
	@FindBy(xpath="//span[@class='highlightToken']/../..//div[@class='editButton available']")
	private WebElement settingsBtn;
	@FindBy(xpath="//div[@class='customerNamePlaceHolder']/..//div[@class='actionButton']")
	private WebElement actionsBtn;
	@FindBy(xpath="//div[contains(@class,'edit_customer_sliding_panel')]//div[@class='deleteButton']")
	private WebElement deleteBtn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement deleteCnfrmBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getCustNameTbx() {
		return custNameTbx;
	}

	public WebElement getCustDescTbx() {
		return custDescTbx;
	}

	public WebElement getExistingCustomerDropdown() {
		return existingCustomerDropdown;
	}

	public WebElement getOurCompanyLink() {
		return ourCompanyLink;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getActionsBtn() {
		return actionsBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeleteCnfrmBtn() {
		return deleteCnfrmBtn;
	}
	
	

}
