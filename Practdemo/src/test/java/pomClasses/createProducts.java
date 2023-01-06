package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createProducts {
	WebDriver driver;

	public createProducts(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='productname']")
	private WebElement productName;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebuttonElement;

	public DetailsProduts createNewProducts(String productname) {

		productName.sendKeys(productname);
		savebuttonElement.click();

		return new DetailsProduts(driver);

	}
}
