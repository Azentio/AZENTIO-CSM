package stepdefinitions;

import java.util.Map;

import org.junit.Assume;
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
import resources.BaseClass;

public class CSM_TransactionSA extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	CSMSADS_TransactiononstaffaccObj transactiononstaffaccObj = new CSMSADS_TransactiononstaffaccObj(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin login = new CSMLogin(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"CSMTransactionStaffAcc","Data Set ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCase ID");
//	Map<String, String> testData = new HashMap<>();
//	Map<String, String> loginTestData = new HashMap<>();
	Map<String, String> testData;
	ConfigFileReader configFileReader = new ConfigFileReader();
	boolean status;
	
	//********************************************************** @TSA_158_01 ***********************************************
	
	@Given("^User Navigate to SADS application and login with valid credentials$")
    public void user_navigate_to_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getSADSApplicationUrl());
		login.loginIntoSadsApplication();
    }
	
//	 @And("^user update test data set id for TSA_158$")
//	    public void user_update_test_data_set_id_for_tsa15801() throws Throwable {
//		 testData = testExecution.getTestdata("TSA_158_D1");
//	    }
	
	@And("^User Click on Parameters under SADS application$")
    public void user_click_on_parameters_under_sads_application() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSParametersMainMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSParametersMainMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSParametersMainMenu());
    }

    @And("^User Click on Account Restrictions in Parameters under SADS application$")
    public void user_click_on_account_restrictions_in_parameters_under_sads_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSAccountRestrictionsInParameters());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSAccountRestrictionsInParameters());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSAccountRestrictionsInParameters()); 
    }

    @And("^User Click on Maintenance in Account Restrictions under Parameters$")
    public void user_click_on_maintenance_in_account_restrictions_under_parameters() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSMaintenanceInAccountRestrictions());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSMaintenanceInAccountRestrictions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSMaintenanceInAccountRestrictions()); 
    }

    @And("^User Enter the value in Code under Maintenance Screen$")
    public void user_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterTheValueInCodeUnderMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterTheValueInCodeUnderMaintenance());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterTheValueInCodeUnderMaintenance()); 
        //transactiononstaffaccObj.csmSADSEnterTheValueInCodeUnderMaintenance().sendKeys(testData.get("Code")); 
        transactiononstaffaccObj.csmSADSEnterTheValueInCodeUnderMaintenance().sendKeys("6598");
    }

    @And("^User Enter the value in Description  under Maintenance Screen$")
    public void user_enter_the_value_in_description_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterTheValueInDescriptionUnderMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterTheValueInDescriptionUnderMaintenance());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterTheValueInDescriptionUnderMaintenance()); 
        //transactiononstaffaccObj.csmSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys(testData.get("Description"));
        transactiononstaffaccObj.csmSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys("test");
    }
    
    @And("^User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen$")
    public void user_click_the_checkbox_in_grant_access_to_personal_accounts_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCheckBoxInGrantAccessToPersonalAccounts());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCheckBoxInGrantAccessToPersonalAccounts());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSCheckBoxInGrantAccessToPersonalAccounts());
    }

    @And("^User Click the RootIcon in ApplicationsOROPTs under maintenance secreen$")
    public void user_click_the_rooticon_in_applicationsoropts_under_maintenance_secreen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRootIconInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRootIconInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRootIconInApplicationsOROPTs());
    }

    @And("^User Click on RADM application in ApplicationsOROPTs$")
    public void user_click_on_radm_application_in_applicationsoropts() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRADMApplicationInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRADMApplicationInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRADMApplicationInApplicationsOROPTs());
    }

    @And("^User Click on RADM application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_radm_application_checkbox_in_applicationsoropts() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRADMApplicationCheckboxInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRADMApplicationCheckboxInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRADMApplicationCheckboxInApplicationsOROPTs());
    }

    @And("^User Click on RET application in ApplicationsOROPTs$")
    public void user_click_on_ret_application_in_applicationsoropts() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRETApplicationInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRETApplicationInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRETApplicationInApplicationsOROPTs());
    }

    @And("^User Click on RET application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_ret_application_checkbox_in_applicationsoropts() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRETApplicationCheckboxInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRETApplicationCheckboxInApplicationsOROPTs());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRETApplicationCheckboxInApplicationsOROPTs());
    }

    @And("^User Click on RootIcon in Companies OR Branches in maintenance secreen$")
    public void user_click_on_rooticon_in_companies_or_branches_in_maintenance_secreen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSRootIconInCompaniesORBranchesInMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSRootIconInCompaniesORBranchesInMaintenance());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSRootIconInCompaniesORBranchesInMaintenance());
    }

    @And("^User Click on 1 BAJ application in Companies OR Branches$")
    public void user_click_on_1_baj_application_in_companies_or_branches() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS1BAJapplicationInCompaniesORBranches());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS1BAJapplicationInCompaniesORBranches());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADS1BAJapplicationInCompaniesORBranches());
    }

    @And("^User Click on  1 BAJ application Checkbox in Companies OR Branches$")
    public void user_click_on_1_baj_application_checkbox_in_companies_or_branches() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS1BAJApplicationCheckboxInCompaniesORBranches());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS1BAJApplicationCheckboxInCompaniesORBranches());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADS1BAJApplicationCheckboxInCompaniesORBranches());
    }


    @And("^User Enter the User ID in UserID tab$")
    public void user_enter_the_user_id_in_userid_tab() throws Throwable {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab());
		        //transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab().sendKeys(testData.get("User ID"));
		        transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab().sendKeys("CHRISAG");
		        for (int i = 0; i < 200; i++) {
					try {						
						transactiononstaffaccObj.csmSADSEnterTheUserIDInUserIDTab().sendKeys(Keys.ENTER);
							break;												
					} catch (Exception e) {
						Assert.fail("CannotClickEnter");
					}
				}
		        
	}

    @And("^User Click on User ID Checkbox under UserID tab$")
    public void user_click_on_user_id_checkbox_under_userid_tab() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				String xpath = "//td[text()='"+"CHRISAG"+"']";
				driver.findElement(By.xpath(xpath)).isDisplayed();			
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("UserNameNotVisible");
				}
			}	
    }
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSUserIDCheckbox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSUserIDCheckbox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSUserIDCheckbox());
    }

    @And("^User Click on Add button in Restriction Type under Maintenance Screen$")
    public void user_click_on_add_button_in_restriction_type_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSAddButtonInRestrictionType());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSAddButtonInRestrictionType());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSAddButtonInRestrictionType());
    }

    
    @And("^User Click on Select Icon for GL under Restriction Type$")
    public void user_click_on_select_icon_for_gl_under_restriction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType());
    	//seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType(), testData.get("Restriction Type")); 
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType(), "GL");
    }
    
    @And("^User Click on Select Icon for CIF under Restriction Type$")
    public void user_click_on_select_icon_for_cif_under_restriction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType());
    	//seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType(), testData.get("Restriction Type1")); 
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.csmSADSSelectTIconUnderRestrictionType(), "CIF");
    }


    @And("^User Search the GL code in the Restriction Type$")
    public void user_search_the_gl_code_in_the_restriction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchTheGLCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchTheGLCode());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSearchTheGLCode());
    }

    @And("^User Enter the GL code in the GL code search popup$")
    public void user_enter_the_gl_code_in_the_gl_code_search_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterTheGLCodeInSearchPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterTheGLCodeInSearchPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterTheGLCodeInSearchPopUp());
        //transactiononstaffaccObj.csmSADSEnterTheGLCodeInSearchPopUp().sendKeys(testData.get("GL Code"));
        transactiononstaffaccObj.csmSADSEnterTheGLCodeInSearchPopUp().sendKeys("95916");      
    }

    @And("^User Click on Searched GL code in search popup$")
    public void user_click_on_searched_gl_code_in_search_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSClickSearchedGLCodeInSearchPopup());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSClickSearchedGLCodeInSearchPopup());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSClickSearchedGLCodeInSearchPopup());
    }

    @And("^User Click on Account Balance select Tab in Restriction Level$")
    public void user_click_on_account_balance_select_tab_in_restriction_level() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSAccountBalanceSelectTabInRestrictionLevel());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSAccountBalanceSelectTabInRestrictionLevel());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSAccountBalanceSelectTabInRestrictionLevel());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(transactiononstaffaccObj.csmSADSAccountBalanceSelectTabInRestrictionLevel(), "All Account Info");
    }
    
    @And("^User Click on Searched CIF No in search popup$")
    public void user_click_on_searched_cif_no_in_search_popup() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				String xpath = "//td[text()='"+"993558"+"']";
				driver.findElement(By.xpath(xpath)).isDisplayed();
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS_SearchedCIFNoInSearchPopup());
				seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS_SearchedCIFNoInSearchPopup());
		        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADS_SearchedCIFNoInSearchPopup());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("UserNameNotVisible");
				}
			}	
    	}    	 				
	} 

    @And("^User Click on Add Button under Restriction Level$")
    public void user_click_on_add_button_under_restriction_level() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS_AddButtonUnderRestrictionType());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS_AddButtonUnderRestrictionType());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADS_AddButtonUnderRestrictionType());
    }

    @And("^User Click on Search Icon in  CIF NO Under the Restriction Level$")
    public void user_click_on_search_icon_in_cif_no_under_the_restriction_level() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchIconInCIFNOUnderTheRestrictionLevel());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchIconInCIFNOUnderTheRestrictionLevel());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSearchIconInCIFNOUnderTheRestrictionLevel());
    }

    @And("^User Enter the CIF No in the Search box$")
    public void user_enter_the_cif_no_in_the_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterTheCIFNoInTheSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterTheCIFNoInTheSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterTheCIFNoInTheSearchBox());
        //transactiononstaffaccObj.csmSADSEnterTheCIFNoInTheSearchBox().sendKeys(testData.get("CIF No"));
        transactiononstaffaccObj.csmSADSEnterTheCIFNoInTheSearchBox().sendKeys("993558");
    }

    @And("^User Click on Save Button under Maintenance Screen$")
    public void user_click_on_save_button_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS_SaveButtonUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS_SaveButtonUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADS_SaveButtonUnderMaintenanceScreen());
    }

    @And("^User Click on Ok Button in Success PopUp Menu$")
    public void user_click_on_ok_button_in_success_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSClickOkButtonInSuccessPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSClickOkButtonInSuccessPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSClickOkButtonInSuccessPopUpMenu());
    }

    @And("^User Click on Approve under Account Restrictions$")
    public void user_click_on_approve_under_account_restrictions() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSApproveUnderAccountRestrictions());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSApproveUnderAccountRestrictions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSApproveUnderAccountRestrictions());
    }

    @And("^User Enter the Code in Approve Screen$")
    public void user_enter_the_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen());
        //transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen().sendKeys(testData.get("Code"));
        transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen().sendKeys("6598");
        transactiononstaffaccObj.csmSADSEnterCodeInApproveScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Click the Selected code in Approve Screen$")
    public void user_click_the_selected_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS_ClickTheSelectedCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS_ClickTheSelectedCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADS_ClickTheSelectedCodeInApproveScreen());
    }

    @And("^User Click on Approve button in Approve Screen$")
    public void user_click_on_approve_button_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSApproveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSApproveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSApproveButtonInApproveScreen());
    }
    
    @And("^User Click on Maintenance in User under Parameters$")
    public void user_click_on_maintenance_in_user_under_parameters() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSMaintenanceInUserUnderParameters());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSMaintenanceInUserUnderParameters());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSMaintenanceInUserUnderParameters());
    }

    @And("^User Click on Search Button under Maintenance Screen$")
    public void user_click_on_search_button_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchButtonUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchButtonUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSearchButtonUnderMaintenanceScreen());
    }

    @And("^User Enter User ID in search under Maintenance Screen$")
    public void user_enter_user_id_in_search_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderMaintenanceScreen());
        //transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderMaintenanceScreen().sendKeys(testData.get("User ID"),Keys.ENTER);
        transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderMaintenanceScreen().sendKeys("CHRISAG",Keys.ENTER);
    }

    @And("^User Click on Searched ID under Maintenance Screen$")
    public void user_click_on_searched_id_under_maintenance_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				String xpath = "//td[text()='"+"CHRISAG"+"']";
				driver.findElement(By.xpath(xpath)).isDisplayed();				
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("UserNameNotVisible");
				}
			}	
    }    	 	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchedIDUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchedIDUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSSearchedIDUnderMaintenanceScreen());
    }
    
    @And("^User Click on Company Search Button in Employee Details$")
    public void user_click_on_company_search_button_in_emplouee_details() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCompanySearchButtonInEmployeeDetails());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCompanySearchButtonInEmployeeDetails());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSCompanySearchButtonInEmployeeDetails());	   
		        break;		        
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }
    	        
    @And("^User Enter the Company Code in Search Box$")
    public void user_enter_the_company_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCompanyCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCompanyCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSCompanyCodeInSearchBox());
        transactiononstaffaccObj.csmSADSCompanyCodeInSearchBox().sendKeys("1");
    }

    @And("^User Double Click on the Company Searched Code in Search Box$")
    public void user_double_click_on_the_company_searched_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDoubleClickOnTheCompanySearchedCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDoubleClickOnTheCompanySearchedCode());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSDoubleClickOnTheCompanySearchedCode());
    }

    @And("^User Click on Branch Search Button in Employee Details$")
    public void user_click_on_branch_search_button_in_emplouee_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSBranchSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSBranchSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSBranchSearchButtonInEmployeeDetails());
    }

    @And("^User Enter the Branch Code in Search Box$")
    public void user_enter_the_branch_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSBranchCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSBranchCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSBranchCodeInSearchBox());
        transactiononstaffaccObj.csmSADSBranchCodeInSearchBox().sendKeys("1");
    }

    @And("^User Double Click on the Branch Searched Code in Search Box$")
    public void user_double_click_on_the_branch_searched_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDoubleClickOnTheBranchSearchedCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDoubleClickOnTheBranchSearchedCode());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSDoubleClickOnTheBranchSearchedCode());
    }

    @And("^User Click on Division Search Button in Employee Details$")
    public void user_click_on_division_search_button_in_emplouee_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDivisionSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDivisionSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSDivisionSearchButtonInEmployeeDetails());
    }

    @And("^User Enter the Division Code in Search Box$")
    public void user_enter_the_division_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDivisionCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDivisionCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSDivisionCodeInSearchBox());
        transactiononstaffaccObj.csmSADSDivisionCodeInSearchBox().sendKeys("1");
    }

    @And("^User Double Click on the Division Searched Code in Search Box$")
    public void user_double_click_on_the_division_searched_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDoubleClickOnTheDivisionSearchedCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDoubleClickOnTheDivisionSearchedCode());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSDoubleClickOnTheDivisionSearchedCode());
    }

    @And("^User Click on Department Search Button in Employee Details$")
    public void user_click_on_department_search_button_in_emplouee_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDepartmentSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDepartmentSearchButtonInEmployeeDetails());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSDepartmentSearchButtonInEmployeeDetails());
    }

    @And("^User Enter the Department Code in Search Box$")
    public void user_enter_the_department_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDepartmentCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDepartmentCodeInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSDepartmentCodeInSearchBox());
        transactiononstaffaccObj.csmSADSDepartmentCodeInSearchBox().sendKeys("1");
    }

    @And("^User Double Click on the Department Searched Code in Search Box$")
    public void user_double_click_on_the_department_searched_code_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSDoubleClickOnTheDepartmentSearchedCode());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSDoubleClickOnTheDepartmentSearchedCode());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSDoubleClickOnTheDepartmentSearchedCode());
    }

    @And("^User Click on CIF Search Button in Employee Details under Maintenance Screen$")
    public void user_click_on_search_button_in_employee_details_under_maintenance_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchButtonInEmployeeDetails());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchButtonInEmployeeDetails());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSearchButtonInEmployeeDetails());
		        break;		        
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    @And("^User Enter the CIF No in SearchBox$")
    public void user_enter_the_cif_no_in_searchbox() throws Throwable {   	
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCIFNoInSearchBox());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCIFNoInSearchBox());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSCIFNoInSearchBox());
		        //transactiononstaffaccObj.csmSADSCIFNoInSearchBox().sendKeys(testData.get("CIF No"));
		        transactiononstaffaccObj.csmSADSCIFNoInSearchBox().sendKeys("993558");
	}
    
    @And("^User Click the Searched CIF NO in Search Box$")
    public void user_click_the_searched_cif_no_in_search_box() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				String xpath = "//td[text()='"+"993558"+"']";
				driver.findElement(By.xpath(xpath)).isDisplayed();	
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCSearchedCIFNOInSearchBox());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCSearchedCIFNOInSearchBox());
		        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSCSearchedCIFNOInSearchBox());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("UserNameNotVisible");
				}
			}	
    	}    	 	    	
    }
    
    @And("^User Check the Physical User CheckBox in Privilege under Maintenance Screen$")
    public void user_check_the_physical_user_checkbox_in_privilege_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSCheckThePhysicalUserCheckBoxInPrivilege());
        try {
			if (transactiononstaffaccObj.csmSADSCheckThePhysicalUserCheckBoxInPrivilege().getAttribute("checked").equalsIgnoreCase("checked")) {
				seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSCheckThePhysicalUserCheckBoxInPrivilege());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSCheckThePhysicalUserCheckBoxInPrivilege());
			}
		} catch (Exception e) {
			
		}             
    }

    @And("^User Click on Save Button in Maintenance Screen$")
    public void user_click_on_save_button_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSaveButtonInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSaveButtonInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSaveButtonInMaintenanceScreen());
    }

    @And("^User Click on Ok Button in Success PopUp in User$")
    public void user_click_on_ok_button_in_success_popup_in_user() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSOkButtonInSuccessPopUpInUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSOkButtonInSuccessPopUpInUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSOkButtonInSuccessPopUpInUser());
    }
    	
    
    //@TSA_158_02
    
    @Given("^User Navigate to SADS1 application and login with valid credentials$")
    public void user_navigate_to_sads1_application_and_login_with_valid_credentials() throws Throwable {
    	driver.get(configFileReader.getSADSApplicationUrl());
		login.loginIntoSadsApplication2();
    }
    
    @And("^User Click on Parameter in SADS Application$")
    public void user_click_on_parameter_in_sads_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSParameterInSADSApplication());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSParameterInSADSApplication());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSParameterInSADSApplication());
    }

    @And("^User Click on User in Parameters under SADS application$")
    public void user_click_on_user_in_parameters_under_sads_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSUserInParametersUnderSADSApplication());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSUserInParametersUnderSADSApplication());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSUserInParametersUnderSADSApplication());
    }

    @And("^User Click on Approve in User under Parameters$")
    public void user_click_on_approve_in_user_under_parameters() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSApproveInUserUnderParameters());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSApproveInUserUnderParameters());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSApproveInUserUnderParameters());
    }

    @And("^User Click on Search Button under Approve Screen$")
    public void user_click_on_search_button_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchButtonUnderApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchButtonUnderApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSSearchButtonUnderApproveScreen());
    }

    @And("^User Enter User ID in search under Approve Screen$")
    public void user_enter_user_id_in_search_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderApproveScreen());
        //transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderApproveScreen().sendKeys(testData.get("User ID"),Keys.ENTER);
        transactiononstaffaccObj.csmSADSEnterUserIDInSearchUnderApproveScreen().sendKeys("CHRISAG",Keys.ENTER);
    }

    @And("^User Click on Searched ID under Approve Screen$")
    public void user_click_on_searched_id_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSSearchedIDunderApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSSearchedIDunderApproveScreen());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmSADSSearchedIDunderApproveScreen());
    }

    @And("^User Click on Approve button in Approve Screen under Parameter$")
    public void user_click_on_approve_button_in_approve_screen_under_parameter() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADS_ClickApproveButtonInApproveScreen());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADS_ClickApproveButtonInApproveScreen());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADS_ClickApproveButtonInApproveScreen()); 	        
    	        break;
			} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
			}
			
		}
    	
    }
    
    @And("^User Click Ok button in Success Popup in User Approve$")
    public void user_click_ok_button_in_success_popup_in_user_approve() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSADSOkButtonInSuccessPopupInUserApprove());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSADSOkButtonInSuccessPopupInUserApprove());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSADSOkButtonInSuccessPopupInUserApprove()); 
    }

    
    //@TSA_158_03
    
    @Given("^User Navigate to CSM application and login with valid credentials$")
    public void user_navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
    	driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
    }
    
    @And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmDateToChangeTheCurrentDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmDateToChangeTheCurrentDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmDateInUserRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmDateInUserRunningDate());
        transactiononstaffaccObj.csmDateInUserRunningDate().clear();
        //transactiononstaffaccObj.csmDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        transactiononstaffaccObj.csmDateInUserRunningDate().sendKeys("01/06/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popup$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmUseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popup$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCloseButtonInChangeRunningDate());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icon$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csm_ClearCacheInTechnicalDetailsIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csm_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonUnderInformationPopUp());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application$")
    public void user_click_on_transactions_under_csm_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmTransactionsMainMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmTransactionsMainMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmTransactionsMainMenu());
    }

    @And("^User Click on Maintenance under Transactions$")
    public void user_click_on_maintenance_under_transactions() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmMaintenanceUnderTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmMaintenanceUnderTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmMaintenanceUnderTransactions());
    }

    @And("^User Enter TRX Type in Maintenance Screen$")
    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen().sendKeys("377",Keys.TAB);
        
    }
    
    @And("^User Enter the Branch Code in Credit Ac in Maintenance Screen$")
    public void user_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmBranchCodeInCreditAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmBranchCodeInCreditAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmBranchCodeInCreditAc());
        //transactiononstaffaccObj.csmBranchCodeInCreditAc().sendKeys(testData.get("Branch Code"),Keys.TAB);
        transactiononstaffaccObj.csmBranchCodeInCreditAc().sendKeys("1",Keys.TAB);
    }


    @And("^User Enter Currency Code in Credit Ac in Maintenance Screen$")
    public void user_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCurrencyCodeCreditAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCurrencyCodeCreditAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCurrencyCodeCreditAc());
        //transactiononstaffaccObj.csmCurrencyCodeCreditAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
        transactiononstaffaccObj.csmCurrencyCodeCreditAc().sendKeys("840",Keys.TAB);
    }
    
    @And("^User Enter GL Code in Credit Ac in Maintenance Screen$")
    public void user_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmGLCodeCreditAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmGLCodeCreditAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmGLCodeCreditAc());
        //transactiononstaffaccObj.csmGLCodeCreditAc().sendKeys(testData.get("GL Code"),Keys.TAB);
        transactiononstaffaccObj.csmGLCodeCreditAc().sendKeys("95916",Keys.TAB);
    }
    
    @And("^User Enter CIF Code in Credit Ac in Maintenance Screen$")
    public void user_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCIFCodeInCreditAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCIFCodeInCreditAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCIFCodeInCreditAc());
        //transactiononstaffaccObj.csmCIFCodeInCreditAc().sendKeys(testData.get("CIF No"),Keys.TAB);
        transactiononstaffaccObj.csmCIFCodeInCreditAc().sendKeys("993558",Keys.TAB);
    }

    @And("^User Enter Serial in Credit Ac in Maintenance Screen$")
    public void user_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSerialInCreditAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSerialInCreditAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSerialInCreditAc());
        //transactiononstaffaccObj.csmSerialInCreditAc().sendKeys(testData.get("Serial"),Keys.TAB);
        transactiononstaffaccObj.csmSerialInCreditAc().sendKeys("0",Keys.TAB);
    }

    @And("^User Click Ok Button in Warning PopUp Menu$")
    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInWarningPopUpMenu());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInWarningPopUpMenu());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInWarningPopUpMenu());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    }

    @And("^User Enter the Currency in Maintenance Screen$")
    public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
    	
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCurrencyInMaintenanceScreen());
    			seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCurrencyInMaintenanceScreen());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCurrencyInMaintenanceScreen());
    	        //transactiononstaffaccObj.csmCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
    	        transactiononstaffaccObj.csmCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}			
		}   
    }
    	
    
