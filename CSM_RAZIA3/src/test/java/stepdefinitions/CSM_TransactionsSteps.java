package stepdefinitions;


import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.csm.CSM_TransactionObj;
import resources.BaseClass;

public class CSM_TransactionsSteps {
	

	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	//Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	Selenium_Actions seleniumAction = new Selenium_Actions(driver);
	CSM_TransactionObj CSMTransactionObj = new CSM_TransactionObj(driver);
	CSMLogin login  = new CSMLogin(driver);

	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
    ExcelData csmTransactionsStaffAccountExcelData = new ExcelData(path,"CSM_TRANSACTIONS","Data Set ID");
    Map<String, String> testData;
	
	    
	    @And("^user update test data set id for TRS_029$")
	    public void user_update_test_data_set_id_for_trs029() throws Throwable {
	    	testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_029_01");
		 
	    }
	   
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
        CSMTransactionObj.CSMDateInUserRunningDate().sendKeys("02/06/2023");
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
	       // CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("TRX_TYPE"));
	        //CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys(Keys.TAB);
	           CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys("123",Keys.TAB);
	        
	    }
	    
	    @And("^User Enter the Branch Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys(testData.get("Branch Code"),Keys.TAB);
	       // CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys("1",Keys.TAB);
	    }


	    @And("^User Enter Currency Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        //CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	        CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys("840",Keys.TAB);
	    }
	    
	    @And("^User Enter GL Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        //CSMTransactionObj.CSMGLCodeCreditAc().sendKeys(testData.get("GL Code"),Keys.TAB);
	        CSMTransactionObj.CSMGLCodeCreditAc().sendKeys("96138",Keys.TAB);
	    }
	    
	    @And("^User Enter CIF Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        //CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIF No"),Keys.TAB);
	        CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys("993563",Keys.TAB);
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
	    		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        //CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.ENTER);
	    		}

//	    @And("^User Enter the Amount in Maintenance Screen$")
//	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
//	    	for (int i = 0; i < 200; i++) {
//	    		try {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMAmountInMaintenanceScreen());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
//	        //CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
//	        CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.ENTER);
//	        break;
//				} catch (Exception e) {
//					if (i==199) {
//						Assert.fail(e.getMessage());
//					}
//				}			
//			}
//	 	
//	    	for (int i = 0; i < 200; i++) {
//	   		try {
//	   			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyName());
//	    		CSMTransactionObj.CSMCurrencyName().isDisplayed();
//	    			break;
//				} catch (Exception e) {
//					if (i==199) {
//						Assert.fail(e.getMessage());
//					}
//				}			
//			}
//	    
//	    }
	 
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
	    
	   // get the transcation no
	    //	   //waitHelper.waitForElementwithFluentwait(driver,transactiononstaffaccObj.getTransactionNumber());
//	      String  transactionNo = transactiononstaffaccObj.getTransactionNumber().getText().substring(15, 19);
//       System.out.println(transactionNo);
//	       excelDataForTransactionOnStaffAcc.updateTestData("TSA_157_D1", "TRXNo", transactionNo); 

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
	    
	  //#debit acount
	    
	    @And("^User Enter the Branch Code in debit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_BranchCodeINdebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_BranchCodeINdebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_BranchCodeINdebitAc());
	        CSMTransactionObj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
	        
	       }

	    @And("^User Enter Currency Code in debit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        CSMTransactionObj.CSM_CurrencyCodedebitAc().sendKeys("840",Keys.TAB);
	          
	    }

	    @And("^User Enter GL Code in debit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_GLCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_GLCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_GLCodedebitAc());
	        CSMTransactionObj.CSM_GLCodedebitAc().sendKeys("96145",Keys.TAB);
	        
	    }

	    @And("^User Enter CIF Code in debit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys("993579",Keys.TAB);
	        
	    }

	    @And("^User Enter Serial in debit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_SerialIndebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_SerialIndebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_SerialIndebitAc());
	        CSMTransactionObj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
	        
	    }

	    
