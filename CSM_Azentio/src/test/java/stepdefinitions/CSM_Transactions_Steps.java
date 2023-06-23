package stepdefinitions;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_Param_Transaction_OBJ;
import pageobjects.CSM_TransactionOnStaffAccount_Obj;
import resources.BaseClass;

public class CSM_Transactions_Steps {
	
	WebDriver driver = BaseClass.driver;
    ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
    CSMLogin login = new CSMLogin(driver);
    Selenium_Actions seleniumActions = new Selenium_Actions(driver);
    CSM_Param_Transaction_OBJ csmTransactionObject = new CSM_Param_Transaction_OBJ(driver);
    UserUtility_614 userUtility = new UserUtility_614();
    String path = System.getProperty("user.dir") +"\\TestData\\CSMparamTestData.xlsx";
	  ExcelData csmTransactionsStaffAccountExcelData = new ExcelData(path,"CSM_Transactions_TestData","DataSet ID");
	  Map<String, String> testData;
	  
	  @Given("^user Navigate to CSM Params application and login with valid credentials$")
	    public void UserNavigateToCsmParamsApplicationAndLoginWithValidCredentials() throws IOException 
	  {
		  driver.get(ConfigFileReaderobj.getCSMparamsUrl());
	      login.loginIntoCSMParamApplication("CSMParamUser1");
	  }
	  @Given("user update test data set id for TRS_218")
	    public void user__update_test_data_set_id_for_trs_218() throws Throwable {
		  testData = csmTransactionsStaffAccountExcelData.getTestdata("TRS_218_D1");
	  }
	  @And("^user click the parameters menu$")
	  public void user_click_the_parameters_menu() throws Throwable {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParametersMenu());
		  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParametersMenu());
		  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParametersMenu());
	  }
	  @Given("user navigate to account parameters")
	  public void user_navigate_to_account_parameters() {
	      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamAccountParameter());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamAccountParameter());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamAccountParameter());
	  }
	  @Then("user navigate to general ledger under account parameters")
	  public void user_navigate_to_general_ledger_under_account_parameters() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledger());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledger());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledger());
	  }
	  @Then("user click the Update after approve in general ledger flag")
	  public void user_click_the_update_after_approve_in_general_ledger_flag() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerUpdateafterapprove());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerUpdateafterapprove());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerUpdateafterapprove());
	  }
	  @Then("user enter the code in the code column under update after approve")
	  public void user_enter_the_code_in_the_code_column_under_update_after_approve() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgercode());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgercode());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgercode());
	      csmTransactionObject.csmParamGeneralledgercode().sendKeys(testData.get("GLCode_Debit"));
	      csmTransactionObject.csmParamGeneralledgercode().sendKeys(Keys.ENTER);
	  }
	  @Then("user double click the entered code to view the details in update after approve screen")
	  public void user_double_click_the_entered_code_to_view_the_details_in_update_after_approve_screen() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgercodedoubleclick());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgercodedoubleclick());
	      seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionObject.csmParamGeneralledgercodedoubleclick());
	  }
	  @Then("user click the additional details button in the update after approve")
	  public void user_click_the_additional_details_button_in_the_update_after_approve() {
		  for (int i = 0; i < 200; i++) {
			  try {
				  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgercodeadditionaloptions());
			      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgercodeadditionaloptions());
			      break;
			} catch (Exception e) {
				if (i == 199) {
					Assert.fail(e.getMessage());
				// TODO: handle exception
			}
			
			}
		  }
	  }
	  @Then("user select the dropdown values under allow overdraw option")
	  public void user_select_the_dropdown_values_under_allow_overdraw_option() {
		  seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown());
			// dropDownHelper.SelectUsingVisibleText(csmChequebookObject.csmParam_General_ledger_code_additionaloptions_dropdown(),
			// testData.get("Allow_Overdraw") );
		  seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown(), "Notify and Proceed");
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown());
		  seleniumActions.getDropDownHelper().SelectUsingVisibleText(csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown(),testData.get("Allow_Overdraw"));
		  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown());
		  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgercodeadditionaloptionsdropdown());
	  }
	  @Given("user click the update button to save the record in update after approve screen")
	  public void user_click_the_update_button_to_save_the_record_in_update_after_approve_screen() {
	      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerupadatebutton());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerupadatebutton());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerupadatebutton());
	  }
      @Then("user click the ok popup to close the confirmation box")
	  public void user_click_the_ok_popup_to_close_the_confirmation_box() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionTrxsuccesspopupOkbtn());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionTrxsuccesspopupOkbtn());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionTrxsuccesspopupOkbtn());
	  }

	  @Then("user click the approve in general ledger")
	  public void user_click_the_approve_in_general_ledger() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerApprove());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerApprove());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerApprove());
	  }

	  @Then("user enter the code in the code column in approve flag")
	  public void user_enter_the_code_in_the_code_column_in_approve_flag() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerApproveinputfield());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerApproveinputfield());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerApproveinputfield());
	      csmTransactionObject.csmParamGeneralledgerApproveinputfield().sendKeys(testData.get("GLCode_Debit"));
	      csmTransactionObject.csmParamGeneralledgerApproveinputfield().sendKeys(Keys.ENTER);
	      
	  }

	  @Then("user double click the entered code to view the details in approve screen")
	  public void user_double_click_the_entered_code_to_view_the_details_in_approve_screen() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclick());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclick());
	      seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclick());
	  }

	  @Then("user click the approve button to save the record in approve screen")
	  public void user_click_the_approve_button_to_save_the_record_in_approve_screen() {
		  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApprove());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApprove());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApprove());
	  }
      @Then("user click the ok button in the confirmation box to save the record")
	  public void user_click_the_ok_button_in_the_confirmation_box_to_save_the_record() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApproveOK());
	      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApproveOK());
	      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamGeneralledgerApproveinputfielddoubleclickApproveOK());
	  }
      @And("^user click the system parameters submenu$")
      public void user_click_the_system_parameters_submenu() throws Throwable {
    	  seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionObject.csmParametersSystemParameters());
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParametersSystemParameters());                    
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParametersSystemParameters());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParametersSystemParameters());
      }
      @And("^user click on the transaction type under the system parameters$")
      public void UserClickOnTheTransactionTypeUnderTheSystemParameters() {
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmSystemParametersTransactionType());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmSystemParametersTransactionType());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmSystemParametersTransactionType());
      }
      @And("^user click on the update after approve field under the transaction type$")
      public void UserClickOnTheUpdateAfterApproveFieldUnderTheTransactionType() {
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmSystemParametersTransactionTypeUA());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmSystemParametersTransactionTypeUA());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmSystemParametersTransactionTypeUA());
      }
      @And("^user enters the transaction type code in the code column under the update after approve$")
      public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheUpdateAfterApprove() {
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmSystemParametersTransactionTypeUACodeInput());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmSystemParametersTransactionTypeUACodeInput());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmSystemParametersTransactionTypeUACodeInput());
          csmTransactionObject.csmSystemParametersTransactionTypeUACodeInput().sendKeys(testData.get("TRXType_D1"));
          csmTransactionObject.csmSystemParametersTransactionTypeUACodeInput().sendKeys(Keys.ENTER);
      }

      @And("^user double clicks on the entered transaction type code from the list to view the transaction type details$")
      public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetails() {
          for (int i = 0; i < 50; i++) {
              try {
            	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmSystemParametersTransactionTypeUACodeDoubleClick());
            	  seleniumActions.getClickAndActionsHelper().doubleClick(csmTransactionObject.csmSystemParametersTransactionTypeUACodeDoubleClick());
//                   userUtility.doubleClickOnElement(seleniumActions, driver,csmTransactionObject.csmSystemParametersTransactionTypeUACodeDoubleClick());
                  break;
                } catch (Exception e) {
                  if (i == 49) {
                      Assert.fail(e.getMessage());
                  }
              }
          }
       }
      
      @And("User Check the ProceedOnInsufficientFund flag chequebox")
  	public void user_check_the_proceed_on_insufficient_fund_flag_chequebox() throws Throwable {
  		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
//      	clicksAndActionsHelper.moveToElement(csmChequebookObject.csmParam_Transactiontype_proceedoninsufficentfunds());
//          clicksAndActionsHelper.clickOnElement(csmChequebookObject.csmParam_Transactiontype_proceedoninsufficentfunds());

  		if (csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds().getAttribute("initialvalue").isBlank()) {
  			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
  			seleniumActions.getClickAndActionsHelper().clickUsingActionClass(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds(),csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
  	     } else {
  			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
  			seleniumActions.getClickAndActionsHelper().clickUsingActionClass(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds(),csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
  			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());
  			seleniumActions.getClickAndActionsHelper().clickUsingActionClass(csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds(),csmTransactionObject.csmParamTransactiontypeproceedoninsufficentfunds());

  		}
  	}
      
      @And("^user click on the update after approve button to save the changes$")
      public void UserClickOnTheUpdateAfterApproveButtonToSaveTheChanges() {
      seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionObject.csmParamTransactiontypeProceedOnInsufficentFundsUPAButton());
      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamTransactiontypeProceedOnInsufficentFundsUPAButton());
      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeProceedOnInsufficentFundsUPAButton());
      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamTransactiontypeProceedOnInsufficentFundsUPAButton());
      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionTypeConfirmOkButton());
      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionTypeConfirmOkButton());
      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionTypeConfirmOkButton());
      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionTypeSuccessOkButton());
      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionTypeSuccessOkButton());
      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionTypeSuccessOkButton());
}
      
      @And("^user click on the approve field under the transaction type menu$")
  	public void user_click_approve_field_under_transactiontype() throws Throwable {
  		for (int i = 0; i < 200; i++) {
  			try {
  				
  					seleniumActions.getJavascriptHelper().scrollIntoView(csmTransactionObject.csmParamTransactiontypeApprovefield());
  					seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeApprovefield());
  					seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamTransactiontypeApprovefield());
  					break;
  			} catch (Exception e) {
  				if (i==199) {
                      Assert.fail(e.getMessage());
                  }
  			}
  		}
     }
     
      @And("^user enters the transaction type code in the code column under the approve menu$")
      public void UserEntersTheTransactionTypeCodeInTheCodeColumnUnderTheApproveMenu() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionTypeApproveScreenCodeInput());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionTypeApproveScreenCodeInput());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionTypeApproveScreenCodeInput());
    	  csmTransactionObject.csmTransactionTypeApproveScreenCodeInput().sendKeys(testData.get("TRXType_D1"));
    	  csmTransactionObject.csmTransactionTypeApproveScreenCodeInput().sendKeys(Keys.ENTER);
      }
      
      @And("^user double clicks on the entered transaction type code from the list to view the transaction type details in approve screen$")
      public void UserDoubleClicksOnTheEnteredTransactionTypeCodeFromTheListToViewTheTransactionTypeDetailsInApproveScreen() {
          userUtility.doubleClickOnElement(seleniumActions, driver, csmTransactionObject.csmTransactionTypeApproveScreenCodeInputDoubleClick());
      }
      
      @And("^user click on the approve button to approve the changes$")
      public void UserClickOnTheApproveButtonToApproveTheChanges() {
//          javascriptHelper.scrollIntoView(CSMParamTransactionOBJ.csmTransactionTypeApproveScreenApproveButton());
          userUtility.scrollDownTillEnd(driver);
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmParamTransactiontypeApproveInputfieldDoubleclickApprove());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmParamTransactiontypeApproveInputfieldDoubleclickApprove());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmParamTransactiontypeApproveInputfieldDoubleclickApprove());
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionTypeConfirmOkButton());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionTypeConfirmOkButton());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionTypeConfirmOkButton());
          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionTypeSuccessOkButton());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionTypeSuccessOkButton());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionTypeSuccessOkButton());
      }
      
      @Given("^user Navigate to CSM core application and login with valid credentials$")
      public void UserNavigateToCsmCoreApplicationAndLoginWithValidCredentials() throws IOException {
    	  driver.get(ConfigFileReaderobj.getCSMApplicationUrl());
          login.loginIntoCSMApplication("CSMUser1");
      }
      
      @And("^user click on Date to Change the Current Date in the CSM core application$")
      public void UserClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {

          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMDateToChangeTheCurrentDate());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMDateToChangeTheCurrentDate());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMDateToChangeTheCurrentDate());
      }

      @And("^user Enters the Date in user Running Date in the CSM core application$")
      public void UserEntersTheDateInUserRunningDateInTheCsmcoreApplication() {

          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMDateInUserRunningDate());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMDateInUserRunningDate());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMDateInUserRunningDate());
          csmTransactionObject.CSMDateInUserRunningDate().clear();
          //CSMTransactionObject.CSMDateInUserRunningDate().sendKeys(testData.get("Dates"));
          DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate date =LocalDate.now();
          String format = date.format(dtFormatter);
          csmTransactionObject.CSMDateInUserRunningDate().sendKeys(format);
     }

      @And("^user click on Use Button in Change Running Date Popup in the CSM core application$")
      public void UserClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMUseButtonInChangeRunningDate());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMUseButtonInChangeRunningDate());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMUseButtonInChangeRunningDate());
     }

      @And("^user click Ok Button in Information PopUp menu in the CSM core application$")
      public void UserClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
    	  userUtility.clickOnElement(seleniumActions, driver, csmTransactionObject.CSMOkButtonInAccessDeniedPopUpMenu());
     }
      
      @Given("User Click Ok Button for confirmation PopUp for Company Holiday")
      public void user_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
      	for (int i = 0; i < 50; i++) {

              try {

                  if (csmTransactionObject.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
                      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      break;
                 }            
                } catch (Exception e)
              {
              	  if (i==49) {
    					Assert.fail(e.getMessage());
    				}  
              }
          }
        }
      

      @And("^user click on Close Button in Change Running Date Popup in the CSM core application$")
      public void UserClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMCloseButtonInChangeRunningDate());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMCloseButtonInChangeRunningDate());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMCloseButtonInChangeRunningDate());
     }

      @And("^user click on Technical Details Icon in the CSM core application$")
      public void UserClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMTechnicalDetailsIcon());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMTechnicalDetailsIcon());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMTechnicalDetailsIcon());
     }

      @And("^user click Clear Cache in Technical Details Icon in the CSM core application$")
      public void UserClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
