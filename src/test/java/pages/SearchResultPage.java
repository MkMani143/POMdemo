package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css="ul li.preview")
	WebElement ItemPreview;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addtoCartBtn;
	
	

	//constructor
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void selectItem() {
		ItemPreview.click();
	}
	public ShoppingCartPage addItemToCart() {
		addtoCartBtn.click();
		return new ShoppingCartPage();
	}
	

}
