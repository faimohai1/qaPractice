package agileExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
//		chromedriver directory dectlred. browser setup

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

//		webdriver object crtd

		WebDriver driver = new ChromeDriver();

//			Thread.sleep(5000);

//			maximizing the window

		driver.manage().window().maximize();

//			navigate to the link with the created object

		driver.get("https://agileteach.com/");

//  	providing idle time on the window.

		Thread.sleep(3000);

//		deleting cookies

		driver.manage().deleteAllCookies();

//		agileOne sign in with webelements
		WebElement portal = driver.findElement(By.id("dropdownMenuButton"));
		portal.click();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("mohaiminulbd271@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Islam1234++");

		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();

		Thread.sleep(1000);

		WebElement logOutOther = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/form/div[1]/div/a"));
		logOutOther.click();

//			checking if desired destination is reached

	}

}
