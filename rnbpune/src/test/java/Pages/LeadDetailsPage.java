package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {

	WebDriver driver;

	public LeadDetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement logoutButton;

	@FindBy(xpath = "//span[@class='header_textsub']")
	private WebElement newleadDeatails;

	public String gettitle() {

		String title = driver.getTitle();
		return title;
	}

	public String verfytheleaddetails() {

		String leaddetailsname = newleadDeatails.getText();

		return leaddetailsname;

	}

	public void clickonLogout() {

		logoutButton.click();

	}

}
