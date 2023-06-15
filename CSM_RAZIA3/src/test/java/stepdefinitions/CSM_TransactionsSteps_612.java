package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;

import pageobjects.csm.CSM_TransactionsObj_612;
import resources.BaseClass;

public class CSM_TransactionsSteps_612 {
	
	
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	//Selenium_Actions seleniumAction = new Selenium_Actions(driver);
	Selenium_Actions seleniumAction = new Selenium_Actions(driver);
    CSM_TransactionsObj_612 csmtransaction_612 = new CSM_TransactionsObj_612(driver);
	CSMLogin login  = new CSMLogin(driver);

	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
    ExcelData CSM_TransactionsStepsExcelData = new ExcelData(path,"CSM_TRANSACTIONS","DataSet ID");
    Map<String, String> testData;
	
    @And("^User_612 update test data set id for TRS_170$")
    public void User_update_test_data_set_id_for_trs170() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_170_D1");
	 
    }
	@And("^User_612 Click on Date to Change the Current Date$")
    public void User_click_on_date_to_change_the_current_date() throws Throwable {
    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMDateToChangeTheCurrentDate_612());
        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMDateToChangeTheCurrentDate_612());
        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMDateToChangeTheCurrentDate_612());
    }
	
	 @And("^User_612 Enter the Date in User Running Date$")
	    public void User_enter_the_date_in_User_612_running_date() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMDateInUserRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMDateInUserRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMDateInUserRunningDate_612());
	        csmtransaction_612.CSMDateInUserRunningDate_612().clear();
	        csmtransaction_612.CSMDateInUserRunningDate_612().sendKeys(testData.get("Dates"));
	       
	    }
	 
	 

	    @And("^User_612 Click on Use Button in Change Running Date Popup$")
	    public void User_612_click_on_use_button_in_change_running_date_popup() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMUseButtonInChangeRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMUseButtonInChangeRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMUseButtonInChangeRunningDate_612());
	    }

	    @And("^User_612 Click Ok Button in Information PopUp menu$")
	    public void User_612_click_ok_button_in_information_popup_menu() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMOkButtonInAccessDeniedPopUpMenu_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonInAccessDeniedPopUpMenu_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonInAccessDeniedPopUpMenu_612());
	    }

	    @And("^User_612 Click on Close Button in Change Running Date Popup$")
	    public void User_612_click_on_close_button_in_change_running_date_popup() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMCloseButtonInChangeRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMCloseButtonInChangeRunningDate_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMCloseButtonInChangeRunningDate_612());
	    }

	    @And("^User_612 Click on Technical Details Icon$")
	    public void User_612_click_on_technical_details_icon() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMTechnicalDetailsIcon_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMTechnicalDetailsIcon_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMTechnicalDetailsIcon_612()); 
	    }
	    
	    @And("^User_612 Click Clear Cache in Technical Details Icon$")
	    public void User_612_click_clear_cache_in_technical_details_icon() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_ClearCacheInTechnicalDetailsIcon_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_ClearCacheInTechnicalDetailsIcon_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_ClearCacheInTechnicalDetailsIcon_612()); 
	    }
	    
	    @And("^User_612 Click Ok Button Under Information PopUp Menu$")
	    public void User_612_click_ok_button_under_information_popup_menu() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMOkButtonUnderInformationPopUp_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonUnderInformationPopUp_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonUnderInformationPopUp_612());
	    }	

	    @And("^User_612 Click on Transactions under CSM application$")
	    public void User_612_click_on_transactions_under_csm_application() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMTransactionsMainMenu_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMTransactionsMainMenu_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMTransactionsMainMenu_612());
	    }
		
		 @And("^User_612 Click on Maintenance under Transactions$")
		    public void User_612_click_on_maintenance_under_transactions() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMMaintenanceUnderTransactions_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMMaintenanceUnderTransactions_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMMaintenanceUnderTransactions_612());
		    }
		 
		 
		 
		 
		    @And("^User_612 Enter TRX Type in Maintenance Screen$")
		    public void User_612_enter_trx_type_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMTRXTypeInMaintenanceScreen_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMTRXTypeInMaintenanceScreen_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMTRXTypeInMaintenanceScreen_612());
		        csmtransaction_612.CSMTRXTypeInMaintenanceScreen_612().sendKeys(testData.get("TRXType_D1"));
		        csmtransaction_612.CSMTRXTypeInMaintenanceScreen_612().sendKeys(Keys.TAB);
		          // csmtransaction_612.CSMTRXTypeInMaintenanceScreen().sendKeys("",Keys.TAB);
		        
		    }
		    
		    @And("^User_612 Enter the Branch Code in Credit Ac in Maintenance Screen$")
		    public void User_612_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMBranchCodeInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMBranchCodeInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMBranchCodeInCreditAc_612());
		        csmtransaction_612.CSMBranchCodeInCreditAc_612().sendKeys(testData.get("BranchCode_D2"));
		        csmtransaction_612.CSMBranchCodeInCreditAc_612().sendKeys(Keys.TAB);
		    }


		    @And("^User_612 Enter Currency Code in Credit Ac in Maintenance Screen$")
		    public void User_612_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMCurrencyCodeCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMCurrencyCodeCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMCurrencyCodeCreditAc_612());
		        csmtransaction_612.CSMCurrencyCodeCreditAc_612().sendKeys(testData.get("CurrencyCode_D2"));
		        csmtransaction_612.CSMCurrencyCodeCreditAc_612().sendKeys(Keys.TAB);
		    }
		    
		    @And("^User_612 Enter GL Code in Credit Ac in Maintenance Screen$")
		    public void User_612_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMGLCodeCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMGLCodeCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMGLCodeCreditAc_612());
		        csmtransaction_612.CSMGLCodeCreditAc_612().sendKeys(testData.get("GLCode_D2"));
		        csmtransaction_612.CSMGLCodeCreditAc_612().sendKeys(Keys.TAB);
		    }
		    
		    @And("^User_612 Enter CIF Code in Credit Ac in Maintenance Screen$")
		    public void User_612_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMCIFCodeInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMCIFCodeInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMCIFCodeInCreditAc_612());
		        csmtransaction_612.CSMCIFCodeInCreditAc_612().sendKeys(testData.get("CIFCode_D2"));
		       csmtransaction_612.CSMCIFCodeInCreditAc_612().sendKeys(Keys.TAB);
		      
		    }

		    @And("^User_612 Enter Serial in Credit Ac in Maintenance Screen$")
		    public void User_612_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMSerialInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMSerialInCreditAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMSerialInCreditAc_612());
		        csmtransaction_612.CSMSerialInCreditAc_612().sendKeys(testData.get("SerialNo_D2"));
		        csmtransaction_612.CSMSerialInCreditAc_612().sendKeys(Keys.TAB);
		    }

		    @And("^User_612 Click Ok Button in Warning PopUp Menu$")
		    public void User_612_click_ok_button_in_warning_popup_menu() throws Throwable {
		    	for (int i = 0; i < 200; i++) {
		    		try {
		    	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonInWarningPopUpMenu_612());
		    	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonInWarningPopUpMenu_612());
		    	        break;
					} catch (Exception e) {
					}
		    	}
		    }

		    @And("^User_612 Enter the Amount in Maintenance Screen$")
		    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
		    		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMAmountInMaintenanceScreen_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMAmountInMaintenanceScreen_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMAmountInMaintenanceScreen_612());
		        csmtransaction_612.CSMAmountInMaintenanceScreen_612().sendKeys(testData.get("Amount"));
		        csmtransaction_612.CSMAmountInMaintenanceScreen_612().sendKeys(Keys.TAB);
		      
		    		}
		    
		    @And("^User_612 Enter the Currency in Maintenance Screen$")
		    public void User_enter_the_currency_in_maintenance_screen() throws Throwable {
//		    	
//		    	for (int i = 0; i < 200; i++) {
		    		try {
		    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMCurrencyInMaintenanceScreen_612());
		    			seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMCurrencyInMaintenanceScreen_612());
		    	        //seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMCurrencyInMaintenanceScreen_612());
		    	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMCurrencyInMaintenanceScreen_612());
		    	        csmtransaction_612.CSMCurrencyInMaintenanceScreen_612().sendKeys(testData.get("CurrencyCode_D1"));
		    	        csmtransaction_612.CSMCurrencyInMaintenanceScreen_612().sendKeys(Keys.TAB);
		    	        
		    	        //csmtransaction_612.CSMCurrencyInMaintenanceScreen_612().sendKeys("840",Keys.TAB);
	                  //break;
					} catch (Exception e) {
					Assert.fail(e.getMessage());
//						if (i==199) {
//							Assert.fail(e.getMessage());
						}
					}			
