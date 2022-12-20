package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectlastTwoOption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();

		List<WebElement> l1 = driver.findElements(By.xpath("//input[contains(@id,'day')]"));

		for (int i = 0; i < l1.size(); i++) {

			if (i == 5 || i == 6) {

				l1.get(i).click();
				System.out.println(l1.get(i).getText());

			}

		}
	}
}
