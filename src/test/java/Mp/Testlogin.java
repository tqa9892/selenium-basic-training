package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogin {
	public static String browser= "chrome"; //by only changing different browser we can change browser
	public static WebDriver driver ;

	public static void main(String[] args) { // How to use diff. Locator 
		
		if (browser.equals("chrome"))
		{ WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver () ;
			
		}
		else if (browser.equals("edge"))
		{
	
		WebDriverManager.edgedriver ().setup() ;
		 driver = new EdgeDriver ();
		}
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.partialLinkText("Backpack")).click();
		
	
	

	}

}
