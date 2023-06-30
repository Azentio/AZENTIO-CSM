package stepdefinitions;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSMSADS_TransactiononstaffaccObj;
import pageobjects.csmParam.CSMcore_TransactionObj;
import resources.BaseClass;

public class CSM_TransactionSA_614 extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	CSMSADS_TransactiononstaffaccObj transactiononstaffaccObj = new CSMSADS_TransactiononstaffaccObj(driver);
	CSMcore_TransactionObj CSMcoreTransactionObj = new CSMcore_TransactionObj(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin_614 login = new CSMLogin_614(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"CSMTransactionStaffAcc","Data Set ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCase ID");
//	Map<String, String> testData = new HashMap<>();
//	Map<String, String> loginTestData = new HashMap<>();
	Map<String, String> testData;
	ConfigFileReader configFileReader = new ConfigFileReader();
	UserUtility_614 userUtility = new UserUtility_614(driver);		
	
	//********************************************************** @TSA_158_01 ***********************************************
	
	@Given("^User_614 Navigate to SADS application and login with valid credentials$")				
public void User_614_navigate_to_sads_application_and_login_with_valid_credentials() throws Throwable {					
		driver.get(configFileReader.getSADSApplicationUrl());			
		login.loginIntoSadsApplication();			
}					
					
//	@And("^User_614 update test data set id for TSA_158$")				
//	public void User_614_update_test_data_set_id_for_tsa15801() throws Throwable {				
//		testData = testExecution.getTestdata("TSA_158_D1");			
//	}				
					
	@And("^User_614 Click on Parameters under SADS application$")				
public void User_614_click_on_parameters_under_sads_application() throws Throwable {					
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSParametersMainMenu());			
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSParametersMainMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSParametersMainMenu());					
}					
					
@And("^User_614 Click on Account Restrictions in Parameters under SADS application$")					
public void User_614_click_on_account_restrictions_in_parameters_under_sads_application() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSAccountRestrictionsInParameters());					
}					
					
@And("^User_614 Click on Maintenance in Account Restrictions under Parameters$")					
public void User_614_click_on_maintenance_in_account_restrictions_under_parameters() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSMaintenanceInAccountRestrictions());					
}					
					
@And("^User_614 Enter the value in Code under Maintenance Screen$")					
public void User_614_enter_the_value_in_code_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance());					
//transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance().sendKeys(testData.get("Code"));					
transactiononstaffaccObj.CSMSADSEnterTheValueInCodeUnderMaintenance().sendKeys("6598");					
}					
					
@And("^User_614 Enter the value in Description  under Maintenance Screen$")					
public void User_614_enter_the_value_in_description_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance());					
//transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys(testData.get("Description"));					
transactiononstaffaccObj.CSMSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys("test");					
}					
					
@And("^User_614 Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen$")					
public void User_614_click_the_checkbox_in_grant_access_to_personal_accounts_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCheckBoxInGrantAccessToPersonalAccounts());					
}					
					
@And("^User_614 Click the RootIcon in ApplicationsOROPTs under maintenance secreen$")					
public void User_614_click_the_rooticon_in_applicationsoropts_under_maintenance_secreen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRootIconInApplicationsOROPTs());					
}					
					
@And("^User_614 Click on RADM application in ApplicationsOROPTs$")					
public void User_614_click_on_radm_application_in_applicationsoropts() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRADMApplicationInApplicationsOROPTs());					
}					
					
@And("^User_614 Click on RADM application Checkbox in ApplicationsOROPTs$")					
public void User_614_click_on_radm_application_checkbox_in_applicationsoropts() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());					
}					
					
@And("^User_614 Click on RET application in ApplicationsOROPTs$")					
public void User_614_click_on_ret_application_in_applicationsoropts() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRETApplicationInApplicationsOROPTs());					
}					
					
@And("^User_614 Click on RET application Checkbox in ApplicationsOROPTs$")					
public void User_614_click_on_ret_application_checkbox_in_applicationsoropts() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());					
}					
					
@And("^User_614 Click on RootIcon in Companies OR Branches in maintenance secreen$")					
public void User_614_click_on_rooticon_in_companies_or_branches_in_maintenance_secreen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSRootIconInCompaniesORBranchesInMaintenance());					
}					
					
@And("^User_614 Click on 1 BAJ application in Companies OR Branches$")					
public void User_614_click_on_1_baj_application_in_companies_or_branches() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADS1BAJapplicationInCompaniesORBranches());					
}					
					
@And("^User_614 Click on  1 BAJ application Checkbox in Companies OR Branches$")					
public void User_614_click_on_1_baj_application_checkbox_in_companies_or_branches() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());					
}					
					
					
@And("^User_614 Enter the User_614 ID in User_614ID tab$")					
public void User_614_enter_the_User_614_id_in_User_614id_tab() throws Throwable {					
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab());			
		//transactiononstaffaccObj.CSMSADSEnterTheUser_614IDInUser_614IDTab().sendKeys(testData.get("User_614 ID"));			
		transactiononstaffaccObj.CSMSADSEnterTheUserIDInUserIDTab().sendKeys("CHRISAG");			
		for (int i = 0; i < 200; i++) {			
					try {
					
					
					} catch (Exception e) {
					
					}
				}	
					
	}				
					
@And("^User_614 Click on User_614 ID Checkbox under User_614ID tab$")					
public void User_614_click_on_User_614_id_checkbox_under_User_614id_tab() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				String xpath = "//td[text()='"+"CHRISAG"+"']";	
				driver.findElement(By.xpath(xpath)).isDisplayed();	
				break;	
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail("User_614NameNotVisible");
				}	
			}		
}					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSUserIDCheckbox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSUserIDCheckbox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSUserIDCheckbox());					
}					
					
@And("^User_614 Click on Add button in Restriction Type under Maintenance Screen$")					
public void User_614_click_on_add_button_in_restriction_type_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSAddButtonInRestrictionType());					
}					
					
					
@And("^User_614 Click on Select Icon for GL under Restriction Type$")					
public void User_614_click_on_select_icon_for_gl_under_restriction_type() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType());				
	//seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), testData.get("Restriction Type"));				
	seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), "GL");				
}					
					
