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
import pageobjects.BlackLisAlert_PARAM;
import pageobjects.CashDepositTransaction;
import resources.BaseClass;

public class CashBlacklistTransaction {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	BlackLisAlert_PARAM BlackLisAlert_PARAMobj = new BlackLisAlert_PARAM (driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("user click on paramerters the CSM Param_72")
    public void user_click_on_paramerters_the_csm_param() {
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
	   
	}
	@And("User Click on System paramerters the CSM Param_72")

	public void user_click_on_system_paramerters_the_csm_param() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.SystemParameters(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.SystemParameters());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SystemParameters());

	}
	@And("User click on Transaction Type_72")

	public void user_click_on_transaction_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.Transactiontype1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.Transactiontype1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.Transactiontype1());

	}
	@And("User Click the update after approve_72")

	public void user_click_the_update_after_approve() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.AfterApprove(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.AfterApprove());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.AfterApprove());
	}
	@And("user click the saerch button_72")

	public void user_click_the_saerch_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.SearchBUTTOn1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());

	}
	@And("User Enter the code value_72")

	public void user_enter_the_code_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.CODESEARCHbox1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CODESEARCHbox1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());

	}
	@And("user Click the CIF blacklist dropdown value_72")

	public void user_click_the_cif_blacklist_dropdown_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.CIFBlacklist(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CIFBlacklist());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CIFBlacklist());

	}
	@And("^User Click on Date to Change the Current Date_72$")
    public void user_click_on_date_to_change_the_current_date_72() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date_72$")
    public void user_enter_the_date_in_user_running_date_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().clear();
        //BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popup_72$")
    public void user_click_on_use_button_in_change_running_date_popup_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu_72$")
    public void user_click_ok_button_in_information_popup_menu_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popupss1_72$")
    public void user_click_on_close_button_in_change_running_date_popup_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon_72$")

    public void user_click_on_technical_details_icon_72() throws Throwable {

   waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());

    }
    
    
    @And("^User Click Clear Cache in Technical Details Icon_72$")
    public void user_click_clear_cache_in_technical_details_icon_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu_72$")
    public void user_click_ok_button_under_information_popup_menu_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application_72$")
    public void user_click_on_transactions_under_csm_application_72() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
    }
	
	 @And("^User Click on Maintenance under Transactions_72$")
	    public void user_click_on_maintenance_under_transactions_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screen_72$")
	    public void user_enter_trx_type_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        //BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
	        
	    }
	    @And("^User Click Ok Button in Warning PopUp Menu_72$")
	    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }
	    
	    @And("^User Click Ok Button in Warning PopUp Menus_72$")
	    public void user_click_ok_button_in_warning_popup_menu_72() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }

	    @And("^User Enter the CSM Transaction Currency in Maintenance Screenss1_72$")
	    public void User_enter_the_currency_in_maintenance_screen_72() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    	        //BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
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
////	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	    }
	    @And("^User Enter the Currency in Maintenance Screenss1_72$")
	    public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());
	    	        //BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}   
	    }

	    @And("^User Enter the Amount in Maintenance Screen_72$")
	    public void user_enter_the_amount_in_maintenance_screen_72() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMAmountInMaintenanceScreen());
	        //BlackLisAlert_PARAMobj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        BlackLisAlert_PARAMobj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	 	
	    	for (int i = 0; i < 200; i++) {
	   		try {
	   			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCurrencyName());
	    		BlackLisAlert_PARAMobj.CSMCurrencyName().isDisplayed();
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
//	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
//	    }
	    @And("^User Enter the Currency in Maintenance Screenss_72$")

        public void user_enter_the_currency_in_maintenance_screen_72() throws Throwable {

//            

//            for (int i = 0; i < 200; i++) {

                try {

                	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());

                	ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());

                    //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());

                	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen());

                	BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("CurrencyCode_D1"));

                	BlackLisAlert_PARAMobj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);

                    

                    //CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);

                  //break;

                } catch (Exception e) {

                Assert.fail(e.getMessage());

//                    if (i==199) {

//                        Assert.fail(e.getMessage());

                    }

                }            

//            }   

