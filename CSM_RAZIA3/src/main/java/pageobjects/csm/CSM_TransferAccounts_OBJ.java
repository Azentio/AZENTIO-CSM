package pageobjects.csm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransferAccounts_OBJ {
WebDriver driver;
	
	public CSM_TransferAccounts_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//td[text()='Transfer Accounts']")
	private WebElement CSMCore_TransferAccounts;

	public WebElement CSMCoreTransferAccounts() {
		return CSMCore_TransferAccounts;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']//parent::a")
	private WebElement CSMCore_TransferAccounts_Maintanance;

	public WebElement CSMCoreTransferAccountsMaintanance() {
		return CSMCore_TransferAccounts_Maintanance;
	}
	@FindBy(xpath = "//select[@name='transferAccountsCO.cts_TRSFR_ACCVO.TRANSFER_TYPE']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TransferType;

	public WebElement CSMCoreTransferAccountsMaintananceTransferType() {
		return CSMCore_TransferAccounts_Maintanance_TransferType;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_statusReasonCode_TA001MT']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Reason;

	public WebElement CSMCoreTransferAccountsMaintananceReason() {
		return CSMCore_TransferAccounts_Maintanance_Reason;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.DESTINATION_BRANCH']")
	private WebElement CSMCore_TransferAccounts_Maintanance_DestinationBranch;

	public WebElement CSMCoreTransferAccountsMaintananceDestinationBranch() {
		return CSMCore_TransferAccounts_Maintanance_DestinationBranch;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_BranchCode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccBranchCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_BranchCode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_Cycode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccCyCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_Cycode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_GLcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccGLCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_GLcode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_CIFcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccCIFCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_CIFcode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_FromAcc_SLcode;

	public WebElement CSMCoreTransferAccountsMaintananceFromAccSLCode() {
		return CSMCore_TransferAccounts_Maintanance_FromAcc_SLcode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_Branchcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccBranchCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_Branchcode;
	}
	
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_CYcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccCYCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_CYcode;
	}
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_GLcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccGLCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_GLcode;
	}
	
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_CIFcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccCIFCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_CIFcode;
	}
	
	
	@FindBy(xpath = "//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_SL']")
	private WebElement CSMCore_TransferAccounts_Maintanance_TOAcc_SLcode;

	public WebElement CSMCoreTransferAccountsMaintananceTOAccSLCode() {
		return CSMCore_TransferAccounts_Maintanance_TOAcc_SLcode;
	}
	
	@FindBy(xpath = "//label[text()='Retrieve ']//parent::span//parent::button")
	private WebElement CSMCore_TransferAccounts_Maintanance_RetriveButton;

	public WebElement CSMCoreTransferAccountsMaintananceRetriveButton() {
		return CSMCore_TransferAccounts_Maintanance_RetriveButton;
	}
	
	
	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_0_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no1;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno1() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no1;
	}
	
	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_1_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no2;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno2() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no2;
	}
	
	@FindBy(xpath = "//label[text()='Save ']//parent::span//parent::button")
	private WebElement CSMCore_TransferAccounts_Maintanance_SaveButton;

	public WebElement CSMCoreTransferAccountsMaintananceSaveButton() {
		return CSMCore_TransferAccounts_Maintanance_SaveButton;
	}
	@FindBy(xpath = "//td[text()='KARTHIK']")
	private WebElement Transaction_maintanance_alertclickingUserId;

	public WebElement Transaction_maintanance_alertclickingUserId() {
		return Transaction_maintanance_alertclickingUserId;
	}

	@FindBy(xpath = "//span[text()=' Send ']//parent::a")
	private WebElement Transaction_maintanance_alertclickingUserId_SendBtn;

	public WebElement Transaction_maintanance_alertclickingUserId_SendBtn() {
		return Transaction_maintanance_alertclickingUserId_SendBtn;
	}
	
	@FindBy(xpath = "//span[text()='Approve']//parent::a")
	private WebElement CSMCore_TransferAccounts_Approve;

	public WebElement CSMCoreTransferAccountsApprove() {
		return CSMCore_TransferAccounts_Approve;
	}
	
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord;

	public WebElement CSMCoreTransferAccountsApproveEnterGlforRetriveRecord() {
		return CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord;
	}
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;
	}
	
	
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001T_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;
	}
	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001P_approve_key']")
	private WebElement CSMCore_TransferAccounts_Approve_ApproveButton;

	public WebElement CSMCoreTransferAccountsApproveApproveButton() {
		return CSMCore_TransferAccounts_Approve_ApproveButton;
	}
	
	@FindBy(xpath = "//span[text()='Transfer']//parent::span//parent::a")
	private WebElement CSMCore_TransferAccounts_Transfer;

	public WebElement CSMCoreTransferAccountsTransfer() {
		return CSMCore_TransferAccounts_Transfer;
	}
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecord;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecord() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecord;
	}
	
	@FindBy(xpath = "//label[@id='transferAccountsMaintFormId_TA001T_Transfer_key']")
	private WebElement CSMCore_TransferAccounts_Transfer_RetriveRecord_TransferButton;

	public WebElement CSMCoreTransferAccountsTransferRetriveRecordTransferButton() {
		return CSMCore_TransferAccounts_Transfer_RetriveRecord_TransferButton;
	}
	
	//transaction
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu_612() {
		return CSM_TransactionsMainMenu;
	}

	@FindBy(id="D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions_612() {
		return CSM_MaintenanceUnderTransactions;
	}

	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen_612() {
		return CSM_TRXTypeInMaintenanceScreen;
	}

	//debit
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeINdebitAc;
	public WebElement CSM_BranchCodeINdebitAc_612() {
		return CSM_BranchCodeINdebitAc;
	}

	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodedebitAc;

	public WebElement CSM_CurrencyCodedebitAc_612() {
		return CSM_CurrencyCodedebitAc;
	}

	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodedebitAc;

	public WebElement CSM_GLCodedebitAc_612() {
		return CSM_GLCodedebitAc;
	}

	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeIndebitAc;

	public WebElement CSM_CIFCodeIndebitAc_612() {
		return CSM_CIFCodeIndebitAc;
	}

	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialIndebitAc;
	public WebElement CSM_SerialIndebitAc_612() {
		return CSM_SerialIndebitAc;
	}
	@FindBy(id="trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen_612() {
		return CSM_SaveButtonInMaintenanceScreen;
	}
	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo_612() {
		return CSM_GetTheTransactionNo;
	}

	@FindBy(id="D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions_612() {
		return CSM_ApproveScreenUnderTransactions;
	}

	@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen_612() {
		return CSM_TransactionNoInApproveScreen;
	}
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

	private WebElement Transactions_transactionNo_Doubleclk;

	public WebElement Transactions_transactionNo_Doubleclk_612() {

	    return Transactions_transactionNo_Doubleclk;

	}

	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo_612() {
		return CSM_DoubleClickOnTheTransactionNo;
	}		
			
	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen_612() {
		return CSM_ApproveButtonInApproveScreen;
	}		

	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation_612() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}		

	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu_612() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}


	@FindBy(xpath="//div[contains(text(),'Saved Successfully')]")

	private WebElement getTransactionNumber;

	public WebElement getTransactionNumber_612()

	{

	   return getTransactionNumber;

	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu_612;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}


	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance_612() {
	return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}

	@FindBy(id="infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen_612() {
	return CSM_SearchButtonInMaintenanceScreen;
	}

	@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox_612() {
	return CSM_EnterTheTransactionNoInSearchBox;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu_612() {
		return CSM_OkButtonInWarningPopUpMenu;
	}
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen_612() {
		return CSM_AmountInMaintenanceScreen;
	}
	@FindBy(id="lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen_612() {
		return CSM_CurrencyInMaintenanceScreen;
	}
	
	@FindBy(xpath="//span[text()='Apply to Void House Cheque']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_612;

	public WebElement CSMApplytoVoidHouseChequemenu612() {
		return CSM_ApplytoVoidHouseChequemenu_612;
	}
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001VCL_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNo_612;
	public WebElement CSMApplytoVoidHouseChequemenuTransactionNo_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNo_612;
	}
	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001VCL_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612;
	public WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_612;
	}
	
	@FindBy(xpath="//select[@id='holdReason_D001VCL']")
	private WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612;
	public WebElement CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612() {
		return CSM_ApplytoVoidHouseChequemenu_TransactionNoDoubleTab_selectReason_612;
	}
	@FindBy(xpath="//span[contains(text(),'Apply to Void House Cheques')]//parent::button")
	private WebElement CSM_ApplytoVoidHouseCheque_Button_612;
	public WebElement CSM_ApplytoVoidHouseCheque_Button_612() {
		return CSM_ApplytoVoidHouseCheque_Button_612;
	}
	@FindBy(xpath="//span[text()='Void House Cheques']")
	private WebElement CSM_trsVoidHouseChequeMenu_612;
	public WebElement CSM_trsVoidHouseChequeMenu_612() {
		return CSM_trsVoidHouseChequeMenu_612;
	}
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001VC_gs_ctstrsVO.TRS_NO']")
	private WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNo_612;
	public WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNo_612() {
		return CSM_TRS_VoidHouseChequeMenu_TransactionNo_612;
	}
	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001VC_1_ctstrsVO.TRS_NO']")
	private WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612;
	public WebElement CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612() {
		return CSM_TRS_VoidHouseChequeMenu_TransactionNoDoubleTab_612;
	}
	
	@FindBy(xpath="//span[contains(text(),'Void')]//parent::button")
	private WebElement CSM_TRS_VoidHouseChequeMenu_VoidBtn_612;
	public WebElement CSM_TRS_VoidHouseChequeMenu_VoidBtn_612() {
		return CSM_TRS_VoidHouseChequeMenu_VoidBtn_612;
	}
	@FindBy(xpath = "//span[text()='close']")

    private WebElement CSMCore_closeSymbol;
 
    public WebElement CSMCorecloseSymbol() {

        return CSMCore_closeSymbol;

    }
  //@ta_60
    
    @FindBy(xpath="//td[text()='Accounts']")
	private WebElement CSM_AccountsMenu_612;
	public WebElement CSMAccountsMenu612() {
		return CSM_AccountsMenu_612;
	}
	
	 @FindBy(xpath="//span[text()='General Accounts']")
		private WebElement CSM_AccountsMenu_GeneralAcc_612;
		public WebElement CSM_AccountsMenuGeneralAcc612() {
			return CSM_AccountsMenu_GeneralAcc_612;
		}
	
	 @FindBy(xpath="//span[text()='Suspend']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_612;
	public WebElement CSM_AccountsMenuGeneralAccSuspend612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_612;
	}
	
	@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.GL_CODE']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinput612;
	}
	
	@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002ZP_gs_amfVO.GL_CODE']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_612;
	}
	@FindBy(xpath="//input[@id='lookuptxt_statusReasonCode_A002ZP']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_StatusReason_612;
	}
	@FindBy(xpath="//textarea[@id='reasonChangeStatus_A002ZP']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_NarrativeReason_612;
	}
	@FindBy(xpath="//label[text()='Suspend ']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612() {
		return CSM_AccountsMenu_GeneralAcc_Suspend_Glinputdoubletab_SuspendButton_612;
	}
	
	@FindBy(xpath="//span[text()='Approve Suspend']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_612;
	}
	@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002SP_gs_amfVO.GL_CODE']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612() {
		return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Glinputbox_612;
	}
