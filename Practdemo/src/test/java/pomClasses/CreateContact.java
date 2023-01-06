package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {

	WebDriver driver;

	public CreateContact(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebutton;

	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement oranizationsign;

	public DetailsConatct getClickOnSaveButton() {

		savebutton.click();

		return new DetailsConatct(driver);

	}

	public oraganizationPage getClickOnOraganizationSign(String last) {
		lastname.sendKeys(last);
		oranizationsign.click();

		return new oraganizationPage(driver);

	}

}
