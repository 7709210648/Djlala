package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadListPage {

	WebDriver driver;

	public LeadListPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='newLead']")
	public WebElement addleadfeature;
	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement logoutButton;

	// Method for action page
	public LeadCreatePage clickonAddLead() {

		addleadfeature.click();

		return new LeadCreatePage(driver);

	}

	public String gettitleofpage() {

		String title = driver.getTitle();
		return title;
	}

	public LoginPage clickonogoutButton() {

		logoutButton.click();
		return new LoginPage(driver);
	}
}
