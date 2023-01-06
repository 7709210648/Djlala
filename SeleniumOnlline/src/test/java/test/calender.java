package test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	@Test
	public void calender() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.makemytrip.com/flights/?gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcEiCXr4z9Bobg4tp9hZ7mcAGEaqjy7rWVKv1-lnsfnIRzT3b7v3xexoCfsYQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!makemy&ef_id=CjwKCAiAkrWdBhBkEiwAZ9cdcEiCXr4z9Bobg4tp9hZ7mcAGEaqjy7rWVKv1-lnsfnIRzT3b7v3xexoCfsYQAvD_BwE:G:s");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();

		WebElement calender = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));

		calender.click();

		WebElement rolebutton = driver.findElement(By.xpath("(//span[@role='button'])[2]"));

		while (rolebutton.isDisplayed()) {

			List<WebElement> list = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));

			for (int i = 0; i < list.size(); i++) {

				String datetaker = list.get(i).getAttribute("aria-label");

				if (datetaker.contains("Fri Nov 17 2023")) {

					list.get(i).click();
				}

			}

			rolebutton.click();

		}
		//WebElement returndate=driver.findElement(By)
		
		

	}

}
