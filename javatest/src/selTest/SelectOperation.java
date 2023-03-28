package selTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
//		Selecting from Drorpdown
		
//		Step 1
		
		WebElement drop = driver.findElement(By.name("country"));
		
//		Step 2
		
		Select option = new Select(drop);
		
//		Step3
		
		option.selectByVisibleText("BANGLADESH");
		Thread.sleep(2000);
		
		option.selectByIndex(2);
		Thread.sleep(2000);
		
		option.selectByValue("ALBANIA");
		
		
		
		
//		printing all the options in the dropdown list
		 
		List<WebElement> drpop = option.getOptions();
		
		for(WebElement i: drpop) {
			System.out.println(i.getText());
		}
		
		
		
	}

}
