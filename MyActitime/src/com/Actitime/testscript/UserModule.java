package com.Actitime.testscript;

import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.generic.BaseClass;
import com.Actitime.generic.FileLib;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.UserListPage;
@Listeners(com.Actitime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{
	public FileLib f = new FileLib();
	@Test
	public void createUser() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h = new HomePage(driver);
		h.setUserList();
//		driver.findElement(By.linkText("USERS")).click();
		UserListPage ul = new UserListPage(driver);
		ul.getNewUserBtn().click();
//		driver.findElement(By.xpath("//*[text()='Add User']")).click();
		String firstName = f.readExcelData("addUser", 1, 0);
		ul.getFirstNameTbx().sendKeys(firstName);
//		driver.findElement(By.name("firstName")).sendKeys("Bolt");
		String lastName = f.readExcelData("addUser", 1, 1);
		ul.getLastNameTbx().sendKeys(lastName);
//		driver.findElement(By.name("lastName")).sendKeys("Thunder");
		String email = f.readExcelData("addUser", 1, 2);
		ul.getEmailTbx().sendKeys(email);
//		driver.findElement(By.name("email")).sendKeys("Thunderbolt@light.com");
		String username = f.readExcelData("addUser", 1, 3);
		ul.getUsernameTbx().sendKeys(username);
//		driver.findElement(By.name("username")).sendKeys("BOLT");
		String password = f.readExcelData("addUser", 1, 4);
		ul.getPasswordTbx().sendKeys(password);
//		driver.findElement(By.name("password")).sendKeys("MiAmor");
		ul.getPasswordCopyTbx().sendKeys(password);
//		driver.findElement(By.name("passwordCopy")).sendKeys("MiAmor");Thread.sleep(1000);
		ul.getCreateUserBtn().click();
//		driver.findElement(By.xpath("//*[text()='Create User']")).click();Thread.sleep(2000);
		ul.getUserNameLink().click();
		String name = ul.getUserNameLink().getText();
//		driver.findElement(By.xpath("//*[contains(text(),'Thunder')]")).click();Thread.sleep(2000);
		ul.getDeleteUserBtn().click();
//		driver.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Assert.assertNotEquals(name, "There are no users found");
	}
}