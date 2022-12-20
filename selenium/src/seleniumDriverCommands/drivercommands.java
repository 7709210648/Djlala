package seleniumDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivercommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// webdriver browser commmands
		// 1.get(commands which accept String as Parameter and return nothing

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// 2.driver.getTitle(Which accept nothhing but return String

		String title = driver.getTitle();

		System.out.println(title);

		// 3.driver.getCurrentUrl(which accept nothing but return current page url 
		// String

		String CurrentURL = driver.getCurrentUrl();

		System.out.println(CurrentURL);

		// 4.getPageSource which accept nothing but return String

		String pagesource = driver.getPageSource();

		System.out.println(pagesource);

		// 5.driver.closed(which closed the current window

		//driver.close();
		
		//6.driver.quite() which closed the entire windows open by the wedriver
		
		driver.quit();
		
		String curent=driver.getCurrentUrl();
		System.out.println( curent);
		

	}
}
