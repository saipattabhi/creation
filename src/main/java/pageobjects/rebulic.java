package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rebulic {
	
	WebDriver driver;
	
	public rebulic(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//div[@id='nav-xshop-container']//a[text()='Amazon Pay']")
	
	public WebElement amazonpay;
	
	
	public WebElement amazonpay()
	{
		
		return amazonpay;
	}
	
	

}
