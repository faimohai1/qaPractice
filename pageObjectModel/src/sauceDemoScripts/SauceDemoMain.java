package sauceDemoScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import sauceDemoElements.LoginElements;

public class SauceDemoMain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
//		providing a maximum loading time for the functions to be loaded
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		object of the class with the findElement functions
		
		LoginElements login = new LoginElements(driver); // passing this driver as a parameter to the constructor of the loginPage class
		
//		calling the elements using the functions for them respectively
		
		login.findUserName().sendKeys("standard_user");
		login.findPassword().sendKeys("secret_sauce");
		login.findLoginButton().click();

		String desiredUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = "";
		actualUrl = driver.getCurrentUrl();
		if (actualUrl.contentEquals(desiredUrl)) {
			System.out.println("User Logged in");
		} else {
			System.out.println("User is Navigated to Different location: " + actualUrl);
		}

	}

}
