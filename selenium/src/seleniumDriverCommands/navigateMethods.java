package seleniumDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/selenium-webdriver-navigation-commands/");

		driver.manage().window().maximize();

		String currenturl = driver.getCurrentUrl();

		System.out.println(currenturl);

		WebElement linkforNewWindow = driver.findElement(By.xpath("(//a[text()='Schedule Meeting with Naveen'])[1]"));

		linkforNewWindow.click();

		String newcURRETurl = driver.getCurrentUrl();

		System.out.println(newcURRETurl);

		// 1.navigate.to

		driver.navigate().back();

		String url = driver.getCurrentUrl();

		System.out.println(url);

		driver.navigate().forward();

		String forwardurl = driver.getCurrentUrl();
		
		System.out.println(forwardurl);

	}

}
