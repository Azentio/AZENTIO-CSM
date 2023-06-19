package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj {
	
	WebDriver driver;

	public ChequeBookRequestObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// ChequeBook Request Menu
	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement chequeBookRequest_MenuOption;

	public WebElement chequeBookRequest_MenuOption() {
		return chequeBookRequest_MenuOption;
	}
	
	// Transactions Menu
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement transactions_MenuOption;
	
	public WebElement transactions_MenuOption() {
		return transactions_MenuOption;
	}
	
	// chequeBookRequest_HeaderRunningDate
	@FindBy(xpath = "//span[@id='hdr_runn_date']")
	private WebElement chequeBookRequest_HeaderRunningDate;
	
	public WebElement chequeBookRequest_HeaderRunningDate() {
		return chequeBookRequest_HeaderRunningDate;
	}
	
	// User Running Date input calendar
	@FindBy(xpath = "//input[@name='newUserRunDate']")
	private WebElement chequeBookRequest_UserRunningDateInputField;
	
	public WebElement chequeBookRequest_UserRunningDateInputField() {
		return chequeBookRequest_UserRunningDateInputField;
	}
	
	//calendar close 
	@FindBy(xpath = "//button[@id='_header_rundate_dialog_close']/span")
	private WebElement chequeBookRequest_CalendarCloseButton;
	
	public WebElement chequeBookRequest_CalendarCloseButton() {
		return chequeBookRequest_CalendarCloseButton;
	}
	
	// User Running Date calendar img
	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::img")
	private WebElement chequeBookRequest_UserRunningDateCalendarImg;
	
	public WebElement chequeBookRequest_UserRunningDateCalendarImg() {
		return chequeBookRequest_UserRunningDateCalendarImg;
	}
	
	// User Running Date calendar use button
	@FindBy(xpath = "//label[text()='User Running Date ']/ancestor::tr/descendant::span")
	private WebElement chequeBookRequest_UserRunningDateCalendarUseButton;
	
	public WebElement chequeBookRequest_UserRunningDateCalendarUseButton() {
		return chequeBookRequest_UserRunningDateCalendarUseButton;
	}
	
	// calender popup after select
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_CalendarSuccessfullyPopup;
	
	public WebElement chequeBookRequest_CalendarSuccessfullyPopup() {
		return chequeBookRequest_CalendarSuccessfullyPopup;
	}
	
	// calender holiday popup
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement chequeBookRequest_CalendarHolidayConfirmPopup;
	
	public WebElement chequeBookRequest_CalendarHolidayConfirmPopup() {
		return chequeBookRequest_CalendarHolidayConfirmPopup;
	}
	
	// warning popup after save
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookRequest_WarningPopup;
	
	public WebElement chequeBookRequest_WarningPopup() {
		return chequeBookRequest_WarningPopup;
	}
	
	// change running date dialog box close button
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement chequeBookRequest_ChangeRunningDateCloseButton;
	
	public WebElement chequeBookRequest_ChangeRunningDateCloseButton() {
		return chequeBookRequest_ChangeRunningDateCloseButton;
	}
	
//	// Suspend
//	@FindBy(xpath = "//span[text()='Suspend']")
//	private WebElement chequeBookRequest_Suspend;
//
//	public WebElement chequeBookRequest_Suspend() {
//		return chequeBookRequest_Suspend;
//	}
	//--------------------------------SubMenu's----------------------------------//
	// Reactivate
	@FindBy(xpath = "//span[text()='Reactivate']")
	private WebElement chequeBookRequest_Reactivate;
	
	public WebElement chequeBookRequest_Reactivate() {
		return chequeBookRequest_Reactivate;
	}
	
	// To Reactivate
	@FindBy(xpath = "//span[text()='To Reactivate']")
	private WebElement chequeBookRequest_ToReactivate;
	
	public WebElement chequeBookRequest_ToReactivate() {
		return chequeBookRequest_ToReactivate;
	}
	
	// Maintenance
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement chequeBookRequest_Maintenance;
	
	public WebElement chequeBookRequest_Maintenance() {
		return chequeBookRequest_Maintenance;
	}
	
	// Transaction Maintenance
	@FindBy(xpath = "//a[@id='D001MT']/span[text()='Maintenance']")
	private WebElement transactions_Maintenance;
	
	public WebElement transactions_Maintenance() {
		return transactions_Maintenance;
	}
	
	// To Be Reversed Chequebook
	@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']")
	private WebElement chequeBookRequest_ToBeReversedChequebook;
	
	public WebElement chequeBookRequest_ToBeReversedChequebook() {
		return chequeBookRequest_ToBeReversedChequebook;
	}
	
	// Reverse Chequebook
	@FindBy(xpath = "//span[text()='Reverse Chequebook']")
	private WebElement chequeBookRequest_ReverseChequebook;
	
	public WebElement chequeBookRequest_ReverseChequebook() {
		return chequeBookRequest_ReverseChequebook;
	}
	
	// Approve
	@FindBy(xpath = "//span[text()='Apply to Submit']")
	private WebElement chequeBookRequest_ApplyToSubmit;
	
	public WebElement chequeBookRequest_ApplyToSubmit() {
		return chequeBookRequest_ApplyToSubmit;
	}
	
	// Submit
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement chequeBookRequest_Submit;
	
	public WebElement chequeBookRequest_Submit() {
		return chequeBookRequest_Submit;
	}
	
	// Apply to submit
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement chequeBookRequest_Approve;
	
	public WebElement chequeBookRequest_Approve() {
		return chequeBookRequest_Approve;
	}
	
	// To Cancel
	@FindBy(xpath = "//span[text()='To Cancel']")
	private WebElement chequeBookRequest_ToCancel;
	
	public WebElement chequeBookRequest_ToCancel() {
		return chequeBookRequest_ToCancel;
	}
	
	// Approve Cancel
	@FindBy(xpath = "//span[text()='Approve Cancel']")
	private WebElement chequeBookRequest_ApproveCancel;
	
	public WebElement chequeBookRequest_ApproveCancel() {
		return chequeBookRequest_ApproveCancel;
	}
	
	// To be destroyed
	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement chequeBookRequest_ToBeDestroyed;
	
	public WebElement chequeBookRequest_ToBeDestroyed() {
		return chequeBookRequest_ToBeDestroyed;
	}
	
	// Approve Destroyed
	@FindBy(xpath = "//span[text()='Approve Destroyed']")
	private WebElement chequeBookRequest_ApproveDestroyed;
	
	public WebElement chequeBookRequest_ApproveDestroyed() {
		return chequeBookRequest_ApproveDestroyed;
	}
	
	// To Suspend
	@FindBy(xpath = "//span[text()='To Suspend']")
	private WebElement chequeBookRequest_ToSuspend;
	
	public WebElement chequeBookRequest_ToSuspend() {
		return chequeBookRequest_ToSuspend;
	}
	
	// Suspend
	@FindBy(xpath = "//span[text()='Suspend']")
	private WebElement chequeBookRequest_Suspend;
	
	public WebElement chequeBookRequest_Suspend() {
		return chequeBookRequest_Suspend;
	}
	
	// Send To Branch
	@FindBy(xpath = "//span[text()='Send To Branch']")
	private WebElement chequeBookRequest_SendToBranch;
	
	public WebElement chequeBookRequest_SendToBranch() {
		return chequeBookRequest_SendToBranch;
	}
	
	// In Branch
	@FindBy(xpath = "//span[text()='In Branch']")
	private WebElement chequeBookRequest_InBranch;
	
	public WebElement chequeBookRequest_InBranch() {
		return chequeBookRequest_InBranch;
	}
	
	// Approve / Reject Bulk Destroy
	@FindBy(xpath = "//span[text()='Approve / Reject Bulk Destroy']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy() {
		return chequeBookRequest_ApproveRejectBulkDestroy;
	}
	
	// Bulk Destroy
	@FindBy(xpath = "//span[text()='Bulk Destroy']")
	private WebElement chequeBookRequest_BulkDestroy;
	
	public WebElement chequeBookRequest_BulkDestroy() {
		return chequeBookRequest_BulkDestroy;
	}
	
	// Destination Branch
	@FindBy(xpath = "//input[@id='lookuptxt_destinationBranch_Q000TB']")
	private WebElement chequeBookRequest_DestinationBranch;
	
	public WebElement chequeBookRequest_DestinationBranch() {
		return chequeBookRequest_DestinationBranch;
	}
	
	// Printing Location
	@FindBy(xpath = "//select[@id='printingLocation_Q000MT']")
	private WebElement chequeBookRequest_PrintingLocation;
	
	public WebElement chequeBookRequest_PrintingLocation() {
		return chequeBookRequest_PrintingLocation;
	}
	
	// In house select
	@FindBy(xpath = "//option[text()='In house']")
	private WebElement chequeBookRequest_InHouse;
	
	public WebElement chequeBookRequest_InHouse() {
		return chequeBookRequest_InHouse;
	}
	
	// ViewMemo CloseButton
	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_ViewMemoCloseButton;
	
	public WebElement chequeBookRequest_ViewMemoCloseButton() {
		return chequeBookRequest_ViewMemoCloseButton;
	}

	//--------------------------------Inside SubMenu's----------------------------------//
	// Code input field
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequeBookRequest_SubMenu_Code;
	
	public WebElement chequeBookRequest_SubMenu_Code() {
		return chequeBookRequest_SubMenu_Code;
	}
	
	// Status Desc input field
	@FindBy(xpath = "//input[@name='statusDesc']")
	private WebElement chequeBookRequest_SubMenu_StatusDesc;
	
	public WebElement chequeBookRequest_SubMenu_StatusDesc() {
		return chequeBookRequest_SubMenu_StatusDesc;
	}
	
	// Search button
	@FindBy(xpath = "//a[text()=' Search ']")
	private WebElement chequeBookRequest_SubMenu_SearchButton;
	
	public WebElement chequeBookRequest_SubMenu_SearchButton() {
		return chequeBookRequest_SubMenu_SearchButton;
	}
	
	// Status button
	@FindBy(xpath = "//input[@id='status_Q000MT']")
	private WebElement chequeBookRequest_SubMenu_RecordStatus;
	
	public WebElement chequeBookRequest_SubMenu_RecordStatus() {
		return chequeBookRequest_SubMenu_RecordStatus;
	}
	
//	// Suspend Button
//	@FindBy(xpath = "//label[text()='Suspend ']")
//	private WebElement chequeBookRequest_Suspend_SuspendButton;
//	
//	public WebElement chequeBookRequest_Suspend_SuspendButton() {
//		return chequeBookRequest_Suspend_SuspendButton;
//	}
	
	// Reactivate Button
	@FindBy(xpath = "//label[text()='Reactivate ']")
	private WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton;
	
	public WebElement chequeBookRequest_Reactivate_ReactivateSubmitButton() {
		return chequeBookRequest_Reactivate_ReactivateSubmitButton;
	}
	
	// To Reactivate Button
	@FindBy(xpath = "//label[text()='To Reactivate ']")
	private WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton;
	
	public WebElement chequeBookRequest_ToReactivate_ToReactivateSubmitButton() {
		return chequeBookRequest_ToReactivate_ToReactivateSubmitButton;
	}
	
	// To Be Reversed Button
	@FindBy(xpath = "//label[text()='To Be Reversed ']")
	private WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;
	
	public WebElement chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton() {
		return chequeBookRequest_ToBeReversed_ToBeReversedSubmitButton;
	}
	
	// To Be Reversed screen Status
	@FindBy(xpath = "//input[@id='status_Q000AR']")
	private WebElement chequeBookRequest_ToBeReversed_Status;
	
	public WebElement chequeBookRequest_ToBeReversed_Status() {
		return chequeBookRequest_ToBeReversed_Status;
	}
	
	// Approve Button
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement chequeBookRequest_Approve_ApproveButton;
	
	public WebElement chequeBookRequest_Approve_ApproveButton() {
		return chequeBookRequest_Approve_ApproveButton;
	}
	
	// Reverse Button
	@FindBy(xpath = "//label[text()='Reverse ']")
	private WebElement chequeBookRequest_Reverse_ReverseSubmitButton;
	
	public WebElement chequeBookRequest_Reverse_ReverseSubmitButton() {
		return chequeBookRequest_Reverse_ReverseSubmitButton;
	}
	
	// Apply Submit Button
	@FindBy(xpath = "//label[text()='Apply Submit ']")
	private WebElement chequeBookRequest_AppltToSubmit_ApplySubmitButton;
	
	public WebElement chequeBookRequest_AppltToSubmit_ApplySubmitButton() {
		return chequeBookRequest_AppltToSubmit_ApplySubmitButton;
	}
	
	// Submit Button
	@FindBy(xpath = "//label[text()='Submit ']")
	private WebElement chequeBookRequest_Submit_SubmitButton;
	
	public WebElement chequeBookRequest_Submit_SubmitButton() {
		return chequeBookRequest_Submit_SubmitButton;
	}
	
	// To Cancel Button
	@FindBy(xpath = "//label[text()='To Cancel ']")
	private WebElement chequeBookRequest_ToCancel_ToCancelButton;
	
	public WebElement chequeBookRequest_ToCancel_ToCancelButton() {
		return chequeBookRequest_ToCancel_ToCancelButton;
	}
	
	// Approve Cancel Button
	@FindBy(xpath = "//label[text()='Cancel ']")
	private WebElement chequeBookRequest_ApproveCancel_CancelButton;
	
	public WebElement chequeBookRequest_ApproveCancel_CancelButton() {
		return chequeBookRequest_ApproveCancel_CancelButton;
	}
	
	// To Destroyed Button
	@FindBy(xpath = "//label[text()='To Destroy ']")
	private WebElement chequeBookRequest_ToBeDestroyed_ToDestroyButton;
	
	public WebElement chequeBookRequest_ToBeDestroyed_ToDestroyButton() {
		return chequeBookRequest_ToBeDestroyed_ToDestroyButton;
	}
	
	// Approve Destroyed Button
	@FindBy(xpath = "//label[text()='Destroy ']")
	private WebElement chequeBookRequest_ApproveDestroyed_DestroyButton;
	
	public WebElement chequeBookRequest_ApproveDestroyed_DestroyButton() {
		return chequeBookRequest_ApproveDestroyed_DestroyButton;
	}
	
	// To Suspend Button
	@FindBy(xpath = "//label[text()='To Suspend ']")
	private WebElement chequeBookRequest_ToSuspend_ToSuspendButton;
	
	public WebElement chequeBookRequest_ToSuspend_ToSuspendButton() {
		return chequeBookRequest_ToSuspend_ToSuspendButton;
	}
	
	// Suspend Button
	@FindBy(xpath = "//label[text()='Suspend ']")
	private WebElement chequeBookRequest_Suspend_SuspendButton;
	
	public WebElement chequeBookRequest_Suspend_SuspendButton() {
		return chequeBookRequest_Suspend_SuspendButton;
	}
	
	// remove tab Button
	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement chequeBookRequest_SubMenu_RemoveTab;
	
	public WebElement chequeBookRequest_SubMenu_RemoveTab() {
		return chequeBookRequest_SubMenu_RemoveTab;
	}
	
	// Alert Close Button
	@FindBy(xpath = "//span[text()='close']")
	private WebElement chequeBookRequest_SubMenu_AlertClose;
	
	public WebElement chequeBookRequest_SubMenu_AlertClose() {
		return chequeBookRequest_SubMenu_AlertClose;
	}
	
	//---------------------------Maintenance-------------------------//
	
	// NumberOfChequebook
	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_NumberOfChequebook;
	
	public WebElement chequeBookRequest_Maintenance_NumberOfChequebook() {
		return chequeBookRequest_Maintenance_NumberOfChequebook;
	}
	
	// CHEQUE_CODE input
	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_ChequeCODE;
	
	public WebElement chequeBookRequest_Maintenance_ChequeCODE() {
		return chequeBookRequest_Maintenance_ChequeCODE;
	}
	
	// Account Number Lookup
	@FindBy(xpath = "//span[@id='spanLookup_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_AccountNumberLookup;
	
	public WebElement chequeBookRequest_Maintenance_AccountNumberLookup() {
		return chequeBookRequest_Maintenance_AccountNumberLookup;
	}
	
	// BranchCode Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.BRANCH_CODE']")
//	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_BranchCODE;
	
	public WebElement chequeBookRequest_Maintenance_BranchCODE() {
		return chequeBookRequest_Maintenance_BranchCODE;
	}
	
	// Currency Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CURRENCY_CODE']")
//	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_Currency;
	
	public WebElement chequeBookRequest_Maintenance_Currency() {
		return chequeBookRequest_Maintenance_Currency;
	}
	
	// GL Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.GL_CODE']")
//	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_GL;
	
	public WebElement chequeBookRequest_Maintenance_GL() {
		return chequeBookRequest_Maintenance_GL;
	}
	
	// Cif No Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.CIF_SUB_NO']")
//	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_CifNo;
	
	public WebElement chequeBookRequest_Maintenance_CifNo() {
		return chequeBookRequest_Maintenance_CifNo;
	}
	
	// Sl No Input
	@FindBy(xpath = "//input[@id='gridtab_acc_sl_Q000MT_gs_amfVO.SL_NO']")
//	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_Maintenance_SerialNo;
	
	public WebElement chequeBookRequest_Maintenance_SerialNo() {
		return chequeBookRequest_Maintenance_SerialNo;
	}
	
	// BranchCODE Record
	@FindBy(xpath = "//td[@id='td_gridtab_acc_sl_Q000MT_1_amfVO.BRANCH_CODE']")
	private WebElement chequeBookRequest_Maintenance_BranchCodeRecord;
	
	public WebElement chequeBookRequest_Maintenance_BranchCodeRecord() {
		return chequeBookRequest_Maintenance_BranchCodeRecord;
	}
	
	// Save Button
	@FindBy(xpath = "//label[@id='chequeBookDefFormId_Q000MT_btn_save']")
	private WebElement chequeBookRequest_Maintenance_SaveButton;
	
	public WebElement chequeBookRequest_Maintenance_SaveButton() {
		return chequeBookRequest_Maintenance_SaveButton;
	}
	
	// Delete Button
	@FindBy(xpath = "//label[text()='Delete ']")
	private WebElement chequeBookRequest_Maintenance_DeleteButton;
	
	public WebElement chequeBookRequest_Maintenance_DeleteButton() {
		return chequeBookRequest_Maintenance_DeleteButton;
	}
	
	// Saved Record
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement chequeBookRequest_Maintenance_SavedRecord;
	
	public WebElement chequeBookRequest_Maintenance_SavedRecord() {
		return chequeBookRequest_Maintenance_SavedRecord;
	}
	
	// Status Table
	@FindBy(xpath = "//a[@id='anchor_1955379083']/span[2]")
	private WebElement chequeBookRequest_Maintenance_StatusTable;
	
	public WebElement chequeBookRequest_Maintenance_StatusTable() {
		return chequeBookRequest_Maintenance_StatusTable;
	}
	
	// retrieve button in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BAD_retrieve_key']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey() {
		return chequeBookRequest_ApproveRejectBulkDestroy_RetrieveKey;
	}
	
	// First Record Row
	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BAD']/tbody/tr[@id='1']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow() {
		return chequeBookRequest_ApproveRejectBulkDestroy_FirstRecordRow;
	}
	
	// select all rows approve reject bulk destroy screen
	@FindBy(xpath = "//input[@id='cb_chequeBookBulkDestroyGridTbl_Id_Q000BAD']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows() {
		return chequeBookRequest_ApproveRejectBulkDestroy_SelectAllRows;
	}
	
	// Record 1 checkbox in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BAD_1']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox() {
		return chequeBookRequest_ApproveRejectBulkDestroy_FirstCheckbox;
	}
	
	// Record 2 checkbox in approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='jqg_chequeBookBulkDestroyGridTbl_Id_Q000BAD_2']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox() {
		return chequeBookRequest_ApproveRejectBulkDestroy_SecondCheckbox;
	}
	
	// Destroy button approve reject bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BAD_destroy_key']")
	private WebElement chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton;
	
	public WebElement chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton() {
		return chequeBookRequest_ApproveRejectBulkDestroy_DestroyButton;
	}
	
	// retrieve button in bulk destroy screen
	@FindBy(xpath = "//label[@id='chequeBookBulkDestoryFormId_Q000BTD_retrieve_key']")
	private WebElement chequeBookRequest_BulkDestroy_RetrieveKey;

	public WebElement chequeBookRequest_BulkDestroy_RetrieveKey() {
		return chequeBookRequest_BulkDestroy_RetrieveKey;
	}

	// First bulk destroy Record Row
	@FindBy(xpath = "//table[@id='chequeBookBulkDestroyGridTbl_Id_Q000BTD']/tbody/tr[@id='1']")
	private WebElement chequeBookRequest_BulkDestroy_FirstRecordRow;

	public WebElement chequeBookRequest_BulkDestroy_FirstRecordRow() {
		return chequeBookRequest_BulkDestroy_FirstRecordRow;
	}
	
	// bulk destroy remarks field
	@FindBy(xpath = "//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement chequeBookRequest_BulkDestroy_Remarks;
	
	public WebElement chequeBookRequest_BulkDestroy_Remarks() {
		return chequeBookRequest_BulkDestroy_Remarks;
	}
	
	// bulk destroy To Destroy button
	@FindBy(xpath = "//button[@id='chequeBookBulkDestory_to_destroy_Q000BTD']/span")
	private WebElement chequeBookRequest_BulkDestroy_ToDestroyButton;
	
	public WebElement chequeBookRequest_BulkDestroy_ToDestroyButton() {
		return chequeBookRequest_BulkDestroy_ToDestroyButton;
	}
	
	// Charges Collapsible tab
	@FindBy(xpath = "//div[@id='chequeBookChargesDiv_Q000AP']/div[2]")
	private WebElement chequeBookRequest_Maintenance_ChargesCollapsible;
	
	public WebElement chequeBookRequest_Maintenance_ChargesCollapsible() {
		return chequeBookRequest_Maintenance_ChargesCollapsible;
	}
	
	// Waive Charges
	@FindBy(xpath = "//button[@id='chequebookChargesWaive_Q000AP']/span")
	private WebElement chequeBookRequest_Maintenance_WaiveCharges;
	
	public WebElement chequeBookRequest_Maintenance_WaiveCharges() {
		return chequeBookRequest_Maintenance_WaiveCharges;
	}
	
	
	//---------------------------Maintenance close-------------------------//
	
//	// StatusTable approved UserName
//	@FindBy(xpath = "(//*[@title='Approved'])[2]/../td[@tdlabel='User Name']")
//	private WebElement chequeBookRequest_StatusTable_UserName;
//	
//	public WebElement chequeBookRequest_StatusTable_UserName() {
//		return chequeBookRequest_StatusTable_UserName;
//	}
	
	
}
