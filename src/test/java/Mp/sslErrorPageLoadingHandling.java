package Mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslErrorPageLoadingHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions coptions = new ChromeOptions();   // if you don't provide this chrome options then browser will not
														// get access the insecure website
		coptions.setAcceptInsecureCerts(true);          // coz by default browser is setup not to access to insecure website. so
												       // by using chrome option we manually give browser permission to access the site.

		WebDriver driver = new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");

	}

}
