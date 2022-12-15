package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectibleListPage {

	WebDriver driver;

	public CollectibleListPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='body_content']/h2[1]/input[1]")

	public WebElement addcollectibleButton;

	public String getTitle() {

		String title = driver.getTitle();
		return title;

	}
}
