package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement oraganization;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement sigout;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutbutton;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contact;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement Products;

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leads;

	@FindBy(xpath = "(//a[text()='Contacts'])[1]")
	private WebElement contactfeature;

	public String getTitle() {

		String title = driver.getTitle();

		return title;

	}

	public WebElement getwebelement() {

		WebElement element = sigout;
		return element;

	}

	public void getclickonSignbutton() {

		signoutbutton.click();
	}

	public ListOraganization getclickonOrganization() {

		oraganization.click();

		return new ListOraganization(driver);

	}

	public ListProducts getClickonProduct() {
		Products.click();

		return new ListProducts(driver);

	}

	public listContact getclickonContactfeature() {

		contactfeature.click();

		return new listContact(driver);
	}

	public void getClickLeads() {
		leads.click();

	}
}
