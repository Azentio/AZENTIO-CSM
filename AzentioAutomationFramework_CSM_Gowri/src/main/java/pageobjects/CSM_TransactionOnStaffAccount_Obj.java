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










}
