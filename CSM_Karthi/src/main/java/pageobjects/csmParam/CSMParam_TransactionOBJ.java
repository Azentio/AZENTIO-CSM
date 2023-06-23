package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_TransactionOBJ {
WebDriver driver;
	
	public CSMParam_TransactionOBJ(WebDriver driver) {
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
@FindBy(xpath = "//td[@id='td_tab27_GridTbl_Id_P024MA_1_ctstrxtypeChargesVO.CHARGES_CY_POLICY']//select")
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
private WebElement csm_SystemParameters_TransactionTypeUA_Ok_Buton;
public WebElement csmSystemParametersTransactionTypeUAOk_Buton()
{
	return csm_SystemParameters_TransactionTypeUA_Ok_Buton;
}
@FindBy(xpath="//label[text()='Update After Approve ']")
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
@FindBy(xpath="//span[text()='Approve']")
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
@FindBy(xpath = "//span[text()='GlCharges']")
private WebElement csm_TransactionType_GlCharges_RandomClick;
public WebElement csmTransactionTypeGlChargesRandomClick()
{
    return csm_TransactionType_GlCharges_RandomClick;
}
@FindBy(xpath = "//div[text()='CIF Type']")
private WebElement csm_TransactionType_CifTypeCharges_RandomClick;
public WebElement csmTransactionTypeCifTypeChargesRandomClick()
{
    return csm_TransactionType_CifTypeCharges_RandomClick;
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
@FindBy(xpath = "//*[@id='transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE']")
private WebElement csmParam_Transactiontype_inputfield;

public WebElement csmParam_Transactiontype_inputfield() {
	return csmParam_Transactiontype_inputfield;
}
@FindBy(xpath = "//input[@id='allow_overdrawn_P017MA']")
private WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;

public WebElement csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag() {
	return csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag;
}





}
