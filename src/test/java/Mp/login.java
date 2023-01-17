package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/"); // get command will take you to the website
		driver.findElement(By.id("user-name")).sendKeys("standard_user");// findflement will by id will look for id and
		// you have to go the website and right click and select inspect and copy input
		// link or xpath
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // do the same for password as well	
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); // do the same for login button as well and copy xpath.
		driver.close();
	}

}
