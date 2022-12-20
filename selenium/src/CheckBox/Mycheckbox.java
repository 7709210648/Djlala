package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mycheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");

		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));

		System.out.println(checkBox.isSelected());

		checkBox.click();

		// checkBox is unchecked perform action

		if (checkBox.isSelected()) {

			checkBox.click();
		}
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isDisplayed());

	}
}
