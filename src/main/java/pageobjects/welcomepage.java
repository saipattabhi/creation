package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepage {
	
	
WebDriver driver;


public welcomepage(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	
}
	
@FindBy(xpath = "//a[@id='nav-link-accountList']")	

public WebElement myaccount;
	
	public WebElement myaccount()
	{
		
		return myaccount;
	}
	
	

}
