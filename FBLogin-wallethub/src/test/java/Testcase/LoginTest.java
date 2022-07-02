package Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginFb;

public class LoginTest extends BaseClass {

	LoginFb login;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initiliazation();
		login = new LoginFb();
	}

	@Test
	public void douserLogin() {
		login.loginToFacebook(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardownFB() {
		//tear_down();
		
	}

}
