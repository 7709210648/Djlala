package webTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableIdentify {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		List<WebElement> DynamicTable = driver.findElements(By.xpath("(//table[@id='table1']//tr[1])[1]//th"));

		int size = DynamicTable.size();

		System.out.println(size);
		for (int i = 1; i <= size; i++) {
			WebElement list = driver.findElement(By.xpath("(//table[@id='table1']//tr[1])[1]//th[" + i + "]"));

			System.out.println(list.getText());
		}

		List<WebElement> tableContent = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));

		int sizecontent = tableContent.size();

		for (int i = 1; i <= sizecontent; i++) {

			List<WebElement> tdelements = driver
					.findElements(By.xpath("//table[@id='table1']//tbody/tr[" + i + "]" + "/td"));

			int tdsize = tdelements.size();

			for (int j = 1; j <= tdsize; j++) {

				WebElement textelement = driver
						.findElement(By.xpath("//table[@id='table1']//tbody/tr[" + i + "]/td[" + j + "]"));

				System.out.print(textelement.getText() + "    ");
			}
			System.out.println();
		}

	}
}