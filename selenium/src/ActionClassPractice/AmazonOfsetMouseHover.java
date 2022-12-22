package ActionClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOfsetMouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391490878&hvpos=&hvnetw=g&hvrand=13444746494399173342&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAiAnZCdBhBmEiwA8nDQxVT0Hdzlz9p4DJvHoIMtlYj-qpDECi8mVV0il6rqdjSPMeHxAduCVxoCq2AQAvD_BwE");

		driver.manage().window().maximize();

		WebElement primeOption = driver.findElement(By.cssSelector("#nav-link-amazonprime"));

		Actions act = new Actions(driver);

		Dimension d = primeOption.getSize();

		int x = 37;

		int y = 18;

		System.out.println(x + "                 " + y);

		act.moveToElement(primeOption, x, y).build().perform();

	}
}