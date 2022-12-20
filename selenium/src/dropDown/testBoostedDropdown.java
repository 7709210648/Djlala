package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBoostedDropdown {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\automation\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize();
		
		
		List<WebElement>d=driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[2]/li"));
		
		for (WebElement obj : d) {
			
			System.out.println(obj.getText());
			
			
		}
		
	}
	
}
