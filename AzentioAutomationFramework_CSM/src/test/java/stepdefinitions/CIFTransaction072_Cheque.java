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
import pageobjects.SingleTransfer_Intrabank;

import resources.BaseClass;

public class CIFTransaction072_Cheque {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	SingleTransfer_Intrabank SingleTransfer_Intrabankobj = new SingleTransfer_Intrabank(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	

	@Given("^navigate to CSM application and login with valid credentials$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
	}
	
	
	
	
	@And("^User_0072_0072 Click on Date to Change the Current Date$")
    public void User_0072_click_on_date_to_change_the_current_date() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User_0072 Enter the Date in User Running Date$")
    public void User_0072_enter_the_date_in_User_running_date() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
        SingleTransfer_Intrabankobj.CSMDateInUserRunningDate().clear();
        //SingleTransfer_Intrabankobj.CSMDateInUser_0072RunningDate().sendKeys(testData.get("Date in URD"));
        SingleTransfer_Intrabankobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User_0072 Click on Use Button in Change Running Date Popup$")
    public void User_0072_click_on_use_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User_0072 Click Ok Button in Information PopUp menu$")
    public void User_0072_click_ok_button_in_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User_0072 Click on Close Button in Change Running Date Popupss1$")
    public void User_0072_click_on_close_button_in_change_running_date_popup() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User_0072 Click on Technical Details Icon_072$")

    public void User_0072_click_on_technical_details_icon_072() throws Throwable {

   waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());

    }
    
    
    @And("^User_0072 Click Clear Cache in Technical Details Icon$")
    public void User_0072_click_clear_cache_in_technical_details_icon() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User_0072 Click Ok Button Under Information PopUp Menu$")
    public void User_0072_click_ok_button_under_information_popup_menu() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User_0072 Click on Transactions under CSM application$")
    public void User_0072_click_on_transactions_under_csm_application() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTransactionsMainMenu());
    }
	
	 @And("^User_0072 Click on Maintenance under Transactions$")
	    public void User_0072_click_on_maintenance_under_transactions() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User_0072 Enter TRX Type in Maintenance Screen$")
	    public void User_0072_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTRXTypeInMaintenanceScreen());
	        //SingleTransfer_Intrabankobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        SingleTransfer_Intrabankobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
	        
	    }
	    @And("^User_0072 Click Ok Button in Warning PopUp Menu$")
	    public void User_0072_Click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }
	    
	    @And("^User_0072 Click Ok Button in Warning PopUp Menus$")
	    public void User_0072_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }

	    @And("^User_0072 Enter the Currency in Maintenance Screenss$")
	    public void User_0072_Enter_the_currency_in_maintenance_screen() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    	        //SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}   
	    }
	    	
//	    
////	    @And("^User_0072 Click Transactions Maintenance for loading Currency code$")
////	    public void User_0072_click_transactions_maintenance_for_loading_currency_code() throws Throwable {
////	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
////	    }
	    @And("^User_0072 Enter the Currency in Maintenance Screenss$")
	    public void User_0072_enter_the_currency_in_maintenance_screen() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());
	    	        //SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}   
	    }

	    @And("^User_0072 Enter the Amount in Maintenance Screen$")
	    public void User_0072_enter_the_amount_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMAmountInMaintenanceScreen());
	        //SingleTransfer_Intrabankobj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        SingleTransfer_Intrabankobj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	 	
	    	for (int i = 0; i < 200; i++) {
	   		try {
	   			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCurrencyName());
	    		SingleTransfer_Intrabankobj.CSMCurrencyName().isDisplayed();
	    			break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    
	    }
	 
