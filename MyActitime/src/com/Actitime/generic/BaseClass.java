package com.Actitime.generic;

import java.io.IOException;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public FileLib f = new FileLib();
	@BeforeTest
	public void openBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = f.readPropertyData("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
//		driver.get("http://localhost/login.do");
		
	}
	@BeforeMethod
	public void login() throws IOException {
		
		LoginPage l = new LoginPage(driver);
		String un = f.readPropertyData("un");
		String pwd = f.readPropertyData("pwd");
		l.setLogin(un, pwd);
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.xpath("//*[text()='Login ']")).click();
		
	}
	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.setLogout();
		
//		driver.findElement(By.id("logoutLink")).click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}

}
