package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	//this construct is help to me initilaze the driver...Idriver is local driver and driver is global driver
	public HomePage(WebDriver Idriver)
	{
		//whatever driver we will get that will assign to local driver and idriver will come from test case
		//and we will initlize to driver
		this.driver=Idriver;
	}
	@FindBy(xpath="//input[@id='login_email']") WebElement UserName;
	@FindBy(xpath="//input[@id='login_password']") WebElement Password;
	@FindBy(xpath=".//a[@class='signuppage']") WebElement LogOnButton;
	@FindBy(xpath="//a[@id='drop3']") WebElement UsernameCapture;
	@FindBy(xpath="//button[text()='Log Off']") WebElement Logout;
	@FindBy(xpath="//span[text()='My Agenda']") WebElement HomeText;
	
	public void clearall()
	{
		UserName.clear();
		//Password.clear();
	}
	public void loginApplication(String User,String Pass)
	{
		UserName.sendKeys(User);
		Password.sendKeys(Pass);
		LogOnButton.click();		
	}
	public String getHomePageText()
	{
		return HomeText.getText();
		
	}
	public void getUsernameLogin()
	{
		UsernameCapture.getTagName();
	}
	public void ClickOnLogoutLink()
	{
		Logout.click();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
}
