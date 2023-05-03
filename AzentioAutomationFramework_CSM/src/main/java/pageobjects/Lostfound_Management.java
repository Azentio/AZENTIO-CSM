package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lostfound_Management {
   WebDriver driver;
   public Lostfound_Management(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//td[text()='Lost & Found Management']")
   private WebElement LostFound_CW;
   public WebElement LostFound_CW() {
	   return LostFound_CW;
   }
   @FindBy(xpath="//span[text()='Maintenance']")
   private WebElement Maintenancebutton_lostfound;
   public WebElement Maintenancebutton_lostfound() {
   	return Maintenancebutton_lostfound;
   }
   @FindBy(xpath="//input[@name='TRX_NO']")
   private WebElement TRx_No;
   public WebElement TRX_No() {
	   return TRx_No;
   }
   @FindBy(xpath="//input[@name='SHORT_NAME_ENG']")
   private WebElement ShortName_Eng;
   public WebElement ShortName_Eng() {
	   return ShortName_Eng;
   } 
   @FindBy(xpath="(//span[text()=' Charges Details '])[1]")
   private WebElement ChargesDetails_Lost;
   public WebElement ChargesDetails_Lost() {
	   return ChargesDetails_Lost;
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
