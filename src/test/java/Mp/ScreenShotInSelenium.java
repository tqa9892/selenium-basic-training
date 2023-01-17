package Mp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotInSelenium {

	public static void main(String[] args) throws IOException {
WebDriverManager.edgedriver().setup();
EdgeDriver driver = new EdgeDriver () ;
driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");

driver.manage().window().maximize();
// you have to import "Commons IO" in dependency from mevin repository. if you use selenium project   you just download commons io and add to library by clicking to external jar
File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // to get screenshot import just go https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/TakesScreenshot.html
File destination = new File ( ".\\ScreenShot\\example.png") ;
FileUtils.copyFile(screenshotFile, destination );




	}

}
