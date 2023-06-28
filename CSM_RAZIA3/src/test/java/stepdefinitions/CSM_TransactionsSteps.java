package stepdefinitions;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_TransactionObj;
import resources.BaseClass;

public class CSM_TransactionsSteps {
	

	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	//Selenium_Actions seleniumAction = new Selenium_Actions(driver);
	Selenium_Actions seleniumAction = new Selenium_Actions(driver);
	CSM_TransactionObj CSMTransactionObj = new CSM_TransactionObj(driver);
	CSMLogin login  = new CSMLogin(driver);

	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
    ExcelData CSM_TransactionsStepsExcelData = new ExcelData(path,"CSM_TRANSACTIONS","DataSet ID");
    Map<String, String> testData;
	

	   
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
       // CSMTransactionObj.CSMDateInUserRunningDate().sendKeys(testData.get("Dates"));
        //CSMTransactionObj.CSMDateInUserRunningDate().sendKeys("07/06/2023");
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date =LocalDate.now();
        String format = date.format(dtFormatter);
        CSMTransactionObj.CSMDateInUserRunningDate().sendKeys(format);
    }
   
    @And("User Click Ok Button for confirmation PopUp for Company Holiday")
          public void user_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
              for (int i = 0; i < 50; i++) {
                       try {
                           if (CSMTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {

                          seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());

                          seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());

                          seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmOkButtonForConfirmationPopUpForCompanyHoliday());

                          break;
                     }            

                    } catch (Exception e)

                  {

                        if (i==49) {

                            //Assert.fail(e.getMessage());

                        }  

                  }

              }

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
//		 for (int i = 0; i < 50; i++)
//				 try {
					 seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMMaintenanceUnderTransactions());
				        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMMaintenanceUnderTransactions());
				        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMMaintenanceUnderTransactions());
//				    
//				} catch (Exception e) {
//					
//				}
		 }
			 		    	
	
	 
	 
	 
	 
	    @And("^User Enter TRX Type in Maintenance Screen$")
	    public void user_enter_trx_type_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMTRXTypeInMaintenanceScreen());
	        CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys(testData.get("TRXType_D1"));
	        CSMTransactionObj.CSMTRXTypeInMaintenanceScreen().sendKeys(Keys.TAB);
	          
	        
	    }
	
	    @And("^User Enter the Branch Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMBranchCodeInCreditAc());
	        CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys(testData.get("BranchCode_D2"));
	        CSMTransactionObj.CSMBranchCodeInCreditAc().sendKeys(Keys.TAB);
	    }


	    @And("^User Enter Currency Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyCodeCreditAc());
	        CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys(testData.get("CurrencyCode_D2"));
	        CSMTransactionObj.CSMCurrencyCodeCreditAc().sendKeys(Keys.TAB);
	    }
	    
	    @And("^User Enter GL Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMGLCodeCreditAc());
	        CSMTransactionObj.CSMGLCodeCreditAc().sendKeys(testData.get("GLCode_D2"));
	        CSMTransactionObj.CSMGLCodeCreditAc().sendKeys(Keys.TAB);
	    }
	    
	    @And("^User Enter CIF Code in Credit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCIFCodeInCreditAc());
	        CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys(testData.get("CIFCode_D2"));
	       CSMTransactionObj.CSMCIFCodeInCreditAc().sendKeys(Keys.TAB);
	      
	    }

	    @And("^User Enter Serial in Credit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_credit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMSerialInCreditAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMSerialInCreditAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMSerialInCreditAc());
	        CSMTransactionObj.CSMSerialInCreditAc().sendKeys(testData.get("SerialNo_D2"));
	        CSMTransactionObj.CSMSerialInCreditAc().sendKeys(Keys.TAB);
	    }

	    @And("^User Click Ok Button in Warning PopUp Menu$")
	    public void user_click_ok_button_in_warning_popup_menu() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInWarningPopUpMenu());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInWarningPopUpMenu());
	    	        break;
				} catch (Exception e) {
				}
	    	}
	    }

	    @And("^User Enter the Currency in Maintenance Screen$")
	    public void user_enter_the_currency_in_maintenance_screen() throws Throwable {
//	    	
//	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    			seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("CurrencyCode_D1"));
	    	        CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);
	    	        
	    	        //CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys("840",Keys.TAB);
                  //break;
				} catch (Exception e) {
				Assert.fail(e.getMessage());
//					if (i==199) {
//						Assert.fail(e.getMessage());
					}
				}			