@And("^User_614 Click on Select Icon for CIF under Restriction Type$")					
public void User_614_click_on_select_icon_for_cif_under_restriction_type() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType());				
	//seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), testData.get("Restriction Type1"));				
	seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSSelectTIconUnderRestrictionType(), "CIF");				
}					
					
					
@And("^User_614 Search the GL code in the Restriction Type$")					
public void User_614_search_the_gl_code_in_the_restriction_type() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchTheGLCode());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchTheGLCode());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchTheGLCode());					
}					
					
@And("^User_614 Enter the GL code in the GL code search popup$")					
public void User_614_enter_the_gl_code_in_the_gl_code_search_popup() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp());					
//transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp().sendKeys(testData.get("GL Code"));					
transactiononstaffaccObj.CSMSADSEnterTheGLCodeInSearchPopUp().sendKeys("95916");					
}					
					
@And("^User_614 Click on Searched GL code in search popup$")					
public void User_614_click_on_searched_gl_code_in_search_popup() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSClickSearchedGLCodeInSearchPopup());					
}					
					
@And("^User_614 Click on Account Balance select Tab in Restriction Level$")					
public void User_614_click_on_account_balance_select_tab_in_restriction_level() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel());					
seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.CSMSADSAccountBalanceSelectTabInRestrictionLevel(), "All Account Info");					
}					
					
@And("^User_614 Click on Searched CIF No in search popup$")					
public void User_614_click_on_searched_cif_no_in_search_popup() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				String xpath = "//td[text()='"+"993558"+"']";	
				driver.findElement(By.xpath(xpath)).isDisplayed();	
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());	
				seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());	
		seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADS_SearchedCIFNoInSearchPopup());			
				break;	
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail("User_614NameNotVisible");
				}	
			}		
	}				
	}				
					
@And("^User_614 Click on Add Button under Restriction Level$")					
public void User_614_click_on_add_button_under_restriction_level() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADS_AddButtonUnderRestrictionType());					
}					
					
@And("^User_614 Click on Search Icon in  CIF NO Under the Restriction Level$")					
public void User_614_click_on_search_icon_in_cif_no_under_the_restriction_level() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchIconInCIFNOUnderTheRestrictionLevel());					
}					
					
@And("^User_614 Enter the CIF No in the Search box$")					
public void User_614_enter_the_cif_no_in_the_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox());					
//transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox().sendKeys(testData.get("CIF No"));					
transactiononstaffaccObj.CSMSADSEnterTheCIFNoInTheSearchBox().sendKeys("993558");					
}					
					
@And("^User_614 Click on Save Button under Maintenance Screen$")					
public void User_614_click_on_save_button_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADS_SaveButtonUnderMaintenanceScreen());					
}					
					
@And("^User_614 Click on Ok Button in Success PopUp Menu$")					
public void User_614_click_on_ok_button_in_success_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSClickOkButtonInSuccessPopUpMenu());					
}					
					
@And("^User_614 Click on Approve under Account Restrictions$")					
public void User_614_click_on_approve_under_account_restrictions() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSApproveUnderAccountRestrictions());					
}					
					
@And("^User_614 Enter the Code in Approve Screen$")					
public void User_614_enter_the_code_in_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen());					
//transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen().sendKeys(testData.get("Code"));					
transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen().sendKeys("6598");					
transactiononstaffaccObj.CSMSADSEnterCodeInApproveScreen().sendKeys(Keys.ENTER);					
}					
					
@And("^User_614 Click the Selected code in Approve Screen$")					
public void User_614_click_the_selected_code_in_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADS_ClickTheSelectedCodeInApproveScreen());					
}					
					
@And("^User_614 Click on Approve button in Approve Screen$")					
public void User_614_click_on_approve_button_in_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSApproveButtonInApproveScreen());					
}					
					
@And("^User_614 Click on Maintenance in User_614 under Parameters$")					
public void User_614_click_on_maintenance_in_User_614_under_parameters() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSMaintenanceInUserUnderParameters());					
}					
					
@And("^User_614 Click on Search Button under Maintenance Screen$")					
public void User_614_click_on_search_button_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderMaintenanceScreen());					
}					
					
@And("^User_614 Enter User_614 ID in search under Maintenance Screen$")					
public void User_614_enter_User_614_id_in_search_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen());					
//transactiononstaffaccObj.CSMSADSEnterUser_614IDInSearchUnderMaintenanceScreen().sendKeys(testData.get("User_614 ID"),Keys.ENTER);					
transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderMaintenanceScreen().sendKeys("CHRISAG",Keys.ENTER);					
}					
					
@And("^User_614 Click on Searched ID under Maintenance Screen$")					
public void User_614_click_on_searched_id_under_maintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				String xpath = "//td[text()='"+"CHRISAG"+"']";	
				driver.findElement(By.xpath(xpath)).isDisplayed();	
				break;	
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail("User_614NameNotVisible");
				}	
			}		
}					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSSearchedIDUnderMaintenanceScreen());					
}					
					
@And("^User_614 Click on Company Search Button in Employee Details$")					
public void User_614_click_on_company_search_button_in_emplouee_details() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCompanySearchButtonInEmployeeDetails());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCompanySearchButtonInEmployeeDetails());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCompanySearchButtonInEmployeeDetails());			
		break;			
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
}					
					
@And("^User_614 Enter the Company Code in Search Box$")					
public void User_614_enter_the_company_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCompanyCodeInSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCompanyCodeInSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCompanyCodeInSearchBox());					
transactiononstaffaccObj.CSMSADSCompanyCodeInSearchBox().sendKeys("1");					
}					
					
@And("^User_614 Double Click on the Company Searched Code in Search Box$")					
public void User_614_double_click_on_the_company_searched_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDoubleClickOnTheCompanySearchedCode());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDoubleClickOnTheCompanySearchedCode());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSDoubleClickOnTheCompanySearchedCode());					
}					
					
@And("^User_614 Click on Branch Search Button in Employee Details$")					
public void User_614_click_on_branch_search_button_in_emplouee_details() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSBranchSearchButtonInEmployeeDetails());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSBranchSearchButtonInEmployeeDetails());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSBranchSearchButtonInEmployeeDetails());					
}					
					
@And("^User_614 Enter the Branch Code in Search Box$")					
public void User_614_enter_the_branch_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSBranchCodeInSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSBranchCodeInSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSBranchCodeInSearchBox());					
transactiononstaffaccObj.CSMSADSBranchCodeInSearchBox().sendKeys("1");					
}					
					
