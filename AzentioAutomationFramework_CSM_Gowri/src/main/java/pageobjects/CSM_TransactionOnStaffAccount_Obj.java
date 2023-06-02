package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransactionOnStaffAccount_Obj {
WebDriver driver;
    
    public CSM_TransactionOnStaffAccount_Obj(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//td[text()='Parameters']")
private WebElement parametersMenu;
public WebElement parametersMenu()
{
	return parametersMenu;
}
@FindBy(xpath = "//td[text()='System Parameters']")
private WebElement systemParametersSubmenu;
public WebElement systemParametersSubmenu()
{
	return systemParametersSubmenu;
}
@FindBy(xpath = "//td[text()='User']")
private WebElement userSubMenu;
public WebElement userSubMenu()
{
	return userSubMenu;
}
@FindBy(xpath = "//td[text()='Populate User']")
private WebElement populateUserSubMenu;
public WebElement populateUserSubMenu()
{
	return populateUserSubMenu;
}
@FindBy(xpath = "(//span[text()='Maintenance'])[2]")
private WebElement maintenanceInPopulateUserSubMenu;
public WebElement maintenanceInPopulateUserSubMenu()
{
	return maintenanceInPopulateUserSubMenu;
}
@FindBy(xpath = "//label[@id='lbl_userFormId_0_E000POMT']//parent::td//following-sibling::td[1]//input")
private WebElement codeInMaintenanceSubMenu;
public WebElement codeInMaintenanceSubMenu()
{
	return codeInMaintenanceSubMenu;
}
@FindBy(xpath = "//label[@id='lbl_userFormId_3_E000POMT']//parent::td//following-sibling::td/input")
private WebElement briefDescriptionInMaintenanceSubMenu;
public WebElement briefDescriptionInMaintenanceSubMenu()
{
	return briefDescriptionInMaintenanceSubMenu;
}
@FindBy(xpath = "//label[@id='lbl_userFormId_4_E000POMT']//parent::td//following-sibling::td/input")
private WebElement longDescriptionInMaintenanceSubMenu;
public WebElement longDescriptionInMaintenanceSubMenu()
{
	return longDescriptionInMaintenanceSubMenu;
}
@FindBy(xpath = "//input[@name='populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ARAB']")
private WebElement briefDescriptionInArabic;
public WebElement briefDescriptionInArabic()
{
	return briefDescriptionInArabic;
}
@FindBy(xpath = "//input[@name='populatetellerCO.ctstellerPopulateVO.LONG_NAME_ARAB']")
private WebElement longDescriptionInArabic;
public WebElement longDescriptionInArabic()
{
	return longDescriptionInArabic;
}
@FindBy(xpath = "//input[@id='lookuptxt_teller_code_E000POMT']")
private WebElement userCodeInMaintenanceSubMenu;
public WebElement userCodeInMaintenanceSubMenu()
{
	return userCodeInMaintenanceSubMenu;
}
@FindBy(xpath = "//td[@id='add_tab2_GridTbl_Id_E000POMT']")
private WebElement addIconInMaintenanceSubMenu;
public WebElement addIconInMaintenanceSubMenu()
{
	return addIconInMaintenanceSubMenu;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstellerPopulateBranchesVO.DESTINATION_BRANCH_CODE']")
private WebElement branchCodeField;
public WebElement branchCodeField()
{
	return branchCodeField;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstellerPopulateBranchesVO.TMPL_CODE']")
private WebElement newUserTemplateField;
public WebElement newUserTemplateField()
{
	return newUserTemplateField;
}
@FindBy(xpath = "//label[@id='populateTellerMaint_FormId_E000POMT_Save_key']")
private WebElement saveButtonInPopulateSubMenu;
public WebElement saveButtonInPopulateSubMenu()
{
	return saveButtonInPopulateSubMenu;
}
@FindBy(xpath = "//div[text()='Confirm Save Process']")
private WebElement confirmMessagePopup;
public WebElement confirmMessagePopup()
{
	return confirmMessagePopup;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
private WebElement confirmOkButton;
public WebElement confirmOkButton()
{
	return confirmOkButton;
}
@FindBy(id = "_popup_path_sol_ok")
private WebElement successOkButton;
public WebElement successOkButton()
{
	return successOkButton;
}
@FindBy(id = "E000POP")
private WebElement approveScreenInPopulateUser;
public WebElement approveScreenInPopulateUser()
{
	return approveScreenInPopulateUser;
}
@FindBy(id = "populateTellerList_GridTbl_Id_E000POP_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE")
private WebElement chequeCodeInApproveScreen;
public WebElement chequeCodeInApproveScreen()
{
	return chequeCodeInApproveScreen;
}
@FindBy(id= "td_populateTellerList_GridTbl_Id_E000POP_1_ctstellerPopulateVO.TELLER_POPULATION_CODE")
private WebElement retrieveRecordInApproveScreen;
public WebElement retrieveRecordInApproveScreen()
{
	return retrieveRecordInApproveScreen;
}

@FindBy(id= "populateTellerMaint_FormId_E000POP_Approve_key")
private WebElement approveButton;
public WebElement approveButton()
{
	return approveButton;
}
@FindBy(xpath = "//span[text()='Populate']")
private WebElement populateScreenInPopulateUser;
public WebElement populateScreenInPopulateUser()
{
	return populateScreenInPopulateUser;
}
@FindBy(id = "populateTellerList_GridTbl_Id_E000POPO_gs_ctstellerPopulateVO.TELLER_POPULATION_CODE")
private WebElement chequeCodeInPopulateScreen;
public WebElement chequeCodeInPopulateScreen()
{
	return chequeCodeInPopulateScreen;
}
@FindBy(id = "td_populateTellerList_GridTbl_Id_E000POPO_1_ctstellerPopulateVO.TELLER_POPULATION_CODE")
private WebElement retrieveRecordInPopulateScreen;
public WebElement retrieveRecordInPopulateScreen()
{
	return retrieveRecordInPopulateScreen;
}
@FindBy(id = "populateTellerMaint_FormId_E000POPO_Populate_key")
private WebElement populateButton;
public WebElement populateButton()
{
	return populateButton;
}
@FindBy(xpath = "//label[text()='Log Out ']")
private WebElement logoutButtonInCsmParamsApplication;
public WebElement logoutButtonInCsmParamsApplication()
{
	return logoutButtonInCsmParamsApplication;
}
@FindBy(xpath = "(//span[@role='button'])[2]")
private WebElement searchIconForBranchField;
public WebElement searchIconForBranchField()
{
	return searchIconForBranchField;
}
@FindBy(id = "//input[@name='BRANCH_CODE']")
private WebElement branchCodeIcon;
public WebElement branchCodeIcon()
{
	return branchCodeIcon;
}
@FindBy(xpath = "(//td[@tdlabel='Branch Code'])[2]")
private WebElement doubleClkTheRecord;
public WebElement doubleClkTheRecord()
{
	return doubleClkTheRecord;
}
@FindBy(id="populateTeller_tab_1_E000POMT")
private WebElement randomClickInDestinationBranches;
public WebElement randomClickInDestinationBranches()
{
	return randomClickInDestinationBranches;
}
//TSA_017
@FindBy(xpath = "susp_usr_log_br_yn_E000POMT")
private WebElement suspendCheckBoxInPopulateUser;
public WebElement suspendCheckBoxInPopulateUser()
{
	return suspendCheckBoxInPopulateUser;
}


//TSA_018
@FindBy(xpath = "//a[@id='E000MT']")
private WebElement maintenanceInUserSubMenu;
public WebElement maintenanceInUserSubMenu()
{
	return maintenanceInUserSubMenu;
}
@FindBy(id = "infoBarSearchButton_E000MT")
private WebElement searchIconInUserSubMenu;
public WebElement searchIconInUserSubMenu()
{
	return searchIconInUserSubMenu;
}

//TSA_019
@FindBy(xpath = "//span[text()=' Accounts ']")
private WebElement accountsDetailsInUserTemplate;
public WebElement accountsDetailsInUserTemplate()
{
	return accountsDetailsInUserTemplate;
}
@FindBy(xpath = "//td[@id='td_tab2_GridTbl_Id_E000MA_1_ctstelleraccdetVO.ACC_BR']")
private WebElement accountBranchInAccountDetails;
public WebElement accountBranchInAccountDetails()
{
	return accountBranchInAccountDetails;
}

//TRS_041
@FindBy(xpath = "//td[text()='Transactions']")
private WebElement csmTransactionsMenu;
public WebElement csmTransactionsMenu()
{
	return csmTransactionsMenu;
}
@FindBy(xpath = "//span[text()='Maintenance']")
private WebElement csmTransactionsMaintenanceSubMenu;
public WebElement csmTransactionsMaintenanceSubMenu()
{
	return csmTransactionsMaintenanceSubMenu;
}
@FindBy(xpath = "//input[@id='lookuptxt_trs_cy_D001MT']")
private WebElement csmTransactionsCurrencyField;
public WebElement csmTransactionsCurrencyField()
{
	return csmTransactionsCurrencyField;
}
@FindBy(xpath = "//input[@id='amount_D001MT']")
private WebElement csmTransactionsAmountField;
public WebElement csmTransactionsAmountField()
{
	return csmTransactionsAmountField;
}
@FindBy(xpath = "//input[@id='value_date_D001MT']")
private WebElement csmTransactionsValueDateField;
public WebElement csmTransactionsValueDateField()
{
	return csmTransactionsValueDateField;
}
@FindBy(xpath = "//span[contains(text(),'Save')]")
private WebElement csmTransactionsSaveField;
public WebElement csmTransactionsSaveField()
{
	return csmTransactionsSaveField;
}
@FindBy(xpath = "//span[text()='Approve']")
private WebElement csmTransactionsApproveScreen;
public WebElement csmTransactionsApproveScreen()
{
	return csmTransactionsApproveScreen;
}
@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
private WebElement csmTransactionsApproveScreenTransactionNumber;
public WebElement csmTransactionsApproveScreenTransactionNumber()
{
	return csmTransactionsApproveScreenTransactionNumber;
}
@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
private WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick;
public WebElement csmTransactionsApproveScreenTransactionNumberDoubleClick()
{
	return csmTransactionsApproveScreenTransactionNumberDoubleClick;
}
@FindBy(xpath = "//span[contains(text(),' Approve ')]")
private WebElement csmTransactionsApproveScreenApproveButton;
public WebElement csmTransactionsApproveScreenApproveButton()
{
	return csmTransactionsApproveScreenApproveButton;
}
@FindBy(id = "infoBarSearchButton_D001MT")
private WebElement csmTransactionsMaintenanceScreenSearchIcon;
public WebElement csmTransactionsMaintenanceScreenSearchIcon()
{
	return csmTransactionsMaintenanceScreenSearchIcon;
}
@FindBy(id = "trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
private WebElement csmTransactionsMaintenanceScreenTransactionNumber;
public WebElement csmTransactionsMaintenanceScreenTransactionNumber()
{
	return csmTransactionsMaintenanceScreenTransactionNumber;
}
@FindBy(id = "td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
private WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;
public WebElement csmTransactionsMaintenanceScreenTransactionNumberDoubleClick()
{
	return csmTransactionsMaintenanceScreenTransactionNumberDoubleClick;
}
@FindBy(id = "trxMgntDefFormId_D001MT_Booked_Entries_key")
private WebElement csmTransactionsMaintenanceScreenBookedEntries;
public WebElement csmTransactionsMaintenanceScreenBookedEntries()
{
	return csmTransactionsMaintenanceScreenBookedEntries;
}
//TRS_042
@FindBy(xpath="//label[text()='TRX Type ']/parent::td/following-sibling::td[1]//input")
private WebElement TransactionsTrxType;
public WebElement TransactionsTrxType()
{
	return TransactionsTrxType;
}
@FindBy(xpath = "//input[@id='trs_ac_br_D001MT']")
private WebElement debitAccountBranchCode;
public WebElement debitAccountBranchCode()
{
	return debitAccountBranchCode;
}
@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
private WebElement debitAccountCurrency;
public WebElement debitAccountCurrency()
{
	return debitAccountCurrency;
}
@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
private WebElement debitAccountGlCode;
public WebElement debitAccountGlCode()
{
	return debitAccountGlCode;
}
@FindBy(xpath = "//input[@id='trs_ac_cif_D001MT']")
private WebElement debitAccountCifCode;
public WebElement debitAccountCifCode()
{
	return debitAccountCifCode;
}
@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
private WebElement debitAccountSerialNo;
public WebElement debitAccountSerialNo()
{
	return debitAccountSerialNo;
}
@FindBy(xpath = "//a[text()='Transactions / Maintenance']")
private WebElement randomClickInTransactions;
public WebElement randomClickInTransactions()
{
	return randomClickInTransactions;
}
@FindBy(xpath = "//input[@id='to_trs_ac_br_D001MT']")
private WebElement creditAccountBranchCode;
public WebElement creditAccountBranchCode()
{
    return creditAccountBranchCode;
}
@FindBy(xpath = "//input[@id='to_trs_ac_cy_D001MT']")
private WebElement creditAccountCurrency;
public WebElement creditAccountCurrency()
{
    return creditAccountCurrency;
}
@FindBy(xpath = "//input[@id='to_trs_ac_gl_D001MT']")
private WebElement creditAccountGlCode;
public WebElement creditAccountGlCode()
{
    return creditAccountGlCode;
}
@FindBy(xpath = "//input[@id='to_trs_ac_cif_D001MT']")
private WebElement creditAccountCifCode;
public WebElement creditAccountCifCode()
{
    return creditAccountCifCode;
}
@FindBy(xpath = "//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
private WebElement creditAccountSerialNo;
public WebElement creditAccountSerialNo()
{
    return creditAccountSerialNo;
}
@FindBy(id="hdr_runn_date")
private WebElement CSM_DateToChangeTheCurrentDate;
public WebElement CSMDateToChangeTheCurrentDate()
{
	return CSM_DateToChangeTheCurrentDate;
}
@FindBy(id="global_user_run_date")
private WebElement CSM_DateInUserRunningDate;
public WebElement CSMDateInUserRunningDate()
{
	return CSM_DateInUserRunningDate;
}
@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
private WebElement CSM_UseButtonInChangeRunningDate;
public WebElement CSMUseButtonInChangeRunningDate() 
{
	return CSM_UseButtonInChangeRunningDate;
}
@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
private WebElement CSM_ClearCacheInTechnicalDetailsIcon;
public WebElement CSM_ClearCacheInTechnicalDetailsIcon() 
{
	return CSM_ClearCacheInTechnicalDetailsIcon;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
private WebElement confirmOkInChangeRunningDate;
public WebElement confirmOkInChangeRunningDate()
{
	return confirmOkInChangeRunningDate;
}
@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInInformationPopUpMenu;
public WebElement CSMOkButtonInInformationPopUpMenu() 
{
	return CSM_OkButtonInInformationPopUpMenu;
}
@FindBy(id="_header_rundate_dialog_close")
private WebElement CSM_CloseButtonInChangeRunningDate;
public WebElement CSMCloseButtonInChangeRunningDate() 
{
	return CSM_CloseButtonInChangeRunningDate;
}
@FindBy(id="tech_details_icon")
private WebElement CSM_TechnicalDetailsIcon;
public WebElement CSMTechnicalDetailsIcon() 
{
	return CSM_TechnicalDetailsIcon;
}
@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonUnderInformationPopUp;
public WebElement CSMOkButtonUnderInformationPopUp() 
{
	return CSM_OkButtonUnderInformationPopUp;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
private WebElement CSMOkButtonInAccessDeniedPopUpMenu;
public WebElement CSMOkButtonInAccessDeniedPopUpMenu()
{
	return CSMOkButtonInAccessDeniedPopUpMenu;
}
@FindBy(xpath = "//div[text()='Cannot Proceed']")
private WebElement csmStopperMessagePopupInTransactions;
public WebElement csmStopperMessagePopupInTransactions()
{
	return csmStopperMessagePopupInTransactions;
}

//TRS_078
@FindBy(xpath = "//button[@id='trxMgntSaveBtn_D001MT']")
private WebElement saveButtonInTransactions;
public WebElement saveButtonInTransactions()
{
	return saveButtonInTransactions;
}
//CSMOkButtonInInformationPopUpMenu
@FindBy(xpath = "//span[text()='close']")
private WebElement closeButtonInAlertPopup;
public WebElement closeButtonInAlertPopup()
{
	return closeButtonInAlertPopup;
}
@FindBy(id = "D001AU")
private WebElement approveScreenInTransactions;
public WebElement approveScreenInTransactions()
{
	return approveScreenInTransactions;
}
@FindBy(xpath = "(//td[text()='Toggle']/following-sibling::td)[3]//span")
private WebElement refreshButtonInApproveScreen;
public WebElement refreshButtonInApproveScreen()
{
	return refreshButtonInApproveScreen;
}
@FindBy(id = "trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
private WebElement transactionNoInApproveScreen;
public WebElement transactionNoInApproveScreen()
{
	return transactionNoInApproveScreen;
}
@FindBy(id="td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
private WebElement doubleClickTransactionNo;
public WebElement doubleClickTransactionNo()
{
	return doubleClickTransactionNo;
}
@FindBy(xpath="//span[contains(text(),' Approve ')]//parent::button")
private WebElement approveButtonInApproveScreen;
public WebElement approveButtonInApproveScreen()
{
	return approveButtonInApproveScreen;
}
@FindBy(id="cyPurchaseSaleDet")
private WebElement randomClick;
public WebElement randomClick()
{
	return randomClick;
}
@FindBy(xpath = "//a[@id='dismissbut_D001MT']")
private WebElement dismissAlertPopup;
public WebElement dismissAlertPopup()
{
	return dismissAlertPopup;
}
@FindBy(xpath = "//div[text()='Transaction No 7685 Approved ']")
private WebElement successfullyApprovedPopup;
public WebElement successfullyApprovedPopup()
{
	return successfullyApprovedPopup;
}
@FindBy(xpath = "//div[text()='Success']")
private WebElement successMessagePopup;
public WebElement successMessagePopup()
{
	return successMessagePopup;
}
@FindBy(xpath = "//td[text()='USD']")
private WebElement CSM_CurrencyName;
public WebElement CSMCurrencyName() 
{
    return CSM_CurrencyName;
}
//prerequesties
@FindBy(xpath = "//a[@id='E000MA']")
private WebElement updateAfterApproveInUser;
public WebElement updateAfterApproveInUser()
{
	return updateAfterApproveInUser;
}
@FindBy(xpath = "//input[@id='tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID']")
private WebElement userIdInUpdateAfterApprove;
public WebElement userIdInUpdateAfterApprove()
{
	return userIdInUpdateAfterApprove;
}
@FindBy(id="td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
private WebElement doubleClickUserInUpdateAfterApprove;
public WebElement doubleClickUserInUpdateAfterApprove()
{
	return doubleClickUserInUpdateAfterApprove;
}
@FindBy(xpath="//span[text()=' Limits ']")
private WebElement limitsButtonInUpdateAfterApprove;
public WebElement limitsButtonInUpdateAfterApprove()
{
	return limitsButtonInUpdateAfterApprove;
}
@FindBy(xpath="//td[@id='add_tab3_C_GridTbl_Id_E000MA']")
private WebElement addIconInUpdateAfterApprove;
public WebElement addIconInUpdateAfterApprove()
{
	return addIconInUpdateAfterApprove;
}
@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")
private WebElement accountCurrencyInUpdateAfterApprove;
public WebElement accountCurrencyInUpdateAfterApprove()
{
	return accountCurrencyInUpdateAfterApprove;
}
@FindBy(xpath="//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")
private WebElement transactionBoxInUpdateAfterApprove;
public WebElement transactionBoxInUpdateAfterApprove()
{
	return transactionBoxInUpdateAfterApprove;
}
@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
private WebElement withdrawalLimitInUpdateAfterApprove;
public WebElement withdrawalLimitInUpdateAfterApprove()
{
	return withdrawalLimitInUpdateAfterApprove;
}
@FindBy(xpath="//td[@tdlabel='Deposit Limit']//input")
private WebElement depositLimitInUpdateAfterApprove;
public WebElement depositLimitInUpdateAfterApprove()
{
	return depositLimitInUpdateAfterApprove;
}
@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
private WebElement warnUserIfLimitExceedInUpdateAfterApprove;
public WebElement warnUserIfLimitExceedInUpdateAfterApprove()
{
	return warnUserIfLimitExceedInUpdateAfterApprove;
}
@FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")
private WebElement proceedIfLimitExceedInUpdateAfterApprove;
public WebElement proceedIfLimitExceedInUpdateAfterApprove()
{
	return proceedIfLimitExceedInUpdateAfterApprove;
}
//confirmOkButton()
@FindBy(xpath="//button[@id='ok_btn_2_E000MA']")
private WebElement okButtonInUpdateAfterApprove;
public WebElement okButtonInUpdateAfterApprove()
{
	return okButtonInUpdateAfterApprove;
}
@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
private WebElement updateAfterApproveButtonInUpdateAfterApprove;
public WebElement updateAfterApproveButtonInUpdateAfterApprove()
{
	return updateAfterApproveButtonInUpdateAfterApprove;
}
//confirmOkButton()
//CSMOkButtonInAccessDeniedPopUpMenu
@FindBy(xpath="//a[@id='E000P']")
private WebElement approveScreenInUser;
public WebElement approveScreenInUser()
{
	return approveScreenInUser;
}
@FindBy(id="tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
private WebElement userIdInApprove;
public WebElement userIdInApprove()
{
	return userIdInApprove;
}
@FindBy(id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
private WebElement doubleClickUserIdInApprove;
public WebElement doubleClickUserIdInApprove()
{
	return doubleClickUserIdInApprove;
}
//approveButtonInApproveScreen
//confirmOkButton
//successOkButton








}