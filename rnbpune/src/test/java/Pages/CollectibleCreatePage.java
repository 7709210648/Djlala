package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectibleCreatePage {

	public WebDriver driver;

	public CollectibleCreatePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#account_name")
	private WebElement accountname;

	@FindBy(css = "#account_site")
	private WebElement account_site;

	@FindBy(css = "#email")
	private WebElement email;
	@FindBy(css = "#account_number")
	private WebElement accountnumber;
	@FindBy(xpath = "//*[@id='main']/form[1]/div[5]/input[1]")
	private WebElement savebutton;

	public String gettilte() {
		String ttle = driver.getTitle();
		return ttle;
	}

	public CollectibldetailPage createcollectibleDetails(String enteraccountname, String entersite, String enteremail,
			String accountnumberemnter) {

		accountname.sendKeys(enteraccountname);
		account_site.sendKeys(entersite);
		;
		email.sendKeys(enteremail);
		accountnumber.sendKeys(accountnumberemnter);

		boolean savebittondispla = savebutton.isDisplayed();
		if (savebittondispla) {
			savebutton.click();
		}
		return new CollectibldetailPage(driver);

	}
}