@And("^User_614 Double Click on the Branch Searched Code in Search Box$")					
public void User_614_double_click_on_the_branch_searched_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDoubleClickOnTheBranchSearchedCode());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDoubleClickOnTheBranchSearchedCode());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSDoubleClickOnTheBranchSearchedCode());					
}					
					
@And("^User_614 Click on Division Search Button in Employee Details$")					
public void User_614_click_on_division_search_button_in_emplouee_details() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDivisionSearchButtonInEmployeeDetails());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDivisionSearchButtonInEmployeeDetails());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSDivisionSearchButtonInEmployeeDetails());					
}					
					
@And("^User_614 Enter the Division Code in Search Box$")					
public void User_614_enter_the_division_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDivisionCodeInSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDivisionCodeInSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSDivisionCodeInSearchBox());					
transactiononstaffaccObj.CSMSADSDivisionCodeInSearchBox().sendKeys("1");					
}					
					
@And("^User_614 Double Click on the Division Searched Code in Search Box$")					
public void User_614_double_click_on_the_division_searched_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDoubleClickOnTheDivisionSearchedCode());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDoubleClickOnTheDivisionSearchedCode());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSDoubleClickOnTheDivisionSearchedCode());					
}					
					
@And("^User_614 Click on Department Search Button in Employee Details$")					
public void User_614_click_on_department_search_button_in_emplouee_details() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDepartmentSearchButtonInEmployeeDetails());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDepartmentSearchButtonInEmployeeDetails());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSDepartmentSearchButtonInEmployeeDetails());					
}					
					
@And("^User_614 Enter the Department Code in Search Box$")					
public void User_614_enter_the_department_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDepartmentCodeInSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDepartmentCodeInSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSDepartmentCodeInSearchBox());					
transactiononstaffaccObj.CSMSADSDepartmentCodeInSearchBox().sendKeys("1");					
}					
					
@And("^User_614 Double Click on the Department Searched Code in Search Box$")					
public void User_614_double_click_on_the_department_searched_code_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSDoubleClickOnTheDepartmentSearchedCode());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSDoubleClickOnTheDepartmentSearchedCode());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSDoubleClickOnTheDepartmentSearchedCode());					
}					
					
@And("^User_614 Click on CIF Search Button in Employee Details under Maintenance Screen$")					
public void User_614_click_on_search_button_in_employee_details_under_maintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonInEmployeeDetails());			
		break;			
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
}					
					
@And("^User_614 Enter the CIF No in SearchBox$")					
public void User_614_enter_the_cif_no_in_searchbox() throws Throwable {					
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCIFNoInSearchBox());			
		//transactiononstaffaccObj.CSMSADSCIFNoInSearchBox().sendKeys(testData.get("CIF No"));			
		transactiononstaffaccObj.CSMSADSCIFNoInSearchBox().sendKeys("993558");			
	}				
					
@And("^User_614 Click the Searched CIF NO in Search Box$")					
public void User_614_click_the_searched_cif_no_in_search_box() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				String xpath = "//td[text()='"+"993558"+"']";	
				driver.findElement(By.xpath(xpath)).isDisplayed();	
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());			
		seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSCSearchedCIFNOInSearchBox());			
				break;	
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail("User_614NameNotVisible");
				}	
			}		
	}				
}					
					
@And("^User_614 Check the Physical User_614 CheckBox in Privilege under Maintenance Screen$")					
public void User_614_check_the_physical_User_614_checkbox_in_privilege_under_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());				
try {					
			if (transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege().getAttribute("checked").equalsIgnoreCase("checked")) {		
				seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());	
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSCheckThePhysicalUserCheckBoxInPrivilege());			
			}		
		} catch (Exception e) {			
					
		}			
}					
					
@And("^User_614 Click on Save Button in Maintenance Screen$")					
public void User_614_click_on_save_button_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSaveButtonInMaintenanceScreen());					
}					
					
@And("^User_614 Click on Ok Button in Success PopUp in User_614$")					
public void User_614_click_on_ok_button_in_success_popup_in_User_614() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopUpInUser());					
}					
					
					
//@TSA_158_02					
					
@Given("^User_614 Navigate to SADS1 application and login with valid credentials$")					
public void User_614_navigate_to_sads1_application_and_login_with_valid_credentials() throws Throwable {					
	driver.get(configFileReader.getSADSApplicationUrl());				
		login.loginIntoSadsApplication2();			
}					
					
@And("^User_614 Click on Parameter in SADS Application$")					
public void User_614_click_on_parameter_in_sads_application() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSParameterInSADSApplication());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSParameterInSADSApplication());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSParameterInSADSApplication());					
}					
					
@And("^User_614 Click on User_614 in Parameters under SADS application$")					
public void User_614_click_on_User_614_in_parameters_under_sads_application() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSUserInParametersUnderSADSApplication());					
}					
					
@And("^User_614 Click on Approve in User_614 under Parameters$")					
public void User_614_click_on_approve_in_User_614_under_parameters() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSApproveInUserUnderParameters());					
}					
					
@And("^User_614 Click on Search Button under Approve Screen$")					
public void User_614_click_on_search_button_under_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSSearchButtonUnderApproveScreen());					
}					
					
@And("^User_614 Enter User_614 ID in search under Approve Screen$")					
public void User_614_enter_User_614_id_in_search_under_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen());					
//transactiononstaffaccObj.CSMSADSEnterUser_614IDInSearchUnderApproveScreen().sendKeys(testData.get("User_614 ID"),Keys.ENTER);					
transactiononstaffaccObj.CSMSADSEnterUserIDInSearchUnderApproveScreen().sendKeys("CHRISAG",Keys.ENTER);					
}					
					
@And("^User_614 Click on Searched ID under Approve Screen$")					
public void User_614_click_on_searched_id_under_approve_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMSADSSearchedIDunderApproveScreen());					
}					
					
@And("^User_614 Click on Approve button in Approve Screen under Parameter$")					
public void User_614_click_on_approve_button_in_approve_screen_under_parameter() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());		
	seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());				
	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADS_ClickApproveButtonInApproveScreen());				
	break;				
			} catch (Exception e) {		
					if (i==199) {
					
					}
			}		
					
		}			
					
}					
					
