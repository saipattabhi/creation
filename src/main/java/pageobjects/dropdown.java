package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dropdown {

	WebDriver driver;

	public dropdown(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='a-button-inner']//span[@id='a-autoid-0-announce']")

	public WebElement select;

	@FindBy(xpath = "//li[@class='a-dropdown-item']//a[@id='ELECTRICITY_0']")

	public WebElement andra;

	public WebElement select() {

		return select;
	}

	public WebElement andra() {

		return andra;
	}

	@FindBy(xpath = "//span[@class='a-button-inner']//span[@data-action='a-dropdown-button']//span[text()='Select Electricity Board to proceed']")

	public WebElement board;
	
	@FindBy(xpath = "//li[@class='a-dropdown-item']//a[@id='ELECTRICITY>hfc-states-andhra-pradesh_1']")
	
	public WebElement eastern;
	
	@FindBy(xpath = "//input[@id='Service Number']")
	
	public WebElement servicenumber;
	
	
	@FindBy(xpath = "//button[@id='fetchBillActionId-announce']//span[@id='fetchBtnText']")
	public WebElement fetchbill;
	
	@FindBy(xpath = "//div[@id='a-popover-content-1']//div[@class='a-section a-padding-medium']")
	
	public WebElement validation;
	
	

	public WebElement board() {
		return board;
	}
	
	public WebElement eastern()
	{
		return eastern;
	}
	public WebElement servicenumber()
	{
		return servicenumber;
	}
	public WebElement fetchbill()
	{
		return fetchbill;
	}
	public WebElement validation()
	{
		return validation;
	}
	
}
