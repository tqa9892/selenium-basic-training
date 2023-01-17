package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popuphandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		Thread.sleep(7000);

		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().dismiss(); //if you denied than driver.switchTo().alert().dismiss();

		driver.switchTo().parentFrame();
		////not completed

}
}