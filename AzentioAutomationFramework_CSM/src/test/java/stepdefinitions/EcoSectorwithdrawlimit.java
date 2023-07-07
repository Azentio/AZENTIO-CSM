package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.util.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.EcoSectorTransaction;
import resources.BaseClass;

public class EcoSectorwithdrawlimit {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	EcoSectorTransaction EcoSectorTransactionobj = new EcoSectorTransaction (driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	
	@And("^user click parameters menu$")
    public void user_click_parameters_menu() throws Throwable {
    	
        waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.Parameters12());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.Parameters12());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.Parameters12());
    }

    @And("^user click system parameters submenu$")
    public void user_click_system_parameters_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.SystemParameters());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.SystemParameters());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.SystemParameters());
    }

   /* @And("^user click user submenu$")
    public void user_click_user_submenu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.userSubMenu());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.userSubMenu());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.userSubMenu());
    }*/
@And("^user click update after approve$")
    public void user_click_update_after_approve() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.updateAfterApproveInUser());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.updateAfterApproveInUser());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.updateAfterApproveInUser());
    }
@And("^user enter the value in user id$")
    public void user_enter_the_value_in_user_id() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.userIdInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.userIdInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.userIdInUpdateAfterApprove());
        EcoSectorTransactionobj.userIdInUpdateAfterApprove().sendKeys(testData.get("User Id"));
        EcoSectorTransactionobj.userIdInUpdateAfterApprove().sendKeys(Keys.ENTER);
    }

    @And("^user retrieve the selected user id$")
    public void user_retrieve_the_selected_user_id() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.doubleClickUserInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.doubleClickUserInUpdateAfterApprove());
        ClicksAndActionsHelperobj.doubleClick(EcoSectorTransactionobj.doubleClickUserInUpdateAfterApprove());
    }

    @And("^user click add icon$")
    public void user_click_add_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.addIconInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.addIconInUpdateAfterApprove());
        ClicksAndActionsHelperobj.doubleClick(EcoSectorTransactionobj.addIconInUpdateAfterApprove());
    }

    @And("^user enter account currency value under limits$")
    public void user_enter_account_currency_value_under_limits() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.accountCurrencyInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.accountCurrencyInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.accountCurrencyInUpdateAfterApprove());
        EcoSectorTransactionobj.accountCurrencyInUpdateAfterApprove().sendKeys("840");
    }

    @And("^user enter transaction value under limits$")
    public void user_enter_transaction_value_under_limits() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.transactionBoxInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.transactionBoxInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.transactionBoxInUpdateAfterApprove());
        EcoSectorTransactionobj.transactionBoxInUpdateAfterApprove().sendKeys("000");
    }

    @And("^user enter withdrawal limit under limits$")
    public void user_enter_withdrawal_limit_under_limits() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.withdrawalLimitInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.withdrawalLimitInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.withdrawalLimitInUpdateAfterApprove());
        EcoSectorTransactionobj.withdrawalLimitInUpdateAfterApprove().sendKeys("100");
    }

    @And("^user click ok button under limits$")
    public void user_click_ok_button_under_limits() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.okButtonInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.okButtonInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.okButtonInUpdateAfterApprove());
    }

    @And("^user click update after approve button$")
    public void user_click_update_after_approve_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.updateAfterApproveButtonInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.updateAfterApproveButtonInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.updateAfterApproveButtonInUpdateAfterApprove());
    }

    @And("^user click confirm ok button$")
    public void user_click_confirm_ok_button() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
    }
    
    @Then("^user verify the warn user if limit exceeds flag unchecked$")
    public void user_verify_the_warn_user_if_limit_exceeds_flag_unchecked() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
    	javascriptHelper.scrollIntoView(EcoSectorTransactionobj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
        org.testng.Assert.assertTrue(EcoSectorTransactionobj.warnUserIfLimitExceedFlagInUpdateAfterApprove().isDisplayed());
    }
@And("^user click approve screen$")
    public void user_click_approve_screen() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.approveScreenInUser());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.approveScreenInUser());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.approveScreenInUser());
    }

@Then("^user click Eco sector button$")
    public void user_click_eco_sector_button() throws Throwable {
        waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.ecoSectorInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.ecoSectorInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.ecoSectorInUpdateAfterApprove());
    }
@And("^user select the row for delete the record$")
    public void user_select_the_row_for_delete_the_record() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.selectRowForDeleteInEcoSector());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.selectRowForDeleteInEcoSector());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.selectRowForDeleteInEcoSector());
    }
    
    @And("^user delete the inserted record under Eco sector$")
    public void user_delete_the_inserted_record_under_eco_sector() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.deleteButtonInEcoSector());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.deleteButtonInEcoSector());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.deleteButtonInEcoSector());
    }
