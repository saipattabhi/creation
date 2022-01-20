package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signpage {
	
	
	
	WebDriver driver;
	
	public signpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	
	public WebElement emailfield;
	
	
	@FindBy(xpath = "//span[@class='a-button-inner']//input[@id='continue']")
	
	public WebElement continuebutton;
	
	
	public WebElement emailfield()
	{
		return emailfield;
	}
	public WebElement continuebutton()
	{
		return continuebutton;
	}

}
