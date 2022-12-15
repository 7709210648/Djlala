package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityListPage {

	WebDriver driver;

	public ActivityListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='button'and@class='button'and @value='Add Campaign']")
	public WebElement addactivities;
	// view button for first activity list
	@FindBy(xpath = "//*[@id='1'and @class='light']/td[2]/a[1]")
	public WebElement viewbuttonFirst;
	//

	// go button for lead search field functionality
	@FindBy(xpath = "//input[@type='button'and@value='Go']")
	public WebElement Gobutton;

	// Show dropdown on acitity list page
	@FindBy(xpath = "//select[@name='view_options']")
	public WebElement ShowDropdown;

	// Cusomise result per page option
	@FindBy(xpath = "//select[@name='revdatabase_limit_view']")
	public WebElement ResultPerPage;

	// view button for pericular activity page
	@FindBy(xpath = "//*[@id='1']/td[2]/a[2]")
	public WebElement viewButton;

	// delete button
	@FindBy(xpath = "//*[@id='1']/td[3]/a[1]")
	public WebElement deleteButton;
	public Object campaign_name;

	// Activity details symbol create details
	@FindBy(xpath = "//*[@id='1']/td[4]")
	public WebElement createdetailsName;

	public String ActualTitle() {

		String ActualTitl = driver.getTitle();

		return ActualTitl;

	}

	public ActivityCreatePage clicAddactivity() {

		addactivities.click();
		return new ActivityCreatePage(driver);

	}

}