///param pre requites
	    

	    @Given("^navigate to CSMparam application and login with valid credentials$")
	    public void navigate_to_csmparam_application_and_login_with_valid_credentials() throws Throwable {
	    	driver.get(configfilereader.getCSMparamsUrl());
	    	login.loginIntoCSMParamApplication();
	        
	    }
   	    
	    @And("^user click the parameters menu$")
	    public void user_click_the_parameters_menu() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmparam_parameters());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmparam_parameters());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmparam_parameters());
	          	}

	    @And("^user click the system parameters submenu$")
	    public void user_click_the_system_parameters_submenu() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmparam_sysparameter_submenu());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmparam_sysparameter_submenu());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmparam_sysparameter_submenu());
	          	}
	    	
	        
	        @And("^user click the User screen in system parameters$")
	    public void user_click_the_user_screen_in_system_parameters() throws Throwable {
	        	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Systemparameter_User());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Systemparameter_User());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Systemparameter_User());
		          	}
	    

	    @And("^user click the update after approve screen$")
	    public void user_click_the_update_after_approve_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove());
	    }
	    
	          
	    
	    @And("^user click and send the values in user id under update after approve screen$")
	    public void user_click_the_user_id_in_update_after_approve_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
	        CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys("razia");
	        CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(Keys.ENTER);
	    	
	    }
	   	    @And("^user double click the user id$")
	    public void user_double_click_the_user_id() throws Throwable {
	    	try {
	    		if (CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick().isDisplayed());
		        {
		        	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
		        	  seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid());
		        }  
		        }
	         
			catch (Exception e) {
			
			}
	    	
}
	   
	    @And("^User click the Limit button  in update after approve screen$")
	    public void user_click_the_limit_button_in_update_after_approve_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits());
	     
	       	    }
	    	
	    @And("^user  click add button under Limits$")
	 	    public void user_click_add_button_under_limits() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn());
	        seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency());
	      
	       	        
	    }

	    @And("^user enter the value of currency in Limits$")
	    public void user_enter_the_value_of_currency_in_limits() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency());
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency().sendKeys("840",Keys.TAB);
	      
	       	        
	    }
	    @And("^User enter the Transaction type in Limits$")
	    public void user_enter_the_transaction_type_in_limits() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx().sendKeys("123");
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx().sendKeys(Keys.TAB);
	      
	       
	    }

	    
	    @And("^User enter value with WdLimit in Limits$")
	    public void user_enter_value_with_wdlimit_in_limits() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits().sendKeys("300");
	       // CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits().sendKeys(Keys.TAB);
	       // seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
		     
	    }

	    @And("^User check the with warnuserlimit in Limit$")
	    public void user_check_the_with_warnuserlimit_in_limit() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check());
	        seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_warnuserlimit_check());
	       
	      
	    }

	    @And("^User check the with proceediflimit in Limit$")
	    public void user_check_the_with_proceediflimit_in_limit() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	        seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	       
	      
	    }

	    @And("^User check the proceediflimit in Limit$")
	    public void user_check_the_proceediflimit_in_limit() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_proceediflimit_check());
	       
	    }
	    @And("^user click the ok button under limit$")
	    public void user_click_the_ok_button_under_limit() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_ok());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_ok());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_ok()); 
	    }



	    @And("^user click the update after approve button$")
	    public void user_click_the_update_after_approve_button() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove());
	       
	         }
       

	 
	    @And("^user click the save ok button$")
	    public void user_click_the_save_ok_button() throws Throwable {
	    	try {
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
	    		seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
	    		seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
			} catch (Exception e) {
				
			}
	    	
	    }

	    @And("^user click the confirm ok$")
	    public void user_click_the_confirm_ok() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok());
	        
	     }
	    @And("^user click the sucesss ok$")
	    public void user_click_the_sucesss_ok() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
	       
	    }

	    @And("^user click the approve in user screen$")
	    public void user_click_the_approve_in_user_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Approve());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Approve());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Approve());
	       
	    }

	    
	    @And("^user click and send the values in user id under Approve screen$")
	    public void user_click_and_send_the_values_in_user_id_under_approve_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Approve_UserID());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Approve_UserID());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Approve_UserID());
	        	        CSMTransactionObj.csmParam_User_Approve_UserID().sendKeys("razia");
	        	        CSMTransactionObj.csmParam_User_Approve_UserID().sendKeys(Keys.TAB);
	       
	    }

	    @And("^user double click the user id in approve screen$")
	    public void user_double_click_the_user_id_in_approve_screen() throws Throwable {
	    	try {
	    		if(CSMTransactionObj.csmParam_User_Approve_Username_doubleclick().isDisplayed()) {
	   			   			
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Approve_Username_doubleclick());
   seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Approve_Username_doubleclick());
		        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_User_Approve_Username_doubleclick());
	    		}
			} catch (Exception e) {
			}
	   
	    	
	                
	    }

	    @And("^user click the approve box$")
	    public void user_click_the_approve_box() throws Throwable {
	      	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Approve());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Approve());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Approve());
	        
	       
	    }
	    

	  //csmparam @069
	    @And("^user click the transationtype submenu under systemparameters$")
	    public void user_click_the_transationtype_submenu_under_systemparameters() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Transactiontype());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype());
	        
	       }

	    @And("^user click the updateafterapprove menu under transationtype$")
	    public void user_click_the_updateafterapprove_menu_under_transationtype() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Transactiontype_Updateafterapprovefield());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Updateafterapprovefield());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_Updateafterapprovefield());
	    	    }

	    @And("^user Enter the code in inputfield on updateafterapprove screen under transactiontype$")
	    public void user_enter_the_code_in_inputfield_on_updateafterapprove_screen_under_transactiontype() throws Throwable {
	    	
				try {
					seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_inputfield());
					 seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_inputfield());
					 seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_inputfield());
			        //CSMTransactionObj.csmParam_Transactiontype_inputfield().sendKeys(testData.get("TRXType")); 
			        CSMTransactionObj.csmParam_Transactiontype_inputfield().sendKeys("123");
			        CSMTransactionObj.csmParam_Transactiontype_inputfield().sendKeys(Keys.ENTER);
				} catch (Exception e) {
					
				}
			
	    
	    	
	        
	    }

	    @And("^User double click the record under updateafterapprove screen$")
	    public void user_double_click_the_record_under_updateafterapprove_screen() throws Throwable {
	    	try {
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_inputfield_doubleclick());
	        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_inputfield_doubleclick());
	            seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_Transactiontype_inputfield_doubleclick());
			} catch (Exception e) {
				
			}
	    	
	    }
	    @Given("User unCheck the ProceedOnInsufficientFund chequebox")
	    public void user_uncheck_the_proceed_on_insufficient_fund_chequebox() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
