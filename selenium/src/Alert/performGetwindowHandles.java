package Alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class performGetwindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// locate the weelement with name link

		WebElement link = driver.findElement(By.id("selenium143"));

		// click on it

		link.click();

		String parentWindowid = driver.getWindowHandle();

		System.out.println(parentWindowid);

		// Strore newly open window id

		Set<String> childwindowsId = driver.getWindowHandles();

		Iterator<String> it = childwindowsId.iterator();

		while (it.hasNext()) {

			String childwindowString = it.next();

			if (!childwindowString.equalsIgnoreCase(parentWindowid)) {

				driver.switchTo().window(childwindowString);

				driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("window.scrollBy(400,0)", "");

				driver.findElement(By.xpath("//a[text()='Selenium Java - Live Project - Rs 999']")).click();

				Set<String> subWindowId = driver.getWindowHandles();

				Iterator<String> it2 = subWindowId.iterator();

				while (it2.hasNext()) {

					String child = it2.next();

					if (!child.equalsIgnoreCase(childwindowString)) {

						driver.switchTo().window(child);

						System.out.println(driver.getTitle());
                     
						driver.switchTo().window(childwindowString);
						
					}
				}

			}

		}
	}
}
