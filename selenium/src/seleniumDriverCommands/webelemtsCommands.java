package seleniumDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemtsCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");

		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.id("selenium143"));

		// 1. webelement need to click on it

	//	link.click();

		WebElement loginPage = driver.findElement(By.xpath("((//input[@type='text']))[2]"));

		// 2.sendkey()

		loginPage.sendKeys("alsfafdslfdsf");

		// 3.getText()

		String text = link.getText();

		System.out.println(text);

		// 4.getAttribute()

		String attribute = link.getAttribute("href");

		System.out.println(attribute);

		// 5.getSize for group of the elements

		System.out.println("sizeof the elements    " + link.getSize());

		// 6 getCssvalue()

		String cssvalue = link.getCssValue("color");

		System.out.println(cssvalue);

		// 7 getlocation();

		System.out.println("locationof the elements   " + link.getLocation());

		// before clear take String

		String beforeclear = loginPage.getText();

		System.out.println(beforeclear);
		// after clear
		// 8 clear();

	//	loginPage.clear();

		String afterclear = loginPage.getText();

		System.out.println(afterclear);

		// 2.webelement .sendkeys();

		// 3.weelemnt.getatteribute
		// 4.webelent.gettagname
		// 5.webelement.clear();
		// 6.isenable();
		// 7.weelement.isDisable();
		// 8.weelemnt.isselected();
		// 9.webelement.getText();
		// 10.webelement.getCssvalue();
		// 11.webelement.getLocation();
		// 12.getsize();
		// 13.submit();

	}

}