//    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	       

	        if (CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds().getAttribute("initialvalue").isBlank()) {
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds(),
	        CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds(),
	        CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());

	       
	        } else {
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds(),
	        CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds());
	        
	        }
	    }
	    
	    @And("^user check the Force overdrawn$")
	    public void user_check_the_force_overdrawn() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
	    	if (CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn().getAttribute("initialvalue").isBlank()) {
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
		        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn(),
		        CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
		        
		       
		        } else {
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
		        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn(),
		        CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());
		        seleniumAction.getClickAndActionsHelper().clickUsingActionClass(CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn(),
		        CSMTransactionObj.csmParam_Transactiontype_Forceoverdrawn());

		        }
	    	
	    }
	    
	    
	     
	    
	    
	   
	    
	    @And("^User click UpdateAfterApprove button on updateafterapprove field$")
	    public void user_click_updateafterapprove_button_under_updateafterapprove_field() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
	    	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
	    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
	    }
	    @And("^user click the Approve field under the transactiontype$")
	    public void user_click_the_approve_button_under_the_transactiontype() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_Approvefield());
	    	//javascriptHelper.scrollIntoView(CSMTransactionObj.csmParam_Transactiontype_Approvefield());
	    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Approvefield());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_Approvefield());
	    }

	    @And("^user Enter the code in inputfield on Approve screen under transactiontype$")
	    public void user_enter_the_code_in_inputfield_on_approve_screen_under_transactiontype() throws Throwable {
	    	try {
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield());
	        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield());
	            seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield());
	           // CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield().sendKeys(testData.get("TRXType"));  
	            CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield().sendKeys(Keys.ENTER);
			} catch (Exception e) {
				
			}
	    	
	    }

	    @And("^User double click the record Approve screen$")
	    public void user_double_click_the_record_approve_screen() throws Throwable {
	    	try {
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield_doubleclick());
	        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield_doubleclick());
	            seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_Transactiontype_Approve_Inputfield_doubleclick()); 
			} catch (Exception e) {
				
			}
	    	
	    }
	@And("^user click the AccountParameter submenu under Parameters$")
	    public void user_click_the_accountparameter_submenu_under_parameters() throws Throwable {
		
	    	 seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters());
	       	        	
        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters());
        	seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters());
           
	    }

	    @And("^user click the AccountType under AccountParameters$")
	    public void user_click_the_accounttype_under_accountparameters() throws Throwable {
	    	 seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes());
	    	 	 seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes()); 
	    }

	    @And("^user click the UPA field under AccountTypes$")
	    public void user_click_the_upa_field_under_accounttypes() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPAField());
	      	 seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPAField()); 
	    }

	    @And("^user Enter the TypeCode in UPA field$")
	    public void user_enter_the_typecode_in_upa_field() throws Throwable {

	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
	    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode());
	       // CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys(testData.get("GLCode_D1")); 
	        CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys("96145");
	         CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys(Keys.ENTER);
	    }

	    @And("^user double click the TypeCode in UPA field$")
	    public void user_double_click_the_typecode_in_upa_field() throws Throwable {
	    	try {
	    		if (CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick().isDisplayed()) {
	        		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick());
	            	 seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode_doubleClick()); 
	    		} else {

	    		}
			} catch (Exception e) {
				
			}
	    	
	    	
	    }

	    @And("^user click the Instructions in AccountTypes$")
	    public void user_click_the_instructions_in_accounttypes() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions());
	     	 seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions()); 
	    }

	    @And("^user uncheck with AllowAccess checkBox under Instructions$")
	    public void user_uncheck_with_allowaccess_checkbox_under_instructions() throws Throwable {

	   for (int i = 0; i <200; i++) {
		try {
			if (!CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag().getAttribute("initialvalue").isBlank()
					||!CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag().getAttribute("initialvalue").isEmpty()) {
				seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
				seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        break;
			}
			else {
				seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag());
		        break;
			}
		} catch (Exception e) {
			
		}
	}
	        }
	    

	    @And("^user click UPA Button$")
	    public void user_click_upa_button() throws Throwable {
	    	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton());
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton());

	    	//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton());
	    	//seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton());
	   	 	  seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_Instructions_AllowOverdrawnFlag_UPAButton()); 
	    }
	    @And("^user click the Approve field under AccountTypes$")
	    public void user_click_the_approve_field_under_accounttypes() throws Throwable {
	    	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField());
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField());
	    	seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField());
	   	 //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField()); 
	   }
	    

	    @And("^user Enter the TypeCode in Approve Field$")
	    public void user_enter_the_typecode_in_approve_field() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
	    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode());
	        //CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys(testData.get("GLCode_D1"));
	        CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys("96145");
	        CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys(Keys.ENTER);
	    }

	    @And("^user double click the Typecode in Approve field$")
	    public void user_double_click_the_typecode_in_approve_field() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick());
	      	 seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick()); 
	    }

	    @And("^user click the Approve button$")
	    public void user_click_the_approve_button() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton());
	    	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton());
	     	 seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode_doubleClick_ApproveButton()); 
	    }
	    



	
	
	

}
