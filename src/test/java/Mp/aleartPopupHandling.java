package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aleartPopupHandling {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		//  driver.switchTo().frame(0);// when you have multiple frame in a page like
		// #parent frame has multiple child frame we use switch to method
		// driver.switchTo().frame("iframeResult"); //if there are iframe in the inspection that means it has more frame
		
		WebElement frame1 = driver.findElement(By.id("iframeResult")); // made variable frame1
		driver.switchTo().frame(frame1);    // this is also another method like top 2 to switch to other frame
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click(); // switching one frame to another
		
		//:***** Handling alert step1-driver.switchTo().alert().accept() to accept//// step 2: driver.switchTo().parentFrame();####
		String alearttxt = driver.switchTo().alert().getText();
		System.out.println(alearttxt);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss(); //if you denied than driver.switchTo().alert().dismiss();

		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
