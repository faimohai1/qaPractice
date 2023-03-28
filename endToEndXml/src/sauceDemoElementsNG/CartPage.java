package sauceDemoElementsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement findCheckOutButton() {
		WebElement checkOutButton = driver.findElement(By.id("checkout"));
		return checkOutButton;
	}
	public WebElement findAddedProd() {
		WebElement addedProd = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div"));
		return addedProd;
	}

}
