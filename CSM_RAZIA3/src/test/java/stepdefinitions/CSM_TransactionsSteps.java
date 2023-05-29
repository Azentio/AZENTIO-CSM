package stepdefinitions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.google.inject.Key;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.csm.CSM_TransactionObj;
import resources.BaseClass;

public class CSM_TransactionsSteps {
	
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions seleniumAction = new Selenium_Actions(driver);
	CSM_TransactionObj CSMTransactionObj = new CSM_TransactionObj(driver);
	CSMLogin login  = new CSMLogin(driver);

	@And("^User Click on Date to Change the Current Date$")
    public void user_click_on_date_to_change_the_current_date() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDateToChangeTheCurrentDate());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDateToChangeTheCurrentDate());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date$")
    public void user_enter_the_date_in_user_running_date() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDateInUserRunningDate());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDateInUserRunningDate());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMDateInUserRunningDate());
        CSMTransactionObj.CSMDateInUserRunningDate().clear();
        //CSMTransactionObj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        CSMTransactionObj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popup$")
    public void user_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMUseButtonInChangeRunningDate());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMUseButtonInChangeRunningDate());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu$")
    public void user_click_ok_button_in_information_popup_menu() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInAccessDeniedPopUpMenu());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popup$")
    public void user_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCloseButtonInChangeRunningDate());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCloseButtonInChangeRunningDate());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon$")
    public void user_click_on_technical_details_icon() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMTechnicalDetailsIcon());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMTechnicalDetailsIcon());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Clear Cache in Technical Details Icon$")
    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu$")
    public void user_click_ok_button_under_information_popup_menu() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonUnderInformationPopUp());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonUnderInformationPopUp());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application$")
    public void user_click_on_transactions_under_csm_application() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMTransactionsMainMenu());
        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMTransactionsMainMenu());
        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMTransactionsMainMenu());
    }
	
	 @And("^User Click on Maintenance under Transactions$")
	    public void user_click_on_maintenance_under_transactions() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMMaintenanceUnderTransactions());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMMaintenanceUnderTransactions());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screen$")
	    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        //CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys("154",Keys.TAB);
	        
	    }
	    
	    @And("^User Enter the Branch Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        //CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys(testData.get("Branch Code"),Keys.TAB);
	        CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys("1",Keys.TAB);
	    }


	    @And("^User Enter Currency Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        //CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	        CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys("48",Keys.TAB);
	    }
	    
	    @And("^User Enter GL Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        //CSMTransactionObj.CSMGLCodeCreditAc().sendKeys(testData.get("GL Code"),Keys.TAB);
	        CSMTransactionObj.CSMGLCodeCreditAc().sendKeys("6006",Keys.TAB);
	    }
	    
	    @And("^User Enter CIF Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        //CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIF No"),Keys.TAB);
	        CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys("1179",Keys.TAB);
	    }

	    @And("^User Enter Serial in Credit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMSerialInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMSerialInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMSerialInCreditAc());
	        //CSMTransactionObj.CSMSerialInCreditAc().sendKeys(testData.get("Serial"),Keys.TAB);
	        CSMTransactionObj.CSMSerialInCreditAc().sendKeys("0",Keys.TAB);
	    }

	    @And("^User Click Ok Button in Warning PopUp Menu$")
	    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInWarningPopUpMenu());
	    	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInWarningPopUpMenu());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInWarningPopUpMenu());
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
	    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    			seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        //CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
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
////	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
////	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
////	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
////	    }

	    @And("^User Enter the Amount in Maintenance Screen$")
	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        //CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys("100",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	 	
	    	for (int i = 0; i < 200; i++) {
	   		try {
	   			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyName());
	    		CSMTransactionObj.CSMCurrencyName().isDisplayed();
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
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_TransactionsMaintenanceForLoading());
//	    }
	    
	    
	    @And("^User Click the Account Details in Maintenance Screen$")
	    public void user_click_the_account_details_in_maintenance_screen() throws Throwable {
	    
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_AccountDetailsInMaintenanceScreen());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_AccountDetailsInMaintenanceScreen());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_AccountDetailsInMaintenanceScreen());
	    }

	    @And("^User Click Add button in AccountDetails$")
	    public void user_click_add_button_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_AccountDetails());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_AccountDetails());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_AccountDetails());
    	    
	    }

	    @And("^User Enter the Branch in AccountDetails$")
	    public void user_enter_the_branch_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Branch());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Branch());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Branch());	
	        CSMTransactionObj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	    }

	    @And("^User Enter the Gl in AccountDetails$")
	    public void user_enter_the_gl_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Gl());
	        CSMTransactionObj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	  	    }

	    @And("^user Enetr the cif in AccountDetails$")
	    public void user_enetr_the_cif_in_accountdetails() throws Throwable {
	     	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Cif());	
	        CSMTransactionObj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	    }

	    @And("^User Enter the Serial in AccountDetails$")
	    public void user_enter_the_serial_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Sl());	 
	        CSMTransactionObj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	    }

	    @And("^User Enter the Amount in AccountDetails$")
	    public void user_enter_the_amount_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Amount());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Amount());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Amount());	
	    }

	    @And("^User give some Msg Instruction1 in AccountDetails$")
	    public void user_give_some_msg_instruction1_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_instr1());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_instr1());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_instr1());
	        CSMTransactionObj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User give some Msg Instruction2 in AccountDetails$")
	    public void user_give_some_msg_instruction2_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_instr2());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_instr2());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_instr2());	
	        CSMTransactionObj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User Click the ok button in AccountDetails$")
	    public void user_click_the_ok_button_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_ok());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_ok());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_ok());	
	    }

	    @And("^User Click Save Button in Maintenance Screen$")
	    public void user_click_save_button_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMSaveButtonInMaintenanceScreen());
		    	    seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMSaveButtonInMaintenanceScreen());
		    	    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMSaveButtonInMaintenanceScreen());
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
					text = CSMTransactionObj.CSMGetTheTransactionNo().getText();
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
	    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInSuccessPopUpMenu());
	    	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenu());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenu());
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
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMApproveScreenUnderTransactions());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMApproveScreenUnderTransactions());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMApproveScreenUnderTransactions());
	    }

	    @And("^User Enter the Transaction No in Approve Screen$")
	    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMTransactionNoInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMTransactionNoInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMTransactionNoInApproveScreen());
	        CSMTransactionObj.CSMTransactionNoInApproveScreen().sendKeys("7543", Keys.ENTER);
	    }

	    @And("^User Double Click on the Transaction No$")
	    public void user_double_click_on_the_transaction_no() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
	        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
	    }

	    @And("^User Click on Approve Button for approve the Transaction$")
	    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMApproveButtonInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMApproveButtonInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMApproveButtonInApproveScreen());
	    }	

	    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	    }

	 @And("^User Click Ok Button in Warning PopUp to go back to Maintenance$")
	    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	    }

	    @And("^User Click on Search Button in Maintenance Screen$")
	    public void user_click_on_search_button_in_meintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMSearchButtonInMaintenanceScreen());
			        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMSearchButtonInMaintenanceScreen());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMSearchButtonInMaintenanceScreen());
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
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox());
	        CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7597",Keys.ENTER);
	    }

	    @And("^User Double Click on the Searched Transaction No in Search Box$")
	    public void user_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
			        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
			        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
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
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMBookedEntriesInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMBookedEntriesInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMBookedEntriesInMaintenanceScreen());
	    }
	    
	    
	    
	    
	    
	    



	
	
	

}
