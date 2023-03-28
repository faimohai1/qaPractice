package sauceDemoTestNgTest;

import org.testng.annotations.Test;

import sauceDemoElementsNG.NgLoginElementSauceDemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sauceDemoElementsNG.*;
public class SauceDemoTestNG {

	WebDriver driver;
	NgLoginElementSauceDemo login;

	@BeforeTest // annotation from testng library

	public void testStart() {
		// prerequirements go into this
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

	@AfterTest

	public void testEnd() {
		// post-requirements go into this
		driver.quit();

	}

	@BeforeMethod
	public void beforeEachTest() {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

	}

	@Test(priority=0)

	public void loginValidation() {
		login = new NgLoginElementSauceDemo(driver);

//		calling the elements using the functions for them respectively

		login.findUserName().sendKeys("standard_user");
		login.findPassword().sendKeys("secret_sauce");
		login.findLoginButton().click();

		String desiredUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();

		// validation of the test if it passed or failed
		// Assert is used to compare expected and actual value and determine if the test
		// is passed or not

		org.testng.Assert.assertEquals(actualUrl, desiredUrl);
		Reporter.log("Valid Username Login test");
	}

	@Test(priority=1)

	public void failedLoginValidation() {
		

//		calling the elements using the functions for them respectively

		login.findUserName().sendKeys("standad_user");
		login.findPassword().sendKeys("secret_sauce");
		login.findLoginButton().click();

		String desiredUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();

		// validation of the test if it passed or failed
		// Assert is used to compare expected and actual value and determine if the test
		// is passed or not
		Reporter.log("Invalid Username Login test");
		org.testng.Assert.assertEquals(actualUrl, desiredUrl);

	}

}
