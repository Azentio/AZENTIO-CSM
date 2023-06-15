package pageobjects.csm;

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

	@FindBy(xpath = "//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;

	public WebElement csmChequeBookRequestModule() {
		return csm_chequeBookRequestModule;
	}

	@FindBy(xpath = "//span[text()='Chequebook Query']")
	private WebElement csm_chequeBooQueryModule;

	public WebElement csmchequeBooQueryModule() {
		return csm_chequeBooQueryModule;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBooQueryModule_BranchCode;

	public WebElement chequeBooQueryModuleBranchCode() {
		return chequeBooQueryModule_BranchCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBooQueryModule_CurrencyCode;

	public WebElement chequeBooQueryModuleCurrencyCode() {
		return chequeBooQueryModule_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBooQueryModule_AccGlCode;

	public WebElement chequeBooQueryModuleAccGlCode() {
		return chequeBooQueryModule_AccGlCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBooQueryModule_CIFNumber;

	public WebElement chequeBooQueryModuleCIFNumber() {
		return chequeBooQueryModule_CIFNumber;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBooQueryModule_SLNumber;

	public WebElement chequeBooQueryModuleSLNumber() {
		return chequeBooQueryModule_SLNumber;
	}

	@FindBy(xpath = "//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequeBooQueryModule_ChequeCode;

	public WebElement chequeBooQueryModuleChequeCode() {
		return chequeBooQueryModule_ChequeCode;
	}

	@FindBy(xpath = "//span[@id='spanLookup_status_sl_Q000QR']//span")
	private WebElement chequeBooQueryModule_LiveSearch;

	public WebElement chequeBooQueryModuleLiveSearch() {
		return chequeBooQueryModule_LiveSearch;
	}

	@FindBy(xpath = "//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.GL_CODE']")
	private WebElement chequeBooQueryModuleLiveSearch_GlCode;

	public WebElement chequeBooQueryModuleLiveSearchGlCode() {
		return chequeBooQueryModuleLiveSearch_GlCode;
	}

	@FindBy(xpath = "//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO']")
	private WebElement chequeBooQueryModuleLiveSearch_CIFNo;

	public WebElement chequeBooQueryModuleLiveSearchCIFNo() {
		return chequeBooQueryModuleLiveSearch_CIFNo;
	}

	@FindBy(xpath = "//table[@id='chequeBookQueryTbl_Id_Q000QR']//tr[2]")
	private WebElement chequeBooQueryModuleLiveSearch_TableValidation;

	public WebElement chequeBooQueryModuleLiveSearchTableValidation() {
		return chequeBooQueryModuleLiveSearch_TableValidation;
	}

	@FindBy(xpath = "//span[text()='To Be Destroyed']")
	private WebElement toBeDestroy_MainModule;

	public WebElement toBeDestroyMainModule() {
		return toBeDestroy_MainModule;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement toBeDestroy_SearchChequeCode;

	public WebElement toBeDestroySearchChequeCode() {
		return toBeDestroy_SearchChequeCode;
	}

	@FindBy(xpath = "//textarea[@id='status_remarks_Q000AP']")
	private WebElement toBeDestroyed_RejectRemark;

	public WebElement tobeDestroyedRejectRemark() {
		return toBeDestroyed_RejectRemark;
	}

	@FindBy(xpath = "//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement toBeDestroy_ToDestroyButton;

	public WebElement toBeDestroyToDestroyButton() {
		return toBeDestroy_ToDestroyButton;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000TD']")
	private WebElement toBeDestroy_BranchCodeValidation;

	public WebElement toBeDestroyBranchCodeValidation() {
		return toBeDestroy_BranchCodeValidation;
	}

	@FindBy(xpath = "//span[text()='Approve Destroyed']")
	private WebElement destroy_MainModule;

	public WebElement destroyMainModule() {
		return destroy_MainModule;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement destroy_ChequeCodeSearch;

	public WebElement destroyChequeCodeSearch() {
		return destroy_ChequeCodeSearch;
	}

	@FindBy(xpath = "//button[@id='chequeBook_destroy_Q000AD']")
	private WebElement destroy_DestroyButon;

	public WebElement destroyDestroyButon() {
		return destroy_DestroyButon;
	}

	@FindBy(xpath = "//center//input[@value='Ok']")
	private WebElement destroy_DestroyAlertOkButton;

	public WebElement destroyDestroyAlertOkButton() {
		return destroy_DestroyAlertOkButton;
	}

	@FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
	private WebElement destroy_TransactionNumber;

	public WebElement destroyTransactionNumber() {
		return destroy_TransactionNumber;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement chequeBook_MaintenenaceScreen;

	public WebElement chequeBookMaintenenaceScreen() {
		return chequeBook_MaintenenaceScreen;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Approve']")
	private WebElement chequeBook_ApproveFeature;

	public WebElement chequeBookApproveFeature() {
		return chequeBook_ApproveFeature;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement chequeBookMaintenance_Search;

	public WebElement chequeBookMaintenaceSearch() {
		return chequeBookMaintenance_Search;
	}

	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement chequeBookMaintenance_SearchChequeCode;

	public WebElement chequeBookMaintenanceSearchChequeCode() {
		return chequeBookMaintenance_SearchChequeCode;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000MT']//td[text()='Approved']")
	private WebElement ChequeBook_ApprovedStatus;

	public WebElement ChequeBookApprovedStatus() {
		return ChequeBook_ApprovedStatus;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000AD']")
	private WebElement destroyed_BranchCodeValidation;

	public WebElement destroyedBranchCodeValidation() {
		return destroyed_BranchCodeValidation;
	}

	@FindBy(xpath = "//input[@id='num_of_chqbooks_Q000MT']")
	private WebElement chequeBookRequest_NumberOfChequeBook;

	public WebElement chequeBookRequestNumberOfChequeBook() {
		return chequeBookRequest_NumberOfChequeBook;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CHEQUE_CODE_Q000MT']")
	private WebElement chequeBookRequest_ChequeCode;

	public WebElement chequeBookRequestChequeCode() {
		return chequeBookRequest_ChequeCode;
	}

	@FindBy(xpath = "//input[@id='CHEQUE_BRIEF_NAME']")
	private WebElement chequeBookRequest_ChequeCodeDescription;

	public WebElement chequeBookRequestChequeCodeDescription() {
		return chequeBookRequest_ChequeCodeDescription;
	}

	@FindBy(xpath = "//input[@id='acc_br_Q000MT']")
	private WebElement chequeBookRequest_AccountBranchName;

	public WebElement chequeBookRequestAccountBranchName() {
		return chequeBookRequest_AccountBranchName;
	}

	@FindBy(xpath = "//input[@id='acc_cy_Q000MT']")
	private WebElement chequeBookRequest_AccountCurrencyCode;

	public WebElement chequeBookRequestAccountCurrencyCode() {
		return chequeBookRequest_AccountCurrencyCode;
	}

	@FindBy(xpath = "//input[@id='acc_gl_Q000MT']")
	private WebElement chequeBookRequest_AccountGlCode;

	public WebElement chequeBookRequestAccountGlCode() {
		return chequeBookRequest_AccountGlCode;
	}

	@FindBy(xpath = "//input[@id='acc_cif_Q000MT']")
	private WebElement chequeBookRequest_AccountCIFCode;

	public WebElement chequeBookRequestAccountCIFCode() {
		return chequeBookRequest_AccountCIFCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookRequest_AccountSerialNumber;

	public WebElement chequeBookRequestAccountSerialNumber() {
		return chequeBookRequest_AccountSerialNumber;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Maintenance')]")
	private WebElement chequeBookRequest_Label;

	public WebElement chequeBookRequestLabel() {
		return chequeBookRequest_Label;
	}

	@FindBy(xpath = "//span[text()='Charges']//parent::div")
	private WebElement chequeBookRequest_ChargesSection;

	public WebElement chequeBookRequestChargesSection() {
		return chequeBookRequest_ChargesSection;
	}

	@FindBy(xpath = "//td[contains(text(),'Chequebook Request')]")
	private WebElement csm_ChequeBookRequest;

	public WebElement csmChequeBookRequest() {
		return csm_ChequeBookRequest;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement chequeBookRequest_NumberOfChequeBooks;

	public WebElement chequeBookRequestNumberOfChequeBooks() {
		return chequeBookRequest_NumberOfChequeBooks;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CHEQUE_CODE']")
	private WebElement chequeBookRequest_ChequeCodeInput;

	public WebElement chequeBookRequestChequeCodeInput() {
		return chequeBookRequest_ChequeCodeInput;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctscheques.BRIEF_NAME_ENG']")
	private WebElement chequeBookRequest_ChequeCodeDesc;

	public WebElement chequeBookRequestChequeCodeDesc() {
		return chequeBookRequest_ChequeCodeDesc;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBookRequest_BranchCode;

	public WebElement chequeBookRequestBranchCode() {
		return chequeBookRequest_BranchCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBookRequest_CurencyCode;

	public WebElement chequeBookRequestCurencyCode() {
		return chequeBookRequest_CurencyCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBookRequest_GLCode;

	public WebElement chequeBookRequestGLCode() {
		return chequeBookRequest_GLCode;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBookRequest_CIFNumber;

	public WebElement chequeBookRequestCIFNumber() {
		return chequeBookRequest_CIFNumber;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBookRequest_SerialNumber;

	public WebElement chequeBookRequestSerialNumber() {
		return chequeBookRequest_SerialNumber;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::div//span[text()='To Cancel']")
	private WebElement chequeBookRequest_ToCancelFeature;

	public WebElement chequeBookRequestToCancelFeatrue() {
		return chequeBookRequest_ToCancelFeature;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::div//span[text()='Approve Cancel']")
	private WebElement chequeBookRequest_ApproveCancelFeature;

	public WebElement chequeBookRequestApproveCancelFeature() {
		return chequeBookRequest_ApproveCancelFeature;
	}

	@FindBy(xpath = "//input[@name='CHEQUE_CODE']")
	private WebElement chequeBookrequest_SearchChequeCode;

	public WebElement chequeBookrequestSearchChequeCode() {
		return chequeBookrequest_SearchChequeCode;
	}

	@FindBy(xpath = "//input[@name='ACC_BR']")
	private WebElement chequeBookrequest_SearchAccountBranch;

	public WebElement chequeBookrequestSearchAccountBranch() {
		return chequeBookrequest_SearchAccountBranch;
	}

	@FindBy(xpath = "//input[@name='ACC_CY']")
	private WebElement chequeBookrequest_SearchAccountCurrency;

	public WebElement chequeBookrequestSearchAccountCurrency() {
		return chequeBookrequest_SearchAccountCurrency;
	}

	@FindBy(xpath = "//input[@name='ACC_GL']")
	private WebElement chequebookRequest_SearchGLCode;

	public WebElement chequeBookRequesstSearchGLCode() {
		return chequebookRequest_SearchGLCode;
	}

	@FindBy(xpath = "//input[@name='ACC_CIF']")
	private WebElement chequebookRequest_SearchCIFNumber;

	public WebElement chequebookRequestSearchCIFNumber() {
		return chequebookRequest_SearchCIFNumber;
	}

	@FindBy(xpath = "//input[@name='ACC_SL']")
	private WebElement chequebookRequest_SearchSerialNumber;

	public WebElement chequebookRequestSearchSerialNumber() {
		return chequebookRequest_SearchSerialNumber;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CANCEL_REASON']")
	private WebElement chequebookRequestCancel_CancelReason;

	public WebElement chequebookRequestCancelCancelReason() {
		return chequebookRequestCancel_CancelReason;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.reasonCodeDesc']")
	private WebElement chequebookRequestCancel_CancelReasonDesc;

	public WebElement chequebookRequestCancelCancelReasonDesc() {
		return chequebookRequestCancel_CancelReasonDesc;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctscheques.BRIEF_NAME_ENG']")
	private WebElement chequebookRequestCancel_ChequeCodeDescription;

	public WebElement chequebookRequestCancelChequeCodeDescription() {
		return chequebookRequestCancel_ChequeCodeDescription;
	}

	@FindBy(xpath = "//table[@id='chequeBookGridTbl_Id_Q000TC']//tbody//tr[2]//td[2]")
	private WebElement chequebookRequest_GridRequestNumber;

	public WebElement chequebookRequestGridRequestNumber() {
		return chequebookRequest_GridRequestNumber;
	}

	@FindBy(xpath = "//label[contains(text(),'To Cancel ')]//ancestor::button")
	private WebElement chequebookRequest_ToCancelButton;

	public WebElement chequebookRequestToCancelButton() {
		return chequebookRequest_ToCancelButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Cancel ')]//ancestor::button")
	private WebElement chequebookRequest_CancelButton;

	public WebElement chequebookRequestCancelButton() {
		return chequebookRequest_CancelButton;
	}

	@FindBy(xpath = "//input[@name='chequeBookCO.ctschqbookVO.CODE']")
	private WebElement chequebookRequest_RequestNumber;

	public WebElement chequebookRequestRequestNumber() {
		return chequebookRequest_RequestNumber;
	}

	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement chequebookRequest_SearchRequetCode;

	public WebElement chequebookRequestSearchRequetCode() {
		return chequebookRequest_SearchRequetCode;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / To Cancel')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestToCancel_TabClose;

	public WebElement chequebookRequestToCancelTabClose() {
		return chequebookRequestToCancel_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Approve Cancel')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestApproveCancel_TabClose;

	public WebElement chequebookRequestApproveCancelTabClose() {
		return chequebookRequestApproveCancel_TabClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement chequebookRequestMaintenance_TabClose;

	public WebElement chequebookRequestMaintenanceTabClose() {
		return chequebookRequestMaintenance_TabClose;
	}

	@FindBy(xpath = "//tr[@id='1']//td[2]")
	private WebElement chequeBookRequest_FirstRecord;

	public WebElement chequeBookRequestFirstRecord() {
		return chequeBookRequest_FirstRecord;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing Reason Code')]")
	private WebElement chequeBookRequest_MissingReasonCode;

	public WebElement chequeBookRequestMissingReasonCode() {
		return chequeBookRequest_MissingReasonCode;
	}

	@FindBy(xpath = "//div[contains(text(),'Invalid/Missing Reason Code')]//ancestor::div//following-sibling::center//input[@value='Ok']")
	private WebElement chequeBookRequest_MissingReasonCodeOkButton;

	public WebElement chequeBookRequestMissingReasonCodeOkButton() {
		return chequeBookRequest_MissingReasonCodeOkButton;
	}

	@FindBy(xpath = "//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement chequeBookRequest_RejectReasonremark;

	public WebElement chequeBookRequestRejectReasonremark() {
		return chequeBookRequest_RejectReasonremark;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Approve')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ApproveScreenClose;

	public WebElement chequeBookRequestApproveScreenClose() {
		return chequeBookRequest_ApproveScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Apply to Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_ApplyToSubmitClose;

	public WebElement chequeBookRequestApplyToSubmitClose() {
		return chequeBookRequest_ApplyToSubmitClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Chequebook Request / Submit')]//parent::td//following-sibling::td//span")
	private WebElement chequeBookRequest_SubmitClose;

	public WebElement chequeBookRequestSubmitClose() {
		return chequeBookRequest_SubmitClose;
	}

	@FindBy(xpath = "//tr[@id='1']//td[13]")
	private WebElement chequeBookRequestMaintenance_RecordStatus;

	public WebElement chequeBookRequestMaintenanceRecordStatus() {
		return chequeBookRequestMaintenance_RecordStatus;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Apply to Submit']")
	private WebElement chequeBookRequest_ApplyToSubmitFeature;

	public WebElement chequeBookRequestApplyToSubmitFeature() {
		return chequeBookRequest_ApplyToSubmitFeature;
	}

	@FindBy(xpath = "//label[contains(text(),'Apply Submit ')]//ancestor::button")
	private WebElement applyToSubmit_ApplyToSubmitButton;

	public WebElement applyToSubmitApplyToSubmitButton() {
		return applyToSubmit_ApplyToSubmitButton;
	}

	@FindBy(xpath = "//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Submit']")
	private WebElement chequeBookRequest_SubmitFeature;

	public WebElement chequeBookRequestSubmitFeature() {
		return chequeBookRequest_SubmitFeature;
	}

	@FindBy(xpath = "//label[contains(text(),'Submit ')]//ancestor::button")
	private WebElement SubmitFeature_SubmitButton;

	public WebElement SubmitFeatureSubmitButton() {
		return SubmitFeature_SubmitButton;
	}
	@FindBy(xpath="//td[text()='Sent to Provider']")
	private WebElement sentToProviderRecordValidationInCBMaintenance;
	public WebElement sentToProviderRecordValidationInCBMaintenance() {
		return sentToProviderRecordValidationInCBMaintenance;
	}
}