//        }
	    
	    @And("^User Click the Account Details in Maintenance Screenss_72$")
	    public void user_click_the_account_details_in_maintenance_screen_72() throws Throwable {
	    
		    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_AccountDetailsInMaintenanceScreen());
	    }

	    @And("^User Click on Technical Details Icons_72$")
	    public void user_click_on_technical_details_icon() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon()); 
	    }

	    @And("^User Click Add button in AccountDetails_72$")
	    public void user_click_add_button_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_AccountDetails());
    	    
	    }

	    @And("^User Enter the Branch in AccountDetails_72$")
	    public void user_enter_the_branch_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_Branch());	
	        BlackLisAlert_PARAMobj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	    }

	    @And("^User Enter the Gl in AccountDetails_72$")
	    public void user_enter_the_gl_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_Gl());
	        BlackLisAlert_PARAMobj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	  	    }

	    @And("^user Enetr the cif in AccountDetails_72$")
	    public void user_enetr_the_cif_in_accountdetails_72() throws Throwable {
	     	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_Cif());	
	        BlackLisAlert_PARAMobj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	    }

	    @And("^User Enter the Serial in AccountDetails_72$")
	    public void user_enter_the_serial_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_Sl());	 
	        BlackLisAlert_PARAMobj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	    }

	    @And("^User Enter the Amount in AccountDetails_72$")
	    public void user_enter_the_amount_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_Amount());	
	    }

	    @And("^User give some Msg Instruction1 in AccountDetails_72$")
	    public void user_give_some_msg_instruction1_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_instr1());
	        BlackLisAlert_PARAMobj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User give some Msg Instruction2 in AccountDetails_72$")
	    public void user_give_some_msg_instruction2_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_instr2());	
	        BlackLisAlert_PARAMobj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User Click the ok button in AccountDetails_72$")
	    public void user_click_the_ok_button_in_accountdetails_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_addbtn_ok());	
	    }

	    @And("^User Click Save Button in Maintenance Screen_72$")
	    public void user_click_save_button_in_maintenance_screen_72() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMSaveButtonInMaintenanceScreen());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
	    
	    @And("^User Get the Transaction No in Success PopUo Menu_72$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_72() throws Throwable {
	    	String text = "";
	        for (int i = 0; i <200; i++) {
				try {
					text = BlackLisAlert_PARAMobj.CSMGetTheTransactionNo().getText();
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
	    
	    

	    @And("^User Click Ok Button in Success PopUp Menu_72$")
	    public void user_click_ok_button_in_success_popup_menu_72() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    }
	    
	    @And("^User Click on Approve Screen under Transactions_72$")
	    public void user_click_on_approve_screen_under_transactions_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMApproveScreenUnderTransactions());
	    }

	    @And("^User Enter the Transaction No in Approve Screen_72$")
	    public void user_enter_the_transaction_no_in_approve_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTransactionNoInApproveScreen());
	        BlackLisAlert_PARAMobj.CSMTransactionNoInApproveScreen().sendKeys("7543", Keys.ENTER);
	    }

	    @And("^User Double Click on the Transaction No_72$")
	    public void user_double_click_on_the_transaction_no_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.doubleClick(BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
	    }

	    @And("^User Click on Approve Button for approve the Transaction_72$")
	    public void user_click_on_approve_button_for_approve_the_transaction_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMApproveButtonInApproveScreen());
	    }	

	    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation_72$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	    }

	 @And("^User Click Ok Button in Warning PopUp to go back to Maintenance_72$")
	    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	    }

	    @And("^User Click on Search Button in Maintenance Screen_72$")
	    public void user_click_on_search_button_in_meintenance_screen_72() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMSearchButtonInMaintenanceScreen());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}				
				}
			}
	    	
	    }
	    @And("^User Enter the Transaction No in Search Box_72$")
	    public void user_enter_the_transaction_no_in_search_box_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMEnterTheTransactionNoInSearchBox());
	        BlackLisAlert_PARAMobj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7597",Keys.ENTER);
	    }

	    @And("^User Double Click on the Searched Transaction No in Search Box_72$")
	    public void user_double_click_on_the_searched_transaction_no_in_search_box_72() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.doubleClick(BlackLisAlert_PARAMobj.CSMDoubleClickOnTheTransactionNo());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
					
				}
			}
	    	
	    }

	    @And("^User Click on Booked Entries in Maintenance Screen_72$")
	    public void user_click_on_booked_entries_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMBookedEntriesInMaintenanceScreen());
	    }
	    
	    
//debit acount
	    @And("^User Enter the Branch Code in debit Ac in Maintenance Screen_72$")
	    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_BranchCodeINdebitAc());
	        BlackLisAlert_PARAMobj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
	        
	       }

	    @And("^User Enter Currency Code in debit Ac in Maintenance Screen_72$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_CurrencyCodedebitAc());
	        BlackLisAlert_PARAMobj.CSM_CurrencyCodedebitAc().sendKeys("586",Keys.TAB);
	          
	    }

	    @And("^User Enter GL Code in debit Ac in Maintenance Screen_72$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_GLCodedebitAc());
	        BlackLisAlert_PARAMobj.CSM_GLCodedebitAc().sendKeys("8456",Keys.TAB);
	        
	    }

	    @And("^User Enter CIF Code in debit Ac in Maintenance Screen_72$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMCIFCodeInCreditAc());
	        BlackLisAlert_PARAMobj.CSMBranchCodeInCreditAc().sendKeys("993602",Keys.TAB);
	        
	    }
	    @And("^User Enter Serial in debit Ac in Maintenance Screen_72$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen_72() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_SerialIndebitAc());
	        BlackLisAlert_PARAMobj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
	        
	    }

}