//    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSM_ClearCacheInTechnicalDetailsIcon());
    	  for (int i = 0; i < 200; i++) {
    		  try {
    			  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSM_ClearCacheInTechnicalDetailsIcon());
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
			
		}
    	  

      }

      @And("^user click Ok Button Under Information PopUp Menu in the CSM core application$")
      public void UserClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {

          seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,csmTransactionObject.CSMOkButtonUnderInformationPopUp());
          seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.CSMOkButtonUnderInformationPopUp());
          seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.CSMOkButtonUnderInformationPopUp());

      }
      @And("^user click on Transactions under CSM application in the CSM core application$")
		public void UserClickOnTransactionsUnderCsmApplicationInTheCsmCoreApplication() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsTransactions());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsTransactions());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsTransactions());
		}
      
      @And("^user click on Maintenance under Transactions in the CSM core application$")
		public void UserClickOnMaintenanceUnderTransactionsInTheCsmCoreApplication() {
    	  seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsMaintenanceScreen());
    	  seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsMaintenanceScreen());
    	  seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsMaintenanceScreen());
		}
		@And("^user enters the transaction type$")
		public void UserEntersTheTransactionType() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsTrxTypeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsTrxTypeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsTrxTypeInput());
			csmTransactionObject.transactionsTrxTypeInput().sendKeys(testData.get("TRXType_D1"));
			csmTransactionObject.transactionsTrxTypeInput().sendKeys(Keys.TAB);
		}
		@Given("user click random click")
		public void user_click_random_click() {
//		    seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.csmTransactionsMaintenanceRandomClick());
		    for (int i = 0; i < 200; i++) {
		    	try {
		    		seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.csmTransactionsMaintenanceRandomClick());
		 		    seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.csmTransactionsMaintenanceRandomClick());
				} catch (Exception e) {
					if (i==199) {
						Assert.fail(e.getMessage());
					}
					// TODO: handle exception
				}
				
			}
		}

		@And("^user Enter the Branch Code for AC1 in Maintenance Screen$")
		public void UserEnterTheBranchCodeForAc1InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDepositAccBranchcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDepositAccBranchcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDepositAccBranchcodeInput());
			csmTransactionObject.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("BranchCode_Debit"));
			csmTransactionObject.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter Currency Code for AC1 in Maintenance Screen$")
		public void UserEnterCurrencyCodeForAc1InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDepositAccBranchcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDepositAccBranchcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDepositAccBranchcodeInput());
			csmTransactionObject.transactionsDepositAccBranchcodeInput().sendKeys(testData.get("CurrencyCode_Debit"));
			csmTransactionObject.transactionsDepositAccBranchcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter GL Code for AC1 in Maintenance Screen$")
		public void UserEnterGlCodeForAc1InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDebitAccGlcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDebitAccGlcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDebitAccGlcodeInput());
			csmTransactionObject.transactionsDebitAccGlcodeInput().sendKeys(testData.get("GLCode_Debit"));
			csmTransactionObject.transactionsDebitAccGlcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter CIF Code for AC1 in Maintenance Screen$")
		public void UserEnterCifCodeForAc1InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDebitAccCifcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDebitAccCifcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDebitAccCifcodeInput());
			csmTransactionObject.transactionsDebitAccCifcodeInput().sendKeys(testData.get("CIFCode_Debit"));
			csmTransactionObject.transactionsDebitAccCifcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter Serial for AC1 in Maintenance Screen$")
		public void UserEnterSerialForAc1InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDebitAccSerialcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDebitAccSerialcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDebitAccSerialcodeInput());
			csmTransactionObject.transactionsDebitAccSerialcodeInput().sendKeys(testData.get("SerialNo_Debit"));
			csmTransactionObject.transactionsDebitAccSerialcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user click Ok Button in Warning PopUp Menu$")
		public void UserClickOkButtonInWarningPopupMenu() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsWarningOkbtn());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsWarningOkbtn());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsWarningOkbtn());
		}
		@And("^user Enter the Currency in Maintenance Screen$")
		public void UserEnterTheCurrencyInMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsCreditAccCurrencyInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsCreditAccCurrencyInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsCreditAccCurrencyInput());
			csmTransactionObject.transactionsCreditAccCurrencyInput().sendKeys(testData.get("CurrencyCode_Debit"));
			csmTransactionObject.transactionsCreditAccCurrencyInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter the Amount in Maintenance Screen$")
		public void UserEnterTheAmountInMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsEnterAmountInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsEnterAmountInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsEnterAmountInput());
			csmTransactionObject.transactionsEnterAmountInput().sendKeys(testData.get("Amount"));
			csmTransactionObject.transactionsEnterAmountInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter Currency Code for AC2 in Maintenance Screen$")
		public void UserEnterCurrencyCodeForAc2InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsDebitAccCurrencycodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsDebitAccCurrencycodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsDebitAccCurrencycodeInput());
			csmTransactionObject.transactionsDebitAccCurrencycodeInput().sendKeys(testData.get("CurrencyCode_Credit"));
			csmTransactionObject.transactionsDebitAccCurrencycodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter GL Code for AC2 in Maintenance Screen$")
		public void UserEnterGlCodeForAc2InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsCreditAccGlcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsCreditAccGlcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsCreditAccGlcodeInput());
			csmTransactionObject.transactionsCreditAccGlcodeInput().sendKeys(testData.get("GLCode_Credit"));
			csmTransactionObject.transactionsCreditAccGlcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter CIF Code for AC2 in Maintenance Screen$")
		public void UserEnterCifCodeForAc2InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsCreditAccCifcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsCreditAccCifcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsCreditAccCifcodeInput());
			csmTransactionObject.transactionsCreditAccCifcodeInput().sendKeys(testData.get("CIFCode_Credit"));
			csmTransactionObject.transactionsCreditAccCifcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user Enter Serial for AC2 in Maintenance Screen$")
		public void UserEnterSerialForAc2InMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsCreditAccSerialcodeInput());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsCreditAccSerialcodeInput());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsCreditAccSerialcodeInput());
			csmTransactionObject.transactionsCreditAccSerialcodeInput().sendKeys(testData.get("SerialNo_Credit"));
			csmTransactionObject.transactionsCreditAccSerialcodeInput().sendKeys(Keys.TAB);
		}
		@And("^user click Save Button in Maintenance Screen$")
		public void UserClickSaveButtonInMaintenanceScreen() {
			seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmTransactionObject.transactionsMaintanceSavebtn());
			seleniumActions.getClickAndActionsHelper().moveToElement(csmTransactionObject.transactionsMaintanceSavebtn());
			seleniumActions.getClickAndActionsHelper().clickOnElement(csmTransactionObject.transactionsMaintanceSavebtn());
		}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

}