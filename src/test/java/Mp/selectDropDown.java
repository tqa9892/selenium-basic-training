package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropDown {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();  //clicking cookies by using find elements 
		//Thread.sleep(5000);
		// DropDown method start
		driver.findElement(By.name("email")).sendKeys("setdemo@yahoo.com");
		WebElement dd = driver.findElement(By.id("how-select"));
		Select select = new Select (dd);
		select.selectByIndex(2);
		select.selectByValue("Event");
		//Thread.sleep(5000); // i used this waiting timing milliseconds method so that i can see process 
		select.selectByVisibleText("Previously Used");
		
		
	
//		WebElement drdown = driver.findElement(By.name("employees_c"));
//		Select select = new Select (drdown);
//		select.selectByIndex(2);
//	
//		                                // index is start counting from 0 to etx . if the third line then the index will be 2
//		select.selectByValue("level2");
//		
//		
//		select.deselectByVisibleText("101 - 250 employees");
	}

}