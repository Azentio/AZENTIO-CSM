package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csmParam.CSMSADS_TransactiononstaffaccObj;
import resources.BaseClass;

public class CSMSADS_Tranactiononstaff_step {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSMSADS_TransactiononstaffaccObj transactiononstaffaccObj = new CSMSADS_TransactiononstaffaccObj(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMparamTestData.xlsx";
	ExcelData excelDataForTransactionOnStaffAcc = new ExcelData(path, "CSM_TransactionOnStaffAcc", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	Map<String, String> testData;

	// TSA_157
	// TSA_154
	// TSA_155

	@And("^User Click on Parameters under SADS application$")
	public void user_click_on_parameters_under_sads_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSParametersMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSParametersMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSParametersMainMenu());
	}

	@And("^user update test data set id for TSA_157$")
	public void user_update_test_data_set_id_for_tsa157() throws Throwable {
		testData = excelDataForTransactionOnStaffAcc.getTestdata("TSA_157_D1");
	}

	@And("^User Click on Account Restrictions in Parameters under SADS application$")
	public void user_click_on_account_restrictions_in_parameters_under_sads_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());
	}

	@And("^User Click on Maintenance in Account Restrictions under Parameters$")
	public void user_click_on_maintenance_in_account_restrictions_under_parameters() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());
	}

	@And("^User Enter the value in Code under Maintenance Screen$")
	public void user_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());
		int min = 1000;
		int max = 9000;
		int code = (int) (Math.random() * (max - min + 1) + min);
		String restrictionCodeStr = String.valueOf(code);
		System.out.println(restrictionCodeStr);
		excelDataForTransactionOnStaffAcc.updateTestData("TSA_157_D1", "RestrictionCode", restrictionCodeStr);
		testData = excelDataForTransactionOnStaffAcc.getTestdata("TSA_157_D1");
		transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance().sendKeys(testData.get("RestrictionCode"));
	}

	@And("^User Enter the value in Description  under Maintenance Screen$")
	public void user_enter_the_value_in_description_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance()
				.sendKeys(testData.get("Description"));
	}

	@And("^User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen$")
	public void user_click_the_checkbox_in_grant_access_to_personal_accounts_under_maintenance_screen()
			throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
		try {
			waitHelper.waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
			if (transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts().getAttribute("initialvalue")
					.isBlank()) {
				clicksAndActionsHelper
						.moveToElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
				clicksAndActionsHelper
						.clickOnElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());

				clicksAndActionsHelper
						.moveToElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
				clicksAndActionsHelper
						.clickOnElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());

			} else {

				clicksAndActionsHelper
						.moveToElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());
				clicksAndActionsHelper
						.clickOnElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());

			}
		} catch (Exception e) {

		}
	}

	@And("^User Click the RootIcon in ApplicationsOROPTs under maintenance secreen$")
	public void user_click_the_rooticon_in_applicationsoropts_under_maintenance_secreen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());
	}

	@And("^User Click on RADM application in ApplicationsOROPTs$")
	public void user_click_on_radm_application_in_applicationsoropts() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());
	}

	@And("^User Click on RADM application Checkbox in ApplicationsOROPTs$")
	public void user_click_on_radm_application_checkbox_in_applicationsoropts() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
	}

	@And("^User Click on RET application in ApplicationsOROPTs$")
	public void user_click_on_ret_application_in_applicationsoropts() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());
	}

	@And("^User Click on RET application Checkbox in ApplicationsOROPTs$")
	public void user_click_on_ret_application_checkbox_in_applicationsoropts() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
	}

	@And("^User Click on RootIcon in Companies OR Branches in maintenance secreen$")
	public void user_click_on_rooticon_in_companies_or_branches_in_maintenance_secreen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
	}

	@And("^User Click on 1 BAJ application in Companies OR Branches$")
	public void user_click_on_1_baj_application_in_companies_or_branches() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());
	}

	@And("^User Click on  1 BAJ application Checkbox in Companies OR Branches$")
	public void user_click_on_1_baj_application_checkbox_in_companies_or_branches() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
	}

	@And("^User Enter the User ID in UserID tab$")
	public void user_enter_the_user_id_in_userid_tab() throws Throwable {

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());
		transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab().sendKeys(testData.get("User_Id"));
		transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab().sendKeys(Keys.ENTER);

	}

	@And("^User Click on User ID Checkbox under UserID tab$")
	public void user_click_on_user_id_checkbox_under_userid_tab() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				String xpath = "//td[text()='" + "KARTHIK" + "']";
				driver.findElement(By.xpath(xpath)).isDisplayed();

				break;
			} catch (Exception e) {

			}

		}

		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSUserIDCheckbox());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSUserIDCheckbox());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSUserIDCheckbox());

	}

	@And("^User Click on Add button in Restriction Type under Maintenance Screen$")
	public void user_click_on_add_button_in_restriction_type_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());
	}

	@And("^User Click on Select Icon for GL under Restriction Type$")
	public void user_click_on_select_icon_for_gl_under_restriction_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType());
		seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), "GL");
	}

	@And("^User Click on Select Icon for CIF under Restriction Type$")
	public void user_click_on_select_icon_for_cif_under_restriction_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType());
		seleniumActions.getDropDownHelper()
				.SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), "CIF");
	}

	@And("^User Search the GL code in the Restriction Type$")
	public void user_search_the_gl_code_in_the_restriction_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchTheGLCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchTheGLCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchTheGLCode());
	}

	@And("^User Enter the GL code in the GL code search popup$")
	public void user_enter_the_gl_code_in_the_gl_code_search_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());
		transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp().sendKeys(testData.get("GLCode_D3"));
	}

	@And("^User Click on Searched GL code in search popup$")
	public void user_click_on_searched_gl_code_in_search_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());
	}

	@And("^User Click on Account Balance select Tab in Restriction Level$")
	public void user_click_on_account_balance_select_tab_in_restriction_level() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());
		seleniumActions.getDropDownHelper().SelectUsingVisibleText(
				transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel(), "All Account Info");
	}

	@And("^User Click on Searched CIF No in search popup$")
	public void user_click_on_searched_cif_no_in_search_popup() throws Throwable {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());
			seleniumActions.getClickAndActionsHelper()
					.doubleClick(transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());
		} catch (Exception e) {

		}

	}

	@And("^User Click on Add Button under Restriction Level$")
	public void user_click_on_add_button_under_restriction_level() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());
	}

	@And("^User Click on Search Icon in  CIF NO Under the Restriction Level$")
	public void user_click_on_search_icon_in_cif_no_under_the_restriction_level() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());
	}

	@And("^User Enter the CIF No in the Search box$")
	public void user_enter_the_cif_no_in_the_search_box() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());
		transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox().sendKeys(testData.get("CIFCode_D3"));
	}

	@And("^User Click on Save Button under Maintenance Screen$")
	public void user_click_on_save_button_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());
	}

	@And("^User Click on Ok Button in Success PopUp Menu$")
	public void user_click_on_ok_button_in_success_popup_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());
	}

	@And("^User Click on Approve under Account Restrictions$")
	public void user_click_on_approve_under_account_restrictions() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());
	}

	@And("^User Enter the Code in Approve Screen$")
	public void user_enter_the_code_in_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());
		transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen().sendKeys(testData.get("RestrictionCode"));
		transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen().sendKeys(Keys.ENTER);
	}

	@And("^User Click the Selected code in Approve Screen$")
	public void user_click_the_selected_code_in_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());
	}

	@And("^User Click on Approve button in Approve Screen$")
	public void user_click_on_approve_button_in_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());
	}

	@And("^User Click on Maintenance in User under Parameters$")
	public void user_click_on_maintenance_in_user_under_parameters() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());
	}

	@And("^User Click on Search Button under Maintenance Screen$")
	public void user_click_on_search_button_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());
	}

	@And("^User Enter User ID in search under Maintenance Screen$")
	public void user_enter_user_id_in_search_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());
		transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen().sendKeys(testData.get("User_Id"));
		transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen().sendKeys(Keys.ENTER);
	}

	@And("^User Click on Searched ID under Maintenance Screen$")
	public void user_click_on_searched_id_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());
	}

	@And("^User Click on Search Button in Employee Details under Maintenance Screen$")
	public void user_click_on_search_button_in_employee_details_under_maintenance_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User Enter the CIF No in SearchBox$")
	public void user_enter_the_cif_no_in_searchbox() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());
		transactiononstaffaccObj.CSMSADSCIFNoInSearchBox().sendKeys(testData.get("CIFCode_D3"));
	}

	@And("^User Click the Searched CIF NO in Search Box$")
	public void user_click_the_searched_cif_no_in_search_box() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());
	}

	@And("^User Check the Physical User CheckBox in Privilege under Maintenance Screen$")
	public void user_check_the_physical_user_checkbox_in_privilege_under_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());
		try {
			if (transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege().getAttribute("checked")
					.equalsIgnoreCase("checked")) {
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());
			}
		} catch (Exception e) {

		}

	}

	@And("^User Click on Save Button in Maintenance Screen$")
	public void user_click_on_save_button_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());
	}

	@And("^User Click on Ok Button in Success PopUp in User$")
	public void user_click_on_ok_button_in_success_popup_in_user() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());
	}

	// @TSA_157_02

	@And("^User Click on Parameter in SADS Application$")
	public void user_click_on_parameter_in_sads_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSParameterInSADSApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSParameterInSADSApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSParameterInSADSApplication());
	}

	@And("^User Click on User in Parameters under SADS application$")
	public void user_click_on_user_in_parameters_under_sads_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());
	}

	@And("^User Click on Approve in User under Parameters$")
	public void user_click_on_approve_in_user_under_parameters() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());
	}

	@And("^User Click on Search Button under Approve Screen$")
	public void user_click_on_search_button_under_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());
	}

	@And("^User Enter User ID in search under Approve Screen$")
	public void user_enter_user_id_in_search_under_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());
		transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen().sendKeys(testData.get("User_Id"));
		transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen().sendKeys(Keys.ENTER);
	}

	@And("^User Click on Searched ID under Approve Screen$")
	public void user_click_on_searched_id_under_approve_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());
		seleniumActions.getClickAndActionsHelper()
				.doubleClick(transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());
	}

	@And("^User Click on Approve button in Approve Screen under Parameter$")
	public void user_click_on_approve_button_in_approve_screen_under_parameter() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("^User Click on Date to Change the Current Date$")
	public void user_click_on_date_to_change_the_current_date() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());
	}

	@And("^User Enter the Date in User Running Date$")
	public void user_enter_the_date_in_user_running_date() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateInUserRunningDate());
		transactiononstaffaccObj.CSMDateInUserRunningDate().clear();
		transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(testData.get("Dates"));
	}

	@And("^User Click on Use Button in Change Running Date Popup$")
	public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());
		} catch (Exception e) {

		}

	}

	@And("User Click Ok Button for confirmation PopUp for Company Holiday")
	public void user_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
		for (int i = 0; i < 50; i++) {
			try {
				if (transactiononstaffaccObj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
					seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
							transactiononstaffaccObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
					seleniumActions.getClickAndActionsHelper()
							.moveToElement(transactiononstaffaccObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
					seleniumActions.getClickAndActionsHelper().clickOnElement(
							transactiononstaffaccObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
					break;
				}
			} catch (Exception e) {
//				if (i == 49) {
//					Assert.fail(e.getMessage());
//				}
			}
		}
	}

	@And("^User Click Ok Button in Information PopUp menu$")
	public void user_click_ok_button_in_information_popup_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
	}

	@And("^User Click on Close Button in Change Running Date Popup$")
	public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());
	}

	@And("^User Click on Technical Details Icon$")
	public void user_click_on_technical_details_icon() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTechnicalDetailsIcon());
	}

	@And("^User Click Clear Cache in Technical Details Icon$")
	public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());
	}

	@And("^User Click Ok button Under Information PopUp Menu$")
	public void user_click_ok_button_under_information_popup_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());
	}

	@And("^User Click on Transactions under CSM application$")
	public void user_click_on_transactions_under_csm_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMTransactionsMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTransactionsMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTransactionsMainMenu());
	}

	@And("^User Click on Maintenance under Transactions$")
	public void user_click_on_maintenance_under_transactions() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMMaintenanceUnderTransactions());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMMaintenanceUnderTransactions());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMMaintenanceUnderTransactions());
	}

	@And("^User Enter TRX Type in Maintenance Screen$")
	public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());
			transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("TRXType_D1"));
			transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(Keys.TAB);

		} catch (Exception e) {

		}

	}

	@And("^User Enter the Branch Code in Credit Ac in Maintenance Screen$")
	public void user_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMBranchCodeInCreditAc());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMBranchCodeInCreditAc());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMBranchCodeInCreditAc());
		transactiononstaffaccObj.CSMBranchCodeInCreditAc().sendKeys(testData.get("BranchCode_D1"));
		transactiononstaffaccObj.CSMBranchCodeInCreditAc().sendKeys(Keys.TAB);
	}

	@And("^User Enter Currency Code in Credit Ac in Maintenance Screen$")
	public void user_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCurrencyCodeCreditAc());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyCodeCreditAc());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyCodeCreditAc());
		transactiononstaffaccObj.CSMCurrencyCodeCreditAc().sendKeys(testData.get("CurrencyCode_D1"));
		transactiononstaffaccObj.CSMCurrencyCodeCreditAc().sendKeys(Keys.TAB);
	}

	@And("^User Enter GL Code in Credit Ac in Maintenance Screen$")
	public void user_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMGLCodeCreditAc());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMGLCodeCreditAc());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMGLCodeCreditAc());
		transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(testData.get("GLCode_D1"));
		transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(Keys.TAB);
	}

	@And("^User Enter CIF Code in Credit Ac in Maintenance Screen$")
	public void user_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCIFCodeInCreditAc());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());
		transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIFCode_D1"));
		transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(Keys.TAB);
	}

	@And("^User Enter Serial in Credit Ac in Maintenance Screen$")
	public void user_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMSerialInCreditAc());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSerialInCreditAc());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSerialInCreditAc());
				transactiononstaffaccObj.CSMSerialInCreditAc().sendKeys(testData.get("SerialNo_D1"));
				transactiononstaffaccObj.CSMSerialInCreditAc().sendKeys(Keys.TAB);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^User Click Ok Button in Warning PopUp Menu$")
	public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user Enter the BranchCode under TRXType for debitAccounts$")
	public void user_enter_the_branchcode_under_trxtype_for_debitaccounts() throws Throwable {
		for (int i = 0; i <= 3; i++) {
			transactiononstaffaccObj.CSMCore_Transactions_Maintenance_BranchCodeForCredit().sendKeys(Keys.BACK_SPACE);
		}

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_BranchCodeForCredit()
				.sendKeys(testData.get("BranchCode_D2"));

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_BranchCodeForCredit().sendKeys(Keys.TAB);
	}

	@And("^user Enter the CurrencyCode under TRXType for debitAccounts$")
	public void user_enter_the_currencycode_under_trxtype_for_debitaccounts() throws Throwable {

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit()
				.sendKeys(testData.get("CurrencyCode_D2"));

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_CurrencyCodeCodeForCredit().sendKeys(Keys.TAB);
	}

	@And("^user Enter the GLCode under TRXType for debitAccounts$")
	public void user_enter_the_glcode_under_trxtype_for_debitaccounts() throws Throwable {

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_GLCodeCodeForCredit()
				.sendKeys(testData.get("GLCode_D2"));

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_GLCodeCodeForCredit().sendKeys(Keys.TAB);
	}

	@And("^user Enter the CifCode under TRXType for debitAccounts$")
	public void user_enter_the_cifcode_under_trxtype_for_debitaccounts() throws Throwable {

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit()
				.sendKeys(testData.get("CIFCode_D2"));

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_CIFCodeCodeForCredit().sendKeys(Keys.TAB);
	}

	@And("^user Enter the SerialNo under TRXType for debitAccounts$")
	public void user_enter_the_serialno_under_trxtype_for_debitaccounts() throws Throwable {

		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_SerialNoCodeForCredit()
				.sendKeys(testData.get("SerialNo_D2"));
		transactiononstaffaccObj.CSMCore_Transactions_Maintenance_SerialNoCodeForCredit().sendKeys(Keys.TAB);
	}

	@And("^User Enter the Currency in Maintenance Screen$")
	public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());
		transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("CurrencyCode_D1"));
		transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);
	}

