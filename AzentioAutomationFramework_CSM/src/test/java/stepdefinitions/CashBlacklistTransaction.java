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
	
	@Given("user click on paramerters the CSM Param")
    public void user_click_on_paramerters_the_csm_param() {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.Parameters12(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.Parameters12());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.Parameters12());
	   
	}
	@And("User Click on System paramerters the CSM Param")

	public void user_click_on_system_paramerters_the_csm_param() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.SystemParameters(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.SystemParameters());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SystemParameters());

	}
	@And("User click on Transaction Type")

	public void user_click_on_transaction_type() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.Transactiontype1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.Transactiontype1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.Transactiontype1());

	}
	@And("User Click the update after approve")

	public void user_click_the_update_after_approve() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.AfterApprove(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.AfterApprove());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.AfterApprove());
	}
	@And("user click the saerch button")

	public void user_click_the_saerch_button() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.SearchBUTTOn1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());

	}
	@And("User Enter the code value")

	public void user_enter_the_code_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.CODESEARCHbox1(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CODESEARCHbox1());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.SearchBUTTOn1());

	}
	@And("user Click the CIF blacklist dropdown value")

	public void user_click_the_cif_blacklist_dropdown_value() {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BlackLisAlert_PARAMobj.CIFBlacklist(), 60, 2);
		ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CIFBlacklist());
		ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CIFBlacklist());

	}
	@And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMDateInUserRunningDate());
        BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().clear();
        //BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        BlackLisAlert_PARAMobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popupss1$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popupss$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icons$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application$")
    public void user_click_on_transactions_under_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTransactionsMainMenu());
    }
	
	 @And("^User Click on Maintenance under Transactionss$")
	    public void user_click_on_maintenance_under_transactions() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screens$")
	    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen());
	        //BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        BlackLisAlert_PARAMobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
	        
	    }
	    
	    @And("^User Click Ok Button in Warning PopUp Menu$")
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

	    @And("^User Enter the Currency in Maintenance Screen$")
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
	    	
//	    
////	    @And("^User Click Transactions Maintenance for loading Currency code$")
////	    public void user_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
////	    	waitHelper.waitForElementwithFluentwait(driver,BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.moveToElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.clickOnElement(BlackLisAlert_PARAMobj.CSM_TransactionsMaintenanceForLoading());
////	    }

	    @And("^User Enter the Amount in Maintenance Screen$")
	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
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
	 
}
