package sauceDemoTestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sauceDemoElementsNG.CartPage;
import sauceDemoElementsNG.CheckOutElementStepOne;
import sauceDemoElementsNG.CheckOutElementStepTwo;
import sauceDemoElementsNG.InventoryPageElements;
import sauceDemoElementsNG.NgLoginElementSauceDemo;

public class BaseClass {
	WebDriver driver;
	NgLoginElementSauceDemo login;
	InventoryPageElements inventory;
	CartPage cart;
	CheckOutElementStepOne checkOutOne;
	CheckOutElementStepTwo checkOutTwo;
	
	
	public void setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new NgLoginElementSauceDemo(driver);
		inventory = new InventoryPageElements(driver);
		cart= new CartPage(driver);
		checkOutOne= new CheckOutElementStepOne(driver);
		checkOutTwo= new CheckOutElementStepTwo(driver);

		
	}
	
	public void navigateHomePage() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
