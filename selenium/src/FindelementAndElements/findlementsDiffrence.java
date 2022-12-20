package FindelementAndElements;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlementsDiffrence {

	
	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
			
			driver.manage().window().maximize();
			
			//Try to find what exception throw those method
			
			//try to find what they return type
			
			//to perform action on the elements
			//we need to direct execute or iterate
			
			WebElement find=driver.findElement(By.id("selenium143"));
			
			System.out.println(find.isDisplayed());
			
			//iteration is needed for the list of the elements
			List<WebElement>list1=driver.findElements(By.id("selenium143"));
			
			for (WebElement obj : list1) {
				
				System.out.println(obj.getText());
			}
		
	}
}
