package Mp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchingWindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a/span")).click();
		Thread.sleep(4000);
		//: switching windows method 
	Set<String> windowsh =driver.getWindowHandles();  //step 1
	System.out.println(windowsh);
	
	Iterator<String> iterator =windowsh.iterator(); //step 2
	
	String window1 = iterator.next();  //step3
	System.out.println(window1);
	
	String window2 = iterator.next();
	System.out.println(window2);
	
	driver.switchTo().window(window2); //step 4
	
	driver.findElement(By.name("UserFirstName")).sendKeys("test");
	driver.findElement(By.name("UserLastName")).sendKeys("successful");
	Thread.sleep(2000); 

	driver.switchTo().window(window1); //step 5 to come back to parent windows

}
}