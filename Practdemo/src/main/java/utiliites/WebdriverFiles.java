package utiliites;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverFiles {

	public void getselectDropdown(WebElement element, int index) {

		Select act = new Select(element);

		act.selectByIndex(index);

	}

	public void getSwitchtoAlertAccept(WebDriver driver) {

		driver.switchTo().alert().accept();

	}

	public void getSwitchToAlertDismiss(WebDriver driver) {

		driver.switchTo().alert().dismiss();
	}

	public String name(WebDriver driver) {

		String textalert = driver.switchTo().alert().getText();

		return textalert;
	}

	public void getSwitchToFrame(WebDriver driver, int index) {

		driver.switchTo().frame(index);
	}

	public void getSwitchToframeById(WebDriver driver, String id_attribute) {

		driver.switchTo().frame(id_attribute);
	}

	public void tohandleActionMouse(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);

		act.moveToElement(element).perform();

	}

	public void getSwitchToWindow(WebDriver driver, String WindowPageName) {

		Set<String> list = driver.getWindowHandles();

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {

			String win = it.next();
			if (win.contains(WindowPageName)) {

				driver.switchTo().window(win);

				break;
			}
		}
	}

	public String getParentIdWindow(WebDriver driver) {

		String parentId = driver.getWindowHandle();

		return parentId;

	}

	public void getSwitchToParen(WebDriver driver, String parentId) {

		Set<String> list = driver.getWindowHandles();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {

			String win = it.next();
			if (win.contains(parentId)) {

				driver.switchTo().window(win);
				break;

			}
		}

	}

	public void getDoubleClick(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);

	}

	public void name() {

	}

}
