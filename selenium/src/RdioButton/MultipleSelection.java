package RdioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumDriverCommands.webelemtsCommands;

public class MultipleSelection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\automation\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)", "");

		// List<WebElement>l1=driver.findElements(By.xpath("//input[@name='optionsRadios']"));

		List<WebElement> fist = driver.findElements(By.xpath("//input[@name='optionsRadios']"));

		System.out.println(fist.size());
		
		for (int i = 0; i < fist.size(); i++) {
			
			fist.get(i).click();
			
		}
	}
}
