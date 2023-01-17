package Mp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToPrintAllLinkFromThePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver ();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		//driver.findElement(By.name("email")).sendKeys("setdemo@yahoo.com");
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("total tags are :"+ alltags.size());
		
		for (int i=0;i<alltags.size();i++) {
			System.out.println("all links are: "+ alltags.get(i).getAttribute("href"));
			System.out.println("all links are: "+ alltags.get(i).getText());
		}
	}

}
