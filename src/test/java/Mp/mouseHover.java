package Mp;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement hoverm = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
	     Actions action = new Actions (driver);
	     action.moveToElement(hoverm).perform();

		

	}

}

























