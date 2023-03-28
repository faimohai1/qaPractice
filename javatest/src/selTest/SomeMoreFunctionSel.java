package selTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeMoreFunctionSel {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement userName= driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("456465");
		
//		check an element if its displayed and selected in the page and return it in boolean & 
		
		boolean flag = password.isDisplayed();
		System.out.println(flag);
		password.click();
		boolean flag3 = password.isSelected();
		System.out.println(flag3);
		
//		check an element if its enabled in the page and return it in boolean
				
		WebElement signInButton =driver.findElement(By.id("login-button"));
		boolean flag2 = signInButton.isEnabled();
		System.out.println(flag2);
		
		
		
	}

}
