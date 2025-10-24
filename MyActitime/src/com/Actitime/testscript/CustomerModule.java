package com.Actitime.testscript;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;
//import java.time.Duration;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.generic.BaseClass;
import com.Actitime.generic.FileLib;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskListPage;
@Listeners(com.Actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	public FileLib f = new FileLib();
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
			HomePage h = new HomePage(driver);
			h.setTaskList();
//	        driver.findElement(By.linkText("TASKS")).click();
			TaskListPage tl = new TaskListPage(driver);
			tl.getNewTaskBtn().click();
//			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			tl.getNewCustomerBtn().click();
//	        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			String custName = f.readExcelData("createCustomer", 1, 1);
			tl.getCustNameTbx().sendKeys(custName);
//	        driver.findElement(By.id("customerLightBox_nameField")).sendKeys("ICICI-073");
			String custDesc = f.readExcelData("createCustomer", 1, 2);
			tl.getCustDescTbx().sendKeys(custDesc);
//	        driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("banking");
			tl.getExistingCustomerDropdown().click();
//	        driver.findElement(By.id("customerLightBox_customerSelectorPlaceholder")).click();Thread.sleep(2000);
			tl.getOurCompanyLink().click();
//	        driver.findElement(By.xpath("//*[text()='Our Company']")).click();
			tl.getCreateCustomerBtn().click();
//	        driver.findElement(By.xpath("//span[text()='Create Customer']")).click();Thread.sleep(2000);
			String actualText = tl.getConfirmationMsg().getText();
//	        String text = driver.findElement(By.className("innerHtml")).getText();
	        Assert.assertEquals(actualText, "Customer '"+custName+"' has been created");
	}
	
// DELETE CUSTOMER STEPS
	@Test
	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h = new HomePage(driver);
		h.setTaskList();
//		driver.findElement(By.xpath("//*[text()='TASKS']")).click();
		TaskListPage tl = new TaskListPage(driver);
		String customerName = f.readExcelData("createCustomer", 1, 1);
		tl.getSearchBox().sendKeys(customerName);
//		driver.findElement(By.xpath("(//*[@placeholder='Start typing name ...'])[1]")).sendKeys("Crea");
		tl.getSettingsBtn().click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='highlightToken']/../..//div[@class='editButton available']")).click();Thread.sleep(2000);
		tl.getActionsBtn().click();Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='customerNamePlaceHolder']/..//div[@class='actionButton']")).click();Thread.sleep(2000);
		tl.getDeleteBtn().click();
//		driver.findElement(By.xpath("//div[contains(@class,'edit_customer_sliding_panel')]//div[@class='deleteButton']")).click();
		tl.getDeleteCnfrmBtn().click();
//		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		String actualText = tl.getConfirmationMsg().getText();
		// String text = driver.findElement(By.className("innerHtml")).getText();
		Assert.assertEquals(actualText, "Customer '"+customerName+"' has been deleted");
	}

}
