package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passwordpage {
	
WebDriver driver;


public passwordpage(WebDriver driver)
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
	@FindBy(xpath = "//input[@id='ap_password']")
	
	public WebElement passwordfield;
	
	@FindBy(xpath="//span[@class='a-button-inner']//input[@id='signInSubmit']")
	
	public WebElement submit;
	
	
	public WebElement passwordfield()
	{
		
		return passwordfield;
	}
	public WebElement submit()
	{
		
		return submit;
		
	}
	
	
	
	

}
