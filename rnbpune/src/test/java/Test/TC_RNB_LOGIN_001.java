package Test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Pages.HomePage;
import Pages.LoginPage;
import baseclass.Baseclass;
import dev.failsafe.internal.util.Assert;

public class TC_RNB_LOGIN_001  extends Baseclass {

	public TC_RNB_LOGIN_001() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void verfyLogineFuctionality() throws InterruptedException {
		
		
		LoginPage login= new LoginPage(driver);
		
		log.info("login with valid username and password");
		
		HomePage homepage=login.Login(pro.getProperty("username"), pro.getProperty("password"));
		
		log.info("validate the login fucnctionality ");
		
		String HomepageTitle=homepage.actualTtileHomepage();
		String ExpectedTitle="Salesboom.com - Home";
		
		org.testng.Assert.assertEquals(HomepageTitle, ExpectedTitle);
		
		
		
	}
	
	

}
