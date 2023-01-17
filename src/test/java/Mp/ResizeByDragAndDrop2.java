package Mp;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeByDragAndDrop2 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		// when you have to select i diff frame in same page you have to  switching frame first
		WebElement framesw =driver.findElement(By.xpath("//*[@id=\"content\"]/iframee"));
		driver.switchTo().frame(framesw);
		
	// drag and drop method 	
	WebElement resizedrag = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));  
	
	     Actions action = new Actions (driver);  
	     action.dragAndDropBy(resizedrag, 300, 100).perform();
		

	}

}