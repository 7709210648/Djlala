package FindelementAndElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		
		
		driver.manage().window().maximize();
		
		List<WebElement>list1=driver.findElements(By.id("selenium143"));
		
		for (WebElement obj : list1) {
			
			System.out.println(obj.getText());
		}
	

		
		
		
		
		
		
		
		
	}
}
