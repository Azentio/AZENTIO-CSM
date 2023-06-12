package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcoSectorTransaction {
 
	WebDriver driver;
	public EcoSectorTransaction(WebDriver driver) {
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
	@FindBy(xpath = "//a[@id='E000MA']")
	private WebElement updateAfterApproveInUser;
	public WebElement updateAfterApproveInUser()
	{
		return updateAfterApproveInUser;
	}
	@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
	private WebElement userIdInUpdateAfterApprove;
	public WebElement userIdInUpdateAfterApprove()
	{
		return userIdInUpdateAfterApprove;
	}
	@FindBy(id="td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
	private WebElement doubleClickUserInUpdateAfterApprove;
	public WebElement doubleClickUserInUpdateAfterApprove()
	{
		return doubleClickUserInUpdateAfterApprove;
	}
	@FindBy(xpath="(//input[@name='USER_ID'])[2]")
	private WebElement userIdInApproveScreen;
	public WebElement userIdInApproveScreen()
	{
		return userIdInApproveScreen;
	}
	@FindBy(xpath="//td[@id='td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID']")
	private WebElement doubleClickRecordInApproveScreen;
	public WebElement doubleClickRecordInApproveScreen()
	{
		return doubleClickRecordInApproveScreen;
	}
	@FindBy(xpath="//td[@id='td_tab5_E_GridTbl_Id_E000MA_0_rn']")
	private WebElement selectRowForDeleteInEcoSector;
	public WebElement selectRowForDeleteInEcoSector()
	{
		return selectRowForDeleteInEcoSector;
	}
	@FindBy(xpath="//td[@id='del_tab5_E_GridTbl_Id_E000MA']")
	private WebElement deleteButtonInEcoSector;
	public WebElement deleteButtonInEcoSector()
	{
		return deleteButtonInEcoSector;
	}
	@FindBy(xpath="//span[text()=' Limits ']")
	private WebElement limitsButtonInUpdateAfterApprove;
	public WebElement limitsButtonInUpdateAfterApprove()
	{
		return limitsButtonInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@id='add_tab3_C_GridTbl_Id_E000MA']")
	private WebElement addIconInUpdateAfterApprove;
	public WebElement addIconInUpdateAfterApprove()
	{
		return addIconInUpdateAfterApprove;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")
	private WebElement accountCurrencyInUpdateAfterApprove;
	public WebElement accountCurrencyInUpdateAfterApprove()
	{
		return accountCurrencyInUpdateAfterApprove;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")
	private WebElement transactionBoxInUpdateAfterApprove;
	public WebElement transactionBoxInUpdateAfterApprove()
	{
		return transactionBoxInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
	private WebElement withdrawalLimitInUpdateAfterApprove;
	public WebElement withdrawalLimitInUpdateAfterApprove()
	{
		return withdrawalLimitInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@tdlabel='Deposit Limit']//input")
	private WebElement depositLimitInUpdateAfterApprove;
	public WebElement depositLimitInUpdateAfterApprove()
	{
		return depositLimitInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
	private WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove;
	public WebElement warnUserIfLimitExceedFlagInUpdateAfterApprove()
	{
		return warnUserIfLimitExceedFlagInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")
	private WebElement proceedIfLimitExceedFlagInUpdateAfterApprove;
	public WebElement proceedIfLimitExceedFlagInUpdateAfterApprove()
	{
		return proceedIfLimitExceedFlagInUpdateAfterApprove;
	}
	//confirmOkButton()
	@FindBy(xpath="//span[text()='Ok']")
	private WebElement okButtonInUpdateAfterApprove;
	public WebElement okButtonInUpdateAfterApprove()
	{
		return okButtonInUpdateAfterApprove;
	}
	@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
	private WebElement updateAfterApproveButtonInUpdateAfterApprove;
	public WebElement updateAfterApproveButtonInUpdateAfterApprove()
	{
		return updateAfterApproveButtonInUpdateAfterApprove;
	}
	//confirmOkButton()
	//CSMOkButtonInAccessDeniedPopUpMenu
	@FindBy(xpath="//a[@id='E000P']")
	private WebElement approveScreenInUser;
	public WebElement approveScreenInUser()
	{
		return approveScreenInUser;
	}
	@FindBy(id="tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
	private WebElement userIdInApprove;
	public WebElement userIdInApprove()
	{
		return userIdInApprove;
	}
	@FindBy(id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
	private WebElement doubleClickUserIdInApprove;
	public WebElement doubleClickUserIdInApprove()
	{
		return doubleClickUserIdInApprove;
	}
	@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
	private WebElement approveButtonInUser;
	public WebElement approveButtonInUser()
	{
		return approveButtonInUser;
	}
	//confirmOkButton
	//successOkButton

	//TRS_122
	@FindBy(xpath = "//span[text()=' Eco Sector ']")
	private WebElement ecoSectorInUpdateAfterApprove;
	public WebElement ecoSectorInUpdateAfterApprove()
	{
		return ecoSectorInUpdateAfterApprove;
	}
	@FindBy(id="add_tab5_E_GridTbl_Id_E000MA")
	private WebElement addIconInEcoSectorLimit;
	public WebElement addIconInEcoSectorLimit()
	{
		return addIconInEcoSectorLimit;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement ecoSectorLimit;
	public WebElement ecoSectorLimit()
	{
		return ecoSectorLimit;
	}
	@FindBy(xpath="//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement transactionInEcoSectorLimit;
	public WebElement transactionInEcoSectorLimit()
	{
		return transactionInEcoSectorLimit;
	}
	//withdrawalLimitInUpdateAfterApprove
	//depositLimitInUpdateAfterApprove
	@FindBy(xpath="//td[@tdlabel='Overdraw Limit']//input")
	private WebElement overdrawLimitInUpdateAfterApprove;
	public WebElement overdrawLimitInUpdateAfterApprove()
	{
		return overdrawLimitInUpdateAfterApprove;
	}
	@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input")
	private WebElement localApprovalLimitLimitInUpdateAfterApprove;
	public WebElement localApprovalLimitLimitInUpdateAfterApprove()
	{
		return localApprovalLimitLimitInUpdateAfterApprove;
	}
	//warnUserIfLimitExceedFlagInUpdateAfterApprove
	//proceedIfLimitExceedFlagInUpdateAfterApprove
	@FindBy(xpath="//div[text()='Economic Sector: Limit Amount should be between 0.0  and 300']")
	private WebElement validatePopupInEcoSector;
	public WebElement validatePopupInEcoSector()
	{
		return validatePopupInEcoSector;
	}
	@FindBy(xpath="(//input[@id='_popup_path_sol_ok'])[2]")
	private WebElement warningPopupInEcoSector;
	public WebElement warningPopupInEcoSector()
	{
		return warningPopupInEcoSector;
	}
	@FindBy(xpath="//div[text()='Success']")
	private WebElement successMessagePopupInApproveScreen;
	public WebElement successMessagePopupInApproveScreen()
	{
		return successMessagePopupInApproveScreen;
	} @FindBy(xpath="//td[text()='Transactions']")
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
		@FindBy(id="_popup_path_sol_ok")
		private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

		public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
			return CSM_OkButtonInAccessDeniedPopUpMenu;
		}
		@FindBy(id = "_popup_path_sol_confirm_ok")

	    private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
        public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {

	        return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

	    }
		

}
