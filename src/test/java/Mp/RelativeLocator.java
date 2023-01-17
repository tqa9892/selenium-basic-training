package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocator {
	public static String browser = "Edge";
	public static WebDriver driver ;

	public static void main(String[] args) {
		if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver ();
			
		}
		else if  (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver ();
			
		}  
	//also the example of using different type of locator ex; by name, id, xpath,cssSelector,link ,partial link etc
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
	//driver.findElement(withTagName("input").ab
		///not finished
	}

	}
