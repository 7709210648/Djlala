package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOraganization {

	WebDriver driver;

	public ListOraganization(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOraganiationLogo;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signout;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutbutton;

	public CreateOraganization getClickOnCreateOraganization() {

		createOraganiationLogo.click();
		return new CreateOraganization(driver);

	}

}
