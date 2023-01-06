package olxpractice;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;import seleniumDriverCommands.webelemtsCommands;

public class olxAutoSugg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\selenium\\\\driver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.olx.in/pune_g4059014/q-mobile");

		driver.manage().window().maximize();

		WebElement dropdow = driver.findElement(By.xpath("(//button[@class='rui-1rYgw'])[1]"));

		dropdow.click();
		
		Thread.sleep(2000);
		
		
		
		
		

		Actions act = new Actions(driver);
//
//		
//
//		//WebElement pune = driver.findElement(By.xpath("(//div[@class='_1lcFr'])[1]"));
//		Thread.sleep(3000);
//		
//
     //act.sendKeys("pune").perform();
		//Thread.sleep(2000);
		
	dropdow.sendKeys("  pune");
		Thread.sleep(4000);
		
      
      List<WebElement>l=driver.findElements(By.xpath("//div[@class='_1lcFr']"));
      
      for (int i = 0; i < l.size(); i++) {
		
    	  String text=l.get(i).getText();
    	  System.out.println(text);
    	  if (text.contains("Maharashtra")) {
			
    		  act.click(l.get(i)).perform();
    		  
    		  break;
    		  
		}
	}

		

		WebElement textfield = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		textfield.clear();
		Thread.sleep(2000);
		
		textfield.sendKeys("mobile");
		

		WebElement submit = driver.findElement(By.xpath("//div[@class='_3jHVg']"));

		submit.click();

	}

}
