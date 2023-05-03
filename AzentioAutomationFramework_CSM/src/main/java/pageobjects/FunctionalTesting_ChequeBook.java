package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionalTesting_ChequeBook {
  WebDriver driver;
  public FunctionalTesting_ChequeBook(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement chequebook1;
	public WebElement chequebook1() {
		return chequebook1;
	}
  @FindBy(xpath="//span[text()='Maintenance']")
  private WebElement Maintenancebutton12;
  public WebElement Maintenancebutton12() {
  	return Maintenancebutton12;
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
  @FindBy(xpath="//input[@name='CHEQUE_CODE']")
  private WebElement Chequecode;
  public WebElement Chequecode() {
	  return Chequecode;
  }
  @FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_GL']")
  private WebElement GLCode;
  public WebElement GLCode() {
	  return GLCode;
  }
  @FindBy(xpath="//span[text()='Charges']")
  private WebElement Charges;
  public WebElement Charges() {
	  return Charges;
  }
  @FindBy(xpath="//td[text()='Transaction Type']")
  private WebElement Transactiontype;
  public WebElement Transactiontype() {
	  return Transactiontype;
  }
  @FindBy(xpath="//span[text()='Update After Approve']")
  private WebElement UpdateAfterAPPROVE;
  public WebElement UpdateAfterAPPROVE() {
	  return UpdateAfterAPPROVE;
  }
  @FindBy(xpath="(//input[@name='CODE'])[2]")
  private WebElement CODESEARCHbox;
  public WebElement CODESEARCHbox() {
	  return CODESEARCHbox ;
  }
  @FindBy(xpath="(//input[@name='SHORT_DESC_ENG'])[2]")
  private WebElement ShortDESCRIPTION;
  public WebElement ShortDESCRIPTION() {
	  return ShortDESCRIPTION ;
  }
  @FindBy(xpath="//a[@id='infoBarSearchButton_P024MA']")
  private WebElement SearchBUTTOn;
  public WebElement SearchBUTTOn() {
	  return SearchBUTTOn ;
  }
  
  @FindBy(xpath="//input[@id='allow_clearing_chrg_P024MA']")
  private WebElement AllowUSERbox;
  public WebElement AllowUSERbox() {
	  return AllowUSERbox ;
  }
  @FindBy(xpath="//span[text()='Update After Approve']")
  private WebElement UpdateAfterAPPROVE12;
  public WebElement UpdateAfterAPPROVE12() {
	  return UpdateAfterAPPROVE12;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
}