//    @And("^User Click Transactions Maintenance for loading Currency code$")
//    public void user_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//    }

    @And("^User Enter the Amount in Maintenance Screen$")
    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
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
 	
    	for (int i = 0; i < 200; i++) {
   		try {
   			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCurrencyName());
    		transactiononstaffaccObj.csmCurrencyName().isDisplayed();
    			break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}			
		}
    
    }
    
    
 
//    @And("^User Click Transactions Maintenance for loading Amount$")
//    public void user_click_transactions_maintenance_for_loading_amount() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csm_TransactionsMaintenanceForLoading());
//    }

    @And("^User Click Save Button in Maintenance Screen$")
    public void user_click_save_button_in_maintenance_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {			
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSaveButtonInMaintenanceScreen());
		    	seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSaveButtonInMaintenanceScreen());
		    	seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSaveButtonInMaintenanceScreen());
		    	break;										
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}    		    	        
    }
       
    @And("^User Get the Transaction No in Success PopUo Menu$")
    public void user_get_the_transaction_no_in_success_popuo_menu() throws Throwable {
    	String text = "";
        for (int i = 0; i <200; i++) {
			try {
				text = transactiononstaffaccObj.csmGetTheTransactionNo().getText();
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
    
    @And("^User Click Ok Button in Success PopUp Menu$")
    public void user_click_ok_button_in_success_popup_menu() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenu());
    	        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenu());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenu());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}			
		}
    }
    
    @And("^User Click on Approve Screen under Transactions$")
    public void user_click_on_approve_screen_under_transactions() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmApproveScreenUnderTransactions());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmApproveScreenUnderTransactions());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmApproveScreenUnderTransactions());
    }

    @And("^User Enter the Transaction No in Approve Screen$")
    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmTransactionNoInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmTransactionNoInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmTransactionNoInApproveScreen());
        transactiononstaffaccObj.csmTransactionNoInApproveScreen().sendKeys("7609", Keys.ENTER);
    }

    @And("^User Double Click on the Transaction No$")
    public void user_double_click_on_the_transaction_no() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmDoubleClickOnTheTransactionNo());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmDoubleClickOnTheTransactionNo());
        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmDoubleClickOnTheTransactionNo());
    }
    
    @And("^User Click on Approve Button for approve the Transaction$")
    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmApproveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmApproveButtonInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmApproveButtonInApproveScreen());
    }
    
    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation$")
    public void user_click_on_ok_button_in_success_popup_menu_for_approve_transcation() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenuForTranscation());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenuForTranscation());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInSuccessPopUpMenuForTranscation());
    }

    @And("^User Click on Queries under CSM application$")
    public void user_click_on_queries_under_csm_application() throws Throwable {
    	seleniumActions.getJavascriptHelper().scrollIntoView(transactiononstaffaccObj.csmQueriesMainMenu());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmQueriesMainMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmQueriesMainMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmQueriesMainMenu());
    }

    @And("^User Click on Statement Of Accounts in Queries under CSM application$")
    public void user_click_on_statement_of_accounts_in_queries_under_csm_application() throws Throwable {
    	//seleniumActions.getJavascriptHelper().IntoView(transactiononstaffaccObj.csmStatementOfAccountsInQueries());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmStatementOfAccountsInQueries());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmStatementOfAccountsInQueries());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmStatementOfAccountsInQueries());
    }

    @And("^User Click on By Trade Date under Statement Of Accounts Sub Menu$")
    public void user_click_on_by_trade_date_under_statement_of_accounts_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmByTradeDateUnderStatementOfAccountsSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmByTradeDateUnderStatementOfAccountsSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmByTradeDateUnderStatementOfAccountsSubMenu());
    }

    @And("^User Enter the Currency Value in Account under By Trade Date Screen$")
    public void user_enter_the_currency_value_in_account_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCurrencyValueIinAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCurrencyValueIinAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCurrencyValueIinAccountUnderByTradeDateScreen());
        //transactiononstaffaccObj.csmCurrencyValueIinAccountUnderByTradeDateScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
        transactiononstaffaccObj.csmCurrencyValueIinAccountUnderByTradeDateScreen().sendKeys("840",Keys.TAB);
    }

    @And("^User Enter the GL Code in Account under By Trade Date Screen$")
    public void user_enter_the_gl_code_in_account_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmGLCodeInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmGLCodeInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmGLCodeInAccountUnderByTradeDateScreen());
        //transactiononstaffaccObj.csmGLCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("GL Code"),Keys.TAB);
        transactiononstaffaccObj.csmGLCodeInAccountUnderByTradeDateScreen().sendKeys("96136",Keys.TAB);
    }

    @And("^User Enter the CIF Code in Account under By Trade Date Screen$")
    public void user_enter_the_cif_code_in_account_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCIFCodeInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCIFCodeInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCIFCodeInAccountUnderByTradeDateScreen());
        //transactiononstaffaccObj.csmCIFCodeInAccountUnderByTradeDateScreen().sendKeys(testData.get("CIF No"),Keys.TAB);
        transactiononstaffaccObj.csmCIFCodeInAccountUnderByTradeDateScreen().sendKeys("993561",Keys.TAB);
    }

    @And("^User Enter the Serial in Account under By Trade Date Screen$")
    public void user_enter_the_serial_in_account_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSerialInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSerialInAccountUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSerialInAccountUnderByTradeDateScreen());
        //transactiononstaffaccObj.csmSerialInAccountUnderByTradeDateScreen().sendKeys(testData.get("Serial"),Keys.TAB);
        transactiononstaffaccObj.csmSerialInAccountUnderByTradeDateScreen().sendKeys("0",Keys.TAB);
    }

    @And("^User Enter From Date in Periodicity Of Statement under By Trade Date Screen$")
    public void user_enter_from_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement());
        transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement().clear();
        //transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement().sendKeys(testData.get("From Date"));
        transactiononstaffaccObj.csmFromDateInPeriodicityOfStatement().sendKeys("25/05/2023");
    }

    @And("^User Enter To Date in Periodicity Of Statement under By Trade Date Screen$")
    public void user_enter_to_date_in_periodicity_of_statement_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmToDateInPeriodicityOfStatement());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmToDateInPeriodicityOfStatement());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmToDateInPeriodicityOfStatement());
        transactiononstaffaccObj.csmToDateInPeriodicityOfStatement().clear();
        //transactiononstaffaccObj.csmToDateInPeriodicityOfStatement().sendKeys(testData.get("To Date"));
        transactiononstaffaccObj.csmToDateInPeriodicityOfStatement().sendKeys("29/05/2023");
    }

    @And("^User Click Retrieve Button under By Trade Date Screen$")
    public void user_click_retrieve_button_under_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmRetrieveButtonUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmRetrieveButtonUnderByTradeDateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmRetrieveButtonUnderByTradeDateScreen());
    }

    @And("^User Click on Ok Button in Access Denied PopUp Menu$")
    public void user_click_on_ok_button_in_access_denied_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInAccessDeniedPopUpMenu());
    }
    
    @Then("^User Validate If the Statement of Account Displayed as Access Denied$")
    public void user_validate_if_the_statement_of_account_displayed_as_access_denied() throws Throwable {
    	for (int i = 0; i <200; i++) {
    		try {
    			//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValidateIfTheStatementOfAccountDisplayedAsAccessDenied());
    	        Assert.assertTrue(transactiononstaffaccObj.csmValidateIfTheStatementOfAccountDisplayedAsAccessDenied().isDisplayed());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}	
		}	
    } 
    
    @Then("^User Validate If the Statement of Account is Displayed$")
    public void user_validate_if_the_statement_of_account_is_displayed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValidateIfTheStatementOfAccountIsDisplayed());
        Assert.assertTrue(transactiononstaffaccObj.csmValidateIfTheStatementOfAccountIsDisplayed().isDisplayed());
    }

    
    //************************************************************ @TRS_008 **************************************************
    
    @And("^User Click Close Button in View Memo Popup menu$")
    public void user_click_close_button_in_view_memo_popup_menu() throws Throwable {
    	for (int i = 0; i < 50; i++) {
			try {
				if (transactiononstaffaccObj.csmCloseButtonInViewMemoPopupMenu().isEnabled()) {
					seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCloseButtonInViewMemoPopupMenu());
		    	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCloseButtonInViewMemoPopupMenu());
		    	    break;
				}
								
			} catch (Exception e) {
				
			}
		}
    		//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCloseButtonInViewMemoPopupMenu());
    		
    }		
    
    @Then("^User Validate User Does Not have Access On this TRX type 377 For the Economic Sector 4 Of This CIF$")
    public void user_validate_user_does_not_have_access_on_this_trx_type_377_for_the_economic_sector_4_of_this_cif() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValidateUserDoesNotHaveAcces());
        Assert.assertTrue(transactiononstaffaccObj.csmValidateUserDoesNotHaveAcces().isDisplayed());
    }

    @And("^User Click Ok Button in Cannot Proceed PopUp Menu$")
    public void user_click_ok_button_in_cannot_proceed_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInCannotProceedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInCannotProceedPopUpMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInCannotProceedPopUpMenu());
    }
    
    //************************************************* @TRS_009 ***********************************************
    
    @Then("^User Validate User does not have rights to trade with selected Currency 144$")
    public void user_validate_user_does_not_have_rights_to_trade_with_selected_currency_144() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency());
        Assert.assertTrue(transactiononstaffaccObj.csm_ValidateUserDoesNotHaveRightsToTradeWithSelectedCurrency().isDisplayed());
    }

    @And("^User Click Ok Button in CannotProceed Popup Menu$")
    public void user_click_ok_button_in_cannotproceed_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmClickOkButtonInCannotProceedPopupMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmClickOkButtonInCannotProceedPopupMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmClickOkButtonInCannotProceedPopupMenu());
    }
    
    @And("^User Enter the Amount under Maintenance Screen$")
    public void user_enter_the_amount_under_maintenance_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmAmountUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmAmountUnderMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmAmountUnderMaintenanceScreen());
        transactiononstaffaccObj.csmAmountUnderMaintenanceScreen().sendKeys("1000",Keys.TAB);
        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}			
		}
    }
    
  //************************************************* @TRS_0010 ***********************************************
    
    @And("^User Click Ok Button in Warning PopUp to go back to Maintenance$")
    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmOkButtonInWarningPopUpToGoBackToMaintenance());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmOkButtonInWarningPopUpToGoBackToMaintenance());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmOkButtonInWarningPopUpToGoBackToMaintenance());
    }

    @And("^User Click on Search Button in Maintenance Screen$")
    public void user_click_on_search_button_in_meintenance_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSearchButtonInMaintenanceScreen());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSearchButtonInMaintenanceScreen());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSearchButtonInMaintenanceScreen());
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}				
			}
		}
    	
    }

    @And("^User Enter the Transaction No in Search Box$")
    public void user_enter_the_transaction_no_in_search_box() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmEnterTheTransactionNoInSearchBox());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmEnterTheTransactionNoInSearchBox());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmEnterTheTransactionNoInSearchBox());
        transactiononstaffaccObj.csmEnterTheTransactionNoInSearchBox().sendKeys("7609",Keys.ENTER);
    }

    @And("^User Double Click on the Searched Transaction No in Search Box$")
    public void user_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmDoubleClickOnTheSearchedTransactionNo());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmDoubleClickOnTheSearchedTransactionNo());
		        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmDoubleClickOnTheSearchedTransactionNo());
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	
    }

    @And("^User Click on Booked Entries in Maintenance Screen$")
    public void user_click_on_booked_entries_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmBookedEntriesInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmBookedEntriesInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmBookedEntriesInMaintenanceScreen());
    }
    
    @Then("^User Validate the Credit Amount in By Trade Date Screen$")
    public void user_validate_the_credit_amount_in_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValidateTheCreditAmount());
    	 String amount1 = "1000";
    	 System.out.println(amount1);
    	 String amount = transactiononstaffaccObj.csmValidateTheCreditAmount().getText();
    	 String replace = amount.replace(",","");
    	 String[] CVAmount = replace.split("[.]"); 
    	 for (String string : CVAmount) {			 
    		 System.out.println(string);			
		}
    	 System.out.println(CVAmount[0]);
    	 Assert.assertEquals(CVAmount[0], amount1);
    }    
    
    @And("^User Enter the Op No in By Trade Date Screen$")
    public void user_enter_the_op_no_in_by_trade_date_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmEnterTheOpNoInByTradeDateScreen());
		        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmEnterTheOpNoInByTradeDateScreen());
		        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmEnterTheOpNoInByTradeDateScreen());
		        transactiononstaffaccObj.csmEnterTheOpNoInByTradeDateScreen().sendKeys("1110461", Keys.ENTER);
		        break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

