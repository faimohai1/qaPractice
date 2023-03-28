package sauceDemoElementsNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPageElements {
	WebDriver driver;
	public InventoryPageElements(WebDriver driver) {
		this.driver=driver;
	}
	
//	finding the add to cart button
	public WebElement findAddtoCart() {
		WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		return addToCart;
	}
//	finding the cartPage butotn
	public WebElement findCartPage() {
		WebElement cartPage = driver.findElement(By.id("shopping_cart_container"));
		return cartPage;
	}
	
}
