package Alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	// open the browser
	// enter the test url
	// click on blog created link
	// and get the current url of open window
	// get the title of newly open url

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
			
			//System.out.println(!childwindowString.equalsIgnoreCase(parentWindowid));

			if (!childwindowString.equalsIgnoreCase(parentWindowid)) {

				driver.switchTo().window(childwindowString);

				System.out.println(driver.getTitle());
			}

		}

		
		
		//$$$$$$$           FAILED           $$$$$$$$$$$$$
		
//		for (String obj : childwindowsId) {
//
//			System.out.println(obj != parentWindowid);
//
////			if (obj!=parentWindowid) {
////				
////				System.out.println(obj);
////
////				driver.switchTo().window(obj);
////
////				String title = driver.getTitle();
////
////				System.out.println(title);
////				
////				driver.switchTo().window(parentWindowid);
////			}
//
//		}

	}
}
