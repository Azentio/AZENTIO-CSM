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
import pageobjects.CashDepositTransaction;

import resources.BaseClass;

public class CashtransactionWarnlimit {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	CashDepositTransaction CashDepositTransactionobj = new CashDepositTransaction (driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	
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

    @And("^User Click on Use Button in Change Running Date Popup$")
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

    @And("^User Click on Close Button in Change Running Date Popup$")
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
	
	 @And("^User Click on Maintenance under Transactions$")
	    public void user_click_on_maintenance_under_transactions() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screen$")
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

	    @And("^User give some Msg Instruction1 in AccountDetails$")
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

	    @And("^User Click Save Button in Maintenance Screen$")
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
	    
	    @And("^User Get the Transaction No in Success PopUo Menu$")
	    public void user_get_the_transaction_no_in_success_popuo_menu() throws Throwable {
	    	String text = "";
	        for (int i = 0; i <200; i++) {
				try {
					text = CashDepositTransactionobj.CSMGetTheTransactionNo().getText();
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
	    			waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenu());
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
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMApproveScreenUnderTransactions());
	    }

	    @And("^User Enter the Transaction No in Approve Screen$")
	    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMTransactionNoInApproveScreen());
	        CashDepositTransactionobj.CSMTransactionNoInApproveScreen().sendKeys("7543", Keys.ENTER);
	    }

	    @And("^User Double Click on the Transaction No$")
	    public void user_double_click_on_the_transaction_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.doubleClick(CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
	    }

	    @And("^User Click on Approve Button for approve the Transaction$")
	    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMApproveButtonInApproveScreen());
	    }	

	    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	    }

	 @And("^User Click Ok Button in Warning PopUp to go back to Maintenance$")
	    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	    }

	    @And("^User Click on Search Button in Maintenance Screen$")
	    public void user_click_on_search_button_in_meintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMSearchButtonInMaintenanceScreen());
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
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMEnterTheTransactionNoInSearchBox());
	        CashDepositTransactionobj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7597",Keys.ENTER);
	    }

	    @And("^User Double Click on the Searched Transaction No in Search Box$")
	    public void user_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.doubleClick(CashDepositTransactionobj.CSMDoubleClickOnTheTransactionNo());
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
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMBookedEntriesInMaintenanceScreen());
	    }
	    
	    
//debit acount
	    @And("^User Enter the Branch Code in debit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_BranchCodeINdebitAc());
	        CashDepositTransactionobj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
	        
	       }

	    @And("^User Enter Currency Code in debit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_CurrencyCodedebitAc());
	        CashDepositTransactionobj.CSM_CurrencyCodedebitAc().sendKeys("586",Keys.TAB);
	          
	    }

	    @And("^User Enter GL Code in debit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_GLCodedebitAc());
	        CashDepositTransactionobj.CSM_GLCodedebitAc().sendKeys("8456",Keys.TAB);
	        
	    }

	    @And("^User Enter CIF Code in debit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSMCIFCodeInCreditAc());
	        CashDepositTransactionobj.CSMBranchCodeInCreditAc().sendKeys("993602",Keys.TAB);
	        
	    }

	    @And("^User Enter Serial in debit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,CashDepositTransactionobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.moveToElement(CashDepositTransactionobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(CashDepositTransactionobj.CSM_SerialIndebitAc());
	        CashDepositTransactionobj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
	        
	    }

	    
	    
	    



	
	
	

}
