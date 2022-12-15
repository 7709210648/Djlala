package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectibldetailPage {

	WebDriver driver;

	public CollectibldetailPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='header_center header_center_width']/h1[1]/span[3]")
	public WebElement newlyCreatedCollectible;

	public String GetTitle() {
		String title = driver.getTitle();

		return title;
	}
}
