package Mp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestionDropDown {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.aa.com/en-us/flights-to-singapore?c=SEM|MSFT|always_on|MKT|USM|TXT|flight%20to%20Singapore|US_US_MKT_Bing_RouteINT_D_New%20York_Singapore_EN_X$$&msclkid=01b26e355001109480090d6ccd6735ff");
    // driver.findElement(By.id("flights-booking-id-1-label")).click();
	
     //driver.findElement(By.xpath("//*[@id=\"flights-booking-id-1-input\"]")).sendKeys("New York");
   //  driver.findElement(By.xpath("//*[@id=\"flights-booking-id-1-input\"]")).sendKeys(Keys.ARROW_DOWN);
     //driver.findElement(By.xpath("//*[@id=\"flights-booking-id-1-input\"]")).sendKeys(Keys.ENTER);
	
	//same method just used variable to make coding shorter
     WebElement quickwe = driver.findElement(By.xpath("//*[@id=\"flights-booking-id-1-input\"]"));
     quickwe.sendKeys("New York");
     quickwe.sendKeys(Keys.ARROW_DOWN);
     quickwe.sendKeys(Keys.ENTER);
	
	}

}
