package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserFactory {

	
	static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername)
	{
		
		if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",DataProviderFactory.getDataConfig().getfirefoxpath());
			driver=new FirefoxDriver();
		}
		
		if (browsername.equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.ie.driver",DataProviderFactory.getDataConfig().getiepath());
			driver=new InternetExplorerDriver();
		}
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getDataConfig().getchromepath());
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	public static void closeBrowser(WebDriver Idriver)
	{
		//Idriver.quit();
	}
	
}
