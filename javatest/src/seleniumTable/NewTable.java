package seleniumTable;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP USER\\Desktop\\lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.navigate().to("https://docs.oracle.com/javase/tutorial/uiswing/components/table.html");
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[4]/div[6]/table[1]"));
		List<WebElement> rowFfetch = table.findElements(By.tagName("tr"));
		int rowsCount = rowFfetch.size();
		
		
		for(int row=0;row<rowsCount; row++) {
			List<WebElement> columnFetch= rowFfetch.get(row).findElements(By.tagName("td"));
			int columnsCount = columnFetch.size();
			System.out.println("Row: "+row);
			for(int column=0; column<columnsCount; column++) {
				System.out.println("column data is: "+columnFetch.get(column).getText());
			}
		}
	}

}
