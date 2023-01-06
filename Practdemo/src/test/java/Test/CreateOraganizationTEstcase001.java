package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.CreateOraganization;
import pomClasses.DetailsOraganization;
import pomClasses.HomePage;
import pomClasses.ListOraganization;
import pomClasses.Loginpage;
import utiliites.PropertyFile;
import utiliites.WebdriverFiles;
import utiliites.javaFiles;
import utiliites.xlUtilityFile;

public class CreateOraganizationTEstcase001 {
	@Test
	public void testcase() throws IOException {

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

		ListOraganization listpage = homepage.getclickonOrganization();

		CreateOraganization createpage = listpage.getClickOnCreateOraganization();

		javaFiles j = new javaFiles();
		int rannum = j.JavaAccess();

		String path = "C:\\Users\\Dell\\eclipse-workspace\\Practdemo\\testData\\testdata for practice.xlsx";

		xlUtilityFile xl = new xlUtilityFile(path);

		String value = xl.getTheStringValue("organization");

		DetailsOraganization detailspage = createpage.createtheoraganization(value + rannum);

		String actualname = detailspage.getCreatedOraganizationName();
		String expected = (value + rannum);
		System.out.println(actualname);
		System.out.println(expected);

		System.out.println(actualname.contains(expected));
		if (actualname.contains(expected)) {

			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

		detailspage.getSignOut();

	}

}
