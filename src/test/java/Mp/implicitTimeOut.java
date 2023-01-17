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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitTimeOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // wait time or time out method to be used if we need to wait for any element specially use after hover over . implicit wait keep the whole script wait when we use it
		//key notes: here after using "implicitlyWait" we see deprecated (deprecated means using old version's method) we can switch to new method which below line //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouseho = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
		
Actions action = new Actions (driver); //mouse hover over method 
action.moveToElement(mouseho).perform();

driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]/div[1]/nav[2]/ul/li[2]/a")).click(); //here we don't need to call the hover over method coz we just need to click the element after hover over on the top

	}

}