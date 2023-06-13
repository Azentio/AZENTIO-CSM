package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckingCashDepositAmountGreaterLimit {

	WebDriver driver;

	public CheckingCashDepositAmountGreaterLimit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CoreTransactionsFlag;
	public WebElement Core_TransactionsFlag_604() {
		return CoreTransactionsFlag;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement TransactionsMaintenance;
	public WebElement Transactions_Maintenance_604() {
		return TransactionsMaintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement MaintenanceTRXTypeBox;
	public WebElement Maintenance_TRXTypeBox_604() {
		return MaintenanceTRXTypeBox;
	}

	@FindBy(xpath = "//input[@id='trx_type_desc_D001MT']")
	private WebElement TRXTypeBoxClick;
	public WebElement TRXType_BoxClick_604() {
		return TRXTypeBoxClick;

	}
	@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
	 private WebElement TRXTypeCurrencyCode;
	 public WebElement TRXType_CurrencyCode_604() {
		 return TRXTypeCurrencyCode;
	}
	 @FindBy(xpath="//input[@id='ctrl_gl_D001MT']")
	 private WebElement TRXTypeGLCode;
	 public WebElement TRXType_GLCode_604() {
		 return TRXTypeGLCode;
	 }
	 @FindBy(xpath="//input[@id='ctrl_cif_D001MT']")
	 private WebElement TRXTypeCifCode;
	 public WebElement TRXType_CifCode_604() {
		 return TRXTypeCifCode;
	 }
	 @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	 private WebElement OkPopup;
	 public WebElement Ok_Popup_604() {
		 return OkPopup;
	 }
	 @FindBy(xpath="//span[text()='close']")
	 private WebElement ClosePopup;
	 public WebElement Close_Popup_604() {
		 return ClosePopup;
	 }
	 
	 @FindBy(xpath="//input[@id='lookuptxt_ctrl_sl_D001MT']")
	 private WebElement TRXTypeSerialNo;
	 public WebElement TRXTypeSerial_No_604() {
		 return TRXTypeSerialNo;
	 }
	 @FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	 private WebElement CurrencyCodeFlag;
	 public WebElement CurrencyCode_Flag() {
		 return CurrencyCodeFlag;
	 }
	 @FindBy(xpath="//input[@id='ctrl_cy_D001MT']")
	 private WebElement TRXTypeCurrencyCode2_604;
	 public WebElement TRXType_CurrencyCode2_604() {
		 return TRXTypeCurrencyCode2_604;
	 }
	 @FindBy(xpath="//input[@id='ctrl_gl_D001MT']")
	 private WebElement TRXTypeGLCode2_604;
	 public WebElement TRXType_GLCode2_604() {
		 return TRXTypeGLCode;
	 }
	 @FindBy(xpath="//input[@id='ctrl_cif_D001MT']")
	 private WebElement TRXTypeCifCode2;
	 public WebElement TRXType_CifCode2_604() {
		 return TRXTypeCifCode;
	 }
	 @FindBy(xpath="//input[@id='lookuptxt_ctrl_sl_D001MT']")
	 private WebElement TRXTypeSerialNo2;
	 public WebElement TRXTypeSerial_No2_604() {
		 return TRXTypeSerialNo;
	 }
	 @FindBy(xpath="//input[@id='amount_D001MT']")
	 private WebElement DebitAmount;
	 public WebElement Debit_Amount_604() {
		 return DebitAmount;
	 }
	 @FindBy(xpath="//span[contains(text(),' Save ')]")
	 private WebElement SaveButton;
	 public WebElement Save_Button_604() {
		 return SaveButton;
	 }
	 
	 
	 
	 
}