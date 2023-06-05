package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashDepositTransaction {
	WebDriver driver;
	public CashDepositTransaction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;

	public WebElement CSM_BranchCodeINdebitAc() {
		return CSM_BranchCodeINdebitAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc() {
		return CSM_CurrencyCodedebitAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc() {
		return CSM_GLCodedebitAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc() {
		return CSM_CIFCodeIndebitAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;
	public WebElement CSM_SerialIndebitAc() {
		return CSM_SerialIndebitAc;
	}
	@FindBy(id="hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;

	public WebElement CSMDateToChangeTheCurrentDate() {
		return CSM_DateToChangeTheCurrentDate;
	}
	
	@FindBy(id="global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;

	public WebElement CSMDateInUserRunningDate() {
		return CSM_DateInUserRunningDate;
	}
	
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;

	public WebElement CSMUseButtonInChangeRunningDate() {
		return CSM_UseButtonInChangeRunningDate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
		return CSM_ClearCacheInTechnicalDetailsIcon;

	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;

	public WebElement CSMOkButtonInInformationPopUpMenu() {
		return CSM_OkButtonInInformationPopUpMenu;
	}
	
	@FindBy(id="_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;

	public WebElement CSMCloseButtonInChangeRunningDate() {
		return CSM_CloseButtonInChangeRunningDate;
	}
	
	@FindBy(id="tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;

	public WebElement CSMTechnicalDetailsIcon() {
		return CSM_TechnicalDetailsIcon;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;

	public WebElement CSMOkButtonUnderInformationPopUp() {
		return CSM_OkButtonUnderInformationPopUp;
	}
	
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}
	
	@FindBy(id="D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}
	
	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
	}
	
//	@FindBy(id="Transactions / Maintenance")
//	private WebElement CSM_TransactionsMaintenanceForLoading;
//
//	public WebElement CSM_TransactionsMaintenanceForLoading() {
//		return CSM_TransactionsMaintenanceForLoading;
//	}
	
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSM_BranchCodeInCreditAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSM_CurrencyCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSM_GLCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialInCreditAc;
	public WebElement CSMSerialInCreditAc() {
		return CSM_SerialInCreditAc;
	}
		@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}
	
	@FindBy(id="lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen() {
		return CSM_CurrencyInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSM_AmountInMaintenanceScreen;
	}
	//Account detail add
	@FindBy(xpath="//label[text()='Account Details ']")
	private WebElement CSM_AccountDetailsInMaintenanceScreen;

	public WebElement CSM_AccountDetailsInMaintenanceScreen() {
		return CSM_AccountDetailsInMaintenanceScreen;
	}
	
	@FindBy(id="add_trxMgntAccountDtlGridTbl_Id_D001MT")
	private WebElement CSM_addbtn_AccountDetails;

	public WebElement CSM_addbtn_AccountDetails() {
		return CSM_addbtn_AccountDetails;
	}
	@FindBy(id="td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_BR")
	private WebElement CSM_addbtn_Branch;

	public WebElement CSM_addbtn_Branch() {
		return CSM_addbtn_Branch;
	}
	@FindBy(id="new_1685338396215_ctstrsACCDETVO.AC_GL")
	private WebElement CSM_addbtn_Gl;

	public WebElement CSM_addbtn_Gl() {
		return CSM_addbtn_Gl;
	}
	@FindBy(id="new_1685338396215_ctstrsACCDETVO.AC_CIF")
	private WebElement CSM_addbtn_Cif;

	public WebElement CSM_addbtn_Cif() {
		return CSM_addbtn_Cif;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement CSM_addbtn_Sl;

	public WebElement CSM_addbtn_Sl() {
		return CSM_addbtn_Sl;
	}
//pop staffcif ok
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.FC_AMOUNT")
	private WebElement CSM_addbtn_Amount;
	public WebElement CSM_addbtn_Amount() {
		return CSM_addbtn_Amount;
	}
	
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS1")
	private WebElement CSM_addbtn_instr1;

	public WebElement CSM_addbtn_instr1() {
		return CSM_addbtn_instr1;
	}
	@FindBy(id="new_1685338823692_ctstrsACCDETVO.INSTRUCTIONS2")
	private WebElement CSM_addbtn_instr2;

	public WebElement CSM_addbtn_instr2() {
		return CSM_addbtn_instr2;
	}
	@FindBy(xpath="//div[@class='ui-dialog-buttonset']//span")
	private WebElement CSM_addbtn_ok;

	public WebElement CSM_addbtn_ok() {
		return CSM_addbtn_ok;
	}
	
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountUnderMaintenanceScreen;

	public WebElement CSMAmountUnderMaintenanceScreen() {
		return CSM_AmountUnderMaintenanceScreen;
	}
	
	@FindBy(xpath = "//td[text()='USD']")
	private WebElement CSM_CurrencyName;

	public WebElement CSMCurrencyName() {
		return CSM_CurrencyName;
	}
	
	@FindBy(id="trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen() {
		return CSM_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo() {
		return CSM_GetTheTransactionNo;
	}
	
	@FindBy(id="D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions() {
		return CSM_ApproveScreenUnderTransactions;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen() {
		return CSM_TransactionNoInApproveScreen;
	}
	
	@FindBy(id="td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo() {
		return CSM_DoubleClickOnTheTransactionNo;
	}		
			
	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen() {
		return CSM_ApproveButtonInApproveScreen;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimQUER']/child::h3")
	private WebElement CSM_QueriesMainMenu;

	public WebElement CSMQueriesMainMenu() {
		return CSM_QueriesMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement CSM_StatementOfAccountsInQueries;

	public WebElement CSMStatementOfAccountsInQueries() {
		return CSM_StatementOfAccountsInQueries;
	}
	
	@FindBy(id="QUER001T")
	private WebElement CSM_ByTradeDateUnderStatementOfAccountsSubMenu;

	public WebElement CSMByTradeDateUnderStatementOfAccountsSubMenu() {
		return CSM_ByTradeDateUnderStatementOfAccountsSubMenu;
	}
	
	@FindBy(id="accCy_QUER001T")
	private WebElement CSM_CurrencyValueIinAccountUnderByTradeDateScreen;

	public WebElement CSMCurrencyValueIinAccountUnderByTradeDateScreen() {
		return CSM_CurrencyValueIinAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accGl_QUER001T")
	private WebElement CSM_GLCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMGLCodeInAccountUnderByTradeDateScreen() {
		return CSM_GLCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accCif_QUER001T")
	private WebElement CSM_CIFCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMCIFCodeInAccountUnderByTradeDateScreen() {
		return CSM_CIFCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="lookuptxt_accSl_QUER001T")
	private WebElement CSM_SerialInAccountUnderByTradeDateScreen;

	public WebElement CSMSerialInAccountUnderByTradeDateScreen() {
		return CSM_SerialInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="dtOpened_QUER001T")
	private WebElement CSM_FromDateInPeriodicityOfStatement;

	public WebElement CSMFromDateInPeriodicityOfStatement() {
		return CSM_FromDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="dtClosed_QUER001T")
	private WebElement CSM_ToDateInPeriodicityOfStatement;

	public WebElement CSMToDateInPeriodicityOfStatement() {
		return CSM_ToDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="sfsdfsdf")
	private WebElement CSM_RetrieveButtonUnderByTradeDateScreen;

	public WebElement CSMRetrieveButtonUnderByTradeDateScreen() {
		return CSM_RetrieveButtonUnderByTradeDateScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}
//	
//	@FindBy(xpath = "//div[text()='[293] No access']")
//	private WebElement CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;
//
//	public WebElement CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied() {
//		return CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;
//	}
	
//	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
//	private WebElement CSM_ValidateIfTheStatementOfAccountIsDisplayed;
//
//	public WebElement CSMValidateIfTheStatementOfAccountIsDisplayed() {
//		return CSM_ValidateIfTheStatementOfAccountIsDisplayed;
//	}

        @FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}
	
	@FindBy(id="infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}
	
	@FindBy(id="trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement CSM_BookedEntriesInMaintenanceScreen;

	public WebElement CSMBookedEntriesInMaintenanceScreen() {
		return CSM_BookedEntriesInMaintenanceScreen;
	}
	

}
