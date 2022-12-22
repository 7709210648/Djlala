package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fi {
	public static void main(String[] args) throws IOException, InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\main\\resources\\chromedriver.exe";

		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String path = "C:\\Users\\Dell\\eclipse-workspace\\SeleniumOnlline\\src\\test\\resources\\mah.txt";

		FileInputStream file = new FileInputStream(path);

		Properties pro = new Properties();

		pro.load(file);

		driver.get(pro.getProperty("link"));


		WebElement user = driver.findElement(By.xpath("//input[@name='user_name']"));

		user.sendKeys(pro.getProperty("username"));

		WebElement pass = driver.findElement(By.xpath("//input[@name='user_password']"));

		pass.sendKeys(pro.getProperty("password"));

		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(2000);

		WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		
		
		System.out.println(more.isDisplayed());
		
		
		
		
	}
	

}
