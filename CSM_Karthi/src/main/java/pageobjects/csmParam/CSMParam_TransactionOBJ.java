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
private WebElement csm_SystemParameters_TransactionTypeUA_Ok_Buton;
public WebElement csmSystemParametersTransactionTypeUAOk_Buton()
{
	return csm_SystemParameters_TransactionTypeUA_Ok_Buton;
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



}
