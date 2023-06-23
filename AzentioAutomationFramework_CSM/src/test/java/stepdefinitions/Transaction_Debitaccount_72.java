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
import pageobjects.debuctCharges_CIF;
import resources.BaseClass;

public class Transaction_Debitaccount_72 {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	debuctCharges_CIF debuctCharges_CIFobj = new debuctCharges_CIF(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	
	
	@Given("^navigate to CSM application and login with valid credentials_072$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();
	}
	
	
	
	
	@And("^User Click on Date to Change the Current Date_072$")
    public void user_click_on_date_to_change_the_current_date_072() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMDateToChangeTheCurrentDate());
    	ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMDateToChangeTheCurrentDate());
    }

    @And("^User Enter the Date in User Running Date_072$")
    public void user_enter_the_date_in_user_running_date_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMDateInUserRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMDateInUserRunningDate());
        debuctCharges_CIFobj.CSMDateInUserRunningDate().clear();
        //debuctCharges_CIFobj.CSMDateInUserRunningDate().sendKeys(testData.get("Date in URD"));
        debuctCharges_CIFobj.CSMDateInUserRunningDate().sendKeys("29/05/2023");
    }

    @And("^User Click on Use Button in Change Running Date Popup_072$")
    public void user_click_on_use_button_in_change_running_date_popup_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMUseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMUseButtonInChangeRunningDate());
    }

    @And("^User Click Ok Button in Information PopUp menu_072$")
    public void user_click_ok_button_in_information_popup_menu_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInAccessDeniedPopUpMenu());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInAccessDeniedPopUpMenu());
    }

    @And("^User Click on Close Button in Change Running Date Popupss1_072$")
    public void user_click_on_close_button_in_change_running_date_popup_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMCloseButtonInChangeRunningDate());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMCloseButtonInChangeRunningDate());
    }

    @And("^User Click on Technical Details Icon_072$")

    public void user_click_on_technical_details_icon_072() throws Throwable {

   waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMTechnicalDetailsIcon());
   ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMTechnicalDetailsIcon());

    }
    
    
    @And("^User Click Clear Cache in Technical Details Icon_072$")
    public void user_click_clear_cache_in_technical_details_icon_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_ClearCacheInTechnicalDetailsIcon());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_ClearCacheInTechnicalDetailsIcon()); 
    }
    
    @And("^User Click Ok Button Under Information PopUp Menu_072$")
    public void user_click_ok_button_under_information_popup_menu_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonUnderInformationPopUp());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonUnderInformationPopUp());
    }	

    @And("^User Click on Transactions under CSM application_072$")
    public void user_click_on_transactions_under_csm_application_072() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMTransactionsMainMenu());
        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMTransactionsMainMenu());
    }
	
	 @And("^User Click on Maintenance under Transactions_072$")
	    public void user_click_on_maintenance_under_transactions_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMMaintenanceUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMMaintenanceUnderTransactions());
	    }

	    @And("^User Enter TRX Type in Maintenance Screen_072$")
	    public void user_enter_trx_type_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMTRXTypeInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMTRXTypeInMaintenanceScreen());
	        //debuctCharges_CIFobj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("Trx Type"),Keys.TAB);
	        debuctCharges_CIFobj.CSMTRXTypeInMaintenanceScreen().sendKeys("977",Keys.TAB);
	        
	    }
	    @And("^User Click Ok Button in Warning PopUp Menu_072$")
	    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }
	    
	    @And("^User Click Ok Button in Warning PopUp Menus_072$")
	    public void user_click_ok_button_in_warning_popup_menu_072() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
				
					}
				}
	    	}
	    }

	    @And("^User Enter the Currency in Maintenance Screenss_072$")
	    public void User_enter_the_currency_in_maintenance_screen_072() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    	        //debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
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
////	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
////	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
////	    }
	    @And("^User Enter the Currency in Maintenance Screenss_072$")
	    public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
	    	
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    			ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());
	    	        //debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Currency Code 1"),Keys.TAB);
	    	        debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}   
	    }

	    @And("^User Enter the Amount in Maintenance Screen_072$")
	    public void user_enter_the_amount_in_maintenance_screen_072() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMAmountInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMAmountInMaintenanceScreen());
	        //debuctCharges_CIFobj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        debuctCharges_CIFobj.CSMAmountInMaintenanceScreen().sendKeys("1000",Keys.TAB);
	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	 	
	    	for (int i = 0; i < 200; i++) {
	   		try {
	   			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCurrencyName());
	    		debuctCharges_CIFobj.CSMCurrencyName().isDisplayed();
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
//	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
//	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_TransactionsMaintenanceForLoading());
//	    }
	    @And("^User Enter the Currency in Maintenance Screen_072$")

        public void user_enter_the_currency_in_maintenance_screen_072() throws Throwable {

//            

//            for (int i = 0; i < 200; i++) {

                try {

                	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());

                	ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());

                    //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());

                	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen());

                	debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("CurrencyCode_D1"));

                	debuctCharges_CIFobj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);

                    

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
	    
	    @And("^User Click the Account Details in Maintenance Screenss_072$")
	    public void user_click_the_account_details_in_maintenance_screen_072() throws Throwable {
	    
		    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_AccountDetailsInMaintenanceScreen());
		        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_AccountDetailsInMaintenanceScreen());
	    }

	    @And("^User Click on Technical Details Icons_072$")
	    public void user_click_on_technical_details_icon() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMTechnicalDetailsIcon());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMTechnicalDetailsIcon()); 
	    }

	    @And("^User Click Add button in AccountDetails_072$")
	    public void user_click_add_button_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_AccountDetails());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_AccountDetails());
    	    
	    }

	    @And("^User Enter the Branch in AccountDetails_072$")
	    public void user_enter_the_branch_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_Branch());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_Branch());	
	        debuctCharges_CIFobj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	    }

	    @And("^User Enter the Gl in AccountDetails$")
	    public void user_enter_the_gl_in_accountdetails() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_Gl());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_Gl());
	        debuctCharges_CIFobj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	  	    }

	    @And("^user Enetr the cif in AccountDetails_072$")
	    public void user_enetr_the_cif_in_accountdetails_072() throws Throwable {
	     	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_Cif());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_Cif());	
	        debuctCharges_CIFobj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	    }

	    @And("^User Enter the Serial in AccountDetails_072$")
	    public void user_enter_the_serial_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_Sl());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_Sl());	 
	        debuctCharges_CIFobj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	    }

	    @And("^User Enter the Amount in AccountDetails_072$")
	    public void user_enter_the_amount_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_Amount());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_Amount());	
	    }

	    @And("^User give some Msg Instruction1 in AccountDetails_072$")
	    public void user_give_some_msg_instruction1_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_instr1());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_instr1());
	        debuctCharges_CIFobj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User give some Msg Instruction2 in AccountDetails_072$")
	    public void user_give_some_msg_instruction2_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_instr2());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_instr2());	
	        debuctCharges_CIFobj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	    }

	    @And("^User Click the ok button in AccountDetails_072$")
	    public void user_click_the_ok_button_in_accountdetails_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_addbtn_ok());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_addbtn_ok());	
	    }

	    @And("^User Click Save Button in Maintenance Screen_072$")
	    public void user_click_save_button_in_maintenance_screen_072() throws Throwable {
	    	for (int i = 0; i <200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMSaveButtonInMaintenanceScreen());
		    	    ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMSaveButtonInMaintenanceScreen());
		    	    break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}
			}
	    		
	    	        
	    }
	    
	    @And("^User Get the Transaction No in Success PopUo Menu_072$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_072() throws Throwable {
	    	String text = "";
	        for (int i = 0; i <200; i++) {
				try {
					text = debuctCharges_CIFobj.CSMGetTheTransactionNo().getText();
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
	    
	    

	    @And("^User Click Ok Button in Success PopUp Menu_072$")
	    public void user_click_ok_button_in_success_popup_menu_072() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenu());
	    	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenu());
	    	        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
				}			
			}
	    }
	    
	    @And("^User Click on Approve Screen under Transactions_072$")
	    public void user_click_on_approve_screen_under_transactions_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMApproveScreenUnderTransactions());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMApproveScreenUnderTransactions());
	    }

	    @And("^User Enter the Transaction No in Approve Screen_072$")
	    public void user_enter_the_transaction_no_in_approve_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMTransactionNoInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMTransactionNoInApproveScreen());
	        debuctCharges_CIFobj.CSMTransactionNoInApproveScreen().sendKeys("7543", Keys.ENTER);
	    }

	    @And("^User Double Click on the Transaction No_072$")
	    public void user_double_click_on_the_transaction_no_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
	        ClicksAndActionsHelperobj.doubleClick(debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
	    }

	    @And("^User Click on Approve Button for approve the Transaction_072$")
	    public void user_click_on_approve_button_for_approve_the_transaction_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMApproveButtonInApproveScreen());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMApproveButtonInApproveScreen());
	    }	

	    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation_072$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInSuccessPopUpMenuForTranscation());
	    }

	 @And("^User Click Ok Button in Warning PopUp to go back to Maintenance_072$")
	    public void user_click_ok_button_in_warning_popup_to_go_back_to_maintenance_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMOkButtonInWarningPopUpToGoBackToMaintenance());
	    }

	    @And("^User Click on Search Button in Maintenance Screen_072$")
	    public void user_click_on_search_button_in_meintenance_screen_072() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMSearchButtonInMaintenanceScreen());
			        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMSearchButtonInMaintenanceScreen());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}				
				}
			}
	    	
	    }
	    @And("^User Enter the Transaction No in Search Box_072$")
	    public void user_enter_the_transaction_no_in_search_box_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMEnterTheTransactionNoInSearchBox());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMEnterTheTransactionNoInSearchBox());
	        debuctCharges_CIFobj.CSMEnterTheTransactionNoInSearchBox().sendKeys("7597",Keys.ENTER);
	    }

	    @And("^User Double Click on the Searched Transaction No in Search Box_072$")
	    public void user_double_click_on_the_searched_transaction_no_in_search_box_072() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
				try {
					waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
			        ClicksAndActionsHelperobj.doubleClick(debuctCharges_CIFobj.CSMDoubleClickOnTheTransactionNo());
			        break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
					
				}
			}
	    	
	    }

	    @And("^User Click on Booked Entries in Maintenance Screen_072$")
	    public void user_click_on_booked_entries_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMBookedEntriesInMaintenanceScreen());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMBookedEntriesInMaintenanceScreen());
	    }
	    
	    
