package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMparam_ParametersObj {
	
	WebDriver driver;

	public CSMparam_ParametersObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Parameters Menu
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parameters_MenuOption;

	public WebElement parameters_MenuOption() {
		return parameters_MenuOption;
	}
	
	// System Parameters Menu
	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement parameters_SystemParameters_MenuOption;
	
	public WebElement parameters_SystemParameters_MenuOption() {
		return parameters_SystemParameters_MenuOption;
	}
	
	// Cheques SubMenu
	@FindBy(xpath = "//td[text()='Cheques']")
	private WebElement systemParameters_Cheques;
	
	public WebElement systemParameters_Cheques() {
		return systemParameters_Cheques;
	}
	
	// ChequeBook
	@FindBy(xpath = "//td[text()='ChequeBook']")
	private WebElement systemParameters_Cheques_ChequeBook;
	
	public WebElement systemParameters_Cheques_ChequeBook() {
		return systemParameters_Cheques_ChequeBook;
	}
	
	// Control Record
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement systemParameters_ControlRecord;
	
	public WebElement systemParameters_ControlRecord() {
		return systemParameters_ControlRecord;
	}
	
	// Approve under Control Record
	@FindBy(xpath = "//a[@id='O001P']/span[2]")
	private WebElement systemParameters_ControlRecord_Approve;
	
	public WebElement systemParameters_ControlRecord_Approve() {
		return systemParameters_ControlRecord_Approve;
	}
	
	// Approve button under Control Record approve
	@FindBy(xpath = "//label[@id='controlRecordMaint_FormId_O001P_Approve_key']")
	private WebElement systemParameters_ControlRecord_ApproveButton;
	
	public WebElement systemParameters_ControlRecord_ApproveButton() {
		return systemParameters_ControlRecord_ApproveButton;
	}
	
	// Update After Approve under Cotrol Record
	@FindBy(xpath = "//a[@id='O001UP']/span[2]")
	private WebElement systemParameters_ControlRecord_UpdateAfterApprove;
	
	public WebElement systemParameters_ControlRecord_UpdateAfterApprove() {
		return systemParameters_ControlRecord_UpdateAfterApprove;
	}
	
	// Update After Approve button
	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement systemParameters_ControlRecord_UpdateAfterApproveButton;
	
	public WebElement systemParameters_ControlRecord_UpdateAfterApproveButton() {
		return systemParameters_ControlRecord_UpdateAfterApproveButton;
	}
	
	// Maintenance screen
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement cheques_ChequeBook_Maintenance;

	public WebElement cheques_ChequeBook_Maintenance() {
		return cheques_ChequeBook_Maintenance;
	}
	
	// Code input Field
	@FindBy(xpath = "//input[@name='chequesbookCO.ctschequesVO.CODE']")
	private WebElement cheques_ChequeBook_Code;
	
	public WebElement cheques_ChequeBook_Code() {
		return cheques_ChequeBook_Code;
	}
	
	// Brief name input Field
	@FindBy(xpath = "//input[@name='chequesbookCO.ctschequesVO.BRIEF_NAME_ENG']")
	private WebElement cheques_ChequeBook_BriefName;
	
	public WebElement cheques_ChequeBook_BriefName() {
		return cheques_ChequeBook_BriefName;
	}
	
	// NumberOfCheques input Field
	@FindBy(xpath = "//input[@name='chequesbookCO.ctschequesVO.NUMBER_OF_CHEQUES']")
	private WebElement cheques_ChequeBook_NumberOfCheques;
	
	public WebElement cheques_ChequeBook_NumberOfCheques() {
		return cheques_ChequeBook_NumberOfCheques;
	}
	
	// ChequeType input Field
	@FindBy(xpath = "//input[@id='lookuptxt_cheque_types_P029MT']")
	private WebElement cheques_ChequeBook_ChequeType;
	
	public WebElement cheques_ChequeBook_ChequeType() {
		return cheques_ChequeBook_ChequeType;
	}
	
	// Design input Field
	@FindBy(xpath = "//input[@id='lookuptxt_design_P029MT']")
	private WebElement cheques_ChequeBook_Design;
	
	public WebElement cheques_ChequeBook_Design() {
		return cheques_ChequeBook_Design;
	}
	
	// Leaves input Field
	@FindBy(xpath = "//input[@id='lookuptxt_leaves_P029MT']")
	private WebElement cheques_ChequeBook_Leaves;
	
	public WebElement cheques_ChequeBook_Leaves() {
		return cheques_ChequeBook_Leaves;
	}
	
//	// Disable Cheque Number Generate flag
//	@FindBy(xpath = "//input[@id='disable_generate_P029MA']")
//	private WebElement cheques_ChequeBook_DisableChequeNoGenerateFlag;
//	
//	public WebElement cheques_ChequeBook_DisableChequeNoGenerateFlag() {
//		return cheques_ChequeBook_DisableChequeNoGenerateFlag;
//	}
	
	// Require_cancel_reason flag
	@FindBy(xpath = "//input[@id='require_cancel_reason_P029MA']")
	private WebElement cheques_ChequeBook_RequireCancelReasonFlag;
	
	public WebElement cheques_ChequeBook_RequireCancelReasonFlag() {
		return cheques_ChequeBook_RequireCancelReasonFlag;
	}
	
	// Allow Auto Approve flag
	@FindBy(xpath = "//input[@name='chequesbookCO.ctschequesVO.ALLOW_AUTO_APPROVE_YN']")
	private WebElement cheques_ChequeBook_AllowAutoApproveFlag;
	
	public WebElement cheques_ChequeBook_AllowAutoApproveFlag() {
		return cheques_ChequeBook_AllowAutoApproveFlag;
	}
	
	// Language
	@FindBy(xpath = "//select[@id='language_P029MT']")
	private WebElement cheques_ChequeBook_Language;
	
	public WebElement cheques_ChequeBook_Language() {
		return cheques_ChequeBook_Language;
	}
	
	// Cancel Schema
	@FindBy(xpath = "//input[@id='lookuptxt_cancel_charges_P029MT']")
	private WebElement cheques_ChequeBook_CancelSchema;
	
	public WebElement cheques_ChequeBook_CancelSchema() {
		return cheques_ChequeBook_CancelSchema;
	}
	
	// Destroy Schema
	@FindBy(xpath = "//input[@id='lookuptxt_destroy_charges_P029MT']")
	private WebElement cheques_ChequeBook_DestroySchema;
	
	public WebElement cheques_ChequeBook_DestroySchema() {
		return cheques_ChequeBook_DestroySchema;
	}
	
	// Trx type charges
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_P029MT']")
	private WebElement cheques_ChequeBook_TrxTypeCharges;
	
	public WebElement cheques_ChequeBook_TrxTypeCharges() {
		return cheques_ChequeBook_TrxTypeCharges;
	}
	
	// Specific Schema
	@FindBy(xpath = "//input[@id='lookuptxt_specific_charges_P029MT']")
	private WebElement cheques_ChequeBook_SpecificSchema;
	
	public WebElement cheques_ChequeBook_SpecificSchema() {
		return cheques_ChequeBook_SpecificSchema;
	}
	
	// Normal Schema
	@FindBy(xpath = "//input[@id='lookuptxt_charges_schema_P029MT']")
	private WebElement cheques_ChequeBook_NormalSchema;
	
	public WebElement cheques_ChequeBook_NormalSchema() {
		return cheques_ChequeBook_NormalSchema;
	}
	
	// In-House Schema
	@FindBy(xpath = "//input[@id='lookuptxt_in_house_schema_P029MT']")
	private WebElement cheques_ChequeBook_InHouseSchema;
	
	public WebElement cheques_ChequeBook_InHouseSchema() {
		return cheques_ChequeBook_InHouseSchema;
	}
	
	// Account charges
	@FindBy(xpath = "//span[text()=' Account Charges ']")
	private WebElement cheques_ChequeBook_AccountChargesButton;
	
	public WebElement cheques_ChequeBook_AccountChargesButton() {
		return cheques_ChequeBook_AccountChargesButton;
	}
	
	// Account charges screen plus button
	@FindBy(xpath = "//div/span[@class='ui-icon ui-icon-plus']")
	private WebElement cheques_ChequeBook_AccountChargesPlusButton;
	
	public WebElement cheques_ChequeBook_AccountChargesPlusButton() {
		return cheques_ChequeBook_AccountChargesPlusButton;
	}
	
	// Account branch code input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.BRANCH_CODE_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountBranchCode;
	
	public WebElement cheques_ChequeBook_AccountBranchCode() {
		return cheques_ChequeBook_AccountBranchCode;
	}
	
	// Account currency code input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.CURRENCY_CODE_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountCurrencyCode;
	
	public WebElement cheques_ChequeBook_AccountCurrencyCode() {
		return cheques_ChequeBook_AccountCurrencyCode;
	}
	
	// Account GL code input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.GL_CODE_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountGLCode;
	
	public WebElement cheques_ChequeBook_AccountGLCode() {
		return cheques_ChequeBook_AccountGLCode;
	}
	
	// Account CIF Code input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.CIF_SUB_NO_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_CifCode;
	
	public WebElement cheques_ChequeBook_CifCode() {
		return cheques_ChequeBook_CifCode;
	}
	
	// Account SL no input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.SL_NO_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_SlNo;
	
	public WebElement cheques_ChequeBook_SlNo() {
		return cheques_ChequeBook_SlNo;
	}
	
	// Account Charges CHEQUE_TYPE input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.CHEQUE_TYPE_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesChequeType;
	
	public WebElement cheques_ChequeBook_AccountChargesChequeType() {
		return cheques_ChequeBook_AccountChargesChequeType;
	}
	
	// Account Charges Leaves input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.LEAVES_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesLeaves;
	
	public WebElement cheques_ChequeBook_AccountChargesLeaves() {
		return cheques_ChequeBook_AccountChargesLeaves;
	}
	
	// Account Charges Approve Charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.CHARGES_SCHEMA_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesApproveCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesApproveCharges() {
		return cheques_ChequeBook_AccountChargesApproveCharges;
	}
	
	// Account Charges Trx Type Charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.TRX_TYPE_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesTrxTypeCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesTrxTypeCharges() {
		return cheques_ChequeBook_AccountChargesTrxTypeCharges;
	}
	
	// Account Charges Destroy Charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.DESTROY_CHARGES_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesDestroyCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesDestroyCharges() {
		return cheques_ChequeBook_AccountChargesDestroyCharges;
	}
	
	// Account Charges Cancel Charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.CANCEL_CHARGES_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesCancelCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesCancelCharges() {
		return cheques_ChequeBook_AccountChargesCancelCharges;
	}
	
	// Account Charges Submit charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.SUBMIT_CHARGES_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesSubmitCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesSubmitCharges() {
		return cheques_ChequeBook_AccountChargesSubmitCharges;
	}
	
	// Account Charges InHouse charges input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.IN_HOUSE_SCHEMA_lookuptxt_tab5_GridTbl_Id_P029MT']")
	private WebElement cheques_ChequeBook_AccountChargesInHouseCharges;
	
	public WebElement cheques_ChequeBook_AccountChargesInHouseCharges() {
		return cheques_ChequeBook_AccountChargesInHouseCharges;
	}
	
	// Account Charges Destroy Reason input field
	@FindBy(xpath = "//input[@id='new_1684241027972_ctschequesChargesVO.DESTROY_REASON']")
	private WebElement cheques_ChequeBook_AccountChargesDestroyReason;
	
	public WebElement cheques_ChequeBook_AccountChargesDestroyReason() {
		return cheques_ChequeBook_AccountChargesDestroyReason;
	}
	
	// Account Charges ok button
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement cheques_ChequeBook_AccountChargesOkButton;
	
	public WebElement cheques_ChequeBook_AccountChargesOkButton() {
		return cheques_ChequeBook_AccountChargesOkButton;
	}
	
	// Disable cheque Number Generation
	@FindBy(xpath = "//input[@id='disable_generate_P029MT']")
	private WebElement cheques_ChequeBook_DisableChequeNumberGeneration;
	
	public WebElement cheques_ChequeBook_DisableChequeNumberGeneration() {
		return cheques_ChequeBook_DisableChequeNumberGeneration;
	}
	
