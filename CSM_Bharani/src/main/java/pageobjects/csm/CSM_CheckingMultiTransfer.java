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
	 @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	 private WebElement OkPopup;
	 public WebElement Ok_Popup() {
		 return OkPopup;
	 }
	 @FindBy(xpath="//span[text()='close']")
	 private WebElement ClosePopup;
	 public WebElement Close_Popup() {
		 return ClosePopup;
	 }
	 
	 @FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	 private WebElement TRXTypeSerialNo;
	 public WebElement TRXTypeSerial_No() {
		 return TRXTypeSerialNo;
	 }
	 @FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	 private WebElement CurrencyCodeFlag;
	 public WebElement CurrencyCode_Flag() {
		 return CurrencyCodeFlag;
	 }
	 @FindBy(xpath="//input[@id='amount_D001MT']")
	 private WebElement DebitAmount;
	 public WebElement Debit_Amount() {
		 return DebitAmount;
	 }
	 @FindBy(xpath="//label[text()='Account Details ']")
	 private WebElement AccountDetailsIcon;
	 public WebElement Account_DetailsIcon() {
		 return AccountDetailsIcon; 
	 }
	 @FindBy(xpath="//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']//span")
	 private WebElement AddIconAccountDetails;
	 public WebElement AddIcon_AccountDetails() {
		 return AddIconAccountDetails;
	 }
	 @FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR']")
	 private WebElement BrachCodeAccountDetails;
	 public WebElement BranchCode_AccountDetails() {
		 return BrachCodeAccountDetails;
	 }
	 @FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']")
	 private WebElement GLCodeAccountDetails;
	 public WebElement GLCode_AccountDetails() {
		 return GLCodeAccountDetails;
	 }
	 @FindBy(xpath="//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']")
	 private WebElement CIFCodeAccountDetails;
	 public WebElement CIFCode_AccountDetails() {
		 return CIFCodeAccountDetails;
	 }
	 @FindBy(xpath="//input[@id='new_1685017638623_ctstrsACCDETVO.AC_SL_lookuptxt_trxMgntAccountDtlGridTbl_Id_D001MT']")
	 private WebElement SerialNumberAccountDetails;
	 public WebElement SerialNumber_AccountDetails() {
		 return SerialNumberAccountDetails;
	 }
	 @FindBy(xpath="//input[@id='new_1685017638623_ctstrsACCDETVO.FC_AMOUNT']")
	 private WebElement FirstAmountAccountDetails;
	 public WebElement FirstAmount_AccountDetails() {
		 return FirstAmountAccountDetails;
	 }
	 @FindBy(xpath="//span[text()='ok']")
	 private WebElement OkButtonAccountDetails;
	 public WebElement OkButton_AccountDetails() {
		 return OkButtonAccountDetails;
	 }
	 @FindBy(xpath="//span[contains(text(),' Save ')]")
	 private WebElement SaveButton;
	 public WebElement Save_Button() {
		 return SaveButton;
	 }
	 
	 
}
 
 
 
