package agileExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceInvalid {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.navigate().to("https://www.saucedemo.com/");
	

	WebElement userName = driver.findElement(By.id("user-name"));
	WebElement password = driver.findElement(By.id("password"));
	WebElement loginButton = driver.findElement(By.id("login-button"));
	
	userName.sendKeys("problem_user");
	password.sendKeys("secret_sace");
	loginButton.click();

	String desiredUrl = "https://www.saucedemo.com/inventory.html";
	String actualUrl = "";
	actualUrl = driver.getCurrentUrl();

	
	if (actualUrl.contentEquals(desiredUrl)) {
		System.out.println("User Logged in");
	} else {
		System.out.println("Login Failed! User is Navigated to Different location: " + actualUrl);
	}
}
}