@And("^user enter deposit limit value under Eco sector$")
    public void user_enter_deposit_limit_value_under_eco_sector() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.depositLimitInUpdateAfterApprove());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.depositLimitInUpdateAfterApprove());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.depositLimitInUpdateAfterApprove());
        EcoSectorTransactionobj.depositLimitInUpdateAfterApprove().sendKeys(testData.get("Deposit Limit"));
    }

/*@And("^user check if the  value is entered or not$")

    public void user_check_if_the_value_is_entered_or_not() throws Throwable {
    	try {

        seleniumActions.getJavascriptHelper().scrollIntoView(EcoSectorTransactionobj.checkIfValueIsEntered());
        if ((EcoSectorTransactionobj.checkIfValueIsEntered().getAttribute("prevalue")) != null){
        	EcoSectorTransactionobj.checkIfValueIsEntered().isDisplayed();
        }
        else
        {       
         
        }
      } catch (Exception e){
    	  
      }
    }*/
@Then("^user verify the stopper message popup$")
    public void user_verify_the_stopper_message_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, EcoSectorTransactionobj.validatePopupInEcoSector());
        org.testng.Assert.assertTrue(EcoSectorTransactionobj.validatePopupInEcoSector().isDisplayed());
    }
@And("^User Click on Date to Change the Current Date$")
public void user_click_on_date_to_change_the_current_date() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMDateToChangeTheCurrentDate());
	ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMDateToChangeTheCurrentDate());
	ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMDateToChangeTheCurrentDate());
}

@And("^User Enter the Date in User Running Date$")
public void user_enter_the_date_in_user_running_date() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMDateInUserRunningDate());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMDateInUserRunningDate());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMDateInUserRunningDate());
    EcoSectorTransactionobj.CSMDateInUserRunningDate().clear();
    //EcoSectorTransactionobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
    EcoSectorTransactionobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
}

@And("^User Click on Use Button in Change Running Date Popupss1$")
public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMUseButtonInChangeRunningDate());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMUseButtonInChangeRunningDate());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMUseButtonInChangeRunningDate());
}

@And("^User Click Ok Button in Information PopUp menu$")
public void user_click_ok_button_in_information_popup_menu() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
}

@And("^User Click on Close Button in Change Running Date Popupss$")
public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMCloseButtonInChangeRunningDate());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMCloseButtonInChangeRunningDate());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMCloseButtonInChangeRunningDate());
}

@And("^User Click on Technical Details Icon$")
public void user_click_on_technical_details_icon() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMTechnicalDetailsIcon());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMTechnicalDetailsIcon());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMTechnicalDetailsIcon()); 
}

@And("^User Click Clear Cache in Technical Details Icons$")
public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
}

@And("^User Click Ok Button Under Information PopUp Menu$")
public void user_click_ok_button_under_information_popup_menu() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMOkButtonUnderInformationPopUp());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMOkButtonUnderInformationPopUp());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMOkButtonUnderInformationPopUp());
}	

@And("^User Click on Transactions under CSM application$")
public void user_click_on_transactions_under_csm_application() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMTransactionsMainMenu());
    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMTransactionsMainMenu());
    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMTransactionsMainMenu());
}

 @And("^User Click on Maintenance under Transactions$")
    public void user_click_on_maintenance_under_transactions() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMMaintenanceUnderTransactions());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMMaintenanceUnderTransactions());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMMaintenanceUnderTransactions());
    }

    @And("^User Enter TRX Type in Maintenance Screen$")
    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMTRXTypeInMaintenanceScreen());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMTRXTypeInMaintenanceScreen());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMTRXTypeInMaintenanceScreen());
        //EcoSectorTransactionobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
        EcoSectorTransactionobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
        
    }
    
    @And("^User Click Ok Button in Warning PopUp Menu$")
    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    			waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMOkButtonInWarningPopUpMenu());
    	        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMOkButtonInWarningPopUpMenu());
    	        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMOkButtonInWarningPopUpMenu());
    	        break;
			} catch (Exception e) {
				if (i==199) {
					org.testng.Assert.fail(e.getMessage());
				}
			}
    	}
    }

    @And("^User Enter the Currency in Maintenance Screen$")
    public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
    	
    	for (int i = 0; i < 200; i++) {
    		try {
    			waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMCurrencyInMaintenanceScreen());
    			ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMCurrencyInMaintenanceScreen());
    	        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMCurrencyInMaintenanceScreen());
    	        //EcoSectorTransactionobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
    	        EcoSectorTransactionobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
        break;
			} catch (Exception e) {
				if (i==199) {
					org.testng.Assert.fail(e.getMessage());
				}
			}			
		}   
    }
    	
