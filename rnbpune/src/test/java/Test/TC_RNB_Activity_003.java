package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.ActivityCreatePage;
import Pages.ActivityDetailsPage;
import Pages.ActivityListPage;
import Pages.HomePage;
import Pages.LoginPage;
import baseclass.Baseclass;
import dev.failsafe.internal.util.Assert;
import utility.xlutil;

public class TC_RNB_Activity_003 extends Baseclass {

	public TC_RNB_Activity_003() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider = "create activity")
	public void test1(String nameactiviity, String dateodStart, String revenueexpected, String actualrequirecost,
			String responcetheyExpected, String value) throws InterruptedException {

		System.out.println(pro.get("username"));
		log.info("enter the valid usernameand password");

		LoginPage login = new LoginPage(driver);

		HomePage homepage = login.Login(pro.getProperty("username"), pro.getProperty("password"));

		log.info("click on acitivity module ");

		ActivityListPage activitylistpage = homepage.clickonAcitivityModule();

		log.info("add actvity feature ");

		ActivityCreatePage activityCreatePage = activitylistpage.clicAddactivity();

		log.info("fill all the necessory data");

		ActivityDetailsPage actvitydeatilsPage = activityCreatePage.AddactivityetailsPage(nameactiviity, dateodStart,revenueexpected, actualrequirecost, responcetheyExpected);

		log.info("click on save button:");

		log.info("validation of activity deatils page");

		if (value.equals("valid")) {

			log.info("check teh expected");
			String actualTitle = actvitydeatilsPage.Gettitle();
			String expectedTtitle = "Salesboom.com - New Campaign: sdkcscsdxc";

			org.testng.Assert.assertEquals(actualTitle, expectedTtitle);

			actvitydeatilsPage.clickonlogout();
		}

	}

	@DataProvider(name = "create activity")
	public String[][] dataprovider() throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\dekan\\modula\\bin\\dhanaa\\rnbpune\\testdata\\testdata.xlsx";

		xlutil xl = new xlutil(path);

		int row = xl.gettotlCountRow("Sheet1");
		int column = xl.gettotalCountColum("Sheet1");

		String[][] data = new String[row+1][column];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {

				data[i - 1][j] = xl.getallthevalue("Sheet1", i, j);
			}
		}
		return data;

	}
}
