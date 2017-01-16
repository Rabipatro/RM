package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import DataProvider.ConfigDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
	
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
			
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		home.loginApplication("rabipatro.patro@gmail.com", "12345678");
		
		String title=home.getApplicationTitle();
		
		System.out.println("Home Page Title is:  " +title);
		
		Assert.assertTrue(title.contains("Log In - Apptivo"));
		
		System.out.println("TC passed  ");
		
		String bydefault=home.getHomePageText();
		System.out.println("Budefault Home Page  is:  " +bydefault);
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}

}
  