package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethodInInterface {
	
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
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.partialLinkText("Bike Light")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("http://www.google.com");
		
		//driver.close();
		//driver.get("https://www.selenium.dev/documentation/webdriver/");
		//driver.findElement(By.linkText("Elements")).click();
		
	}



	}


