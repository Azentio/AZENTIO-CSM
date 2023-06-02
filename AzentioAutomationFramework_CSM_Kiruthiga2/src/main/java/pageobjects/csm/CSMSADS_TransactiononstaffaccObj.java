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
	private WebElement csmSADS_ParametersMainMenu;

	public WebElement csmSADSParametersMainMenu() {
		return csmSADS_ParametersMainMenu;
	}

	@FindBy(xpath = "//td[text()='Account Restrictions']")
	private WebElement csmSADS_AccountRestrictionsInParameters;

	public WebElement csmSADSAccountRestrictionsInParameters() {
		return csmSADS_AccountRestrictionsInParameters;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement csmSADS_MaintenanceInAccountRestrictions;

	public WebElement csmSADSMaintenanceInAccountRestrictions() {
		return csmSADS_MaintenanceInAccountRestrictions;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE']")//id="code_UR00M"
	private WebElement csmSADS_EnterTheValueInCodeUnderMaintenance;

	public WebElement csmSADSEnterTheValueInCodeUnderMaintenance() {
		return csmSADS_EnterTheValueInCodeUnderMaintenance;
	}

	@FindBy(xpath = "//input[@name='ctsRestrictionsVO.CODE_TYPE_DESC']")
	private WebElement csmSADS_EnterTheValueInDescriptionUnderMaintenance;

	public WebElement csmSADSEnterTheValueInDescriptionUnderMaintenance() {
		return csmSADS_EnterTheValueInDescriptionUnderMaintenance;
	}
	
	@FindBy(id="personal_account_access_UR00M")
	private WebElement csmSADS_CheckBoxInGrantAccessToPersonalAccounts;

	public WebElement csmSADSCheckBoxInGrantAccessToPersonalAccounts() {
		return csmSADS_CheckBoxInGrantAccessToPersonalAccounts;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement csmSADS_RootIconInApplicationsOROPTs;

	public WebElement csmSADSRootIconInApplicationsOROPTs() {
		return csmSADS_RootIconInApplicationsOROPTs;
	}

	@FindBy(id="td_ctsRestOptTreeGridTbl_Id_UR00M_7_progDesc")
	private WebElement csmSADS_RADMApplicationInApplicationsOROPTs;

	public WebElement csmSADSRADMApplicationInApplicationsOROPTs() {
		return csmSADS_RADMApplicationInApplicationsOROPTs;
	}

	@FindBy(id="RADM__RADM_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement csmSADS_RADMApplicationCheckboxInApplicationsOROPTs;

	public WebElement csmSADSRADMApplicationCheckboxInApplicationsOROPTs() {
		return csmSADS_RADMApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(id="td_ctsRestOptTreeGridTbl_Id_UR00M_8_progDesc")
	private WebElement csmSADS_RETApplicationInApplicationsOROPTs;

	public WebElement csmSADSRETApplicationInApplicationsOROPTs() {
		return csmSADS_RETApplicationInApplicationsOROPTs;
	}

	@FindBy(id="RET__RET_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M")
	private WebElement csmSADS_RETApplicationCheckboxInApplicationsOROPTs;

	public WebElement csmSADSRETApplicationCheckboxInApplicationsOROPTs() {
		return csmSADS_RETApplicationCheckboxInApplicationsOROPTs;
	}

	@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']//preceding-sibling::div/child::div")
	private WebElement csmSADS_RootIconInCompaniesORBranchesInMaintenance;

	public WebElement csmSADSRootIconInCompaniesORBranchesInMaintenance() {
		return csmSADS_RootIconInCompaniesORBranchesInMaintenance;
	}

	@FindBy(id="td_ctsRestBranchesTreeGridTbl_Id_UR00M_11_progDesc")
	private WebElement csmSADS_1BAJapplicationInCompaniesORBranches;

	public WebElement csmSADS1BAJapplicationInCompaniesORBranches() {
		return csmSADS_1BAJapplicationInCompaniesORBranches;
	}

	@FindBy(id="ROOT__1__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M")
	private WebElement csmSADS_1BAJApplicationCheckboxInCompaniesORBranches;

	public WebElement csmSADS1BAJApplicationCheckboxInCompaniesORBranches() {
		return csmSADS_1BAJApplicationCheckboxInCompaniesORBranches;
	}

	@FindBy(id="userGridId_UR00M_gs_usrVO.USER_ID")
	private WebElement csmSADS_EnterTheUserIDInUserIDTab;

	public WebElement csmSADSEnterTheUserIDInUserIDTab() {
		return csmSADS_EnterTheUserIDInUserIDTab;
	}
	
	@FindBy(id="td_userGridId_UR00M_1_usrVO.USER_ID")
	private WebElement csmSADS_UserIDName;

	public WebElement csmSADSUserIDName() {
		return csmSADS_UserIDName;
	}

	@FindBy(id="jqg_userGridId_UR00M_1")
	private WebElement csmSADS_UserIDCheckbox;

	public WebElement csmSADSUserIDCheckbox() {
		return csmSADS_UserIDCheckbox;
	}
	
	@FindBy(id="add_restrictionsGridTbl_Id_UR00M")
	private WebElement csmSADS_AddButtonInRestrictionType;

	public WebElement csmSADSAddButtonInRestrictionType() {
		return csmSADS_AddButtonInRestrictionType;
	}
	
	@FindBy(xpath="//td[@id='td_restrictionsGridTbl_Id_UR00M_1_restrictionType']//child::select")
	private WebElement csmSADS_SelectTIconUnderRestrictionType;

	public WebElement csmSADSSelectTIconUnderRestrictionType() {
		return csmSADS_SelectTIconUnderRestrictionType;
	}		
	
	@FindBy(id="spanLookup_glCode_no_UR00M")
	private WebElement csmSADS_SearchTheGLCode;

	public WebElement csmSADSSearchTheGLCode() {
		return csmSADS_SearchTheGLCode;
	}
	
	@FindBy(id="gridtab_glCode_no_UR00M_gs_GL_CODE")
	private WebElement csmSADS_EnterTheGLCodeInSearchPopUp;

	public WebElement csmSADSEnterTheGLCodeInSearchPopUp() {
		return csmSADS_EnterTheGLCodeInSearchPopUp;
	}
	
	@FindBy(id="td_gridtab_glCode_no_UR00M_1_GL_CODE")
	private WebElement csmSADS_ClickSearchedGLCodeInSearchPopup;

	public WebElement csmSADSClickSearchedGLCodeInSearchPopup() {
		return csmSADS_ClickSearchedGLCodeInSearchPopup;
	}
	
	@FindBy(xpath = "//select[@name='ctsRestrictionsCO.cifRangeRestLevel']")
	private WebElement csmSADS_AccountBalanceSelectTabInRestrictionLevel;

	public WebElement csmSADSAccountBalanceSelectTabInRestrictionLevel() {
		return csmSADS_AccountBalanceSelectTabInRestrictionLevel;
	}
	
	@FindBy(id="add_cifGridId_UR00M")
	private WebElement csmSADS_AddButtonUnderRestrictionType;

	public WebElement csmSADS_AddButtonUnderRestrictionType() {
		return csmSADS_AddButtonUnderRestrictionType;
	}
	
	@FindBy(xpath = "//td[@id='td_cifGridId_UR00M_1_CIF_NO']//child::span//preceding-sibling::span/span")
	private WebElement csmSADS_SearchIconInCIFNOUnderTheRestrictionLevel;

	public WebElement csmSADSSearchIconInCIFNOUnderTheRestrictionLevel() {
		return csmSADS_SearchIconInCIFNOUnderTheRestrictionLevel;
	}
	
	@FindBy(xpath = "//input[@name='CIF_NO']")
	private WebElement csmSADS_EnterTheCIFNoInTheSearchBox;

	public WebElement csmSADSEnterTheCIFNoInTheSearchBox() {
		return csmSADS_EnterTheCIFNoInTheSearchBox;
	}
	
	@FindBy(xpath = "(//td[@tdlabel='CIF No'])[2]")
	private WebElement csmSADS_SearchedCIFNoInSearchPopup;

	public WebElement csmSADS_SearchedCIFNoInSearchPopup() {
		return csmSADS_SearchedCIFNoInSearchPopup;
	}
	
	@FindBy(id="ctsRestrictionsMaint_save_UR00M")
	private WebElement csmSADS_SaveButtonUnderMaintenanceScreen;

	public WebElement csmSADS_SaveButtonUnderMaintenanceScreen() {
		return csmSADS_SaveButtonUnderMaintenanceScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmSADS_OkButtonInSuccessPopUpMenu;

	public WebElement csmSADSOkButtonInSuccessPopUpMenu() {
		return csmSADS_OkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(id="UR00P")
	private WebElement csmSADS_ApproveUnderAccountRestrictions;

	public WebElement csmSADSApproveUnderAccountRestrictions() {
		return csmSADS_ApproveUnderAccountRestrictions;
	}
	
	@FindBy(id="ctsRestrictionsListGridTbl_Id_UR00P_gs_code")
	private WebElement csmSADS_EnterCodeInApproveScreen;

	public WebElement csmSADSEnterCodeInApproveScreen() {
		return csmSADS_EnterCodeInApproveScreen;
	}
	
	@FindBy(id="td_ctsRestrictionsListGridTbl_Id_UR00P_1_code")
	private WebElement csmSADS_ClickTheSelectedCodeInApproveScreen;

	public WebElement csmSADS_ClickTheSelectedCodeInApproveScreen() {
		return csmSADS_ClickTheSelectedCodeInApproveScreen;
	}
	
	@FindBy(id="ctsRestrictionsMaint_approve_UR00P")
	private WebElement csmSADS_ApproveButtonInApproveScreen;

	public WebElement csmSADSApproveButtonInApproveScreen() {
		return csmSADS_ApproveButtonInApproveScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmSADS_ClickOkButtonInSuccessPopUpMenu;

	public WebElement csmSADSClickOkButtonInSuccessPopUpMenu() {
		return csmSADS_ClickOkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(xpath = "//td[text()='User']//ancestor::a")
	private WebElement csmSADS_UserInParametersUnderSADSApplication;

	public WebElement csmSADSUserInParametersUnderSADSApplication() {
		return csmSADS_UserInParametersUnderSADSApplication;
	}
	
	@FindBy(id="P005M")
	private WebElement csmSADS_MaintenanceInUserUnderParameters;

	public WebElement csmSADSMaintenanceInUserUnderParameters() {
		return csmSADS_MaintenanceInUserUnderParameters;
	}
	
	@FindBy(id="infoBarSearchButton_P005M")
	private WebElement csmSADS_SearchButtonUnderMaintenanceScreen;

	public WebElement csmSADSSearchButtonUnderMaintenanceScreen() {
		return csmSADS_SearchButtonUnderMaintenanceScreen;
	}
	
	@FindBy(id="userListGridTbl_Id_P005M_gs_usrVO.USER_ID")
	private WebElement csmSADS_EnterUserIDInSearchUnderMaintenanceScreen;

	public WebElement csmSADSEnterUserIDInSearchUnderMaintenanceScreen() {
		return csmSADS_EnterUserIDInSearchUnderMaintenanceScreen;
	}
	
	@FindBy(id="spanLookup_COMP_CODE_P005M")
	private WebElement csmSADS_CompanySearchButtonInEmployeeDetails;

	public WebElement csmSADSCompanySearchButtonInEmployeeDetails() {
		return csmSADS_CompanySearchButtonInEmployeeDetails;
	}		
	
	@FindBy(id="gridtab_COMP_CODE_P005M_gs_COMP_CODE")
	private WebElement csmSADS_CompanyCodeInSearchBox;

	public WebElement csmSADSCompanyCodeInSearchBox() {
		return csmSADS_CompanyCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_COMP_CODE_P005M_1_COMP_CODE")
	private WebElement csmSADS_DoubleClickOnTheCompanySearchedCode;

	public WebElement csmSADSDoubleClickOnTheCompanySearchedCode() {
		return csmSADS_DoubleClickOnTheCompanySearchedCode;
	}		
	
	@FindBy(id="spanLookup_BRANCH_CODE_P005M")
	private WebElement csmSADS_BranchSearchButtonInEmployeeDetails;

	public WebElement csmSADSBranchSearchButtonInEmployeeDetails() {
		return csmSADS_BranchSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_BRANCH_CODE_P005M_gs_BRANCH_CODE")
	private WebElement csmSADS_BranchCodeInSearchBox;

	public WebElement csmSADSBranchCodeInSearchBox() {
		return csmSADS_BranchCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_BRANCH_CODE_P005M_1_BRANCH_CODE")
	private WebElement csmSADS_DoubleClickOnTheBranchSearchedCode;

	public WebElement csmSADSDoubleClickOnTheBranchSearchedCode() {
		return csmSADS_DoubleClickOnTheBranchSearchedCode;
	}
	
	@FindBy(id="spanLookup_division_P005M")
	private WebElement csmSADS_DivisionSearchButtonInEmployeeDetails;

	public WebElement csmSADSDivisionSearchButtonInEmployeeDetails() {
		return csmSADS_DivisionSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_division_P005M_gs_DIVISION_CODE")
	private WebElement csmSADS_DivisionCodeInSearchBox;

	public WebElement csmSADSDivisionCodeInSearchBox() {
		return csmSADS_DivisionCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_division_P005M_1_DIVISION_CODE")
	private WebElement csmSADS_DoubleClickOnTheDivisionSearchedCode;

	public WebElement csmSADSDoubleClickOnTheDivisionSearchedCode() {
		return csmSADS_DoubleClickOnTheDivisionSearchedCode;
	}
	
	@FindBy(id="spanLookup_Departmnt_P005M")
	private WebElement csmSADS_DepartmentSearchButtonInEmployeeDetails;

	public WebElement csmSADSDepartmentSearchButtonInEmployeeDetails() {
		return csmSADS_DepartmentSearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_Departmnt_P005M_gs_DEPT_CODE")
	private WebElement csmSADS_DepartmentCodeInSearchBox;

	public WebElement csmSADSDepartmentCodeInSearchBox() {
		return csmSADS_DepartmentCodeInSearchBox;
	}
	
	@FindBy(id="td_gridtab_Departmnt_P005M_1_DEPT_CODE")
	private WebElement csmSADS_DoubleClickOnTheDepartmentSearchedCode;

	public WebElement csmSADSDoubleClickOnTheDepartmentSearchedCode() {
		return csmSADS_DoubleClickOnTheDepartmentSearchedCode;
	}
	
	@FindBy(id="td_userListGridTbl_Id_P005M_1_usrVO.USER_ID")
	private WebElement csmSADS_SearchedIDUnderMaintenanceScreen;

	public WebElement csmSADSSearchedIDUnderMaintenanceScreen() {
		return csmSADS_SearchedIDUnderMaintenanceScreen;
	}
	
	@FindBy(id="spanLookup_CIF_NO_P005M")
	private WebElement csmSADS_SearchButtonInEmployeeDetails;

	public WebElement csmSADSSearchButtonInEmployeeDetails() {
		return csmSADS_SearchButtonInEmployeeDetails;
	}
	
	@FindBy(id="gridtab_CIF_NO_P005M_gs_CIF_NO")
	private WebElement csmSADS_CIFNoInSearchBox;

	public WebElement csmSADSCIFNoInSearchBox() {
		return csmSADS_CIFNoInSearchBox;
	}
	
	@FindBy(id="td_gridtab_CIF_NO_P005M_1_CIF_NO")
	private WebElement csmSADS_CSearchedCIFNOInSearchBox;

	public WebElement csmSADSCSearchedCIFNOInSearchBox() {
		return csmSADS_CSearchedCIFNOInSearchBox;
	}
	
	@FindBy(id="physical_user_P005M")
	private WebElement csmSADS_CheckThePhysicalUserCheckBoxInPrivilege;

	public WebElement csmSADSCheckThePhysicalUserCheckBoxInPrivilege() {
		return csmSADS_CheckThePhysicalUserCheckBoxInPrivilege;
	}
	
	@FindBy(id="userFormId_P005M_Save_key")
	private WebElement csmSADS_SaveButtonInMaintenanceScreen;

	public WebElement csmSADSSaveButtonInMaintenanceScreen() {
		return csmSADS_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmSADS_OkButtonInSuccessPopUpInUser;

	public WebElement csmSADSOkButtonInSuccessPopUpInUser() {
		return csmSADS_OkButtonInSuccessPopUpInUser;
	}
	
//******************************************* Approve User ***************************************//
	
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement csmSADS_ParameterInSADSApplication;

	public WebElement csmSADSParameterInSADSApplication() {
		return csmSADS_ParameterInSADSApplication;
	}
	
	@FindBy(xpath = "//span[text()='Approve']//ancestor::a")
	private WebElement csmSADS_ApproveInUserUnderParameters;

	public WebElement csmSADSApproveInUserUnderParameters() {
		return csmSADS_ApproveInUserUnderParameters;
	}
	
	@FindBy(id="infoBarSearchButton_P005P")
	private WebElement csmSADS_SearchButtonUnderApproveScreen;

	public WebElement csmSADSSearchButtonUnderApproveScreen() {
		return csmSADS_SearchButtonUnderApproveScreen;
	}
	
	@FindBy(id="userListGridTbl_Id_P005P_gs_usrVO.USER_ID")
	private WebElement csmSADS_EnterUserIDInSearchUnderApproveScreen;

	public WebElement csmSADSEnterUserIDInSearchUnderApproveScreen() {
		return csmSADS_EnterUserIDInSearchUnderApproveScreen;
	}
	
	@FindBy(id="td_userListGridTbl_Id_P005P_1_usrVO.USER_ID")
	private WebElement csmSADS_SearchedIDunderApproveScreen;

	public WebElement csmSADSSearchedIDunderApproveScreen() {
		return csmSADS_SearchedIDunderApproveScreen;
	}
	
	@FindBy(id="userFormId_P005P_Approve_key")
	private WebElement csmSADS_ClickApproveButtonInApproveScreen;

	public WebElement csmSADS_ClickApproveButtonInApproveScreen() {
		return csmSADS_ClickApproveButtonInApproveScreen;
	}	
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csmSADS_OkButtonInSuccessPopupInUserApprove;

	public WebElement csmSADSOkButtonInSuccessPopupInUserApprove() {
		return csmSADS_OkButtonInSuccessPopupInUserApprove;
	}
	

//******************************************* Transaction  *******************************************//
	
	
	@FindBy(id="hdr_runn_date")
	private WebElement csm_DateToChangeTheCurrentDate;

	public WebElement csmDateToChangeTheCurrentDate() {
		return csm_DateToChangeTheCurrentDate;
	}
	
	@FindBy(id="global_user_run_date")
	private WebElement csm_DateInUserRunningDate;

	public WebElement csmDateInUserRunningDate() {
		return csm_DateInUserRunningDate;
	}
	
	@FindBy(xpath = "//label[@id='Application_Running_Date_key']//preceding::button")
	private WebElement csm_UseButtonInChangeRunningDate;

	public WebElement csmUseButtonInChangeRunningDate() {
		return csm_UseButtonInChangeRunningDate;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement csm_ClearCacheInTechnicalDetailsIcon;

	public WebElement csm_ClearCacheInTechnicalDetailsIcon() {
		return csm_ClearCacheInTechnicalDetailsIcon;

	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInInformationPopUpMenu;

	public WebElement csmOkButtonInInformationPopUpMenu() {
		return csm_OkButtonInInformationPopUpMenu;
	}
	
	@FindBy(id="_header_rundate_dialog_close")
	private WebElement csm_CloseButtonInChangeRunningDate;

	public WebElement csmCloseButtonInChangeRunningDate() {
		return csm_CloseButtonInChangeRunningDate;
	}
	
	@FindBy(id="tech_details_icon")
	private WebElement csm_TechnicalDetailsIcon;

	public WebElement csmTechnicalDetailsIcon() {
		return csm_TechnicalDetailsIcon;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonUnderInformationPopUp;

	public WebElement csmOkButtonUnderInformationPopUp() {
		return csm_OkButtonUnderInformationPopUp;
	}
	
	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_TransactionsMainMenu;

	public WebElement csmTransactionsMainMenu() {
		return csm_TransactionsMainMenu;
	}
	
	@FindBy(id="D001MT")
	private WebElement csm_MaintenanceUnderTransactions;

	public WebElement csmMaintenanceUnderTransactions() {
		return csm_MaintenanceUnderTransactions;
	}
	
	@FindBy(id="lookuptxt_trx_type_D001MT")
	private WebElement csm_TRXTypeInMaintenanceScreen;

	public WebElement csmTRXTypeInMaintenanceScreen() {
		return csm_TRXTypeInMaintenanceScreen;
	}
	
//	@FindBy(id="Transactions / Maintenance")
//	private WebElement csm_TransactionsMaintenanceForLoading;
//
//	public WebElement csm_TransactionsMaintenanceForLoading() {
//		return csm_TransactionsMaintenanceForLoading;
//	}
	
	@FindBy(id="trs_ac_br_D001MT")
	private WebElement csm_BranchCodeInCreditAc;

	public WebElement csmBranchCodeInCreditAc() {
		return csm_BranchCodeInCreditAc;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement csm_CurrencyCodeCreditAc;

	public WebElement csmCurrencyCodeCreditAc() {
		return csm_CurrencyCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement csm_GLCodeCreditAc;

	public WebElement csmGLCodeCreditAc() {
		return csm_GLCodeCreditAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement csm_CIFCodeInCreditAc;

	public WebElement csmCIFCodeInCreditAc() {
		return csm_CIFCodeInCreditAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement csm_SerialInCreditAc;

	public WebElement csmSerialInCreditAc() {
		return csm_SerialInCreditAc;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInWarningPopUpMenu;

	public WebElement csmOkButtonInWarningPopUpMenu() {
		return csm_OkButtonInWarningPopUpMenu;
	}
	
	@FindBy(id="lookuptxt_trs_cy_D001MT")
	private WebElement csm_CurrencyInMaintenanceScreen;

	public WebElement csmCurrencyInMaintenanceScreen() {
		return csm_CurrencyInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement csm_AmountInMaintenanceScreen;

	public WebElement csmAmountInMaintenanceScreen() {
		return csm_AmountInMaintenanceScreen;
	}
	
	@FindBy(id="amount_D001MT")
	private WebElement csm_AmountUnderMaintenanceScreen;

	public WebElement csmAmountUnderMaintenanceScreen() {
		return csm_AmountUnderMaintenanceScreen;
	}
	
	@FindBy(xpath = "//td[text()='USD']")
	private WebElement csm_CurrencyName;

	public WebElement csmCurrencyName() {
		return csm_CurrencyName;
	}
	
	@FindBy(id="value_date_D001MT")
	private WebElement csm_ValueDateInMaintenanceScreen;

	public WebElement csmValueDateInMaintenanceScreen() {
		return csm_ValueDateInMaintenanceScreen;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance;

	public WebElement csm_OkButtonInCannotProceedPopUpMenuInMaintenance() {
		return csm_OkButtonInCannotProceedPopUpMenuInMaintenance;
	}
	
	@FindBy(id="trxMgntSaveBtn_D001MT")
	private WebElement csm_SaveButtonInMaintenanceScreen;

	public WebElement csmSaveButtonInMaintenanceScreen() {
		return csm_SaveButtonInMaintenanceScreen;
	}
	
	@FindBy(xpath = "//div[text()='Success']//following::div//following::div//child::div")
	private WebElement csm_GetTheTransactionNo;

	public WebElement csmGetTheTransactionNo() {
		return csm_GetTheTransactionNo;
	}
	
	@FindBy(id="D001AU")
	private WebElement csm_ApproveScreenUnderTransactions;

	public WebElement csmApproveScreenUnderTransactions() {
		return csm_ApproveScreenUnderTransactions;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001AU_gs_ctstrsVO.TRS_NO")
	private WebElement csm_TransactionNoInApproveScreen;

	public WebElement csmTransactionNoInApproveScreen() {
		return csm_TransactionNoInApproveScreen;
	}
	
	@FindBy(id="td_trxMgntGridTbl_Id_D001AU_1_ctstrsVO.TRS_NO")
	private WebElement csm_DoubleClickOnTheTransactionNo;

	public WebElement csmDoubleClickOnTheTransactionNo() {
		return csm_DoubleClickOnTheTransactionNo;
	}	
	
	@FindBy(id="amount_D001AU")
	private WebElement csm_AmountValue;

	public WebElement csmAmountValue() {
		return csm_AmountValue;
	}
			
	@FindBy(xpath = "//span[contains(text(),' Approve ')]//parent::button")
	private WebElement csm_ApproveButtonInApproveScreen;

	public WebElement csmApproveButtonInApproveScreen() {
		return csm_ApproveButtonInApproveScreen;
	}
	
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement csm_StopperMessageInCannotProceedPopUpMenu;

	public WebElement csmStopperMessageInCannotProceedPopUpMenu() {
		return csm_StopperMessageInCannotProceedPopUpMenu;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInSuccessPopUpMenuForTranscation;

	public WebElement csmOkButtonInSuccessPopUpMenuForTranscation() {
		return csm_OkButtonInSuccessPopUpMenuForTranscation;
	}		
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInSuccessPopUpMenu;

	public WebElement csmOkButtonInSuccessPopUpMenu() {
		return csm_OkButtonInSuccessPopUpMenu;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimQUER']/child::h3")
	private WebElement csm_QueriesMainMenu;

	public WebElement csmQueriesMainMenu() {
		return csm_QueriesMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Statement Of Accounts']")
	private WebElement csm_StatementOfAccountsInQueries;

	public WebElement csmStatementOfAccountsInQueries() {
		return csm_StatementOfAccountsInQueries;
	}
	
	@FindBy(id="QUER001T")
	private WebElement csm_ByTradeDateUnderStatementOfAccountsSubMenu;

	public WebElement csmByTradeDateUnderStatementOfAccountsSubMenu() {
		return csm_ByTradeDateUnderStatementOfAccountsSubMenu;
	}
	
	@FindBy(id="accCy_QUER001T")
	private WebElement csm_CurrencyValueIinAccountUnderByTradeDateScreen;

	public WebElement csmCurrencyValueIinAccountUnderByTradeDateScreen() {
		return csm_CurrencyValueIinAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accGl_QUER001T")
	private WebElement csm_GLCodeInAccountUnderByTradeDateScreen;

	public WebElement csmGLCodeInAccountUnderByTradeDateScreen() {
		return csm_GLCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="accCif_QUER001T")
	private WebElement csm_CIFCodeInAccountUnderByTradeDateScreen;

	public WebElement csmCIFCodeInAccountUnderByTradeDateScreen() {
		return csm_CIFCodeInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="lookuptxt_accSl_QUER001T")
	private WebElement csm_SerialInAccountUnderByTradeDateScreen;

	public WebElement csmSerialInAccountUnderByTradeDateScreen() {
		return csm_SerialInAccountUnderByTradeDateScreen;
	}
	
	@FindBy(id="dtOpened_QUER001T")
	private WebElement csm_FromDateInPeriodicityOfStatement;

	public WebElement csmFromDateInPeriodicityOfStatement() {
		return csm_FromDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="dtClosed_QUER001T")
	private WebElement csm_ToDateInPeriodicityOfStatement;

	public WebElement csmToDateInPeriodicityOfStatement() {
		return csm_ToDateInPeriodicityOfStatement;
	}
	
	@FindBy(id="sfsdfsdf")
	private WebElement csm_RetrieveButtonUnderByTradeDateScreen;

	public WebElement csmRetrieveButtonUnderByTradeDateScreen() {
		return csm_RetrieveButtonUnderByTradeDateScreen;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInAccessDeniedPopUpMenu;

	public WebElement csmOkButtonInAccessDeniedPopUpMenu() {
		return csm_OkButtonInAccessDeniedPopUpMenu;
	}
	
	@FindBy(xpath = "//div[text()='[293] No access']")
	private WebElement csm_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;

	public WebElement csmValidateIfTheStatementOfAccountDisplayedAsAccessDenied() {
		return csm_ValidateIfTheStatementOfAccountDisplayedAsAccessDenied;
	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
	private WebElement csm_ValidateIfTheStatementOfAccountIsDisplayed;

	public WebElement csmValidateIfTheStatementOfAccountIsDisplayed() {
		return csm_ValidateIfTheStatementOfAccountIsDisplayed;
	}
	
	//********************************************** No access to Economic sector ********************************************
	
	@FindBy(xpath = "//span[text()='close']//parent::a")
	private WebElement csm_CloseButtonInViewMemoPopupMenu;

	public WebElement csmCloseButtonInViewMemoPopupMenu() {
		return csm_CloseButtonInViewMemoPopupMenu;
	}
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_OkButtonInCannotProceedPopUpMenu;

	public WebElement csmOkButtonInCannotProceedPopUpMenu() {
		return csm_OkButtonInCannotProceedPopUpMenu;
	}
	
	@FindBy(xpath = "//div[text()='[7078] User Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF']")
	private WebElement csm_ValidateUserDoesNotHaveAcces;

	public WebElement csmValidateUserDoesNotHaveAcces() {
		return csm_ValidateUserDoesNotHaveAcces;
	}
	
	//***************************************** No access to Currency ***************************************
	
	@FindBy(id="_popup_path_sol_ok")
	private WebElement csm_ClickOkButtonInCannotProceedPopupMenu;

	public WebElement csmClickOkButtonInCannotProceedPopupMenu() {
		return csm_ClickOkButtonInCannotProceedPopupMenu;
	}
	
	@FindBy(xpath = "//div[text()='User does not have rights to trade with selected Currency.: 144']")
	private WebElement csm_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;

	public WebElement csm_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency() {
		return csm_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency;
	}
	
	@FindBy(id="lookuptxt_ctrl_sl_D001MT")
	private WebElement csm_SerialValue;

	public WebElement csmSerialValue() {
		return csm_SerialValue;
	}
	
	//******************************************************** @TRS_10 ***********************************************************************
	
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement csm_OkButtonInWarningPopUpToGoBackToMaintenance;

	public WebElement csmOkButtonInWarningPopUpToGoBackToMaintenance() {
		return csm_OkButtonInWarningPopUpToGoBackToMaintenance;
	}
	
	@FindBy(id="infoBarSearchButton_D001MT")
	private WebElement csm_SearchButtonInMaintenanceScreen;

	public WebElement csmSearchButtonInMaintenanceScreen() {
		return csm_SearchButtonInMaintenanceScreen;
	}
	
	@FindBy(id="trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO")
	private WebElement csm_EnterTheTransactionNoInSearchBox;

	public WebElement csmEnterTheTransactionNoInSearchBox() {
		return csm_EnterTheTransactionNoInSearchBox;
	}
	
	@FindBy(id="td_trxMgntGridTbl_Id_D001MT_1_ctstrsVO.TRS_NO")
	private WebElement csm_DoubleClickOnTheSearchedTransactionNo;

	public WebElement csmDoubleClickOnTheSearchedTransactionNo() {
		return csm_DoubleClickOnTheSearchedTransactionNo;
	}
	
	@FindBy(id="trxMgntDefFormId_D001MT_Booked_Entries_key")
	private WebElement csm_BookedEntriesInMaintenanceScreen;

	public WebElement csmBookedEntriesInMaintenanceScreen() {
		return csm_BookedEntriesInMaintenanceScreen;
	}
	
	@FindBy(id="statementOfAccountsDetGridTbl_Id_QUER001T_gs_hstvo.OP_NO")
	private WebElement csm_EnterTheOpNoInByTradeDateScreen;

	public WebElement csmEnterTheOpNoInByTradeDateScreen() {
		return csm_EnterTheOpNoInByTradeDateScreen;
	}
	
//	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_hstvo.OP_NO")
//	private WebElement csm_DoubleClickTheSearchedOpNo;
//
//	public WebElement csmDoubleClickTheSearchedOpNo() {
//		return csm_DoubleClickTheSearchedOpNo;
//	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement csm_ValidateTheCreditAmount;

	public WebElement csmValidateTheCreditAmount() {
		return csm_ValidateTheCreditAmount;
	}
	
	@FindBy(id="trs_ac_cy_D001MT")
	private WebElement csm_CurrencyCodeDebitAc;

	public WebElement csmCurrencyCodeDebitAc() {
		return csm_CurrencyCodeDebitAc;
	}
	
	@FindBy(id="trs_ac_gl_D001MT")
	private WebElement csm_GLCodeDebitAc;

	public WebElement csmGLCodeDebitAc() {
		return csm_GLCodeDebitAc;
	}
	
	@FindBy(id="trs_ac_cif_D001MT")
	private WebElement csm_CIFCodeInDebitAc;

	public WebElement csmCIFCodeInDebitAc() {
		return csm_CIFCodeInDebitAc;
	}
	
	@FindBy(id="lookuptxt_trs_ac_sl_D001MT")
	private WebElement csm_SerialInDebitAc;

	public WebElement csmSerialInDebitAc() {
		return csm_SerialInDebitAc;
	}
	
	@FindBy(id="td_statementOfAccountsDetGridTbl_Id_QUER001T_1_transCvAmt")
	private WebElement csm_ValidateTheDebitAmount;

	public WebElement csm_ValidateTheDebitAmount() {
		return csm_ValidateTheDebitAmount;
	}
	
	//**************************************** @TRS_052_01 **************************************************************
	
	
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
}
	
	
	
	
	
	
	
	