@And("^User_614 Click Ok button in Success Popup in User_614 Approve$")					
public void User_614_click_ok_button_in_success_popup_in_User_614_approve() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopupInUserApprove());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopupInUserApprove());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSADSOkButtonInSuccessPopupInUserApprove());					
}					
					
					
//@TSA_158_03					
					
@Given("^User_614 Navigate to CSM application and login with valid credentials$")					
public void User_614_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {					
	driver.get(configFileReader.getCSMApplicationUrl());				
		login.loginIntoCSMApplication();			
}					
					
@And("^User_614 Click on Date to Change the Current Date$")					
public void User_614_click_on_date_to_change_the_current_date() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateToChangeTheCurrentDate());					
}					
					
@And("^User_614 Enter the Date in User_614 Running Date$")					
public void User_614_enter_the_date_in_User_614_running_date() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDateInUserRunningDate());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDateInUserRunningDate());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMDateInUserRunningDate());					
transactiononstaffaccObj.CSMDateInUserRunningDate().clear();					
//transactiononstaffaccObj.CSMDateInUser_614RunningDate().sendKeys(testData.get("Date in URD"));					
transactiononstaffaccObj.CSMDateInUserRunningDate().sendKeys(userUtility.currentDate());					
}					
					
@And("^User_614 Click on Use Button in Change Running Date Popup$")					
public void User_614_click_on_use_button_in_change_running_date_popup() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMUseButtonInChangeRunningDate());	
try {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
			CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
	seleniumActions.getClickAndActionsHelper()
			.moveToElement(CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
	seleniumActions.getClickAndActionsHelper()
			.clickOnElement(CSMcoreTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
}

catch (Exception e) {
}
}					
					
@And("^User_614 Click Ok Button in Information PopUp menu$")					
public void User_614_click_ok_button_in_information_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());					
}					
					
@And("^User_614 Click on Close Button in Change Running Date Popup$")					
public void User_614_click_on_close_button_in_change_running_date_popup() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCloseButtonInChangeRunningDate());					
}					
					
@And("^User_614 Click on Technical Details Icon$")					
public void User_614_click_on_technical_details_icon() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTechnicalDetailsIcon());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTechnicalDetailsIcon());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTechnicalDetailsIcon());					
}					
					
@And("^User_614 Click Clear Cache in Technical Details Icon$")					
public void User_614_click_clear_cache_in_technical_details_icon() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSM_ClearCacheInTechnicalDetailsIcon());					
}					
					
@And("^User_614 Click Ok Button Under Information PopUp Menu$")					
public void User_614_click_ok_button_under_information_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonUnderInformationPopUp());					
}					
					
@And("^User_614 Click on Transactions under CSM application$")					
public void User_614_click_on_transactions_under_csm_application() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTransactionsMainMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTransactionsMainMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTransactionsMainMenu());					
}					
					
@And("^User_614 Click on Maintenance under Transactions$")					
public void User_614_click_on_maintenance_under_transactions() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMMaintenanceUnderTransactions());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMMaintenanceUnderTransactions());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMMaintenanceUnderTransactions());					
}					
					
@And("^User_614 Enter TRX Type in Maintenance Screen$")					
public void User_614_enter_trx_type_in_maintenance_screen() throws Throwable {				
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);					
transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_009", "TrxType"),Keys.TAB);					
					
}	

@And("^User_614 Enter TRX Type in Maintenance Screen for TRS_008$")					
public void User_614_enter_trx_type_in_maintenance_screen_for_TRS_008() throws Throwable {				
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);					
transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_008", "TrxType"),Keys.TAB);					
					
}
					
@And("^User_614 Enter the Branch Code in Credit Ac in Maintenance Screen$")					
public void User_614_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMBranchCodeInCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMBranchCodeInCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMBranchCodeInCreditAc());					
//transactiononstaffaccObj.CSMBranchCodeInCreditAc().sendKeys(testData.get("Branch Code"),Keys.TAB);					
transactiononstaffaccObj.CSMBranchCodeInCreditAc().sendKeys(userUtility.getExcelData("TRS_009", "BranchCode1"),Keys.TAB);					
}					
					
					
@And("^User_614 Enter Currency Code in Credit Ac in Maintenance Screen$")					
public void User_614_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyCodeCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyCodeCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyCodeCreditAc());					
//transactiononstaffaccObj.CSMCurrencyCodeCreditAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);					
transactiononstaffaccObj.CSMCurrencyCodeCreditAc().sendKeys(userUtility.getExcelData("TRS_009", "CurrencyCode1"),Keys.TAB);					
}					
					
@And("^User_614 Enter GL Code in Credit Ac in Maintenance Screen$")					
public void User_614_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMGLCodeCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMGLCodeCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMGLCodeCreditAc());					
//transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(testData.get("GL Code"),Keys.TAB);					
transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(userUtility.getExcelData("TRS_009", "GLCode1"),Keys.TAB);					
}					
					
@And("^User_614 Enter CIF Code in Credit Ac in Maintenance Screen$")					
public void User_614_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCIFCodeInCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());					
//transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIF No"),Keys.TAB);					
transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(userUtility.getExcelData("TRS_009", "CIFNo1"),Keys.TAB);					
}			

@And("^User_614 Enter GL Code in Credit Ac in Maintenance Screen for TRS_008$")					
public void User_614_enter_gl_code_in_credit_ac_in_maintenance_screen_for_TRS_008() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMGLCodeCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMGLCodeCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMGLCodeCreditAc());					
//transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(testData.get("GL Code"),Keys.TAB);					
transactiononstaffaccObj.CSMGLCodeCreditAc().sendKeys(userUtility.getExcelData("TRS_008", "GLCode1"),Keys.TAB);					
}					
					
@And("^User_614 Enter CIF Code in Credit Ac in Maintenance Screen for TRS_008$")					
public void User_614_enter_cif_code_in_credit_ac_in_maintenance_screen_for_TRS_008() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCIFCodeInCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCIFCodeInCreditAc());					
//transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIF No"),Keys.TAB);					
transactiononstaffaccObj.CSMCIFCodeInCreditAc().sendKeys(userUtility.getExcelData("TRS_008", "CIFNo1"),Keys.TAB);					
}		
					
