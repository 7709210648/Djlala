package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsOraganization {

	WebDriver driver;

	public DetailsOraganization(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signout;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutbutton;

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement oraganizationName;

	public String getCreatedOraganizationName() {

		String name = oraganizationName.getText();

		return name;

	}

	public String getActualtitle() {

		String title = driver.getTitle();
		return title;

	}

	public void getSignOut() {

		Actions act = new Actions(driver);

		act.moveToElement(signout).perform();

		signOutbutton.click();

	}

}
