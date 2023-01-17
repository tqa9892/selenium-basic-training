package Mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authenticationPopupHandling {

	public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver ();
	//driver.get("https://the-internet.herokuapp.com/basic_auth"); //if we go to the particular link an authentication popup will be seen we handlin this by providing id and password to the link like https://id:password@_____________here in the empty space we put the website address  
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  //here id and password are admin . so we just provided that to url
	
	
	
	}

}
