package titleCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.GetElementSelected;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class FacebookTitleCheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String desiredUrl ="https://www.facebook.com/";
		String expectedTitle = "Facebook";
		String actualTitle = "";
		driver.navigate().to(desiredUrl);
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Title is: " +actualTitle);
		}
		
//		put data in email field
		
		WebElement email= driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("abc@gmail.com");
		
//		put data in password field
		
		WebElement pass= driver.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("19941995gfd");
		
//		login button click
		
		WebElement loginButton= driver.findElement(By.name("login"));
		loginButton.click();
		
//		checking if expected url is reached after clicking on login button
		
		if(driver.getCurrentUrl().contentEquals(desiredUrl)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		Thread.sleep(10000);
	
		driver.close();
		
		
		
	}

}
