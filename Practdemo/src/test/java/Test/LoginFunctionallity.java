package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClasses.HomePage;
import pomClasses.Loginpage;
import utiliites.PropertyFile;
import utiliites.WebdriverFiles;
import utiliites.xlUtilityFile;

public class LoginFunctionallity {
	@Test(dataProvider = "credential")
	public void test001(String user, String pass, String value) {

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

		HomePage homepage = login.getLogin(user, pass);

		if (value == "valid") {

			String actualtitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";

			String expectedtitle = homepage.getTitle();
			Assert.assertEquals(actualtitle, expectedtitle);

			webfile.tohandleActionMouse(driver, homepage.getwebelement());

			homepage.getclickonSignbutton();

		} else {
			String actualerror = "You must specify a valid username and password.";
			String expected = login.getErrorMsg();

			Assert.assertEquals(actualerror, expected);

		}

		driver.close();

	}

	@DataProvider(name = "credential")
	public String[][] DataPovider() throws IOException {
		String xlPath = "C:\\Users\\Dell\\eclipse-workspace\\Practdemo\\testData\\LoginPage.xlsx";

		xlUtilityFile xl = new xlUtilityFile(xlPath);

		int row = xl.gettotlCountRow("usenamePass");

		int coulumn = xl.gettotalCountColum("usenamePass");

		String[][] data = new String[row][coulumn];

		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < coulumn; j++) {

				data[i - 1][j] = xl.getallthevalue("usenamePass", i, j);
			}
		}
		return data;

	}
}
