package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	
	@FindBy(xpath="//ul/li")
	WebElement check;
	
	@FindBy(id="billing-coupon")
	WebElement checkBox;
	
	@FindBy(id="coupon")
	WebElement enterCoupon;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement applyBtn;
	
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
	WebElement checkoutBtn;
	
	@FindBy(xpath="//button[text()='Empty Cart']")
	WebElement emptyCart;
	
	//constructor
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public void verifyItem() {
		if(check.isDisplayed()) {
			checkBox.click();
		}
	}
	public void EnterCoupon(String couponNo) {
		enterCoupon.sendKeys(couponNo);
		
	}
	public void applyCoupon() {
		applyBtn.click();
	}
	
	
	public CheckOutPage checkout() {
		checkoutBtn.click();
		return new CheckOutPage();
	}
}
