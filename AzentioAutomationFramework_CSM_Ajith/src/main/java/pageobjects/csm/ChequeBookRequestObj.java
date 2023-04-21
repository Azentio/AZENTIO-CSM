package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj {
	WebDriver driver;
	public ChequeBookRequestObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//******************* Creation of ChequeBook****************************************************//
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
	//******************************************************************************************************//
	//*****************************Cancel ******************************************************************//
	
	@FindBy(id="Q000TC")
	private WebElement toCancelScreen;
	public WebElement toCancelScreen() {
		return toCancelScreen;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInToCancelScreen;
	public WebElement searchChequeBookCodeInToCancelScreen() {
		return searchChequeBookCodeInToCancelScreen;
	}
	
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInToCancelScreen;
	public WebElement selectChequeBookCodeInToCancelScreen() {
		return selectChequeBookCodeInToCancelScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000TC_toCancel_key")
	private WebElement toCancelButton;
	public WebElement toCancelButton() {
		return toCancelButton;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveCancelScreen;
	public WebElement searchChequeBookCodeInApproveCancelScreen() {
		return searchChequeBookCodeInApproveCancelScreen;
	}
	
	@FindBy(id="chequeBook_cancel_Q000AC")
	private WebElement cancelButton;
	public WebElement cancelButton() {
		return cancelButton;
	}
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AC_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInApproveCancelScreen;
	public WebElement selectChequeBookCodeInApproveCancelScreen() {
		return selectChequeBookCodeInApproveCancelScreen;
	}
	@FindBy(id="Q000AC")
	private WebElement approveCancelScreen;
	public WebElement approveCancelScreen() {
		return approveCancelScreen;
	}
	
	@FindBy(id="Chequebook Request / To Cancel")
	private WebElement chequebookRequestToCancel;
	public WebElement chequebookRequestToCancel() {
		return chequebookRequestToCancel;
	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement okButtonInCancelReasonPopUp;
	public WebElement okButtonInCancelReasonPopUp() {
		return okButtonInCancelReasonPopUp;
	}
	@FindBy(id="lookuptxt_chq_cancel_reason_Q000TC")
	private WebElement cancelReason;
	public WebElement cancelReason() {
		return cancelReason;
	}
	
	@FindBy(xpath="//div[text()='WARNING']/following-sibling::div/a")
	private WebElement closeIconInWarningPopUpcancelScreen;
	public WebElement closeIconInWarningPopUpcancelScreen() {
		return closeIconInWarningPopUpcancelScreen;
	}
	//************************************************************************************************************//
	//********************************************Approve Screen**************************************************//
	
	@FindBy(id="Q000AP")
	private WebElement approveSubMenu;
	public WebElement approveSubMenu() {
		return approveSubMenu;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveScreen;
	public WebElement searchChequeBookCodeInApproveScreen() {
		return searchChequeBookCodeInApproveScreen;
	}
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInApproveScreen;
	public WebElement selectChequeBookCodeInApproveScreen() {
		return selectChequeBookCodeInApproveScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000AP_Approve_key")
	private WebElement approveButton;
	public WebElement approveButton() {
		return approveButton;
	}
	
	
	//****************************************************************************************************//
	//************************************Submit*********************************************************//
	@FindBy(id="Q000TR")
	private WebElement applyToSubmitSubMenu;
	public WebElement applyToSubmitSubMenu() {
		return applyToSubmitSubMenu	;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApplyToSubmitScreen;
	public WebElement searchChequeBookCodeInApplyToSubmitScreen() {
		return searchChequeBookCodeInApplyToSubmitScreen;
	}
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInApplyToSubmitScreen;
	public WebElement selectChequeBookCodeInApplyToSubmitScreen() {
		return selectChequeBookCodeInApplyToSubmitScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000TR_applySubmit_key")
	private WebElement applyToSubmitButton;
	public WebElement applyToSubmitButton() {
		return applyToSubmitButton;
	}
 //******************************************************************************************************************//
 //***********************************************Submit Screen*****************************************************//
	
	@FindBy(id="Q000SB")
	private WebElement submitSubMenuInChequebookRequest;
	public WebElement submitSubMenuInChequebookRequest() {
		return submitSubMenuInChequebookRequest;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInSubmitScreen;
	public WebElement searchChequeBookCodeInSubmitScreen() {
		return searchChequeBookCodeInSubmitScreen;
	}
	
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInSubmitScreen;
	public WebElement selectChequeBookCodeInSubmitScreen() {
		return selectChequeBookCodeInSubmitScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000SB_submit")
	private WebElement submitButton;
	public WebElement submitButton() {
		return submitButton;
	}
//************************************************************************************************************//
	@FindBy(id="Q000SP")
	private WebElement suspendScreen;
	public WebElement suspendScreen() {
		return suspendScreen;
	}
	@FindBy(xpath = "//td[text()='Chequebook Request']/preceding-sibling::td/span")
	private WebElement chequebookRequestModule;

	public WebElement chequebookRequestModule() {
		return chequebookRequestModule;
	}
	
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement suspendSearchCheuqueCode;

	public WebElement suspendSearchCheuqueCode() {
		return suspendSearchCheuqueCode;
	}
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000SP_1_ctschqbookVO.CODE']")
	private WebElement suspendSelectCheuqueCode;

	public WebElement suspendSelectCheuqueCode() {
		return suspendSelectCheuqueCode;
	}
	@FindBy(id="chequeBookDefFormId_Q000SP_suspend_key")
	private WebElement suspendButton;
	public WebElement suspendButton() {
		return suspendButton;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[1]")
	private WebElement MaintenanceIcon;
	public WebElement MaintenanceIcon() {
		return MaintenanceIcon;
	}
	//CB--->ChequeBook
	@FindBy(id="infoBarSearchButton_Q000MT")
	private WebElement searchButtonInCBMaintenance;
	public WebElement searchButtonInCBMaintenance() {
		return searchButtonInCBMaintenance;
	}
	@FindBy(id="search_chequeBookGridTbl_Id_Q000MT")
	private WebElement searchChequeBookGridInCBMaintenance;
	public WebElement searchChequeBookGridInCBMaintenance() {
		return searchChequeBookGridInCBMaintenance;
	}
	@FindBy(id="jqg2")
	private WebElement searchChequeBookCodeInCBMaintenance;
	public WebElement searchChequeBookCodeInCBMaintenance() {
		return searchChequeBookCodeInCBMaintenance;
	}
	
	@FindBy(id="fbox_chequeBookGridTbl_Id_Q000MT_search")
	private WebElement findButtonInCBMaintenance;
	public WebElement findButtonInCBMaintenance() {
		return findButtonInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Submitted']")
	private WebElement submittedRecordValidationInCBMaintenance;
	public WebElement submittedRecordValidationInCBMaintenance() {
		return submittedRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Suspended']")
	private WebElement suspendRecordValidationInCBMaintenance;
	public WebElement suspendRecordValidationInCBMaintenance() {
		return suspendRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Cancelled']")
	private WebElement cancelledRecordValidationInCBMaintenance;
	public WebElement cancelledRecordValidationInCBMaintenance() {
		return cancelledRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Approved']")
	private WebElement approvedRecordValidationInCBMaintenance;
	public WebElement approvedRecordValidationInCBMaintenance() {
		return approvedRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Destroyed']")
	private WebElement destroyedRecordValidationInCBMaintenance;
	public WebElement destroyedRecordValidationInCBMaintenance() {
		return destroyedRecordValidationInCBMaintenance;
	}
	
	@FindBy(id="Q000MT")
	private WebElement CBMaintenanceScreen;
	public WebElement CBMaintenanceScreen() {
		return CBMaintenanceScreen;
	}
	
	@FindBy(xpath="//span[text()='close']")
	private WebElement viewMemoPopupClose;
	public WebElement viewMemoPopupClose() {
		return viewMemoPopupClose;
	}
//Anandh
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;
	public WebElement csmChequeBookRequestModule()
	{
		return csm_chequeBookRequestModule;
	}
	@FindBy(xpath="//span[text()='Chequebook Query']")
	private WebElement csm_chequeBooQueryModule;
	public WebElement csmchequeBooQueryModule()
	{
		return csm_chequeBooQueryModule;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBooQueryModule_BranchCode;
	public WebElement chequeBooQueryModuleBranchCode()
	{
		return chequeBooQueryModule_BranchCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBooQueryModule_CurrencyCode;
	public WebElement chequeBooQueryModuleCurrencyCode()
	{
		return chequeBooQueryModule_CurrencyCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBooQueryModule_AccGlCode;
	public WebElement chequeBooQueryModuleAccGlCode()
	{
		return chequeBooQueryModule_AccGlCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBooQueryModule_CIFNumber;
	public WebElement chequeBooQueryModuleCIFNumber()
	{
		return chequeBooQueryModule_CIFNumber;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBooQueryModule_SLNumber;
	public WebElement chequeBooQueryModuleSLNumber()
	{
		return chequeBooQueryModule_SLNumber;
	}
	@FindBy(xpath="//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequeBooQueryModule_ChequeCode;
	public WebElement chequeBooQueryModuleChequeCode()
	{
		return chequeBooQueryModule_ChequeCode;
	}
	@FindBy(xpath="//span[@id='spanLookup_status_sl_Q000QR']//span")
	private WebElement chequeBooQueryModule_LiveSearch;
	public WebElement chequeBooQueryModuleLiveSearch()
	{
		return chequeBooQueryModule_LiveSearch;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.GL_CODE']")
	private WebElement chequeBooQueryModuleLiveSearch_GlCode;
	public WebElement chequeBooQueryModuleLiveSearchGlCode()
	{
		return chequeBooQueryModuleLiveSearch_GlCode;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO']")
	private WebElement chequeBooQueryModuleLiveSearch_CIFNo;
	public WebElement chequeBooQueryModuleLiveSearchCIFNo()
	{
		return chequeBooQueryModuleLiveSearch_CIFNo;
	}
	@FindBy(xpath="//table[@id='chequeBookQueryTbl_Id_Q000QR']//tr[2]")
	private WebElement chequeBooQueryModuleLiveSearch_TableValidation;
	public WebElement chequeBooQueryModuleLiveSearchTableValidation()
	{
		return chequeBooQueryModuleLiveSearch_TableValidation;
	}
	@FindBy(xpath="//span[text()='To Be Destroyed']")
	private WebElement toBeDestroy_MainModule;
	public WebElement toBeDestroyMainModule()
	{
		return toBeDestroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement toBeDestroy_SearchChequeCode;
	public WebElement toBeDestroySearchChequeCode()
	{
		return toBeDestroy_SearchChequeCode;
	}
	@FindBy(xpath="//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement toBeDestroy_ToDestroyButton;
	public WebElement toBeDestroyToDestroyButton()
	{
		return toBeDestroy_ToDestroyButton;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000TD']")
	private WebElement toBeDestroy_BranchCodeValidation;
	public WebElement toBeDestroyBranchCodeValidation()
	{
		return toBeDestroy_BranchCodeValidation;
	}
	@FindBy(xpath="//span[text()='Approve Destroyed']")
	private WebElement destroy_MainModule;
	public WebElement destroyMainModule()
	{
		return destroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement destroy_ChequeCodeSearch;
	public WebElement destroyChequeCodeSearch()
	{
		return destroy_ChequeCodeSearch;
	}
	@FindBy(xpath="//button[@id='chequeBook_destroy_Q000AD']")
	private WebElement destroy_DestroyButon;
	public WebElement destroyDestroyButon()
	{
		return destroy_DestroyButon;
	}
	@FindBy(xpath="//center//input[@value='Ok']")
	private WebElement destroy_DestroyAlertOkButton;
	public WebElement destroyDestroyAlertOkButton()
	{
		return destroy_DestroyAlertOkButton;
	}
	@FindBy(xpath="//div[@class='jMsgbox-contentWrap']")
	private WebElement destroy_TransactionNumber;
	public WebElement destroyTransactionNumber()
	{
		return destroy_TransactionNumber;
	}
	@FindBy(xpath="//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement chequeBook_MaintenenaceScreen;
	public WebElement chequeBookMaintenenaceScreen()
	{
		return chequeBook_MaintenenaceScreen;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement chequeBookMaintenance_Search;
	public WebElement chequeBookMaintenaceSearch()
	{
		return chequeBookMaintenance_Search;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement chequeBookMaintenance_SearchChequeCode;
	public WebElement chequeBookMaintenanceSearchChequeCode()
	{
		return chequeBookMaintenance_SearchChequeCode;
	}
	@FindBy(xpath="//table[@id='chequeBookGridTbl_Id_Q000MT']//td[text()='Approved']")
	private WebElement ChequeBook_ApprovedStatus;

	public WebElement ChequeBookApprovedStatus() {
		return ChequeBook_ApprovedStatus;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000AD']")
	private WebElement destroyed_BranchCodeValidation;
	public WebElement destroyedBranchCodeValidation()
	{
		return destroyed_BranchCodeValidation;
	}
	
	@FindBy(xpath="//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement toBeDestroyed_Reason;
	public WebElement toBeDestroyed_Reason()
	{
		return toBeDestroyed_Reason;
	}

}
