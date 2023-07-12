package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewCardApplicationActive {
   WebDriver driver;
   public NewCardApplicationActive(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
}
