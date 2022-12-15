package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityDetailsPage {

	WebDriver driver;

	public ActivityDetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='header_textsub']")
	public WebElement tagname;

	@FindBy(xpath = "//*[@id='main']/form[1]/div[2]/div[3]/h1[1]/span[1]")
	public WebElement Activityname;

	// edit button display on activity details page
	@FindBy(xpath = "//*[@id='main']/form[1]/div[5]/input[1]")
	public WebElement editbutton;

	// activities module
	@FindBy(xpath = "//*[@id=\"tabs\"]/ul[1]/li[1]/a[1]")
	public WebElement actvityModule;

	// lead modules
	@FindBy(xpath = "//*[@id=\"tabs\"]/ul[1]/li[2]/a[1]")
	public WebElement leadModule;

	@FindBy(xpath = "//span[@class='header_textsub']")
	private WebElement activityDetailsTitle;

	@FindBy(xpath = "//div[@id='tabs']/ul[1]/li[7]/a[1]")
	private WebElement collectibeModule;

	@FindBy(xpath = "(//a[text()='Campaigns'])[1]")

	public WebElement activityModule;

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	public WebElement logoutlogo;

	public String Gettitle() {

		String tite = driver.getTitle();

		return tite;
	}

	public String currentUrlDetailspage() {

		String url = driver.getCurrentUrl();

		return url;

	}

	public String verifyActivitTitle() {

		String title = activityDetailsTitle.getText();

		return title;
	}

	public CollectibleListPage clickOnCollectibleModule() {

		boolean clickoncollectible = collectibeModule.isDisplayed();

		if (clickoncollectible) {

			collectibeModule.click();

		}
		return new CollectibleListPage(driver);

	}

	public void clickonactivityModule() {

		activityModule.click();

	}

	public String ActualLink() {
		String urlofHoepage = driver.getCurrentUrl();

		return urlofHoepage;
	}

	public void clickonlogout() {

		logoutlogo.click();

	}
}
