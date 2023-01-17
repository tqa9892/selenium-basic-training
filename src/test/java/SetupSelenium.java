

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupSelenium {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver","C:\\browserdriver\\msedgedriver.exe");
		//this above line is used to setup driver manually
		
 WebDriverManager.edgedriver().setup(); //we can use this line command to setup webdriver automatically 
		
		EdgeDriver driver = new EdgeDriver () ;
		driver.get("http://www.google.com");
	}

}
