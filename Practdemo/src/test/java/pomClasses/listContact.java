package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class listContact {

	WebDriver driver;

	public listContact(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContactFeature;

	public CreateContact getClickOnCreateContactFeature() {

		createContactFeature.click();

		return new CreateContact(driver);

	}
}
