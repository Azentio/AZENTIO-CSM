package pageobjects.CSM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ChequebookRequestObj {
	WebDriver driver;
	public CSM_ChequebookRequestObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="_selenuimQ000")
	private WebElement csm_ChequebookRequestSection;
	public WebElement csm_ChequebookRequestSection()
	{
		return csm_ChequebookRequestSection;
	}
	@FindBy(id="Q000TB")
	private WebElement csm_SentToBranch;
	public WebElement csm_SentToBranch()
	{
		return csm_SentToBranch;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TB_gs_ctschqbookVO.CODE")
	private WebElement csm_SentToBranch_CodeSearchField;
	public WebElement csm_SentToBranch_CodeSearchField()
	{
		return csm_SentToBranch_CodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000TB_1_ctschqbookVO.CODE")
	private WebElement csm_SentToBranch_FirstRecord;
	public WebElement csm_SentToBranch_FirstRecord()
	{
		return csm_SentToBranch_FirstRecord;
	}
	@FindBy(id="chequeBook_sentToBranch_Q000TB")
	private WebElement csm_SentToBranch_SentToBranchButton;
	public WebElement csm_SentToBranch_SentToBranchButton()
	{
		return csm_SentToBranch_SentToBranchButton;
	}
	@FindBy(id="Q000MT")
	private WebElement csm_ChequebookRequest_Maintenance;
	public WebElement csm_ChequebookRequest_Maintenance()
	{
		return csm_ChequebookRequest_Maintenance;
	}
	@FindBy(id="infoBarSearchButton_Q000MT")
	private WebElement csm_Maintenance_SearchButton;
	public WebElement csm_Maintenance_SearchButton()
	{
		return csm_Maintenance_SearchButton;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement csm_Maintenance_CodeSearchField;
	public WebElement csm_Maintenance_CodeSearchField()
	{
		return csm_Maintenance_CodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE")
	private WebElement csm_Maintenance_FirstRecord;
	public WebElement csm_Maintenance_FirstRecord()
	{
		return csm_Maintenance_FirstRecord;
	}
	@FindBy(xpath="//td[text()='Send to Branch']")
	private WebElement csm_Maintenance_SentToBranchText;
	public WebElement csm_Maintenance_SentToBranchText()
	{
		return csm_Maintenance_SentToBranchText;
	}
	@FindBy(id="Q000RB")
	private WebElement csm_ReceivedByBranchSection;
	public WebElement csm_ReceivedByBranchSection()
	{
		return csm_ReceivedByBranchSection;
	}
	@FindBy(id="chqBkImpExpGridTbl_Id_Q000RB_gs_ctschqbookVO.CODE")
	private WebElement csm_ReceivedByBranch_ChequebookCodeSearchField;
	public WebElement csm_ReceivedByBranch_ChequebookCodeSearchField()
	{
		return csm_ReceivedByBranch_ChequebookCodeSearchField;
	}
	@FindBy(id="jqg_chqBkImpExpGridTbl_Id_Q000RB_1")
	private WebElement csm_ReceivedByBranch_FirstRecordCheckbox;
	public WebElement csm_ReceivedByBranch_FirstRecordCheckbox()
	{
		return csm_ReceivedByBranch_FirstRecordCheckbox;
	}
	@FindBy(id="anchor_829676904")
	private WebElement csm_ReceivedByBranch_ProceedButton;
	public WebElement csm_ReceivedByBranch_ProceedButton()
	{
		return csm_ReceivedByBranch_ProceedButton;
	}
	@FindBy(xpath="//td[text()='Received by Branch']")
	private WebElement csm_Maintenance_ReceivedByBranchText;
	public WebElement csm_Maintenance_ReceivedByBranchText()
	{
		return csm_Maintenance_ReceivedByBranchText;
	}
	@FindBy(id="Q000IB")
	private WebElement csm_InBranchSection;
	public WebElement csm_InBranchSection()
	{
		return csm_InBranchSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000IB_gs_ctschqbookVO.CODE")
	private WebElement csm_InBranchCodeField;
	public WebElement csm_InBranchCodeField()
	{
		return csm_InBranchCodeField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000IB_1_ctschqbookVO.CODE")
	private WebElement csm_InBranchFirstRecord;
	public WebElement csm_InBranchFirstRecord()
	{
		return csm_InBranchFirstRecord;
	}
	@FindBy(id="chequeBook_inBranch_Q000IB")
	private WebElement csm_InBranchButton;
	public WebElement csm_InBranchButton()
	{
		return csm_InBranchButton;
	}
	@FindBy(xpath="//td[text()='In Branch']")
	private WebElement csm_InBranchText;
	public WebElement csm_InBranchText()
	{
		return csm_InBranchText;
	}
	@FindBy(id="Q000TR")
	private WebElement csm_ApplyToSubmit;
	public WebElement csm_ApplyToSubmit()
	{
		return csm_ApplyToSubmit;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE")
	private WebElement csm_ApplyToSubmit_CodeSearchField;
	public WebElement csm_ApplyToSubmit_CodeSearchField()
	{
		return csm_ApplyToSubmit_CodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE")
	private WebElement csm_ApplyToSubmit_FirstRecord;
	public WebElement csm_ApplyToSubmit_FirstRecord()
	{
		return csm_ApplyToSubmit_FirstRecord;
	}
	@FindBy(id="chequeBook_applySubmit_Q000TR")
	private WebElement csm_ApplySubmitButton;
	public WebElement csm_ApplySubmitButton()
	{
		return csm_ApplySubmitButton;
	}
	@FindBy(id="Q000SB")
	private WebElement csm_Submit;
	public WebElement csm_Submit()
	{
		return csm_Submit;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement csm_Submit_CodeSearchField;
	public WebElement csm_Submit_CodeSearchField()
	{
		return csm_Submit_CodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
	private WebElement csm_Submit_FirstRecord;
	public WebElement csm_Submit_FirstRecord()
	{
		return csm_Submit_FirstRecord;
	}
	@FindBy(id="chequeBook_submit_Q000SB")
	private WebElement csm_SubmitButton;
	public WebElement csm_SubmitButton()
	{
		return csm_SubmitButton;
	}
	@FindBy(xpath="//td[text()='Submitted']")
	private WebElement csm_SubmittedText;
	public WebElement csm_SubmittedText()
	{
		return csm_SubmittedText;
	}
	@FindBy(id="Q000TC")
	private WebElement csm_ToCancelSection;
	public WebElement csm_ToCancelSection()
	{
		return csm_ToCancelSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement csm_ToCancelCodeSearchField;
	public WebElement csm_ToCancelCodeSearchField()
	{
		return csm_ToCancelCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
	private WebElement csm_ToCancelFirstRecord;
	public WebElement csm_ToCancelFirstRecord()
	{
		return csm_ToCancelFirstRecord;
	}
	@FindBy(id="spanLookup_chq_cancel_reason_Q000TC")
	private WebElement csm_ToCancelCancelReasonIcon;
	public WebElement csm_ToCancelCancelReasonIcon()
	{
		return csm_ToCancelCancelReasonIcon;
	}
	@FindBy(id="td_gridtab_chq_cancel_reason_Q000TC_1_BRIEF_NAME_ENG")
	private WebElement csm_ToCancelCancelReasonText;
	public WebElement csm_ToCancelCancelReasonText()
	{
		return csm_ToCancelCancelReasonText;
	}
	@FindBy(id="chequeBookDefFormId_Q000TC_toCancel_key")
	private WebElement csm_ToCancelToCancelButton;
	public WebElement csm_ToCancelToCancelButton()
	{
		return csm_ToCancelToCancelButton;
	}
	@FindBy(id="Q000AC")
	private WebElement csm_ApproveCancelSection;
	public WebElement csm_ApproveCancelSection()
	{
		return csm_ApproveCancelSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement csm_ApproveCancelCodeSearchField;
	public WebElement csm_ApproveCancelCodeSearchField()
	{
		return csm_ApproveCancelCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000AC_1_ctschqbookVO.CODE")
	private WebElement csm_ApproveCancelFirstRecord;
	public WebElement csm_ApproveCancelFirstRecord()
	{
		return csm_ApproveCancelFirstRecord;
	}
	@FindBy(id="chequeBook_cancel_Q000AC")
	private WebElement csm_ApproveCancelCancelButton;
	public WebElement csm_ApproveCancelCancelButton()
	{
		return csm_ApproveCancelCancelButton;
	}
	@FindBy(xpath="//td[text()='Cancelled']")
	private WebElement csm_CancelledText;
	public WebElement csm_CancelledText()
	{
		return csm_CancelledText;
	}
	@FindBy(id="Q000TD")
	private WebElement csm_ToBeDestroyedSection;
	public WebElement csm_ToBeDestroyedSection()
	{
		return csm_ToBeDestroyedSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE")
	private WebElement csm_ToBeDestroyedCodeSearchField;
	public WebElement csm_ToBeDestroyedCodeSearchField()
	{
		return csm_ToBeDestroyedCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000TD_1_ctschqbookVO.CODE")
	private WebElement csm_ToBeDestroyedFirstRecord;
	public WebElement csm_ToBeDestroyedFirstRecord()
	{
		return csm_ToBeDestroyedFirstRecord;
	}
	@FindBy(id="status_remarks_Q000TD")
	private WebElement csm_ToBeDestroyedRemarksField;
	public WebElement csm_ToBeDestroyedRemarksField()
	{
		return csm_ToBeDestroyedRemarksField;
	}
	@FindBy(id="chequeBook_toDestroy_Q000TD")
	private WebElement csm_ToBeDestroyedToDestroyButton;
	public WebElement csm_ToBeDestroyedToDestroyButton()
	{
		return csm_ToBeDestroyedToDestroyButton;
	}
	@FindBy(id="Q000AD")
	private WebElement csm_ApproveDestroyedSection;
	public WebElement csm_ApproveDestroyedSection()
	{
		return csm_ApproveDestroyedSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE")
	private WebElement csm_ApproveDestroyedCodeSearchField;
	public WebElement csm_ApproveDestroyedCodeSearchField()
	{
		return csm_ApproveDestroyedCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000AD_1_ctschqbookVO.CODE")
	private WebElement csm_ApproveDestroyedFirstRecord;
	public WebElement csm_ApproveDestroyedFirstRecord()
	{
		return csm_ApproveDestroyedFirstRecord;
	}
	@FindBy(id="chequeBook_destroy_Q000AD")
	private WebElement csm_ApproveDestroyedDestroyButton;
	public WebElement csm_ApproveDestroyedDestroyButton()
	{
		return csm_ApproveDestroyedDestroyButton;
	}
	@FindBy(xpath="//td[text()='Destroyed']")
	private WebElement csm_DestroyedText;
	public WebElement csm_DestroyedText()
	{
		return csm_DestroyedText;
	}
	@FindBy(id="Q000TS")
	private WebElement csm_ToSuspendSection;
	public WebElement csm_ToSuspendSection()
	{
		return csm_ToSuspendSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TS_gs_ctschqbookVO.CODE")
	private WebElement csm_ToSuspendSectionCodeSearchField;
	public WebElement csm_ToSuspendSectionCodeSearchField()
	{
		return csm_ToSuspendSectionCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000TS_1_ctschqbookVO.CODE")
	private WebElement csm_ToSuspendFirstRecord;
	public WebElement csm_ToSuspendFirstRecord()
	{
		return csm_ToSuspendFirstRecord;
	}
	@FindBy(id="chequeBook_toSuspend_Q000TS")
	private WebElement csm_ToSuspendToSuspendButton;
	public WebElement csm_ToSuspendToSuspendButton()
	{
		return csm_ToSuspendToSuspendButton;
	}
	@FindBy(id="Q000SP")
	private WebElement csm_SuspendSection;
	public WebElement csm_SuspendSection()
	{
		return csm_SuspendSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000SP_gs_ctschqbookVO.CODE")
	private WebElement csm_SuspendCodeSearchField;
	public WebElement csm_SuspendCodeSearchField()
	{
		return csm_SuspendCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000SP_1_ctschqbookVO.CODE")
	private WebElement csm_SuspendFirstRecord;
	public WebElement csm_SuspendFirstRecord()
	{
		return csm_SuspendFirstRecord;
	}
	@FindBy(id="chequeBook_suspend_Q000SP")
	private WebElement csm_SuspendSuspendButton;
	public WebElement csm_SuspendSuspendButton()
	{
		return csm_SuspendSuspendButton;
	}
	@FindBy(xpath="//td[text()='Suspended']")
	private WebElement csm_SuspendedText;
	public WebElement csm_SuspendedText()
	{
		return csm_SuspendedText;
	}
	@FindBy(id="chequeBookrequestInfo")
	private WebElement csm_RequestInformation;
	public WebElement csm_RequestInformation()
	{
		return csm_RequestInformation;
	}
	@FindBy(name="chequeBookCO.ctschqbookVO.COLLECTED_BY")
	private WebElement csm_Submit_RequestInformation_CollectedByField;
	public WebElement csm_Submit_RequestInformation_CollectedByField()
	{
		return csm_Submit_RequestInformation_CollectedByField;
	}
	@FindBy(id="lookuptxt_collected_by_id_Q000TR")
	private WebElement csm_ApplyToSubmit_RequestInformation_CollectedByIDField;
	public WebElement csm_ApplyToSubmit_RequestInformation_CollectedByIDField()
	{
		return csm_ApplyToSubmit_RequestInformation_CollectedByIDField;
	}
	@FindBy(id="collected_by_Q000TR")
	private WebElement csm_ApplyToSubmit_RequestInformation_CollectedByField;
	public WebElement csm_ApplyToSubmit_RequestInformation_CollectedByField()
	{
		return csm_ApplyToSubmit_RequestInformation_CollectedByField;
	}
	@FindBy(id="Q000QR")
	private WebElement csm_ChequebookQuerySection;
	public WebElement csm_ChequebookQuerySection()
	{
		return csm_ChequebookQuerySection;
	}
	@FindBy(id="status_br_Q000QR")
	private WebElement csm_ChequebookQuery_BranchCode;
	public WebElement csm_ChequebookQuery_BranchCode()
	{
		return csm_ChequebookQuery_BranchCode;
	}
	@FindBy(id="status_cy_Q000QR")
	private WebElement csm_ChequebookQuery_CurrencyCode;
	public WebElement csm_ChequebookQuery_CurrencyCode()
	{
		return csm_ChequebookQuery_CurrencyCode;
	}
	@FindBy(id="status_gl_Q000QR")
	private WebElement csm_ChequebookQuery_GLCode;
	public WebElement csm_ChequebookQuery_GLCode()
	{
		return csm_ChequebookQuery_GLCode;
	}
	@FindBy(id="status_cif_Q000QR")
	private WebElement csm_ChequebookQuery_CIFCode;
	public WebElement csm_ChequebookQuery_CIFCode()
	{
		return csm_ChequebookQuery_CIFCode;
	}
	@FindBy(id="lookuptxt_status_sl_Q000QR")
	private WebElement csm_ChequebookQuery_Serial;
	public WebElement csm_ChequebookQuery_Serial()
	{
		return csm_ChequebookQuery_Serial;
	}
	@FindBy(id="Chequebook Request / Chequebook Query")
	private WebElement csm_ChequebookQueryHeader;
	public WebElement csm_ChequebookQueryHeader()
	{
		return csm_ChequebookQueryHeader;
	}
	@FindBy(id="chequeBookQueryTbl_Id_Q000QR_gs_STATUS")
	private WebElement csm_ChequebookQueryStatusField;
	public WebElement csm_ChequebookQueryStatusField()
	{
		return csm_ChequebookQueryStatusField;
	}
	@FindBy(xpath="//td[text()='Active']")
	private WebElement csm_ChequebookQueryStatus_ActiveText;
	public WebElement csm_ChequebookQueryStatus_ActiveText()
	{
		return csm_ChequebookQueryStatus_ActiveText;
	}
	@FindBy(xpath="//td[text()='Approved']")
	private WebElement csm_ChequebookQueryStatus_ApprovedText;
	public WebElement csm_ChequebookQueryStatus_ApprovedText()
	{
		return csm_ChequebookQueryStatus_ApprovedText;
	}
	@FindBy(xpath="//td[text()='Sent To Provider']")
	private WebElement csm_ChequebookQueryStatus_SentToProviderText;
	public WebElement csm_ChequebookQueryStatus_SentToProviderText()
	{
		return csm_ChequebookQueryStatus_SentToProviderText;
	}
	@FindBy(xpath="//td[text()='Received From Provider']")
	private WebElement csm_ChequebookQueryStatus_ReceivedFromProviderText;
	public WebElement csm_ChequebookQueryStatus_ReceivedFromProviderText()
	{
		return csm_ChequebookQueryStatus_ReceivedFromProviderText;
	}
	@FindBy(xpath="//td[text()='In Branch']")
	private WebElement csm_ChequebookQueryStatus_InBranchText;
	public WebElement csm_ChequebookQueryStatus_InBranchText()
	{
		return csm_ChequebookQueryStatus_InBranchText;
	}
	@FindBy(xpath="//td[text()='Send To Branch']")
	private WebElement csm_ChequebookQueryStatus_SendToBranchText;
	public WebElement csm_ChequebookQueryStatus_SendToBranchText()
	{
		return csm_ChequebookQueryStatus_SendToBranchText;
	}
	@FindBy(xpath="//td[text()='Apply To Submit']")
	private WebElement csm_ChequebookQueryStatus_ApplyToSubmitText;
	public WebElement csm_ChequebookQueryStatus_ApplyToSubmitText()
	{
		return csm_ChequebookQueryStatus_ApplyToSubmitText;
	}
	@FindBy(xpath="//td[text()='Submitted']")
	private WebElement csm_ChequebookQueryStatus_SubmittedText;
	public WebElement csm_ChequebookQueryStatus_SubmittedText()
	{
		return csm_ChequebookQueryStatus_SubmittedText;
	}
	@FindBy(xpath="//td[text()='To Cancel']")
	private WebElement csm_ChequebookQueryStatus_ToCancelText;
	public WebElement csm_ChequebookQueryStatus_ToCancelText()
	{
		return csm_ChequebookQueryStatus_ToCancelText;
	}
	@FindBy(xpath="//td[text()='Cancelled']")
	private WebElement csm_ChequebookQueryStatus_CancelledText;
	public WebElement csm_ChequebookQueryStatus_CancelledText()
	{
		return csm_ChequebookQueryStatus_CancelledText;
	}
	@FindBy(xpath="//td[text()='To Destroy']")
	private WebElement csm_ChequebookQueryStatus_ToDestroyText;
	public WebElement csm_ChequebookQueryStatus_ToDestroyText()
	{
		return csm_ChequebookQueryStatus_ToDestroyText;
	}
	@FindBy(xpath="//td[text()='Destroyed']")
	private WebElement csm_ChequebookQueryStatus_DestroyedText;
	public WebElement csm_ChequebookQueryStatus_DestroyedText()
	{
		return csm_ChequebookQueryStatus_DestroyedText;
	}
	@FindBy(xpath="//td[text()='To Suspend']")
	private WebElement csm_ChequebookQueryStatus_ToSuspendText;
	public WebElement csm_ChequebookQueryStatus_ToSuspendText()
	{
		return csm_ChequebookQueryStatus_ToSuspendText;
	}
	@FindBy(xpath="//td[text()='Suspended']")
	private WebElement csm_ChequebookQueryStatus_SuspendedText;
	public WebElement csm_ChequebookQueryStatus_SuspendedText()
	{
		return csm_ChequebookQueryStatus_SuspendedText;
	}
	@FindBy(xpath="//td[text()='To Reverse']")
	private WebElement csm_ChequebookQueryStatus_ToReverseText;
	public WebElement csm_ChequebookQueryStatus_ToReverseText()
	{
		return csm_ChequebookQueryStatus_ToReverseText;
	}
	@FindBy(xpath="//td[text()='Reversed']")
	private WebElement csm_ChequebookQueryStatus_ReversedText;
	public WebElement csm_ChequebookQueryStatus_ReversedText()
	{
		return csm_ChequebookQueryStatus_ReversedText;
	}
	@FindBy(xpath="//td[text()='To Reverse Cancellation']")
	private WebElement csm_ChequebookQueryStatus_ToReverseCancellationText;
	public WebElement csm_ChequebookQueryStatus_ToReverseCancellationText()
	{
		return csm_ChequebookQueryStatus_ToReverseCancellationText;
	}
	@FindBy(xpath="//td[text()='To Reactivate']")
	private WebElement csm_ChequebookQueryStatus_ToReactivateText;
	public WebElement csm_ChequebookQueryStatus_ToReactivateText()
	{
		return csm_ChequebookQueryStatus_ToReactivateText;
	}
	@FindBy(id="Q000L")
	private WebElement csm_ChequebookRequest_ListSection;
	public WebElement csm_ChequebookRequest_ListSection()
	{
		return csm_ChequebookRequest_ListSection;
	}
	@FindBy(id="p_param_RA_BRANCH_NUMBER_Q000L")
	private WebElement csm_ChequebookList_BranchCode;
	public WebElement csm_ChequebookList_BranchCode()
	{
		return csm_ChequebookList_BranchCode;
	}
	@FindBy(id="p_param_RA_CIF1_NUMBER_Q000L")
	private WebElement csm_ChequebookList_FromCIF;
	public WebElement csm_ChequebookList_FromCIF()
	{
		return csm_ChequebookList_FromCIF;
	}
	@FindBy(id="p_param_RA_CIF2_NUMBER_Q000L")
	private WebElement csm_ChequebookList_ToCIF;
	public WebElement csm_ChequebookList_ToCIF()
	{
		return csm_ChequebookList_ToCIF;
	}
	@FindBy(id="p_param_RA_STATUS_VARCHAR2_Q000L")
	private WebElement csm_ChequebookList_Status;
	public WebElement csm_ChequebookList_Status()
	{
		return csm_ChequebookList_Status;
	}
	@FindBy(id="retrieveBtn_Q000L")
	private WebElement csm_ChequebookList_RetrieveButton;
	public WebElement csm_ChequebookList_RetrieveButton()
	{
		return csm_ChequebookList_RetrieveButton;
	}
	@FindBy(id="paramsDivCollapsible_Q000L")
	private WebElement csm_ChequebookList_Parameters;
	public WebElement csm_ChequebookList_Parameters()
	{
		return csm_ChequebookList_Parameters;
	}
	@FindBy(xpath="//span[text()='Submitted']")
	private WebElement csm_ChequebookList_SubmittedText;
	public WebElement csm_ChequebookList_SubmittedText()
	{
		return csm_ChequebookList_SubmittedText;
	}
	@FindBy(xpath="//span[text()='Active']")
	private WebElement csm_ChequebookList_ActiveText;
	public WebElement csm_ChequebookList_ActiveText()
	{
		return csm_ChequebookList_ActiveText;
	}
	@FindBy(xpath="//span[text()='Approved']")
	private WebElement csm_ChequebookList_ApprovedText;
	public WebElement csm_ChequebookList_ApprovedText()
	{
		return csm_ChequebookList_ApprovedText;
	}
	@FindBy(xpath="//span[text()='Sent To Provider']")
	private WebElement csm_ChequebookList_SentToProviderText;
	public WebElement csm_ChequebookList_SentToProviderText()
	{
		return csm_ChequebookList_SentToProviderText;
	}
	@FindBy(xpath="//span[text()='Received From Provider']")
	private WebElement csm_ChequebookList_ReceivedFromProviderText;
	public WebElement csm_ChequebookList_ReceivedFromProviderText()
	{
		return csm_ChequebookList_ReceivedFromProviderText;
	}
	@FindBy(xpath="//span[text()='In Branch']")
	private WebElement csm_ChequebookList_InBranchText;
	public WebElement csm_ChequebookList_InBranchText()
	{
		return csm_ChequebookList_InBranchText;
	}
	@FindBy(xpath="//span[text()='Send To Branch']")
	private WebElement csm_ChequebookList_SendToBranchText;
	public WebElement csm_ChequebookList_SendToBranchText()
	{
		return csm_ChequebookList_SendToBranchText;
	}
	@FindBy(xpath="//span[text()='Apply To Submit']")
	private WebElement csm_ChequebookList_ApplyToSubmitText;
	public WebElement csm_ChequebookList_ApplyToSubmitText()
	{
		return csm_ChequebookList_ApplyToSubmitText;
	}
	@FindBy(xpath="//span[text()='To Cancel']")
	private WebElement csm_ChequebookList_ToCancelText;
	public WebElement csm_ChequebookList_ToCancelText()
	{
		return csm_ChequebookList_ToCancelText;
	}
	@FindBy(xpath="//span[text()='Cancelled']")
	private WebElement csm_ChequebookList_CancelledText;
	public WebElement csm_ChequebookList_CancelledText()
	{
		return csm_ChequebookList_CancelledText;
	}
	@FindBy(xpath="//span[text()='To Destroy']")
	private WebElement csm_ChequebookList_ToDestroyText;
	public WebElement csm_ChequebookList_ToDestroyText()
	{
		return csm_ChequebookList_ToDestroyText;
	}
	@FindBy(xpath="//span[text()='Destroyed']")
	private WebElement csm_ChequebookList_DestroyedText;
	public WebElement csm_ChequebookList_DestroyedText()
	{
		return csm_ChequebookList_DestroyedText;
	}
	@FindBy(xpath="//span[text()='To Suspend']")
	private WebElement csm_ChequebookList_ToSuspendText;
	public WebElement csm_ChequebookList_ToSuspendText()
	{
		return csm_ChequebookList_ToSuspendText;
	}
	@FindBy(xpath="//span[text()='Suspended']")
	private WebElement csm_ChequebookList_SuspendedText;
	public WebElement csm_ChequebookList_SuspendedText()
	{
		return csm_ChequebookList_SuspendedText;
	}
	@FindBy(xpath="//span[text()='To Reverse']")
	private WebElement csm_ChequebookList_ToReverseText;
	public WebElement csm_ChequebookList_ToReverseText()
	{
		return csm_ChequebookList_ToReverseText;
	}
	@FindBy(xpath="//span[text()='Reversed']")
	private WebElement csm_ChequebookList_ReversedText;
	public WebElement csm_ChequebookList_ReversedText()
	{
		return csm_ChequebookList_ReversedText;
	}
	@FindBy(xpath="//span[text()='To Reverse Cancellation']")
	private WebElement csm_ChequebookList_ToReverseCancellationText;
	public WebElement csm_ChequebookList_ToReverseCancellationText()
	{
		return csm_ChequebookList_ToReverseCancellationText;
	}
	@FindBy(xpath="//span[text()='To Reactivate']")
	private WebElement csm_ChequebookList_ToReactivateText;
	public WebElement csm_ChequebookList_ToReactivateText()
	{
		return csm_ChequebookList_ToReactivateText;
	}
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement csm_Submit_MissingReasonCodeText;
	public WebElement csm_Submit_MissingReasonCodeText()
	{
		return csm_Submit_MissingReasonCodeText;
	}
	@FindBy(id="chequeBook_reject_Q000SB")
	private WebElement csm_Submit_RejectButton;
	public WebElement csm_Submit_RejectButton()
	{
		return csm_Submit_RejectButton;
	}
	@FindBy(id="chequeBook_reject_Q000AD")
	private WebElement csm_ApproveDestroyed_RejectButton;
	public WebElement csm_ApproveDestroyed_RejectButton()
	{
		return csm_ApproveDestroyed_RejectButton;
	}
	@FindBy(id="Q000AP")
	private WebElement csm_ChequebookRequest_ApproveSection;
	public WebElement csm_ChequebookRequest_ApproveSection()
	{
		return csm_ChequebookRequest_ApproveSection;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
	private WebElement csm_ChequebookRequest_ApproveCodeSearchField;
	public WebElement csm_ChequebookRequest_ApproveCodeSearchField()
	{
		return csm_ChequebookRequest_ApproveCodeSearchField;
	}
	@FindBy(id="td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CODE")
	private WebElement csm_ChequebookRequest_Approve_FirstRecord;
	public WebElement csm_ChequebookRequest_Approve_FirstRecord()
	{
		return csm_ChequebookRequest_Approve_FirstRecord;
	}
	@FindBy(id="chequeBook_reject_Q000AP")
	private WebElement csm_ChequebookRequest_Approve_RejectButton;
	public WebElement csm_ChequebookRequest_Approve_RejectButton()
	{
		return csm_ChequebookRequest_Approve_RejectButton;
	}
	
}
