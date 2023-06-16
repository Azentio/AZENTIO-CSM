package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransactionsObj_612 {
	WebDriver driver;
	public CSM_TransactionsObj_612 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		}


@FindBy(id="hdr_runn_date")
private WebElement CSM_DateToChangeTheCurrentDate;

public WebElement CSMDateToChangeTheCurrentDate_612() {
	return CSM_DateToChangeTheCurrentDate;
}

@FindBy(id="global_user_run_date")
private WebElement CSM_DateInUserRunningDate;

public WebElement CSMDateInUserRunningDate_612() {
	return CSM_DateInUserRunningDate;
}

@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
private WebElement CSM_UseButtonInChangeRunningDate;

public WebElement CSMUseButtonInChangeRunningDate_612() {
	return CSM_UseButtonInChangeRunningDate;
}
@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

public WebElement CSMOkButtonInAccessDeniedPopUpMenu_612() {
	return CSM_OkButtonInAccessDeniedPopUpMenu;
}

@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

public WebElement CSM_ClearCacheInTechnicalDetailsIcon_612() {
	return CSM_ClearCacheInTechnicalDetailsIcon;

}

@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInInformationPopUpMenu;

public WebElement CSMOkButtonInInformationPopUpMenu_612() {
	return CSM_OkButtonInInformationPopUpMenu;
}

@FindBy(id="_header_rundate_dialog_close")
private WebElement CSM_CloseButtonInChangeRunningDate;

public WebElement CSMCloseButtonInChangeRunningDate_612() {
	return CSM_CloseButtonInChangeRunningDate;
}

@FindBy(id="tech_details_icon")
private WebElement CSM_TechnicalDetailsIcon;

public WebElement CSMTechnicalDetailsIcon_612() {
	return CSM_TechnicalDetailsIcon;
}

@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonUnderInformationPopUp;

public WebElement CSMOkButtonUnderInformationPopUp_612() {
	return CSM_OkButtonUnderInformationPopUp;
}

@FindBy(xpath = "//td[text()='Transactions']")
private WebElement CSM_TransactionsMainMenu;

public WebElement CSMTransactionsMainMenu_612() {
	return CSM_TransactionsMainMenu;
}

@FindBy(id="D001MT")
private WebElement CSM_MaintenanceUnderTransactions;

public WebElement CSMMaintenanceUnderTransactions_612() {
	return CSM_MaintenanceUnderTransactions;
}

@FindBy(id="lookuptxt_trx_type_D001MT")
private WebElement CSM_TRXTypeInMaintenanceScreen;

public WebElement CSMTRXTypeInMaintenanceScreen_612() {
	return CSM_TRXTypeInMaintenanceScreen;
}


//id="trs_ac_br_D001MT"
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
private WebElement CSM_BranchCodeInCreditAc;

public WebElement CSMBranchCodeInCreditAc_612() {
	return CSM_BranchCodeInCreditAc;
}
//id="trs_ac_cy_D001MT"
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
private WebElement CSM_CurrencyCodeCreditAc;

public WebElement CSMCurrencyCodeCreditAc_612() {
	return CSM_CurrencyCodeCreditAc;
}
//id="trs_ac_gl_D001MT
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
private WebElement CSM_GLCodeCreditAc;

public WebElement CSMGLCodeCreditAc_612() {
	return CSM_GLCodeCreditAc;
}
//id="trs_ac_cif_D001MT
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
private WebElement CSM_CIFCodeInCreditAc;

public WebElement CSMCIFCodeInCreditAc_612() {
	return CSM_CIFCodeInCreditAc;
}
//id="lookuptxt_trs_ac_sl_D001MT"
@FindBy(xpath="//input[@id='lookuptxt_to_trs_ac_sl_D001MT']")
private WebElement CSM_SerialInCreditAc;
public WebElement CSMSerialInCreditAc_612() {
	return CSM_SerialInCreditAc;
}
	@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInWarningPopUpMenu;

public WebElement CSMOkButtonInWarningPopUpMenu_612() {
	return CSM_OkButtonInWarningPopUpMenu;
}

