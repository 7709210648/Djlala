package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@size='32' and @name='crm_user_dn' and @type='text']")
	public WebElement username;
	@FindBy(xpath = "//input[@size='32' and @name='user_password' and @type='password']")
	public WebElement password;
	@FindBy(xpath = "//input[@name='submit']")
	public WebElement submitButtn;
	@FindBy(xpath = "//p[@class='alert']")
	public WebElement errormsg;

	public HomePage Login(String name, String pass) throws InterruptedException {
		Thread.sleep(2000);

		username.sendKeys(name);

		password.sendKeys(pass);

		submitButtn.click();

		return new HomePage(driver);

	}

	public String ActualTitle() {

		String title = driver.getTitle();

		return title;
	}

	public String geterrormsg() {

		String error = errormsg.getText();

		return error;
	}
}
