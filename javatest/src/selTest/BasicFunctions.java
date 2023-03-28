package selTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

	public static void main(String[] args) throws InterruptedException {

//	chromedriver directory dectlred. browser setup

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

//	webdriver object crtd

		WebDriver driver = new ChromeDriver();
		
//		Thread.sleep(5000);

//	navigate to the link with the created object

		driver.get("https://agileteach.com/");
		
//		providing a maximum loading time for the functions to be loaded
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // should be done everytime a link is reached
	
//		maximizing the window
		
		driver.manage().window().maximize();

//  providing idle time on the window.

		Thread.sleep(3000);


//	deleting cookies

		driver.manage().deleteAllCookies();
		
//		returning the current URL
		
		String curUrl= driver.getCurrentUrl();
		System.out.println("Current URL is: "+curUrl);//prints the current url into the 
		
//		reading the title
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
//		finding an web element & clicking on a button
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		Thread.sleep(3000);
		
//		go back to previous page
		
		driver.navigate().back();
		Thread.sleep(3000);

//		go forward
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		
//		refresh the page
		
		driver.navigate().refresh();
		Thread.sleep(3000);

		
//		other way to open  link

		
		
		
//		driver.quit();//doesn't close the browser
		Thread.sleep(5000);
		driver.close();//close browser

	}

}
