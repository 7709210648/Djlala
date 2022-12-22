package oraganization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

import com.microsoft.schemas.office.office.STInsetMode;

import utility.xlutility;

public class CreateOraganizatioon {

	public static void main(String[] args) throws IOException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\main\\resources\\chromedriver.exe";

		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\test\\resources\\mah.txt";

		FileInputStream file = new FileInputStream(path);

		Properties pro = new Properties();

		pro.load(file);

		driver.get(pro.getProperty("link"));

		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));

		WebElement user = driver.findElement(By.xpath("//input[@name='user_name']"));

		user.sendKeys(pro.getProperty("username"));

		WebElement pass = driver.findElement(By.xpath("//input[@name='user_password']"));

		pass.sendKeys(pro.getProperty("password"));

		driver.findElement(By.id("submitButton")).click();

		WebElement organizationelement = driver.findElement(By.xpath("(//a[text()='Organizations'])[1]"));

		organizationelement.click();

		WebElement addOraganization = driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
		addOraganization.click();

		WebElement oraganizaionname = driver.findElement(By.name("accountname"));

		String xlPath = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\testdata\\testOraganization.xlsx";

		FileInputStream f1 = new FileInputStream(xlPath);

		Workbook wb = WorkbookFactory.create(f1);

		Sheet s = wb.getSheet("Sheet1");

		Row r = s.getRow(1);

		Cell ce = r.getCell(0);

		// DataFormatter formate = new DataFormatter();

		String oraganizatiopart = ce.getStringCellValue();

		WebElement oraganizationname = driver.findElement(By.name("accountname"));

		System.out.println(oraganizatiopart);

		oraganizaionname.sendKeys(oraganizatiopart);

		// save button

		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();

		String actualTitle = driver.getTitle();

		String expectedTitle = " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("oraganization is created");
		}

		WebElement signout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		Actions act = new Actions(driver);

		act.moveToElement(signout);

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
