package stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.current;
import pageobjects.dropdown;
import pageobjects.passwordpage;
import pageobjects.rebulic;
import pageobjects.signpage;
import pageobjects.welcomepage;
import resources.base;

public class login extends base{
	
	WebDriver driver;
	welcomepage welcome;
	signpage sigin;
	passwordpage password;
	rebulic pay;
	current bill;
	dropdown down;
	
	@Given("^Open the application using browser$")
	public void Open_the_application_using_browser() throws IOException
	{
		
		driver=intializedriver();
		
	}
	@And("^User navigate to the application url$")
	public void User_navigate_to_the_application_url()
	{
		driver.get(prop.getProperty("url"));
		
		 welcome=new welcomepage(driver);
		
		welcome.myaccount.click();
	}
	@When("^User should enter username as (.+) into the fields$")
	public void User_should_enter_username_as_into_the_fields(String username)
	{
		
	    sigin=new signpage(driver);
		sigin.emailfield().sendKeys(username);
	}
	@And("^User should click on continue button$")
	public void User_should_click_on_continue_button()
	{
		sigin.continuebutton().click();
	}
	@When("^User should enter password as (.+) in to the fields$")
	public void User_should_enter_password_as_in_to_the_fields(String passwords)
	{
		
		 password=new passwordpage(driver);
		
		password.passwordfield().sendKeys(passwords);
	}
	@When("^User should click on the sigin button$")
	public void User_should_click_on_the_sigin_button()
	{

		password.submit().click();
		
		
	}
	@When("^User should click on the amazonpay button$")
	public void User_should_click_on_the_amazonpay_button()
	{
		 pay=new rebulic(driver);
		pay.amazonpay().click();
	}
	@When("^User should click on the electricity icon$")
	public void User_should_click_on_the_electricity_icon()
	{
	    bill=new current(driver);
		
		bill.electricity().click();
	}
    @When("^User should click on state$")
    public void  User_should_click_on_state()
    {
    	

    	 down=new dropdown(driver);
    	
    	down.select().click();
    	
    	down.andra().click();
    	down.board().click();
    }
    @When("^User should select electricity board$")
    public void User_should_select_electricity_board()
    {
    
    	down.eastern().click();
    }
    @When("^User enter servicenumber as (.+) in to the fields$")
    public void User_enter_servicenumber_as_in_to_the_fields(String number)
    {
    	down.servicenumber().sendKeys(number);
    }
    @And("^User clicks on the fetch button$")
    public void  User_clicks_on_the_fetch_button()
    {
    	down.fetchbill().click();
    }
    @Then("^User should see the alert on the display$")
    public void User_should_see_the_alert_on_the_display()
    {
    	Assert.assertTrue(down.validation().isDisplayed());
    }
}
