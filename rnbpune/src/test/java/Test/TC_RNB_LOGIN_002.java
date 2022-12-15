package Test;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import baseclass.Baseclass;
import utility.xlutil;

public class TC_RNB_LOGIN_002 extends Baseclass {

	public TC_RNB_LOGIN_002() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider = "credential")
	public void validatedFunctionality(String username, String password, String value) throws InterruptedException {

		LoginPage login = new LoginPage(driver);

		log.info("logine with username and password");

		HomePage homepage = login.Login(username, password);

		log.info("validte the  usernameand password");

		if (value.equals("valid")) {

			String hometitle = homepage.actualTtileHomepage();
			String expectedTtitle = "Salesboom.com - Home";
			Assert.assertEquals(hometitle, expectedTtitle, "correcct");
			homepage.clickonlogout();
		} else {
			String errrormsg = login.geterrormsg();

			String expectedmsg = " : Access denied, your username or password is incorrect. ";

			Assert.assertEquals(errrormsg, expectedmsg);

		}

	}

	@DataProvider(name = "credential")
	public String[][] dataProvider() throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\dekan\\modula\\bin\\dhanaa\\rnbpune\\testdata\\Firstsheet.xlsx";

		xlutil xl = new xlutil(path);
		int row = xl.gettotlCountRow("Sheet1");
		int colmn = xl.gettotalCountColum("Sheet1");

		String data[][] = new String[row + 1][colmn];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < colmn; j++) {

				data[i - 1][j] = xl.getallthevalue("Sheet1", i, j);
			}
		}
		return data;

	}

}
