package ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDoubleclick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)", "");

		driver.manage().window().maximize();

		WebElement doubleClickElement = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));

		Actions act = new Actions(driver);
		
		
		act.doubleClick().perform();

	//	act.doubleClick(doubleClickElement).perform();

	}
}