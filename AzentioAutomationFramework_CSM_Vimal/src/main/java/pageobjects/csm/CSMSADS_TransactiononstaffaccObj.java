package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMSADS_TransactiononstaffaccObj {
	WebDriver driver;

	public CSMSADS_TransactiononstaffaccObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
//******************************************** under the restriction  *******************************//
	@FindBy(xpath = "//div[@id='_selenuim_CATEG_1']//child::td[text()='Parameters']")
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

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE']")//id="code_UR00M"
	private WebElement CSMSADS_EnterTheValueInCodeUnderMaintenance;

	public WebElement CSMSADSEnterTheValueInCodeUnderMaintenance() {
		return CSMSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE_TYPE_DESC']")
	private WebElement CSMSADS_EnterTheValueInDescriptionUnderMaintenance;

	public WebElement CSMSADSEnterTheValueInDescriptionUnderMaintenance() {
		return CSMSADS_EnterTheValueInDescriptionUnderMaintenance;
	}
	
	@FindBy(id="personal_account_access_UR00M")
	private WebElement CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;

	public WebElement CSMSADSCheckBoxInGrantAccessToPersonalAccounts() {
		return CSMSADS_CheckBoxInGrantAccessToPersonalAccounts;
	}

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

	@FindBy(id="userGridId_UR00M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterTheUserIDInUserIDTab;

	public WebElement CSMSADSEnterTheUserIDInUserIDTab() {
		return CSMSADS_EnterTheUserIDInUserIDTab;
	}
	
	@FindBy(id="td_userGridId_UR00M_1_usrVO.USER_ID")
	private WebElement CSMSADS_UserIDName;

	public WebElement CSMSADSUserIDName() {
		return CSMSADS_UserIDName;
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
	
	@FindBy(xpath="//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement CSMSADS_SelectTIconUnderRestrictionType;

	public WebElement CSMSADSSelectTIconUnderRestrictionType() {
		return CSMSADS_SelectTIconUnderRestrictionType;
	}		
	
	@FindBy(id="spanLookup_glCode_no_UR00M")
	private WebElement CSMSADS_SearchTheGLCode;

	public WebElement CSMSADSSearchTheGLCode() {
		return CSMSADS_SearchTheGLCode;
	}
	
	@FindBy(id="gridtab_glCode_no_UR00M_gs_GL_CODE")
	private WebElement CSMSADS_EnterTheGLCodeInSearchPopUp;

	public WebElement CSMSADSEnterTheGLCodeInSearchPopUp() {
		return CSMSADS_EnterTheGLCodeInSearchPopUp;
	}
	
	@FindBy(id="td_gridtab_glCode_no_UR00M_1_GL_CODE")
	private WebElement CSMSADS_ClickSearchedGLCodeInSearchPopup;

	public WebElement CSMSADSClickSearchedGLCodeInSearchPopup() {
		return CSMSADS_ClickSearchedGLCodeInSearchPopup;
	}
	
	@FindBy(xpath = "//select[@name='ctsRestrictionsCO.cifRangeRestLevel']")
	private WebElement CSMSADS_AccountBalanceSelectTabInRestrictionLevel;

	public WebElement CSMSADSAccountBalanceSelectTabInRestrictionLevel() {
		return CSMSADS_AccountBalanceSelectTabInRestrictionLevel;
	}
	
	@FindBy(id="add_cifGridId_UR00M")
	private WebElement CSMSADS_AddButtonUnderRestrictionType;

	public WebElement CSMSADS_AddButtonUnderRestrictionType() {
		return CSMSADS_AddButtonUnderRestrictionType;
	}
	
	@FindBy(xpath = "//td[@id='td_cifGridId_UR00M_1_CIF_NO']//child::span//preceding-sibling::span/span")
	private WebElement CSMSADS_SearchIconInCIFNOUnderTheRestrictionLevel;

	public WebElement CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel() {
		return CSMSADS_SearchIconInCIFNOUnderTheRestrictionLevel;
	}
	
	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement CSMSADS_EnterTheCIFNoInTheSearchBox;

	public WebElement CSMSADSEnterTheCIFNoInTheSearchBox() {
		return CSMSADS_EnterTheCIFNoInTheSearchBox;
	}
	
	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement CSMSADS_SearchedCIFNoInSearchPopup;

	public WebElement CSMSADS_SearchedCIFNoInSearchPopup() {
		return CSMSADS_SearchedCIFNoInSearchPopup;
	}
	
	@FindBy(id="ctsRestrictionsMaint_save_UR00M")
	private WebElement CSMSADS_SaveButtonUnderMaintenanceScreen;

	public WebElement CSMSADS_SaveButtonUnderMaintenanceScreen() {
		return CSMSADS_SaveButtonUnderMaintenanceScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSOkButtonInSuccessPopUpMenu() {
		return CSMSADS_OkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(id="UR00P")
	private WebElement CSMSADS_ApproveUnderAccountRestrictions;

	public WebElement CSMSADSApproveUnderAccountRestrictions() {
		return CSMSADS_ApproveUnderAccountRestrictions;
	}
	
	@FindBy(id="ctsRestrictionsListGridTbl_Id_UR00P_gs_code")
	private WebElement CSMSADS_EnterCodeInApproveScreen;

	public WebElement CSMSADSEnterCodeInApproveScreen() {
		return CSMSADS_EnterCodeInApproveScreen;
	}
	
	@FindBy(id="td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
	private WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen;

	public WebElement CSMSADS_ClickTheSelectedCodeInApproveScreen() {
		return CSMSADS_ClickTheSelectedCodeInApproveScreen;
	}
	
	@FindBy(id="ctsRestrictionsMaint_approve_UR00P")
	private WebElement CSMSADS_ApproveButtonInApproveScreen;

	public WebElement CSMSADSApproveButtonInApproveScreen() {
		return CSMSADS_ApproveButtonInApproveScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSMSADS_ClickOkButtonInSuccessPopUpMenu;

	public WebElement CSMSADSClickOkButtonInSuccessPopUpMenu() {
		return CSMSADS_ClickOkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(xpath = "//td[text()='User']//ancestor::a")
	private WebElement CSMSADS_UserInParametersUnderSADSApplication;

	public WebElement CSMSADSUserInParametersUnderSADSApplication() {
		return CSMSADS_UserInParametersUnderSADSApplication;
	}
	
	@FindBy(id="P005M")
	private WebElement CSMSADS_MaintenanceInUserUnderParameters;

	public WebElement CSMSADSMaintenanceInUserUnderParameters() {
		return CSMSADS_MaintenanceInUserUnderParameters;
	}
	
	@FindBy(id="infoBarSearchButton_P005M")
	private WebElement CSMSADS_SearchButtonUnderMaintenanceScreen;

	public WebElement CSMSADSSearchButtonUnderMaintenanceScreen() {
		return CSMSADS_SearchButtonUnderMaintenanceScreen;
	}
	
	@FindBy(id="userListGridTbl_Id_P005M_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterUserIDInSearchUnderMaintenanceScreen;

	public WebElement CSMSADSEnterUserIDInSearchUnderMaintenanceScreen() {
		return CSMSADS_EnterUserIDInSearchUnderMaintenanceScreen;
	}
	
	@FindBy(id="spanLookup_COMP_CODE_P005M")
	private WebElement CSMSADS_CompanySearchButtonInEmployeeDetails;

	public WebElement CSMSADSCompanySearchButtonInEmployeeDetails() {
		return CSMSADS_CompanySearchButtonInEmployeeDetails;
	}		
	
	@FindBy(id="gridtab_COMP_CODE_P005M_gs_COMP_CODE")
	private WebElement CSMSADS_CompanyCodeInSearchBox;

	public WebElement CSMSADSCompanyCodeInSearchBox() {
		return CSMSADS_CompanyCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_COMP_CODE_P005M_1_COMP_CODE")
	private WebElement CSMSADS_DoubleClickOnTheCompanySearchedCode;

	public WebElement CSMSADSDoubleClickOnTheCompanySearchedCode() {
		return CSMSADS_DoubleClickOnTheCompanySearchedCode;
	}		
	
	@FindBy(id="spanLookup_BRANCH_CODE_P005M")
	private WebElement CSMSADS_BranchSearchButtonInEmployeeDetails;

	public WebElement CSMSADSBranchSearchButtonInEmployeeDetails() {
		return CSMSADS_BranchSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_BRANCH_CODE_P005M_gs_BRANCH_CODE")
	private WebElement CSMSADS_BranchCodeInSearchBox;

	public WebElement CSMSADSBranchCodeInSearchBox() {
		return CSMSADS_BranchCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_BRANCH_CODE_P005M_1_BRANCH_CODE")
	private WebElement CSMSADS_DoubleClickOnTheBranchSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheBranchSearchedCode() {
		return CSMSADS_DoubleClickOnTheBranchSearchedCode;
	}
	
	@FindBy(id="spanLookup_division_P005M")
	private WebElement CSMSADS_DivisionSearchButtonInEmployeeDetails;

	public WebElement CSMSADSDivisionSearchButtonInEmployeeDetails() {
		return CSMSADS_DivisionSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_division_P005M_gs_DIVISION_CODE")
	private WebElement CSMSADS_DivisionCodeInSearchBox;

	public WebElement CSMSADSDivisionCodeInSearchBox() {
		return CSMSADS_DivisionCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_division_P005M_1_DIVISION_CODE")
	private WebElement CSMSADS_DoubleClickOnTheDivisionSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheDivisionSearchedCode() {
		return CSMSADS_DoubleClickOnTheDivisionSearchedCode;
	}
	
	@FindBy(id="spanLookup_Departmnt_P005M")
	private WebElement CSMSADS_DepartmentSearchButtonInEmployeeDetails;

	public WebElement CSMSADSDepartmentSearchButtonInEmployeeDetails() {
		return CSMSADS_DepartmentSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_Departmnt_P005M_gs_DEPT_CODE")
	private WebElement CSMSADS_DepartmentCodeInSearchBox;

	public WebElement CSMSADSDepartmentCodeInSearchBox() {
		return CSMSADS_DepartmentCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_Departmnt_P005M_1_DEPT_CODE")
	private WebElement CSMSADS_DoubleClickOnTheDepartmentSearchedCode;

	public WebElement CSMSADSDoubleClickOnTheDepartmentSearchedCode() {
		return CSMSADS_DoubleClickOnTheDepartmentSearchedCode;
	}
	
	@FindBy(id="td_userListGridTbl_Id_P005M_1_usrVO.USER_ID")
	private WebElement CSMSADS_SearchedIDUnderMaintenanceScreen;

	public WebElement CSMSADSSearchedIDUnderMaintenanceScreen() {
		return CSMSADS_SearchedIDUnderMaintenanceScreen;
	}
	
	@FindBy(id="spanLookup_CIF_NO_P005M")
	private WebElement CSMSADS_SearchButtonInEmployeeDetails;

	public WebElement CSMSADSSearchButtonInEmployeeDetails() {
		return CSMSADS_SearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_CIF_NO_P005M_gs_CIF_NO")
	private WebElement CSMSADS_CIFNoInSearchBox;

	public WebElement CSMSADSCIFNoInSearchBox() {
		return CSMSADS_CIFNoInSearchBox;
	}
	
	@FindBy(id="td_gridtab_CIF_NO_P005M_1_CIF_NO")
	private WebElement CSMSADS_CSearchedCIFNOInSearchBox;

	public WebElement CSMSADSCSearchedCIFNOInSearchBox() {
		return CSMSADS_CSearchedCIFNOInSearchBox;
	}
	
	@FindBy(id="physical_user_P005M")
	private WebElement CSMSADS_CheckThePhysicalUserCheckBoxInPrivilege;

	public WebElement CSMSADSCheckThePhysicalUserCheckBoxInPrivilege() {
		return CSMSADS_CheckThePhysicalUserCheckBoxInPrivilege;
	}
	
	@FindBy(id="userFormId_P005M_Save_key")
	private WebElement CSMSADS_SaveButtonInMaintenanceScreen;

	public WebElement CSMSADSSaveButtonInMaintenanceScreen() {
		return CSMSADS_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopUpInUser;

	public WebElement CSMSADSOkButtonInSuccessPopUpInUser() {
		return CSMSADS_OkButtonInSuccessPopUpInUser;
	}
	
//******************************************* Approve User ***************************************//
	
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement CSMSADS_ParameterInSADSApplication;

	public WebElement CSMSADSParameterInSADSApplication() {
		return CSMSADS_ParameterInSADSApplication;
	}
	
	@FindBy(xpath = "//span[text()='Approve']//ancestor::a")
	private WebElement CSMSADS_ApproveInUserUnderParameters;

	public WebElement CSMSADSApproveInUserUnderParameters() {
		return CSMSADS_ApproveInUserUnderParameters;
	}
	
	@FindBy(id="infoBarSearchButton_P005P")
	private WebElement CSMSADS_SearchButtonUnderApproveScreen;

	public WebElement CSMSADSSearchButtonUnderApproveScreen() {
		return CSMSADS_SearchButtonUnderApproveScreen;
	}
	
	@FindBy(id="userListGridTbl_Id_P005P_gs_usrVO.USER_ID")
	private WebElement CSMSADS_EnterUserIDInSearchUnderApproveScreen;

	public WebElement CSMSADSEnterUserIDInSearchUnderApproveScreen() {
		return CSMSADS_EnterUserIDInSearchUnderApproveScreen;
	}
	
	@FindBy(id="td_userListGridTbl_Id_P005P_1_usrVO.USER_ID")
	private WebElement CSMSADS_SearchedIDunderApproveScreen;

	public WebElement CSMSADSSearchedIDunderApproveScreen() {
		return CSMSADS_SearchedIDunderApproveScreen;
	}
	
	@FindBy(id="userFormId_P005P_Approve_key")
	private WebElement CSMSADS_ClickApproveButtonInApproveScreen;

	public WebElement CSMSADS_ClickApproveButtonInApproveScreen() {
		return CSMSADS_ClickApproveButtonInApproveScreen;
	}	
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSMSADS_OkButtonInSuccessPopupInUserApprove;

	public WebElement CSMSADSOkButtonInSuccessPopupInUserApprove() {
		return CSMSADS_OkButtonInSuccessPopupInUserApprove;
	}
	

//******************************************* Transaction  *******************************************//
	
	
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
	
//	"//label[@id='Application_Running_Date_key']//preceding::button"
	
	@FindBy(xpath = "//button[@value='Submit']")
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
	
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement CSM_TransactionsMainMenu;

	public WebElement CSMTransactionsMainMenu() {
		return CSM_TransactionsMainMenu;
	}
	
	@FindBy(id="D001MT")
	private WebElement CSM_MaintenanceUnderTransactions;

	public WebElement CSMMaintenanceUnderTransactions() {
		return CSM_MaintenanceUnderTransactions;
	}
	
	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement CSM_TRXTypeInMaintenanceScreen;

	public WebElement CSMTRXTypeInMaintenanceScreen() {
		return CSM_TRXTypeInMaintenanceScreen;
	}
	
//	@FindBy(id="Transactions / Maintenance")
//	private WebElement CSM_TransactionsMaintenanceForLoading;
//
//	public WebElement CSM_TransactionsMaintenanceForLoading() {
//		return CSM_TransactionsMaintenanceForLoading;
//	}
	
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement CSM_BranchCodeInCreditAc;

	public WebElement CSMBranchCodeInCreditAc() {
		return CSM_BranchCodeInCreditAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodeCreditAc;

	public WebElement CSMCurrencyCodeCreditAc() {
		return CSM_CurrencyCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodeCreditAc;

	public WebElement CSMGLCodeCreditAc() {
		return CSM_GLCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInCreditAc;

	public WebElement CSMCIFCodeInCreditAc() {
		return CSM_CIFCodeInCreditAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialInCreditAc;

	public WebElement CSMSerialInCreditAc() {
		return CSM_SerialInCreditAc;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInWarningPopUpMenu;

	public WebElement CSMOkButtonInWarningPopUpMenu() {
		return CSM_OkButtonInWarningPopUpMenu;
	}
	
	@FindBy(id="lookuptxt_trs_cy_D001MT")
	private WebElement CSM_CurrencyInMaintenanceScreen;

	public WebElement CSMCurrencyInMaintenanceScreen() {
		return CSM_CurrencyInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountInMaintenanceScreen;

	public WebElement CSMAmountInMaintenanceScreen() {
		return CSM_AmountInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement CSM_AmountUnderMaintenanceScreen;

	public WebElement CSMAmountUnderMaintenanceScreen() {
		return CSM_AmountUnderMaintenanceScreen;
	}
	
	@FindBy(xpath = "//td[text()='USD']")
	private WebElement CSM_CurrencyName;

	public WebElement CSMCurrencyName() {
		return CSM_CurrencyName;
	}
	
	@FindBy(id="trxMgntSaveBtn_D001MT")
	private WebElement CSM_SaveButtonInMaintenanceScreen;

	public WebElement CSMSaveButtonInMaintenanceScreen() {
		return CSM_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement CSM_GetTheTransactionNo;

	public WebElement CSMGetTheTransactionNo() {
		return CSM_GetTheTransactionNo;
	}
	
	@FindBy(id="D001AU")
	private WebElement CSM_ApproveScreenUnderTransactions;

	public WebElement CSMApproveScreenUnderTransactions() {
		return CSM_ApproveScreenUnderTransactions;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_TransactionNoInApproveScreen;

	public WebElement CSMTransactionNoInApproveScreen() {
		return CSM_TransactionNoInApproveScreen;
	}
	
	@FindBy(id="td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
	private WebElement CSM_DoubleClickOnTheTransactionNo;

	public WebElement CSMDoubleClickOnTheTransactionNo() {
		return CSM_DoubleClickOnTheTransactionNo;
	}	
	
	@FindBy(id="amount_D001AU")
	private WebElement CSM_AmountValue;

	public WebElement CSMAmountValue() {
		return CSM_AmountValue;
	}
			
	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement CSM_ApproveButtonInApproveScreen;

	public WebElement CSMApproveButtonInApproveScreen() {
		return CSM_ApproveButtonInApproveScreen;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement CSMOkButtonInSuccessPopUpMenuForTranscation() {
		return CSM_OkButtonInSuccessPopUpMenuForTranscation;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInSuccessPopUpMenu;

	public WebElement CSMOkButtonInSuccessPopUpMenu() {
		return CSM_OkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimQUER']/child::h3")
	private WebElement CSM_QueriesMainMenu;

	public WebElement CSMQueriesMainMenu() {
		return CSM_QueriesMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement CSM_StatementOfAccountsInQueries;

	public WebElement CSMStatementOfAccountsInQueries() {
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
	
	@FindBy(id="dtOpened_QUER001T")
	private WebElement CSM_FromDateInPeriodicityOfStatement;

	public WebElement CSMFromDateInPeriodicityOfStatement() {
		return CSM_FromDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="dtClosed_QUER001T")
	private WebElement CSM_ToDateInPeriodicityOfStatement;

	public WebElement CSMToDateInPeriodicityOfStatement() {
		return CSM_ToDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="sfsdfsdf")
	private WebElement CSM_RetrieveButtonUnderByTradeDateScreen;

	public WebElement CSMRetrieveButtonUnderByTradeDateScreen() {
		return CSM_RetrieveButtonUnderByTradeDateScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInAccessDeniedPopUpMenu;

	public WebElement CSMOkButtonInAccessDeniedPopUpMenu() {
		return CSM_OkButtonInAccessDeniedPopUpMenu;
	}
	
	@FindBy(xpath = "//div[text()='[293] No access']")
	private WebElement CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;

	public WebElement CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied() {
		return CSM_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;
	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
	private WebElement CSM_ValidateIfTheStatementOfAccountIsDisplayed;

	public WebElement CSMValidateIfTheStatementOfAccountIsDisplayed() {
		return CSM_ValidateIfTheStatementOfAccountIsDisplayed;
	}
	
	//********************************************** No access to Economic sector ********************************************
	
	@FindBy(xpath = "//span[text()='close']//parent::a")
	private WebElement CSM_CloseButtonInViewMemoPopupMenu;

	public WebElement CSMCloseButtonInViewMemoPopupMenu() {
		return CSM_CloseButtonInViewMemoPopupMenu;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_OkButtonInCannotProceedPopUpMenu;

	public WebElement CSMOkButtonInCannotProceedPopUpMenu() {
		return CSM_OkButtonInCannotProceedPopUpMenu;
	}
	
	@FindBy(xpath = "//div[text()='[7078] User Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF']")
	private WebElement CSM_ValidateUserDoesNotHaveAcces;

	public WebElement CSMValidateUserDoesNotHaveAcces() {
		return CSM_ValidateUserDoesNotHaveAcces;
	}
	
	//***************************************** No access to Currency ***************************************
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement CSM_ClickOkButtonInCannotProceedPopupMenu;

	public WebElement CSMClickOkButtonInCannotProceedPopupMenu() {
		return CSM_ClickOkButtonInCannotProceedPopupMenu;
	}
	
	@FindBy(xpath = "//div[text()='User does not have rights to trade with selected Currency.: 144']")
	private WebElement CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;

	public WebElement CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency() {
		return CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;
	}
	
	@FindBy(id="lookuptxt_ctrl_sl_D001MT")
	private WebElement CSM_SerialValue;

	public WebElement CSMSerialValue() {
		return CSM_SerialValue;
	}
	
	//@TRS_10
	
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement CSM_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement CSMOkButtonInWarningPopUpToGoBackToMaintenance() {
		return CSM_OkButtonInWarningPopUpToGoBackToMaintenance;
	}
	
	@FindBy(id="infoBarSearchButton_D001MT")
	private WebElement CSM_SearchButtonInMaintenanceScreen;

	public WebElement CSMSearchButtonInMaintenanceScreen() {
		return CSM_SearchButtonInMaintenanceScreen;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement CSM_EnterTheTransactionNoInSearchBox;

	public WebElement CSMEnterTheTransactionNoInSearchBox() {
		return CSM_EnterTheTransactionNoInSearchBox;
	}
	
	@FindBy(id="td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
	private WebElement CSM_DoubleClickOnTheSearchedTransactionNo;

	public WebElement CSMDoubleClickOnTheSearchedTransactionNo() {
		return CSM_DoubleClickOnTheSearchedTransactionNo;
	}
	
	@FindBy(id="trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement CSM_BookedEntriesInMaintenanceScreen;

	public WebElement CSMBookedEntriesInMaintenanceScreen() {
		return CSM_BookedEntriesInMaintenanceScreen;
	}
	
	@FindBy(id="statementOfAccountsDetGridTbl_Id_QUER001T_gs_hstvo.OP_NO")
	private WebElement CSM_EnterTheOpNoInByTradeDateScreen;

	public WebElement CSMEnterTheOpNoInByTradeDateScreen() {
		return CSM_EnterTheOpNoInByTradeDateScreen;
	}
	
//	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
//	private WebElement CSM_DoubleClickTheSearchedOpNo;
//
//	public WebElement CSMDoubleClickTheSearchedOpNo() {
//		return CSM_DoubleClickTheSearchedOpNo;
//	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement CSM_ValidateTheCreditAmount;

	public WebElement CSMValidateTheCreditAmount() {
		return CSM_ValidateTheCreditAmount;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement CSM_CurrencyCodeDebitAc;

	public WebElement CSMCurrencyCodeDebitAc() {
		return CSM_CurrencyCodeDebitAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement CSM_GLCodeDebitAc;

	public WebElement CSMGLCodeDebitAc() {
		return CSM_GLCodeDebitAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement CSM_CIFCodeInDebitAc;

	public WebElement CSMCIFCodeInDebitAc() {
		return CSM_CIFCodeInDebitAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement CSM_SerialInDebitAc;

	public WebElement CSMSerialInDebitAc() {
		return CSM_SerialInDebitAc;
	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement CSM_ValidateTheDebitAmount;

	public WebElement CSM_ValidateTheDebitAmount() {
		return CSM_ValidateTheDebitAmount;
	}
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmParam_ParametersUndercsmParamApplication;

	public WebElement csmParamParametersUndercsmParamApplication() {
		return csmParam_ParametersUndercsmParamApplication;
	}
	
	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_SystemParametersUnderParametersMainMenu;

	public WebElement csmParamSystemParametersUnderParametersMainMenu() {
		return csmParam_SystemParametersUnderParametersMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Transaction Type']")
	private WebElement csmParam_TransactionTypeUnderSystemParameters;

	public WebElement csmParamTransactionTypeUnderSystemParameters() {
		return csmParam_TransactionTypeUnderSystemParameters;
	}
	
	@FindBy(xpath = "//span[text()='Update After Approve']")
	private WebElement csmParam_UpdateAfterApproveInTransactionType;

	public WebElement csmParamUpdateAfterApproveInTransactionType() {
		return csmParam_UpdateAfterApproveInTransactionType;
	}
	
	@FindBy(id="transactionTypesList_GridTbl_Id_P024MA_gs_ctstrxtypeVO.CODE")
	private WebElement csmParam_EnterTheTrxTypeInCode;

	public WebElement csmParamEnterTheTrxTypeInCode() {
		return csmParam_EnterTheTrxTypeInCode;
	}
	
	@FindBy(id="td_transactionTypesList_GridTbl_Id_P024MA_1_ctstrxtypeVO.CODE")
	private WebElement csmParam_DoubleClickOnTheSearchedCode;

	public WebElement csmParamDoubleClickOnTheSearchedCode() {
		return csmParam_DoubleClickOnTheSearchedCode;
	}
	
	@FindBy(xpath = "//input[@id='multi_branch_P024MA']")
	private WebElement csmParam_CheckTheEnableMultiBranchFlag;

	public WebElement csmParamCheckTheEnableMultiBranchFlag() {
		return csmParam_CheckTheEnableMultiBranchFlag;
	}
	
	@FindBy(xpath = "//label[text()='Update After Approve ']")
	private WebElement csmParam_UpdateAfterApproveButton;

	public WebElement csmParamUpdateAfterApproveButton() {
		return csmParam_UpdateAfterApproveButton;
	}
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement csmParam_OkButtonInConfirmPopUpMenuInUpdateAfterApprove;

	public WebElement csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove() {
		return csmParam_OkButtonInConfirmPopUpMenuInUpdateAfterApprove;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInSuccessPopUpMenuInUpdateAfterApprove;

	public WebElement csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove() {
		return csmParam_OkButtonInSuccessPopUpMenuInUpdateAfterApprove;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement csmParam_ApproveUnderTransactionType;

	public WebElement csmParamApproveUnderTransactionType() {
		return csmParam_ApproveUnderTransactionType;
	}
	
	@FindBy(id="transactionTypesList_GridTbl_Id_P024P_gs_ctstrxtypeVO.CODE")
	private WebElement csmParam_TrxTypeInCodeUnderApproveScreen;

	public WebElement csmParam_TrxTypeInCodeUnderApproveScreen() {
		return csmParam_TrxTypeInCodeUnderApproveScreen;
	}
	
	@FindBy(id="td_transactionTypesList_GridTbl_Id_P024P_1_ctstrxtypeVO.CODE")
	private WebElement csmParam_DoubleClickOnTheSearchedCodeInApproveScreen;

	public WebElement csmParamDoubleClickOnTheSearchedCodeInApproveScreen() {
		return csmParam_DoubleClickOnTheSearchedCodeInApproveScreen;
	}
	
	@FindBy(xpath = "//label[text()='Approve ']")
	private WebElement csmParam_ApproveButtonInApproveScreen;

	public WebElement csmParamApproveButtonInApproveScreen() {
		return csmParam_ApproveButtonInApproveScreen;
	}
	 
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement csmParam_OkButtonInConfirmPopUpUnderApproveScreen;

	public WebElement csmParamOkButtonInConfirmPopUpUnderApproveScreen() {
		return csmParam_OkButtonInConfirmPopUpUnderApproveScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInSuccessPopUpUnderApproveScreen;

	public WebElement csmParam_OkButtonInSuccessPopUpUnderApproveScreen() {
		return csmParam_OkButtonInSuccessPopUpUnderApproveScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen;

	public WebElement csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen() {
		return csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen;
	}
	
//	@FindBy(xpath = "//div[text()='INFORMATION']")
//	private WebElement csmParam_InformationPopUpForUpdateAfterApproveScreen;
//
//	public WebElement csmParam_InformationPopUpForUpdateAfterApproveScreen() {
//		return csmParam_InformationPopUpForUpdateAfterApproveScreen;
//	}
	
	@FindBy(id="back_dated_vdate_P024MA")
	private WebElement csmParam_AllowBackDatedValueDateFlag;

	public WebElement csmParamAllowBackDatedValueDateFlag() {
		return csmParam_AllowBackDatedValueDateFlag;
	}
	
	@FindBy(id="post_dated_vdate_P024MA")
	private WebElement csmParam_AllowPostDatedValueDateFlag;

	public WebElement csmParam_AllowPostDatedValueDateFlag() {
		return csmParam_AllowPostDatedValueDateFlag;
	}
	
	
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csm_StopperMessageInCannotProceedPopUpMenu;

	public WebElement csmStopperMessageInCannotProceedPopUpMenu() {
		return csm_StopperMessageInCannotProceedPopUpMenu;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance;

	public WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance() {
		return csm_OkButtonInCannotProceedPopUpMenuInMaintenance;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement csm_AmountInMaintenanceScreen;

	public WebElement csmAmountInMaintenanceScreen() {
		return csm_AmountInMaintenanceScreen;
	}
	
	@FindBy(id="value_date_D001MT")
	private WebElement csm_ValueDateInMaintenanceScreen;

	public WebElement csmValueDateInMaintenanceScreen() {
		return csm_ValueDateInMaintenanceScreen;
	}		
	
	
	
	
	
}
	
	
	
	
	
	
	
	