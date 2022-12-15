package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LeadCreatePage;
import Pages.LeadDetailsPage;
import Pages.LeadListPage;
import Pages.LoginPage;
import baseclass.Baseclass;
import utility.xlutil;

public class TC_RNB_Lead_001 extends Baseclass {

	public TC_RNB_Lead_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(dataProvider = "create activity")
	public void test001(String nama, String lastname, String value) throws InterruptedException {

		LoginPage login = new LoginPage(driver);

		log.info("enter logn details:");

		HomePage homepage = login.Login(pro.getProperty("username"), pro.getProperty("password"));

		log.info("click on leadfeature ");

		LeadListPage leadlistpage = homepage.clcikonLeadFeature();

		log.info("clcik on add lead");

		LeadCreatePage Leadcreatpage = leadlistpage.clickonAddLead();

		log.info("create the lead fill etails");

		LeadDetailsPage leaddetailspage = Leadcreatpage.createlead(nama, lastname);

		if (value.equals("valid")) {

			log.info("validate the result");
			String title = leaddetailspage.gettitle();
			String expected = "Salesboom.com - New Lead:" + nama + "," + lastname;

			// Assert.assertEquals(title, expected);

			Thread.sleep(2000);
			leaddetailspage.clickonLogout();
		}

	}

	@DataProvider(name = "create activity")
	public String[][] dataprovider() throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\dekan\\modula\\bin\\dhanaa\\rnbpune\\testdata\\rnb.xlsx";

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
