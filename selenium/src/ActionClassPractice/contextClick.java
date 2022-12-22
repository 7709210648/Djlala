package ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class contextClick {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.manage().window().maximize();

		WebElement RightClcikButton = driver.findElement(By.id("fname"));

		Actions act = new Actions(driver);

		act.contextClick(RightClcikButton).perform();

	}
}