package Mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslerror {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions coptions = new ChromeOptions(); // method to access in insecure website . it happend when secure certificate expire or don't have certificate
		coptions.setAcceptInsecureCerts(true);
		
		// another old method to get access in insecure website
        //	coptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //	coptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		WebDriver driver = new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");

//	Thread.sleep(5000);
//	driver.get("https://cacert.org/");

	}
}
