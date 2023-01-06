package CalenderHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.makemytrip.com/flights/?gclid=CjwKCAiA76-dBhByEiwAA0_s9SQ5yVw93pQi51PD1LlseeA9RZRFFqCJArRkLSGW51QI3XZ4s40HGBoCs4sQAvD_BwE&cmp=SEM|D|DF|G|Generic|DF_Generic_Exact|Tickets_Exact|RSA|Offer3|483490446455&s_kwcid=AL!1631!3!483490446455!e!!g!!makem&ef_id=CjwKCAiA76-dBhByEiwAA0_s9SQ5yVw93pQi51PD1LlseeA9RZRFFqCJArRkLSGW51QI3XZ4s40HGBoCs4sQAvD_BwE:G:s");

		driver.manage().window().maximize();

		WebElement calender = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[1]"));
		calender.click();

		WebElement check = driver.findElement(By.xpath("(//span[@role='button'])[2]"));

		while (check.isDisplayed()) {
			check.click();
			List<WebElement> list = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[2]"));

			for (int i = 0; i < list.size(); i++) {

				System.out.println(list.get(i).getText());

//				if (list.get(i).getText().contains(null)) {
//					
//				}
			}

		}

	}

}
