package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GLExceptionTransferAccount {

	WebDriver driver;
	public GLExceptionTransferAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Parameters']")
	  private WebElement Parameterbutton;
	  public WebElement Parameterbutton() {
		   return Parameterbutton;
	  }
	  @FindBy(xpath="//td[text()='System Parameters']")
	  private WebElement SystemParametersbutton;
	  public WebElement SystemParametersbutton() {
		   return SystemParametersbutton;
	}
	  @FindBy(xpath="//td[text()='Control Record']")
	  private WebElement ControlRecord_Tranfer72;
	  public WebElement ControlRecord_Tranfer72() {
		  return ControlRecord_Tranfer72;
	  }
	  @FindBy(xpath="//span[text()='Update After Approve']")
	  private WebElement UpdateAfterApprove_Transaferbranch;
	  public WebElement UpdateAfterApprove_Transaferbranch() {
		  return UpdateAfterApprove_Transaferbranch;
	  }
	  @FindBy(xpath="//a[text()=' Alert Activation ']")
	  private WebElement AlertActivation_transferBranch;
	  public WebElement AlertActivation_transferBranch() {
		  return AlertActivation_transferBranch;
	  }
	  @FindBy(xpath="(//div[@class='ui-icon ui-icon-triangle-1-e tree-plus treeclick'])[34]")
	  private WebElement NoAccessprivilege_transfer72;
	  public WebElement NoAccessprivilege_transfer72() {
		  return NoAccessprivilege_transfer72;
	  }
	  @FindBy(xpath="//label[text()='Update After Approve ']")
	  private WebElement UpdateAfterApprove_TransaferSubmit;
	  public WebElement UpdateAfterApprove_TransaferSubmit() {
		  return UpdateAfterApprove_TransaferSubmit;
	  }
	  @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	  private WebElement Confirmokbutton72;
	  public WebElement Confirmokbutton72() {
		  return Confirmokbutton72;
	  }
	  @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	  private WebElement Popupsuccessmsgbutton72;
	  public WebElement Popupsuccessmsgbutton72() {
		  return Popupsuccessmsgbutton72;
	  }
	  @FindBy(xpath="//span[text()='1513-Transfer Batch Creation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_1_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement TransferBranchCreationUncheck_072;
	  public WebElement TransferBranchCreationUncheck_072() {
		  return TransferBranchCreationUncheck_072;
	  }
	  @FindBy(xpath="//span[text()='1514-Transfer Cancellation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_2_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement TransactionCancellation_Uncheckbutton072;
	  public WebElement TransactionCancellation_Uncheckbutton072() {
		  return TransactionCancellation_Uncheckbutton072;
	  }
	  @FindBy(xpath="//span[text()='1515-No Access Privelege']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_3_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement NoAccessprivelegeUncheckbutton_072;
	  public WebElement NoAccessprivelegeUncheckbutton_072() {
		  return NoAccessprivelegeUncheckbutton_072;
	  }
	  @FindBy(xpath="//span[text()='Approve']")
    private WebElement ApprovebuttonAlert;
    public WebElement ApprovebuttonAlert() {
        return ApprovebuttonAlert;
    }
    @FindBy(xpath="//label[text()='Approve ']")
    private WebElement SubmitApproveAlert;
    public WebElement SubmitApproveAlert() {
        return SubmitApproveAlert;
    }
    @FindBy(xpath="//span[text()='1513-Transfer Batch Creation']")
    private WebElement TransferBatchCreationAccount;
    public WebElement TransferBatchCreationAccount() {
  	  return TransferBatchCreationAccount;
    }
    @FindBy(xpath="//span[text()='1514-Transfer Cancellation']")
    private WebElement TransferCancellationCreationAccount;
    public WebElement TransferCancellationCreationAccount() {
  	  return TransferCancellationCreationAccount;
    }
    @FindBy(xpath="//span[text()='1515-No Access Privelege']")
    private WebElement TransferNoAccessCreationAccount;
    public WebElement TransferNoAccessCreationAccount() {
  	  return TransferNoAccessCreationAccount;
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
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselecting() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting;
	}
	
	@FindBy(xpath = "//label[text()='Save ']//parent::span//parent::button")
	private WebElement CSMCore_TransferAccounts_Maintanance_SaveButton;

	public WebElement CSMCoreTransferAccountsMaintananceSaveButton() {
		return CSMCore_TransferAccounts_Maintanance_SaveButton;
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
	
	// -------------------- Need to add Approve field double click xpath in the missing part----------------------
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
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMCore_OK_Button;

	public WebElement CSMCoreOKButton() {
		return CSMCore_OK_Button;
	}
	@FindBy(xpath = "//input[@id='value_date_D001MT']")
	private WebElement csmTransactionsValueDateField;
	public WebElement csmTransactionsValueDateField()
	{
		return csmTransactionsValueDateField;
	}
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement csmTransactionsSaveField;
	public WebElement csmTransactionsSaveField()
	{
		return csmTransactionsSaveField;
	}
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csmTransactionsApproveScreen;
	public WebElement csmTransactionsApproveScreen()
	{
		return csmTransactionsApproveScreen;
	}
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement csmTransactionsApproveScreenTransactionNumber;
	public WebElement csmTransactionsApproveScreenTransactionNumber()
	{
		return csmTransactionsApproveScreenTransactionNumber;
	}
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick;
	public WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick()
	{
		return csmTransactionsApproveScreenTransactionNumberDoubleClick;
	}
	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	private WebElement csmTransactionsApproveScreenApproveButton;
	public WebElement csmTransactionsApproveScreenApproveButton()
	{
		return csmTransactionsApproveScreenApproveButton;
	}
	@FindBy(id = "infoBarSearchButton_D001MT")
	private WebElement csmTransactionsMaintenanceScreenSearchIcon;
	public WebElement csmTransactionsMaintenanceScreenSearchIcon()
	{
		return csmTransactionsMaintenanceScreenSearchIcon;
	}
	@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement csmTransactionsMaintenanceScreenTransactionNumber;
	public WebElement csmTransactionsMaintenanceScreenTransactionNumber()
	{
		return csmTransactionsMaintenanceScreenTransactionNumber;
	}
	@FindBy(id = "td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
	private WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;
	public WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick()
	{
		return csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;
	}
	@FindBy(id = "trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement csmTransactionsMaintenanceScreenBookedEntries;
	public WebElement csmTransactionsMaintenanceScreenBookedEntries()
	{
		return csmTransactionsMaintenanceScreenBookedEntries;
	}
	//TRS_042
	@FindBy(xpath="//label[text()='TRX Type ']/parent::td/following-sibling::td[1]//input")
	private WebElement TransactionsTrxType;
	public WebElement TransactionsTrxType()
	{
		return TransactionsTrxType;
	}
	@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
	private WebElement debitAccountBranchCode;
	public WebElement debitAccountBranchCode()
	{
		return debitAccountBranchCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement debitAccountCurrency;
	public WebElement debitAccountCurrency()
	{
		return debitAccountCurrency;
	}
	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement debitAccountGlCode;
	public WebElement debitAccountGlCode()
	{
		return debitAccountGlCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
	private WebElement debitAccountCifCode;
	public WebElement debitAccountCifCode()
	{
		return debitAccountCifCode;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement debitAccountSerialNo;
	public WebElement debitAccountSerialNo()
	{
		return debitAccountSerialNo;
	}
	@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
	private WebElement randomClickInTransactions;
	public WebElement randomClickInTransactions()
	{
		return randomClickInTransactions;
	}
	@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
	private WebElement creditAccountBranchCode;
	public WebElement creditAccountBranchCode()
	{
	    return creditAccountBranchCode;
	}
	@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
	private WebElement creditAccountCurrency;
	public WebElement creditAccountCurrency()
	{
	    return creditAccountCurrency;
	}
	@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
	private WebElement creditAccountGlCode;
	public WebElement creditAccountGlCode()
	{
	    return creditAccountGlCode;
	}
	@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
	private WebElement creditAccountCifCode;
	public WebElement creditAccountCifCode()
	{
	    return creditAccountCifCode;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
	private WebElement creditAccountSerialNo;
	public WebElement creditAccountSerialNo()
	{
	    return creditAccountSerialNo;
	}
	@FindBy(id="hdr_runn_date")
	private WebElement CSM_DateToChangeTheCurrentDate;
	public WebElement CSMDateToChangeTheCurrentDate()
	{
		return CSM_DateToChangeTheCurrentDate;
	}
	@FindBy(id="global_user_run_date")
	private WebElement CSM_DateInUserRunningDate;
	public WebElement CSMDateInUserRunningDate()
	{
		return CSM_DateInUserRunningDate;
	}
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement CSM_UseButtonInChangeRunningDate;
	public WebElement CSMUseButtonInChangeRunningDate() 
	{
		return CSM_UseButtonInChangeRunningDate;
	}
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement CSM_ClearCacheInTechnicalDetailsIcon;
	public WebElement CSM_ClearCacheInTechnicalDetailsIcon() 
	{
		return CSM_ClearCacheInTechnicalDetailsIcon;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
	public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday()
	{
		return csmOkButtonForConfirmationPopUpForCompanyHoliday;
	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInInformationPopUpMenu;
	public WebElement CSMOkButtonInInformationPopUpMenu() 
	{
		return CSM_OkButtonInInformationPopUpMenu;
	}
	@FindBy(id="_header_rundate_dialog_close")
	private WebElement CSM_CloseButtonInChangeRunningDate;
	public WebElement CSMCloseButtonInChangeRunningDate() 
	{
		return CSM_CloseButtonInChangeRunningDate;
	}
	@FindBy(id="tech_details_icon")
	private WebElement CSM_TechnicalDetailsIcon;
	public WebElement CSMTechnicalDetailsIcon() 
	{
		return CSM_TechnicalDetailsIcon;
	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonUnderInformationPopUp;
	public WebElement CSMOkButtonUnderInformationPopUp() 
	{
		return CSM_OkButtonUnderInformationPopUp;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement CSMOkButtonInAccessDeniedPopUpMenu;
	public WebElement CSMOkButtonInAccessDeniedPopUpMenu()
	{
		return CSMOkButtonInAccessDeniedPopUpMenu;
	}
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csmStopperMessagePopupInTransactions;
	public WebElement csmStopperMessagePopupInTransactions()
	{
		return csmStopperMessagePopupInTransactions;
	}

	//TRS_078
	@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement saveButtonInTransactions;
	public WebElement saveButtonInTransactions()
	{
		return saveButtonInTransactions;
	}
	@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
	private WebElement checkIfValueIsEntered;
	public WebElement checkIfValueIsEntered()
	{
	return checkIfValueIsEntered;
	}
	//CSMOkButtonInInformationPopUpMenu
	@FindBy(xpath = "//span[text()='close']")
	private WebElement closeButtonInAlertPopup;
	public WebElement closeButtonInAlertPopup()
	{
		return closeButtonInAlertPopup;
	}
	@FindBy(id = "D001AU")
	private WebElement approveScreenInTransactions;
	public WebElement approveScreenInTransactions()
	{
		return approveScreenInTransactions;
	}
	@FindBy(xpath = "(//td[text()='Toggle']/following-sibling::td)[3]//span")
	private WebElement refreshButtonInApproveScreen;
	public WebElement refreshButtonInApproveScreen()
	{
		return refreshButtonInApproveScreen;
	}
	@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement transactionNoInApproveScreen;
	public WebElement transactionNoInApproveScreen()
	{
		return transactionNoInApproveScreen;
	}
	@FindBy(id="td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
	private WebElement doubleClickTransactionNo;
	public WebElement doubleClickTransactionNo()
	{
		return doubleClickTransactionNo;
	}
	@FindBy(xpath="//span[contains(text(),' Approve ')]//parent::button")
	private WebElement approveButtonInApproveScreen;
	public WebElement approveButtonInApproveScreen()
	{
		return approveButtonInApproveScreen;
	}
	@FindBy(id="cyPurchaseSaleDet")
	private WebElement randomClick;
	public WebElement randomClick()
	{
		return randomClick;
	}
	@FindBy(xpath = "//a[@id='dismissbut_D001MT']")
	private WebElement dismissAlertPopup;
	public WebElement dismissAlertPopup()
	{
		return dismissAlertPopup;
	}
	@FindBy(xpath = "//div[text()='Transaction No 7685 Approved ']")
	private WebElement successfullyApprovedPopup;
	public WebElement successfullyApprovedPopup()
	{
		return successfullyApprovedPopup;
	}
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement successMessagePopup;
	public WebElement successMessagePopup()
	{
		return successMessagePopup;
	}
	@FindBy(xpath = "//td[text()='USD']")
	private WebElement CSM_CurrencyName;
	public WebElement CSMCurrencyName() 
	{
	    return CSM_CurrencyName;
	}
	//prerequesties
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
	
	@FindBy(id = "transferAccountsMaint_setExceptions_TA001MT")
	private WebElement transferAccounts_SetExceptionButton;

	public WebElement transferAccountsSetExceptionButton() {
		return transferAccounts_SetExceptionButton;
	}

	@FindBy(id = "//td[@id='add_transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement AddtransferAccounts_RetriveButton;

	public WebElement AddtransferAccounts_RetriveButton() {
		return AddtransferAccounts_RetriveButton;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[1]")
	private WebElement transferAccounts_BlankExceptionfactorFirstGridInput;

	public WebElement transferAccountsBlankExceptionfactorFirstGridInput() {
		return transferAccounts_BlankExceptionfactorFirstGridInput;
	}

	@FindBy(xpath = "(//td[@tdlabel='Exception Factor'])[2]")
	private WebElement transferAccounts_BlankExceptionfactorSecondGridInput;

	public WebElement transferAccountsBlankExceptionfactorSecondGridInput() {
		return transferAccounts_BlankExceptionfactorSecondGridInput;
	}

	@FindBy(xpath = "//select[@gridid='transferAccountsCriteriaTbl_Id_TA001MT']")
	private WebElement transferAccounts_ExceptionFactorDropdown;

	public WebElement transferAccountsExceptionFactorDropdown() {
		return transferAccounts_ExceptionFactorDropdown;
	}

	@FindBy(name = "lookupTxt_transferAccountsCriteriaVO.CRITERIA_VALUE")
	private WebElement transferAccounts_CriteriaValueInput;

	public WebElement transferAccountsCriteriaValueInput() {
		return transferAccounts_CriteriaValueInput;
	}

	@FindBy(xpath = "//span[contains(text(),'Ok')]//parent::button")
	private WebElement transferAccounts_ExceptionOkButton;

	public WebElement transferAccountsExceptionOkButton() {
		return transferAccounts_ExceptionOkButton;
	}

	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001WV_1_ctstrsVO.COMP_CODE']")
	   private WebElement Transaction_doubleclick;
	   public WebElement Transaction_doubleclick() {
		   return Transaction_doubleclick;
	   }
@FindBy(xpath="//select[@id='new_1688728527417_transferAccountsCriteriaVO.EXCEPTION_FACTOR']")
private WebElement AccountcurrencyTransfer;
public WebElement AccountcurrencyTransfer() {
	return AccountcurrencyTransfer;
}
}