@And("^User_614 Enter Serial in Credit Ac in Maintenance Screen$")					
public void User_614_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSerialInCreditAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSerialInCreditAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSerialInCreditAc());					
//transactiononstaffaccObj.CSMSerialInCreditAc().sendKeys(testData.get("Serial"),Keys.TAB);					
transactiononstaffaccObj.CSMSerialInCreditAc().sendKeys(userUtility.getExcelData("TRS_009", "SLNO1"),Keys.TAB);					
}					
					
@And("^User_614 Click Ok Button in Warning PopUp Menu$")					
public void User_614_click_ok_button_in_warning_popup_menu() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());		
	seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());				
	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpMenu());				
	break;				
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
	}				
}					
					
@And("^User_614 Enter the Currency in Maintenance Screen$")					
public void User_614_enter_the_currency_in_maintenance_screen() throws Throwable {					
					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());		
			seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());		
	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());				
	//transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);				
	transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_009", "TRXCURCODE"),Keys.TAB);				
break;					
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}			

@And("^User_614 Enter the Currency in Maintenance Screen for TRS_010$")					
public void User_614_enter_the_currency_in_maintenance_screen_for_Trs_010() throws Throwable {					
					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());		
			seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());		
	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen());				
	//transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);				
	transactiononstaffaccObj.CSMCurrencyInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_010", "TRXCURCODE"),Keys.TAB);				
break;					
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}			
					
					
//    @And("^User_614 Click Transactions Maintenance for loading Currency code$")					
//    public void User_614_click_transactions_maintenance_for_loading_currency_code() throws Throwable {					
//	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());				
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());					
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());					
//    }					
					
@And("^User_614 Enter the Amount in Maintenance Screen$")					
public void User_614_enter_the_amount_in_maintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMAmountInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());					
//transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);					
transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_009", "CreditAmount1"),Keys.TAB);					
break;					
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyName());		
		transactiononstaffaccObj.CSMCurrencyName().isDisplayed();			
			break;		
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
}					
					
//    @And("^User_614 Click Transactions Maintenance for loading Amount$")					
//    public void User_614_click_transactions_maintenance_for_loading_amount() throws Throwable {					
//	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());				
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());					
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSM_TransactionsMaintenanceForLoading());					
//    }					
					
@And("^User_614 Click Save Button in Maintenance Screen$")					
public void User_614_click_save_button_in_maintenance_screen() throws Throwable {					
	for (int i = 0; i <200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());	
			seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());		
			seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSaveButtonInMaintenanceScreen());		
			break;		
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}					
					
@And("^User_614 Get the Transaction No in Success PopUo Menu$")					
public void User_614_get_the_transaction_no_in_success_popuo_menu() throws Throwable {					
	String text = "";				
for (int i = 0; i <200; i++) {					
			try {		
				text = transactiononstaffaccObj.CSMGetTheTransactionNo().getText();	
			break;		
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
String refid = text.substring(15, 19);					
System.out.println(refid);					
}					
					
@And("^User_614 Click Ok Button in Success PopUp Menu$")					
public void User_614_click_ok_button_in_success_popup_menu() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());		
	seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());				
	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenu());				
	break;				
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}					
					
@And("^User_614 Click on Approve Screen under Transactions$")					
public void User_614_click_on_approve_screen_under_transactions() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMApproveScreenUnderTransactions());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMApproveScreenUnderTransactions());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMApproveScreenUnderTransactions());					
}					
					
@And("^User_614 Double Click on the Transaction No$")					
public void User_614_double_click_on_the_transaction_no() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDoubleClickOnTheTransactionNo());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDoubleClickOnTheTransactionNo());					
seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMDoubleClickOnTheTransactionNo());					
}					
					
@And("^User_614 Click on Approve Button for approve the Transaction$")					
public void User_614_click_on_approve_button_for_approve_the_transaction() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMApproveButtonInApproveScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMApproveButtonInApproveScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMApproveButtonInApproveScreen());					
}					
					
@And("^User_614 Click on Ok Button in Success PopUp Menu for Approve Transcation$")					
public void User_614_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenuForTranscation());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenuForTranscation());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInSuccessPopUpMenuForTranscation());					
}					
					
@And("^User_614 Click on Queries under CSM application$")					
public void User_614_click_on_queries_under_csm_application() throws Throwable {					
	seleniumActions.getJavascriptHelper().scrollIntoView(transactiononstaffaccObj.CSMQueriesMainMenu());				
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMQueriesMainMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMQueriesMainMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMQueriesMainMenu());					
}					
					
@And("^User_614 Click on Statement Of Accounts in Queries under CSM application$")					
public void User_614_click_on_statement_of_accounts_in_queries_under_csm_application() throws Throwable {					
	//seleniumActions.getJavascriptHelper().scrollIntoView(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());				
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMStatementOfAccountsInQueries());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMStatementOfAccountsInQueries());					
}					
					
@And("^User_614 Click on By Trade Date under Statement Of Accounts Sub Menu$")					
public void User_614_click_on_by_trade_date_under_statement_of_accounts_sub_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMByTradeDateUnderStatementOfAccountsSubMenu());					
}					
					
@And("^User_614 Enter the Currency Value in Account under By Trade Date Screen$")					
public void User_614_enter_the_currency_value_in_account_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen());					
//transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);					
transactiononstaffaccObj.CSMCurrencyValueIinAccountUnderByTradeDateScreen().sendKeys("840",Keys.TAB);					
}					
					
@And("^User_614 Enter the GL Code in Account under By Trade Date Screen$")					
public void User_614_enter_the_gl_code_in_account_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen());					
//transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);					
transactiononstaffaccObj.CSMGLCodeInAccountUnderByTradeDateScreen().sendKeys("96136",Keys.TAB);					
}					
					
@And("^User_614 Enter the CIF Code in Account under By Trade Date Screen$")					
public void User_614_enter_the_cif_code_in_account_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen());					
//transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("CIF No"),Keys.TAB);					
transactiononstaffaccObj.CSMCIFCodeInAccountUnderByTradeDateScreen().sendKeys("993561",Keys.TAB);					
}					
					
@And("^User_614 Enter the Serial in Account under By Trade Date Screen$")					
public void User_614_enter_the_serial_in_account_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen());					
//transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen().sendKeys(testData.get("Serial"),Keys.TAB);					
transactiononstaffaccObj.CSMSerialInAccountUnderByTradeDateScreen().sendKeys("0",Keys.TAB);					
}					
					
