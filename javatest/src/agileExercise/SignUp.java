package agileExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		String url = "https://travel.testsigma.com/signup";

		driver.navigate().to(url);

		WebElement fullName = driver.findElement(By.id("name"));
		fullName.sendKeys("Abc ABc");

		WebElement email = driver.findElement(By.id("emailid"));
		email.sendKeys("abc@gmai.com");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("+15965465465");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("4008 a");

		
		WebElement ageGroup = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[3]/div[1]/div/div[2]/label/span"));
		ageGroup.click();

		WebElement gender = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[3]/div[2]/div/div[3]"));
		gender.click();

		WebElement hobbies = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/div[1]/div/div[2]/label/span"));
		hobbies.click();

		WebElement interest = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/div[2]/div/div[2]"));
		interest.click();
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sadasda");
		
		Thread.sleep(2000);
		WebElement cPass = driver.findElement(By.id("cpass"));
		cPass.sendKeys("sadasda");


		WebElement proPic = driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[6]"));
		proPic.click();

		WebElement signUpButton = driver.findElement(By.id("btnid"));
		signUpButton.click();

	}

}
