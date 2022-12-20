	package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AKSHAY {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();
		
		String path= "C:\\Users\\Dell\\Desktop\\AKSHAY.xlsx";
		
		FileInputStream f1= new FileInputStream(path);
		
		Workbook wb= WorkbookFactory.create(f1);
		
		Sheet s1=wb.getSheet("Sheet1");
		
		Row r1= s1.getRow(1);
		
		Cell c1= r1.getCell(0);
		
		DataFormatter formate= new DataFormatter();
	
		String username=formate.formatCellValue(c1);
		
		System.out.println(username);
		
		
	  
		
	}
}