//			}   
//	    }
	    	
	    @And("^User Enter the ForeignCurrency in Maintenance Screen$")
	    public void user_enter_the_ForeignCurrency_in_maintenance_screen() throws Throwable {
//	    	
//	    	for (int i = 0; i < 200; i++) {
	    		try {
	    			seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    			seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        //seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMCurrencyInMaintenanceScreen());
	    	        CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys(testData.get("Foreign_Currency_D1"));
	    	        CSMTransactionObj.CSMCurrencyInMaintenanceScreen().sendKeys(Keys.TAB);
	    	        
	    	       
				} catch (Exception e) {
				Assert.fail(e.getMessage());
//					if (i==199) {
//						Assert.fail(e.getMessage());
					}
				}
//	    @And("User Enter the Branch code in TellerAc Under Maintenance Screen$")
//	    public void user_enter_the_branch_code_in_teller_ac_under_maintenance_screen() throws Throwable {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_Transaction_TellerAC_Branchinput());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_Transaction_TellerAC_Branchinput());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_Transaction_TellerAC_Branchinput());
//	        CSMTransactionObj.CSM_Transaction_TellerAC_Branchinput().sendKeys(testData.get(""));
//	        CSMTransactionObj.CSM_Transaction_TellerAC_Branchinput().sendKeys(Keys.TAB);
//	    }
//
//	    @And("User Enter the Currency  in TellerAc Under Maintenance Screen")
//	    public void user_enter_the_currency_in_teller_ac_under_maintenance_screen() throws Throwable{
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_Transaction_TellerAc_Currencyinput());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_Transaction_TellerAc_Currencyinput());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_Transaction_TellerAc_Currencyinput());
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Currencyinput().sendKeys(testData.get(""));
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Currencyinput().sendKeys(Keys.TAB);
//	        
//	    }
//
//	    @And("User Enter the Gl  in TellerAc Under Maintenance Screen")
//	    public void user_enter_the_gl_in_teller_ac_under_maintenance_screen()throws Throwable {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_Transaction_TellerAc_Glinput());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_Transaction_TellerAc_Glinput());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_Transaction_TellerAc_Glinput());
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Glinput().sendKeys(testData.get(""));
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Glinput().sendKeys(Keys.TAB);
//	        
//	    }
//
//	    @And("User Enter the Cif in TellerAc Under Maintenance Screen")
//	    public void user_enter_the_cif_in_teller_ac_under_maintenance_screen() throws Throwable{
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_Transaction_TellerAc_Cifinput());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_Transaction_TellerAc_Cifinput());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_Transaction_TellerAc_Cifinput());
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Cifinput().sendKeys(testData.get(""));
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Cifinput().sendKeys(Keys.TAB);
//	       
//	    }
//
//	    @And("User Enter the serial in TellerAc Under Maintenance Screen")
//	    public void user_enter_the_serial_in_teller_ac_under_maintenance_screen()throws Throwable {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_Transaction_TellerAc_Serialinput());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_Transaction_TellerAc_Serialinput());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_Transaction_TellerAc_Serialinput());
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Serialinput().sendKeys(testData.get(""));
//	        CSMTransactionObj.CSM_Transaction_TellerAc_Serialinput().sendKeys(Keys.TAB);
//	       
//	        
//	    }

	    @And("^User Enter the Amount in Maintenance Screen$")
	    public void user_enter_the_amount_in_maintenance_screen() throws Throwable {
	    		    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMAmountInMaintenanceScreen());
	        CSMTransactionObj.CSMAmountInMaintenanceScreen().sendKeys(testData.get("Amount"),Keys.TAB);
	        //Thread.sleep(6000);
	       
	    		}



	    
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
	        //CSMTransactionObj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Branch().sendKeys(testData.get("Acc_Branch_D1"));
	        CSMTransactionObj.CSM_addbtn_Branch().sendKeys(Keys.TAB);
	
	    }

	    @And("^User Enter the Gl in AccountDetails$")
	    public void user_enter_the_gl_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Gl());
	        //CSMTransactionObj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	      CSMTransactionObj.CSM_addbtn_Gl().sendKeys(testData.get("Acc_Gl_D1"));
	    CSMTransactionObj.CSM_addbtn_Gl().sendKeys(Keys.TAB);
	  	    }

	    @And("^user Enetr the cif in AccountDetails$")
	    public void user_enetr_the_cif_in_accountdetails() throws Throwable {
	     	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Cif());	
	        //CSMTransactionObj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Cif().sendKeys(testData.get("Acc_Cif_D1"));
	        CSMTransactionObj.CSM_addbtn_Cif().sendKeys(Keys.TAB);
	    }

	    @And("^User Enter the Serial in AccountDetails$")
	    public void user_enter_the_serial_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Sl());	 
	        //CSMTransactionObj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Sl().sendKeys(testData.get("Acc_sl_D1"));
	        CSMTransactionObj.CSM_addbtn_Sl().sendKeys(Keys.TAB);
	    }

	    @And("^User Enter the Branch2 in AccountDetails$")
	    public void user_enter_the_branch2_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Branch());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Branch());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Branch());	
	        //CSMTransactionObj.CSM_addbtn_Branch().sendKeys("1",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Branch().sendKeys(testData.get("Acc_Branch_D2"));
	        CSMTransactionObj.CSM_addbtn_Branch().sendKeys(Keys.TAB);

	    }

	    @And("^User Enter the Gl2 in AccountDetails$")
	    public void user_enter_the_gl2_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Gl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Gl());
	        //CSMTransactionObj.CSM_addbtn_Gl().sendKeys("999",Keys.TAB);
	      CSMTransactionObj.CSM_addbtn_Gl().sendKeys(testData.get("Acc_Gl_D2"));
	    CSMTransactionObj.CSM_addbtn_Gl().sendKeys(Keys.TAB);
	  	    }

	    @And("^user Enetr the cif2 in AccountDetails$")
	    public void user_enetr_the_cif2_in_accountdetails() throws Throwable {
	     	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Cif());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Cif());	
	        //CSMTransactionObj.CSM_addbtn_Cif().sendKeys("993567",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Cif().sendKeys(testData.get("Acc_Cif_D2"));
	        CSMTransactionObj.CSM_addbtn_Cif().sendKeys(Keys.TAB);
	    }

	    @And("^User Enter the Serial2 in AccountDetails$")
	    public void user_enter_the_serial2_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Sl());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Sl());	 
	        //CSMTransactionObj.CSM_addbtn_Sl().sendKeys("0",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_Sl().sendKeys(testData.get("Acc_sl_D2"));
	        CSMTransactionObj.CSM_addbtn_Sl().sendKeys(Keys.TAB);
	    }

	    @And("^User Enter the Amount in AccountDetails$")
	    public void user_enter_the_amount_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_Amount());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_Amount());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_Amount());
	        CSMTransactionObj.CSM_addbtn_Amount().sendKeys(testData.get("Acc_Amount_D1"));
	        CSMTransactionObj.CSM_addbtn_Amount().sendKeys(Keys.TAB);
	    }

	    @And("^User give some Msg Instruction1 in AccountDetails$")
	    public void user_give_some_msg_instruction1_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_instr1());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_instr1());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_instr1());
	        //CSMTransactionObj.CSM_addbtn_instr1().sendKeys("ok",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_instr1().sendKeys(testData.get("Acc_Msg1_D1"));
	        CSMTransactionObj.CSM_addbtn_instr1().sendKeys(Keys.TAB);
	    }

	    @And("^User give some Msg Instruction2 in AccountDetails$")
	    public void user_give_some_msg_instruction2_in_accountdetails() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_addbtn_instr2());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_addbtn_instr2());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_addbtn_instr2());	
	       // CSMTransactionObj.CSM_addbtn_instr2().sendKeys("ok",Keys.TAB);
	        CSMTransactionObj.CSM_addbtn_instr2().sendKeys(testData.get("Acc_Msg2_D1"));
	        CSMTransactionObj.CSM_addbtn_instr2().sendKeys(Keys.TAB);
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
	    @And("^User Click Ok Button in Warning PopUp Menu for118$")
	    public void user_click_ok_button_in_warning_popup_menu_for118() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());
	    	        break;
				} catch (Exception e) {
				}
	    	}
	    }
	    @And("^User Click Ok Button in Warning PopUp Menu for73_1$")
	    public void user_click_ok_button_in_warning_popup_menu_for73_1() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CurrencyLimit_pop_ok());
	    	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CurrencyLimit_pop_ok());
	    	        break;
				} catch (Exception e) {
				}
	    	}
	    }
	    
	  
	    @And("^User Get the Transaction No in Success PopUp Menu for116$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for116() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_116_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_116_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for73$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for73() throws Throwable {
	    	for (int i = 0; i < 200; i++) {
	    		try {
		    		//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
			    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
			       System.out.println(transactionNo);
				  CSM_TransactionsStepsExcelData.updateTestData("TRS_073_D1", "TRXNo", transactionNo); 
				     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_073_D1");
					break;
				} catch (Exception e) {
					if (i==199) {
					Assert.fail(e.getMessage());
						
					}
				}
		    	
			}
	    	
	    	
	    }
	    	    @Given("User click the ok pop in get Transaction no for73$")
	    public void user_click_the_ok_pop_in_get_transaction_no_for73() throws Throwable{
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionOkPop());
	    	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.getTransactionOkPop());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.getTransactionOkPop());
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for69$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for69() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_069_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_069_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for70$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for70() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_070_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_070_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for71$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for71() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_071_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_071_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for121$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for121() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_121_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_121_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for118$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for118() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_118_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_118_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for119$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for119() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_119_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_119_D1");
	    	
	    }
	    
	    
	    
	    @And("^User Get the Transaction No in Success PopUp Menu for34$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for34() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_034_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_034_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for33$")
	    public void user_get_the_transaction_no_in_success_popuo_menu_for33() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_033_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_033_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for32$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for32() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_032_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_032_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for30$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for30() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_030_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_030_D1");
	    	
	    }
	    
	    @And("^User Get the Transaction No in Success PopUp Menu for31$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for31() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_031_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_031_D1");
	    	
	    }
	    @And("^User Get the Transaction No in Success PopUp Menu for29$")
	    public void user_get_the_transaction_no_in_success_popup_menu_for29() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.getTransactionNumber());
	    	String  transactionNo = CSMTransactionObj.getTransactionNumber().getText().substring(15, 19);
	       System.out.println(transactionNo);
		  CSM_TransactionsStepsExcelData.updateTestData("TRS_029_D1", "TRXNo", transactionNo); 
		     testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_029_D1");	    	
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
	        CSMTransactionObj.CSMTransactionNoInApproveScreen().sendKeys(testData.get("TRXNo"));
	        CSMTransactionObj.CSMTransactionNoInApproveScreen().sendKeys(Keys.ENTER);
	    }

	    @And("^User Double Click on the Transaction No$")
	    public void user_double_click_on_the_transaction_no() throws Throwable {
	    	try {
	    		if (CSMTransactionObj.Transactions_transactionNo_Doubleclk().isDisplayed());
		        {
		        	//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.Transactions_transactionNo_Doubleclk());
		        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.Transactions_transactionNo_Doubleclk());
		        	seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.Transactions_transactionNo_Doubleclk());
		        }  
		        }
	         
			catch (Exception e) {		
			}
	    	

