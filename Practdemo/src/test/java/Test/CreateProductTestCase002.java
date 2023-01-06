package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.DetailsProduts;
import pomClasses.HomePage;
import pomClasses.ListProducts;
import pomClasses.Loginpage;
import pomClasses.createProducts;
import utiliites.PropertyFile;
import utiliites.WebdriverFiles;
import utiliites.javaFiles;
import utiliites.xlUtilityFile;

public class CreateProductTestCase002 {
@Test
	public void testcase002() throws IOException {

		PropertyFile pro = new PropertyFile();

		WebdriverFiles webfile = new WebdriverFiles();

		String link = pro.getlink();

		String username = pro.getusername();
		String password = pro.getPassword();

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(link);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().deleteAllCookies();

		Loginpage login = new Loginpage(driver);

		HomePage homepage = login.getLogin(username, password);
		
		ListProducts listpage=homepage.getClickonProduct();
		
		String path = "C:\\Users\\Dell\\eclipse-workspace\\Practdemo\\testData\\testdata for practice.xlsx";

		xlUtilityFile xl = new xlUtilityFile(path);

		String value = xl.getTheStringValue("product");
		
		javaFiles f1= new javaFiles();
		
		int rannum=f1.JavaAccess();
		
		createProducts createpage=listpage.getclickonCreateProducts();
		
		
		
		
		DetailsProduts detailspage=createpage.createNewProducts(value+rannum);
		
		String actualproduct=detailspage.getProductName();
		String expected=(value+rannum);
		if (actualproduct.contains(expected)) {
			
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}
		
		detailspage.getSignOut();
	}

}
