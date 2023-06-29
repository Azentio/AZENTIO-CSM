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
@FindBy(xpath = "//tr//td[@tdlabel='Code']")
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


@FindBy(xpath= "//tr//td[@id='td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE']")
private WebElement csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
public WebElement csmTransactionTypeApproveScreenCodeInputDoubleClick()
{
	return csm_TransactionType_ApproveScreen_CodeInput_DoubleClick;
}
@FindBy(xpath="//label[@id='transactionTypesMaint_FormId_P024P_Approve_key']")
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


//-------------------------- new XPATH ----------------------------------



public String csmTransactionType_GLChargesSelectrows = "//table[@id='tab27_GridTbl_Id_P024MA']//tbody//tr";

public String csmTransactionType_CIFPriorityChargesSelectrows =  "//table[@id='tab28_GridTbl_Id_P024MA']//tbody//tr";

public String csmTransactionType_CIFChargesSelectrows =  "//table[@id='tab25_GridTbl_Id_P024MA']//tbody//tr";

public String csmTransactionType_AccountChargesSelectrows =  "//table[@id='tab24_GridTbl_Id_P024MA']//tbody//tr";

public String csmTransactionType_CIFTypeChargesSelectrows = "//table[@id='tab26_GridTbl_Id_P024MA']//tbody//tr";

public String csmTransactionType_CIFPriorityChargesSelectDropdowns = "//select[@gridid='tab28_GridTbl_Id_P024MA']";

public String csmTransactionType_CIFTypeChargesSelectDropdowns = "//select[@gridid='tab26_GridTbl_Id_P024MA']";

public String csmTransactionType_GLChargesSelectDropdowns = "//select[@gridid='tab27_GridTbl_Id_P024MA']";


public String csmTransactionType_AccountChargesSelectDropdowns = "//select[@gridid='tab24_GridTbl_Id_P024MA']";

public String csmTransactionType_CIFChargesSelectDropdowns = "//select[@gridid='tab25_GridTbl_Id_P024MA']";



//private WebElement csm_TransactionType_GLChargesSelectrows;
//public WebElement csmTransactionType_GLChargesSelectrows()
//{
//    return csm_TransactionType_GLChargesSelectrows;
//}


@FindBy(xpath="//*[@id='logout']")
private WebElement csm_LogoutUnderCSMParams;
public WebElement csmLogoutUnderCSMParams()
{
	return csm_LogoutUnderCSMParams;
}


@FindBy(xpath="//td[@id='del_tab27_GridTbl_Id_P024MA']")
private WebElement csm_SystemParameters_TransactionTypeUA_GlCharges_DeleteButton;
public WebElement csmSystemParameters_TransactionTypeUA_GlCharges_DeleteButton()
{
	return csm_SystemParameters_TransactionTypeUA_GlCharges_DeleteButton;
}


@FindBy(xpath="//select[@id='trsfr_type_P024MA']//option[@selected='selected'][text()='Intra Bank']")
private WebElement csm_SystemParameters_TransactionTypeUA_IntraBankLabel;
public WebElement csmSystemParameters_TransactionTypeUA_IntraBankLabel()
{
	return csm_SystemParameters_TransactionTypeUA_IntraBankLabel;
}



@FindBy(xpath="//input[@id='cr_dr_forex_P024MAD'][@checked='checked']")
private WebElement csm_SystemParameters_TransactionTypeUA_MainDebtLabel;
public WebElement csmSystemParameters_TransactionTypeUA_MainDebtLabel()
{
	return csm_SystemParameters_TransactionTypeUA_MainDebtLabel;
}



@FindBy(xpath="//input[@id='ignore_holidays_for_trs_date_P024MA']")
private WebElement csm_SystemParameters_TransactionTypeUA_DummyCheck;
public WebElement csmSystemParameters_TransactionTypeUA_DummyCheck()
{
	return csm_SystemParameters_TransactionTypeUA_DummyCheck;
}


@FindBy(xpath="//input[@id='deduct_chrg_from_trx_P024MA3'][@checked='checked']")
private WebElement csm_SystemParameters_TransactionTypeUA_DebtFromDebitorRadioButton;
public WebElement csm_SystemParameters_TransactionTypeUA_DebtFromDebitorRadioButton()
{
	return csm_SystemParameters_TransactionTypeUA_DebtFromDebitorRadioButton;
}

