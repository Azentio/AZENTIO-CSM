package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionObj {
	
	WebDriver driver;

	public TransactionObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Card Number
	@FindBy(xpath = "//input[@id='lookuptxt_CARD_NO_D001MT']")
	private WebElement transactions_Maintenance_CardNo ;
	
	public WebElement transactions_Maintenance_CardNo() {
		return transactions_Maintenance_CardNo;
	}
	
	// Account details button
	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']/ancestor::button/span[2]")
//	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Account_details_key']")
	private WebElement transactions_Maintenance_AccountDetailsButton;
	
	public WebElement transactions_Maintenance_AccountDetailsButton() {
		return transactions_Maintenance_AccountDetailsButton;
	}
	// Booked Entries button
	@FindBy(xpath = "//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']/ancestor::button/span[2]")
	private WebElement transactions_Maintenance_BookedEntriesButton;
	
	public WebElement transactions_Maintenance_BookedEntriesButton() {
		return transactions_Maintenance_BookedEntriesButton;
	}
	
	// Account details GL column row 1
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']")
	private WebElement transactions_Maintenance_DebitAccountGLColumnRow1;
	
	public WebElement transactions_Maintenance_DebitAccountGLColumnRow1() {
		return transactions_Maintenance_DebitAccountGLColumnRow1;
	}
	// Account details GL column row 2
	@FindBy(xpath = "//tr[3]/td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']")
	private WebElement transactions_Maintenance_DebitAccountGLColumnRow2;
	
	public WebElement transactions_Maintenance_DebitAccountGLColumnRow2() {
		return transactions_Maintenance_DebitAccountGLColumnRow2;
	}
	// Account details row 2
	@FindBy(xpath = "//table[@id='trxMgntAccountDtlGridTbl_Id_D001MT']/tbody/tr[3]/td[1]")
	private WebElement transactions_Maintenance_DebitAccountRow2;
	
	public WebElement transactions_Maintenance_DebitAccountRow2() {
		return transactions_Maintenance_DebitAccountRow2;
	}
	// Account details GL
//	@FindBy(xpath = "//tr[@class='jqgfirstrow']/following-sibling::tr/td[14]")
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_GL']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountGL;
	
	public WebElement transactions_Maintenance_DebitAccountGL() {
		return transactions_Maintenance_DebitAccountGL;
	}
	
	// CIF
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.AC_CIF']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountCif;
	
	public WebElement transactions_Maintenance_DebitAccountCif() {
		return transactions_Maintenance_DebitAccountCif;
	}
	
	// SL No
	@FindBy(xpath = "//input[@name='lookupTxt_ctstrsACCDETVO.AC_SL']")
	private WebElement transactions_Maintenance_DebitAccountSlNo;
	
	public WebElement transactions_Maintenance_DebitAccountSlNo() {
		return transactions_Maintenance_DebitAccountSlNo;
	}
	
	// Amount in Trs CY
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.FC_AMOUNT']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountAmountInTrs;
	
	public WebElement transactions_Maintenance_DebitAccountAmountInTrs() {
		return transactions_Maintenance_DebitAccountAmountInTrs;
	}
	
	// Instruction1
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS1']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountInstruction1;
	
	public WebElement transactions_Maintenance_DebitAccountInstruction1() {
		return transactions_Maintenance_DebitAccountInstruction1;
	}
	
	// Instruction2
	@FindBy(xpath = "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_ctstrsACCDETVO.INSTRUCTIONS2']/descendant::input")
	private WebElement transactions_Maintenance_DebitAccountInstruction2;
	
	public WebElement transactions_Maintenance_DebitAccountInstruction2() {
		return transactions_Maintenance_DebitAccountInstruction2;
	}
	
	// AccountDetails ok button
	@FindBy(xpath = "//span[text()='ok']")
	private WebElement transactions_Maintenance_AccountDetailsOkButton;
	
	public WebElement transactions_Maintenance_AccountDetailsOkButton() {
		return transactions_Maintenance_AccountDetailsOkButton;
	}
	
	// Account Details Add button
	@FindBy(xpath = "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
	private WebElement transactions_Maintenance_AccountDetailsAddButton;
	
	public WebElement transactions_Maintenance_AccountDetailsAddButton() {
		return transactions_Maintenance_AccountDetailsAddButton;
	}
	
	// Transaction Approve screen
	@FindBy(xpath = "//a[@id='D001AU']/span[text()='Approve']")
	private WebElement transactions_Approve;

	public WebElement transactions_Approve() {
		return transactions_Approve;
	}
	
	// Transaction Reject screen
	@FindBy(xpath = "//a[@id='D001RJ']/span[text()='Reject']")
	private WebElement transactions_Reject;
	
	public WebElement transactions_Reject() {
		return transactions_Reject;
	}
	
	// search TransactionNo in approve screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement transactions_Approve_TransactionNo;
	
	public WebElement transactions_Approve_TransactionNo() {
		return transactions_Approve_TransactionNo;
	}
	
	// search TransactionNo in Maintenance screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement transactions_Maintenance_TransactionNo;
	
	public WebElement transactions_Maintenance_TransactionNo() {
		return transactions_Maintenance_TransactionNo;
	}
	
	// search active status in approve Screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_statusDesc']")
	private WebElement transactions_Approve_StatusSearch;
	
	public WebElement transactions_Approve_StatusSearch() {
		return transactions_Approve_StatusSearch;
	}
	
	// search active status in maintenance Screen
	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_statusDesc']")
	private WebElement transactions_Maintenance_StatusSearch;
	
	public WebElement transactions_Maintenance_StatusSearch() {
		return transactions_Maintenance_StatusSearch;
	}
	
	// TransactionNo first active record in approve screen
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_Approve_TransactionNoFirstActiveRecord;
	
	public WebElement transactions_Approve_TransactionNoFirstActiveRecord() {
		return transactions_Approve_TransactionNoFirstActiveRecord;
	}
	
	// TransactionNo first active record in Maintenance screen
	@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement transactions_Maintenance_TransactionNoFirstActiveRecord;
	
	public WebElement transactions_Maintenance_TransactionNoFirstActiveRecord() {
		return transactions_Maintenance_TransactionNoFirstActiveRecord;
	}
	
	// Approve button in transaction
//	@FindBy(xpath = "//span[contains(text(),' Approve ')]")
	@FindBy(xpath = "//div[@id='trxMgmtToolBar_D001AU']/descendant::button[1]")
	private WebElement transactions_Approve_ApproveButton;
	
	public WebElement transactions_Approve_ApproveButton() {
		return transactions_Approve_ApproveButton;
	}
	
	// Search in maintenance
	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transactions_Maintenance_SearchButton;
	
	public WebElement transactions_Maintenance_SearchButton() {
		return transactions_Maintenance_SearchButton;
	}
	
	// warning message HEAder
	@FindBy(xpath = "//div[text()='WARNING']")
	private WebElement transactions_Maintenance_WarningMessageHeader;
	
	public WebElement transactions_Maintenance_WarningMessageHeader() {
		return transactions_Maintenance_WarningMessageHeader;
	}
	// warning message ok button
//	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	@FindBy(xpath = "//div[text()='WARNING']/../following-sibling::center/input")
	private WebElement transactions_Maintenance_WarningMessageOkButton;
	
	public WebElement transactions_Maintenance_WarningMessageOkButton() {
		return transactions_Maintenance_WarningMessageOkButton;
	}
	// warning message
	@FindBy(xpath = "//div[text()='WARNING']/../following-sibling::div/div")
//	@FindBy(xpath = "(//div[@class='jMsgbox-contentWrap'])[1]")
	private WebElement transactions_Maintenance_WarningMessage;
	
	public WebElement transactions_Maintenance_WarningMessage() {
		return transactions_Maintenance_WarningMessage;
	}
	
	// Success message
//	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	@FindBy(xpath = "//div[text()='Success']/../following-sibling::div/div")
//	@FindBy(xpath = "(//div[@class='jMsgbox-contentWrap'])[1]")
	private WebElement transactions_Maintenance_SuccessMessage;
	
	public WebElement transactions_Maintenance_SuccessMessage() {
		return transactions_Maintenance_SuccessMessage;
	}
	
	// Success message in approve screen
	@FindBy(xpath = "//div[text()='Success']/../following-sibling::div/div")
	private WebElement transactions_Approve_SuccessMessage;
	
	public WebElement transactions_Approve_SuccessMessage() {
		return transactions_Approve_SuccessMessage;
	}
	
	// Success message ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement transactions_Maintenance_SuccessMessageOkButton;
	
	public WebElement transactions_Maintenance_SuccessMessageOkButton() {
		return transactions_Maintenance_SuccessMessageOkButton;
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	
	// Alert Grid User_ID input
	@FindBy(xpath = "//input[@id='alertsGrid_Id_D001MT_gs_alertsParamCO.userId']")
	private WebElement transactions_Teller_AlertGrid_UserID;
	
	public WebElement transactions_Teller_AlertGrid_UserID() {
		return transactions_Teller_AlertGrid_UserID;
	}
	
	// Alert Grid User_ID First row
	@FindBy(xpath = "//td[@id='td_alertsGrid_Id_D001MT_1_alertsParamCO.userId']")
	private WebElement transactions_Teller_AlertGrid_FirstRowUserID;
	
	public WebElement transactions_Teller_AlertGrid_FirstRowUserID() {
		return transactions_Teller_AlertGrid_FirstRowUserID;
	}
	
	// AlertBoxInBM_TrxNo
	@FindBy(xpath = "//input[@id='trsAckTOutAlertGrid_Id_RCVALERT_gs_sTodoDet.TODO_PARAM']")
	private WebElement transactions_AlertBoxInBM_TrxNo;
	
	public WebElement transactions_AlertBoxInBM_TrxNo() {
		return transactions_AlertBoxInBM_TrxNo;
	}
	
	// FirstTrxNoCheckbox
	@FindBy(xpath = "//input[@id='jqg_trsAckTOutAlertGrid_Id_RCVALERT_1.TODO_PARAM']")
	private WebElement transactions_AlertBoxInBM_FirstTrxNoCheckbox;
	
	public WebElement transactions_AlertBoxInBM_FirstTrxNoCheckbox() {
		return transactions_AlertBoxInBM_FirstTrxNoCheckbox;
	}
	
	// Local SendAlert Approve button
	@FindBy(xpath = "//a[@id='approveBut_D001MT']")
	private WebElement transactions_SendAlertBoxLocal_ApproveButton;
	
	public WebElement transactions_SendAlertBoxLocal_ApproveButton() {
		return transactions_SendAlertBoxLocal_ApproveButton;
	}
	
	// User information user input field
	@FindBy(xpath = "//input[@id='usr_name_alert_D001MT']")
	private WebElement transactions_UserInformation_UserInputField;
	
	public WebElement transactions_UserInformation_UserInputField() {
		return transactions_UserInformation_UserInputField;
	}
	
	// User information Password input field
	@FindBy(xpath = "//input[@id='pwd_alert_D001MT']")
	private WebElement transactions_UserInformation_PwdInputField;
	
	public WebElement transactions_UserInformation_PwdInputField() {
		return transactions_UserInformation_PwdInputField;
	}
	
	// User information Submit button
	@FindBy(xpath = "//button[@id='sendButtonForApprove_D001MT']")
	private WebElement transactions_UserInformation_SubmitButton;
	
	public WebElement transactions_UserInformation_SubmitButton() {
		return transactions_UserInformation_SubmitButton;
	}
	
	// Local Alert Approve button
	@FindBy(xpath = "//button[@id='alertsOpenItemApprove_D001MT']")
	private WebElement transactions_ApproveItemAlertBox_ApproveButton;
	
	public WebElement transactions_ApproveItemAlertBox_ApproveButton() {
		return transactions_ApproveItemAlertBox_ApproveButton;
	}
	
	// Local Alert Reject button
	@FindBy(xpath = "//button[@id='alertsOpenItemReject_D001MT']")
	private WebElement transactions_ApproveItemAlertBox_RejectButton;
	
	public WebElement transactions_ApproveItemAlertBox_RejectButton() {
		return transactions_ApproveItemAlertBox_RejectButton;
	}
	
	// Local Alert Modify button
	@FindBy(xpath = "//a[@id='trxMgntAlertModifyButton_RCVALERT']")
	private WebElement transactions_ApproveItemAlertBox_ModifyButton;
	
	public WebElement transactions_ApproveItemAlertBox_ModifyButton() {
		return transactions_ApproveItemAlertBox_ModifyButton;
	}
	
	// Alert Reject Reason dropdown
	@FindBy(xpath = "//select[@id='rejectReason_D001AU_ALERT']")
	private WebElement transactions_ApproveItemAlertBox_RejectReason;
	
	public WebElement transactions_ApproveItemAlertBox_RejectReason() {
		return transactions_ApproveItemAlertBox_RejectReason;
	}
	
	// Alert Modify Reason textarea
	@FindBy(xpath = "//textarea[@id='trxMgntStsReason_D001AU_ALERT']")
	private WebElement transactions_ApproveItemAlertBox_ModifyReason;
	
	public WebElement transactions_ApproveItemAlertBox_ModifyReason() {
		return transactions_ApproveItemAlertBox_ModifyReason;
	}
	
	// Local alert approve Record current status
	@FindBy(xpath = "//input[@id='current_status_D001MT']")
	private WebElement transactions_LocalAlertApprove_CurrentStatus;
	
	public WebElement transactions_LocalAlertApprove_CurrentStatus() {
		return transactions_LocalAlertApprove_CurrentStatus;
	}
	
	// Reject Confirmation ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement transactions_ApproveItemAlertBox_ConfirmOkButton;
	
	public WebElement transactions_ApproveItemAlertBox_ConfirmOkButton() {
		return transactions_ApproveItemAlertBox_ConfirmOkButton;
	}
	
	// Charges details cash deduct
	@FindBy(xpath = "//select[@id='cash_deduct_ind_D001MT']")
	private WebElement transactions_TrxManagement_ChargesDeductDropdown;
	
	public WebElement transactions_TrxManagement_ChargesDeductDropdown() {
		return transactions_TrxManagement_ChargesDeductDropdown;
	}
	
	// Charges button
	@FindBy(xpath = "//button[@id='btnCharges_D001MT']")
	private WebElement transactions_TrxManagement_ChargesButton;
	
	public WebElement transactions_TrxManagement_ChargesButton() {
		return transactions_TrxManagement_ChargesButton;
	}
	
	// Waive Charges button
	@FindBy(xpath = "//button[@id='btnWaiveCharges_D001MT']")
	private WebElement transactions_TrxManagement_WaiveChargesButton;
	
	public WebElement transactions_TrxManagement_WaiveChargesButton() {
		return transactions_TrxManagement_WaiveChargesButton;
	}
	
	// new amount under Charges button
	@FindBy(xpath = "//input[@id='new_amount_input_D001MT']")
	private WebElement transactions_TrxManagement_NewAmount;
	
	public WebElement transactions_TrxManagement_NewAmount() {
		return transactions_TrxManagement_NewAmount;
	}
	
	// apply to select amount under Charges button
	@FindBy(xpath = "//button[@id='appToSelAmnt_D001MT']")
	private WebElement transactions_TrxManagement_ApplyToSelectAmount;
	
	public WebElement transactions_TrxManagement_ApplyToSelectAmount() {
		return transactions_TrxManagement_ApplyToSelectAmount;
	}
	
}