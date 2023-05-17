package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBook_Printing {
   WebDriver driver;
   public ChequeBook_Printing(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//td[text()='Parameters']")
   private WebElement Parameters1;
   public WebElement Parameters1() {
	   return Parameters1;
   }
   @FindBy(xpath="//td[text()='System Parameters']")
   private WebElement SystemParameters;
   public WebElement SystemParameters() {
	   return SystemParameters;
   }
   @FindBy(xpath="//td[text()='Control Record']")
   private WebElement Controlrecord;
   public WebElement Controlrecord() {
	   return Controlrecord;
   }
   @FindBy(xpath="//input[@id='chqbook_process_O001MT']")
   private WebElement chqbookProcess;
   public WebElement chqbookProcess() {
	   return chqbookProcess;
   }
   @FindBy(xpath="//input[@id='apply_chq_print_third_party_yn_O001MT']")
   private WebElement Applychqprint;
   public WebElement Applychqprint() {
	   return Applychqprint;
   }

}