@FindBy(xpath="//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE']")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges;
}

@FindBy(xpath = "//*[contains(text(),'Account Charges')]")
private WebElement csm_SystemParameters_TransactionTypeUA_AccountCharges;
public WebElement csmSystemParameters_TransactionTypeUA_AccountCharges()
{
	return csm_SystemParameters_TransactionTypeUA_AccountCharges;
}

@FindBy(xpath = "//*[contains(text(),'CIF Charges')]")
private WebElement csm_SystemParameters_TransactionTypeUA_CIFCharges;
public WebElement csmSystemParameters_TransactionTypeUA_CIFCharges()
{
	return csm_SystemParameters_TransactionTypeUA_CIFCharges;
}

public String accountAddUnderAccountCharges = "//table[@id='tab24_GridTbl_Id_P024MA']//tr//input";


@FindBy(xpath = "//td[@id='add_tab24_GridTbl_Id_P024MA']")
private WebElement csm_AddButtonUnder_AccountCharges;
public WebElement csmAddButtonUnder_AccountCharges()
{
	return csm_AddButtonUnder_AccountCharges;
}

@FindBy(xpath = "//td[@id='del_tab24_GridTbl_Id_P024MA']")
private WebElement csm_DeleteButtonUnder_AccountCharges;
public WebElement csmDeleteButtonUnder_AccountCharges()
{
	return csm_DeleteButtonUnder_AccountCharges;
}

@FindBy(xpath = "//td[@id='add_tab25_GridTbl_Id_P024MA']")
private WebElement csm_AddButtonUnder_CIFCharges;
public WebElement csmAddButtonUnder_CIFCharges()
{
	return csm_AddButtonUnder_CIFCharges;
}

@FindBy(xpath = "//td[@id='del_tab25_GridTbl_Id_P024MA']")
private WebElement csm_DeleteButtonUnder_CIFCharges;
public WebElement csmDeleteButtonUnder_CIFCharges()
{
	return csm_DeleteButtonUnder_CIFCharges;
}

@FindBy(xpath="//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE']")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFCharges;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFCharges()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFCharges;
}


@FindBy(xpath="(//a[@class='ui-dialog-titlebar-close ui-corner-all'])[2]")
private WebElement csm_CloseMemoUnderCharges;
public WebElement csmCloseMemoUnderCharges()
{
	return csm_CloseMemoUnderCharges;
}

@FindBy(xpath = "(//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE'])[2]")
private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input2;
public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput2()
{
	return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input2;
}

@FindBy(xpath = "(//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE'])[3]")
private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input3;
public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput3()
{
	return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input3;
}

@FindBy(xpath = "(//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE'])[4]")
private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input4;
public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput4()
{
	return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input4;
}

@FindBy(xpath = "(//input[@name='lookupTxt_ctstrxtypeChargesVO.CHARGE_CODE'])[5]")
private WebElement csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input5;
public WebElement csmSystemParametersTransactionTypeUAChargesSchemaInput5()
{
	return csm_SystemParameters_TransactionTypeUA_ChargesSchema_Input5;
}

@FindBy(xpath="//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE']")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges1;
}

@FindBy(xpath="(//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE'])[2]")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges2;
}

@FindBy(xpath="(//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE'])[3]")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges3;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges3()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges3;
}

@FindBy(xpath="(//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE'])[4]")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges4;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges4()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges4;
}

@FindBy(xpath="(//input[@name='lookupTxt_ctstrxtypeChargesVO.ENTITY_CODE'])[5]")
private WebElement csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges5;
public WebElement csmSystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges5()
{
	return csm_SystemParameters_TransactionTypeUA_AddCIFNoUnderCIFTypeCharges5;
}


@FindBy(xpath="//input[@type='checkbox'][@id='forbid_multi_cif_trx_P024MA']")
private WebElement csm_SystemParameters_TransactionTypeUA_ForbidMultipleCIFCheckBox;
public WebElement csmSystemParameters_TransactionTypeUA_ForbidMultipleCIFCheckBox()
{
	return csm_SystemParameters_TransactionTypeUA_ForbidMultipleCIFCheckBox;
}

}