@FindBy(xpath="//div[text()='WARNING']//parent::div//following-sibling::div//div[contains(text(),'Amount Exceeds Available Balance in Account')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
private WebElement CSM_AmountExceed_WarningMsg;

public WebElement CSM_AmountExceed_WarningMsg_612 () {
	return CSM_AmountExceed_WarningMsg;
}


//id="lookuptxt_trs_cy_D001MT"
@FindBy(id="lookuptxt_trs_cy_D001MT")
private WebElement CSM_CurrencyInMaintenanceScreen;

public WebElement CSMCurrencyInMaintenanceScreen_612() {
	return CSM_CurrencyInMaintenanceScreen;
}

@FindBy(id="amount_D001MT")
private WebElement CSM_AmountInMaintenanceScreen;

public WebElement CSMAmountInMaintenanceScreen_612() {
	return CSM_AmountInMaintenanceScreen;
}

//debit
@FindBy(id="trs_ac_br_D001MT")
private WebElement CSM_BranchCodeINdebitAc;
public WebElement CSM_BranchCodeINdebitAc_612() {
	return CSM_BranchCodeINdebitAc;
}

@FindBy(id="trs_ac_cy_D001MT")
private WebElement CSM_CurrencyCodedebitAc;

public WebElement CSM_CurrencyCodedebitAc_612() {
	return CSM_CurrencyCodedebitAc;
}

@FindBy(id="trs_ac_gl_D001MT")
private WebElement CSM_GLCodedebitAc;

public WebElement CSM_GLCodedebitAc_612() {
	return CSM_GLCodedebitAc;
}

@FindBy(id="trs_ac_cif_D001MT")
private WebElement CSM_CIFCodeIndebitAc;

public WebElement CSM_CIFCodeIndebitAc_612() {
	return CSM_CIFCodeIndebitAc;
}

@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
private WebElement CSM_SerialIndebitAc;
public WebElement CSM_SerialIndebitAc_612() {
	return CSM_SerialIndebitAc;
}
@FindBy(id="trxMgntSaveBtn_D001MT")
private WebElement CSM_SaveButtonInMaintenanceScreen;

public WebElement CSMSaveButtonInMaintenanceScreen_612() {
	return CSM_SaveButtonInMaintenanceScreen;
}
@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
private WebElement CSM_GetTheTransactionNo;

public WebElement CSMGetTheTransactionNo_612() {
	return CSM_GetTheTransactionNo;
}

@FindBy(id="D001AU")
private WebElement CSM_ApproveScreenUnderTransactions;

public WebElement CSMApproveScreenUnderTransactions_612() {
	return CSM_ApproveScreenUnderTransactions;
}

@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
private WebElement CSM_TransactionNoInApproveScreen;

public WebElement CSMTransactionNoInApproveScreen_612() {
	return CSM_TransactionNoInApproveScreen;
}
@FindBy(xpath = "//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")

private WebElement Transactions_transactionNo_Doubleclk;

public WebElement Transactions_transactionNo_Doubleclk_612() {

    return Transactions_transactionNo_Doubleclk;

}

@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
private WebElement CSM_DoubleClickOnTheTransactionNo;

public WebElement CSMDoubleClickOnTheTransactionNo_612() {
	return CSM_DoubleClickOnTheTransactionNo;
}		
		
@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
private WebElement CSM_ApproveButtonInApproveScreen;

public WebElement CSMApproveButtonInApproveScreen_612() {
	return CSM_ApproveButtonInApproveScreen;
}		

@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation_612() {
	return CSM_OkButtonInSuccessPopUpMenuForTranscation;
}		

@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInSuccessPopUpMenu;

public WebElement CSMOkButtonInSuccessPopUpMenu_612() {
	return CSM_OkButtonInSuccessPopUpMenu;
}


@FindBy(xpath="//div[contains(text(),'Saved Successfully')]")

private WebElement getTransactionNumber;

public WebElement getTransactionNumber_612()

{

   return getTransactionNumber;

}
@FindBy(id="_popup_path_sol_ok")
private WebElement CSM_OkButtonInSuccessPopUpMenu_612;

public WebElement CSMOkButtonInSuccessPopUpMenu() {
	return CSM_OkButtonInSuccessPopUpMenu;
}


@FindBy(id="_popup_path_sol_confirm_ok")
private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance_612() {
return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
}

@FindBy(id="infoBarSearchButton_D001MT")
private WebElement CSM_SearchButtonInMaintenanceScreen;

public WebElement CSMSearchButtonInMaintenanceScreen_612() {
return CSM_SearchButtonInMaintenanceScreen;
}

@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
private WebElement CSM_EnterTheTransactionNoInSearchBox;

public WebElement CSMEnterTheTransactionNoInSearchBox_612() {
return CSM_EnterTheTransactionNoInSearchBox;
}

@FindBy(id="trxMgntDefFormId_D001MT_Booked_Entries_key")
private WebElement CSM_BookedEntriesInMaintenanceScreen;

public WebElement CSMBookedEntriesInMaintenanceScreen_612() {
return CSM_BookedEntriesInMaintenanceScreen;
}
@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")

private WebElement checkIfValueIsEntered;

public WebElement checkIfValueIsEntered_612() {

    return checkIfValueIsEntered;

}
//cash of payment

@FindBy(xpath = "//select[@id='trsfr_method_D001MT']")

private WebElement CSM_cashofpayment;

public WebElement CSM_cashofpayment_612() {

    return CSM_cashofpayment;

}
@FindBy(xpath = "//input[@id='currencyGridTbl_Id_gs_CURRENCY_CODE']")

private WebElement CSM_cashofpayment_Cash_currency;

public WebElement CSM_cashofpayment_Cash_currency_612() {

    return CSM_cashofpayment_Cash_currency;

}
@FindBy(xpath = "//td[text()='840']")

private WebElement CSM_cashofpayment_Cash_currencyDoubleclk;

public WebElement CSM_cashofpayment_Cash_currencyDoubleclk_612() {

    return CSM_cashofpayment_Cash_currencyDoubleclk;

}
}
