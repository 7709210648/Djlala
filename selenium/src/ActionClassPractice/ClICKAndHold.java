package ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClICKAndHold {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//li[@name='E']"));

		Actions act = new Actions(driver);

		act.clickAndHold(element).perform();

	}
}
