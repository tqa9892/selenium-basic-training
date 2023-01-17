package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click(); // clicking cookies
																									// by using find
																									// elements
		Thread.sleep(2000);

//		driver.findElement(By.name("email")).sendKeys("setdemo@yahoo.com");
//		//Thread.sleep(1500);
//
//		//: use actions to scroll down the page
		WebDriver scrolldw = (WebDriver) driver.findElement(By.name("doi"));
		Actions actions = new Actions(driver);
		actions.moveToElement((WebElement) scrolldw).perform();
//		

		// : this method is used to select Check box
		driver.findElement(By.name("doi")).click();
		driver.findElement(By.name("doi")).isSelected(); // if select it will tell true or false
		// Thread.sleep(3000);
		// driver.findElement(By.name("doi")).click(); // we can verify the xpath or id
		// in firefix by copying it then press Control f and then check it search box

	}

}