//	    	for (int i = 0; i < 200; i++) {
//			try {
					//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
	        //seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.Transactions_transactionNo_Doubleclk());
	        //seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.Transactions_transactionNo_Doubleclk());
//			        break;
//				} catch (Exception e) {
//					if (i==199) {
//						Assert.fail(e.getMessage());
//					}
//					
//				}
		//	}
	    	
	    }
	    

	    @And("^User Click on Approve Button for approve the Transaction$")
	    public void user_click_on_approve_button_for_approve_the_transaction() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMApproveButtonInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMApproveButtonInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMApproveButtonInApproveScreen());
	    }	
	    @And("^user_612 validate the warning pop upfor118$")
	    public void user_validate_the_warning_pop_upfor118() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());
	        Assert.assertTrue(CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118().isDisplayed());
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_transaction_warningpop_Economicsector_limitAmount_118());

	    }

	    @And("^User Click on Ok Button in Success PopUp Menu for Approve Transcation$")
	    public void user_click_on_ok_button_in_success_popup_menu_for_transcation() throws Throwable {
	    	try {
	    		//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSMOkButtonInSuccessPopUpMenuForTranscation());
		        Thread.sleep(1000);
				
			} catch (Exception e) {
				
			}
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
	        CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox().sendKeys(testData.get("TRXNo"));
	         CSMTransactionObj.CSMEnterTheTransactionNoInSearchBox().sendKeys(Keys.ENTER);
	         
	    }

	    @And("^User Double Click on the Searched Transaction No in Search Box$")
	    public void user_double_click_on_the_searched_transaction_no_in_search_box() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
            //seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
		       seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
	    	