@And("^User_614 Enter From Date in Periodicity Of Statement under By Trade Date Screen$")					
public void User_614_enter_from_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement());					
transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement().clear();					
//transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement().sendKeys(testData.get("From Date"));					
transactiononstaffaccObj.CSMFromDateInPeriodicityOfStatement().sendKeys(userUtility.currentDate());					
}					
					
@And("^User_614 Enter To Date in Periodicity Of Statement under By Trade Date Screen$")					
public void User_614_enter_to_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement());					
transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement().clear();					
//transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement().sendKeys(testData.get("To Date"));					
transactiononstaffaccObj.CSMToDateInPeriodicityOfStatement().sendKeys("25/05/2023");					
}					
					
@And("^User_614 Click Retrieve Button under By Trade Date Screen$")					
public void User_614_click_retrieve_button_under_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMRetrieveButtonUnderByTradeDateScreen());					
}					
					
@And("^User_614 Click on Ok Button in Access Denied PopUp Menu$")					
public void User_614_click_on_ok_button_in_access_denied_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInAccessDeniedPopUpMenu());					
}					
					
@Then("^User_614 Validate If the Statement of Account Displayed as Access Denied$")					
public void User_614_validate_if_the_statement_of_account_displayed_as_access_denied() throws Throwable {					
	for (int i = 0; i <200; i++) {				
		try {			
			//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied());		
	Assert.assertTrue(transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountDisplayedAsAccessDenied().isDisplayed());				
	break;				
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}					
					
@Then("^User_614 Validate If the Statement of Account is Displayed$")					
public void User_614_validate_if_the_statement_of_account_is_displayed() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountIsDisplayed());				
Assert.assertTrue(transactiononstaffaccObj.CSMValidateIfTheStatementOfAccountIsDisplayed().isDisplayed());					
}					
					
					
//************************************************************ @TRS_008 **************************************************					
					
@And("^User_614 Click Close Button in View Memo Popup menu$")					
public void User_614_click_close_button_in_view_memo_popup_menu() throws Throwable {					
	for (int i = 0; i < 50; i++) {				
			try {		
				if (transactiononstaffaccObj.CSMCloseButtonInViewMemoPopupMenu().isEnabled()) {	
					seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCloseButtonInViewMemoPopupMenu());
			seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCloseButtonInViewMemoPopupMenu());		
			break;		
				}	
					
			} catch (Exception e) {		
					
			}		
		}			
		//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCloseButtonInViewMemoPopupMenu());			
					
}					
					
@Then("^User_614 Validate User_614 Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF$")					
public void User_614_validate_User_614_does_not_have_access_on_this_trx_type_377_for_the_economic_sector_4_of_this_cif() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMValidateUserDoesNotHaveAcces());				
Assert.assertTrue(transactiononstaffaccObj.CSMValidateUserDoesNotHaveAcces().isDisplayed());					
}					
					
@And("^User_614 Click Ok Button in Cannot Proceed PopUp Menu$")					
public void User_614_click_ok_button_in_cannot_proceed_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInCannotProceedPopUpMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInCannotProceedPopUpMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInCannotProceedPopUpMenu());					
}					
					
//************************************************* @TRS_009 ***********************************************					
					
@Then("^User_614 Validate User_614 does not have rights to trade with selected Currency 144$")					
public void User_614_validate_User_614_does_not_have_rights_to_trade_with_selected_currency_144() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency());				
Assert.assertTrue(transactiononstaffaccObj.CSM_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency().isDisplayed());					
}					
					
@And("^User_614 Click Ok Button in CannotProceed Popup Menu$")					
public void User_614_click_ok_button_in_cannotproceed_popup_menu() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMClickOkButtonInCannotProceedPopupMenu());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMClickOkButtonInCannotProceedPopupMenu());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMClickOkButtonInCannotProceedPopupMenu());					
}					
					
@And("^User_614 Enter the Amount under Maintenance Screen$")					
public void User_614_enter_the_amount_under_maintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMAmountUnderMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMAmountUnderMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMAmountUnderMaintenanceScreen());					
transactiononstaffaccObj.CSMAmountUnderMaintenanceScreen().sendKeys("1000",Keys.TAB);					
break;					
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
}					
					
//************************************************* @TRS_0010 ***********************************************					
					
@And("^User_614 Click Ok Button in Warning PopUp to go back to Maintenance$")					
public void User_614_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());					
}					
					
@And("^User_614 Click on Search Button in Maintenance Screen$")					
public void User_614_click_on_search_button_in_meintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSearchButtonInMaintenanceScreen());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSearchButtonInMaintenanceScreen());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSearchButtonInMaintenanceScreen());			
		break;			
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
}					
					
@And("^User_614 Enter the Transaction No in Search Box$")					
public void User_614_enter_the_transaction_no_in_search_box() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox());					
transactiononstaffaccObj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7609",Keys.ENTER);					
}					
					
@And("^User_614 Double Click on the Searched Transaction No in Search Box$")					
public void User_614_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDoubleClickOnTheSearchedTransactionNo());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDoubleClickOnTheSearchedTransactionNo());			
		seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMDoubleClickOnTheSearchedTransactionNo());			
		break;			
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
					
			}		
		}			
					
}					
					
@And("^User_614 Click on Booked Entries in Maintenance Screen$")					
public void User_614_click_on_booked_entries_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMBookedEntriesInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMBookedEntriesInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMBookedEntriesInMaintenanceScreen());					
}					
					
@Then("^User_614 Validate the Credit Amount in By Trade Date Screen$")					
public void User_614_validate_the_credit_amount_in_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMValidateTheCreditAmount());				
	String amount1 = "1000";				
	System.out.println(amount1);				
	String amount = transactiononstaffaccObj.CSMValidateTheCreditAmount().getText();				
	String replace = amount.replace(",","");				
	String[] CVAmount = replace.split("[.]");				
	for (String string : CVAmount) {				
		System.out.println(string);			
		}			
	System.out.println(CVAmount[0]);				
	Assert.assertEquals(CVAmount[0], amount1);				
}					
					
