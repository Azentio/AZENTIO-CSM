package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ChequeBook_Request_All_OBJ {
    WebDriver driver;
    
    public CSM_ChequeBook_Request_All_OBJ(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//td[text()='Chequebook Request']")
private WebElement ChequeBookRequest;
public WebElement ChequeBookRequest()
{
	return ChequeBookRequest;
}
@FindBy(xpath = "//span[text()='In Branch']")
private WebElement ChequeBookInBranch;
public WebElement ChequeBookInBranch()
{
	return ChequeBookInBranch;
}
@FindBy(xpath = "//td[text()='Send To/Receive From Provider']")
private WebElement ReceiveFromProviderSelect;
public WebElement ReceiveFromProviderSelect()
{
	return ReceiveFromProviderSelect;
}
@FindBy(xpath = "//span[text()='Send To Provider']")
private WebElement sendToProviderButton;
public WebElement sendToProviderButton()
{
	return sendToProviderButton;
}

@FindBy(id = "chqBkImpExpGridTbl_Id_Q000TP_gs_ctschqbookVO.CODE")
private WebElement searchChequeBookCodeInSendToProviderScreen;
public WebElement searchChequeBookCodeInSendToProviderScreen()
{
	return searchChequeBookCodeInSendToProviderScreen;
}


@FindBy(id = "Q000TP")
private WebElement sendToProviderSubMenu;
public WebElement sendToProviderSubMenu()
{
	return sendToProviderSubMenu;
}

@FindBy(xpath = "//span[text()='Receive From Provider']")
private WebElement ReceiveFromProviderButton;
public WebElement ReceiveFromProviderButton()
{
	return ReceiveFromProviderButton;
}
@FindBy(xpath = "//label[text()='Batch No ']//parent::td//following-sibling::td//select")
private WebElement BatchNoSelect;
public WebElement BatchNoSelect()
{
	return BatchNoSelect;
}

@FindBy(id = "td_chqBkImpExpGridTbl_Id_Q000TP_0_cb")
private WebElement SelectCheckBox;
public WebElement SelectCheckBox()
{
	return SelectCheckBox;
}


 
@FindBy(xpath = "//a[@role='button' and .=' Proceed ']")
private WebElement proceedButtonInSendToProviderScreen;
public WebElement proceedButtonInSendToProviderScreen()
{
	return proceedButtonInSendToProviderScreen;
}

@FindBy(xpath = "//a[@id='anchor_390456665']")
private WebElement ProceedButton;
public WebElement ProceedButton()
{
	return ProceedButton;
}
@FindBy(xpath = "//span[text()='Maintenance']")
private WebElement MaintenanceButton;
public WebElement MaintenanceButton()
{
	return MaintenanceButton;
}
@FindBy(id = "infoBarSearchButton_Q000MT")
private WebElement SearchIcon;
public WebElement SearchIcon()
{
	return SearchIcon;
}

@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
private WebElement ChequeBookCode;
public WebElement ChequeBookCode()
{
	return ChequeBookCode;
}


@FindBy(xpath = "//td[text()='Sent to Provider']")
private WebElement sendToProviderValidateMessage;
public WebElement sendToProviderValidateMessage()
{
	return sendToProviderValidateMessage;
}

@FindBy(xpath = "//td[text()='Send to Branch']")
private WebElement ValidateMessage;
public WebElement ValidateMessage()
{
	return ValidateMessage;
}
@FindBy(xpath = "//span[text()='To Reactivate']")
private WebElement toReactivateScreen;
public WebElement toReactivateScreen()
{
	return toReactivateScreen;
}
@FindBy(xpath = "//td[text()='470']")
private WebElement chequeBookCode;
public WebElement chequeBookCode()
{
	return chequeBookCode;
}
@FindBy(xpath = "//label[text()='To Reactivate ']")
private WebElement toReactivateButton;
public WebElement toReactivateButton()
{
	return toReactivateButton;
}
@FindBy(xpath = "//span[text()='Reactivate']")
private WebElement reactivateScreen;
public WebElement reactivateScreen()
{
	return reactivateScreen;
}     
@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000RE_gs_ctschqbookVO.CODE']")
private WebElement chequeCode;
public WebElement chequeCode()
{
	return chequeCode;
}     
@FindBy(xpath = "//label[text()='Reactivate ']")
private WebElement reactivateClickButton;
public WebElement reactivateClickButton()
{
	return reactivateClickButton;
}
@FindBy(xpath = "(//a[text()=' Search '])[2]")
private WebElement searchIcon;
public WebElement searchIcon()
{
	return searchIcon;
}
@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_statusDesc']")
private WebElement validatePopup;
public WebElement validatePopup()
{
	return validatePopup;
}
@FindBy(xpath = "//span[text()='To Be Reversed Chequebook']")
private WebElement toBeReversedChequeBook;
public WebElement toBeReversedChequeBook()
{
	return toBeReversedChequeBook;
}

@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AR_gs_ctschqbookVO.CODE']")
private WebElement chequeBookCodeToBeReversed;
public WebElement chequeBookCodeToBeReversed()
{
	return chequeBookCodeToBeReversed;
}
@FindBy(id = "chequeBookDefFormId_Q000RV_reverse_key")
private WebElement reverseButton;
public WebElement reverseButton()
{
	return reverseButton;
}
@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
private WebElement confirmMessagePopup;
public WebElement confirmMessagePopup()
{
	return confirmMessagePopup;
}
@FindBy(xpath = "//input[@value='Ok ']")
private WebElement clickOkButton;
public WebElement clickOkButton()
{
	return clickOkButton;
}
@FindBy(xpath = "//label[text()='To Be Reversed ']")
private WebElement clickTheToBeReversedButton;
public WebElement clickTheToBeReversedButton()
{
	return clickTheToBeReversedButton;
}
@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
private WebElement proceedMessagePopup;
public WebElement proceedMessagePopup()
{
	return proceedMessagePopup;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
private WebElement maintenanceChequeBookCode;
public WebElement maintenanceChequeBookCode()
{
	return maintenanceChequeBookCode;
}
@FindBy(xpath = "//td[text()='Reversed']")
private WebElement statusPopupMessage;
public WebElement statusPopupMessage()
{
	return statusPopupMessage;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.CODE")
private WebElement reverseChequeBookCode;
public WebElement reverseChequeBookCode()
{
	return reverseChequeBookCode;
}
@FindBy(xpath = "//span[text()='Reverse Chequebook']")
private WebElement reverseChequeBookScreen;
public WebElement reverseChequeBookScreen()
{
	return reverseChequeBookScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000AR_1_ctschqbookVO.CODE")
private WebElement doubleClickTheRecord;
public WebElement doubleClickTheRecord()
{
	return doubleClickTheRecord;
}

//***************************Creation of chequebook*****************************************//
@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
private WebElement noOfChequeBooks;
public WebElement noOfChequeBooks() {
	return noOfChequeBooks;
}

@FindBy(id="lookuptxt_CHEQUE_CODE_Q000MT")
private WebElement chequeBookCreation_chequeCode;
public WebElement chequeBookCreation_chequeCode() {
	return chequeBookCreation_chequeCode;
}

@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
private WebElement chequeBookCreation_BranchCode;
public WebElement chequeBookCreation_BranchCode() {
	return chequeBookCreation_BranchCode;
}
@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
private WebElement chequeBookCreation_CurrencyCode;
public WebElement chequeBookCreation_CurrencyCode() {
	return chequeBookCreation_CurrencyCode;
}
@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
private WebElement chequeBookCreation_GlCode;
public WebElement chequeBookCreation_GlCode() {
	return chequeBookCreation_GlCode;
}
@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
private WebElement chequeBookCreation_CifCode;
public WebElement chequeBookCreation_CifCode() {
	return chequeBookCreation_CifCode;
}

@FindBy(xpath="//input[@id='lookuptxt_acc_sl_Q000MT']")
private WebElement chequeBookCreation_SerialNo;
public WebElement chequeBookCreation_SerialNo() {
	return chequeBookCreation_SerialNo;
}

@FindBy(id="chequeBookDefFormId_Q000MT_btn_save")
private WebElement chequeBookCreation_Save;
public WebElement chequeBookCreation_Save() {
	return chequeBookCreation_Save;
}
@FindBy(xpath="//input[@id='lookuptxt_acc_sl_Q000MT']")
private WebElement chequeBookMaintenance;
public WebElement chequeBookMaintenance() {
	return chequeBookMaintenance;
}

@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
private WebElement chequeBookCreation_OkbuttonWarningPopUp;
public WebElement chequeBookCreation_OkbuttonWarningPopUp() {
	return chequeBookCreation_OkbuttonWarningPopUp;
}


//********************************************Approve Screen**************************************************//
@FindBy(id="Q000AP")
private WebElement approveSubMenu;
public WebElement approveSubMenu() 
{
return approveSubMenu;
}
@FindBy(id="chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
private WebElement searchChequeBookCodeInApproveScreen;
public WebElement searchChequeBookCodeInApproveScreen() 
{
return searchChequeBookCodeInApproveScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CODE")
private WebElement selectChequeBookCodeInApproveScreen;
public WebElement selectChequeBookCodeInApproveScreen() 
{
return selectChequeBookCodeInApproveScreen;
}
@FindBy(id="chequeBookDefFormId_Q000AP_Approve_key")
private WebElement approveButton;
public WebElement approveButton() 
{
return approveButton;
}
@FindBy(xpath="//div[text()='WARNING']/following-sibling::div/a")
private WebElement closeIconInWarningPopUpcancelScreen;
public WebElement closeIconInWarningPopUpcancelScreen() 
{
return closeIconInWarningPopUpcancelScreen;
}
@FindBy(id="search_chequeBookGridTbl_Id_Q000MT")
private WebElement searchChequeBookGridInCBMaintenance;
public WebElement searchChequeBookGridInCBMaintenance() 
{
return searchChequeBookGridInCBMaintenance;
}
@FindBy(id="fbox_chequeBookGridTbl_Id_Q000MT_search")
private WebElement findButtonInCBMaintenance;
public WebElement findButtonInCBMaintenance() 
{
return findButtonInCBMaintenance;
}
@FindBy(id="jqg2")
private WebElement searchChequeBookCodeInCBMaintenance;
public WebElement searchChequeBookCodeInCBMaintenance() 
{
return searchChequeBookCodeInCBMaintenance;
}
@FindBy(xpath="//td[text()='Approved']")
private WebElement approvedRecordValidationInCBMaintenance;
public WebElement approvedRecordValidationInCBMaintenance() {
	return approvedRecordValidationInCBMaintenance;
}

//*********************check the field collected by id*************************************************//
@FindBy(xpath="//span[text()='Submit']")
private WebElement submitScreenChequeBookRequest;
public WebElement submitScreenChequeBookRequest() {
	return submitScreenChequeBookRequest;
}
@FindBy(id = "infoBarSearchButton_Q000SB")
private WebElement searchIconInSubmitScreen;
public WebElement searchIconInSubmitScreen() {
	return searchIconInSubmitScreen;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
private WebElement chequeCodeInSubmitScreen;
public WebElement chequeCodeInSubmitScreen() {
	return chequeCodeInSubmitScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
private WebElement doubleClickInSubmitScreen;
public WebElement doubleClickInSubmitScreen() {
	return doubleClickInSubmitScreen;
}
@FindBy(xpath = "//span[text()='Request Information']//parent::div//child::span/span")
private WebElement requestInformationInSubmitScreen;
public WebElement requestInformationInSubmitScreen()
{
	return requestInformationInSubmitScreen;
}
@FindBy(id = "lookuptxt_collected_by_id_Q000SB")
private WebElement collectedByIdField;
public WebElement collectedByIdField()
{
	return collectedByIdField;
}

//***********************Chequebook creation in maintenance screen under checkbook request****************************//

@FindBy(xpath = "//label[@id='lbl_num_of_chqbooks_Q000MT']//parent::td//following-sibling::td//input")
private WebElement numberOfChequeBooksInMaintenance;
public WebElement numberOfChequeBooksInMaintenance()
{
	return numberOfChequeBooksInMaintenance;
}
@FindBy(id = "lookuptxt_CHEQUE_CODE_Q000MT")
private WebElement chequeCodeInMaintenanceScreen;
public WebElement chequeCodeInMaintenanceScreen()
{
	return chequeCodeInMaintenanceScreen;
}
@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[1]")
private WebElement branchCodeInMaintenanceScreen;
public WebElement branchCodeInMaintenanceScreen()
{
	return branchCodeInMaintenanceScreen;
}
@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[2]")
private WebElement currencyCodeInMaintenanceScreen;
public WebElement currencyCodeInMaintenanceScreen()
{
	return currencyCodeInMaintenanceScreen;
}
@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[3]")
private WebElement glCodeInMaintenanceScreen;
public WebElement glCodeInMaintenanceScreen()
{
	return glCodeInMaintenanceScreen;
}
@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[4]")
private WebElement cifCodeInMaintenanceScreen;
public WebElement cifCodeInMaintenanceScreen()
{
	return cifCodeInMaintenanceScreen;
}
@FindBy(xpath = "(//label[@id='chequeBookDefFormId_Q000MT_acc_no_key']//parent::td//following-sibling::td//child::div//input)[5]")
private WebElement serialNoInMaintenanceScreen;
public WebElement serialNoInMaintenanceScreen()
{
	return serialNoInMaintenanceScreen;
}
@FindBy(id = "chequeBookDefFormId_Q000MT_btn_save")
private WebElement saveButtonInMaintenanceScreen;
public WebElement saveButtonInMaintenanceScreen()
{
	return saveButtonInMaintenanceScreen;
}
@FindBy(xpath = "//a[text()='Chequebook Request / Maintenance']")
private WebElement randomClickInChequeBookCreation;
public WebElement randomClickInChequeBookCreation()
{
	return randomClickInChequeBookCreation;
}

//********************creation of cif in FOM********************************//

@FindBy(xpath = "//td[text()='Front Office Management']")
private WebElement frontOfficeManagementScreen;
public WebElement frontOfficeManagementScreen()
{
	return frontOfficeManagementScreen;
}
@FindBy(id = "infoBarSearchButton_F00I1MT")
private WebElement searchIconInMaintenanceScreen;
public WebElement searchIconInMaintenanceScreen()
{
	return searchIconInMaintenanceScreen;
}
@FindBy(id = "fomGridTbl_Id_F00I1MT_gs_cifVO.STATUS")
private WebElement statusButtonInMaintenanceScreen;
public WebElement statusButtonInMaintenanceScreen()
{
	return statusButtonInMaintenanceScreen;
}
@FindBy(id = "fomMaintForm_F00I1MT_CIF_Products_key")
private WebElement cifProducts;
public WebElement cifProducts()
{
	return cifProducts;
}
@FindBy(id = "cifProductsVO_SHORT_ACC_NAME_ENG_F00I1MT")
private WebElement accountBriefName;
public WebElement accountBriefName()
{
	return accountBriefName;
}
@FindBy(id = "cifProductsVO_SHORT_ACC_NAME_ARAB_F00I1MT")
private WebElement necessaryFieldInChequeBook;
public WebElement necessaryFieldInChequeBook()
{
	return necessaryFieldInChequeBook;
}
@FindBy(id = "cifProductsVO_ISSUE_CHQBK_F00I1MT")
private WebElement clickCheckBoXInFomScreen;
public WebElement clickCheckBoXInFomScreen()
{
	return clickCheckBoXInFomScreen;
}
@FindBy(xpath = "//span[text()='Save']")
private WebElement saveButtonInFomScreen;
public WebElement saveButtonInFomScreen()
{
	return saveButtonInFomScreen;
}
@FindBy(xpath = "//div[text()='[1717] User Has No Access To Modify Any CIF Information .']")
private WebElement errorPopupMessageInFom;
public WebElement errorPopupMessageInFom()
{
	return errorPopupMessageInFom;
}

//@CHB_049 testcase
@FindBy(xpath = "//span[text()='Apply to Submit']")
private WebElement applyToSubmitScreen;
public WebElement applyToSubmitScreen()
{
	return applyToSubmitScreen;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
private WebElement checkCodeInApplyToSubmit;
public WebElement checkCodeInApplyToSubmit()
{
	return checkCodeInApplyToSubmit;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE")
private WebElement doubleClickInApplyToSubmitScreen;
public WebElement doubleClickInApplyToSubmitScreen()
{
	return doubleClickInApplyToSubmitScreen;
}
@FindBy(xpath = "//label[text()='Apply Submit ']")
private WebElement applyToSubmitButton;
public WebElement applyToSubmitButton()
{
	return applyToSubmitButton;
}
@FindBy(id = "infoBarSearchButton_Q000TR")
private WebElement searchIconInApplyToSubmit;
public WebElement searchIconInApplyToSubmit()
{
	return searchIconInApplyToSubmit;
}

//@CHB_078
@FindBy(id = "from_number_Q000TR")
private WebElement fromNumber;
public WebElement fromNumber()
{
	return fromNumber;
}
@FindBy(id = "number_to_Q000TR")
private WebElement toNumber;
public WebElement toNumber()
{
	return toNumber;
}

//@CHB_050
@FindBy(id = "approveBut_Q000TR")
private WebElement bmApproval;
public WebElement bmApproval()
{
	return bmApproval;
}
@FindBy(id = "usr_name_alert_Q000TR")
private WebElement usernameInBmApproval;
public WebElement usernameInBmApproval()
{
	return usernameInBmApproval;
}
@FindBy(id = "pwd_alert_Q000TR")
private WebElement passwordInBmApproval;
public WebElement passwordInBmApproval()
{
	return passwordInBmApproval;
}
@FindBy(id = "sendButtonForApprove_Q000TR")
private WebElement submitButtonINBmApproval;
public WebElement submitButtonINBmApproval()
{
	return submitButtonINBmApproval;
}
@FindBy(id = "Approve_key")
private WebElement approveButtonInBmApproval;
public WebElement approveButtonInBmApproval()
{
	return approveButtonInBmApproval;
}


//CHB_082
@FindBy(xpath = "//div[text()=' Do You Want To Proceed?']")
private WebElement confirmErrorMessagePopup;
public WebElement confirmErrorMessagePopup()
{
	return confirmErrorMessagePopup;
}
@FindBy(id = "_popup_path_sol_confirm_ok")
private WebElement okButtonInReverseChequeBookSubMenu;
public WebElement okButtonInReverseChequeBookSubMenu()
{
	return okButtonInReverseChequeBookSubMenu;
}
@FindBy(id = "from_number_Q000MT")
private WebElement fromNumberInMaintenanceScreen;
public WebElement fromNumberInMaintenanceScreen()
{
	return fromNumberInMaintenanceScreen;
}
@FindBy(id = "number_to_Q000MT")
private WebElement toNumberInMaintenanceScreen;
public WebElement toNumberInMaintenanceScreen()
{
	return toNumberInMaintenanceScreen;
}


//CHB_085
@FindBy(xpath = "//span[text()='To Cancel']")
private WebElement toCancelScreen;
public WebElement toCancelScreen()
{
	return toCancelScreen;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
private WebElement codeInToCancelScreen;
public WebElement codeInToCancelScreen()
{
	return codeInToCancelScreen;
}
@FindBy(id = "chequeBookDefFormId_Q000TC_toCancel_key")
private WebElement toCancelButton;
public WebElement toCancelButton()
{
	return toCancelButton;
}
@FindBy(id = "lookuptxt_chq_cancel_reason_Q000TC")
private WebElement cancelReason;
public WebElement cancelReason()
{
	return cancelReason;
}
@FindBy(xpath = "//span[text()='Approve Cancel']")
private WebElement approveCancelScreen;
public WebElement approveCancelScreen()
{
	return approveCancelScreen;
}
@FindBy(id = "chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
private WebElement codeInApproveCancelScreen;
public WebElement codeInApproveCancelScreen()
{
	return codeInApproveCancelScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000AC_5_ctschqbookVO.CHEQUE_CODE")
private WebElement retrieveTheRecord;
public WebElement retrieveTheRecord()
{
	return retrieveTheRecord;
}
@FindBy(id = "chequeBookDefFormId_Q000AC_Cancel_key")
private WebElement cancelButton;
public WebElement cancelButton()
{
	return cancelButton;
}

//CHB_141
@FindBy(xpath = "//span[text()='To Be Destroyed']")
private WebElement toBeDestroyedScreen;
public WebElement toBeDestroyedScreen()
{
	return toBeDestroyedScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE")
private WebElement retrieveApprovedRecordInToBeDestroyedScreen;
public WebElement retrieveApprovedRecordInToBeDestroyedScreen()
{
	return retrieveApprovedRecordInToBeDestroyedScreen;
}
@FindBy(id = "chequeBookDefFormId_Q000TD_to_destroy_key")
private WebElement toDestroyButton;
public WebElement toDestroyButton()
{
	return toDestroyButton;
}
@FindBy(id = "status_remarks_Q000TD")
private WebElement reasonMessage;
public WebElement reasonMessage()
{
	return reasonMessage;
}
@FindBy(xpath = "//span[text()='Approve Destroyed']")
private WebElement approveDestroyedScreen;
public WebElement approveDestroyedScreen()
{
	return approveDestroyedScreen;
}
@FindBy(id = "infoBarSearchButton_Q000AD")
private WebElement searchIconInApproveDestroyedScreen;
public WebElement searchIconInApproveDestroyedScreen()
{
	return searchIconInApproveDestroyedScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000AD_5_ctschqbookVO.CODE")
private WebElement doubleClickTheRecordInApproveDestroyedScreen;
public WebElement doubleClickTheRecordInApproveDestroyedScreen()
{
	return doubleClickTheRecordInApproveDestroyedScreen;
}
//chequeBookCreation_OkbuttonWarningPopUp()
@FindBy(id = "chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE")
private WebElement chequeCodeInApproveDestroyedScreen;
public WebElement chequeCodeInApproveDestroyedScreen()
{
	return chequeCodeInApproveDestroyedScreen;
}
@FindBy(id = "td_chequeBookGridTbl_Id_Q000AD_1_ctschqbookVO.CODE")
private WebElement retrieveRecordInApproveDestroyedScreen;
public WebElement retrieveRecordInApproveDestroyedScreen()
{
	return retrieveRecordInApproveDestroyedScreen;
}
@FindBy(id = "chequeBookDefFormId_Q000AD_reject_key")
private WebElement rejectButton;
public WebElement rejectButton()
{
	return rejectButton;
}

//CHB_142
//toBeReversedChequeBook
//doubleClickTheRecord
//clickTheToBeReversedButton
//okButtonInReverseChequeBookSubMenu
//reverseChequeBookScreen
//reverseChequeBookCode
//chequeBookCreation_OkbuttonWarningPopUp

@FindBy(id = "td_chequeBookGridTbl_Id_Q000RV_1_statusDesc")
private WebElement retrieveRecordInReverseChequeBookSubMenu;
public WebElement retrieveRecordInReverseChequeBookSubMenu()
{
	return retrieveRecordInReverseChequeBookSubMenu;
}
@FindBy(xpath = "//label[text()='Reject ']")
private WebElement rejectButtonInReverseChequeBookSubMenu;
public WebElement rejectButtonInReverseChequeBookSubMenu()
{
	return rejectButtonInReverseChequeBookSubMenu;
}
@FindBy(xpath = "//div[text()='[890] Invalid/Missing Reason Code']")
private WebElement validatePopupInReverseChequeBookSubMenu;
public WebElement validatePopupInReverseChequeBookSubMenu()
{
	return validatePopupInReverseChequeBookSubMenu;
}
@FindBy(id = "status_remarks_Q000RV")
private WebElement reasonBox;
public WebElement reasonBox()
{
	return reasonBox;
}









}
