package pageobjects.csmParam;

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
	@FindBy(xpath = "//td[@id='td_transferAccountsDetailTbl_Id_TA001MT_2_rn']")
	private WebElement CSMCore_TransferAccounts_Maintanance_Recordselecting_no3;

	public WebElement CSMCoreTransferAccountsMaintananceRecordselectingno3() {
		return CSMCore_TransferAccounts_Maintanance_Recordselecting_no3;
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
	
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_searchbutton_EnteroriginalGlforRetriveRecord;

	public WebElement CSMCoreTransferAccountssearchbuttonEnteroriginalGlforRetriveRecord() {
		return CSMCore_TransferAccounts_searchbutton_EnteroriginalGlforRetriveRecord;
	}
	
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsApproveEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Approve_EnterGlforRetriveRecord_doubleclick;
	}
	
	
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;

	public WebElement CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick() {
		return CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecord_doubleclick;
	}
	
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.FROM_ACC_GL']")
	private WebElement CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecordunderSearchbutton_doubleclick;

	public WebElement CSMCoreTransferAccountsTransferEnterGlforRetriveRecordunderSearchbuttondoubleclick() {
		return CSMCore_TransferAccounts_Transfer_EnterGlforRetriveRecordunderSearchbutton_doubleclick;
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
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001P_gs_cts_TRSFR_ACCVO.ORIGINAL_GL']")
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
	
	@FindBy(xpath = "//span[text()='close']")
	private WebElement CSMCore_closeSymbol;

	public WebElement CSMCorecloseSymbol() {
		return CSMCore_closeSymbol;
	}
	//TA_026
	@FindBy(xpath = "//input[@id='lookuptxt_original_CIF_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_CIFInput;

	public WebElement CSMCoreTransferAccountsByGLTOGLCIFInput() {
		return CSMCore_TransferAccounts_ByGLTOGL_CIFInput;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_original_gl_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_OriginalGL;

	public WebElement CSMCoreTransferAccountsByGLTOGLOriginalGL() {
		return CSMCore_TransferAccounts_ByGLTOGL_OriginalGL;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_destination_gl_TA001MT']")
	private WebElement CSMCore_TransferAccounts_ByGLTOGL_DestinationGL;

	public WebElement CSMCoreTransferAccountsByGLTOGLDestinationGL() {
		return CSMCore_TransferAccounts_ByGLTOGL_DestinationGL;
	}
	
	//TA_029

	@FindBy(xpath = "//a[@id='infoBarSearchButton_TA001MT']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtn() {
		return CSMCore_TransferAccounts_maintenance_searchbtn;
	}
	
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecord() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord;
	}
	@FindBy(xpath = "//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_statusDesc']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_ActiveStatus;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecordActiveStatus() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_ActiveStatus;
	}
	
	@FindBy(xpath = "//td[@id='td_transferAccountsListGridTbl_Id_TA001MT_1_cts_TRSFR_ACCVO.ORIGINAL_GL']")
	private WebElement CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_doubleClick;

	public WebElement CSMCoreTransferAccountsmaintenancesearchbtnenterrecorddoubleClick() {
		return CSMCore_TransferAccounts_maintenance_searchbtn_enterrecord_doubleClick;
	}
	
	
	
	
	//Transfer account param page object to deal with No access privilage alert flags
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
	  @FindBy(xpath= "//span[text()='No Access Privelege']//parent::td/div")
	  private WebElement NoAccessprivilege_transfer72;
	  public WebElement NoAccessprivilege_transfer72() {
		  return NoAccessprivilege_transfer72;
	  }
	 
	  @FindBy(xpath="(//td[@id='td_tab4_GridTbl_Id_O001UP_1_CUSTOM_FIELD'])[2]")
	  private WebElement TransferBranchCreationUncheck_072;
	  public WebElement TransferBranchCreationUncheck_072() {
		  return TransferBranchCreationUncheck_072;
	  }
	  @FindBy(xpath="//span[text()='1513-Transfer Batch Creation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_1_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement TransferBranchCreationUncheckBOX_072;
	  public WebElement TransferBranchCreationUncheckBOX_072() {
		  return TransferBranchCreationUncheckBOX_072;
	  }
	  @FindBy(xpath="(//td[@id='td_tab4_GridTbl_Id_O001UP_2_CUSTOM_FIELD'])[2]")
	  private WebElement TransactionCancellation_Uncheckbutton072;
	  public WebElement TransactionCancellation_Uncheckbutton072() {
		  return TransactionCancellation_Uncheckbutton072;
	  }
	  @FindBy(xpath="//span[text()='1514-Transfer Cancellation']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_2_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement TransactionCancellation_Uncheckbutton_BOX_072;
	  public WebElement TransactionCancellation_Uncheckbutton__BOX_072() {
		  return TransactionCancellation_Uncheckbutton_BOX_072;
	  }
	  
	  @FindBy(xpath="(//td[@id='td_tab4_GridTbl_Id_O001UP_3_CUSTOM_FIELD'])[2]")
	  private WebElement NoAccessprivelegeUncheckbutton_072;
	  public WebElement NoAccessprivelegeUncheckbutton_072() {
		  return NoAccessprivelegeUncheckbutton_072;
	  }
	  @FindBy(xpath="//span[text()='1515-No Access Privelege']//parent::td//following-sibling::td[@id='td_tab4_GridTbl_Id_O001UP_3_ctscontrolAlertVO.ACTIVATE']/input")
	  private WebElement NoAccessprivelegeUncheckbutton_BOX_072;
	  public WebElement NoAccessprivelegeUncheckbutton_BOX_072() {
		  return NoAccessprivelegeUncheckbutton_BOX_072;
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
	  
	  
	  @FindBy(xpath="//span[text()='Approve']")
      private WebElement Approvefield_Alert;
      public WebElement ApprovefieldAlert() {
          return Approvefield_Alert;
      }
      @FindBy(xpath="//label[text()='Approve ']")
      private WebElement Submit_Approvebutton_Alert;
      public WebElement SubmitApprovebuttonAlert() {
          return Submit_Approvebutton_Alert;
      }
//      @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
//      private WebElement csm_TransactionType_ConfirmOkButton;
//      public WebElement csmTransactionTypeConfirmOkButton()
//      {
//      	return csm_TransactionType_ConfirmOkButton;
//      }
//      @FindBy(id = "_popup_path_sol_ok")
//      private WebElement csm_TransactionType_SuccessOkButton;
//      public WebElement csmTransactionTypeSuccessOkButton()
//      {
//      	return csm_TransactionType_SuccessOkButton;
//      }
	
      @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
      private WebElement csm_TransactionType_ConfirmOkButton;
      public WebElement csmTransactionTypeConfirmOkButton()
      {
      	return csm_TransactionType_ConfirmOkButton;
      }
      @FindBy(id = "_popup_path_sol_ok")
      private WebElement csm_TransactionType_SuccessOkButton;
      public WebElement csmTransactionTypeSuccessOkButton()
      {
      	return csm_TransactionType_SuccessOkButton;
      }
      
      //Approve reject page object on Transfer accounts
      
      @FindBy(xpath = "//label[text()='Reject ']//parent::span//parent::button")
      private WebElement csm_TransactionType_Approvefield_Rejectbutton;
      public WebElement csmTransactionTypeApprovefieldRejectbutton()
      {
      	return csm_TransactionType_Approvefield_Rejectbutton;
      }
      
	

}
