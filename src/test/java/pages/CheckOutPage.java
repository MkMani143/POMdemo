package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage extends TestBase{
	
	@FindBy(id="s-name")
	WebElement name;
	
	@FindBy(id="s-surname")
	WebElement surName;
	
	@FindBy(id="s-address")
	WebElement address;
	
	@FindBy(id="s-zipcode")
	WebElement zipcode;
	
	@FindBy(id="s-city")
	WebElement city;
	
	@FindBy(id="single")
	WebElement radioBtn;
	
	@FindBy(xpath="//button[text()='Buy']")
	WebElement buy;
	
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void enterDetails(String Name, String SurName, String Address, String Zipcode, String City) {
		name.sendKeys(Name);
		surName.sendKeys(SurName);
		address.sendKeys(Address);
		zipcode.sendKeys(Zipcode);
		city.sendKeys(City);
		radioBtn.click();
	}
	
	public void Buy() {
		buy.click();
	}
	
	
}