@And("^User_614 Enter the Op No in By Trade Date Screen$")					
public void User_614_enter_the_op_no_in_by_trade_date_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
			try {		
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMEnterTheOpNoInByTradeDateScreen());	
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMEnterTheOpNoInByTradeDateScreen());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMEnterTheOpNoInByTradeDateScreen());			
		transactiononstaffaccObj.CSMEnterTheOpNoInByTradeDateScreen().sendKeys("1110461", Keys.ENTER);			
		break;			
			} catch (Exception e) {		
				if (i==199) {	
					Assert.fail(e.getMessage());
				}	
			}		
		}			
					
}					
					
//    @And("^User_614 Double Click the Searched Op No in By Trade Date Screen$")					
//    public void User_614_double_click_the_searched_op_no_in_by_trade_date_screen() throws Throwable {					
//	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMDoubleClickTheSearchedOpNo());				
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMDoubleClickTheSearchedOpNo());					
//        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.CSMDoubleClickTheSearchedOpNo());					
//    }					
					
					
//************************************************* @TRS_0010 ***********************************************					



@And("^User_614 Enter Withdrawal TRX Type in Maintenance Screen$")					
public void User_614_enter_withdrawal_trx_type_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen());					
//transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);					
transactiononstaffaccObj.CSMTRXTypeInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_011", "TrxType"),Keys.TAB);					
}					
					
@And("^User_614 Enter Currency Code in Debit Ac in Maintenance Screen$")					
public void User_614_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCurrencyCodeDebitAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCurrencyCodeDebitAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCurrencyCodeDebitAc());					
//transactiononstaffaccObj.CSMCurrencyCodeDebitAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);					
transactiononstaffaccObj.CSMCurrencyCodeDebitAc().sendKeys(userUtility.getExcelData("TRS_011", "CurrencyCode1"),Keys.TAB);					
}					
					
@And("^User_614 Enter GL Code in Debit Ac in Maintenance Screen$")					
public void User_614_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMGLCodeDebitAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMGLCodeDebitAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMGLCodeDebitAc());					
//transactiononstaffaccObj.CSMGLCodeDebitAc().sendKeys(testData.get("GL Code"),Keys.TAB);					
transactiononstaffaccObj.CSMGLCodeDebitAc().sendKeys(userUtility.getExcelData("TRS_011", "GLCode1"),Keys.TAB);					
}					
					
@And("^User_614 Enter CIF Code in Debit Ac in Maintenance Screen$")					
public void User_614_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMCIFCodeInDebitAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMCIFCodeInDebitAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMCIFCodeInDebitAc());					
//transactiononstaffaccObj.CSMCIFCodeInDebitAc().sendKeys(testData.get("CIF No"),Keys.TAB);					
transactiononstaffaccObj.CSMCIFCodeInDebitAc().sendKeys(userUtility.getExcelData("TRS_011", "CIFNo1"),Keys.TAB);					
}					
					
@And("^User_614 Enter Serial in Debit Ac in Maintenance Screen$")					
public void User_614_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMSerialInDebitAc());				
seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMSerialInDebitAc());					
seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMSerialInDebitAc());					
//transactiononstaffaccObj.CSMSerialInDebitAc().sendKeys(testData.get("Serial"),Keys.TAB);					
transactiononstaffaccObj.CSMSerialInDebitAc().sendKeys(userUtility.getExcelData("TRS_011", "SLNO1"),Keys.TAB);					
}					
					
@And("^User_614 Enter the Amount for Debit in Maintenance Screen$")					
public void User_614_enter_the_amount_for_debit_in_maintenance_screen() throws Throwable {					
	for (int i = 0; i < 200; i++) {				
		try {			
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSMAmountInMaintenanceScreen());		
		seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());			
		seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.CSMAmountInMaintenanceScreen());			
		//transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);			
		transactiononstaffaccObj.CSMAmountInMaintenanceScreen().sendKeys(userUtility.getExcelData("TRS_011", "CreditAmount1"),Keys.TAB);			
		break;			
			} catch (Exception e) {		
				Assert.fail();	
			}		
		}			
}					
					
@Then("^User_614 Validate the Debit Amount in By Trade Date Screen$")					
public void User_614_validate_the_debit_amount_in_by_trade_date_screen() throws Throwable {					
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.CSM_ValidateTheDebitAmount());				
	String amount1 = "1000";				
	System.out.println(amount1);				
	String amount = transactiononstaffaccObj.CSM_ValidateTheDebitAmount().getText();				
	String replace = amount.replace(",","");				
	String[] CVAmount = replace.split("[.]");				
	for (String string : CVAmount) {				
		System.out.println(string);			
		}			
	System.out.println(CVAmount[0]);				
	Assert.assertEquals(CVAmount[0], amount1);				
}					



//*************************************************************** TRS_052_01 *******************************************

@Given("^User_614 Navigate to CSMParam application and login with valid credentials$")
public void User_614_navigate_to_csmparam_application_and_login_with_valid_credentials() throws Throwable {
	driver.get(configFileReader.getCSMparamsUrl());
	login.loginIntoCSMParamApplication();
}

@And("^User_614 Click on Parameters under CSMParam Application$")
public void User_614_click_on_parameters_under_csmparam_application() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
}

@And("^User_614 Click on System Parameters under Parameters Main Menu$")
public void User_614_click_on_system_parameters_under_parameters_main_menu() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
}

@And("^User_614 Click on Transaction Type under System Parameters Sub Menu$")
public void User_614_click_on_transaction_type_under_system_parameters_sub_menu() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
}

@And("^User_614 Click on Update After Approve in Transaction Type under System Parameters Sub Menu$")
public void User_614_click_on_update_after_approve_in_transaction_type_under_system_parameters_sub_menu() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
}

@And("^User_614 Enter the Trx Type in Code under Update After Approve Screen$")
public void User_614_enter_the_trx_type_in_code_under_update_after_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamEnterTheTrxTypeInCode());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamEnterTheTrxTypeInCode());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamEnterTheTrxTypeInCode());
    transactiononstaffaccObj.csmParamEnterTheTrxTypeInCode().sendKeys("377",Keys.ENTER);
}

@And("^Use Double Click on the Searched Code in Update After Approve Screen$")
public void use_double_click_on_the_searched_code_in_update_after_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCode());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCode());
    seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCode());
}

@And("^User_614 Check the Enable Multi Branch flag in Update After Approve Screen$")
public void User_614_check_the_enable_multi_branch_flag_in_update_after_approve_screen() throws Throwable { 
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag());
			if (transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue").isEmpty()) {
				transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().click();
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().click();
			    	transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().click();
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
		}


