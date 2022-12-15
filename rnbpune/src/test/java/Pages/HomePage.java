package Pages;

import java.util.List;

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

	@FindBy(xpath = "//span[@class='header_text']")
	public WebElement homelogo;

	@FindBy(tagName = "a")
	public List<WebElement> list1;

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement logoutlogo;

	@FindBy(xpath = "//a[contains(text(),'Campaigns') and @title='Campaigns'and@accesskey='k']")
	public WebElement activitieslogo;

	@FindBy(xpath = "//a[contains(text(),'Leads')and @accesskey]")
	public WebElement leadslogo;

	@FindBy(xpath = "//span[contains(text(),'Home')]/parent::a")
	public WebElement homelink;

	@FindBy(xpath = "//a[@href='#00'and @title='Contacts'and@accesskey='c']")
	public WebElement resources;

	@FindBy(xpath = "//a[@href='#00'and @title='Accounts'and@accesskey='a']")
	public WebElement collectibles;

	@FindBy(xpath = "//a[@href='#00'and @title='Quotes'and@accesskey='q']")
	public WebElement quotes;

	@FindBy(xpath = "//a[@href='#00'and @title='Products'and@accesskey='p']")
	public WebElement productslogo;

	public String actualTtileHomepage() {

		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public ActivityListPage clickonActvityModule() {

		boolean clcikable = activitieslogo.isDisplayed();

		if (clcikable) {

			activitieslogo.click();

		}
		return new ActivityListPage(driver);

	}

	public String ActualLink() {
		String urlofHoepage = driver.getCurrentUrl();

		return urlofHoepage;
	}

	public void clickonlogout() {

		logoutlogo.click();

	}

	public ActivityListPage clickonAcitivityModule() {

		activitieslogo.click();

		return new ActivityListPage(driver);
	}

	public LeadListPage clcikonLeadFeature() {

		leadslogo.click();

		return new LeadListPage(driver);

	}
}
