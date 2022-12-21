package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// alert switch to alert window

		Alert act = driver.switchTo().alert();

		// switch

		act.accept();

	}
}
