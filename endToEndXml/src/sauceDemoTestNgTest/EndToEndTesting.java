package sauceDemoTestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
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
	
	@Parameters({"userName","password","desiredUrl"})
	@Test(priority=0)
	public void testLogin(String userName, String password, String desiredUrl) {
		login = new NgLoginElementSauceDemo(driver);

		login.findUserName().sendKeys(userName);
		login.findPassword().sendKeys(password);
		login.findLoginButton().click();

		
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();

		// validation of the test if it passed or failed
		// Assert is used to compare expected and actual value and determine if the test
		// is passed or not
		Reporter.log("Login Test");
		Assert.assertEquals(actualUrl, desiredUrl);
		

	}
	@Parameters({"expectedProd"})
	@Test(priority=1)
	public void testInventory(String expectedProd) {
		inventory.findAddtoCart().click();
		inventory.findCartPage().click();
		
		String addedProductName = cart.findAddedProd().getText();
		
		
//		String desiredUrl = "https://www.saucedemo.com/cart.html";
//		String actualUrl = "";
//		actualUrl = driver.getCurrentUrl();
		Reporter.log("adding to cart, navigate to cartpage and check if product is added to the cart");
		Assert.assertEquals(addedProductName,expectedProd);
		
	}
	
	@Parameters({"desiredUrlOne"})
	
	@Test(priority=2)
	public void testCartPage(String desiredUrlOne) {
		cart.findCheckOutButton().click();
		
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("testing the cartpage element");

		Assert.assertEquals(actualUrl,desiredUrlOne);
		
	}
	
	@Parameters({"firstName","lastName","zip","desiredUrlTwo"})

	@Test(priority=2)
	public void testCheckOutStepOne(String firstName, String lastName, String zip, String desiredUrlTwo) {
		checkOutOne.firstNameField().sendKeys(firstName);
		checkOutOne.findLastNameField().sendKeys(lastName);
		checkOutOne.findZipField().sendKeys(zip);;
		checkOutOne.findContinueButton().click();
		
		
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("Testing the checkout stepOne");

		Assert.assertEquals(actualUrl,desiredUrlTwo);
	}
	@Parameters({"desiredUrlFinal"})
	@Test(priority=3)
	public void testCheckOutStepTwo(String desiredUrlFinal) {
		checkOutTwo.findfinishButton().click();
		
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		Reporter.log("Testing the checkout stepTwo");

		Assert.assertEquals(actualUrl,desiredUrlFinal);
		
	
	}
	
	
	
}
