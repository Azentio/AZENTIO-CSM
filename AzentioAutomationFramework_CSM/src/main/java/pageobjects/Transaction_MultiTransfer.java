package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction_MultiTransfer {
             WebDriver driver;
             public Transaction_MultiTransfer(WebDriver driver) {
            	 this.driver=driver;
            	 PageFactory.initElements(driver, this);
             }
             @FindBy(xpath="//td[text()='Transactions']")
             private WebElement Transaction_MT;
             public WebElement Transaction_MT() {
            	 return Transaction_MT;
             }
             @FindBy(xpath="//span[text()='Maintenance']")
             private WebElement Maintenance_MT;
             public WebElement Maintenance_MT() {
            	 return Maintenance_MT;
             }
}
