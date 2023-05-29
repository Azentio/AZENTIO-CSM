package stepdefinitions;

import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_TransactionOnStaffAccount_Obj;
import pageobjects.CSM_Transactions_OBJ;
import resources.BaseClass;

public class CSM_TransactionOnStaffAccount_Steps extends BaseClass{
      WebDriver driver = BaseClass.driver;
      ConfigFileReader configFileRead = new ConfigFileReader();
      CSMLogin login = new CSMLogin(driver);
      Selenium_Actions seleniumActions = new Selenium_Actions(driver);
      CSM_TransactionOnStaffAccount_Obj csmTransactionOnStaffAccount = new CSM_TransactionOnStaffAccount_Obj(driver);
      String path = System.getProperty("user.dir") +"\\TestData\\Test_Data.xlsx";
  	  //ExcelData csmTransactionsExcelData = new ExcelData(path,"CSM_Transactions","DataSet ID");
  	  Map<String, String> testData;
  	  
  	@Given("^user login as csm params application$")
    public void user_login_as_csm_params_application() throws Throwable {
  		String paramsApplicationUrl = configFileRead.getCSMparamsUrl();
		driver.get(paramsApplicationUrl);
		login.loginIntoCSMParamApplication();
    }

    @Then("^user click confirm message ok button$")
    public void user_click_confirm_message_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.confirmOkButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.confirmOkButton());
    }

    @And("^user click parameters menu$")
    public void user_click_parameters_menu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.parametersMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.parametersMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.parametersMenu());
    }

    @And("^user click system parameters submenu$")
    public void user_click_system_parameters_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.systemParametersSubmenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.systemParametersSubmenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.systemParametersSubmenu());
    }

    @And("^user click user submenu$")
    public void user_click_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userSubMenu());
    }

    @And("^user click populate user submenu$")
    public void user_click_populate_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateUserSubMenu());
    }

    @And("^user click maintenance under populate user submenu$")
    public void user_click_maintenance_under_populate_user_submenu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.maintenanceInPopulateUserSubMenu());
    }

    @And("^user click and enter the value in code under maintenance screen$")
    public void user_click_and_enter_the_value_in_code_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.codeInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.codeInMaintenanceSubMenu().sendKeys("157");
    }

    @And("^user click and enter the value in brief description field under maintenance screen$")
    public void user_click_and_enter_the_value_in_brief_description_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.briefDescriptionInMaintenanceSubMenu().sendKeys("test157");
    }

    @And("^user click and enter the value in long description field under maintenance screen$")
    public void user_click_and_enter_the_value_in_long_description_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.longDescriptionInMaintenanceSubMenu().sendKeys("test");
    }

    @And("^user click and enter the value in brief description arabic field under maintenance screen$")
    public void user_click_and_enter_the_value_in_brief_description_arabic_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.briefDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.briefDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.briefDescriptionInArabic());
        csmTransactionOnStaffAccount.briefDescriptionInArabic().sendKeys("briefArabic");
    }

    @And("^user click and enter the value in long description arabic field under maintenance screen$")
    public void user_click_and_enter_the_value_in_long_description_arabic_field_under_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.longDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.longDescriptionInArabic());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.longDescriptionInArabic());
        csmTransactionOnStaffAccount.longDescriptionInArabic().sendKeys("longArabic");
    }

    @And("^user click and enter the value in user code field$")
    public void user_click_and_enter_the_value_in_user_code_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu());
        csmTransactionOnStaffAccount.userCodeInMaintenanceSubMenu().sendKeys("320561");
    }
    
    @And("^user click add icon in destination branches$")
    public void user_click_add_icon_in_destination_branches() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.addIconInMaintenanceSubMenu());
    }
    
    @And("^user randomly click in destination branches$")
    public void user_randomly_click_in_destination_branches() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.randomClickInDestinationBranches());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
    }
    
    @And("^user click and enter the value in branch field$")
    public void user_click_and_enter_the_value_in_branch_field() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
        csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.randomClickInDestinationBranches());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.randomClickInDestinationBranches());
    }

    
    @And("^user click search icon$")
    public void user_click_search_icon() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.searchIconForBranchField());
    	        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.searchIconForBranchField());
			} catch (Exception e) {
				if (i==199) {
		              Assert.fail(e.getMessage());
		           }	
			}
			
		}
