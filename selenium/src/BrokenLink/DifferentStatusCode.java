package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentStatusCode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/status_codes");

		driver.manage().window().maximize();

		List<WebElement> l = driver.findElements(By.tagName("a"));

		int size = l.size();
		int incoorectClient = 0;
		int redirectionerror = 0;

		int servererror = 0;

		for (int i = 0; i < size; i++) {

			int statusCode = verfyTheLink(l.get(i).getAttribute("href"));

			System.out.println(l.get(i).getText());

			if (statusCode > 400 && statusCode <= 404) {

				System.out.println(l.get(i).getAttribute("href"));
				incoorectClient++;

			} else if (statusCode >= 300 && statusCode <= 304) {

				System.out.println(l.get(i).getAttribute("href"));
				redirectionerror++;
			} else if (statusCode >= 500 && statusCode <= 504) {
				System.out.println(l.get(i).getAttribute("href"));
				servererror++;

			}

		}
		System.out.println("total incoorrect client error link are " + incoorectClient);
		System.out.println("total server error link are " + servererror);
		System.out.println("total redirectional error link are " + redirectionerror);
	}

	public static int verfyTheLink(String Attribute) {

		int StatusCode = 0;

		try {
			URL url = new URL(Attribute);

			HttpURLConnection huc = (HttpURLConnection) url.openConnection();

			huc.setRequestMethod("GET");

			StatusCode = huc.getResponseCode();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

		}
		return StatusCode;

	}
}