//debit acount
	    @And("^User Enter the Branch Code in debit Ac in Maintenance Screen_072$")
	    public void user_enter_the_branch_code_in_debit_ac_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_BranchCodeINdebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_BranchCodeINdebitAc());
	        debuctCharges_CIFobj.CSM_BranchCodeINdebitAc().sendKeys("1",Keys.TAB);
	        
	       }

	    @And("^User Enter Currency Code in debit Ac in Maintenance Screen_072$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_CurrencyCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_CurrencyCodedebitAc());
	        debuctCharges_CIFobj.CSM_CurrencyCodedebitAc().sendKeys("586",Keys.TAB);
	          
	    }

	    @And("^User Enter GL Code in debit Ac in Maintenance Screen_072$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_GLCodedebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_GLCodedebitAc());
	        debuctCharges_CIFobj.CSM_GLCodedebitAc().sendKeys("8456",Keys.TAB);
	        
	    }

	    @And("^User Enter CIF Code in debit Ac in Maintenance Screen_072$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSMCIFCodeInCreditAc());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSMCIFCodeInCreditAc());
	        debuctCharges_CIFobj.CSMBranchCodeInCreditAc().sendKeys("993602",Keys.TAB);
	        
	    }

	    @And("^User Enter Serial in debit Ac in Maintenance Screen_072$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen_072() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_SerialIndebitAc());
	        ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_SerialIndebitAc());
	        debuctCharges_CIFobj.CSM_SerialIndebitAc().sendKeys("0",Keys.TAB);
	        
	    }

	    @And("User Click a mode of payment in under Transaction_072")

        public void user_click_a_mode_of_payment_in_under_transaction() throws Throwable {

	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_cashofpayment_612());
           ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_cashofpayment_612());
         ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_cashofpayment_612());    
         
	    }
	    @And("User Enter a value currency  in mode of payment_072")
	    public void user_enter_a_value_currency_in_mode_of_payment()throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_cashofpayment_Cash_currency_612());
	   ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_cashofpayment_Cash_currency_612());
	   ClicksAndActionsHelperobj.clickOnElement(debuctCharges_CIFobj.CSM_cashofpayment_Cash_currency_612());
	   debuctCharges_CIFobj.CSM_cashofpayment_Cash_currency_612().sendKeys(testData.get("CurrencyCode_D1"));
	   debuctCharges_CIFobj.CSM_cashofpayment_Cash_currency_612().sendKeys(Keys.ENTER);
	   }
	   @And("User Double the existing data in mode of payment_072")
	   public void user_double_the_existing_data_in_mode_of_payment() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());
	   ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());
	   ClicksAndActionsHelperobj.doubleClick(debuctCharges_CIFobj.CSM_cashofpayment_Cash_currencyDoubleclk_612());    
	   }
	   @Given("User Enter the Cheque Number in Transaction_072")
        public void user_enter_the_cheque_number_in_transaction() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.ChequeNumber_CSM072());
		   ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.ChequeNumber_CSM072());
		   ClicksAndActionsHelperobj.doubleClick(debuctCharges_CIFobj.ChequeNumber_CSM072());   
	   }
	   @Given("User Enter Cheque Date in Transaction_072")
        public void user_enter_cheque_date_in_transaction() throws Throwable {
		   waitHelper.waitForElementwithFluentwait(driver,debuctCharges_CIFobj.ChequeNumberDate_CSM72());
		   ClicksAndActionsHelperobj.moveToElement(debuctCharges_CIFobj.ChequeNumberDate_CSM72());
		   ClicksAndActionsHelperobj.doubleClick(debuctCharges_CIFobj.ChequeNumberDate_CSM72());   
	   }
	   
	  

	   

}             

        
	    
	    



	
	
	




