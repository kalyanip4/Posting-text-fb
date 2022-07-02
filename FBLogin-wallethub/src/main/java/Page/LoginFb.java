package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginFb extends BaseClass {

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public LoginFb()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginToFacebook(String username1,String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
		login.click();
		return new HomePage();
	}
	
	
	
	
	
	
}
