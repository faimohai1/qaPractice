package sauceDemoTestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemoElementsNG.CartPage;
import sauceDemoElementsNG.CheckOutElementStepOne;
import sauceDemoElementsNG.CheckOutElementStepTwo;
import sauceDemoElementsNG.InventoryPageElements;
import sauceDemoElementsNG.NgLoginElementSauceDemo;

public class EndToEndTesting extends BaseClass {
	
	
	
	@BeforeTest
	public void preTest() {
		setupChromeDriver();
		navigateHomePage();
	}
	
	
	@AfterTest
	public void postTest() {
		
	}
	
	
	@Test(priority=0)
	public void testLogin() {
		login = new NgLoginElementSauceDemo(driver);

		login.findUserName().sendKeys("standard_user");
		login.findPassword().sendKeys("secret_sauce");
		login.findLoginButton().click();

		String desiredUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();

		// validation of the test if it passed or failed
		// Assert is used to compare expected and actual value and determine if the test
		// is passed or not
		Reporter.log("Login Test");
		Assert.assertEquals(actualUrl, desiredUrl);
		

	}
	@Test(priority=1)
	public void testInventory() {
		inventory.findAddtoCart().click();
		inventory.findCartPage().click();
		
		String addedProductName = cart.findAddedProd().getText();
		String expectedProd= "Sauce Labs Backpack";
		
//		String desiredUrl = "https://www.saucedemo.com/cart.html";
//		String actualUrl = "";
//		actualUrl = driver.getCurrentUrl();
		Reporter.log("adding to cart, navigate to cartpage and check if product is added to the cart");
		Assert.assertEquals(addedProductName,expectedProd);
		
	}
	
	@Test(priority=2)
	public void testCartPage() {
		cart.findCheckOutButton().click();
		
		String desiredUrl = "https://www.saucedemo.com/checkout-step-one.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("testing the cartpage element");

		Assert.assertEquals(desiredUrl,actualUrl);
		
	}

	@Test(priority=2)
	public void testCheckOutStepOne() {
		checkOutOne.firstNameField().sendKeys("Faisal");
		checkOutOne.findLastNameField().sendKeys("Islam");
		checkOutOne.findZipField().sendKeys("22204");;
		checkOutOne.findContinueButton().click();
		
		String desiredUrl = "https://www.saucedemo.com/checkout-step-two.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("Testing the checkout stepOne");

		Assert.assertEquals(desiredUrl,actualUrl);
	}
	
	@Test(priority=3)
	public void testCheckOutStepTwo() {
		checkOutTwo.findfinishButton().click();
		
		String desiredUrl = "https://www.saucedemo.com/checkout-complete.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("Testing the checkout stepTwo");

		Assert.assertEquals(desiredUrl,actualUrl);
		
	
	}
	
	
	
}
