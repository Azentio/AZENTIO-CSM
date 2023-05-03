package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StandingOrder_product {
   WebDriver driver;
   public StandingOrder_product(WebDriver driver) {
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
   @FindBy(xpath="//td[text()='Transaction Type']")
   private WebElement TransactionType;
   public WebElement TransactionType() {
	   return TransactionType;
   }
   @FindBy(xpath="//span[text()='Update After Approve']")
   private WebElement UpdateAA;
   public WebElement UpdateAA() {
	   return UpdateAA;
 
}
   @FindBy(xpath = "//input[@name='CODE']")
   private WebElement CodeSO;
   public WebElement codeSO() {
	   return CodeSO;
   }
   @FindBy(xpath  ="(//td[text()='ritaso'])[1]")
   private WebElement ritaso1;
   public WebElement ritaso1() {
	   return ritaso1;
   }
   @FindBy(xpath="(//span[text()='Standing Order'])[2]")
   private WebElement StandingOrder;
   public WebElement StandingOrder() {
	   return StandingOrder;
   }
   @FindBy(xpath="//input[@id='standing_order_P024MA']")
   private WebElement StandingOrderclick;
   public WebElement StandingOrderclick() {
	   return StandingOrderclick;
   }
   @FindBy(xpath="//input[@id='so_type_P024MAP']")
   private WebElement Periodecil;
   public WebElement Periodecil() {
	   return Periodecil;
   }
   @FindBy(xpath = "//input[@name='CODE']")
   private WebElement Codedaily;
   public WebElement Codedaily() {
	   return Codedaily;
   }
   @FindBy(xpath="(//td[text()='DAILY SO'])[1]")
   private WebElement DailySodoubleclick;
   public WebElement DailySodoubleclick() {
	   return DailySodoubleclick;
   }
   @FindBy(xpath="//td[text()='Transactions']")
   private WebElement Transactions;
   public WebElement Transactions() {
	   return Transactions;
   }
}