@And("^User_614 Click on Update After Approve button in Update After Approve Screen$")
public void User_614_click_on_update_after_approve_button_in_update_after_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
}

@And("^User_614 Click Ok Button in Confirm PopUp Menu in Update After Approve Screen$")
public void User_614_click_ok_button_in_confirm_popup_menu_in_update_after_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
}

@And("^User_614 Click Ok Button in Success PopUp Menu in Update After Approve Screen$")
public void User_614_click_ok_button_in_success_popup_menu_in_update_after_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
}

@And("^User_614 Click on Approve under Transaction Type$")
public void User_614_click_on_approve_under_transaction_type() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamApproveUnderTransactionType());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamApproveUnderTransactionType());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamApproveUnderTransactionType());
}

@And("^User_614 Enter the Trx Type in Code under Approve Screen$")
public void User_614_enter_the_trx_type_in_code_under_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
    transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen().sendKeys("377",Keys.ENTER);
}

@And("^User_614 Double Click on the Searched Code in Approve Screen$")
public void User_614_double_click_on_the_searched_code_in_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
    seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
}

@And("^User_614 Click on Approve Button in Approve Screen under System Parameters$")
public void User_614_click_on_approve_button_in_approve_screen_under_system_parameters() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
}

@And("^User_614 Click on Ok Button in Confirm PopUp under Approve Screen$")
public void User_614_click_on_ok_button_in_confirm_popup_under_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
}

@And("^User_614 Click on Ok Button in Success PopUp under Approve Screen$")
public void User_614_click_on_ok_button_in_success_popup_under_approve_screen() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
}

@And("^User_614 Uncheck the Enable Multi Branch flag in Update After Approve Screen$")
public void User_614_uncheck_the_enable_multi_branch_flag_in_update_after_approve_screen() throws Throwable {
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag());
			if (transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue").isEmpty()) {
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParamCheckTheEnableMultiBranchFlag().click();			    
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
		}

//@And("^User_614 Click Ok Button in information PopUp menu in Update After Approve Screen$")
//public void User_614_click_ok_button_in_information_popup_menu_in_update_after_approve_screen() throws Throwable {
//	status= false;
//	//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen());
//	for (int i = 0; i < 50; i++) {
//		try {
//			if (transactiononstaffaccObj.csmParam_InformationPopUpForUpdateAfterApproveScreen().isDisplayed()) {
//				status= true;
//				transactiononstaffaccObj.csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen().click();
//				break;
//			}				
//		} catch (Exception e) {
//			
//		}
//	}
//}

@And("^User_614 Enter the Value Date in Maintenance Screen$")
public void User_614_enter_the_value_date_in_maintenance_screen() throws Throwable {
	for (int i = 0; i < 500; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValueDateInMaintenanceScreen());
		    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmValueDateInMaintenanceScreen());
		    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmValueDateInMaintenanceScreen());
		    transactiononstaffaccObj.csmValueDateInMaintenanceScreen().clear();
		    transactiononstaffaccObj.csmValueDateInMaintenanceScreen().sendKeys("31/05/2023");
		    break;
		} catch (Exception e) {
			
		}
	}
	
	/*
	 * for (int i = 0; i < 200; i++) { try {
	 * seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,
	 * transactiononstaffaccObj.csmCurrencyName());
	 * transactiononstaffaccObj.csmCurrencyName().isDisplayed(); break; } catch
	 * (Exception e) { if (i==199) { Assert.fail(e.getMessage()); } } }
	 */
}

@Then("^User_614 Validate the Stopper Message in Cannot Proceed PopUp Menu$")
public void User_614_validate_the_stopper_message_in_cannot_proceed_popup_menu() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmStopperMessageInCannotProceedPopUpMenu());
    Assert.assertTrue(transactiononstaffaccObj.csmStopperMessageInCannotProceedPopUpMenu().isDisplayed());
}

@And("^User_614 Click Ok Button in Cannot Proceed PopUp Menu in Maintenance$")
public void User_614_click_ok_button_in_cannot_proceed_popup_menu_in_maintenance() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
}

@And("^User_614 Enter the Amount under Maintenance Menu$")
public void User_614_enter_the_amount_under_maintenance_menu() throws Throwable {
	for (int i = 0; i < 200; i++) {
		try {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmAmountInMaintenanceScreen());
    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmAmountInMaintenanceScreen());
    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmAmountInMaintenanceScreen());
    //transactiononstaffaccObj.csmAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
    transactiononstaffaccObj.csmAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
    break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}   

	} 
	
}

@And("^User_614 Check the Allow Back dated Value Date flag in Update After Approve Screen$")
public void User_614_check_the_allow_back_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag());
			if (transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue").isEmpty()) {
				transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().click();
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().click();
			    	transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().click();
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
}

@And("^User_614 Check the Allow Post dated Value Date flag in Update After Approve Screen$")
public void User_614_check_the_allow_post_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag());
			if (transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue").isEmpty()) {
				transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().click();
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().click();
			    	transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().click();
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
}

@And("^User_614 UnCheck the Allow Back dated Value Date flag in Update After Approve Screen$")
public void User_614_uncheck_the_allow_back_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag());
			if (transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue").isEmpty()) {
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParamAllowBackDatedValueDateFlag().click();			    
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
}

@And("^User_614 UnCheck the Allow Post dated Value Date flag in Update After Approve Screen$")
public void User_614_uncheck_the_allow_post_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
	for (int i = 0; i < 100; i++) {
		try {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag());
			if (transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue").isBlank()||transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue").isEmpty()) {
			    break;
			}
			    else {
			    	transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().getAttribute("initialvalue");
			    	transactiononstaffaccObj.csmParam_AllowPostDatedValueDateFlag().click();			    
			    	break;
				}		    	
		} catch (Exception e) {	
		
		}
	}
}

@Then("^User_614 Validate if the Value Date field is Disable$")
public void User_614_validate_if_the_value_date_field_is_disable() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValueDateInMaintenanceScreen());
    Assert.assertTrue(transactiononstaffaccObj.csmValueDateInMaintenanceScreen().getAttribute("readonly").equalsIgnoreCase("readonly"));
}

    
 }
 

    
    
    

