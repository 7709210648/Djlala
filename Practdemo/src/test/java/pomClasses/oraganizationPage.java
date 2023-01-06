package pomClasses;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oraganizationPage {

	WebDriver driver;

	public oraganizationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchTexxt;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchButton;

//	@FindBy(xpath = "//a[text()='Test yantara']")
//	private

	@FindBy(xpath = "(//table[@class='small'])[3]/tbody/tr[2]/td[1]/a")
	private WebElement l;

	public void switchtoWindow(String oraganizationName) throws InterruptedException {

		String mainwin = driver.getWindowHandle();

		Set<String> childwin = driver.getWindowHandles();

		Iterator<String> it = childwin.iterator();

		while (it.hasNext()) {

			String win = it.next();

			String title = driver.switchTo().window(win).getTitle();

			if (title.contains("Organization")) {

				break;

			}

		}

		searchTexxt.sendKeys(oraganizationName);

		searchButton.click();
		Thread.sleep(2000);

		l.click();

		driver.switchTo().window(mainwin);

	}

}
