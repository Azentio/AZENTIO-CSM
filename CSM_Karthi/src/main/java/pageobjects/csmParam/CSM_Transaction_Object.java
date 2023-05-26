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
	//TRS_023
	
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
	
	
	//TRS_027
	
	@FindBy(xpath="//td[text()='Transactions']")
	private WebElement Transactions_Transactions;
	public WebElement Transactions_Transactions()
	{
		return Transactions_Transactions;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Transactions_MaintenanceScrn;
	public WebElement Transactions_MaintenanceScrn()
	{
		return Transactions_MaintenanceScrn;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue;
	public WebElement Transactions_Trxtypevalue()
	{
		return Transactions_Trxtypevalue;
	}
	@FindBy(xpath="//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_depositAcc_Branchcode;
	public WebElement Transactions_depositAcc_Branchcode()
	{
		return Transactions_depositAcc_Branchcode;
	}
	
	@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode;
	public WebElement Transactions_debitAcc_Currencycode()
	{
		return Transactions_debitAcc_Currencycode;
	}
	@FindBy(xpath="//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode;
	public WebElement Transactions_debitAcc_Glcode()
	{
		return Transactions_debitAcc_Glcode;
	}
	@FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode;
	public WebElement Transactions_debitAcc_Cifcode()
	{
		return Transactions_debitAcc_Cifcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;
	public WebElement Transactions_debitAcc_serialcode()
	{
		return Transactions_debitAcc_serialcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;
	public WebElement Transactions_debitAcc_currency()
	{
		return Transactions_debitAcc_currency;
	}
	
	@FindBy(xpath="//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;
	public WebElement Transactions_EnterAmount()
	{
		return Transactions_EnterAmount;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;
	public WebElement Transactions_Warning_okbtn()
	{
		return Transactions_Warning_okbtn;
	}	
	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Transactions_savebtn;
	public WebElement Transactions_savebtn()
	{
		return Transactions_savebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;
	public WebElement Transactions_successokbtn()
	{
		return Transactions_successokbtn;
	}
	@FindBy(xpath="//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;
	public WebElement Transactions_Approvescrn()
	{
		return Transactions_Approvescrn;
	}
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;
	public WebElement Transactions_transactionNo_codeValue()
	{
		return Transactions_transactionNo_codeValue;
	}
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk;
	public WebElement Transactions_transactionNo_Doubleclk()
	{
		return Transactions_transactionNo_Doubleclk;
	}	
	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;
	public WebElement Transactions_searchbtn()
	{
		return Transactions_searchbtn;
	}	
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_trxno_code;
	public WebElement Transactions_trxno_code()
	{
		return Transactions_trxno_code;
	}	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_doubleclk_codevalue;
	public WebElement Transactions_doubleclk_codevalue()
	{
		return Transactions_doubleclk_codevalue;
	}	
	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement Transactions_BookedEntries;
	public WebElement Transactions_BookedEntries()
	{
		return Transactions_BookedEntries;
	}	
	
	@FindBy(xpath="//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
 private WebElement Transactions_Approvebtn;
public WebElement Transactions_Approvebtn()
 {
return Transactions_Approvebtn;
}

//TRS_024
@FindBy(xpath="//input[@id='rqst_cy_nomination_det_P024MA']")
private WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox;
public WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox()
{
return Transactions_Approvebtn;
}
}