//	// Language - English
//	@FindBy(xpath = "//option[text()='English']")
//	private WebElement cheques_ChequeBook_EnglishLanguage;
//	
//	public WebElement cheques_ChequeBook_EnglishLanguage() {
//		return cheques_ChequeBook_EnglishLanguage;
//	}
	
	// Allow Auto Submit flag
	@FindBy(xpath = "//input[@id='allow_auto_submit_yn_P029MT']")
	private WebElement cheques_ChequeBook_AllowAutoSubmitFlag;
	
	public WebElement cheques_ChequeBook_AllowAutoSubmitFlag() {
		return cheques_ChequeBook_AllowAutoSubmitFlag;
	}
	
	// Auto submit upon Approve flag
	@FindBy(xpath = "//input[@id='auto_submit_P029MT']")
	private WebElement cheques_ChequeBook_AutoSubmitUponApproveFlag;
	
	public WebElement cheques_ChequeBook_AutoSubmitUponApproveFlag() {
		return cheques_ChequeBook_AutoSubmitUponApproveFlag;
	}
	
	// save button
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement Cheques_ChequeBook_SaveButton;
	
	public WebElement Cheques_ChequeBook_SaveButton() {
		return Cheques_ChequeBook_SaveButton;
	}
	
	//Informatio no changes available
	@FindBy(xpath = "//div[text()='No Changes Available']")
	private WebElement systemParameters_ControlRecord_NoChangesAvailable;
	
	public WebElement systemParameters_ControlRecord_NoChangesAvailable() {
		return systemParameters_ControlRecord_NoChangesAvailable;
	}
	
	// Confirm popup ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Cheques_ChequeBook_ConfirmPopupOkButton;
	
	public WebElement Cheques_ChequeBook_ConfirmPopupOkButton() {
		return Cheques_ChequeBook_ConfirmPopupOkButton;
	}
	
	// Success popup ok button
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Cheques_ChequeBook_SuccessPopupOkButton;
	
	public WebElement Cheques_ChequeBook_SuccessPopupOkButton() {
		return Cheques_ChequeBook_SuccessPopupOkButton;
	}

	// Approve	
	@FindBy(xpath = "//a[@id='P029P']/span[text()='Approve']")
	private WebElement cheques_ChequeBook_Approve;
	
	public WebElement cheques_ChequeBook_Approve() {
		return cheques_ChequeBook_Approve;
	}
	
	// Approve	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_P029MT']/span")
	private WebElement cheques_ChequeBook_Maintenance_SearchButton;
	
	public WebElement cheques_ChequeBook_Maintenance_SearchButton() {
		return cheques_ChequeBook_Maintenance_SearchButton;
	}
	
	// Code Retrive	
	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE']")
	private WebElement cheques_ChequeBook_Approve_Code;
	
	public WebElement cheques_ChequeBook_Approve_Code() {
		return cheques_ChequeBook_Approve_Code;
	}
	
	// Code Retrive	
	@FindBy(xpath = "//input[@id='chequesBookList_GridTbl_Id_P029MT_gs_ctschequesVO.CODE']")
	private WebElement cheques_ChequeBook_Approved_Code;
	
	public WebElement cheques_ChequeBook_Approved_Code() {
		return cheques_ChequeBook_Approved_Code;
	}
	
	// Alert Close Button
	@FindBy(xpath = "//span[text()='close']")
	private WebElement cheques_ChequeBook_Approve_AlertClose;

	public WebElement cheques_ChequeBook_Approve_AlertClose() {
		return cheques_ChequeBook_Approve_AlertClose;
	}
	
	// Approve Button
	@FindBy(xpath = "//label[@id='chequesBookMaint_FormId_P029P_Approve_key']")
	private WebElement cheques_ChequeBook_ApproveButton;
	
	public WebElement cheques_ChequeBook_ApproveButton() {
		return cheques_ChequeBook_ApproveButton;
	}
	
	// Status Span
	@FindBy(xpath = "//span[text()=' Status ']")
	private WebElement cheques_ChequeBook_Maintenance_StatusSpan;
	
	public WebElement cheques_ChequeBook_Maintenance_StatusSpan() {
		return cheques_ChequeBook_Maintenance_StatusSpan;
	}
	
	// Status
	@FindBy(xpath = "//input[@id='STATUS_DESC_P029MT']")
	private WebElement cheques_ChequeBook_Maintenance_Status;
	
	public WebElement cheques_ChequeBook_Maintenance_Status() {
		return cheques_ChequeBook_Maintenance_Status;
	}
	
	// Bulk Destroy 
	@FindBy(xpath = "//input[@id='bulk_destroy_period_O001UP']")
	private WebElement systemParameters_ControlRecord_BulkDestroyPeriod;
	
	public WebElement systemParameters_ControlRecord_BulkDestroyPeriod() {
		return systemParameters_ControlRecord_BulkDestroyPeriod;
	}
	
	// chequebook advanced process 
	@FindBy(xpath = "//input[@id='chqbook_process_O001UP']")
	private WebElement systemParameters_ControlRecord_ChequebookAdvancedProcessFlag;
	
	public WebElement systemParameters_ControlRecord_ChequebookAdvancedProcessFlag() {
		return systemParameters_ControlRecord_ChequebookAdvancedProcessFlag;
	}
	
	// chequebook advanced process 
	@FindBy(xpath = "//input[@id='chqbook_process_O001UP' and @checked='checked']")
	private WebElement systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag;
	
	public WebElement systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag() {
		return systemParameters_ControlRecord_CheckedChequebookAdvancedProcessFlag;
	}

}