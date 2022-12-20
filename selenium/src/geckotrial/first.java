package geckotrial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://smartwebby.com/PHP/Phptips2.asp");

		driver.manage().window().maximize();
	}
}
