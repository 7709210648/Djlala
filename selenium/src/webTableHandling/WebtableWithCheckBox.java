package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableWithCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		driver.manage().window().maximize();

		List<WebElement> Tabelist = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));

		int trsize = Tabelist.size();

		for (int i = 1; i <= trsize; i++) {

			WebElement trelemments = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]"));

			trelemments.click();

		}

	}

}
