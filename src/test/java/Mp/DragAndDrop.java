package Mp;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// when you have to select i diff frame in same page you have to  switching frame first
		WebElement framesw =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(framesw);
		
	// drag and drop method 	
	WebElement drag = driver.findElement(By.id("draggable"));  //step 1 find location of of draggable element and make it's  variable 
	WebElement drop = driver.findElement(By.id("droppable"));  // step 2 find location of of dropable element and make it's variable 
	
	     Actions action = new Actions (driver);  //step 3 use actions class and make object and use it for drag and drop. done
	     action.dragAndDrop(drag, drop).perform();
	     
//	     Thread.sleep(2000);
//	   
//	 	driver.switchTo().parentFrame();
//	 	
//	 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
//	     
	     

		

	}

}