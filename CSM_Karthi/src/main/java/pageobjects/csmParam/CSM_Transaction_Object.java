package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transaction_Object {
	WebDriver driver;

	public CSM_Transaction_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//TSA_023
	
//	@FindBy(xpath = "//td[text()='Transaction Type']")
//	private WebElement CSMParam_TransactionType;
//	public WebElement CSMParam_TransactionType() {
//		return CSMParam_TransactionType;
//	}
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA;
	public WebElement CSMParam_TransactionType_UPA() {
		return CSMParam_TransactionType_UPA;
	}
	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code;
	public WebElement CSMParam_TransactionType_UPA_code() {
		return CSMParam_TransactionType_UPA_code;
	}
	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code_doubleClick;
	public WebElement CSMParam_TransactionType_UPA_code_doubleClick() {
		return CSMParam_TransactionType_UPA_code_doubleClick;
	}
	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement CSMParam_TransactionType_AllowInternalGL;
	public WebElement CSMParam_TransactionType_AllowInternalGL() {
		return CSMParam_TransactionType_AllowInternalGL;
	}
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton;
	public WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton() {
		return CSMParam_TransactionType_AllowInternalGL_UPAButton;
	}
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement CSMParam_TransactionType_Approve;
	public WebElement CSMParam_TransactionType_Approve() {
		return CSMParam_TransactionType_Approve;
	}
	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;
	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
	}
	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick;
	public WebElement CSMParam_TransactionType_Approve_code_doubleClick() {
		return CSMParam_TransactionType_Approve_code_doubleClick;
	}
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;
	public WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton() {
		return CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;
	}
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSMCore_Transactions;
	public WebElement CSMCore_Transactions() {
		return CSMCore_Transactions;
	}
	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance;
	public WebElement CSMCore_Transactions_Maintenance() {
		return CSMCore_Transactions_Maintenance;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType;
	public WebElement CSMCore_Transactions_Maintenance_TRXType() {
		return CSMCore_Transactions_Maintenance_TRXType;
	}
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCode;
	public WebElement CSMCore_Transactions_Maintenance_BranchCode() {
		return CSMCore_Transactions_Maintenance_BranchCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCode;
	public WebElement CSMCore_Transactions_Maintenance_CurrencyCode() {
		return CSMCore_Transactions_Maintenance_CurrencyCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCode;
	public WebElement CSMCore_Transactions_Maintenance_GLCode() {
		return CSMCore_Transactions_Maintenance_GLCode;
	}
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCode;
	public WebElement CSMCore_Transactions_Maintenance_CIFCode() {
		return CSMCore_Transactions_Maintenance_CIFCode;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNo;
	public WebElement CSMCore_Transactions_Maintenance_SerialNo() {
		return CSMCore_Transactions_Maintenance_SerialNo;
	}
	
	//TSA_024
	
	
	@FindBy(xpath = "//input[@id='short_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No1;
	public WebElement CSMparam_transactionType_UPAA_Arabicword_No1() {
		return CSMparam_transactionType_UPAA_Arabicword_No1;
	}
	@FindBy(xpath = "//input[@id='long_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No2;
	public WebElement CSMparam_transactionType_UPAA_Arabicword_No2() {
		return CSMparam_transactionType_UPAA_Arabicword_No2;
	}//trs debit
}
