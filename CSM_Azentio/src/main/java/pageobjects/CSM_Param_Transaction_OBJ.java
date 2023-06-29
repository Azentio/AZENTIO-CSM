package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_Param_Transaction_OBJ {
WebDriver driver;
	
	public CSM_Param_Transaction_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//td[text()='Parameters']")
private WebElement csmParameters_Menu;
public WebElement csmParametersMenu()
{
	return csmParameters_Menu;
}
@FindBy(xpath = "//td[text()='System Parameters']")
private WebElement csmParameters_SystemParameters;
public WebElement csmParametersSystemParameters()
{
	return csmParameters_SystemParameters;
}
@FindBy(xpath = "//td[text()='Transaction Type']")
private WebElement csm_SystemParameters_TransactionType;
public WebElement csmSystemParametersTransactionType()
{
	return csm_SystemParameters_TransactionType;
}
@FindBy(xpath = "//span[text()='Update After Approve']")
private WebElement csm_SystemParameters_TransactionTypeUA;
public WebElement csmSystemParametersTransactionTypeUA()
{
	return csm_SystemParameters_TransactionTypeUA;
}
@FindBy(id = "transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
private WebElement csm_SystemParameters_TransactionTypeUA_CodeInput;
public WebElement csmSystemParametersTransactionTypeUACodeInput()
{
	return csm_SystemParameters_TransactionTypeUA_CodeInput;
}
@FindBy(id = "td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
private WebElement csm_SystemParameters_TransactionTypeUA_CodeDoubleClick;
public WebElement csmSystemParametersTransactionTypeUACodeDoubleClick()
{
	return csm_SystemParameters_TransactionTypeUA_CodeDoubleClick;
}
@FindBy(xpath = "//span[text()=' Gl Charges ']")
private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges;
public WebElement csmSystemParametersTransactionTypeUAGlCharges()
{
	return csm_SystemParameters_TransactionTypeUA_GlCharges;
}
@FindBy(xpath = "//span[text()=' Cif Priority Charges ']")
private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges;
public WebElement csmSystemParametersTransactionTypeUACifPriorityCharges()
{
	return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges;
}
@FindBy(xpath = "//span[text()=' CIF Types Charges ']")
private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges;
public WebElement csmSystemParametersTransactionTypeUACifTypeCharges()
{
	return csm_SystemParameters_TransactionTypeUA_CifTypeCharges;
}
@FindBy(id = "add_tab27_GridTbl_Id_P024MA")
private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_AddButton;
public WebElement csmSystemParametersTransactionTypeUAGlChargesAddButton()
{
	return csm_SystemParameters_TransactionTypeUA_GlCharges_AddButton;
}
@FindBy(id= "add_tab26_GridTbl_Id_P024MA")
private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges_AddButton;
public WebElement csmSystemParametersTransactionTypeUACifTypeChargesAddButton()
{
	return csm_SystemParameters_TransactionTypeUA_CifTypeCharges_AddButton;
}
@FindBy(id="add_tab28_GridTbl_Id_P024MA")
private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;
public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesAddButton()
{
	return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_AddButton;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE']")
private WebElement csm_SystemParameters_TransactionTypeUA_GlCode_Input;
public WebElement csmSystemParametersTransactionTypeUAGlCodeInput()
{
	return csm_SystemParameters_TransactionTypeUA_GlCode_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE']")
private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input;
public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput()
{
	return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input;
}
@FindBy(xpath = "//td[@id='td_tab27_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY']")
private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;
public WebElement csmSystemParametersTransactionTypeUAGlChargesSelectInput()
{
	return csm_SystemParameters_TransactionTypeUA_GlCharges_Select_Input;
}
@FindBy(id= "td_tab26_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY")
private WebElement csm_SystemParameters_TransactionTypeUA_CifTypeCharges_Select_Input;
public WebElement csmSystemParametersTransactionTypeUACifTypeChargesSelectInput()
{
	return csm_SystemParameters_TransactionTypeUA_CifTypeCharges_Select_Input;
}
@FindBy(id= "td_tab28_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY")
private WebElement csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Select_Input;
public WebElement csmSystemParametersTransactionTypeUACifPriorityChargesSelectInput()
{
	return csm_SystemParameters_TransactionTypeUA_CifPriorityCharges_Select_Input;
}
@FindBy(xpath = "//td[@tdlabel='Cash / Account']//select")
private WebElement csm_SystemParameters_TransactionTypeUA_Account_Input;
public WebElement csm_SystemParameters_TransactionTypeUA_Account_Input()
{
	return csm_SystemParameters_TransactionTypeUA_Account_Input;
}
@FindBy(xpath = "//td[@tdlabel='action']//select")
private WebElement csm_SystemParameters_TransactionTypeUA_Action_Input;
public WebElement csmSystemParametersTransactionTypeUAActionInput()
{
	return csm_SystemParameters_TransactionTypeUA_Action_Input;
}
@FindBy(xpath = "//span[text()='Ok']")
private WebElement csm_SystemParameters_TransactionTypeUA_Ok_Button;
public WebElement csmSystemParametersTransactionTypeUAOk_Button()
{
	return csm_SystemParameters_TransactionTypeUA_Ok_Button;
}
@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000MA_Update_After_Approve_key']")
private WebElement csm_TransactionType_UpdateAfterApprove_Button;
public WebElement csmTransactionTypeUpdateAfterApproveButton()
{
	return csm_TransactionType_UpdateAfterApprove_Button;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
private WebElement csm_TransactionType_ConfirmOkButton;
public WebElement csmTransactionTypeConfirmOkButton()
{
	return csm_TransactionType_ConfirmOkButton;
}
@FindBy(id = "_popup_path_sol_ok")
private WebElement csm_TransactionType_SuccessOkButton;
public WebElement csmTransactionTypeSuccessOkButton()
{
	return csm_TransactionType_SuccessOkButton;
}
@FindBy(xpath="//a[@id='E000P']")
private WebElement csm_TransactionType_ApproveScreen;
public WebElement csmTransactionTypeApproveScreen()
{
	return csm_TransactionType_ApproveScreen;
}
@FindBy(id= "transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
private WebElement csm_TransactionType_ApproveScreen_CodeInput;
public WebElement csmTransactionTypeApproveScreenCodeInput()
{
	return csm_TransactionType_ApproveScreen_CodeInput;
}
@FindBy(id= "td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
private WebElement csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
public WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick()
{
	return csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
}
@FindBy(xpath="//label[@id='tellerParamMaint_FormId_E000P_Approve_key']")
private WebElement csm_TransactionType_ApproveScreen_ApproveButton;
public WebElement csmTransactionTypeApproveScreenApproveButton()
{
	return csm_TransactionType_ApproveScreen_ApproveButton;
}
@FindBy(xpath = "//input[@name='transactiontypesCO.ctstrxtypeVO.DEDUCT_DEBITOR']")
private WebElement csm_TransactionType_DeductFrom_Flag;
public WebElement csmTransactionTypeDeductFromFlag()
{
	return csm_TransactionType_DeductFrom_Flag;
}
@FindBy(id= "deduct_chrg_from_trx_P024MA3")
private WebElement csm_TransactionType_DeductFrom_RadioButton_Flag;
public WebElement csmTransactionTypeDeductFromRadioButtonFlag()
{
	return csm_TransactionType_DeductFrom_RadioButton_Flag;
}
@FindBy(xpath = "//div[text()='CIF Type']")
private WebElement csm_TransactionType_RandomClick;
public WebElement csmTransactionTypeRandomClick()
{
	return csm_TransactionType_RandomClick;
}
@FindBy(id= "td_tab26_GridTbl_Id_P024MA_0_rn")
private WebElement csm_TransactionType_CifTypeCharges_SelectRow_Delete;
public WebElement csmTransactionTypeCifTypeChargesSelectRowDelete()
{
	return csm_TransactionType_CifTypeCharges_SelectRow_Delete;
}
@FindBy(id= "del_tab26_GridTbl_Id_P024MA")
private WebElement csm_TransactionType_CifTypeCharges_DeleteButton;
public WebElement csmTransactionTypeCifTypeChargesDeleteButton()
{
	return csm_TransactionType_CifTypeCharges_DeleteButton;
}
@FindBy(id= "td_tab27_GridTbl_Id_P024MA_0_rn")
private WebElement csm_TransactionType_GlCharges_SelectRow_Delete;
public WebElement csmTransactionTypeGlChargesSelectRowDelete()
{
	return csm_TransactionType_GlCharges_SelectRow_Delete;
}
@FindBy(id= "del_tab27_GridTbl_Id_P024MA")
private WebElement csm_TransactionType_GlCharges_DeleteButton;
public WebElement csmTransactionTypeGlChargesDeleteButton()
{
	return csm_TransactionType_GlCharges_DeleteButton;
}
@FindBy(id= "td_tab28_GridTbl_Id_P024MA_1_rn")
private WebElement csm_TransactionType_CifTypePriorityCharges_SelectRow_Delete;
public WebElement csmTransactionTypeCifTypePriorityChargesSelectRowDelete()
{
	return csm_TransactionType_CifTypePriorityCharges_SelectRow_Delete;
}
@FindBy(id= "del_tab28_GridTbl_Id_P024MA")
private WebElement csm_TransactionType_CifPriorityCharges_DeleteButton;
public WebElement csmTransactionTypeCifPriorityChargesDeleteButton()
{
	return csm_TransactionType_CifPriorityCharges_DeleteButton;
}
@FindBy(xpath = "//td[text()='Accounts Parameters']")
private WebElement csmParam_AccountParameters;

public WebElement csmParam_AccountParameters() {
	return csmParam_AccountParameters;
}

@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
private WebElement csmParam_Transactiontype_inputfield_doubleclick;

public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
	return csmParam_Transactiontype_inputfield_doubleclick;
}

@FindBy(xpath = "//td[text()='Account Type']")
private WebElement csmParam_AccountParameters_AccountTypes;

public WebElement csmParam_AccountParameters_AccountTypes() {
	return csmParam_AccountParameters_AccountTypes;
}

@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
private WebElement csmParam_AccountParameters_AccountTypes_UPAField;

public WebElement csmParam_AccountParameters_AccountTypes_UPAField() {
	return csmParam_AccountParameters_AccountTypes_UPAField;
}

@FindBy(xpath = "//input[@id='acctypeList_GridTbl_Id_P017MA_gs_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode;

public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode() {
	return csmParam_AccountParameters_AccountTypes_UPA_TypeCode;
}

@FindBy(xpath = "//td[@id='td_acctypeList_GridTbl_Id_P017MA_1_TYPE_CODE']")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;

public WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick() {
	return csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick;
}
@FindBy(xpath = "(//td[text()='7845']//following::td[text()='TEST7845'])[1]")
private WebElement doubleclick_fortestcaseTRS_245;

public WebElement doubleclickfortestcaseTRS_245() {
	return doubleclick_fortestcaseTRS_245;
}

@FindBy(xpath = "")
private WebElement csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick_forTRS064;

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

@FindBy(xpath = "//td[text()='Account Type']/ancestor::a/following-sibling::ul//span[text()='Approve']")
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



@FindBy(xpath = "//span[text()=' Account Charges ']")
private WebElement csm_TransactionType_AccountCharges;
public WebElement csmTransactionTypeAccountCharges()
{
	return csm_TransactionType_AccountCharges;
}
@FindBy(xpath = "//td[@id='add_tab24_GridTbl_Id_P024MA']")
private WebElement csm_TransactionType_AccountCharges_AddButton;
public WebElement csmTransactionTypeAccountChargesAddButton()
{
	return csm_TransactionType_AccountCharges_AddButton;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.BRANCH_CODE']")
private WebElement csm_TransactionType_AccountCharges_AccountBranch_Input;
public WebElement csmTransactionTypeAccountChargesAccountBranchInput()
{
	return csm_TransactionType_AccountCharges_AccountBranch_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CURRENCY_CODE']")
private WebElement csm_TransactionType_AccountCharges_AccountCurrency_Input;
public WebElement csmTransactionTypeAccountChargesAccountCurrencyInput()
{
	return csm_TransactionType_AccountCharges_AccountCurrency_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.GL_CODE']")
private WebElement csm_TransactionType_AccountCharges_AccountGl_Input;
public WebElement csmTransactionTypeAccountChargesAccountGlInput()
{
	return csm_TransactionType_AccountCharges_AccountGl_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CIF_SUB_NO']")
private WebElement csm_TransactionType_AccountCharges_AccountCif_Input;
public WebElement csmTransactionTypeAccountChargesAccountCifInput()
{
	return csm_TransactionType_AccountCharges_AccountCif_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.SL_NO']")
private WebElement csm_TransactionType_AccountCharges_AccountSerialNo_Input;
public WebElement csmTransactionTypeAccountChargesAccountSerialNoInput()
{
	return csm_TransactionType_AccountCharges_AccountSerialNo_Input;
}
@FindBy(xpath = "//td[@tdlabel='Reasons']//input")
private WebElement csm_TransactionType_AccountCharges_Reasons_Input;
public WebElement csmTransactionTypeAccountChargesReasonsInput()
{
	return csm_TransactionType_AccountCharges_Reasons_Input;
}
@FindBy(xpath = "//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE']")
private WebElement csm_TransactionType_AccountCharges_ChargeSchemaDetails_Input;
public WebElement csmTransactionTypeAccountChargesChargeSchemaDetailsInput()
{
	return csm_TransactionType_AccountCharges_ChargeSchemaDetails_Input;
}
@FindBy(xpath = "//td[@id='td_tab24_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY']//select")
private WebElement csm_TransactionType_AccountCharges_SelectAll_Input;
public WebElement csmTransactionTypeAccountChargesSelectAllInput()
{
	return csm_TransactionType_AccountCharges_SelectAll_Input;
}
@FindBy(xpath = "//td[@id='td_tab24_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CASH_ACCOUNT']//select")
private WebElement csm_TransactionType_AccountCharges_CashOrAccount_Input;
public WebElement csmTransactionTypeAccountChargesCashOrAccountInput()
{
	return csm_TransactionType_AccountCharges_CashOrAccount_Input;
}
@FindBy(xpath = "//td[@id='td_tab24_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.ACTION_TYPE']//select")
private WebElement csm_TransactionType_AccountCharges_Authorize_Input;
public WebElement csmTransactionTypeAccountChargesAuthorizeInput()
{
	return csm_TransactionType_AccountCharges_Authorize_Input;
}


//218
@FindBy(xpath = "//td[text()='Accounts Parameters']")
private WebElement csmParam_AccountParameter;
public WebElement csmParamAccountParameter()
{
	return csmParam_AccountParameter;
}

@FindBy(xpath = "//td[text()='General Ledger']")
private WebElement csmParam_General_ledger;
public WebElement csmParamGeneralledger() 
{
	return csmParam_General_ledger;
}
@FindBy(id = "P014UP")
private WebElement csmParam_General_ledger_Updateafterapprove;
public WebElement csmParamGeneralledgerUpdateafterapprove() 
{
	return csmParam_General_ledger_Updateafterapprove;
}
@FindBy(id = "genLedgerParamListGridTbl_Id_P014UP_gs_GL_CODE")
private WebElement csmParam_General_ledger_code;
public WebElement csmParamGeneralledgercode() 
{
	return csmParam_General_ledger_code;
}
@FindBy(xpath = "//td[@id='td_genLedgerParamListGridTbl_Id_P014UP_1_GL_CODE']")
private WebElement csmParam_General_ledger_code_doubleclick;
public WebElement csmParamGeneralledgercodedoubleclick() 
{
	return csmParam_General_ledger_code_doubleclick;
}
@FindBy(xpath = "//span[text()='Additional Details']")
private WebElement csmParam_General_ledger_code_additionaloptions;
public WebElement csmParamGeneralledgercodeadditionaloptions() 
{
	return csmParam_General_ledger_code_additionaloptions;
}
@FindBy(xpath = "//select[@id='allow_internal_overdraw_P014UP']")
private WebElement csmParam_General_ledger_code_additionaloptions_dropdown;
public WebElement csmParamGeneralledgercodeadditionaloptionsdropdown() 
{
	return csmParam_General_ledger_code_additionaloptions_dropdown;
}
@FindBy(id = "genLedgerParamFormId_P014UP_update_key")
private WebElement csmParam_General_ledger_upadatebutton;
public WebElement csmParamGeneralledgerupadatebutton() 
{
	return csmParam_General_ledger_upadatebutton;
}
@FindBy(xpath = "//td[text()='General Ledger']//ancestor::a//following-sibling::ul//span[text()='Approve']")
private WebElement csmParam_General_ledger_Approve;
public WebElement csmParamGeneralledgerApprove() 
{
	return csmParam_General_ledger_Approve;
}
@FindBy(id = "genLedgerParamListGridTbl_Id_P014P_gs_GL_CODE")
private WebElement csmParam_General_ledger_Approve_inputfield;
public WebElement csmParamGeneralledgerApproveinputfield() 
{
	return csmParam_General_ledger_Approve_inputfield;
}
@FindBy(id = "td_genLedgerParamListGridTbl_Id_P014P_1_ADDITIONAL_REFERENCE")
private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick;
public WebElement csmParamGeneralledgerApproveinputfielddoubleclick() 
{
	return csmParam_General_ledger_Approve_inputfield_doubleclick;
}
@FindBy(xpath = "//label[@id='genLedgerParamFormId_P014P_approve_key']")
private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;
public WebElement csmParamGeneralledgerApproveinputfielddoubleclickApprove() 
{
	return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve;
}
@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
private WebElement csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;
public WebElement csmParamGeneralledgerApproveinputfielddoubleclickApproveOK() 
{
	return csmParam_General_ledger_Approve_inputfield_doubleclick_Approve_OK;
}
//@FindBy(xpath = "//td[text()='Transaction Type']")
//private WebElement csmParam_Transactiontype;
//public WebElement csmParam_Transactiontype() 
//{
//	return csmParam_Transactiontype;
//}
//
//@FindBy(xpath = "//td[text()='Transaction Type']/ancestor::a/following-sibling::ul//span[text()='Update After Approve']")
//private WebElement csmParam_Transactiontype_Updateafterapprovefield;
//
//public WebElement csmParam_Transactiontype_Updateafterapprovefield() {
//	return csmParam_Transactiontype_Updateafterapprovefield;
//}
//
//@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
//private WebElement csmParam_Transactiontype_inputfield;
//
//public WebElement csmParam_Transactiontype_inputfield() {
//	return csmParam_Transactiontype_inputfield;
//}
//
//@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE']")
//private WebElement csmParam_Transactiontype_inputfield_doubleclick;
//
//public WebElement csmParam_Transactiontype_inputfield_doubleclick() {
//	return csmParam_Transactiontype_inputfield_doubleclick;
//}
@FindBy(xpath = "//input[@id='proceed_on_insuff_fund_P024MA']")
private WebElement csmParam_Transactiontype_proceedoninsufficentfunds;
public WebElement csmParamTransactiontypeproceedoninsufficentfunds() 
{
	return csmParam_Transactiontype_proceedoninsufficentfunds;
}
@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024MA_Update_After_Approve_key']")
private WebElement csmParam_Transactiontype_ProceedOnInsufficentFunds_UPAButton;
public WebElement csmParamTransactiontypeProceedOnInsufficentFundsUPAButton() 
{
	return csmParam_Transactiontype_ProceedOnInsufficentFunds_UPAButton;
}
@FindBy(xpath = "//a[@id='P024P']")
private WebElement csmParam_Transactiontype_Approvefield;
public WebElement csmParamTransactiontypeApprovefield() 
{
	return csmParam_Transactiontype_Approvefield;
}
@FindBy(xpath = "//input[@id='transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE']")
private WebElement csmParam_Transactiontype_Approve_Inputfield;
public WebElement csmParamTransactiontypeApproveInputfield() 
{
	return csmParam_Transactiontype_Approve_Inputfield;
}
@FindBy(xpath = "//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
private WebElement csmParam_Transactiontype_Approve_Inputfield_doubleclick;
public WebElement csmParamTransactiontypeApproveInputfielddoubleclick() 
{
	return csmParam_Transactiontype_Approve_Inputfield_doubleclick;
}
@FindBy(xpath = "//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
private WebElement csmParam_Transactiontype_Approve_Inputfield_Doubleclick_Approve;
public WebElement csmParamTransactiontypeApproveInputfieldDoubleclickApprove() 
{
	return csmParam_Transactiontype_Approve_Inputfield_Doubleclick_Approve;
}
@FindBy(xpath="//td[text()='Transactions']")
private WebElement transactions_Transactions;
public WebElement transactionsTransactions()
{
	return transactions_Transactions;
}	
@FindBy(xpath="//span[text()='Maintenance']")
private WebElement transactions_MaintenanceScreen;
public WebElement transactionsMaintenanceScreen()
{
	return transactions_MaintenanceScreen;
}
@FindBy(xpath="//input[@id='lookuptxt_trx_type_D001MT']")
private WebElement transactions_TrxTypeInput;
public WebElement transactionsTrxTypeInput()
{
	return transactions_TrxTypeInput;
}
@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_BR']")
private WebElement transactions_DepositAcc_BranchcodeInput;
public WebElement transactionsDepositAccBranchcodeInput()
{
	return transactions_DepositAcc_BranchcodeInput;
}
@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CY']")
private WebElement transactions_DebitAcc_CurrencycodeInput;
public WebElement transactionsDebitAccCurrencycodeInput()
{
	return transactions_DebitAcc_CurrencycodeInput;
}
@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_GL']")
private WebElement transactions_DebitAcc_GlcodeInput;
public WebElement transactionsDebitAccGlcodeInput()
{
	return transactions_DebitAcc_GlcodeInput;
}
@FindBy(xpath="//Input[@name='trxMgntCO.ctstrsVO.TRS_AC_CIF']")
private WebElement transactions_DebitAcc_CifcodeInput;
public WebElement transactionsDebitAccCifcodeInput()
{
	return transactions_DebitAcc_CifcodeInput;
}
@FindBy(xpath="//span[text()='close']")
private WebElement transactions_Viewmemo_closebtn;
public WebElement transactionsViewmemoclosebtn()
{
	return transactions_Viewmemo_closebtn;
}
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_AC_SL']")
private WebElement transactions_DebitAcc_SerialcodeInput;
public WebElement transactionsDebitAccSerialcodeInput()
{
	return transactions_DebitAcc_SerialcodeInput;
}
@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
private WebElement transactions_Warning_Okbtn;
public WebElement transactionsWarningOkbtn()
{
	return transactions_Warning_Okbtn;
}	
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TRS_CY']")
private WebElement transactions_CreditAcc_CurrencyInput;
public WebElement transactionsCreditAccCurrencyInput()
{
	return transactions_CreditAcc_CurrencyInput;
}
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.AMOUNT']")
private WebElement transactions_EnterAmountInput;
public WebElement transactionsEnterAmountInput()
{
	return transactions_EnterAmountInput;
}
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_GL']")
private WebElement transactions_CreditAcc_GlcodeInput;
public WebElement transactionsCreditAccGlcodeInput()
{
	return transactions_CreditAcc_GlcodeInput;
}
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CIF']")
private WebElement transactions_CreditAcc_CifcodeInput;
public WebElement transactionsCreditAccCifcodeInput()
{
	return transactions_CreditAcc_CifcodeInput;
}	
@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_SL']")
private WebElement transactions_CreditAcc_SerialcodeInput;
public WebElement transactionsCreditAccSerialcodeInput()
{
	return transactions_CreditAcc_SerialcodeInput;
}
@FindBy(xpath="//button[@id='trxMgntSaveBtn_D001MT']")
private WebElement transactions_Maintance_Savebtn;
public WebElement transactionsMaintanceSavebtn()
{
	return transactions_Maintance_Savebtn;
}

@FindBy(id = "_popup_path_sol_confirm_ok")
private WebElement confirm_Ok;

public WebElement confirmOk() {
	return confirm_Ok;
}
@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
private WebElement transaction_Trxsuccesspopup_Okbtn;
public WebElement transactionTrxsuccesspopupOkbtn()
{
	return transaction_Trxsuccesspopup_Okbtn;
}	
@FindBy(xpath="//span[text()='Approve']")
private WebElement transactions_ApproveScreen;
public WebElement transactionsApproveScreen()
{
	return transactions_ApproveScreen;
}
@FindBy(xpath="//input[@name='TRS_NO']")
private WebElement transactions_TransactionNo_InputValue;
public WebElement transactionsTransactionNoInputValue()
{
	return transactions_TransactionNo_InputValue;
}

@FindBy(xpath="//td[@id='td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO']")
private WebElement transactions_TransactionNo_Doubleclk;
public WebElement transactionsTransactionNoDoubleclk()
{
	return transactions_TransactionNo_Doubleclk;
}	

@FindBy(xpath="//span[contains(text(),' Approve ')]")
private WebElement transactions_Approvescreen_Appbtn;
public WebElement transactionsApprovescreenAppbtn()
{
	return transactions_Approvescreen_Appbtn;
}

@FindBy(xpath="//a[@id='infoBarSearchButton_D001MT']")
private WebElement transactions_Maintance_SearchIcon;
public WebElement transactionsMaintanceSearchIcon()
{
	return transactions_Maintance_SearchIcon;
}
@FindBy(xpath="//label[@id='trxMgntDefFormId_D001MT_Booked_Entries_key']")
private WebElement transactions_Maintance_BookedEntriesBtn;
public WebElement transactionsMaintanceBookedEntriesBtn()
{
	return transactions_Maintance_BookedEntriesBtn;
}

@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_BR']")
private WebElement transactions_CreditAcc_BranchcodeInput;
public WebElement transactionsCreditAccBranchcodeInput()
{
	return transactions_CreditAcc_BranchcodeInput;
}

@FindBy(xpath="//input[@name='trxMgntCO.ctstrsVO.TO_TRS_AC_CY']")
private WebElement transactions_CreditAcc_CurrencyCodeInput;
public WebElement transactionsCreditAccCurrencyCodeInput()
{
	return transactions_CreditAcc_CurrencyCodeInput;
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
private WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday;
public WebElement csmOkButtonForConfirmationPopUpForCompanyHoliday()
{
	return csmOkButtonForConfirmationPopUpForCompanyHoliday;
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
@FindBy(xpath="//a[text()='Transactions / Maintenance']")
private WebElement csm_Transactions_Maintenance_RandomClick;
public WebElement csmTransactionsMaintenanceRandomClick()
{
	return csm_Transactions_Maintenance_RandomClick;
}

@FindBy(xpath= "//input[@name='transactiontypesCO.ctstrxtypeVO.POST_DATED_VDATE']")
private WebElement csm_TransactionType_AllowPostdatedValueDate;
public WebElement csmTransactionTypeAllowPostdatedValueDate()
{
    return csm_TransactionType_AllowPostdatedValueDate;
}

@FindBy(xpath= "//input[@name='transactiontypesCO.ctstrxtypeVO.BACK_DATED_VDATE']")//(NoFutureValueDate)
private WebElement csm_TransactionType_AllowBackdatedValueDate;
public WebElement csmTransactionTypeAllowBackdatedValueDate()
{
    return csm_TransactionType_AllowBackdatedValueDate;
}


@FindBy(xpath= "//label[text()='Multiple Transfer ']")
private WebElement csm_TransactionType_MultipleTransferCheckBox;
public WebElement csmTransactionTypeMultipleTransferCheckBox()
{
    return csm_TransactionType_MultipleTransferCheckBox;
}


@FindBy(xpath= "//select[@id='trsfr_method_D001MT']")
private WebElement csmcore_Transaction_Maintanence_ModeOfPaymentDropDown;
public WebElement csmcoreTransactionMaintanenceModeOfPaymentDropDown()
{
    return csmcore_Transaction_Maintanence_ModeOfPaymentDropDown;
}

@FindBy(xpath= "//input[@id='currencyGridTbl_Id_gs_CURRENCY_CODE']")
private WebElement csmcore_Transaction_Maintanence_ModeOfPaymentDropDown_CashCurrency;
public WebElement csmcoreTransactionMaintanenceModeOfPaymentDropDownCashCurrency()
{
    return csmcore_Transaction_Maintanence_ModeOfPaymentDropDown_CashCurrency;
}

@FindBy(xpath= "//td[@id='td_currencyGridTbl_Id_1_CURRENCY_CODE']")
private WebElement csmcore_Transaction_Maintanence_ModeOfPaymentDropDown_CashCurrency_doubleClick;
public WebElement csmcoreTransactionMaintanenceModeOfPaymentDropDownCashCurrencydoubleClick()
{
    return csmcore_Transaction_Maintanence_ModeOfPaymentDropDown_CashCurrency_doubleClick;
}

@FindBy(xpath= "//td[@id='td_trxMgntAccountDtlGridTbl_Id_D001MT_1_rn']")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_clicktherecord;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonclicktherecord()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_clicktherecord;
}

@FindBy(xpath= "//label[text()='Account Details ']")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButton()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton;
}

@FindBy(xpath= "//span[text()='Account Details']")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_Randomclick;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonRandomclick()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_Randomclick;
}

@FindBy(xpath= "//td[@id='add_trxMgntAccountDtlGridTbl_Id_D001MT']")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_AddButton;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonAddButton()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_AddButton;
}


@FindBy(xpath= "(//div[text()='GL']//following::input)[1]")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_GLinputbox;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonGLinputbox()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_GLinputbox;
}


@FindBy(xpath= "(//div[text()='CIF']//following::input)[2]")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_CIFinputbox;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonCIFinputbox()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_CIFinputbox;
}

@FindBy(xpath= "(//div[text()='SL']//following::input)[3]")
private WebElement csmcore_Transaction_Maintanence_AccountDetailsButton_Serialnoinputbox;
public WebElement csmcoreTransactionMaintanenceAccountDetailsButtonSerialnoinputbox()
{
    return csmcore_Transaction_Maintanence_AccountDetailsButton_Serialnoinputbox;
}
}
