package ActionClassPractice;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/shop/home-living");

		driver.manage().window().maximize();

		// moveto the element

		WebElement Myntrasite = driver.findElement(By.xpath("(//a[text()='Kids'])[2]"));

		Actions act = new Actions(driver);

		/// Note if we want to performe single user action then follow the Action
		/// interface and use
		// either perform() method or Build().performe() method
		// and if we want to perform group of the actions the we follow the actions
		/// Class use both build.performe

		act.moveToElement(Myntrasite).perform();

	}
}
