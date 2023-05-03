package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card_Management {

	 WebDriver driver;
	 public Card_Management(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//td[text()='Card Request']")
	 private WebElement CardRequest_CW;
	 public WebElement CardRequest_CW() {
		 return CardRequest_CW;
	 }
	 @FindBy(xpath="//td[text()='Cards Management']")
	 private WebElement CardManagement_Waive;
	 public WebElement CardManagement_Waive() {
		 return CardManagement_Waive;
	 }
	 @FindBy(xpath="//input[@name='CARD_TYPE']")
	 private WebElement CardType_CW;
	 public WebElement CardType_CW() {
		 return CardType_CW;
	 }
	 @FindBy(xpath="//span[text()='Approve']")
	 private WebElement Approve_CW;
	 public WebElement Approve_CW() {
		 return Approve_CW;
	 }
	 @FindBy(xpath="//input[@name='CIF']")
	 private WebElement CIF_CW;
	 public WebElement CIF_CW() {
		 return CIF_CW;
	 }
	 @FindBy(xpath="//span[text()='Charges']")
	 private WebElement Charges_CW;
	 public WebElement Charges_CW() {
		 return Charges_CW;
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
	   private WebElement Transactiontype1;
	   public WebElement Transactiontype1() {
	 	  return Transactiontype1;
	   }
	   @FindBy(xpath="//span[text()='Maintenance']")
	   private WebElement Maintenancebutton_lostfound1;
	   public WebElement Maintenancebutton_lostfound1() {
	   	return Maintenancebutton_lostfound1;
	   }
	   @FindBy(xpath="(//input[@name='CODE'])[2]")
	   private WebElement CODESEARCHbox1;
	   public WebElement CODESEARCHbox1() {
	 	  return CODESEARCHbox1;
	   }
	   @FindBy(xpath="(//input[@name='SHORT_DESC_ENG'])[2]")
	   private WebElement ShortDESCRIPTIONs;
	   public WebElement ShortDESCRIPTIONs() {
	 	  return ShortDESCRIPTIONs;
	   }
	   @FindBy(xpath="//a[@id='infoBarSearchButton_P024MA']")
	   private WebElement SearchBUTTOn1;
	   public WebElement SearchBUTTOn1() {
	 	  return SearchBUTTOn1;
	   }
	   
	   @FindBy(xpath="//input[@id='allow_clearing_chrg_P024MA']")
	   private WebElement AllowUSERbox1;
	   public WebElement AllowUSERbox1() {
	 	  return AllowUSERbox1 ;
	   }
	   @FindBy(xpath="//span[text()='Update After Approve']")
	   private WebElement UpdateAfterAPPROVE123;
	   public WebElement UpdateAfterAPPROVE123() {
	 	  return UpdateAfterAPPROVE123;
	 	
	   }
	 	  
	   @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	   private WebElement okBUTTON;
	   public WebElement okBUTTON() {
	 	  return okBUTTON ;
	   }
	   @FindBy(xpath="//label[@id=\"transactionTypesMaint_FormId_P024MT_Save_key\"]")
	   private WebElement Savebox;
	   public WebElement Savebox() {
	 	  return Savebox ;
	   }
	   
	   @FindBy(xpath="//span[text()='close']")
	   private WebElement closeButton_lot;
	   public WebElement closeButton_lot() {
	 	  return closeButton_lot ;
	   }
}
