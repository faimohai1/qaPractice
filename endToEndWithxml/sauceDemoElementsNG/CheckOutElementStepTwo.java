package sauceDemoElementsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutElementStepTwo {
	WebDriver driver;

	public CheckOutElementStepTwo(WebDriver driver) {

		this.driver = driver;

	}
	
	public WebElement findfinishButton() {
		WebElement finishButon = driver.findElement(By.id("finish"));
		return finishButon;
	}
}
