package Mp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethodInInterface2 {
	
	public static String browser = "Chrome";
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
		//driver.findElements(By.xpath(browser))
		 List<WebElement> webelements = driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div")); //when you need to find all elements in a page so we go to the site and inspect use control F to write xpath to get all the items in that page to make sure all (learn more https://www.youtube.com/watch?v=FtpIv7T6G28&t=588s )
	System.out.println(webelements);
	driver.navigate().to("https://www.sugarcrm.com/");
	String windowhandler=driver.getWindowHandle();
	System.out.println(windowhandler);
	
	//driver.findElement(null)
	
	
	
	}



	}


