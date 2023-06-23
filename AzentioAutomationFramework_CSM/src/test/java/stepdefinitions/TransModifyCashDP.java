package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.CashDepositTransaction;
import resources.BaseClass;

public class TransModifyCashDP {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	CashDepositTransaction CashDepositTransactionobj = new CashDepositTransaction (driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^navigate to CSM application and login with valid credentialsss$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
	}
	
	
	@And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMDateInUserRunningDate());
        CashDepositTransactionobj.CSMDateInUserRunningDate().clear();
        //CashDepositTransactionobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        CashDepositTransactionobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popupss1$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popupss$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icon$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application$")
    public void user_click_on_transactions_under_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMTransactionsMainMenu());
    }
	
	 @And("^User Click on Maintenance under Transactionss$")
	    public void user_click_on_maintenance_under_transactions() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screens$")
	    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMTRXTypeInMaintenanceScreen());
	        //CashDepositTransactionobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        CashDepositTransactionobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
	        
	    }
	    
	    @And("^User Click Ok Button in Warning PopUp Menu$")
	    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonInWarningPopUpMenu());
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
	    			waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMCurrencyInMaintenanceScreen());
	    	        //CashDepositTransactionobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        CashDepositTransactionobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}   
	    }
	    	
//	    
////	    @And("^User Click Transactions Maintenance for loading Currency code$")
////	    public void user_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
////	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
////	    }

	    @And("^User Enter the Amount in Maintenance Screen$")
	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMAmountInMaintenanceScreen());
	        //CashDepositTransactionobj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        CashDepositTransactionobj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	 	
	    	for (int i = 0; i < 200; i++) {
	   		try {
	   			waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMCurrencyName());
	    		CashDepositTransactionobj.CSMCurrencyName().isDisplayed();
	    			break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    
	    }
	    @And("^User Click Save Button in Maintenance Screen$")
	    public void user_click_save_button_in_maintenance_screen_72() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
//	    @And("^User Click Transactions Maintenance for loading Amount$")
//	    public void user_click_transactions_maintenance_for_loading_amount() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_TransactionsMaintenanceForLoading());
//	    }
	    
	    
	    @And("^User Click the Account Details in Maintenance Screen$")
	    public void user_click_the_account_details_in_maintenance_screen() throws Throwable {
	    
		    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_AccountDetailsInMaintenanceScreen());
	    }

	    @And("^User Click Add button in AccountDetails$")
	    public void user_click_add_button_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_AccountDetails());
    	    
	    }

	    @And("^User Enter the Branch in AccountDetails$")
	    public void user_enter_the_branch_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_Branch());	
	        CashDepositTransactionobj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	    }

	    @And("^User Enter the Gl in AccountDetails$")
	    public void user_enter_the_gl_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_Gl());
	        CashDepositTransactionobj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	  	    }

	    @And("^user Enetr the cif in AccountDetails$")
	    public void user_enetr_the_cif_in_accountdetails() throws Throwable {
	     	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_Cif());	
	        CashDepositTransactionobj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	    }

	    @And("^User Enter the Serial in AccountDetails$")
	    public void user_enter_the_serial_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_Sl());	 
	        CashDepositTransactionobj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	    }

	    @And("^User Enter the Amount in AccountDetails$")
	    public void user_enter_the_amount_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_Amount());	
	    }

	    @And("^User give some Msg Instruction1 in AccountDetails12$")
	    public void user_give_some_msg_instruction1_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_instr1());
	        CashDepositTransactionobj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User give some Msg Instruction2 in AccountDetails$")
	    public void user_give_some_msg_instruction2_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_instr2());	
	        CashDepositTransactionobj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User Click the ok button in AccountDetails$")
	    public void user_click_the_ok_button_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_addbtn_ok());	
	    }

	    @And("^User Click Save Button in Maintenance Screenss$")
	    public void user_click_save_button_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMSaveButtonInMaintenanceScreen());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
}
