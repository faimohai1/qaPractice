package sauceDemoElementsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NgLoginElementSauceDemo {
	WebDriver driver;
	
	public NgLoginElementSauceDemo(WebDriver driver) {
		this.driver = driver;
}
	//getting the username
		public WebElement findUserName() {
			WebElement userName = driver.findElement(By.id("user-name"));
			return userName;
		}
		
		
//		getting the password
		public WebElement findPassword() {
			WebElement password = driver.findElement(By.id("password"));
			return password;
		}
		
		
//		getting the login buttton
		public WebElement findLoginButton() {
			WebElement loginButton = driver.findElement(By.id("login-button"));
			return loginButton;
		}
}