//	    	try {
//	    		if(CSMTransactionObj.csmParam_User_Approve_Username_doubleclick().isDisplayed()) {
//	   			   			
//	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//             seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//		        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//	    		}
//			} catch (Exception e) {
//			}
		        }
	    	
	    	
//	    	for (int i = 0; i < 200; i++) {
//				try {
//					//seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//			        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//			        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.CSMDoubleClickOnTheTransactionNo());
//			        break;
//				} catch (Exception e) {
//					if (i==199) {
//						Assert.fail(e.getMessage());
//					}
//					
//				}
//			}
//	    	
	    
	    
	       

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
	        CSMTransactionObj.CSM_BranchCodeINdebitAc().sendKeys(testData.get("BranchCode_D1"),Keys.TAB);
	        
	       }

	    @And("^User Enter Currency Code in debit Ac in Maintenance Screen$")
	    public void user_enter_currency_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CurrencyCodedebitAc());
	        CSMTransactionObj.CSM_CurrencyCodedebitAc().sendKeys(testData.get("CurrencyCode_D1"),Keys.TAB);
	        
	          
	    }

	    @And("^User Enter GL Code in debit Ac in Maintenance Screen$")
	    public void user_enter_gl_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_GLCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_GLCodedebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_GLCodedebitAc());
	        CSMTransactionObj.CSM_GLCodedebitAc().sendKeys(testData.get("GLCode_D1"));
	        CSMTransactionObj.CSM_GLCodedebitAc().sendKeys(Keys.TAB);
	        
	    }

	    @And("^User Enter CIF Code in debit Ac in Maintenance Screen$")
	    public void user_enter_cif_code_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_CIFCodeIndebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CIFCodeIndebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CIFCodeIndebitAc());
	        CSMTransactionObj.CSM_CIFCodeIndebitAc().sendKeys(testData.get("CIFCode_D1"));
	        CSMTransactionObj.CSM_CIFCodeIndebitAc().sendKeys(Keys.TAB);
	        
	    }

	    @And("^User Enter Serial in debit Ac in Maintenance Screen$")
	    public void user_enter_serial_in_debit_ac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_SerialIndebitAc());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_SerialIndebitAc());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_SerialIndebitAc());
	        CSMTransactionObj.CSM_SerialIndebitAc().sendKeys(testData.get("SerialNo_D1"));
	        CSMTransactionObj.CSM_SerialIndebitAc().sendKeys(Keys.TAB);
	        
	    }

	    
