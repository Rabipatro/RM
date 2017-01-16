package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPage {

WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=BrowserFactory.getbrowser("chrome");
		driver.get(DataProviderFactory.getDataConfig().getApplicationUrl());
	}
	
	@Test
	public void testHomePage()
	{
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		login.loginApplication("rabipatro.patro@gmail.com", "12345678");
		
				
		
	}
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}

}