//        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.searchIconForBranchField());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.searchIconForBranchField());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.searchIconForBranchField());
    }

    @And("^user click branch code under destination branches$")
    public void user_click_branch_code_under_destination_branches() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeIcon());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeIcon());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeIcon());
    }

    @And("^user enter the value in branch code and doubleclick the branch code$")
    public void user_enter_the_value_in_branch_code_and_doubleclick_the_branch_code() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeIcon());
    	csmTransactionOnStaffAccount.branchCodeIcon().sendKeys("2");
    	csmTransactionOnStaffAccount.branchCodeIcon().sendKeys(Keys.ENTER);
    	seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.doubleClkTheRecord());
    	seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.doubleClkTheRecord());
    }

    @And("^user click and enter the value in branch code field$")
    public void user_click_and_enter_the_value_in_branch_code_field() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    	try {
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeField());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeField());
          csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
          break;
    	} catch (Exception e) {
    	if (i==199) {
              Assert.fail(e.getMessage());
           }

        }
     }

   }
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.branchCodeField());
//        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.branchCodeField());
//        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.branchCodeField());
//        csmTransactionOnStaffAccount.branchCodeField().sendKeys("2");
    

    @And("^user click and enter the value in new user template field$")
    public void user_click_and_enter_the_value_in_new_user_template_field() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.newUserTemplateField());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.newUserTemplateField());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.newUserTemplateField());
        csmTransactionOnStaffAccount.newUserTemplateField().sendKeys("3");
    }

    @And("^user click save button under populate user$")
    public void user_click_save_button_under_populate_user() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.saveButtonInPopulateSubMenu());
    }
    
    @And("^user click success message ok button$")
    public void user_click_success_message_ok_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.successOkButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.successOkButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.successOkButton());
    }

    @And("^user click approve screen under populate user$")
    public void user_click_approve_screen_under_populate_user() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveScreenInPopulateUser());
    }

    @And("^user click and enter the value in cheque code under approve screen$")
    public void user_click_and_enter_the_value_in_cheque_code_under_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.chequeCodeInApproveScreen());
        csmTransactionOnStaffAccount.chequeCodeInApproveScreen().sendKeys("157");
        csmTransactionOnStaffAccount.chequeCodeInApproveScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.retrieveRecordInApproveScreen());
    }

    @And("^user click approve button$")
    public void user_click_approve_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.approveButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.approveButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.approveButton());
    }

    @And("^user click populate screen$")
    public void user_click_populate_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateScreenInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateScreenInPopulateUser());
    }

    @And("^user click and enter the value in cheque code under populate screen$")
    public void user_click_and_enter_the_value_in_cheque_code_under_populate_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.chequeCodeInPopulateScreen());
        csmTransactionOnStaffAccount.chequeCodeInPopulateScreen().sendKeys("157");
        csmTransactionOnStaffAccount.chequeCodeInPopulateScreen().sendKeys(Keys.ENTER);
        seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionOnStaffAccount.retrieveRecordInPopulateScreen());
    }

    @And("^user click populate button$")
    public void user_click_populate_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.populateButton());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.populateButton());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.populateButton());
    }
    
    @And("^user logout from the csm params application$")
    public void user_logout_from_the_csm_params_application() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.logoutButtonInCsmParamsApplication());
    }
    
    //TSA_017
    @And("^user click the check box suspend user in logged in branch under maintenance screen$")
    public void user_click_the_check_box_suspend_user_in_logged_in_branch_under_maintenance_screen() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
        seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
        seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionOnStaffAccount.suspendCheckBoxInPopulateUser());
    }
    
    
    //TRS_041
    
    @And("^user update test data set id for TRS_041$")
    public void user_update_test_data_set_id_for_trs041() throws Throwable {
        
    }
    
    @Then("^user click save button$")
    public void user_click_save_button() throws Throwable {
        
    }

    @And("^user click currency field and enter the value$")
    public void user_click_currency_field_and_enter_the_value() throws Throwable {
        
    }

    @And("^user click amount field and enter the value$")
    public void user_click_amount_field_and_enter_the_value() throws Throwable {
        
    }

    @And("^user click value date field and enter the value$")
    public void user_click_value_date_field_and_enter_the_value() throws Throwable {
        
    }
    @And("^user click approve screen$")
    public void user_click_approve_screen() throws Throwable {
        
    }

    @And("^user click search icon in approve screen$")
    public void user_click_search_icon_in_approve_screen() throws Throwable {
        
    }

    @And("^user click transaction number and enter the value$")
    public void user_click_transaction_number_and_enter_the_value() throws Throwable {
        
    }

    @And("^user retrieve the record under approve screen$")
    public void user_retrieve_the_record_under_approve_screen() throws Throwable {
        
    }
    @And("^user click search icon in maintenance screen$")
    public void user_click_search_icon_in_maintenance_screen() throws Throwable {
        
    }
    @Then("^user click the booked entries$")
    public void user_click_the_booked_entries() throws Throwable {
        
    }

    @And("^user retrieve the record in maintenance screen under transactions$")
    public void user_retrieve_the_record_in_maintenance_screen_under_transactions() throws Throwable {
        
    }
    
    //TRS_042
    
    @And("^user update test data set id for TRS_042$")
    public void user_update_test_data_set_id_for_trs042() throws Throwable {
        
    }
    
    @And("^user click and enter the value in debit account branch code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_branch_code_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account currency under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_currency_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account gl code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_gl_code_under_maintenance() throws Throwable {
        
    }

    @And("^user click and enter the value in debit account cif code under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_cif_code_under_maintenance() throws Throwable {
        
    }
    
    @And("^user click and enter the value in debit account serial number under maintenance$")
    public void user_click_and_enter_the_value_in_debit_account_serial_number_under_maintenance() throws Throwable {
        
    }
    
}
