package pageobjects;

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
	
	

}