///param pre requites
	    

	    @Given("^navigate to CSMparam application and login with valid credentials$")
	    public void navigate_to_csmparam_application_and_login_with_valid_credentials() throws Throwable {
	    	driver.get(configfilereader.getCSMparamsUrl());
	    	login.loginIntoCSMParamApplication();
	        
	    }
	    
	    @And("^user update test data set id for TRS_121$")
	    public void user_update_test_data_set_id_for_trs121() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_121_D1");
		 
	    }
	    
	    @And("^user update test data set id for TRS_116")
	    public void user_update_test_data_set_id_for_trs116() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_116_D1");
		 
	    }
	    @And("^user update test data set id for TRS_117")
	    public void user_update_test_data_set_id_for_trs117() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_117_D1");
		 
	    }
	    @And("^user update test data set id for TRS_118")
	    public void user_update_test_data_set_id_for_trs118() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_118_D1");
		 
	    }
	    @And("^user update test data set id for TRS_119")
	    public void user_update_test_data_set_id_for_trs119() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_119_D1");
		 
	    }
	    @And("^user update test data set id for TRS_70$")
	    public void user_update_test_data_set_id_for_trs70() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_070_D1"); 

		 
	    }
	    @And("^user update test data set id for TRS_69$")
	    public void user_update_test_data_set_id_for_trs69() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_069_D1");
		 
	    }
	    @And("^user update test data set id for TRS_73$")
	    public void user_update_test_data_set_id_for_trs73() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_073_D1");
		 
	    }
	    @And("^user update test data set id for TRS_72$")
	    public void user_update_test_data_set_id_for_trs72() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_072_D1");
		 
	    }
	    @And("^user update test data set id for TRS_34$")
	    public void user_update_test_data_set_id_for_trs34() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_034_D1");
		 
	    }
	    @And("^user update test data set id for TRS_33$")
	    public void user_update_test_data_set_id_for_trs33() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_033_D1");
		 
	    }
	    @And("^user update test data set id for TRS_32$")
	    public void user_update_test_data_set_id_for_trs32() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_032_D1");
		 
	    }
	    @And("^user update test data set id for TRS_30$")
	    public void user_update_test_data_set_id_for_trs30() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_030_D1");
		 
	    }
	    @And("^user update test data set id for TRS_029$")
	    public void user_update_test_data_set_id_for_trs029() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_029_D1");
		 
	    }
	    @And("^user update test data set id for TRS_31$")
	    public void user_update_test_data_set_id_for_trs31() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_031_D1");
		 
	    }
	   
	   
	   
	    @And("^user update test data set id for TRS_71$")
	    public void user_update_test_data_set_id_for_trs71() throws Throwable {
	    	testData = CSM_TransactionsStepsExcelData.getTestdata("TRS_071_D1");
		 
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
	        CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(testData.get("User_Id"));
	        CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid().sendKeys(Keys.ENTER);
	    	
	    }
	   	    @And("^user double click the user id$")
	    public void user_double_click_the_user_id() throws Throwable {
	    	try {
	    		if (CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick().isDisplayed());
		        {
		        	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
		        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
		        	seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.csmParam_Systemparameter_User_UpadateAfterapprove_Userid_doubleclick());
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
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_currency().sendKeys(testData.get("CurrencyCode_D1"),Keys.TAB);
	      
	       	        
	    }
	    @And("^User enter the Transaction type in Limits$")
	    public void user_enter_the_transaction_type_in_limits() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx());
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx().sendKeys(testData.get("TRXType_D1"));
	        CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_Trx().sendKeys(Keys.TAB);
	          
	   }
	    @And("^user retrive the existing record from the limits screen$")
	    public void user_retrive_the_existing_record_from_the_limits_screen() throws Throwable {
	    	 seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.limits_retriveTheRecord());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.limits_retriveTheRecord());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.limits_retriveTheRecord());
		    

	    	
	    }
	    
