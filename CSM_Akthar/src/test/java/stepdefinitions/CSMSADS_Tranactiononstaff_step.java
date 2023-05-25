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
import pageobjects.csm.CSMSADS_TransactionstaffAccObj;
import resources.BaseClass;

public class CSMSADS_Tranactiononstaff_step {
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSMSADS_TransactionstaffAccObj CSMSADS_Tranactiononstaff_step = new CSMSADS_TransactionstaffAccObj(driver);
	CSMLogin login  = new CSMLogin(driver);
	
	@Given("^Navigate to SADS application and login with valid credentials$")
    public void navigate_to_sads_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configfilereader.getSADSApplicationUrl());
    	login.loginIntoSadsApplication();   
    }
	//TSA_152//

    @And("^User Click on Parameters under SADS application$")
    public void user_click_on_parameters_under_sads_application() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSParametersMainMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSParametersMainMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSParametersMainMenu());    
		
       }

    @And("^User Click on Account Restrictions in Parameters under SADS application$")
    public void user_click_on_account_restrictions_in_parameters_under_sads_application() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSAccountRestrictionsInParameters());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSAccountRestrictionsInParameters());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSAccountRestrictionsInParameters());    
		 
		
		 
      }

    @And("^User Click on Maintenance in Account Restrictions under Parameters$")
    public void user_click_on_maintenance_in_account_restrictions_under_parameters() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSMaintenanceInAccountRestrictions());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSMaintenanceInAccountRestrictions());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSMaintenanceInAccountRestrictions());    
		 
		 }
    
         @And("^user click the warning ok button$")
         public void user_click_the_warning_ok_button() throws Throwable {
        	 
         
         try {
         waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_MaintenanceInAccountRestrictions_warning());
         clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_MaintenanceInAccountRestrictions_warning());
         clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_MaintenanceInAccountRestrictions_warning());
              }
         catch (Exception e) {
			
		}
         }
    @And("^User Enter the value in Code under Maintenance Screen$")
    public void user_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInCodeUnderMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInCodeUnderMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInCodeUnderMaintenance());    
		 //CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInCodeUnderMaintenance().click();
		 CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInCodeUnderMaintenance().sendKeys("9088");
    }

    @And("^User Enter the value in Description  under Maintenance Screen$")
    public void user_enter_the_value_in_description_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance());    
		// CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance().click();
		 CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance().sendKeys("restrict",Keys.ENTER);	 
		       
    }