//				}   
//		    }
		    
		    
		    
		    
		    
		    
		    @And("^User_612 Enter the Branch Code in debit Ac in Maintenance Screen$")
		    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_BranchCodeINdebitAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_BranchCodeINdebitAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_BranchCodeINdebitAc_612());
		        csmtransaction_612.CSM_BranchCodeINdebitAc_612().sendKeys(testData.get("BranchCode_D1"),Keys.TAB);
		        
		       }

		    @And("^User_612 Enter Currency Code in debit Ac in Maintenance Screen$")
		    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_CurrencyCodedebitAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_CurrencyCodedebitAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_CurrencyCodedebitAc_612());
		        csmtransaction_612.CSM_CurrencyCodedebitAc_612().sendKeys(testData.get("CurrencyCode_D1"),Keys.TAB);
		        
		          
		    }

		    @And("^User_612 Enter GL Code in debit Ac in Maintenance Screen$")
		    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_GLCodedebitAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_GLCodedebitAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_GLCodedebitAc_612());
		        csmtransaction_612.CSM_GLCodedebitAc_612().sendKeys(testData.get("GLCode_D1"));
		        csmtransaction_612.CSM_GLCodedebitAc_612().sendKeys(Keys.TAB);
		        
		    }

		    @And("^User_612 Enter CIF Code in debit Ac in Maintenance Screen$")
		    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_CIFCodeIndebitAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_CIFCodeIndebitAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_CIFCodeIndebitAc_612());
		        csmtransaction_612.CSM_CIFCodeIndebitAc_612().sendKeys(testData.get("CIFCode_D1"));
		        csmtransaction_612.CSM_CIFCodeIndebitAc_612().sendKeys(Keys.TAB);
		        
		    }

		    @And("^User_612 Enter Serial in debit Ac in Maintenance Screen$")
		    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_SerialIndebitAc_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_SerialIndebitAc_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_SerialIndebitAc_612());
		        csmtransaction_612.CSM_SerialIndebitAc_612().sendKeys(testData.get("SerialNo_D1"));
		        csmtransaction_612.CSM_SerialIndebitAc_612().sendKeys(Keys.TAB);
		        
		    }
		    @And("^User_612 Click Save Button in Maintenance Screen$")
		    public void user_click_save_button_in_maintenance_screen() throws Throwable {
		    	for (int i = 0; i <200; i++) {
					try {
						seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMSaveButtonInMaintenanceScreen_612());
			    	    seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMSaveButtonInMaintenanceScreen_612());
			    	    seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMSaveButtonInMaintenanceScreen_612());
			    	    break;
					} catch (Exception e) {
						if (i==199) {
							Assert.fail(e.getMessage());
						}
					}
				}
		    		
		    	        
		    }
		    @And("^User_612 Get the Transaction No in Success PopUp Menu for170$")
		    public void user_get_the_transaction_no_in_success_popup_menu_for170() throws Throwable {
		    	
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.getTransactionNumber_612());
		    	String  transactionNo = csmtransaction_612.getTransactionNumber_612().getText().substring(15, 19);
		       System.out.println(transactionNo);
			  CSM_TransactionsStepsExcelData.updateTestData("TRS_170_D1", "TRXNo", transactionNo); 
			     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_170_D1");
		    	
		    }
		    
		    @And("^User_612 Get the Transaction No in Success PopUp Menu for171_01$")
		    public void user_get_the_transaction_no_in_success_popup_menu_for171_01() throws Throwable {
		    	
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.getTransactionNumber_612());
		    	String  transactionNo = csmtransaction_612.getTransactionNumber_612().getText().substring(15, 19);
		       System.out.println(transactionNo);
			  CSM_TransactionsStepsExcelData.updateTestData("TRS_171_D1", "TRXNo", transactionNo); 
			     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_171_D1");
		    	
		    }
		    @And("^User_612 Get the Transaction No in Success PopUp Menu for171_02$")
		    public void user_get_the_transaction_no_in_success_popup_menu_for171_02() throws Throwable {
		    	
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.getTransactionNumber_612());
		    	String  transactionNo = csmtransaction_612.getTransactionNumber_612().getText().substring(15, 19);
		       System.out.println(transactionNo);
			  CSM_TransactionsStepsExcelData.updateTestData("TRS_171_D2", "TRXNo", transactionNo); 
			     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_171_D2");
		    	
		    }
		    @And("^User_612 Get the Transaction No in Success PopUp Menu for172$")
		    public void user_get_the_transaction_no_in_success_popup_menu_for172() throws Throwable {
		    	
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.getTransactionNumber_612());
		    	String  transactionNo = csmtransaction_612.getTransactionNumber_612().getText().substring(15, 19);
		       System.out.println(transactionNo);
			  CSM_TransactionsStepsExcelData.updateTestData("TRS_172_D1", "TRXNo", transactionNo); 
			     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_172_D1");
		    	
		    }
		    @And("^User_612 Get the Transaction No in Success PopUp Menu for173$")
		    public void user_get_the_transaction_no_in_success_popup_menu_for173() throws Throwable {
		    	
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.getTransactionNumber_612());
		    	String  transactionNo = csmtransaction_612.getTransactionNumber_612().getText().substring(15, 19);
		       System.out.println(transactionNo);
			  CSM_TransactionsStepsExcelData.updateTestData("TRS_173_D1", "TRXNo", transactionNo); 
			     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_173_D1");
		    	
		    }
		    @And("^User_612 Click Ok Button in Success PopUp Menu$")
		    public void user_click_ok_button_in_success_popup_menu() throws Throwable {
		    	for (int i = 0; i < 200; i++) {
		    		try {
		    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMOkButtonInSuccessPopUpMenu_612());
		    	        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonInSuccessPopUpMenu_612());
		    	        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonInSuccessPopUpMenu_612());
		    	        break;
					} catch (Exception e) {
						if (i==199) {
							Assert.fail(e.getMessage());
						}
					}			
				}
		    }
		    
		    @And("^User_612 Click on Approve Screen under Transactions$")
		    public void user_click_on_approve_screen_under_transactions() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMApproveScreenUnderTransactions_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMApproveScreenUnderTransactions_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMApproveScreenUnderTransactions_612());
		    }

		    @And("^User_612 Enter the Transaction No in Approve Screen$")
		    public void user_enter_the_transaction_no_in_approve_screen() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMTransactionNoInApproveScreen_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMTransactionNoInApproveScreen_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMTransactionNoInApproveScreen_612());
		        csmtransaction_612.CSMTransactionNoInApproveScreen_612().sendKeys(testData.get("TRXNo"));
		        csmtransaction_612.CSMTransactionNoInApproveScreen_612().sendKeys(Keys.ENTER);
		    }

		    @And("^User_612 Double Click on the Transaction No$")
		    public void user_double_click_on_the_transaction_no() throws Throwable {
		    	try {
		    		if (csmtransaction_612.Transactions_transactionNo_Doubleclk_612().isDisplayed());
			        {
			        	//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.Transactions_transactionNo_Doubleclk_612());
			        	seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.Transactions_transactionNo_Doubleclk_612());
			        	seleniumAction.getClickAndActionsHelper().doubleClick(csmtransaction_612.Transactions_transactionNo_Doubleclk_612());
			        }  
			        }
		         
				catch (Exception e) {
				
				}
		    	

}
		    @And("^User_612 Click on Ok Button in Success PopUp Menu for Approve Transcation$")
		    public void user_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
		        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonInSuccessPopUpMenuForTranscation_612());
		    }
		    


			 @And("^User_612 Click Ok Button in Warning PopUp to go back to Maintenance$")
			    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMOkButtonInWarningPopUpToGoBackToMaintenance_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMOkButtonInWarningPopUpToGoBackToMaintenance_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMOkButtonInWarningPopUpToGoBackToMaintenance_612());
			    }

			    @And("^User_612 Click on Search Button in Maintenance Screen$")
			    public void user_click_on_search_button_in_meintenance_screen() throws Throwable {
			    	for (int i = 0; i < 200; i++) {
						try {
							seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMSearchButtonInMaintenanceScreen_612());
					        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMSearchButtonInMaintenanceScreen_612());
					        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMSearchButtonInMaintenanceScreen_612());
					        break;
						} catch (Exception e) {
							if (i==199) {
								Assert.fail(e.getMessage());
							}				
						}
					}
			    	
			    }
			    @And("^User_612 Enter the Transaction No in Search Box$")
			    public void user_enter_the_transaction_no_in_search_box() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMEnterTheTransactionNoInSearchBox_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMEnterTheTransactionNoInSearchBox_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMEnterTheTransactionNoInSearchBox_612());
			        csmtransaction_612.CSMEnterTheTransactionNoInSearchBox_612().sendKeys(testData.get("TRXNo"));
			         csmtransaction_612.CSMEnterTheTransactionNoInSearchBox_612().sendKeys(Keys.ENTER);
			         
			    }

			    @And("^User_612 Double Click on the Searched Transaction No in Search Box$")
			    public void user_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMDoubleClickOnTheTransactionNo_612());
		            seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMDoubleClickOnTheTransactionNo_612());
				       seleniumAction.getClickAndActionsHelper().doubleClick(csmtransaction_612.CSMDoubleClickOnTheTransactionNo_612());
				     
			    }
			    

			    @And("^User_612 Click on Booked Entries in Maintenance Screen$")
			    public void user_click_on_booked_entries_in_maintenance_screen() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMBookedEntriesInMaintenanceScreen_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMBookedEntriesInMaintenanceScreen_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMBookedEntriesInMaintenanceScreen_612());
			    }
			    @And("^User_612 Click on Approve Button for approve the Transaction$")
			    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSMApproveButtonInApproveScreen_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSMApproveButtonInApproveScreen_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSMApproveButtonInApproveScreen_612());
			    }
			    @And("^user_612 update test data set id for TRS_171_01$")
			    public void user_update_test_data_set_id_for_trs170_01() throws Throwable {
			    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_171_D1");
				 
			    } 
			    @And("^user_612 update test data set id for TRS_171_02$")
			    public void user_update_test_data_set_id_for_trs170_02() throws Throwable {
			    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_171_D2");
				 
			    }
			    @And("^user_612 update test data set id for TRS_172$")
			    public void user_update_test_data_set_id_for_trs172() throws Throwable {
			    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_172_D1");
				 
			    }
			    
			    @And("^user_612 update test data set id for TRS_173$")
			    public void user_update_test_data_set_id_for_trs173() throws Throwable {
			    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_173_D1");
				 
			    }
			    
			    
			    
			    @And("^user_612 check if the  value is entered or not$")
			    public void user_check_if_the_value_is_entered_or_not() throws Throwable {
			 
			        try {
			        	seleniumAction. getJavascriptHelper().scrollIntoView(csmtransaction_612.checkIfValueIsEntered_612());
			        	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, csmtransaction_612.checkIfValueIsEntered_612());
			            if ((csmtransaction_612.checkIfValueIsEntered_612().getAttribute("prevvalue")) != null) {
			            	csmtransaction_612.checkIfValueIsEntered_612().isDisplayed();
			 
			            } else {
			 			            }

			 			        } catch (Exception e) {

			            Assert.fail(e.getMessage());

			        }

			    }
			    
			    
			    //mode of payment in cash
			    @And("User_612 Click a mode of payment in under Transaction")
			    public void user_click_a_mode_of_payment_in_under_transaction() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_cashofpayment_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_cashofpayment_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_cashofpayment_612());	
			        seleniumAction.getDropDownHelper().SelectUsingVisibleText(csmtransaction_612.CSM_cashofpayment_612(),"Cash");

			        		
			    }
			      
			      @And("User_612 Enter a value currency  in mode of payment")
			    public void user_enter_a_value_currency_in_mode_of_payment()throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_cashofpayment_Cash_currency_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_cashofpayment_Cash_currency_612());
			        seleniumAction.getClickAndActionsHelper().clickOnElement(csmtransaction_612.CSM_cashofpayment_Cash_currency_612());
			        csmtransaction_612.CSM_cashofpayment_Cash_currency_612().sendKeys(testData.get("CurrencyCode_D1"));
			         csmtransaction_612.CSM_cashofpayment_Cash_currency_612().sendKeys(Keys.ENTER);
			         
			        
			    	
			        
			    }

			    @And("User_612 Double the existing data in mode of payment")
			    public void user_double_the_existing_data_in_mode_of_payment() throws Throwable {
			    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,csmtransaction_612.CSM_cashofpayment_Cash_currencyDoubleclk_612());
			        seleniumAction.getClickAndActionsHelper().moveToElement(csmtransaction_612.CSM_cashofpayment_Cash_currencyDoubleclk_612());
			        seleniumAction.getClickAndActionsHelper().doubleClick(csmtransaction_612.CSM_cashofpayment_Cash_currencyDoubleclk_612());	
			    	 
			    }



}