//	          try {
//	        	  seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.limits_retriveTheRecord());
//
//	        	  seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.limits_retriveTheRecord());
//	        	  seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.limits_retriveTheRecord());
//	        	  seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.limits_retriveTheRecord());
//	               seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.limits_retriveTheRecord());
//	             if ((CSMTransactionObj.limits_retriveTheRecord().getAttribute("prevvalue")).equalsIgnoreCase("977")){	   
//	            	 CSMTransactionObj.limits_retriveTheRecord().isDisplayed();
//	    
//	                      } 
//	         else {       
//	               	                }
//	               
//	                } catch (Exception e){
//	                }}
//
//	   

	     

	    @And("^user delete the record from the limits screen$")
	    public void user_delete_the_record_from_the_limits_screen() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.limits_DeleteButton());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.limits_DeleteButton());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.limits_DeleteButton());
	    	
	    	
//	        try {
//	        	seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.limits_DeleteButton());
//	        	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.limits_DeleteButton());
//	        	seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.limits_DeleteButton());
//	        } catch (Exception e) {
//
//	        }
	    }

	    
	    @And("^User enter value with WdLimit in Limits$")
	    public void user_enter_value_with_wdlimit_in_limits() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits());
	        //CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits().sendKeys("300");
	       CSMTransactionObj.csm_sysparam_user_updateafterapprove_Limits_addbtn_WDLimits().sendKeys(testData.get("WithdrawLimit"),Keys.TAB);
	       
		     
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
	    @And("^user click the confirm ok for69$")
	    public void user_click_the_confirm_ok_for69() throws Throwable {
	    	try {
				
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmparam_Transactiontype_UPA_Confirm_success69());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmparam_Transactiontype_UPA_Confirm_success69());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmparam_Transactiontype_UPA_Confirm_success69());
			} catch (Exception e) {
				
			}
	    	
	        
	     }
	    @And("user click  the grantall keys under Eco sector$")
	    public void user_click_the_grantall_keys_under_eco_sector() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.grantallkey_InEcoSector());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.grantallkey_InEcoSector());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.grantallkey_InEcoSector());
	        	      
	    }
	    
	    @And("^user click the sucesss ok$")
	    public void user_click_the_sucesss_ok() throws Throwable {
	    	try {
	    		seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
		        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
		        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Userid_doubleclick_logintobranch_Updateafterapprove_Ok_Ok());
		    	
				
			} catch (Exception e) {
				
			}
}
//	    @And("^user click the sucesss ok for69$")
//	    public void user_click_the_sucesss_ok_for69() throws Throwable {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.());
//	       
//	    }

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
	        	        CSMTransactionObj.csmParam_User_Approve_UserID().sendKeys(testData.get("User_Id"));
	        	        CSMTransactionObj.csmParam_User_Approve_UserID().sendKeys(Keys.ENTER);
	       
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
	    
	    @And("user click the Approvebttn$")
	    public void user_click_the_approvebttn()throws Throwable  {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.csmParam_User_Approvebttn());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_User_Approvebttn());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.csmParam_User_Approvebttn());
	        
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
			        CSMTransactionObj.csmParam_Transactiontype_inputfield().sendKeys(testData.get("TRXType_D1")); 
			        //CSMTransactionObj.csmParam_Transactiontype_inputfield().sendKeys("123");
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
	    	seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csmParam_Transactiontype_proceedoninsufficentfunds_UPAbutton());
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
	    	 seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.csmParam_AccountParameters_AccountTypes());
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
	       CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys(testData.get("GLCode_D1")); 
	       //CSMTransactionObj.csmParam_AccountParameters_AccountTypes_UPA_TypeCode().sendKeys("96145");
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
	        CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys(testData.get("GLCode_D1"));
	       // CSMTransactionObj.csmParam_AccountParameters_AccountTypes_ApproveField_TypeCode().sendKeys("96145");
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
	    