//	(//td[text()='8796'])[2]
@FindBy(xpath="//td[@id='td_generalAccountsGridTbl_Id_A002SP_1_amfVO.GL_CODE']")
 private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612;
public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612() {
	return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_612;
}
@FindBy(xpath="//label[text()='Authorize Suspend ']")
private WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612;
public WebElement CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612() {
	return CSM_AccountsMenu_GeneralAcc_ApproveSuspend_Gl_doubletab_AuthorizeSuspendBtn612;
}


			
	
//ta_061
	@FindBy(xpath="//span[text()='Close']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_Close_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Close_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_612;
}
	@FindBy(xpath="//input[@id='generalAccountsGridTbl_Id_A002CL_gs_amfVO.GL_CODE']")
	private WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_Close_Glinput_612() {
		return CSM_AccountsMenu_GeneralAcc_Close_Glinput_612;
}
	//double tab//closebtn
	
	@FindBy(xpath="//span[text()='Authorize Close']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_612;
	public WebElement CSM_AccountsMenu_GeneralAccAuthorizeClose612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_612;
	}	
	@FindBy(xpath="//td[@id='td_generalAccountsGridTbl_Id_A002AC_1_amfVO.CURRENCY_CODE']")
	 private WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612;
	public WebElement CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612() {
		return CSM_AccountsMenu_GeneralAcc_AuthorizeClose_Doulbletab_612;
	}
	
	//after double tab/rea/ authclose btn
	
