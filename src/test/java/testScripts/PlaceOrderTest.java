package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest extends TestBase {
	HomePage HomePage;
	SearchResultPage ResultPage;
	ShoppingCartPage shoppingPage;
	CheckOutPage checkOutPage;
	@BeforeTest
	public void launch() {
		initialize();
	}
  @Test
  public void addItemTest() {
	  HomePage=new HomePage();
	  ResultPage= HomePage.searchItem("Parry Hotter");
	  ResultPage.selectItem();
	  shoppingPage= ResultPage.addItemToCart();
	  shoppingPage.verifyItem();
	  shoppingPage.EnterCoupon("a12345");
	  checkOutPage= shoppingPage.checkout();
	  checkOutPage.enterDetails("mani","R" , "ydewigfiuqwiug", "636006", "salem");
	  checkOutPage.Buy();
	  
  }
}