//@121
	    @Then("^user click Eco sector button$")
	    public void user_click_eco_sector_button() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.ecoSectorInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.ecoSectorInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.ecoSectorInUpdateAfterApprove());
	    }
	    @And("User click the Eco sector Delete All$")
	    public void user_click_the_eco_sector_delete_all() throws Throwable {
	    	
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.ecoSectorInUpdateAfterApprove_DeleteAll());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.ecoSectorInUpdateAfterApprove_DeleteAll());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.ecoSectorInUpdateAfterApprove_DeleteAll());
       // Thread.sleep(3000);
	    	   }
//	    @And("user click the ok")
//	    public void user_click_the_ok() throws Throwable {
//	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.csm_ok());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_OkButtonInWarningPopUpToGoBackToMaintenance());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_OkButtonInWarningPopUpToGoBackToMaintenance());
//	        //Thread.sleep(3000);
//	        
//	    }

	    
	    
	    
	 

	    @Then("^user verify the warn user if limit exceed flag checked under Eco sector$")
	    public void user_verify_the_warn_user_if_limit_exceed_flag_checked_under_eco_sector() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
	        seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
	    }

//	    @Then("^user verify the warn user if limit exceed flag unchecked under Eco sector$")
//	    public void user_verify_the_warn_user_if_limit_exceed_flag_unchecked_under_eco_sector() throws Throwable {
//	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
//	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
//	        seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
//	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.warnUserIfLimitExceedFlagInUpdateAfterApprove());
//	    }
@Then("user verify the Proceed if Limit Exceeds Checked under Eco sector")
public void user_verify_the_proceed_if_limit_exceeds_checked_under_eco_sector() throws  Throwable{
	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.proceedIfLimitExceedFlagInUpdateAfterApprove());
    seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.proceedIfLimitExceedFlagInUpdateAfterApprove());
    seleniumAction.getJavascriptHelper().scrollIntoView(CSMTransactionObj.proceedIfLimitExceedFlagInUpdateAfterApprove());
    seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.proceedIfLimitExceedFlagInUpdateAfterApprove());
   
}

	 

	    @And("^user click add icon under Eco sector limit$")
	    public void user_click_add_icon_under_eco_sector_limit() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.addIconInEcoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.addIconInEcoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.addIconInEcoSectorLimit());
	    }

	    @And("^user enter eco sector value$")
	    public void user_enter_eco_sector_value() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.ecoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.ecoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.ecoSectorLimit());
	        CSMTransactionObj.ecoSectorLimit().sendKeys(testData.get("Ecosector-limit"));
	    }

	 

	    @And("^user enter transaction value under Eco sector$")
	    public void user_enter_transaction_value_under_eco_sector() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.transactionInEcoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.transactionInEcoSectorLimit());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.transactionInEcoSectorLimit());
	        CSMTransactionObj.transactionInEcoSectorLimit().sendKeys(testData.get("TRXType_D1"));
	        
	    }

	 

	    @And("^user enter deposit limit value under Eco sector$")
	    public void user_enter_deposit_limit_value_under_eco_sector() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.depositLimitInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.depositLimitInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.depositLimitInUpdateAfterApprove());
	        CSMTransactionObj.depositLimitInUpdateAfterApprove().sendKeys(testData.get("DepositLimit"));
	    }

	    @And("^user enter withdraw limit value under Eco sector$")
	    public void user_enter_withdraw_limit_value_under_eco_sector() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.withdrawalLimitInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.withdrawalLimitInUpdateAfterApprove());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.withdrawalLimitInUpdateAfterApprove());
	        CSMTransactionObj.withdrawalLimitInUpdateAfterApprove().sendKeys(testData.get("WithdrawLimit"));
	    }
	    @And("^user enter the value in user id under approve screen$")
	    public void user_enter_the_value_in_user_id_under_approve_screen() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.userIdInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.userIdInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.userIdInApproveScreen());
	        CSMTransactionObj.userIdInApproveScreen().sendKeys(testData.get("User_Id"));
	        CSMTransactionObj.userIdInApproveScreen().sendKeys(Keys.ENTER);
	    }

	 

	    @And("^user retrieve the selected user id under approve screen$")
	    public void user_retrieve_the_selected_user_id_under_approve_screen() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.doubleClickRecordInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.doubleClickRecordInApproveScreen());
	        seleniumAction.getClickAndActionsHelper().doubleClick(CSMTransactionObj.doubleClickRecordInApproveScreen());
	    }

