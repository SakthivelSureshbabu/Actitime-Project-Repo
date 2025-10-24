package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="USERS")
	private WebElement userListPage;
	@FindBy(linkText = "TASKS")
	private WebElement taskListPage;
	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserList() {
		userListPage.click();
	}
	public void setTaskList() {
		taskListPage.click();
	}
	public void setLogout() {
		logoutBtn.click();
	}

}
