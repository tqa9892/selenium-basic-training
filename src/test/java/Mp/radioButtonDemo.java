package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.singaporeair.com/en_UK/us/home?gclid=EAIaIQobChMIiZ3H0YWC-wIVhdzICh08vAGcEAAYASAAEgI0dPD_BwE&gclsrc=aw.ds#/book/bookflight");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cookie-continue\"]/div")).click();
		//here i have scroll down, radio button and count radio button method. system doesn't run everything together. so i run one method at a time 
		
//	// scroll down method
//	WebElement scrolld =driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[2]/div[3]/div/button"));
//	Actions actions = new Actions (driver);
//	actions.moveToElement(scrolld);
//	actions.perform();
//	
////Radio button selection
//	WebElement radio1 = driver.findElement(By.id("bookFlights"));
//	WebElement radio2 = 
			driver.findElement(By.id("redeemFlights")).click();
			System.out.println(driver.findElement(By.id("redeemFlights")).isSelected());
			
		//System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());
	
	//radio2.click();
//	System.out.println(radio1.isSelected());
//	System.out.println(radio2.isSelected());
//	
	
	//driver.findElement(By.id("bookFlightDestination")).sendKeys("newyork");
	
	
	
	}

}