package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewApplicationIdcard {
     WebDriver  driver;
     public NewApplicationIdcard(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
}
