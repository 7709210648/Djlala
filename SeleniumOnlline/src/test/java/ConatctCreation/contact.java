package ConatctCreation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
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

public class contact {
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
		
		
		WebElement conatct=driver.findElement(By.xpath("(//a[text()='Contacts'])[1]"));
		conatct.clear();
		WebElement add=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		add.click();

		String xlPath = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\testdata\\testOraganization.xlsx";

		FileInputStream f1 = new FileInputStream(xlPath);

		Workbook wb = WorkbookFactory.create(f1);

		Sheet s = wb.getSheet("Sheet1");

		Row r = s.getRow(1);

		Cell ce = r.getCell(0);

		// DataFormatter formate = new DataFormatter();

		String lastname = ce.getStringCellValue();

WebElement addorag=driver.findElement(By.xpath("(//img[@alt='Select'])[1]"));

addorag.click();

Set<String>list=driver.getWindowHandles();

Iterator<String>it=list.iterator();
while(it.hasNext()) {
	
	String window=it.next();
	
	String title=driver.switchTo().window(window).getTitle();
	
	if (title.contains("Organization")) {
		
		break;
	}
	
	WebElement search=driver.findElement(By.xpath("//input[@name='search_text']"));
	
	search.sendKeys("Test yantara");
	
	WebElement searchbutton=driver.findElement(By.xpath("//input[@type='button']"));
	
	searchbutton.click();
	
	
	WebElement orananame=driver.findElement(By.xpath("//a[text()='Test yantara']"));
	
	orananame.click();
	
	Set<String>list2=driver.getWindowHandles();
	
	
	
}
	
	}
	
}
