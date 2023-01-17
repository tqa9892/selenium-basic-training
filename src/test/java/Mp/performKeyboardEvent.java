package Mp;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class performKeyboardEvent {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
	WebElement	copylocation = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[4]/pre/span"));
		
	Actions action = new Actions (driver);
	action.keyDown(copylocation, Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
	
	WebElement pastarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//div[5]/div[4]/pre/span"));
	
	action.keyDown(pastarea, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
		
		
		
	
	
		

	}

}