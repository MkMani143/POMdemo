package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
//	PageFactory for locating the elements
	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id="button-search")
	WebElement searchBtn;
	
	@FindBy(id="cart")
	WebElement viewCartBtn;
	
	//constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//searchItem
	public SearchResultPage searchItem(String strItem) {
		searchBox.sendKeys(strItem);
		searchBtn.click();
		return new SearchResultPage();
	}
}
