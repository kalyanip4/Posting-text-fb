package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestUtil;

import Base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@aria-label='Menu']")
	WebElement menu;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	WebElement post;
	

	@FindBy(xpath="(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[1]")
	WebElement UserNameText;
	
	@FindBy(xpath="//p[@class='i1ao9s8h hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5']")
	WebElement PostText;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	WebElement Postclick;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean validateUserName()
	{
		
		String str=TestUtil.user;
		if(str.contains((CharSequence) UserNameText))
		{
			System.out.println("User is on home page");
			return true;
		}
		else 
			return false;
	}
	
	public void clickingOnMenu()
	{
		menu.click();
		post.click();
	}
	
	public void sendingPost()
	{
		PostText.sendKeys("Hello World");
		Postclick.click();
	}
	
	
}