//    @And("^User Click the CheckBox in Grant Access to Personal Accounts under Maintenance Screen$")
//    public void user_click_the_checkbox_in_grant_access_to_personal_accounts_under_maintenance_screen() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheValueInDescriptionUnderMaintenance());  	
//    }
      


    @And("^User Click the RootIcon in ApplicationsOROPTs under maintenance secreen$")
    public void user_click_the_rooticon_in_applicationsoropts_under_maintenance_secreen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInApplicationsOROPTs());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInApplicationsOROPTs().click();
		     
    }

    @And("^User Click on RADM application in ApplicationsOROPTs$")
    public void user_click_on_radm_application_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationInApplicationsOROPTs());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationInApplicationsOROPTs().click();
      }

    @And("^User Click on RADM application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_radm_application_checkbox_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRADMApplicationCheckboxInApplicationsOROPTs().click();
    }

    @And("^User Click on RET application in ApplicationsOROPTs$")
    public void user_click_on_ret_application_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationInApplicationsOROPTs());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationInApplicationsOROPTs().click();  
    }

    @And("^User Click on RET application Checkbox in ApplicationsOROPTs$")
    public void user_click_on_ret_application_checkbox_in_applicationsoropts() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationCheckboxInApplicationsOROPTs());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRETApplicationCheckboxInApplicationsOROPTs().click();
     }

    @And("^User Click on RootIcon in Companies OR Branches in maintenance secreen$")
    public void user_click_on_rooticon_in_companies_or_branches_in_maintenance_secreen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInCompaniesORBranchesInMaintenance());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInCompaniesORBranchesInMaintenance());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSRootIconInCompaniesORBranchesInMaintenance().click();
       }

    @And("^User Click on 1BAJ application in Companies OR Branches$")
    public void user_click_on_1baj_application_in_companies_or_branches() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS1BAJapplicationInCompaniesORBranches());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS1BAJapplicationInCompaniesORBranches());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS1BAJapplicationInCompaniesORBranches());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS1BAJapplicationInCompaniesORBranches().click();   
    }

    @And("^User Click on  1BAJ application Checkbox in Companies OR Branches$")
    public void user_click_on_1baj_application_checkbox_in_companies_or_branches() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS1BAJApplicationCheckboxInCompaniesORBranches().click();   
   }
        
    @And("^User Enter the User ID in UserID tab$")
    public void user_enter_the_user_id_in_userid_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheUserIDInUserIDTab());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheUserIDInUserIDTab());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheUserIDInUserIDTab());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheUserIDInUserIDTab().click(); 
		 CSMSADS_Tranactiononstaff_step.CSMSADSEnterTheUserIDInUserIDTab().sendKeys("AKTHARJO",Keys.ENTER);
    }

    @And("^User Click on User ID Checkbox under UserID tab$")
    public void user_click_on_user_id_checkbox_under_userid_tab() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSUserIDCheckbox());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSUserIDCheckbox());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSUserIDCheckbox());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSUserIDCheckbox().click(); 
     }
    @And("^User Click on Add button in Restriction Type under Maintenance Screen$")
    public void user_click_on_add_button_in_restriction_type_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSAddButtonInRestrictionType());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSAddButtonInRestrictionType());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSAddButtonInRestrictionType());    
		 CSMSADS_Tranactiononstaff_step.CSMSADSAddButtonInRestrictionType().click(); 
     }

    @And("^User Click on Select Icon under Restriction Type$")
    public void user_click_on_select_icon_under_restriction_type() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif());
    	selenium_Action.getDropDownHelper().SelectUsingVisibleText(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_restrictiontype_cif(),"CIF");
    	
    }
    @And("^user select all account info under Restriction Level$")
    public void user_select_all_account_info_under_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSaccountrestrictionsflagmaintencerestleve());
    	selenium_Action.getDropDownHelper().SelectUsingVisibleText(CSMSADS_Tranactiononstaff_step.CSMSADSaccountrestrictionsflagmaintencerestleve(),"All Account Info");
    	
    }
    
    @And("^User Click on Add button under Restriction Level$")
    public void user_click_on_add_button_under_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_addnewbtn().click();
    }

    @And("^User Click on Search Icon in  CIF NO Under the Restriction Level$")
    public void user_click_on_search_icon_in_cif_no_under_the_restriction_level() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_search());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_search());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_search());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_cifno_search().click();
       
    }

    @And("^User Enter the CIF No in the Search box$")
    public void user_enter_the_cif_no_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_search_cifno());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_search_cifno());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_search_cifno());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_search_cifno().click();
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_search_cifno().sendKeys("1167",Keys.ENTER);
    }
		
    @And("^User double the data in the Search box$")
    public void user_double_the_data_in_the_search_box() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_doubleclk());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_doubleclk());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_doubleclk());    
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_doubleclk().click();
    }
       @And("^User Click on Save button under Maintenance Screen$")
    public void user_click_on_save_button_under_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_save());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_save());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_save());
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_maintence_save().click();
       
    }

    @And("^User Click on Ok button in Success PopUp Menu$")
    public void user_click_on_ok_button_in_success_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADSOkButtonInSuccessPopUpMenu());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADSOkButtonInSuccessPopUpMenu());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADSOkButtonInSuccessPopUpMenu());
		 CSMSADS_Tranactiononstaff_step.CSMSADSOkButtonInSuccessPopUpMenu().click();      
    }

    @And("^User Click on Approve under Account Restrictions$")
    public void user_click_on_approve_under_account_restrictions() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve());
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve().click();
    }

    @And("^User Enter the Code in Approve Screen$")
    public void user_enter_the_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve_code());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve_code());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve_code());
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approve_code().click();
   
   }

    @And("^User Click the Selected code in Approve Screen$")
    public void user_click_the_selected_code_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_ClickTheSelectedCodeInApproveScreen());
		 CSMSADS_Tranactiononstaff_step.CSMSADS_ClickTheSelectedCodeInApproveScreen().click();
        
    }

    @Then("^User Click on Approve button in Approve Screen$")
    public void user_click_on_approve_button_in_approve_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approvebtn());
		 clicksAdActionsHelper.moveToElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approvebtn());
		 clicksAdActionsHelper.clickOnElement(CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approvebtn());
		 CSMSADS_Tranactiononstaff_step.CSMSADS_accountrestrictionsflag_Approvebtn().click();       
    }
    


}
