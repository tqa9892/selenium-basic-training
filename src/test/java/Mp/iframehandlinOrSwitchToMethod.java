package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframehandlinOrSwitchToMethod {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame(0);// when you have multiple frame in a page like parent frame has multiple child frame we use switch to method 
		//driver.switchTo().frame("iframeResult");  //if there are iframe in the inspection that means it has more frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//driver.switchTo().parentFrame();
		//System.out.println(driver.getTitle());
	}

}
