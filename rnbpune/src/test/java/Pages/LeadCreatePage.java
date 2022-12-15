package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadCreatePage {

	WebDriver driver;

	public LeadCreatePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;
	@FindBy(xpath = "//select[@id='lead_source']")
	private WebElement LeadSourceDropdown;
	@FindBy(xpath = "//select[@id='industry']")
	private WebElement industriesDropdown;
	@FindBy(xpath = "//select[@id='lead_status']")
	private WebElement leadStatusDropdown;

	@FindBy(xpath = "(//input[@name='button'])[1]")
	private WebElement savebutton;

	public String getTtileofpage() {

		String title = driver.getTitle();
		return title;

	}

	public LeadDetailsPage createlead(String name, String lastNmae) {

		firstname.sendKeys(name);
		lastname.sendKeys(lastNmae);
		Select act = new Select(LeadSourceDropdown);
		act.selectByValue("Partner");

		Select act2 = new Select(industriesDropdown);
		act2.selectByValue("Agriculture");
		Select act3 = new Select(leadStatusDropdown);
		act3.selectByValue("Qualified");
		savebutton.click();
		return new LeadDetailsPage(driver);

	}
}
