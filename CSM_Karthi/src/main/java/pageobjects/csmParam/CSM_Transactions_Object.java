package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transactions_Object {
	WebDriver driver;
	public CSM_Transactions_Object(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
