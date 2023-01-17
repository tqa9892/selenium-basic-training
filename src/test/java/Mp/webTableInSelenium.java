package Mp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableInSelenium {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/australian-cash-market-report");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//key step to fetch table's data from web site step 1: if the table is in another frame than  switch to the frame 
		                                              //step2: find all column and rows and make variable
		                                              //steo3: iterate using for loop
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();  //this line is for cookie if it popup
		//WebElement framexp =driver.findElement(By.xpath("//*[@id=\"multi-column-0\"]/div/div/div/div[2]/div[8]/div/table/tbody/tr"));
		//driver.switchTo().frame(framexp); 
		
		
		
		List<WebElement> rows =driver.findElements(By.xpath("//*[@id=\"multi-column-0\"]/div/div/div/div[2]/div[8]/div/table/tbody/tr"));
		System.out.println(rows.size());

		List<WebElement> cols =driver.findElements(By.xpath("//*[@id=\"multi-column-0\"]/div/div/div/div[2]/div[8]/div/table/tbody/tr[1]/td"));
		System.out.println(cols.size());
		
		for (int i =1;i< rows.size() ;i++) { // here rows and columns start from 1 when fetch data from web
			
			for (int j=1;j<= cols.size();j++) {
			WebElement rowcol =	driver.findElement(By.xpath("//*[@id=\"multi-column-0\"]/div/div/div/div[2]/div[6]/div/table/tbody/tr[" + i + "]/td["+ j +"]"));
			System.out.print(rowcol.getText()+" |  ");
			}
			System.out.println();
			
			
		}

	
	
	
	}

}
