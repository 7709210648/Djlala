package pomclassespra;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClasses {
	public pomClasses(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement Password;

	@FindBy(id = "submitButton")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void login(String username, String password) {

		userName.sendKeys(username);
		Password.sendKeys(password);
		loginButton.click();
	}

}