//    @And("^User Double Click the Searched Op No in By Trade Date Screen$")
//    public void user_double_click_the_searched_op_no_in_by_trade_date_screen() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmDoubleClickTheSearchedOpNo());
//        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmDoubleClickTheSearchedOpNo());
//        seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmDoubleClickTheSearchedOpNo());
//    }
    
    
  //************************************************* @TRS_0010 ***********************************************
    
    @And("^User Enter Withdrawal TRX Type in Maintenance Screen$")
    public void user_enter_withdrawal_trx_type_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen());
        //transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        transactiononstaffaccObj.csmTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
    }
    
    @And("^User Enter Currency Code in Debit Ac in Maintenance Screen$")
    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCurrencyCodeDebitAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCurrencyCodeDebitAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCurrencyCodeDebitAc());
        //transactiononstaffaccObj.csmCurrencyCodeDebitAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
        transactiononstaffaccObj.csmCurrencyCodeDebitAc().sendKeys("840",Keys.TAB);
    }

    @And("^User Enter GL Code in Debit Ac in Maintenance Screen$")
    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmGLCodeDebitAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmGLCodeDebitAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmGLCodeDebitAc());
        //transactiononstaffaccObj.csmGLCodeDebitAc().sendKeys(testData.get("GL Code"),Keys.TAB);
        transactiononstaffaccObj.csmGLCodeDebitAc().sendKeys("96136",Keys.TAB);
    }

    @And("^User Enter CIF Code in Debit Ac in Maintenance Screen$")
    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmCIFCodeInDebitAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmCIFCodeInDebitAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmCIFCodeInDebitAc());
        //transactiononstaffaccObj.csmCIFCodeInDebitAc().sendKeys(testData.get("CIF No"),Keys.TAB);
        transactiononstaffaccObj.csmCIFCodeInDebitAc().sendKeys("993561",Keys.TAB);
    }

    @And("^User Enter Serial in Debit Ac in Maintenance Screen$")
    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmSerialInDebitAc());
        seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmSerialInDebitAc());
        seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmSerialInDebitAc());
        //transactiononstaffaccObj.csmSerialInDebitAc().sendKeys(testData.get("Serial"),Keys.TAB);
        transactiononstaffaccObj.csmSerialInDebitAc().sendKeys("0",Keys.TAB);
    }
    
    @And("^User Enter the Amount for Debit in Maintenance Screen$")
    public void user_enter_the_amount_for_debit_in_maintenance_screen() throws Throwable {
    		for (int i = 0; i < 200; i++) {  		
    			try { 			
        			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmAmountInMaintenanceScreen());
        		    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmAmountInMaintenanceScreen());
        		    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmAmountInMaintenanceScreen());
        		    //transactiononstaffaccObj.csmAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);   		   
        		    transactiononstaffaccObj.csmAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
            		    break;     		     	
    			} catch (Exception e) {
    				Assert.fail();
    			}			   		
		}   	
    }

    @Then("^User Validate the Debit Amount in By Trade Date Screen$")
    public void user_validate_the_debit_amount_in_by_trade_date_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_ValidateTheDebitAmount());
   	 String amount1 = "1000";
   	 System.out.println(amount1);
   	 String amount = transactiononstaffaccObj.csm_ValidateTheDebitAmount().getText();
   	 String replace = amount.replace(",","");
   	 String[] CVAmount = replace.split("[.]"); 
   	 for (String string : CVAmount) {			 
   		 System.out.println(string);			
		}
   	 System.out.println(CVAmount[0]);
   	 Assert.assertEquals(CVAmount[0], amount1);
   }   
    
    //*************************************************************** TRS_052_01 *******************************************
    
    @Given("^User Navigate to CSMParam application and login with valid credentials$")
    public void user_navigate_to_csmparam_application_and_login_with_valid_credentials() throws Throwable {
    	driver.get(configFileReader.getCSMparamsUrl());
		login.loginIntoCSMParamApplication();
    }

    @And("^User Click on Parameters under CSMParam Application$")
    public void user_click_on_parameters_under_csmparam_application() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamParametersUndercsmParamApplication());
    }

    @And("^User Click on System Parameters under Parameters Main Menu$")
    public void user_click_on_system_parameters_under_parameters_main_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamSystemParametersUnderParametersMainMenu());
    }

    @And("^User Click on Transaction Type under System Parameters Sub Menu$")
    public void user_click_on_transaction_type_under_system_parameters_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamTransactionTypeUnderSystemParameters());
    }

    @And("^User Click on Update After Approve in Transaction Type under System Parameters Sub Menu$")
    public void user_click_on_update_after_approve_in_transaction_type_under_system_parameters_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamUpdateAfterApproveInTransactionType());
    }

    @And("^User Enter the Trx Type in Code under Update After Approve Screen$")
    public void user_enter_the_trx_type_in_code_under_update_after_approve_screen() throws Throwable {
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

    @And("^User Check the Enable Multi Branch flag in Update After Approve Screen$")
    public void user_check_the_enable_multi_branch_flag_in_update_after_approve_screen() throws Throwable { 
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


    @And("^User Click on Update After Approve button in Update After Approve Screen$")
    public void user_click_on_update_after_approve_button_in_update_after_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamUpdateAfterApproveButton());
    }

    @And("^User Click Ok Button in Confirm PopUp Menu in Update After Approve Screen$")
    public void user_click_ok_button_in_confirm_popup_menu_in_update_after_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpMenuInUpdateAfterApprove());
    }

    @And("^User Click Ok Button in Success PopUp Menu in Update After Approve Screen$")
    public void user_click_ok_button_in_success_popup_menu_in_update_after_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInSuccessPopUpMenuInUpdateAfterApprove());
    }

    @And("^User Click on Approve under Transaction Type$")
    public void user_click_on_approve_under_transaction_type() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamApproveUnderTransactionType());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamApproveUnderTransactionType());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamApproveUnderTransactionType());
    }

    @And("^User Enter the Trx Type in Code under Approve Screen$")
    public void user_enter_the_trx_type_in_code_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen());
	    transactiononstaffaccObj.csmParam_TrxTypeInCodeUnderApproveScreen().sendKeys("377",Keys.ENTER);
    }

    @And("^User Double Click on the Searched Code in Approve Screen$")
    public void user_double_click_on_the_searched_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
	    seleniumActions.getClickAndActionsHelper().doubleClick(transactiononstaffaccObj.csmParamDoubleClickOnTheSearchedCodeInApproveScreen());
    }

    @And("^User Click on Approve Button in Approve Screen under System Parameters$")
    public void user_click_on_approve_button_in_approve_screen_under_system_parameters() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamApproveButtonInApproveScreen());
    }

    @And("^User Click on Ok Button in Confirm PopUp under Approve Screen$")
    public void user_click_on_ok_button_in_confirm_popup_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParamOkButtonInConfirmPopUpUnderApproveScreen());
    }

    @And("^User Click on Ok Button in Success PopUp under Approve Screen$")
    public void user_click_on_ok_button_in_success_popup_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csmParam_OkButtonInSuccessPopUpUnderApproveScreen());
    }
    
    @And("^User Uncheck the Enable Multi Branch flag in Update After Approve Screen$")
    public void user_uncheck_the_enable_multi_branch_flag_in_update_after_approve_screen() throws Throwable {
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
 
//    @And("^User Click Ok Button in information PopUp menu in Update After Approve Screen$")
//    public void user_click_ok_button_in_information_popup_menu_in_update_after_approve_screen() throws Throwable {
//    	status= false;
//    	//seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen());
//    	for (int i = 0; i < 50; i++) {
//			try {
//				if (transactiononstaffaccObj.csmParam_InformationPopUpForUpdateAfterApproveScreen().isDisplayed()) {
//					status= true;
//					transactiononstaffaccObj.csmParam_OkButtonInInformationPopUpMenuInUpdateAfterApproveScreen().click();
//					break;
//				}				
//			} catch (Exception e) {
//				
//			}
//		}
//    }
    
    @And("^User Enter the Value Date in Maintenance Screen$")
    public void user_enter_the_value_date_in_maintenance_screen() throws Throwable {
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
    
    @Then("^User Validate the Stopper Message in Cannot Proceed PopUp Menu$")
    public void user_validate_the_stopper_message_in_cannot_proceed_popup_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmStopperMessageInCannotProceedPopUpMenu());
        Assert.assertTrue(transactiononstaffaccObj.csmStopperMessageInCannotProceedPopUpMenu().isDisplayed());
    }

    @And("^User Click Ok Button in Cannot Proceed PopUp Menu in Maintenance$")
    public void user_click_ok_button_in_cannot_proceed_popup_menu_in_maintenance() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
	    seleniumActions.getClickAndActionsHelper().moveToElement(transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
	    seleniumActions.getClickAndActionsHelper().clickOnElement(transactiononstaffaccObj.csm_OkButtonInCannotProceedPopUpMenuInMaintenance());
    }
    
    @And("^User Enter the Amount under Maintenance Menu$")
    public void user_enter_the_amount_under_maintenance_menu() throws Throwable {
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
    
    @And("^User Check the Allow Back dated Value Date flag in Update After Approve Screen$")
    public void user_check_the_allow_back_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
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

    @And("^User Check the Allow Post dated Value Date flag in Update After Approve Screen$")
    public void user_check_the_allow_post_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
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
    
    @And("^User UnCheck the Allow Back dated Value Date flag in Update After Approve Screen$")
    public void user_uncheck_the_allow_back_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
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

    @And("^User UnCheck the Allow Post dated Value Date flag in Update After Approve Screen$")
    public void user_uncheck_the_allow_post_dated_value_date_flag_in_update_after_approve_screen() throws Throwable {
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

    @Then("^User Validate if the Value Date field is Disable$")
    public void user_validate_if_the_value_date_field_is_disable() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,transactiononstaffaccObj.csmValueDateInMaintenanceScreen());
        Assert.assertTrue(transactiononstaffaccObj.csmValueDateInMaintenanceScreen().getAttribute("readonly").equalsIgnoreCase("readonly"));
    }
}


    
    

