package dropDown;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Desktop\\automation\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)", "");

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='custom-select']"));

		Select selection = new Select(dropdown);

		List<WebElement> list = selection.getOptions();

		LinkedList<String> options = new LinkedList<String>();

		int size = list.size();
		System.err.println("before sorting ");

		for (int i = 0; i < size; i++) {

			System.out.println(list.get(i).getText());

			options.add(list.get(i).getText());

		}

		System.err.println("after sorting ");
		Collections.sort(options);
		for (String name : options) {

			System.out.println(name);
		}

	}

}
