package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver Idriver)
	{
		this.driver=Idriver;
	}
	
	@FindBy(xpath="//input[@id='login_email']") WebElement UserName;
	@FindBy(xpath="//input[@id='login_password']") WebElement Password;
	@FindBy(xpath=".//a[@class='signuppage']") WebElement LogOnButton;
	
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
}
