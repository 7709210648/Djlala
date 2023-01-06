package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.CreateContact;
import pomClasses.DetailsConatct;
import pomClasses.HomePage;
import pomClasses.Loginpage;
import pomClasses.listContact;
import pomClasses.oraganizationPage;
import utiliites.PropertyFile;
import utiliites.WebdriverFiles;

public class createConatctTestcase001 {
	@Test
	public void testcase23() throws InterruptedException {

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

		listContact listcon = homepage.getclickonContactfeature();

		CreateContact createpage = listcon.getClickOnCreateContactFeature();

		oraganizationPage orgapage = createpage.getClickOnOraganizationSign("gjhgjhg");

		Thread.sleep(2000);
		
		orgapage.switchtoWindow("Texhnicalguru");

		DetailsConatct detailsPage = createpage.getClickOnSaveButton();

		
		detailsPage.getSignOut();
		
		
		
		
		
	}
}
