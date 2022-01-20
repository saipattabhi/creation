package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.current;
import pageobjects.dropdown;
import pageobjects.passwordpage;
import pageobjects.rebulic;
import pageobjects.signpage;
import pageobjects.welcomepage;
import resources.base;

public class amazon extends base{
	
	WebDriver driver;
	
	
@Test
public void pratice() throws IOException
{
	
	 driver=intializedriver();
	
	driver.get(prop.getProperty("url"));
	
	welcomepage welcome=new welcomepage(driver);
	
	welcome.myaccount.click();
	
	signpage sigin=new signpage(driver);
	sigin.emailfield().sendKeys("saipattabhi18@gmail.com");
	sigin.continuebutton().click();
	
	
	passwordpage password=new passwordpage(driver);
	
	password.passwordfield().sendKeys("Sai@2255");
	
	password.submit().click();
	rebulic pay=new rebulic(driver);
	
	pay.amazonpay().click();
	current bill=new current(driver);
	
	bill.electricity().click();
	
	dropdown down=new dropdown(driver);
	
	down.select().click();
	
	down.andra().click();
	down.board().click();
	
	down.eastern().click();
	down.servicenumber().sendKeys("1442160210000055");
	
	down.fetchbill().click();
	
	
	
	
	Assert.assertTrue(down.validation().isDisplayed());
	
}
	
	
	
	
	
	

}
