package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrokenLinkPracticec {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> Listlala = driver.findElements(By.tagName("a"));

		int size = Listlala.size();

		int brokenlink = 0;
		int validateLink = 0;

		for (int i = 0; i < size; i++) {

			int statusCode = VerifyTheLink(Listlala.get(i).getAttribute("href"));

			System.out.println(Listlala.get(i).getText());

			if (statusCode == 404) {
				brokenlink++;

			} else {
				validateLink++;

			}

		}
		System.out.println("broken link are" + brokenlink);
		System.out.println("validatelink are " + validateLink);

	}

	public static int VerifyTheLink(String Attribute) {

		int StatusCode = 404;

		try {

			URL url = new URL(Attribute);

			HttpURLConnection http = (HttpURLConnection) url.openConnection();

			http.setRequestMethod("GET");
			http.connect();

			StatusCode = http.getResponseCode();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}
		return StatusCode;

	}

}
