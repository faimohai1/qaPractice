package sauceDemoElementsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutElementStepOne {
	WebDriver driver;

	public CheckOutElementStepOne(WebDriver driver) {

		this.driver = driver;

	}

	// finding the firstname field

	public WebElement firstNameField() {
		WebElement firstName = driver.findElement(By.id("first-name"));
		return firstName;
	}
	// finding the lastName field
	public WebElement findLastNameField() {
		WebElement lastName = driver.findElement(By.id("last-name"));
		return lastName;
	}
	// finding the zipCode field
	public WebElement findZipField() {
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		return zipCode;
	}
	// finding the continue Button
	public WebElement findContinueButton() {
		WebElement continueButton = driver.findElement(By.id("continue"));
		return continueButton;
	}

}
