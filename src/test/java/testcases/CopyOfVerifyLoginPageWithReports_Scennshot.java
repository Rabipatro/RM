package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class CopyOfVerifyLoginPageWithReports_Scennshot {

WebDriver driver;
ExtentReports report;
ExtentTest logger;

	
	@BeforeMethod
	public void setup()
	{
		report=new ExtentReports("./Reports/LoginPageReport.html",true);
		logger=report.startTest("Verify Test Login");
		driver=BrowserFactory.getbrowser("chrome");
		driver.get(DataProviderFactory.getDataConfig().getApplicationUrl());
		logger.log(LogStatus.INFO, "Application is up and Running");
	}
	
	@Test
	public void testHomePage()
	{
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		home.loginApplication("rabipatro.patro@gmail.com", "12345678");
		
		logger.log(LogStatus.INFO, "Click in Login");
		
        String title=home.getApplicationTitle();
		
		Assert.assertEquals(title, "Log In - Apptivo");	
		logger.log(LogStatus.PASS, "HomePage Loaded Successfully");
		
		
		
		
	}
	@AfterMethod
	public void tearDown()
	{
		//BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
	}

}
