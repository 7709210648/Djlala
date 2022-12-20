package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChekMultipleOrnOt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.id("multiselect1"));

		// create the object for select class

		Select act = new Select(checkBox);

		// check the check box is multiple selection or not

		System.out.println(act.isMultiple());

		// Scenario 1st
		// if ismulti selected the select all the option of the list

		if (act.isMultiple()) {

			// find the number of theoption present in the list
			int size = act.getOptions().size();

			// print the number of the list

			System.out.println(size);

			for (int i = 0; i < size; i++) {

				// select the perticulation each option s

				act.getOptions().get(i).click();

			}
		}
	}

}
