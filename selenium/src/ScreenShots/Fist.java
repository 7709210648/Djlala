package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fist {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.manage().window().maximize();

        getScreenShot(driver, "gopal");
        
		

	}
	
	public static void getScreenShot(WebDriver driver,String name) throws IOException {
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		
		File Source=tc.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\Dell\\git\\Djlala\\Djlala\\selenium\\ScreenShot\\"+name+".png");
		
		FileUtils.copyFile(Source, destination);
		
		System.out.println("message for screenshot");
		
	}
}