package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsProduts {

	WebDriver driver;

	public DetailsProduts(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement productName;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement signout;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutbutton;

	public String getProductName() {

		String name = productName.getText();

		return name;
	}

	public void getSignOut() {

		Actions act = new Actions(driver);

		act.moveToElement(signout).perform();

		signOutbutton.click();

	}

}
