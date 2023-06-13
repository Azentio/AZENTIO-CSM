package pageobjects.csmParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMParam_UserAccessObj {
	WebDriver driver;

	public CSMParam_UserAccessObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='System Parameters']")
	private WebElement csmParam_SystemParameter;

	public WebElement csmParamSystemParameter() {
		return csmParam_SystemParameter;
	}

	@FindBy(xpath = "//td[text()='User']")
	private WebElement systemParameter_UserMainModule;

	public WebElement systemParameterUserMainModule() {
		return systemParameter_UserMainModule;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Maintenance']")
	private WebElement user_Maintenance;

	public WebElement userMaintenance() {
		return user_Maintenance;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Update after Approve']")
	private WebElement user_UpdateAfterApprove;

	public WebElement userUpdateAfterApprove() {
		return user_UpdateAfterApprove;
	}

	@FindBy(name = "CODE")
	private WebElement user_searchUserCode;

	public WebElement userSearchUserCode() {
		return user_searchUserCode;
	}

	@FindBy(xpath = "//input[@name='USER_ID']")
	private WebElement user_SearchUserID;

	public WebElement userSearchUserID() {
		return user_SearchUserID;
	}

	@FindBy(xpath = "//span[text()=' Account Types ']")
	private WebElement user_AccountTypeAccess;

	public WebElement userAccountTypeAccess() {
		return user_AccountTypeAccess;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-tellerParam_popupAccountTypes_div_E000MA']")
	private WebElement userAccess_Label;

	public WebElement userAccessLabel() {
		return userAccess_Label;
	}

	@FindBy(xpath = "//span[text()=' CIF Types ']")
	private WebElement user_CIFTypeAccess;

	public WebElement userCIFTypeAccess() {
		return user_CIFTypeAccess;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.CIF_TYPE']")
	private WebElement user_CIFTypeAccessInputBox;

	public WebElement userCIFTypeAccessInputBox() {
		return user_CIFTypeAccessInputBox;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerciftypedetVO.TRX_TYPE']")
	private WebElement user_CIFTypeTransactionInputBox;

	public WebElement userCIFTypeTransactionInputBox() {
		return user_CIFTypeTransactionInputBox;
	}

	@FindBy(xpath = "//td[@id='add_tab4_GridTbl_Id_E000MA']")
	private WebElement userAccess_PlusIcon;

	public WebElement userAccessPlusIcon() {
		return userAccess_PlusIcon;
	}
	@FindBy(xpath="//td[@title='Add new row']")
	private WebElement limitButton_AddIcon;

	public WebElement limitButtonAddIcon() {
		return limitButton_AddIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Ok')]//parent::button")
	private WebElement limitButton_OkButton;

	public WebElement limitButtonOkButton() {
		return limitButton_OkButton;
	}
	

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.ACC_TYPE']")
	private WebElement userAccess_SearchAccountType;

	public WebElement userAccessSearchAccountType() {
		return userAccess_SearchAccountType;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstelleracctypedetVO.TRX_TYPE']")
	private WebElement userAccess_SearchTransaction;

	public WebElement userAccessSearchTransaction() {
		return userAccess_SearchTransaction;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement userAccess_SearchWdLimit;

	public WebElement userAccessSearchWdLimit() {
		return userAccess_SearchWdLimit;
	}

	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement userAccess_OkButton;

	public WebElement userAccessOkButton() {
		return userAccess_OkButton;
	}

	@FindBy(xpath = "//label[text()='Update After Approve ']//ancestor::button")
	private WebElement userAccess_UpdateAfterApproveButton;

	public WebElement userAccessUpdateAfterApproveButton() {
		return userAccess_UpdateAfterApproveButton;
	}

	@FindBy(xpath = "//label[contains(text(),'Show All Trx')]//parent::td//preceding-sibling::td//input[1]")
	private WebElement userAccess_ShowAllTrxFlag;

	public WebElement userAccessShowAllTrxFlag() {
		return userAccess_ShowAllTrxFlag;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Update after Approve')]//parent::td//following-sibling::td//span")
	private WebElement userUpdateAfterApprove_closeLabel;

	public WebElement userUpdateAfterApproveCloseLabel() {
		return userUpdateAfterApprove_closeLabel;
	}

	@FindBy(xpath = "//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveConfirmOkButton;

	public WebElement userAccessSaveConfirmOkButton() {
		return userAccess_SaveConfirmOkButton;
	}

	@FindBy(xpath = "//div[text()='Record was Updated Successfully']//ancestor::div//center//input[1]")
	private WebElement userAccess_SaveSuccessOkButton;

	public WebElement userAccessSaveSuccessOkButton() {
		return userAccess_SaveSuccessOkButton;
	}

	@FindBy(xpath = "//td[text()='User']//ancestor::li//span[text()='Approve']")
	private WebElement userAccess_ApproveModule;

	public WebElement userAccessApproveModule() {
		return userAccess_ApproveModule;
	}

	@FindBy(xpath = "//td[contains(text(),'Populate User')]")
	private WebElement user_PopulateUserFeature;

	public WebElement userPopulateUserFeature() {
		return user_PopulateUserFeature;
	}

	@FindBy(xpath = "(//td[text()='Populate User']//ancestor::li//span[text()='Maintenance'])[2]")
	private WebElement populateUser_MaitenanceFeature;

	public WebElement populateUserMaintenanceFeature() {
		return populateUser_MaitenanceFeature;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.TELLER_POPULATION_CODE")
	private WebElement populateUserMaintenance_populateCodeInput;

	public WebElement populateUserMaintenancePopulateCodeInput() {
		return populateUserMaintenance_populateCodeInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ENG")
	private WebElement populateUserMaintenance_populateBriefNameInput;

	public WebElement populateUserMaintenancepopulateBriefNameInput() {
		return populateUserMaintenance_populateBriefNameInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.LONG_NAME_ENG")
	private WebElement populateuserMaintenance_populateLongDescription;

	public WebElement populateUserMaintenancePopulateLongDescription() {
		return populateuserMaintenance_populateLongDescription;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.BRIEF_NAME_ARAB")
	private WebElement populateUserMaintenance_populateBriefNameArabInput;

	public WebElement populateUserMaintenancepopulateBriefNameArabInput() {
		return populateUserMaintenance_populateBriefNameArabInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.LONG_NAME_ARAB")
	private WebElement populateUserMaintenance_populateLongDescNameArabInput;

	public WebElement populateUserMaintenancepopulateLongDescNameArabInput() {
		return populateUserMaintenance_populateLongDescNameArabInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.TELLER_CODE")
	private WebElement populateUserMaintenance_TellercodeInput;

	public WebElement populateUserMaintenanceTellercodeInput() {
		return populateUserMaintenance_TellercodeInput;
	}

	@FindBy(name = "populatetellerCO.ctstellerPopulateVO.SUSP_USR_LOG_BR_YN")
	private WebElement populateUserMaintenance_SuspendUserInLoggedInBranchFlag;

	public WebElement populateUserMaintenanceSuspendUserInLoggedInBranchFlag() {
		return populateUserMaintenance_SuspendUserInLoggedInBranchFlag;
	}

	@FindBy(xpath = "//td[@title='Add new row']//div//span")
	private WebElement populateUserMaintenance_AddButton;

	public WebElement populateUserMaintenanceAddButton() {
		return populateUserMaintenance_AddButton;
	}

	@FindBy(name = "lookupTxt_ctstellerPopulateBranchesVO.DESTINATION_BRANCH_CODE")
	private WebElement populateUserMaintenance_DestinationBranchCode;

	public WebElement populateUserMaintenanceDestinationBranchCode() {
		return populateUserMaintenance_DestinationBranchCode;
	}

	@FindBy(name = "lookupTxt_ctstellerPopulateBranchesVO.TMPL_CODE")
	private WebElement populateUserMaintenance_DestinationBranchTemplateCode;

	public WebElement populateUserMaintenanceDestinationBranchTemplateCode() {
		return populateUserMaintenance_DestinationBranchTemplateCode;
	}

	@FindBy(xpath = "(//td[text()='Populate User']//ancestor::li//span[text()='Approve'])[2]")
	private WebElement populateUser_ApproveFeature;

	public WebElement populateUserApproveFeature() {
		return populateUser_ApproveFeature;
	}

	@FindBy(name = "TELLER_POPULATION_CODE")
	private WebElement populateApprove_SearchPopulateCode;

	public WebElement populateApproveSearchPopulateCode() {
		return populateApprove_SearchPopulateCode;
	}

	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement populateUser_ConfirmPopulateOkButton;

	public WebElement populateUserConfirmPopulateOkButton() {
		return populateUser_ConfirmPopulateOkButton;
	}

	@FindBy(id = "_popup_path_sol_ok")
	private WebElement populateUser_ApproveSuccessPopulateOkButton;

	public WebElement populateUserApproveSuccessPopulateOkButton() {
		return populateUser_ApproveSuccessPopulateOkButton;
	}

	@FindBy(xpath = "//td[text()='Populate User']//ancestor::li//span[text()='Populate']")
	private WebElement populateUser_PopulateFeature;

	public WebElement populateUserPopulateFeature() {
		return populateUser_PopulateFeature;
	}

	@FindBy(id = "populateTellerMaint_FormId_E000POPO_Populate_key")
	private WebElement populatefeature_PopulateButton;

	public WebElement populateFeaturePpulateButton() {
		return populatefeature_PopulateButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Confirm Populate Process')]//ancestor::div//center//input[1]")
	private WebElement populatefeature_ConfirmPopulateOkButton;

	public WebElement populatefeatureConfirmPopulateOkButton() {
		return populatefeature_ConfirmPopulateOkButton;
	}

	@FindBy(xpath = "//div[contains(text(),'Record was Populated Successfully')]//ancestor::div//center//input[1]")
	private WebElement populatefeature_SuccessPopulateOkButton;

	public WebElement populatefeatureSuccessPopulateOkButton() {
		return populatefeature_SuccessPopulateOkButton;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Maintenance')]//parent::td//following-sibling::td//span")
	private WebElement populateUser_MaintenanceScreenClose;

	public WebElement populateUserMaintenanceScreenCloseButton() {
		return populateUser_MaintenanceScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Maintenance')]")
	private WebElement populateUser_MaintenanceScreenLabel;

	public WebElement populateUserMaintenanceScreenLabel() {
		return populateUser_MaintenanceScreenLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Approve')]//parent::td//following-sibling::td//span")

	private WebElement populateUser_ApproveScreenClose;

	public WebElement populateUserApproveScreenClose() {
		return populateUser_ApproveScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Approve')]")
	private WebElement populateUser_ApproveScreenLabel;

	public WebElement populateUserApproveScreenLabel() {
		return populateUser_ApproveScreenLabel;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Populate')]//parent::td//following-sibling::td//span")
	private WebElement populateUser_PopulateScreenClose;

	public WebElement populateUserPopulateScreenClose() {
		return populateUser_PopulateScreenClose;
	}

	@FindBy(xpath = "//a[contains(text(),'Parameters / System Parameters / User / Populate User / Populate')]")
	private WebElement populateUser_PopulateUserScreenLabel;

	public WebElement populateUserPopulateUserScreenLabel() {
		return populateUser_PopulateUserScreenLabel;
	}

	@FindBy(id = "STATUS_DESC_E000MT")
	private WebElement userMaintenance_UserStatus;

	public WebElement userMaintenanceUserStatus() {
		return userMaintenance_UserStatus;
	}

	@FindBy(name = "tellerparamCO.ctstellerVO.SHOW_TODAY_TRX")
	private WebElement user_ShowTodayTrxFlg;

	public WebElement userShowTodayTrxFlag() {
		return user_ShowTodayTrxFlg;
	}

	@FindBy(xpath = "//td[@tdlabel='W/D Limit']//input")
	private WebElement accountType_withdrawLimitInput;

	public WebElement accountTypeWithdrawLimitInput() {
		return accountType_withdrawLimitInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Deposit Limit']//input")
	private WebElement accountType_DepositeLimitInput;

	public WebElement accountTypeDepositeLimitInput() {
		return accountType_DepositeLimitInput;
	}

	@FindBy(xpath = "//td[@tdlabel='Overdraw Limit']//input")
	private WebElement accountType_OverdrawnLimitInput;

	public WebElement accountTypeOverdrawnLimitInput() {
		return accountType_OverdrawnLimitInput;
	}

	@FindBy(xpath = "//span[@id='ui-dialog-title-tellerParam_popupAccountTypes_div_E000MA']")
	private WebElement accountTypeAccess_label;

	public WebElement accountTypeAccesslabel() {
		return accountTypeAccess_label;
	}

	@FindBy(xpath = "//span[contains(text(),' Limits ')]//parent::a")
	private WebElement accountTypeAccess_LimitButton;

	public WebElement accountTypeAccessLimitButton() {
		return accountTypeAccess_LimitButton;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.CY_CODE']")
	private WebElement limitAccess_CurrencyCode;

	public WebElement limitAccessCurrencyCode() {
		return limitAccess_CurrencyCode;
	}

	@FindBy(xpath = "//input[@name='lookupTxt_ctstellerlimitVO.TRX_TYPE']")
	private WebElement limitAccess_TransactionType;

	public WebElement limitAccessTransactionType() {
		return limitAccess_TransactionType;
	}
	@FindBy(xpath="//td[@tdlabel='W/D Limit']//input")
	private WebElement limitAccess_WithdrawLimitInput;

	public WebElement limitAccessWithdrawLimitInput() {
		return limitAccess_WithdrawLimitInput;
	}
	
}
