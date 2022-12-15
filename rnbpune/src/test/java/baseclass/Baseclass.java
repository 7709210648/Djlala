package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.apache.poi.util.Configurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public WebDriver driver;
	public Properties pro;

	public Logger log;

	public Baseclass() throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\dekan\\modula\\bin\\dhanaa\\rnbpune\\propertyfile\\properties.file";

		pro = new Properties();

		File file = new File(path);
		try {
			FileInputStream f1 = new FileInputStream(file);

			pro.load(f1);

		} catch (FileNotFoundException e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
		}

	}

	@BeforeClass
	public void setup() {

		log = Logger.getLogger("log message");

		PropertyConfigurator.configure("check.propertiesfile");

		log.info("setup chrome driver is lounched");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		log.info("url is loaded");

		driver.get(pro.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().deleteAllCookies();

	}

	@AfterClass
	public void tearDown() {
		log.info("browser is closed");
		driver.close();

	}

	public void getscreenShot(WebDriver driver, String name) throws IOException {

		String path = "C:\\Users\\Dell\\eclipse-workspace\\dekan\\modula\\bin\\dhanaa\\rnbpune\\screenshos";

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File(System.getProperty("user.dir") + "/Screenshot" + name + ".png");

		FileUtils.copyFile(source, target);

		System.out.println("get screenshot");

	}
}