//	    @Then("^user verify the stopper message popup$")
//	    public void user_verify_the_stopper_message_popup() throws Throwable {
//	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.validatePopupInEcoSector());
//	        Assert.assertTrue(CSMTransactionObj.validatePopupInEcoSector().isDisplayed());
//	    }

	 
	  
	    @And("^user select the row for delete the record$")
	    public void user_select_the_row_for_delete_the_record() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.selectRowForDeleteInEcoSector());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.selectRowForDeleteInEcoSector());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.selectRowForDeleteInEcoSector());
	    }

	    @And("^user delete the inserted record under Eco sector$")
	    public void user_delete_the_inserted_record_under_eco_sector() throws Throwable {
	        seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.deleteButtonInEcoSector());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.deleteButtonInEcoSector());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.deleteButtonInEcoSector());
	    }
	    
	    @Given("User Vaildate the Cannot proceed Msg for117")
	    public void user_vaildate_the_cannot_proceed_msg() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver, CSMTransactionObj.CSM_cannotproceed_msg117());
	        Assert.assertTrue(CSMTransactionObj.CSM_cannotproceed_msg117().isDisplayed());
	    
	    }
	    
	    
	    @And("^User_612 Enter the Branch Code in CreditAc in Maintenance Screen$")
	    public void user_enter_the_branch_code_in_creditac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_BranchCodeInCreditAcMInput_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_BranchCodeInCreditAcMInput_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_BranchCodeInCreditAcMInput_612());
	        CSMTransactionObj.CSM_BranchCodeInCreditAcMInput_612().sendKeys(testData.get("BranchCode_D2"));
	        CSMTransactionObj.CSM_BranchCodeInCreditAcMInput_612().sendKeys(Keys.TAB);
	    }

	    @And("^User_612 Enter Currency Code in CreditAc in Maintenance Screen$")
	    public void user_enter_currency_code_in_creditac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_CurrencyCodeCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CurrencyCodeCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CurrencyCodeCreditAcInput_612());
	        CSMTransactionObj.CSM_CurrencyCodeCreditAcInput_612().sendKeys(testData.get("CurrencyCode_D2"));
	        CSMTransactionObj.CSM_CurrencyCodeCreditAcInput_612().sendKeys(Keys.TAB);
	    }
	    
	    @And("^User_612 Enter GL Code in CreditAc in Maintenance Screen$")
	    public void user_enter_gl_code_in_creditac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_GLCodeCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_GLCodeCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_GLCodeCreditAcInput_612());
	        CSMTransactionObj.CSM_GLCodeCreditAcInput_612().sendKeys(testData.get("GLCode_D2"));
	        CSMTransactionObj.CSM_GLCodeCreditAcInput_612().sendKeys(Keys.TAB);
	    }
	    
	    @And("^User_612 Enter CIF Code in CreditAc in Maintenance Screen$")
	    public void user_enter_cif_code_in_creditac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_CIFCodeInCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_CIFCodeInCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_CIFCodeInCreditAcInput_612());
	        CSMTransactionObj.CSM_CIFCodeInCreditAcInput_612().sendKeys(testData.get("CIFCode_D2"));
	       CSMTransactionObj.CSM_CIFCodeInCreditAcInput_612().sendKeys(Keys.TAB);
	      
	    }

	    @And("^User_612 Enter Serial in CreditAc in Maintenance Screen$")
	    public void user_enter_serial_in_creditac_in_maintenance_screen() throws Throwable {
	    	seleniumAction.getWaitHelper().waitForElementwithFluentwait(driver,CSMTransactionObj.CSM_SerialInCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().moveToElement(CSMTransactionObj.CSM_SerialInCreditAcInput_612());
	        seleniumAction.getClickAndActionsHelper().clickOnElement(CSMTransactionObj.CSM_SerialInCreditAcInput_612());
	        CSMTransactionObj.CSM_SerialInCreditAcInput_612().sendKeys(testData.get("SerialNo_D2"));
	        CSMTransactionObj.CSM_SerialInCreditAcInput_612().sendKeys(Keys.TAB);
	    }

}
