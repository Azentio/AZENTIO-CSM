package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj_Tocancel {
	WebDriver driver;
	public ChequeBookRequestObj_Tocancel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//CHB_117&118//
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;
	public WebElement csmChequeBookRequestModule()
	{
		return csm_chequeBookRequestModule;
	}
	@FindBy(xpath="//span[text()='To Cancel']")
	private WebElement csm_chequeBookRequestToCancel;
	public WebElement csm_ChequeBookRequest_ToCancel()
	{
		return csm_chequeBookRequestToCancel;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequestCodeSearch;
	public WebElement csm_ChequeBookRequest_CodeSearch()
	{
		return csm_chequeBookRequestCodeSearch;
	}
	
	@FindBy(xpath="//td[@id='td_chequeBookGridTbl_Id_Q000TC_3_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequestCodeSearchDoubleClick;
	public WebElement csm_chequeBookRequestCodeSearchDoubleClick()
	{
		return csm_chequeBookRequestCodeSearchDoubleClick;
	}
	
	@FindBy(xpath="//label[@id='chequeBookDefFormId_Q000TC_toCancel_key']")
	private WebElement csm_chequeBookRequestCodeSearchCancelKeyFinal;
	public WebElement csm_ChequeBookRequest_CodeSearch_CancelKeyFinal()
	{
		return csm_chequeBookRequestCodeSearchCancelKeyFinal;
	}
	@FindBy(xpath="//td[text()='CHRISAG']")
	private WebElement csm_chequeBookRequestAlertClickChrisag;
	public WebElement csm_ChequeBookRequest_AlertClickChrisag()
	{
		return csm_chequeBookRequestAlertClickChrisag;
	}
	@FindBy(xpath="//span[text()=' Approve ']")
	private WebElement csm_chequeBookRequestAlertApprove;
	public WebElement csm_ChequeBookRequest_Alert_Approve()
	{
		return csm_chequeBookRequestAlertApprove;
	}
	@FindBy(xpath="//input[@id='usr_name_alert_Q000TC']")
	private WebElement csm_chequeBookRequestUserInfoUserName;
	public WebElement csm_ChequeBookRequest_UserInfo_UserName()
	{
		return csm_chequeBookRequestUserInfoUserName;
	}
	
	@FindBy(xpath="//input[@id='pwd_alert_Q000TC']")
	private WebElement csm_chequeBookRequestUserInfoPassword;
	public WebElement csm_ChequeBookRequest_UserInfo_Password()
	{
		return csm_chequeBookRequestUserInfoPassword;
	}
	@FindBy(xpath="//button[@id='sendButtonForApprove_Q000TC']")
	private WebElement csm_chequeBookRequestUserInfoSubmit;
	public WebElement csm_ChequeBookRequest_UserInfo_Submit()
	{
		return csm_chequeBookRequestUserInfoSubmit;
	}
	@FindBy(id="lookuptxt_chq_cancel_reason_Q000TC")
	private WebElement csm_chequeBookRequestCancelReason;
	public WebElement  csm_chequeBookRequestCancelReason()
	{
		return csm_chequeBookRequestUserInfoSubmit;
	}
	@FindBy(xpath="//span[text()=' Approve ']")
	private WebElement csm_chequeBookRequestApprove;
	public WebElement  csm_chequeBookRequestApprove()
	{
		return csm_chequeBookRequestApprove;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequestCode;
	public WebElement  csm_chequeBookRequestCode()
	{
		return csm_chequeBookRequestCode;
	}
	@FindBy(xpath="//label[text()='Approve ']")
	private WebElement csm_chequeBookRequestApproveButton;
	public WebElement  csm_chequeBookRequestApproveButton()
	{
		return csm_chequeBookRequestApproveButton;
	}
	
	//CHB_149//
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement MaintenanceButton;
	public WebElement MaintenanceButton()
	{
		
    return MaintenanceButton;
	}
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
	public WebElement approvedRecordValidationInCBMaintenance() 
	{
	return approvedRecordValidationInCBMaintenance;
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



		
	//CHB_150//(Reject Destroy)
	
	
	@FindBy(xpath="//a[@id='Q000BTD']")
	private WebElement csm_chequeBookRequest_BulkDestroy;
	public WebElement csm_chequeBookRequest_BulkDestroy()
	{
		return csm_chequeBookRequest_BulkDestroy;
	}
	@FindBy(xpath="//button[@id='chequeBookBulkDestory_retrieve_Q000BAD']")
	private WebElement csm_chequeBookRequest_Retrive_btnn;
	public WebElement csm_chequeBookRequest_Retrive_btnn()
	{
		return csm_chequeBookRequest_Retrive_btnn;
	}
	@FindBy(xpath="//div[@id='jqgh_chequeBookBulkDestroyGridTbl_Id_Q000BTD_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_CodeSearching;
	public WebElement csm_chequeBookRequest_CodeSearching()
	{
		return csm_chequeBookRequest_CodeSearching;
	}
	@FindBy(xpath="//td[@id=td_chequeBookBulkDestroyGridTbl_Id_Q000BTD_2_ctschqbookVO.CODE")
	private WebElement csm_chequeBookRequest_SelectData;
	public WebElement csm_chequeBookRequest_SelectData()
	{
		return csm_chequeBookRequest_SelectData;
	}
	@FindBy(xpath="//textarea[@id='status_remarks_bulk_destroy_Q000BTD']")
	private WebElement csm_chequeBookRequest_Remarks;
	public WebElement csm_chequeBookRequest_Remarks()
	{
		return csm_chequeBookRequest_Remarks;
	}
	@FindBy(xpath="//label[@id='chequeBookBulkDestoryFormId_Q000BTD_to_destroy_key']")
	private WebElement csm_chequeBookRequest_ToDestry;
	public WebElement csm_chequeBookRequest_ToDestry()
	{
		return csm_chequeBookRequest_ToDestry;
	}
	@FindBy(xpath="//span[text()='Approve / Reject Bulk Destroy']")
	private WebElement csm_chequeBookRequest_ApproveRejectBulkDestroy;
	public WebElement csm_chequeBookRequest_ApproveRejectBulkDestroy()
	{
		return csm_chequeBookRequest_ApproveRejectBulkDestroy;
	}
	@FindBy(xpath="//button[@id='chequeBookBulkDestory_retrieve_Q000BAD']")
	private WebElement csm_chequeBookRequest_Retrivebtn;
	public WebElement csm_chequeBookRequest_Retrivebtn()
	{
		return csm_chequeBookRequest_Retrivebtn;
	}
	@FindBy(xpath="//td[@id='td_chequeBookBulkDestroyGridTbl_Id_Q000BAD_1_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_SameData;
	public WebElement csm_chequeBookRequest_SameData()
	{
		return csm_chequeBookRequest_SameData;
	}	
	
	//CHB_151//(Approve)
	
	@FindBy(xpath="//td[@id='search_chequeBookBulkDestroyGridTbl_Id_Q000BTD']/div/span")
	private WebElement csm_chequeBookRequest_Searchbtn;
	public WebElement csm_chequeBookRequest_Searchbtn()
	{
		return csm_chequeBookRequest_Searchbtn;			

}	
	@FindBy(xpath="//input[@id='jqg2']")
	private WebElement csm_chequeBookRequest_Searchbox;
	public WebElement csm_chequeBookRequest_Searchbox()
	{
		return csm_chequeBookRequest_Searchbox;		

}	
	@FindBy(xpath="//a[@id='fbox_chequeBookBulkDestroyGridTbl_Id_Q000BTD_search']")
	private WebElement csm_chequeBookRequest_Findbtn;
	public WebElement csm_chequeBookRequest_Findbtn()
	{
		return csm_chequeBookRequest_Findbtn;		

}	
	@FindBy(xpath="//span[text()='To Be Destroyed']")
	private WebElement csm_chequeBookRequest_Tobedestroy;
	public WebElement csm_chequeBookRequest_Tobedestroy() 
	{	
		return csm_chequeBookRequest_Tobedestroy;		
}	
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_Codebox;
	public WebElement csm_chequeBookRequest_Codebox() 
	{	
		return csm_chequeBookRequest_Codebox;		
}	
	
	
	//CHB_152//
	
	
	@FindBy(xpath="//label[@id='chequeBookBulkDestoryFormId_Q000BTD_retrieve_key']")
	private WebElement csm_chequeBookRequest_Retrive_Btn;
	public WebElement csm_chequeBookRequest_Retrive_Btn()
	{
		return csm_chequeBookRequest_Retrive_Btn;	
}	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_Codevalue;
	public WebElement csm_chequeBookRequest_Codevalue()
	{
		return csm_chequeBookRequest_Codevalue;	
}	
	
	
	@FindBy(xpath="//td[@id='td_chequeBookBulkDestroyGridTbl_Id_Q000BTD_3_ctschqbookVO.CODE']")
	private WebElement csm_chequeBookRequest_InBranch_data;
	public WebElement csm_chequeBookRequest_InBranch_data()
	{
		return csm_chequeBookRequest_InBranch_data;	
}
	
}
