package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\automation\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)", "");

		WebElement dropDown = driver.findElement(By.id("multiselect1"));

		Select act = new Select(dropDown);

		int size = act.getOptions().size();

		System.out.println(size);

		for (int i = 0; i < size; i++) {

			act.selectByIndex(i);

		}
		Thread.sleep(3000);

		for (int i = 0; i < size; i++) {

			act.deselectAll();

		}

	}
}