//    @And("^User Click Transactions Maintenance for loading Currency code$")
//    public void user_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//    }

	@And("^User Enter the Amount in Maintenance Screen$")
	public void user_enter_the_amount_in_maintenance_screen() throws Throwable {

		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
					transactiononstaffaccObj.CSMAmountInMaintenanceScreen());
			seleniumActions.getClickAndActionsHelper()
					.moveToElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());
			transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"));
			transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(Keys.TAB);
			Thread.sleep(1000);

		} catch (Exception e) {

		}
	}

//    	for (int i = 0; i < 200; i++) {
//    		try {
//    			transactiononstaffaccObj.CSMCurrencyName().isDisplayed();
//    			break;
//			} catch (Exception e) {
//				if (i==199) {
//					Assert.fail(e.getMessage());
//				}
//			}			
//		}
//    

//    

//    @And("^User Click Transactions Maintenance for loading Amount$")
//    public void user_click_transactions_maintenance_for_loading_amount() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());
//    }

	@And("^User Click Save Button in Maintenance Screen$")
	public void user_click_save_button_in_maintenance_screen() throws Throwable {
		for (int i = 0; i < 200; i++) {

			try {
				javascriptHelper.scrollIntoView(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());
				break;
			} catch (Exception e) {

				if (i == 199) {
					Assert.fail(e.getMessage());
				}

			}
		}
	}

	@And("^user check if the  values is entered or not$")
	public void user_check_if_the_values_is_entered_or_not() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(transactiononstaffaccObj.checkIfValueIsEntered());
				if ((transactiononstaffaccObj.checkIfValueIsEntered().getAttribute("prevvalue")) != null) {
					transactiononstaffaccObj.checkIfValueIsEntered().isDisplayed();

				} else {

				}

			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^user Enter the Transaction number$")
	public void user_enter_the_transaction_number() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.Transactions_transactionNo_codeValues());
				clicksAndActionsHelper.clickOnElement(transactiononstaffaccObj.Transactions_transactionNo_codeValues());
				transactiononstaffaccObj.Transactions_transactionNo_codeValues().sendKeys(testData.get("TRXNo"));
				transactiononstaffaccObj.Transactions_transactionNo_codeValues().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("^User click the Approve screens$")
	public void user_click_the_approve_screens() throws Throwable {
		javascriptHelper.scrollIntoView(transactiononstaffaccObj.Transactions_Approvescrn());
		waitHelper.waitForElementwithFluentwait(driver, transactiononstaffaccObj.Transactions_Approvescrn());
		clicksAndActionsHelper.clickOnElement(transactiononstaffaccObj.Transactions_Approvescrn());
	}

	@And("^User get Transaction number from sucess pop up$")
	public void user_get_transaction_number_from_sucess_pop_up() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactiononstaffaccObj.getTransactionNumber());
		String transactionNo = transactiononstaffaccObj.getTransactionNumber().getText().substring(15, 19);
		System.out.println(transactionNo);
		excelDataForTransactionOnStaffAcc.updateTestData("TSA_157_D1", "TRXNo", transactionNo);
		testData = excelDataForTransactionOnStaffAcc.getTestdata("TSA_157_D1");
	}

	@And("^User Click Ok Button in Success PopUp Menu$")
	public void user_click_ok_button_in_success_popup_menu() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
						transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());
				seleniumActions.getClickAndActionsHelper()
						.moveToElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());
				seleniumActions.getClickAndActionsHelper()
						.clickOnElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^click the Approve buttons$")
	public void click_the_approve_buttons() throws Throwable {

		javascriptHelper.scrollIntoView(transactiononstaffaccObj.Transactions_Approvebtn());
		waitHelper.waitForElementwithFluentwait(driver, transactiononstaffaccObj.Transactions_Approvebtn());
		clicksAndActionsHelper.clickOnElement(transactiononstaffaccObj.Transactions_Approvebtn());

	}

	@And("^User Click on Queries under CSM application$")
	public void user_click_on_queries_under_csm_application() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(transactiononstaffaccObj.CSMQueriesMainMenu());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMQueriesMainMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMQueriesMainMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMQueriesMainMenu());
	}

	@And("^User Click on Statement Of Accounts in Queries under CSM application$")
	public void user_click_on_statement_of_accounts_in_queries_under_csm_application() throws Throwable {
		seleniumActions.getJavascriptHelper()
				.scrollIntoView(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMStatementOfAccountsInQueries());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());
	}

	@And("^User Click on By Trade Date under Statement Of Accounts Sub Menu$")
	public void user_click_on_by_trade_date_under_statement_of_accounts_sub_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());
	}

	@And("^User Enter the Currency Value in Account under By Trade Date Screen$")
	public void user_enter_the_currency_value_in_account_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
		transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen()
				.sendKeys(testData.get("CurrencyCode_D2"));
		transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen().sendKeys(Keys.TAB);
	}

	@And("^User Enter the GL Code in Account under By Trade Date Screen$")
	public void user_enter_the_gl_code_in_account_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());
		transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GLCode_D3"));
		transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(Keys.TAB);
	}

	@And("^User Enter the CIF Code in Account under By Trade Date Screen$")
	public void user_enter_the_cif_code_in_account_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());
		transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("CIFCode_D3"));
		transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen().sendKeys(Keys.TAB);
	}

	@And("^User Enter the Serial in Account under By Trade Date Screen$")
	public void user_enter_the_serial_in_account_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());
		transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen().sendKeys(testData.get("SerialNo_D2"));
		transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen().sendKeys(Keys.TAB);
	}

	@And("^User Enter From Date in Periodicity Of Statement under By Trade Date Screen$")
	public void user_enter_from_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());
		transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement().clear();
		transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement().sendKeys(testData.get("Date_No1"));
	}

	@And("^User Enter To Date in Periodicity Of Statement under By Trade Date Screen$")
	public void user_enter_to_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());
		transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement().clear();
		transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement().sendKeys(testData.get("Dates"));
	}

	@And("^User Click Retrieve Button under By Trade Date Screen$")
	public void user_click_retrieve_button_under_by_trade_date_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());
	}

	@And("^User Click on Ok Button in Access Denied PopUp Menu$")
	public void user_click_on_ok_button_in_access_denied_popup_menu() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
				transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.moveToElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());
	}

	@And("^system show the popup success user clicks the ok button$")
	public void system_show_the_popup_success_user_clicks_the_ok_button() throws Throwable {
		try {
			waitHelper.waitForElementwithFluentwait(driver, transactiononstaffaccObj.Transactions_successokbtn());
			clicksAndActionsHelper.clickOnElement(transactiononstaffaccObj.Transactions_successokbtn());
		} catch (Exception e) {
			// TODO: handle exception
		}

		// Thread.sleep(2000);
	}

	@Then("^User Validate If the Statement of Account Displayed as Access Denied$")
	public void user_validate_if_the_statement_of_account_displayed_as_access_denied() throws Throwable {
		for (int i = 0; i < 200; i++) {
			try {
				// seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied());
				Assert.assertTrue(transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied()
						.isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
}