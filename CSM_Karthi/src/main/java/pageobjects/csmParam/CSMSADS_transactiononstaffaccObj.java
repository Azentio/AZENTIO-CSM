package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMSADS_transactiononstaffaccObj {
	WebDriver driver;
	public CSMSADS_transactiononstaffaccObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement CSMSADS_ParametersMainMenu;
	public WebElement CSMSADSParametersMainMenu() {
		return CSMSADS_ParametersMainMenu;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement CSMSADS_AccountRestrictionsInParameters;
	public WebElement CSMSADSAccountRestrictionsInParameters() {
		return CSMSADS_AccountRestrictionsInParameters;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement CSMSADS_MaintenanceInAccountRestrictions;
	public WebElement CSMSADSMaintenanceInAccountRestrictions() {
		return CSMSADS_MaintenanceInAccountRestrictions;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE']")
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;
	public WebElement CSMSADSEnterTheValueInCodeUnderMaintenance() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE_TYPE_DESC']")
	private WebElement CSMSADS_EnterTheValueInDescriptionUnderMaintenance;
	public WebElement CSMSADSEnterTheValueInDescriptionUnderMaintenance() {
		return CSMSADS_EnterTheValueInDescriptionUnderMaintenance;
	}
//	
//	@FindBy(id="personal_account_access_UR00M")
//	private WebElement CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;
//	public WebElement CSMSADSCheckBoxInGrantAccessToPersonalAccounts() {
//		return CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;
//	}

	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInApplicationsOROPTs;
	public WebElement CSMSADSRootIconInApplicationsOROPTs() {
		return CSMSADS_RootIconInApplicationsOROPTs;
	}

	@FindBy(id="td_ctsRestOptTreeGridTbl_Id_UR00M_7_progDesc")
	private WebElement CSMSADS_RADMApplicationInApplicationsOROPTs;
	public WebElement CSMSADSRADMApplicationInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationInApplicationsOROPTs;
	}

	@FindBy(id="RADM__RADM_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;
	public WebElement CSMSADSRADMApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RADMApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(id="td_ctsRestOptTreeGridTbl_Id_UR00M_8_progDesc")
	private WebElement CSMSADS_RETApplicationInApplicationsOROPTs;
	public WebElement CSMSADSRETApplicationInApplicationsOROPTs() {
		return CSMSADS_RETApplicationInApplicationsOROPTs;
	}

	@FindBy(id="RET__RET_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;
	public WebElement CSMSADSRETApplicationCheckboxInApplicationsOROPTs() {
		return CSMSADS_RETApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement CSMSADS_RootIconInCompaniesORBranchesInMaintenance;
	public WebElement CSMSADSRootIconInCompaniesORBranchesInMaintenance() {
		return CSMSADS_RootIconInCompaniesORBranchesInMaintenance;
	}

	@FindBy(id="td_ctsRestBranchesTreeGridTbl_Id_UR00M_11_progDesc")
	private WebElement CSMSADS_1BAJapplicationInCompaniesORBranches;
	public WebElement CSMSADS1BAJapplicationInCompaniesORBranches() {
		return CSMSADS_1BAJapplicationInCompaniesORBranches;
	}

	@FindBy(id="ROOT__1__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M")
	private WebElement CSMSADS_1BAJApplicationCheckboxInCompaniesORBranches;
	public WebElement CSMSADS1BAJApplicationCheckboxInCompaniesORBranches() {
		return CSMSADS_1BAJApplicationCheckboxInCompaniesORBranches;
	}
	@FindBy(xpath = "//span[@id='spanLookup_glCode_no_UR00M']")
	private WebElement CSMSADS_GLCodeEntering;
	public WebElement CSMSADS_GLCodeEntering() {
		return CSMSADS_GLCodeEntering;
	}
	//span[@id='spanLookup_glCode_no_UR00M']
	@FindBy(id="userGridId_UR00M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterTheUserIDInUserIDTab;
	public WebElement CSMSADSEnterTheUserIDInUserIDTab() {
		return CSMSADS_EnterTheUserIDInUserIDTab;
	}

	@FindBy(id="jqg_userGridId_UR00M_1")
	private WebElement CSMSADS_UserIDCheckbox;
	public WebElement CSMSADSUserIDCheckbox() {
		return CSMSADS_UserIDCheckbox;
	}
	
	@FindBy(id="add_restrictionsGridTbl_Id_UR00M")
	private WebElement CSMSADS_AddButtonInRestrictionType;
	public WebElement CSMSADSAddButtonInRestrictionType() {
		return CSMSADS_AddButtonInRestrictionType;
	}

	
	
	@FindBy(xpath="//select[@id='new_1684301655945_restrictionType']")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif() {
		return CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif ;
	}
	@FindBy(xpath="//select[@id='cifRangeRestLevel_UR00M']")	
	private WebElement CSMSADS_accountrestrictionsflag_maintence_restleve;
	public WebElement CSMSADSaccountrestrictionsflagmaintencerestleve() {
		return CSMSADS_accountrestrictionsflag_maintence_restleve ;
	}
	@FindBy(xpath="//td[@id='add_cifGridId_UR00M']")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn() {
		return CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn ;
	}
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-search live-search-ui'])[1]")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_cifno_search;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_cifno_search() {
		return CSMSADS_accountrestrictionsflag_maintence_cifno_search ;
	}
	@FindBy(xpath="//input[@name='CIF_NO']")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_search_cifno;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_search_cifno() {
		return CSMSADS_accountrestrictionsflag_maintence_search_cifno ;
	}
	
	@FindBy(xpath="//input[@id='gridtab_glCode_no_UR00M_gs_GL_CODE']")//td[@id='td_gridtab_glCode_no_UR00M_1_GL_CODE']
	private WebElement CSMSADS_GLCodeoninputbox;
	public WebElement CSMSADS_GLCodeoninputbox() {
		return CSMSADS_GLCodeoninputbox ;}
	
	@FindBy(xpath="//td[@id='td_gridtab_glCode_no_UR00M_1_GL_CODE']")//td[@id='td_gridtab_glCode_no_UR00M_1_GL_CODE']
	private WebElement CSMSADS_GLCodeoninputbox_doubleclicktherecord;
	public WebElement CSMSADS_GLCodeoninputbox_doubleclicktherecord() {
		return CSMSADS_GLCodeoninputbox_doubleclicktherecord ;}
	
	
	@FindBy(xpath="//td[text()='1167']")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_doubleclk;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_doubleclk() {
		return CSMSADS_accountrestrictionsflag_maintence_doubleclk ;
	}
	@FindBy(xpath="//label[text()='Save ']")
	private WebElement CSMSADS_accountrestrictionsflag_maintence_save;
	public WebElement CSMSADS_accountrestrictionsflag_maintence_save() {
		return CSMSADS_accountrestrictionsflag_maintence_save ;
	}

	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopUpMenu;
	public WebElement CSMSADSOkButtonInSuccessPopUpMenu() {
		return CSMSADS_OkButtonInSuccessPopUpMenu;
	}
	
	
	
	@FindBy(xpath="//span[text()='Approve']")
	private WebElement CSMSADS_accountrestrictionsflag_Approve;
	public WebElement CSMSADS_accountrestrictionsflag_Approve() {
		return CSMSADS_accountrestrictionsflag_Approve ;
	}
	@FindBy(xpath="(//input[@name='code'])[2]")
	private WebElement CSMSADS_accountrestrictionsflag_Approve_code;
	public WebElement CSMSADS_accountrestrictionsflag_Approve_code() {
		return CSMSADS_accountrestrictionsflag_Approve_code ;
	}

	@FindBy(id="td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
	private WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen;
	public WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen() {
		return CSMSADS_ClickTheSelectedCodeInApproveScreen;
	}
	@FindBy(xpath="//label[text()='Approve ']")
	private WebElement CSMSADS_accountrestrictionsflag_Approvebtn ;
	public WebElement CSMSADS_accountrestrictionsflag_Approvebtn() {
		return CSMSADS_accountrestrictionsflag_Approvebtn ;
		
		///CSM core login------------------------------------------------------------------------------------------------------------
	}
	@FindBy(xpath = "//div[@id='_selenuimQUER']/child::h3")
	private WebElement CSM_QueriesMainMenu;

	public WebElement CSM_QueriesMainMenu() {
		return CSM_QueriesMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement CSM_StatementOfAccountsInQueries;

	public WebElement CSM_StatementOfAccountsInQueries() {
		return CSM_StatementOfAccountsInQueries;
	}
	
	@FindBy(id="QUER001T")
	private WebElement CSM_ByTradeDateUnderStatementOfAccountsSubMenu;

	public WebElement CSMByTradeDateUnderStatementOfAccountsSubMenu() {
		return CSM_ByTradeDateUnderStatementOfAccountsSubMenu;
	}
	
	@FindBy(id="accCy_QUER001T")
	private WebElement CSM_CurrencyValueIinAccountUnderByTradeDateScreen;

	public WebElement CSMCurrencyValueIinAccountUnderByTradeDateScreen() {
		return CSM_CurrencyValueIinAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accGl_QUER001T")
	private WebElement CSM_GLCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMGLCodeInAccountUnderByTradeDateScreen() {
		return CSM_GLCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accCif_QUER001T")
	private WebElement CSM_CIFCodeInAccountUnderByTradeDateScreen;

	public WebElement CSMCIFCodeInAccountUnderByTradeDateScreen() {
		return CSM_CIFCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="lookuptxt_accSl_QUER001T")
	private WebElement CSM_SerialInAccountUnderByTradeDateScreen;

	public WebElement CSMSerialInAccountUnderByTradeDateScreen() {
		return CSM_SerialInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="sfsdfsdf")
	private WebElement CSM_RetrieveButtonUnderByTradeDateScreen;

	public WebElement CSMRetrieveButtonUnderByTradeDateScreen() {
		return CSM_RetrieveButtonUnderByTradeDateScreen;
	}
//	
//	@FindBy(id="_popup_path_sol_ok")
//	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;
//
//	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
//		return CSM_OkButtonInAccessDeniedPopUpMenu;
//	}
	
		
}

	


