package Mp;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.bouncycastle.util.Times;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//key notes: here after using "implicitlyWait" we see deprecated (deprecated means using old version's method) we can switch to new method which below line //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //for implicit wait we just use this line to wait for whole script
		WebElement mouseho = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
		
Actions action = new Actions (driver); //mouse hover over method 
action.moveToElement(mouseho).perform();

WebDriverWait explicitwait = new WebDriverWait(driver ,Duration.ofSeconds(10));
explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
// explicit wait is necessary when we only need to wait for that particular element. not the whole script wait for explicit wait
// when you copy xpath from the same script it doesn't stay same have modify like this one
//driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click(); 

	}

}