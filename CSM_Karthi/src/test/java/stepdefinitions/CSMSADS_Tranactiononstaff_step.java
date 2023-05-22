package stepdefinitions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csmParam.CSMSADS_transactiononstaffaccObj;
import resources.BaseClass;

public class CSMSADS_Tranactiononstaff_step {
	
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSMSADS_transactiononstaffaccObj CSMSADstranacc = new CSMSADS_transactiononstaffaccObj(driver);
	CSMLogin login  = new CSMLogin(driver);
	
	@Given("^Navigate to SADS application and login with valid credentials$")
    public void navigate_to_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configfilereader.getSADSApplicationUrl());
    	login.loginIntoSadsApplication();   
    }

    @And("^User Click on Parameters under SADS application$")
    public void user_click_on_parameters_under_sads_application() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSParametersMainMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSParametersMainMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSParametersMainMenu());    
		// CSMSADstranacc.CSMSADSParametersMainMenu().click();
       }

    @And("^User Click on Account Restrictions in Parameters under SADS application$")
    public void user_click_on_account_restrictions_in_parameters_under_sads_application() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSAccountRestrictionsInParameters());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSAccountRestrictionsInParameters());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSAccountRestrictionsInParameters());    
		// CSMSADstranacc.CSMSADSAccountRestrictionsInParameters().click();
		
		 
      }

    @And("^User Click on Maintenance in Account Restrictions under Parameters$")
    public void user_click_on_maintenance_in_account_restrictions_under_parameters() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSMaintenanceInAccountRestrictions());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSMaintenanceInAccountRestrictions());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSMaintenanceInAccountRestrictions());    
		 //CSMSADstranacc.CSMSADSMaintenanceInAccountRestrictions().click();
		 
		 }

    @And("^User Enter the value in Code under Maintenance Screen$")
    public void user_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSEnterTheValueInCodeUnderMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSEnterTheValueInCodeUnderMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSEnterTheValueInCodeUnderMaintenance());    
		 CSMSADstranacc.CSMSADSEnterTheValueInCodeUnderMaintenance().click();
		 CSMSADstranacc.CSMSADSEnterTheValueInCodeUnderMaintenance().sendKeys("5889");
    }

    @And("^User Enter the value in Description  under Maintenance Screen$")
    public void user_enter_the_value_in_description_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSEnterTheValueInDescriptionUnderMaintenance());    
		 //CSMSADstranacc.CSMSADSEnterTheValueInDescriptionUnderMaintenance().click();
		 CSMSADstranacc.CSMSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys("restrict",Keys.ENTER);
		       
    }

    @And("^User Click the RootIcon in ApplicationsOROPTs under maintenance secreen$")
    public void user_click_the_rooticon_in_applicationsoropts_under_maintenance_secreen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRootIconInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRootIconInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRootIconInApplicationsOROPTs());    
		 //CSMSADstranacc.CSMSADSRootIconInApplicationsOROPTs().click();
		     
    }

    @And("^User Click on RADM application in ApplicationsOROPTs$")
    public void user_click_on_radm_application_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRADMApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRADMApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRADMApplicationInApplicationsOROPTs());    
		 //CSMSADstranacc.CSMSADSRADMApplicationInApplicationsOROPTs().click();
      }

    @And("^User Click on RADM application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_radm_application_checkbox_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());    
		 //CSMSADstranacc.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs().click();
    }

    @And("^User Click on RET application in ApplicationsOROPTs$")
    public void user_click_on_ret_application_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRETApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRETApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRETApplicationInApplicationsOROPTs());    
		 //CSMSADstranacc.CSMSADSRETApplicationInApplicationsOROPTs().click();  
    }

    @And("^User Click on RET application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_ret_application_checkbox_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());    
		 //CSMSADstranacc.CSMSADSRETApplicationCheckboxInApplicationsOROPTs().click();
     }

    @And("^User Click on RootIcon in Companies OR Branches in maintenance secreen$")
    public void user_click_on_rooticon_in_companies_or_branches_in_maintenance_secreen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSRootIconInCompaniesORBranchesInMaintenance());    
		// CSMSADstranacc.CSMSADSRootIconInCompaniesORBranchesInMaintenance().click();
       }

    @And("^User Click on 1BAJ application in Companies OR Branches$")
    public void user_click_on_1baj_application_in_companies_or_branches() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS1BAJapplicationInCompaniesORBranches());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS1BAJapplicationInCompaniesORBranches());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS1BAJapplicationInCompaniesORBranches());    
		// CSMSADstranacc.CSMSADS1BAJapplicationInCompaniesORBranches().click();   
    }

    @And("^User Click on  1BAJ application Checkbox in Companies OR Branches$")
    public void user_click_on_1baj_application_checkbox_in_companies_or_branches() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());    
		 //CSMSADstranacc.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches().click();   
   }
        
    @And("^User Enter the User ID in UserID tab$")
    public void user_enter_the_user_id_in_userid_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSEnterTheUserIDInUserIDTab());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSEnterTheUserIDInUserIDTab());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSEnterTheUserIDInUserIDTab());    
		 CSMSADstranacc.CSMSADSEnterTheUserIDInUserIDTab().click(); 
		 CSMSADstranacc.CSMSADSEnterTheUserIDInUserIDTab().sendKeys("karthik",Keys.ENTER);
    }

    @And("^User Click on User ID Checkbox under UserID tab$")
    public void user_click_on_user_id_checkbox_under_userid_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSUserIDCheckbox());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSUserIDCheckbox());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSUserIDCheckbox());    
		// CSMSADstranacc.CSMSADSUserIDCheckbox().click(); 
     }
    @And("^User Click on Add button in Restriction Type under Maintenance Screen$")
    public void user_click_on_add_button_in_restriction_type_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSAddButtonInRestrictionType());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSAddButtonInRestrictionType());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSAddButtonInRestrictionType());    
		// CSMSADstranacc.CSMSADSAddButtonInRestrictionType().click(); 
     }

    @And("^User Click on Select Icon under Restriction Type$")
    public void user_click_on_select_icon_under_restriction_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif());
    	selenium_Action.getDropDownHelper().SelectUsingVisibleText(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif(),"CIF");
    	
    }
    @And("^user select all account info under Restriction Level$")
    public void user_select_all_account_info_under_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSaccountrestrictionsflagmaintencerestleve());
    	selenium_Action.getDropDownHelper().SelectUsingVisibleText(CSMSADstranacc.CSMSADSaccountrestrictionsflagmaintencerestleve(),"All Account Info");
    	
    }
    
    @And("^User Click on Add Button under Restriction Level$")
    public void user_click_on_add_button_under_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());    
		 //CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn().click();
    }

    @And("^User Click on Search Icon in  CIF NO Under the Restriction Level$")
    public void user_click_on_search_icon_in_cif_no_under_the_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_search());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_search());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_search());    
		 //CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_cifno_search().click();
       
    }

    @And("^User Enter the CIF No in the Search box$")
    public void user_enter_the_cif_no_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_search_cifno());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_search_cifno());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_search_cifno());    
		 CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_search_cifno().click();
		 CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_search_cifno().sendKeys("1167",Keys.ENTER);
    }
		
    @And("^User double the data in the Search box$")
    public void user_double_the_data_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_doubleclk());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_doubleclk());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_doubleclk());  
		 clicksAdActionsHelper.doubleClick(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_doubleclk());
		// CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_doubleclk().click();
    }
    @And("^User Enter the GL No in the Search box$")
    public void user_enter_the_gl_no_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_GLCodeEntering());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_GLCodeEntering());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_GLCodeEntering());    
		 CSMSADstranacc.CSMSADS_GLCodeEntering().click();
		 CSMSADstranacc.CSMSADS_GLCodeEntering().sendKeys("4003",Keys.ENTER);
    }
    @And("^User double the data on Gl  in the Search box$")
    public void user_double_the_data_on_gl_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_GLCodeoninputbox_doubleclicktherecord());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_GLCodeoninputbox_doubleclicktherecord());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_GLCodeoninputbox_doubleclicktherecord());  
		 clicksAdActionsHelper.doubleClick(CSMSADstranacc.CSMSADS_GLCodeoninputbox_doubleclicktherecord());
    }
       @And("^User Click on Save Button under Maintenance Screen$")
    public void user_click_on_save_button_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_save());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_save());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_save());
		 CSMSADstranacc.CSMSADS_accountrestrictionsflag_maintence_save().click();
       
    }

    @And("^User Click on Ok Button in Success PopUp Menu$")
    public void user_click_on_ok_button_in_success_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADSOkButtonInSuccessPopUpMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADSOkButtonInSuccessPopUpMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADSOkButtonInSuccessPopUpMenu());
		 CSMSADstranacc.CSMSADSOkButtonInSuccessPopUpMenu().click();      
    }

    @And("^User Click on Approve under Account Restrictions$")
    public void user_click_on_approve_under_account_restrictions() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve());
		 CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve().click();
    }

    @And("^User Enter the Code in Approve Screen$")
    public void user_enter_the_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve_code());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve_code());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve_code());
		// CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approve_code().click();
   
   }

    @And("^User Click the Selected code in Approve Screen$")
    public void user_click_the_selected_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 //CSMSADstranacc.CSMSADS_ClickTheSelectedCodeInApproveScreen().click();
        
    }

    @Then("^User Click on Approve button in Approve Screen$")
    public void user_click_on_approve_button_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approvebtn());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approvebtn());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approvebtn());
		 //CSMSADstranacc.CSMSADS_accountrestrictionsflag_Approvebtn().click();
       
    }
    @And("^User Click on Queries under CSM application$")
    public void user_click_on_queries_under_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSM_QueriesMainMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSM_QueriesMainMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSM_QueriesMainMenu());
    }

    @And("^User Click on Statement Of Accounts in Queries under CSM application$")
    public void user_click_on_statement_of_accounts_in_queries_under_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSM_StatementOfAccountsInQueries());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSM_StatementOfAccountsInQueries());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSM_StatementOfAccountsInQueries());
    }

    @And("^User Click on By Trade Date under Statement Of Accounts Sub Menu$")
    public void user_click_on_by_trade_date_under_statement_of_accounts_sub_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMByTradeDateUnderStatementOfAccountsSubMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMByTradeDateUnderStatementOfAccountsSubMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMByTradeDateUnderStatementOfAccountsSubMenu());
    }

    @And("^User Enter the Currency Value in Account under By Trade Date Screen$")
    public void user_enter_the_currency_value_in_account_under_by_trade_date_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMCurrencyValueIinAccountUnderByTradeDateScreen());
    }

    @And("^User Enter the GL Code in Account under By Trade Date Screen$")
    public void user_enter_the_gl_code_in_account_under_by_trade_date_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMGLCodeInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMGLCodeInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMGLCodeInAccountUnderByTradeDateScreen());
    }

    @And("^User Enter the CIF Code in Account under By Trade Date Screen$")
    public void user_enter_the_cif_code_in_account_under_by_trade_date_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMCIFCodeInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMCIFCodeInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMCIFCodeInAccountUnderByTradeDateScreen());
    }

    @And("^User Enter the Serial in Account under By Trade Date Screen$")
    public void user_enter_the_serial_in_account_under_by_trade_date_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMSerialInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMSerialInAccountUnderByTradeDateScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMSerialInAccountUnderByTradeDateScreen());
    }

    @And("^User Click Retrieve Button under By Trade Date Screen$")
    public void user_click_retrieve_button_under_by_trade_date_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMRetrieveButtonUnderByTradeDateScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMRetrieveButtonUnderByTradeDateScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMRetrieveButtonUnderByTradeDateScreen());
    }

//    @And("^User Click on Ok Button in Access Denied PopUp Menu$")
//    public void user_click_on_ok_button_in_access_denied_popup_menu() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver,CSMSADstranacc.CSMOkButtonInAccessDeniedPopUpMenu());
//		 clicksAdActionsHelper.moveToElement(CSMSADstranacc.CSMOkButtonInAccessDeniedPopUpMenu());
//		 clicksAdActionsHelper.clickOnElement(CSMSADstranacc.CSMOkButtonInAccessDeniedPopUpMenu());
//    }


}