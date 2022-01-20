package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class current {
	
 WebDriver driver;	
	
	public current(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//div[@class='a-section a-spacing-none a-text-center icon-text-section']//span[text()='Electricity']")
	
	public WebElement electricity;
	
	public WebElement electricity()
	{
		
		return electricity;
	}
	

}