//	    @And("^User_0072 Click Transactions Maintenance for loading Amount$")
//	    public void User_0072_click_transactions_maintenance_for_loading_amount() throws Throwable {
//	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_TransactionsMaintenanceForLoading());
//	    }
	    @And("^User_0072 Enter the Currency in Maintenance Screenss$")

        public void User_0072_Enter_the_Currency_in_maintenance_screen() throws Throwable {

//            

//            for (int i = 0; i < 200; i++) {

                try {

                	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());

                	ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());

                    //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());

                	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen());

                	SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("CurrencyCode_D1"));

                	SingleTransfer_Intrabankobj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);

                    

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
	    
	    @And("^User_0072 Click the Account Details in Maintenance Screenss$")
	    public void User_0072_click_the_account_details_in_maintenance_screen() throws Throwable {
	    
		    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_AccountDetailsInMaintenanceScreen());
	    }

	    @And("^User_0072 Click on Technical Details Icons$")
	    public void User_0072_click_on_technical_details_icon() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon()); 
	    }

	    @And("^User_0072 Click Add button in AccountDetails$")
	    public void User_0072_click_add_button_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_AccountDetails());
    	    
	    }

	    @And("^User_0072 Enter the Branch in AccountDetails$")
	    public void User_0072_enter_the_branch_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_Branch());	
	        SingleTransfer_Intrabankobj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	    }

	    @And("^User_0072 Enter the Gl in AccountDetails$")
	    public void User_0072_enter_the_gl_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_Gl());
	        SingleTransfer_Intrabankobj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	  	    }

	    @And("^User_0072 Enetr the cif in AccountDetails$")
	    public void User_0072_enetr_the_cif_in_accountdetails() throws Throwable {
	     	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_Cif());	
	        SingleTransfer_Intrabankobj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	    }

	    @And("^User_0072 Enter the Serial in AccountDetails$")
	    public void User_0072_enter_the_serial_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_Sl());	 
	        SingleTransfer_Intrabankobj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	    }

	    @And("^User_0072 Enter the Amount in AccountDetails$")
	    public void User_0072_enter_the_amount_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_Amount());	
	    }

	    @And("^User_0072 give some Msg Instruction1 in AccountDetails$")
	    public void User_0072_give_some_msg_instruction1_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_instr1());
	        SingleTransfer_Intrabankobj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User_0072 give some Msg Instruction2 in AccountDetails$")
	    public void User_0072_give_some_msg_instruction2_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_instr2());	
	        SingleTransfer_Intrabankobj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User_0072 Click the ok button in AccountDetails$")
	    public void User_0072_click_the_ok_button_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_addbtn_ok());	
	    }

	    @And("^User_0072 Click Save Button in Maintenance Screen$")
	    public void User_0072_click_save_button_in_maintenance_screen() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMSaveButtonInMaintenanceScreen());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
	    
	    @And("^User_0072 Get the Transaction No in Success PopUo Menu$")
	    public void User_0072_get_the_transaction_no_in_success_popuo_menu() throws Throwable {
	    	String text = "";
	        for (int i = 0; i <200; i++) {
				try {
					text = SingleTransfer_Intrabankobj.CSMGetTheTransactionNo().getText();
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
	    
	    

	    @And("^User_0072 Click Ok Button in Success PopUp Menu$")
	    public void User_0072_click_ok_button_in_success_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    }
	    
	    @And("^User_0072 Click on Approve Screen under Transactions$")
	    public void User_0072_click_on_approve_screen_under_transactions() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMApproveScreenUnderTransactions());
	    }

	    @And("^User_0072 Enter the Transaction No in Approve Screen$")
	    public void User_0072_enter_the_transaction_no_in_approve_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTransactionNoInApproveScreen());
	        SingleTransfer_Intrabankobj.CSMTransactionNoInApproveScreen().sendKeys("7543", Keys.ENTER);
	    }

	    @And("^User_0072 Double Click on the Transaction No$")
	    public void User_0072_double_click_on_the_transaction_no() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.doubleClick(SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
	    }

	    @And("^User_0072 Click on Approve Button for approve the Transaction$")
	    public void User_0072_click_on_approve_button_for_approve_the_transaction() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMApproveButtonInApproveScreen());
	    }	

	    @And("^User_0072 Click on Ok Button in Success PopUp Menu for Approve Transcation$")
	    public void User_0072_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	    }

	 @And("^User_0072 Click Ok Button in Warning PopUp to go back to Maintenance$")
	    public void User_0072_click_ok_button_in_warning_popup_to_go_back_to_maintenance() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	    }

	    @And("^User_0072 Click on Search Button in Maintenance Screen$")
	    public void User_0072_click_on_search_button_in_meintenance_screen() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMSearchButtonInMaintenanceScreen());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}				
				}
			}
	    	
	    }
	    @And("^User_0072 Enter the Transaction No in Search Box$")
	    public void User_0072_enter_the_transaction_no_in_search_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMEnterTheTransactionNoInSearchBox());
	        SingleTransfer_Intrabankobj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7597",Keys.ENTER);
	    }

	    @And("^User_0072 Double Click on the Searched Transaction No in Search Box$")
	    public void User_0072_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.doubleClick(SingleTransfer_Intrabankobj.CSMDoubleClickOnTheTransactionNo());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
					
				}
			}
	    	
	    }

	    @And("^User_0072 Click on Booked Entries in Maintenance Screen$")
	    public void User_0072_click_on_booked_entries_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMBookedEntriesInMaintenanceScreen());
	    }
	    
	    
