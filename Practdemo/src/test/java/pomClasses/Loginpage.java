package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;

	public Loginpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;

	@FindBy(id = "submitButton")
	private WebElement loginButton;

	@FindBy(xpath = "//div[@class='errorMessage']")
	private WebElement errormsg;
	// ACTION AND BEHAAAAA OF PAGES

	public HomePage getLogin(String USERNAME, String PASSWORD) {

		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);

		loginButton.click();

		return new HomePage(driver);

	}

	public String getErrorMsg() {

		String error = errormsg.getText();

		return error;

	}

}