//    
////    @And("^User Click Transactions Maintenance for loading Currency code$")
////    public void user_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
////    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
////        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
////        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
////    }

    @And("^User Enter the Amount in Maintenance Screen$")
    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
    	for (int i = 0; i < 200; i++) {
    		try {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMAmountInMaintenanceScreen());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMAmountInMaintenanceScreen());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMAmountInMaintenanceScreen());
        //EcoSectorTransactionobj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
        EcoSectorTransactionobj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
        break;
			} catch (Exception e) {
				if (i==199) {
					org.testng.Assert.fail(e.getMessage());
				}
			}			
		}
 	
    	for (int i = 0; i < 200; i++) {
   		try {
   			waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMCurrencyName());
    		EcoSectorTransactionobj.CSMCurrencyName().isDisplayed();
    			break;
			} catch (Exception e) {
				if (i==199) {
				org.testng.Assert.fail(e.getMessage());
				}
			}			
		}
    
    }
 
//    @And("^User Click Transactions Maintenance for loading Amount$")
//    public void user_click_transactions_maintenance_for_loading_amount() throws Throwable {
//    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
//        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
//        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_TransactionsMaintenanceForLoading());
//    }
    
    
    @And("^User Click the Account Details in Maintenance Screen$")
    public void user_click_the_account_details_in_maintenance_screen() throws Throwable {
    
	    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
    }

    @And("^User Click Add button in AccountDetails$")
    public void user_click_add_button_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_AccountDetails());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_AccountDetails());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_AccountDetails());
	    
    }

    @And("^User Enter the Branch in AccountDetails$")
    public void user_enter_the_branch_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_Branch());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_Branch());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_Branch());	
        EcoSectorTransactionobj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
    }

    @And("^User Enter the Gl in AccountDetails1111$")
    public void user_enter_the_gl_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_Gl());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_Gl());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_Gl());
        EcoSectorTransactionobj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
  	    }

    @And("^user Enetr the cif in AccountDetails$")
    public void user_enetr_the_cif_in_accountdetails() throws Throwable {
     	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_Cif());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_Cif());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_Cif());	
        EcoSectorTransactionobj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
    }

    @And("^User Enter the Serial in AccountDetails$")
    public void user_enter_the_serial_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_Sl());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_Sl());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_Sl());	 
        EcoSectorTransactionobj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
    }

    @And("^User Enter the Amount in AccountDetails$")
    public void user_enter_the_amount_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_Amount());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_Amount());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_Amount());	
    }

    @And("^User give some Msg Instruction1 in AccountDetails12$")
    public void user_give_some_msg_instruction1_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_instr1());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_instr1());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_instr1());
        EcoSectorTransactionobj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
    }

    @And("^User give some Msg Instruction2 in AccountDetails$")
    public void user_give_some_msg_instruction2_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_instr2());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_instr2());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_instr2());	
        EcoSectorTransactionobj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
    }

    @And("^User Click the ok button in AccountDetails$")
    public void user_click_the_ok_button_in_accountdetails() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_addbtn_ok());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_addbtn_ok());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_addbtn_ok());	
    }

    @And("^User Enter the Branch Code in debit Ac in Maintenance Screen$")
    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_BranchCodeINdebitAc());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_BranchCodeINdebitAc());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_BranchCodeINdebitAc());
        EcoSectorTransactionobj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
        
       }

    @And("^User Enter Currency Code in debit Ac in Maintenance Screen$")
    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_CurrencyCodedebitAc());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_CurrencyCodedebitAc());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_CurrencyCodedebitAc());
        EcoSectorTransactionobj.CSM_CurrencyCodedebitAc().sendKeys("586",Keys.TAB);
          
    }

    @And("^User Enter GL Code in debit Ac in Maintenance Screen$")
    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_GLCodedebitAc());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_GLCodedebitAc());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_GLCodedebitAc());
        EcoSectorTransactionobj.CSM_GLCodedebitAc().sendKeys("8456",Keys.TAB);
        
    }

    @And("^User Enter CIF Code in debit Ac in Maintenance Screen$")
    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMCIFCodeInCreditAc());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMCIFCodeInCreditAc());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMCIFCodeInCreditAc());
        EcoSectorTransactionobj.CSMBranchCodeInCreditAc().sendKeys("993602",Keys.TAB);
        
    }
    @And("^User Enter Serial in debit Ac in Maintenance Screen$")
    public void user_enter_serial_in_debit_ac_in_maintenance_screen_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSM_SerialIndebitAc());
        ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSM_SerialIndebitAc());
        ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSM_SerialIndebitAc());
        EcoSectorTransactionobj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
        
    }
    @And("^User Click Save Button in Maintenance Screen$")
    public void user_click_save_button_in_maintenance_screen_72() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,EcoSectorTransactionobj.CSMSaveButtonInMaintenanceScreen());
	    	    ClicksAndActionsHelperobj.moveToElement(EcoSectorTransactionobj.CSMSaveButtonInMaintenanceScreen());
	    	    ClicksAndActionsHelperobj.clickOnElement(EcoSectorTransactionobj.CSMSaveButtonInMaintenanceScreen());
	    	    break;
			} catch (Exception e) {
				if (i==199) {
					org.testng.Assert.fail(e.getMessage());
				}
			}
		}
    		
    	        
    }
  
}
