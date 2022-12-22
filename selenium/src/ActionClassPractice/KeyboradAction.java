package ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboradAction {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\git\\Djlala\\Djlala\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		Actions act = new Actions(driver);

		element.sendKeys("sdfsdsd");

		act.keyDown(Keys.TAB).sendKeys("acadvad").keyUp(Keys.TAB).build().perform();

	}
}
