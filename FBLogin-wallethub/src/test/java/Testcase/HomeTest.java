package Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import Base.BaseClass;
import Page.HomePage;
import Page.LoginFb;

public class HomeTest extends BaseClass {


    LoginFb login; 
    HomePage home;
	public HomeTest()
	{
		super();
	}
	
	@BeforeTest
	public void setup()
	{
		initiliazation();
		login=new LoginFb();
		home=login.loginToFacebook(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void validateUsernameTitleTest()
	{
		boolean flag=home.validateUserName();
		Assert.assertEquals(flag, true, "validateUserNameTitleTest success !!!");
	}
	
	@Test(priority = 2)
	public void creatingPost() throws InterruptedException 
	{
		Thread.sleep(2000);
		home.clickingOnMenu();
	}
	
	@Test(priority = 3)
	public void clickingOnPost()
	{
		home.sendingPost();
	}
	
	
}
