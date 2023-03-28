package sauceDemoTestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sauceDemoElementsNG.NgLoginElementSauceDemo;

public class LoginDatadriven extends BaseClass{
	
	WebDriver driver;
	NgLoginElementSauceDemo login;

	@BeforeTest // annotation from testng library

	public void testStart() {
		// prerequirements go into this
		setupChromeDriver();
		navigateHomePage();
	}

	@AfterTest

	public void testEnd() {
		// post-requirements go into this
//		driver.quit();

	}

	
	@Parameters({"username","password","expectedUrl"})
	@Test(priority=0)

	public void loginDataDriventest(String username, String password, String expectedUrl ) {
		login = new NgLoginElementSauceDemo(driver);

//		calling the elements using the functions for them respectively

		login.findUserName().sendKeys(username);
		login.findPassword().sendKeys(password);
		login.findLoginButton().click();

		
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();

		// validation of the test if it passed or failed
		// Assert is used to compare expected and actual value and determine if the test
		// is passed or not

		org.testng.Assert.assertEquals(actualUrl, expectedUrl);
		Reporter.log("Valid Username Login test");
	}

	


}