//@TA_58
	
	@FindBy(xpath="//span[text()='Reverse']")
	 private WebElement CSM_Transaction_ReverseMenu_612;
	public WebElement CSM_Transaction_ReverseMenu_612() {
		return CSM_Transaction_ReverseMenu_612;
	}
	
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001WV_gs_ctstrsVO.TRS_NO']")
	 private WebElement CSM_Transaction_ReverseMenu_TransNo_612;
	public WebElement CSM_Transaction_ReverseMenu_TransNo_612() {
		return CSM_Transaction_ReverseMenu_TransNo_612;
	}
	@FindBy(xpath="//td[text()='Approved']")
	 private WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_612;
	public WebElement CSM_Transaction_ReverseMenu_TransNo_Doubletab_612() {
		return CSM_Transaction_ReverseMenu_TransNo_Doubletab_612;
	}
	
	//reason
	
	
	@FindBy(xpath="//button//span[contains(text(),'To Reverse')]//parent::button")
	 private WebElement CSM_Transaction_ReverseMenu_ToReverseButton_612;
	public WebElement CSM_Transaction_ReverseMenu_ToReverseButton_612() {
		return CSM_Transaction_ReverseMenu_ToReverseButton_612;
	}
	
	@FindBy(xpath="//span[text()='Approve Reverse']")
	 private WebElement CSM_Transaction_ApproveReverseMenu_612;
	public WebElement CSM_Transaction_ApproveReverseMenu_612() {
		return CSM_Transaction_ApproveReverseMenu_612;
	}
		
	
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001RV_gs_ctstrsVO.TRS_NO']")
	 private WebElement CSM_Transaction_ApproveReverseMenu_TransNo_612;
	public WebElement CSM_Transaction_ApproveReverseMenu_TransNo_612() {
		return CSM_Transaction_ApproveReverseMenu_TransNo_612;
	}
	@FindBy(xpath="(//td[text()='To be Reversed'])[1]")
	 private WebElement CSM_Transaction_ApproveReverseMenu_DoubleTab_612;
	public WebElement CSM_Transaction_ApproveReverseMenu_DoubleTab_612() {
		return CSM_Transaction_ApproveReverseMenu_DoubleTab_612;
	}	
	
	@FindBy(xpath="//button//span[contains(text(),'Reverse')]//parent::button")
	 private WebElement CSM_Transaction_ApproveReverseMenu_ReverseButton_612;
	public WebElement CSM_Transaction_ApproveReverseMenu_ReverseButton_612() {
		return CSM_Transaction_ApproveReverseMenu_ReverseButton_612;
	}	
	
}
