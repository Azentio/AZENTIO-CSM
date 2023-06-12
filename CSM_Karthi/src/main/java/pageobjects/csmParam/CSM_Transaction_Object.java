package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Transaction_Object {
	WebDriver driver;

	public CSM_Transaction_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//TRS_023
	
//	@FindBy(xpath = "//td[text()='Transaction Type']")
//	private WebElement CSMParam_TransactionType;
//	public WebElement CSMParam_TransactionType() {
//		return CSMParam_TransactionType;
//	}
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement CSMParam_TransactionType_UPA;
	public WebElement CSMParam_TransactionType_UPA() {
		return CSMParam_TransactionType_UPA;
	}
	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code;
	public WebElement CSMParam_TransactionType_UPA_code() {
		return CSMParam_TransactionType_UPA_code;
	}
	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_UPA_code_doubleClick;
	public WebElement CSMParam_TransactionType_UPA_code_doubleClick() {
		return CSMParam_TransactionType_UPA_code_doubleClick;
	}
	@FindBy(xpath = "//input[@id='nostro_mvt_P024MA']")
	private WebElement CSMParam_TransactionType_AllowInternalGL;
	public WebElement CSMParam_TransactionType_AllowInternalGL() {
		return CSMParam_TransactionType_AllowInternalGL;
	}
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
	private WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton;
	public WebElement CSMParam_TransactionType_AllowInternalGL_UPAButton() {
		return CSMParam_TransactionType_AllowInternalGL_UPAButton;
	}
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement CSMParam_TransactionType_Approve;
	public WebElement CSMParam_TransactionType_Approve() {
		return CSMParam_TransactionType_Approve;
	}
	@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code;
	public WebElement CSMParam_TransactionType_Approve_code() {
		return CSMParam_TransactionType_Approve_code;
	}
	@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick;
	public WebElement CSMParam_TransactionType_Approve_code_doubleClick() {
		return CSMParam_TransactionType_Approve_code_doubleClick;
	}
	@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
	private WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;
	public WebElement CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton() {
		return CSMParam_TransactionType_Approve_code_doubleClick_ApproveButton;
	}
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSMCore_Transactions;
	public WebElement CSMCore_Transactions() {
		return CSMCore_Transactions;
	}
	
	@FindBy(xpath = "//a[@id='D001MT']")
	private WebElement CSMCore_Transactions_Maintenance;
	public WebElement CSMCore_Transactions_Maintenance() {
		return CSMCore_Transactions_Maintenance;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_TRXType;
	public WebElement CSMCore_Transactions_Maintenance_TRXType() {
		return CSMCore_Transactions_Maintenance_TRXType;
	}
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
	private WebElement CSMCore_Transactions_Maintenance_BranchCode;
	public WebElement CSMCore_Transactions_Maintenance_BranchCode() {
		return CSMCore_Transactions_Maintenance_BranchCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_cy_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_CurrencyCode;
	public WebElement CSMCore_Transactions_Maintenance_CurrencyCode() {
		return CSMCore_Transactions_Maintenance_CurrencyCode;
	}
	@FindBy(xpath = "//input[@id='trs_ac_gl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_GLCode;
	public WebElement CSMCore_Transactions_Maintenance_GLCode() {
		return CSMCore_Transactions_Maintenance_GLCode;
	}
	@FindBy(xpath = "//input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
	private WebElement CSMCore_Transactions_Maintenance_CIFCode;
	public WebElement CSMCore_Transactions_Maintenance_CIFCode() {
		return CSMCore_Transactions_Maintenance_CIFCode;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement CSMCore_Transactions_Maintenance_SerialNo;
	public WebElement CSMCore_Transactions_Maintenance_SerialNo() {
		return CSMCore_Transactions_Maintenance_SerialNo;
	}
	
	//TSA_024
	
	
	@FindBy(xpath = "//input[@id='short_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No1;
	public WebElement CSMparam_transactionType_UPAA_Arabicword_No1() {
		return CSMparam_transactionType_UPAA_Arabicword_No1;
	}
	@FindBy(xpath = "//input[@id='long_desc_arab_P024MA']")
	private WebElement CSMparam_transactionType_UPAA_Arabicword_No2;
	public WebElement CSMparam_transactionType_UPAA_Arabicword_No2() {
		return CSMparam_transactionType_UPAA_Arabicword_No2;
	}//trs debit
	
	
	//TRS_027
	
	@FindBy(xpath="//td[text()='Transactions']")
	private WebElement Transactions_Transactions;
	public WebElement Transactions_Transactions()
	{
		return Transactions_Transactions;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Transactions_MaintenanceScrn;
	public WebElement Transactions_MaintenanceScrn()
	{
		return Transactions_MaintenanceScrn;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
	private WebElement Transactions_Trxtypevalue;
	public WebElement Transactions_Trxtypevalue()
	{
		return Transactions_Trxtypevalue;
	}
	@FindBy(xpath="//input[@id='trs_ac_br_D001MT']")
	private WebElement Transactions_depositAcc_Branchcode;
	public WebElement Transactions_depositAcc_Branchcode()
	{
		return Transactions_depositAcc_Branchcode;
	}
	
	@FindBy(xpath="//input[@id='trs_ac_cy_D001MT']")
	private WebElement Transactions_debitAcc_Currencycode;
	public WebElement Transactions_debitAcc_Currencycode()
	{
		return Transactions_debitAcc_Currencycode;
	}
	@FindBy(xpath="//input[@id='trs_ac_gl_D001MT']")
	private WebElement Transactions_debitAcc_Glcode;
	public WebElement Transactions_debitAcc_Glcode()
	{
		return Transactions_debitAcc_Glcode;
	}
	@FindBy(xpath="//input[@id='trs_ac_cif_D001MT']")
	private WebElement Transactions_debitAcc_Cifcode;
	public WebElement Transactions_debitAcc_Cifcode()
	{
		return Transactions_debitAcc_Cifcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trs_ac_sl_D001MT']")
	private WebElement Transactions_debitAcc_serialcode;
	public WebElement Transactions_debitAcc_serialcode()
	{
		return Transactions_debitAcc_serialcode;
	}
	@FindBy(xpath="//input[@id='lookuptxt_trs_cy_D001MT']")
	private WebElement Transactions_debitAcc_currency;
	public WebElement Transactions_debitAcc_currency()
	{
		return Transactions_debitAcc_currency;
	}
	
	@FindBy(xpath="//input[@id='amount_D001MT']")
	private WebElement Transactions_EnterAmount;
	public WebElement Transactions_EnterAmount()
	{
		return Transactions_EnterAmount;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_Warning_okbtn;
	public WebElement Transactions_Warning_okbtn()
	{
		return Transactions_Warning_okbtn;
	}	
	@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
	private WebElement Transactions_savebtn;
	public WebElement Transactions_savebtn()
	{
		return Transactions_savebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Transactions_successokbtn;
	public WebElement Transactions_successokbtn()
	{
		return Transactions_successokbtn;
	}
	@FindBy(xpath="//a[@id='D001AU']")
	private WebElement Transactions_Approvescrn;
	public WebElement Transactions_Approvescrn()
	{
		return Transactions_Approvescrn;
	}
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_codeValue;
	public WebElement Transactions_transactionNo_codeValue()
	{
		return Transactions_transactionNo_codeValue;
	}
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_transactionNo_Doubleclk;
	public WebElement Transactions_transactionNo_Doubleclk()
	{
		return Transactions_transactionNo_Doubleclk;
	}	
	@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
	private WebElement Transactions_searchbtn;
	public WebElement Transactions_searchbtn()
	{
		return Transactions_searchbtn;
	}	
	@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement Transactions_trxno_code;
	public WebElement Transactions_trxno_code()
	{
		return Transactions_trxno_code;
	}	
	@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO']")
	private WebElement Transactions_doubleclk_codevalue;
	public WebElement Transactions_doubleclk_codevalue()
	{
		return Transactions_doubleclk_codevalue;
	}	
	@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
	private WebElement Transactions_BookedEntries;
	public WebElement Transactions_BookedEntries()
	{
		return Transactions_BookedEntries;
	}	
	
	@FindBy(xpath="//span[contains(text(),' Approve ')]")
 private WebElement Transactions_Approvebtn;
public WebElement Transactions_Approvebtn()
 {
return Transactions_Approvebtn;
}

@FindBy(xpath="//div[contains(text(),'Not A Valid Non Internal GL')]")
private WebElement nonInternalGlCodeValidationPopUp;
public WebElement nonInternalGlCodeValidationPopUp()
{
return nonInternalGlCodeValidationPopUp;
}
//TRS_024
@FindBy(xpath="//input[@id='rqst_cy_nomination_det_P024MA']")
private WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox;
public WebElement TransactionType_UPAA_dealwithCurrencyDominationChequbox()
{
return TransactionType_UPAA_dealwithCurrencyDominationChequbox;
}
//TRS_063
@FindBy(xpath = "//*[@id=\"transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE\"]")
private WebElement csmParam_Transactiontype_inputfield ;

public WebElement csmParam_Transactiontype_inputfield() {
return csmParam_Transactiontype_inputfield;
}
@FindBy(xpath = "//td[text()='Accounts Parameters']")
private WebElement csmParam_AccountParameters ;

public WebElement csmParam_AccountParameters() {
return csmParam_AccountParameters;
}

@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
private WebElement csmParam_Transactiontype_inputfield_doubleclick ;

public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
return csmParam_Transactiontype_inputfield_doubleclick;
}
@FindBy(xpath = "//td[text()='Account Type']")
private WebElement csmParam_AccountParameters_AccountTypes ;

public WebElement csmParam_AccountParameters_AccountTypes() {
return csmParam_AccountParameters_AccountTypes;
}
@FindBy(xpath = "//a[@id='P017MA']")
private WebElement csmParam_AccountParameters_AccountTypes_UPAField ;

public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
return csmParam_AccountParameters_AccountTypes_UPAField;
}
@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode ;

public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode() {
return csmParam_AccountParameters_AccountTypes_UPA_TypeCode;
}
@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick ;

public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
}

@FindBy(xpath = "//td[text()='55']")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064 ;

public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064() {
return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;
}
@FindBy(xpath = "//div[@id='instructionsColl_P017MA']")
private WebElement csmParam_AccountParameters_AccountTypes_Instructions;

public WebElement csmParam_AccountParameters_AccountTypes_Instructions() {
return csmParam_AccountParameters_AccountTypes_Instructions;
}
@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;

public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag() {
return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;
}
@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017MA_Update_After_Approve_key']")
private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;

public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton() {
return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton;
}
@FindBy(xpath = "//a[@id='P017P']")
private WebElement csmParam_AccountParameters_AccountTypes_ApproveField;

public WebElement csmParam_AccountParameters_AccountTypes_ApproveField() {
return csmParam_AccountParameters_AccountTypes_ApproveField;
}
@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017P_gs_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;

public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode() {
return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode;
}
@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017P_1_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;

public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick() {
return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick;
}
@FindBy(xpath = "//label[@id='acctypeMaint_FormId_P017P_Approve_key']")
private WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;

public WebElement csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton() {
return csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton;
}
@FindBy(xpath="//div[contains(text(),'Amount Exceeds')]")
private WebElement AmountExceedsWarningPopUp;
public WebElement AmountExceedsWarningPopUp()
{
return AmountExceedsWarningPopUp;
}
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
private WebElement checkIfValueIsEntered;
public WebElement checkIfValueIsEntered()
{
return checkIfValueIsEntered;
}

@FindBy(xpath="//input[@id='trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO']")
private WebElement Transactions_transactionNo_codeValues;
public WebElement Transactions_transactionNo_codeValues()

{
    return Transactions_transactionNo_codeValues;
}
@FindBy(xpath="//div[contains(text(),'Saved Successfully')]")
private WebElement getTransactionNumber;
public WebElement getTransactionNumber()
{
   return getTransactionNumber;
}

@FindBy(xpath = "//input[@id='branch_code_D001MT']")
private WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit;
public WebElement CSMCore_Transactions_Maintenance_BranchCodeForCredit() {
	return CSMCore_Transactions_Maintenance_BranchCodeForCredit;
}

@FindBy(xpath = "//input[@id='ctrl_cy_D001MT']")
private WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;
public WebElement CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit() {
	return CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit;
}
@FindBy(xpath = "//input[@id='ctrl_gl_D001MT']")
private WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;
public WebElement CSMCore_Transactions_Maintenance_GLCodeCodeForCredit() {
	return CSMCore_Transactions_Maintenance_GLCodeCodeForCredit;
}
@FindBy(xpath = "//input[@id='ctrl_cif_D001MT']")
private WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;
public WebElement CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit() {
	return CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit;
}
@FindBy(xpath = "//input[@id='lookuptxt_ctrl_sl_D001MT']")
private WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;
public WebElement CSMCore_Transactions_Maintenance_SerialNoCodeForCredit() {
	return CSMCore_Transactions_Maintenance_SerialNoCodeForCredit;
}

@FindBy(xpath = "//input[@id=\"proceed_on_insuff_fund_P024MA\"]")
private WebElement csmParam_Transactiontype_proceedoninsufficentfunds ;

public WebElement csmParam_Transactiontype_proceedoninsufficentfunds() {
return csmParam_Transactiontype_proceedoninsufficentfunds;
}

//TRS_111

@FindBy(xpath = "//td[text()='System Parameters']")
private WebElement csmParam_Systemparameter ;

public WebElement csmParam_Systemparameter() {
	return csmParam_Systemparameter;
}

@FindBy(xpath = "//td[text()='User']")
private WebElement csmParam_Systemparameter_User ;

public WebElement csmParam_Systemparameter_User() {
	return csmParam_Systemparameter_User;
}

@FindBy(xpath = "//span[text()='Update after Approve']")
private WebElement csmParam_Systemparameter_User_UpadateAfterapprove ;

public WebElement csmParam_Systemparameter_User_UpadateAfterapprove() {
	return csmParam_Systemparameter_User_UpadateAfterapprove;
}

@FindBy(id = "tellerParamList_GridTbl_Id_E000MA_gs_ctstellerVO.USER_ID")
private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid;

public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid() {
	return csmParam_Systemparameter_User_UpadateAfterapprove_Userid;
}

@FindBy(id = "td_tellerParamList_GridTbl_Id_E000MA_1_ctstellerVO.USER_ID")
private WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;

public WebElement csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick() {
	return csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick;
}

@FindBy(xpath = "//a[@id='E000MA']")
private WebElement updateAfterApproveInUser;
public WebElement updateAfterApproveInUser()
{
    return updateAfterApproveInUser;

}
@FindBy(xpath = "//label[text()='Update After Approve ']")
private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;

public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove() {
	return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove;
}
@FindBy(id = "_popup_path_sol_confirm_ok")
private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;

public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok() {
	return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
private WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;

public WebElement csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok() {
	return csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok;
}
@FindBy(id="E000P")
private WebElement csmParam_User_Approve;

public WebElement csmParam_User_Approve() {
	return csmParam_User_Approve;
}
@FindBy(id = "tellerParamList_GridTbl_Id_E000P_gs_ctstellerVO.USER_ID")
private WebElement csmParam_User_Approve_UserID;

public WebElement csmParam_User_Approve_UserID() {
	return csmParam_User_Approve_UserID;
}

@FindBy(id="td_tellerParamList_GridTbl_Id_E000P_1_ctstellerVO.USER_ID")
private WebElement csmParam_User_Approve_Username_doubleclick;
public WebElement csmParam_User_Approve_Username_doubleclick() {
	return csmParam_User_Approve_Username_doubleclick;
}

@FindBy(id="tellerParamMaint_FormId_E000P_Approve_key")
private WebElement csmParam_User_Approve_Username_doubleclick_Approve;

public WebElement csmParam_User_Approve_Username_doubleclick_Approve() {
	return csmParam_User_Approve_Username_doubleclick_Approve;
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


@FindBy(xpath="//td[@tdlabel='Deposit Limit']//input")
private WebElement depositLimitInUpdateAfterApprove;
public WebElement depositLimitInUpdateAfterApprove()
{
    return depositLimitInUpdateAfterApprove;
}

@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
private WebElement updateAfterApproveButtonInUpdateAfterApprove;
public WebElement updateAfterApproveButtonInUpdateAfterApprove()
{
   return updateAfterApproveButtonInUpdateAfterApprove;
}
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
@FindBy(xpath="//span[text()=' Limits ']")

private WebElement csm_sysparam_user_updateafterapprove_Limits;


public WebElement csm_sysparam_user_updateafterapprove_Limits() {
    return csm_sysparam_user_updateafterapprove_Limits;
}
@FindBy(id="add_tab3_C_GridTbl_Id_E000MA")
private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn;

public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn() {
    return csm_sysparam_user_updateafterapprove_Limits_addbtn;
}

@FindBy(xpath="(//input[@role='livesearch'])[1]")
private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;
    public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_currency() {
    return csm_sysparam_user_updateafterapprove_Limits_addbtn_currency;
}    

    @FindBy(xpath="(//input[@role='livesearch'])[2]")
    private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;
        public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx() {
        return csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx;
    }

        @FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
        private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
            public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits() {
            return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits;
        }

            @FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
            private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2;
                public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2() {
                return csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimitsNo2;
            }
            @FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Warn User If Limit Exceed']/input")
            private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;
                public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check() {
                return csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check;
            }


                @FindBy(xpath="//td[@tdlabel='Local Approval Limit']//input/ancestor::td[@tdlabel='Local Approval Limit']/following-sibling::td[@tdlabel='Proceed If Limit Exceed']//input")
                private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;
                    public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check() {
                    return csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check;
                }       
            @FindBy(id="ok_btn_2_E000MA")
            private WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
           public WebElement csm_sysparam_user_updateafterapprove_Limits_addbtn_ok() {
            return csm_sysparam_user_updateafterapprove_Limits_addbtn_ok;
        }
       	@FindBy(id="hdr_runn_date")
		private WebElement CSM_DateToChangeTheCurrentDate;

		public WebElement CSMDateToChangeTheCurrentDate() {
			return CSM_DateToChangeTheCurrentDate;
		}
		
		@FindBy(id="global_user_run_date")
		private WebElement CSM_DateInUserRunningDate;

		public WebElement CSMDateInUserRunningDate() {
			return CSM_DateInUserRunningDate;
		}
	
		
		@FindBy(xpath="//button[@id='submit_255022178']")
		 private WebElement Transactions_Approvebtns;
		public WebElement Transactions_Approvebtns()
		 {
		return Transactions_Approvebtns;
		}
		@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
		private WebElement CSM_UseButtonInChangeRunningDate;

		public WebElement CSMUseButtonInChangeRunningDate() {
			return CSM_UseButtonInChangeRunningDate;
		}
		
		@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
		private WebElement CSM_ClearCacheInTechnicalDetailsIcon;

		public WebElement CSM_ClearCacheInTechnicalDetailsIcon() {
			return CSM_ClearCacheInTechnicalDetailsIcon;

		}
		
		@FindBy(id="_popup_path_sol_ok")
		private WebElement CSM_OkButtonInInformationPopUpMenu;

		public WebElement CSMOkButtonInInformationPopUpMenu() {
			return CSM_OkButtonInInformationPopUpMenu;
		}
		
		@FindBy(id="_header_rundate_dialog_close")
		private WebElement CSM_CloseButtonInChangeRunningDate;

		public WebElement CSMCloseButtonInChangeRunningDate() {
			return CSM_CloseButtonInChangeRunningDate;
		}
		
		@FindBy(id="tech_details_icon")
		private WebElement CSM_TechnicalDetailsIcon;

		public WebElement CSMTechnicalDetailsIcon() {
			return CSM_TechnicalDetailsIcon;
		}
		
		@FindBy(id="_popup_path_sol_ok")
		private WebElement CSM_OkButtonUnderInformationPopUp;

		public WebElement CSMOkButtonUnderInformationPopUp() {
			return CSM_OkButtonUnderInformationPopUp;
		}
		@FindBy(xpath = "(//td[text()='840'])[1]")
		private WebElement limits_retriveTheRecordfor_TRS110 ;

		public WebElement limits_retriveTheRecordfor_TRS110() {
			return limits_retriveTheRecordfor_TRS110;
		}  
		@FindBy(xpath = "//td[text()='452']")
		private WebElement limits_retriveTheRecord ;

		public WebElement limits_retriveTheRecord() {
			return limits_retriveTheRecord;
		}  
		@FindBy(xpath = "//td[text()='CASH WD']")
		private WebElement limits_retriveTheRecord_DataNo2 ;

		public WebElement limits_retriveTheRecord_DataNo2() {
			return limits_retriveTheRecord_DataNo2;
		}  
		
		
		@FindBy(xpath = "//td[text()='Deposit Rita']")
		private WebElement limits_retriveTheRecordtoDelete ;

		public WebElement limits_retriveTheRecordtoDelete() {
			return limits_retriveTheRecordtoDelete;
		}
		@FindBy(xpath = "//td[@id='del_tab3_C_GridTbl_Id_E000MA']")
		private WebElement limits_DeleteButton ;

		public WebElement limits_DeleteButton() {
			return limits_DeleteButton;
		}  
		@FindBy(xpath = "//div[text()='Cannot Proceed']//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between')]//parent::div//following-sibling::center//input[@id='_popup_path_sol_ok']")
		private WebElement CannotProceed_Warning_popup ;

		public WebElement CannotProceed_Warning_popup() {
			return CannotProceed_Warning_popup;
		}  
		@FindBy(xpath = "//div[contains(text(),'WARNING')]//parent::div//following-sibling::div//div[contains(text(),'Currency: Limit Amount should be between')]//parent::div//following-sibling::center//input")
		private WebElement Warning_popup ;

		public WebElement Warning_popup() {
			return Warning_popup;
		}  
		//TRS_127
		@FindBy(xpath = "//td[text()='KARTHIK']")
		private WebElement Transaction_maintanance_alertclickingUserId ;

		public WebElement Transaction_maintanance_alertclickingUserId() {
			return Transaction_maintanance_alertclickingUserId;
		}  
		@FindBy(xpath = "//a[@id='sendBut_D001MT']")
		private WebElement Transaction_maintanance_alertclickingUserId_SendBtn ;

		public WebElement Transaction_maintanance_alertclickingUserId_SendBtn() {
			return Transaction_maintanance_alertclickingUserId_SendBtn;
		}  
		


}
