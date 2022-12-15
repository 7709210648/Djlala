package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActivityCreatePage {

	
WebDriver driver;

	public ActivityCreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='campaign_name']")
	public WebElement campaign_name;

	@FindBy(xpath = "//select[@id='type']")
	public WebElement typeDropdown;

	@FindBy(xpath = "//input[@id='start_date']")
	public WebElement startdate;

	@FindBy(xpath = "//input[@id='expected_revenue']")
	public WebElement expectedRevenue;

	@FindBy(xpath = "//input[@id='actual_cost']")
	public WebElement actualcost;

	@FindBy(xpath = "//input[@id='active']")
	public WebElement activeCheckbox;

	@FindBy(xpath = "//select[@id='status']")
	public WebElement statusDropdown;

	@FindBy(xpath = "//input[@id='end_date']")
	public WebElement enddate;

	@FindBy(xpath = "//input[@id='budgeted_cost']")
	public WebElement budgetedCost;

	@FindBy(xpath = "//input[@id='expected_response']")
	public WebElement expectderespocesoul;

	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement description;

	@FindBy(xpath = "//*[@id='main']/form[1]/div[7]/div[2]/input[1]")
	public WebElement savebutton;

	// error message for invalid data

	@FindBy(xpath = "//*[@id='elem1']/div[1]/table[1]/tbody[1]/tr[1]/td[2]/ul/li[1]")
	public WebElement errormessage;

	public String verifTheTitle() {

		String actualTitle = driver.getTitle();

		return actualTitle;
	}

	public ActivityDetailsPage AddactivityetailsPage(String nameactiviity, String dateodStart, String revenueexpected,
			String actualrequirecost, String responcetheyExpected) {

		campaign_name.sendKeys(nameactiviity);

		Select act = new Select(typeDropdown);

		act.selectByValue("Advertisement");

		startdate.sendKeys(dateodStart);

		// formate yyyy-mm-dd

		expectedRevenue.sendKeys(revenueexpected);

		actualcost.sendKeys(actualrequirecost);

		Select act2 = new Select(statusDropdown);

		act2.selectByValue("Planned");

		expectderespocesoul.sendKeys(responcetheyExpected);

		savebutton.click();

		return new ActivityDetailsPage(driver);

	}
}
