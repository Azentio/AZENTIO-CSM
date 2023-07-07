package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransferAccounts_Obj_615 {
	
	WebDriver driver;
	
	public CSM_TransferAccounts_Obj_615(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//td[text()='Transfer Accounts']")
private WebElement csm_TransferAccounts_Menu_615;
public WebElement csmTransferAccountsMenu_615()
{
	return csm_TransferAccounts_Menu_615;
}
@FindBy(id="TA001MT")
private WebElement csm_TransferAccounts_MaintenanceTab_615;
public WebElement csmTransferAccountsMaintenanceTab_615()
{
	return csm_TransferAccounts_MaintenanceTab_615;
}
@FindBy(xpath="//label[text()='Transfer Type']//parent::td//following-sibling::td//select")
private WebElement csm_TransferAccounts_TransferType_615;
public WebElement csmTransferAccountsTransferType615()
{
	return csm_TransferAccounts_TransferType_615;
}
@FindBy(id="lookuptxt_statusReasonCode_TA001MT")
private WebElement csm_TransferAccounts_Reason_Input_615;
public WebElement csmTransferAccountsReasonInput615()
{
	return csm_TransferAccounts_Reason_Input_615;
}
@FindBy(xpath="//a[text()='Transfer Accounts / Maintenance']")
private WebElement csm_TransferAccounts_RandomClick_615;
public WebElement csmTransferAccountsRandomClick615()
{
	return csm_TransferAccounts_RandomClick_615;
}
@FindBy(xpath="//input[@id='rangeDef_TA001MTC']")
private WebElement csm_TransferAccounts_RangesDefinition_Input_615;
public WebElement csmTransferAccountsRangesDefinitionInput615()
{
	return csm_TransferAccounts_RangesDefinition_Input_615;
}
@FindBy(xpath="//input[@id='lookuptxt_original_CIF_TA001MT']")
private WebElement csm_TransferAccounts_Cif_Input_615;
public WebElement csmTransferAccountsCifInput615()
{
	return csm_TransferAccounts_Cif_Input_615;
}
@FindBy(xpath="//input[@id='lookuptxt_original_gl_TA001MT']")
private WebElement csm_TransferAccounts_OriginalGl_Input_615;
public WebElement csmTransferAccountsOriginalGlInput615()
{
	return csm_TransferAccounts_OriginalGl_Input_615;
}
@FindBy(xpath="//input[@id='lookuptxt_destination_gl_TA001MT']")
private WebElement csm_TransferAccounts_DestinationGl_Input_615;
public WebElement csmTransferAccountsDestinationGlInput615()
{
	return csm_TransferAccounts_DestinationGl_Input_615;
}
@FindBy(xpath="//label[text()='Retrieve ']")
private WebElement csm_TransferAccounts_RetrieveButton_615;
public WebElement csmTransferAccountsRetrieveButton615()
{
	return csm_TransferAccounts_RetrieveButton_615;
}
@FindBy(xpath="//label[text()='Set Exceptions ']")
private WebElement csm_TransferAccounts_SetExceptions_Button_615;
public WebElement csm_TransferAccounts_SetExceptions_Button_615()
{
	return csm_TransferAccounts_SetExceptions_Button_615;
}
@FindBy(xpath="//td[@id='add_transferAccountsCriteriaTbl_Id_TA001MT']")
private WebElement csm_TransferAccounts_SetExceptions_Add_Button_615;
public WebElement csmTransferAccountsSetExceptionsAddButton615()
{
	return csm_TransferAccounts_SetExceptions_Add_Button_615;
}
@FindBy(xpath="//td[@id='td_transferAccountsCriteriaTbl_Id_TA001MT_1_transferAccountsCriteriaVO.EXCEPTION_FACTOR']")
private WebElement csm_TransferAccounts_SetExceptions_ExceptionFactor_615;
public WebElement csmTransferAccountsSetExceptionsExceptionFactor615()
{
	return csm_TransferAccounts_SetExceptions_ExceptionFactor_615;
}
@FindBy(xpath="//td[@tdlabel='Exception Factor']//select")
private WebElement csm_TransferAccounts_SetExceptions_ExceptionFactor_Dropdown_615;
public WebElement csmTransferAccountsSetExceptionsExceptionFactorDropdown615()
{
	return csm_TransferAccounts_SetExceptions_ExceptionFactor_Dropdown_615;
}
@FindBy(xpath="//input[@name='lookupTxt_transferAccountsCriteriaVO.CRITERIA_VALUE']")
private WebElement csm_TransferAccounts_SetExceptions_ExceptionValue_Input_615;
public WebElement csmTransferAccountsSetExceptionsExceptionValueInput615()
{
	return csm_TransferAccounts_SetExceptions_ExceptionValue_Input_615;
}
@FindBy(xpath="//span[text()='Ok']")
private WebElement csm_TransferAccounts_SetExceptions_ReasonScreen_OkButton_615;
public WebElement csmTransferAccountsSetExceptionsReasonScreenOkButton615()
{
	return csm_TransferAccounts_SetExceptions_ReasonScreen_OkButton_615;
}
@FindBy(xpath="//span[text()='Approve']")
private WebElement csm_TransferAccounts_Approve_Submenu_615;
public WebElement csm_TransferAccounts_Approve_Submenu_615()
{
	return csm_TransferAccounts_Approve_Submenu_615;
}
@FindBy(xpath="(//input[@name='FROM_ACC_GL'])[2]")
private WebElement csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615;
public WebElement csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615()
{
	return csm_TransferAccounts_ApproveSubmenu_FromGl_Input_615;
}
@FindBy(xpath="//td[@id='td_transferAccountsListGridTbl_Id_TA001P_1_cts_TRSFR_ACCVO.BATCH_NO']")
private WebElement csm_TransferAccounts_ApproveSubmenu_DoubleClick_615;
public WebElement csm_TransferAccounts_ApproveSubmenu_DoubleClick_615()
{
	return csm_TransferAccounts_ApproveSubmenu_DoubleClick_615;
}
@FindBy(xpath="//label[@id='transferAccountsMaintFormId_TA001P_approve_key']")
private WebElement csm_TransferAccounts_ApproveSubmenu_ApproveButton_615;
public WebElement csm_TransferAccounts_ApproveSubmenu_ApproveButton_615()
{
	return csm_TransferAccounts_ApproveSubmenu_ApproveButton_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_BR']")
private WebElement csm_TransferAccounts_FromAccount_BranchCode_Input_615;
public WebElement csm_TransferAccounts_FromAccount_BranchCode_Input_615()
{
	return csm_TransferAccounts_FromAccount_BranchCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CY']")
private WebElement csm_TransferAccounts_FromAccount_CurrencyCode_Input_615;
public WebElement csm_TransferAccounts_FromAccount_CurrencyCode_Input_615()
{
	return csm_TransferAccounts_FromAccount_CurrencyCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_GL']")
private WebElement csm_TransferAccounts_FromAccount_GlCode_Input_615;
public WebElement csm_TransferAccounts_FromAccount_GlCode_Input_615()
{
	return csm_TransferAccounts_FromAccount_GlCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.FROM_ACC_CIF']")
private WebElement csm_TransferAccounts_FromAccount_CifCode_Input_615;
public WebElement csm_TransferAccounts_FromAccount_CifCode_Input_615()
{
	return csm_TransferAccounts_FromAccount_CifCode_Input_615;
}
@FindBy(xpath="//input[@id='lookuptxt_from_acc_sl_TA001MT']")
private WebElement csm_TransferAccounts_FromAccount_SerialNo_Input_615;
public WebElement csm_TransferAccounts_FromAccount_SerialNo_Input_615()
{
	return csm_TransferAccounts_FromAccount_SerialNo_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_BR']")
private WebElement csm_TransferAccounts_ToAccount_BranchCode_Input_615;
public WebElement csm_TransferAccounts_ToAccount_BranchCode_Input_615()
{
	return csm_TransferAccounts_ToAccount_BranchCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CY']")
private WebElement csm_TransferAccounts_ToAccount_CurrencyCode_Input_615;
public WebElement csm_TransferAccounts_ToAccount_CurrencyCode_Input_615()
{
	return csm_TransferAccounts_ToAccount_CurrencyCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_GL']")
private WebElement csm_TransferAccounts_ToAccount_GlCode_Input_615;
public WebElement csm_TransferAccounts_ToAccount_GlCode_Input_615()
{
	return csm_TransferAccounts_ToAccount_GlCode_Input_615;
}
@FindBy(xpath="//input[@name='transferAccountsCO.cts_TRSFR_ACCVO.TO_ACC_CIF']")
private WebElement csm_TransferAccounts_ToAccount_CifCode_Input_615;
public WebElement csm_TransferAccounts_ToAccount_CifCode_Input_615()
{
	return csm_TransferAccounts_ToAccount_CifCode_Input_615;
}
@FindBy(xpath="//input[@id='lookuptxt_to_acc_sl_TA001MT']")
private WebElement csm_TransferAccounts_ToAccount_SerialNo_Input_615;
public WebElement csm_TransferAccounts_ToAccount_SerialNo_Input_615()
{
	return csm_TransferAccounts_ToAccount_SerialNo_Input_615;
}
@FindBy(xpath="//label[text()='Save ']")
private WebElement csm_TransferAccounts_Save_Button_615;
public WebElement csm_TransferAccounts_Save_Button_615()
{
	return csm_TransferAccounts_Save_Button_615;
}
@FindBy(xpath="//input[@id='lookuptxt_dest_branch_TA001MT']")
private WebElement csm_TransferAccounts_Destination_Branch_Input_Field_615;
public WebElement csm_TransferAccounts_Destination_Branch_Input_Field_615()
{
	return csm_TransferAccounts_Destination_Branch_Input_Field_615;
}
@FindBy(id="TA001T")
private WebElement csm_TransferAccounts_Transfer_SubMenu_615;
public WebElement csm_TransferAccounts_Transfer_SubMenu_615()
{
	return csm_TransferAccounts_Transfer_SubMenu_615;
}
@FindBy(id="transferAccountsListGridTbl_Id_TA001T_gs_cts_TRSFR_ACCVO.BATCH_NO")
private WebElement csm_TransferAccounts_Transfer_SubMenu_BatchNo_615;
public WebElement csm_TransferAccounts_Transfer_SubMenu_BatchNo_615()
{
	return csm_TransferAccounts_Transfer_SubMenu_BatchNo_615;
}
@FindBy(id="td_transferAccountsListGridTbl_Id_TA001T_1_cts_TRSFR_ACCVO.BATCH_NO")
private WebElement csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615;
public WebElement csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615()
{
	return csm_TransferAccounts_Transfer_SubMenu_BatchNo_DoubleClick_615;
}
@FindBy(id="transferAccountsMaintFormId_TA001T_Transfer_key")
private WebElement csm_TransferAccounts_Transfer_SubMenu_TransferButton_615;
public WebElement csm_TransferAccounts_Transfer_SubMenu_TransferButton_615()
{
	return csm_TransferAccounts_Transfer_SubMenu_TransferButton_615;
}

//042
@FindBy(xpath="//td[text()='Accounts']")
private WebElement csm_Accounts_MenuOptions_615;
public WebElement csm_Accounts_MenuOptions_615()
{
	return csm_Accounts_MenuOptions_615;
}
@FindBy(xpath="//td[text()='General Accounts']")
private WebElement csm_Accounts_GeneralAccounts_615;
public WebElement csm_Accounts_GeneralAccounts_615()
{
	return csm_Accounts_GeneralAccounts_615;
}
@FindBy(xpath="//span[text()='Opening']")
private WebElement csm_Accounts_GeneralAccounts_Opening_615;
public WebElement csm_Accounts_GeneralAccounts_Opening_615()
{
	return csm_Accounts_GeneralAccounts_Opening_615;
}
@FindBy(xpath="//a[@id='infoBarSearchButton_TA001MT']")
private WebElement csm_TransferAccounts_Maintenance_SearchIcon_615;
public WebElement csm_TransferAccounts_Maintenance_SearchIcon_615()
{
	return csm_TransferAccounts_Maintenance_SearchIcon_615;
}
@FindBy(xpath="//input[@id='transferAccountsListGridTbl_Id_TA001MT_gs_cts_TRSFR_ACCVO.BATCH_NO']")
private WebElement csm_TransferAccounts_Maintenance_BatchNo_615;
public WebElement csm_TransferAccounts_Maintenance_BatchNo_615()
{
	return csm_TransferAccounts_Maintenance_BatchNo_615;
}
@FindBy(xpath="//td[text()='Authorized']")
private WebElement csm_TransferAccounts_Maintenance_Validate_Status_615;
public WebElement csm_TransferAccounts_Maintenance_Validate_Status_615()
{
	return csm_TransferAccounts_Maintenance_Validate_Status_615;
}
@FindBy(xpath="//span[text()='Maintenance']")
private WebElement csm_AccountsMenu_Maintenance_SubMenu_615;
public WebElement csm_AccountsMenu_Maintenance_SubMenu_615()
{
	return csm_AccountsMenu_Maintenance_SubMenu_615;
}
@FindBy(id="generalAccountsGridTbl_Id_A002MA_gs_amfVO.GL_CODE")
private WebElement csm_AccountsMenu_Gl_Code_Input_615;
public WebElement csm_AccountsMenu_Gl_Code_Input_615()
{
	return csm_AccountsMenu_Gl_Code_Input_615;
}





}
