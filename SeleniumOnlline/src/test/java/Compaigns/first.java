package Compaigns;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String[] args) throws IOException, InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\main\\resources\\chromedriver.exe";

		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\test\\resources\\mah.txt";

		FileInputStream file = new FileInputStream(path);

		Properties pro = new Properties();

		pro.load(file);

		driver.get(pro.getProperty("link"));

		WebElement user = driver.findElement(By.xpath("//input[@name='user_name']"));

		user.sendKeys(pro.getProperty("username"));

		WebElement pass = driver.findElement(By.xpath("//input[@name='user_password']"));

		pass.sendKeys(pro.getProperty("password"));

		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(2000);

		WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));

		Actions act = new Actions(driver);

		act.moveToElement(more).perform();

		WebElement coma = driver.findElement(By.xpath("//a[@name='Campaigns']"));

		coma.click();

		Thread.sleep(2000);

		WebElement plus = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));

		plus.click();

		Thread.sleep(2000);

		WebElement comapignname = driver.findElement(By.xpath("//input[@name='campaignname']"));
		
		String xlPath = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\testdata\\testOraganization.xlsx";

		FileInputStream f1 = new FileInputStream(xlPath);

		Workbook wb = WorkbookFactory.create(f1);

		Sheet s = wb.getSheet("Sheet1");

		Row r = s.getRow(1);

		Cell ce = r.getCell(0);

		// DataFormatter formate = new DataFormatter();

		String compaignna = ce.getStringCellValue();
		comapignname.sendKeys(compaignna);
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		WebElement ee = driver.findElement(By.xpath("//img[@alt='Select']"));

		ee.click();

		Set<String> list = driver.getWindowHandles();

		// save button
		//

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {

			String child = it.next();

			if (!child.equalsIgnoreCase(parentid)) {

				driver.switchTo().window(child);
				driver.manage().window().maximize();

				Thread.sleep(2000);

				List<WebElement> productlist = driver.findElements(By.xpath("(//table[@class='small'])[3]/tbody//tr"));

				int size = productlist.size();
				System.out.println(size);

				for (int i = 2; i < size; i++) {
					List<WebElement> tdlist = driver
							.findElements(By.xpath("(//table[@class='small'])[3]/tbody//tr[" + i + "]/td"));

					int tdsize = tdlist.size();

					WebElement td = driver
							.findElement(By.xpath("(//table[@class='small'])[3]/tbody//tr[" + i + "]/td[1]"));

					String productname = td.getText();
					System.out.println(productname);
					String acual = "Test yantara";

					Thread.sleep(2000);

					if (productname.equals(acual)) {

						WebElement selection = driver.findElement(By.xpath("//a[text()='Test yantara']"));

						Thread.sleep(2000);

						selection.click();

					}

				}
				driver.switchTo().window(parentid);

				String title = "Administrator - Campaigns - vtiger CRM 5 - Commercial Open Source CRM";
				String ac = driver.getTitle();
				System.out.println(ac);
				System.out.println(title.equals(act));
				 driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

			}

			//
		}
	}

}
