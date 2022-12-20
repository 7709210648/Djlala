package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multippleCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://smartwebby.com/PHP/Phptips2.asp");

		driver.manage().window().maximize();

		List<WebElement> multiple = driver.findElements(By.name("chkexpert[]2"));

		System.out.println(multiple.size());

//		for (WebElement obj : multiple) {
//
//			obj.click();
//		}
	}

}
