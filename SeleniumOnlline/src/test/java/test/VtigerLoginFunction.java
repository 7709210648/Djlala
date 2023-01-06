package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomclassespra.pomClasses;
import property.Proper;

public class VtigerLoginFunction {

	@Test
	public void testFunctionality() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Proper pro = new Proper();

		driver.get(pro.pro.getProperty("link"));

		String username = pro.pro.getProperty("username");
		String password = pro.pro.getProperty("password");

		pomClasses p = new pomClasses(driver);

		p.login(username, password);

	}

}