//debit acount
	    @And("^User_0072 Enter the Branch Code in debit Ac in Maintenance Screen$")
	    public void User_0072_enter_the_branch_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_BranchCodeINdebitAc());
	        SingleTransfer_Intrabankobj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
	        
	       }

	    @And("^User_0072 Enter Currency Code in debit Ac in Maintenance Screen$")
	    public void User_0072_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_CurrencyCodedebitAc());
	        SingleTransfer_Intrabankobj.CSM_CurrencyCodedebitAc().sendKeys("586",Keys.TAB);
	          
	    }

	    @And("^User_0072 Enter GL Code in debit Ac in Maintenance Screen$")
	    public void User_0072_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_GLCodedebitAc());
	        SingleTransfer_Intrabankobj.CSM_GLCodedebitAc().sendKeys("8456",Keys.TAB);
	        
	    }

	    @And("^User_0072 Enter CIF Code in debit Ac in Maintenance Screen$")
	    public void User_0072_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMCIFCodeInCreditAc());
	        SingleTransfer_Intrabankobj.CSMBranchCodeInCreditAc().sendKeys("993602",Keys.TAB);
	        
	    }

	    @And("^User_0072 Enter Serial in debit Ac in Maintenance Screen$")
	    public void User_0072_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_SerialIndebitAc());
	        SingleTransfer_Intrabankobj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
	        
	    }

	    @And("User_0072 Click a mode of payment in under Transaction")

        public void User_0072_click_a_mode_of_payment_in_under_transaction() throws Throwable {

	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_cashofpayment_612());
           ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_cashofpayment_612());
         ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_cashofpayment_612());    
         
	    }
	    @And("User_0072 Enter a value currency  in mode of payment")
	    public void User_0072_enter_a_value_currency_in_mode_of_payment()throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currency_612());
	   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currency_612());
	   ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currency_612());
	   SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currency_612().sendKeys(testData.get("CurrencyCode_D1"));
	   SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currency_612().sendKeys(Keys.ENTER);
	   }
	   @And("User_0072 Double the existing data in mode of payment")
	   public void User_0072_double_the_existing_data_in_mode_of_payment() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());
	   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());
	   ClicksAndActionsHelperobj.doubleClick(SingleTransfer_Intrabankobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());    
	   }
	   @Given("User_0072 Enter the Cheque Number in Transaction")
        public void User_0072_enter_the_cheque_number_in_transaction() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.ChequeNumber_CSM072());
		   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.ChequeNumber_CSM072());
		   ClicksAndActionsHelperobj.doubleClick(SingleTransfer_Intrabankobj.ChequeNumber_CSM072());   
	   }
	   @Given("User_0072 Enter Cheque Date in Transaction")
        public void User_0072_enter_cheque_date_in_transaction() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.ChequeNumberDate_CSM72());
		   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.ChequeNumberDate_CSM72());
		   ClicksAndActionsHelperobj.doubleClick(SingleTransfer_Intrabankobj.ChequeNumberDate_CSM72());   
	   }
	   @And("^User_0072 Enter the Date in User Running Datess$")
	    public void user_enter_the_date_in_user_running_date() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMDateInUserRunningDate());
	        SingleTransfer_Intrabankobj.CSMDateInUserRunningDate().clear();
	        //debuctCharges_CIFobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
	        SingleTransfer_Intrabankobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
	    } 
	  
	   @And("^User_0072 Click on Date to Change the Current Date$")
	    public void user_click_on_date_to_change_the_current_date() throws Throwable {
			waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
	    	ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
	    	ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMDateToChangeTheCurrentDate());
	    }
	   @And("^User_0072 Click Clear Cache in Technical Details Icon$")
	    public void user_click_clear_cache_in_technical_details_icon() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
	    }
	   @And("^User_0072 Click on Technical Details Icon$")

	    public void user_click_on_technical_details_icon() throws Throwable {

	   waitHelper.waitForElementwithFluentwait(driver,SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
	   ClicksAndActionsHelperobj.moveToElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());
	   ClicksAndActionsHelperobj.clickOnElement(SingleTransfer_Intrabankobj.CSMTechnicalDetailsIcon());

	    }

}
