package FindelementAndElements;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {
	
	
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.manage().window().maximize();
		
		WebElement find=driver.findElement(By.id("selenium143"));
		
		System.out.println(find.isDisplayed());
		
		
		
		
		
	}

}
