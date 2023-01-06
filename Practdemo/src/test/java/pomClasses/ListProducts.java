package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListProducts {

	WebDriver driver;
	
	public ListProducts(WebDriver driver) {

	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']" )
	private WebElement createproduct;
	
	
	public createProducts getclickonCreateProducts() {
		
		createproduct.click();
		
		return new  createProducts(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
