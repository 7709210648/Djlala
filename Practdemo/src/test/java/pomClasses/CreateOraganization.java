package pomClasses;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOraganization {

	WebDriver driver;

	public CreateOraganization(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountname;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebutton;

	public DetailsOraganization createtheoraganization(String Acountname) {
		accountname.sendKeys(Acountname);
		savebutton.click();

		return new DetailsOraganization(driver);

	}

	public String getActualtitle() {

		String title = driver.getTitle();
		return title;

	}

}
