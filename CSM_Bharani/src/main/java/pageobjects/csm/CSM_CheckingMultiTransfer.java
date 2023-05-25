package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_CheckingMultiTransfer {

	WebDriver driver ;

	public CSM_CheckingMultiTransfer (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Transactions']")
	 private WebElement CoreTransactionsFlag;
	 public WebElement Core_TransactionsFlag() {
		 return CoreTransactionsFlag; 
	 }
	 @FindBy(xpath="//span[text()='Maintenance']")
	 private WebElement TransactionsMaintenance;
	 public WebElement Transactions_Maintenance() {
		 return TransactionsMaintenance;
	 }
	 @FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
	 private WebElement MaintenanceTRXTypeBox;
	 public WebElement Maintenance_TRXTypeBox() {
		 return MaintenanceTRXTypeBox;
	 }
	 @FindBy(xpath="//input[@id='trx_type_desc_D001MT']")
	 private WebElement TRXTypeBoxClick;
	 public WebElement TRXType_BoxClick() {
		 return TRXTypeBoxClick;
	 }
	 @FindBy(xpath="//input[@id='trs_ac_br_D001MT']")
	 private WebElement TRXTypeBranchCode;
	 public WebElement TRXType_BranchCode() {
		 return TRXTypeBranchCode;
	 }
	 @FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
	 private WebElement TRXTypeCurrencyCode;
	 public WebElement TRXType_CurrencyCode() {
		 return TRXTypeCurrencyCode;
	 }
	 @FindBy(xpath="//input[@id='trs_ac_gl_D001MT']")
	 private WebElement TRXTypeGLCode;
	 public WebElement TRXType_GLCode() {
		 return TRXTypeGLCode;
	 }
	 @FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
	 private WebElement TRXTypeCifCode;
	 public WebElement TRXType_CifCode() {
		 return TRXTypeCifCode;
	 }
}
 
 
 
