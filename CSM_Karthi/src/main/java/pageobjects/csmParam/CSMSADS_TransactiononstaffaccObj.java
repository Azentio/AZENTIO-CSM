package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMSADS_TransactiononstaffaccObj {
	WebDriver driver;
	public CSMSADS_TransactiononstaffaccObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//TSA_157
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

		@FindBy(id="code_UR00M")
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
		
		@FindBy(id="td_userGridId_UR00M_1_usrVO.USER_ID")//id="td_userGridId_UR00M_1_usrVO.USER_ID"
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
		
	//******************************************* SADS (SYSADM1) @TSA_158_02 ***************************************//
		
		
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
		

	//******************************************* CSM @TSA_158_03 *******************************************//
		
		
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
		
//		@FindBy(id="Transactions / Maintenance")
//		private WebElement CSM_TransactionsMaintenanceForLoading;
	//
//		public WebElement CSM_TransactionsMaintenanceForLoading() {
//			return CSM_TransactionsMaintenanceForLoading;
//		}
		
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


	}
	
	