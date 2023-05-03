package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardDetails_product {
   WebDriver driver;
   public CardDetails_product(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//td[text()='Parameters']")
   private WebElement Parameters12;
   public WebElement Parameters12() {
	   return Parameters12;
   }
   @FindBy(xpath="//td[text()='System Parameters']")
   private WebElement SystemParameters;
   public WebElement SystemParameters() {
	   return SystemParameters;
}
   @FindBy(xpath="//td[text()='Cards']")
   private WebElement Cardsbutton;
   public WebElement Cardsbutton() {
	   return Cardsbutton;
   }
   @FindBy(xpath="//td[text()='Cards Type']")
   private WebElement Cardstypebutton;
   public WebElement Cardstypebutton() {
	   return Cardstypebutton;
   }
   @FindBy(xpath="//span[text()='Maintenance']")
   private WebElement Maintenancebutton13;
   public WebElement Maintenancebutton13() {
   	return Maintenancebutton13;
   }
   @FindBy(xpath = "//input[@name='CODE']")
   private WebElement Cardcode;
   public WebElement Cardcode() {
 	   return Cardcode;
   }
   @FindBy(xpath="(//td[text()='caa'])[2]")
   private WebElement caaclick;
   public WebElement caaclick() {
	   return caaclick;
   }
   @FindBy(xpath="//label[text()='Update ']")
   private WebElement Updatebutton1;
   public WebElement Updatebutton1() {
	   return Updatebutton1;
   }
   @FindBy(xpath = "//td[text()='Cards Management'']")
   private WebElement CardManagement;
   public WebElement CardManagement() {
	   return CardManagement;
}
   @FindBy(xpath="//td[text()='Card Request']")
   private WebElement CardRequest;
   public WebElement CardRequest() {
	   return CardRequest;
   }
   @FindBy(xpath="//input[@id='lookuptxt_cif_G001MT']")
   private WebElement CIFbutton;
   public WebElement CIFbutton() {
	   return CIFbutton;
   }
}
