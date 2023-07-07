package stepdefinitions;

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
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.AmendTransferAccountRecord;
import resources.BaseClass;

public class TransferAmendAccountRecord {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
    ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
    ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
    ConfigFileReader configFileReader =  new ConfigFileReader();
    CSMLogin login = new CSMLogin(driver);
    Selenium_Actions seleniumActions = new Selenium_Actions(driver);
    AmendTransferAccountRecord AmendTransferAccountRecordobj = new AmendTransferAccountRecord(driver);
    DropDownHelper dropDownHelper = new DropDownHelper(driver);
    JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
    String path = System.getProperty("User_0072_0072.dir") +"\\TestData\\CSMparamTestData.xlsx";
	  ExcelData CsmTransactionExcelData = new ExcelData(path,"CSM_Transactions_TestData","DataSet ID");
	  Map<String, String> testData;
	  
	  @Given("User_0072 Login to CSM Param in Transfer Account")
		public void User_0072_0072_login_to_csm_param_in_transfer_account()throws Throwable {
			driver.get(configFileReader.getCSMApplicationUrl());
			login.loginIntoCSMParamApplication();
		}

		 

		@And("User_0072 click the Parameters in Transfer Account$")
		public void User_0072_0072_click_the_parameters_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.Parameterbutton(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.Parameterbutton());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.Parameterbutton());
			
		}

		 

		@And("User_0072 click the System Parameters in Transfer Account")
		public void User_0072_0072_click_the_system_parameters_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.SystemParametersbutton(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.SystemParametersbutton());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.SystemParametersbutton());
			
		}

		 

		@And("User_0072 Click the Control Record in Transfer Account")
		public void User_0072_0072_click_the_control_record_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.ControlRecord_Tranfer72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.ControlRecord_Tranfer72());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.ControlRecord_Tranfer72());
			
		}

		 

		@And("User_0072 Click the Update after Approve")
		public void User_0072_0072_click_the_update_after_approve()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.UpdateAfterApprove_Transaferbranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.UpdateAfterApprove_Transaferbranch());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.UpdateAfterApprove_Transaferbranch());
			
		}

		 

		@And("User_0072 Click the Alert Activation in Transfer Account$")
		public void User_0072_0072_click_the_alert_activation_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.AlertActivation_transferBranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.AlertActivation_transferBranch());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.AlertActivation_transferBranch());
			
		}

		 

		@And("User_0072 Click the No Access Privilege button")
		public void User_0072_0072_click_the_no_access_privilege_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.NoAccessprivilege_transfer72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.NoAccessprivilege_transfer72());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.NoAccessprivilege_transfer72());
			
		}

		 

		@And("User_0072 Click the Submit Update After Aprrove button")
		public void User_0072_0072_click_the_submit_update_after_aprrove_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.UpdateAfterApprove_TransaferSubmit(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.UpdateAfterApprove_TransaferSubmit());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.UpdateAfterApprove_TransaferSubmit());
			
		}

		 

		@And("User_0072 Click the ok button Popup menu")
		public void User_0072_0072_click_the_ok_button_popup_menu()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.Confirmokbutton72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.Confirmokbutton72());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.Confirmokbutton72());
		}

		 

		@And("User_0072 Click the Success button in Popup menu")
		public void User_0072_0072_click_the_success_button_in_popup_menu()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.Popupsuccessmsgbutton72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.Popupsuccessmsgbutton72());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.Popupsuccessmsgbutton72());
		}

		@And("User_0072 Click the transfer Branch creation uncheck button")

		public void User_0072_0072_click_the_transfer_branch_creation_uncheck_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.AlertActivation_transferBranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.AlertActivation_transferBranch());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.AlertActivation_transferBranch());
		}

		 

		@And("User_0072 Click the Transfer Cancellation uncheck button")

		public void User_0072_0072_click_the_transfer_cancellation_uncheck_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.TransactionCancellation_Uncheckbutton072(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.TransactionCancellation_Uncheckbutton072());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.TransactionCancellation_Uncheckbutton072());

		}

		 

		@And("User_0072 Click the No Access Privelege uncheck button")

		public void User_0072_0072_click_the_no_access_privelege_uncheck_button()throws Throwable {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.NoAccessprivelegeUncheckbutton_072(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.NoAccessprivelegeUncheckbutton_072());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.NoAccessprivelegeUncheckbutton_072());

		}
		@Given("User_0072 Enter the Transfer creation process uncheck")

		public void User_0072_enter_the_transfer_creation_process_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.TransferBatchCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.TransferBatchCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.TransferBatchCreationAccount());

		}

		 

		@Given("User_0072 Enter the Cancel process in uncheck")

		public void User_0072_enter_the_cancel_process_in_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.TransferCancellationCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.TransferCancellationCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.TransferCancellationCreationAccount());

		}

		 

		@Given("User_0072 Enter the Privilege Access process uncheck")

		public void User_0072_enter_the_privilege_access_process_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.TransferNoAccessCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.TransferNoAccessCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.TransferNoAccessCreationAccount());


		}

		 

		@Given("User_0072 click the Approve button in Tansfer Account")

		public void User_0072_click_the_approve_button_in_tansfer_account() {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.ApprovebuttonAlert(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.ApprovebuttonAlert());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.ApprovebuttonAlert());

		}

		 

		@Given("User_0072 click submit Approve Box in Transfer Account")

		public void User_0072_click_submit_approve_box_in_transfer_account() {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, AmendTransferAccountRecordobj.SubmitApproveAlert(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.SubmitApproveAlert());  
			ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.SubmitApproveAlert());

		}
	  @And("^User_0072 click on Date to Change the Current Date in the CSM core application$")
      public void User_0072_0072ClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMDateToChangeTheCurrentDate());
      }

      @And("^User_0072 Enters the Date in User_0072_0072 Running Date in the CSM core application$")
      public void User_0072_0072EntersTheDateInUser_0072_0072RunningDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMDateInUserRunningDate());
          AmendTransferAccountRecordobj.CSMDateInUserRunningDate().clear();
          //AmendTransferAccountRecordobj.CSMDateInUser_0072_0072RunningDate().sendKeys(testData.get("Dates"));
          DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate date =LocalDate.now();
          String format = date.format(dtFormatter);
          AmendTransferAccountRecordobj.CSMDateInUserRunningDate().sendKeys(format);
     }

      @And("^User_0072 click on Use Button in Change Running Date Popup in the CSM core application$")
      public void User_0072_0072ClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMUseButtonInChangeRunningDate());
     }

      @And("^User_0072 click Ok Button in Information PopUp menu in the CSM core application$")
      public void User_0072_0072ClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
    	  ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMOkButtonInAccessDeniedPopUpMenu());
     }
      
      
      @And("User_0072 Click Ok Button for confirmation PopUp for Company Holiday")
      public void User_0072_0072_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
      	for (int i = 0; i < 50; i++) {

              try {

                  if (AmendTransferAccountRecordobj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
                      waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      break;
                 }            
                } catch (Exception e)
              {
//              	  if (i==49) {
//    					Assert.fail(e.getMessage());
//    				}  
              }
          }
        }
      

      @And("^User_0072 click on Close Button in Change Running Date Popup in the CSM core application$")
      public void User_0072_0072ClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMCloseButtonInChangeRunningDate());
     }

      @And("^User_0072 click on Technical Details Icon in the CSM core application$")
      public void User_0072_0072ClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMTechnicalDetailsIcon());
     }

      @And("^User_0072 click Clear Cache in Technical Details Icon in the CSM core application$")
      public void User_0072_0072ClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
//    	  waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	  for (int i = 0; i < 200; i++) {
    		  try {
    			  ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
			
		}
    	  

      }

      @And("^User_0072 click Ok Button Under Information PopUp Menu in the CSM core application$")
      public void User_0072_0072ClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMOkButtonUnderInformationPopUp());

      }
      @And("User_0072 click TransferAccount field on CSMCore")
  	public void User_0072_click_transfer_account_field_on_csm_core() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccounts());

  		ClicksAndActionsHelperobj.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccounts());
  		ClicksAndActionsHelperobj.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccounts());

  	}

  	@And("User_0072 click maintenance field under TransferAccount")
  	public void User_0072_click_maintenance_field_under_transfer_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintanance());

  	}

  	@And("User_0072 enter the TransferType under maintanence screen")
  	public void User_0072_enter_the_transfer_type_under_maintanence_screen() {
  		// JavascriptHelper.scrollIntoView(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType());

  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType());
  		ClicksAndActionsHelperobj
  		.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType());
  ClicksAndActionsHelperobj
  		.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType());
  System.out.println("dropdown "+testData.get("DropDown"));
  		dropDownHelper.SelectUsingVisibleText(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType(),
  				testData.get("DropDown"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTransferType().sendKeys(Keys.ENTER);

  	}

  	@And("User_0072 enter the Reason under maintanence screen")
  	public void User_0072_enter_the_reason_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceReason());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(testData.get("Reason"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(Keys.ENTER);

  	}

  	@And("User_0072 enter the Destination Branch under maintanence screen")
  	public void User_0072_enter_the_destination_branch_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
  				.sendKeys(testData.get("DestinationBranch"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.ENTER);

  	}

  	@And("User_0072 enter the BranchCode under FromAccount")
  	public void User_0072_enter_the_branch_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode()
  				.sendKeys(testData.get("BranchCodeFA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the CurrencyCode under FromAccount")
  	public void User_0072_enter_the_currency_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(testData.get("CYCodeFA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the GLCode under FromAccount")
  	public void User_0072_enter_the_gl_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(testData.get("GLCodeFA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(Keys.TAB);
  	}

  	@And("User_0072 enter the CIFCode under FromAccount")
  	public void User_0072_enter_the_cif_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(testData.get("CIFCodeFA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the SerialNumber under FromAccount")
  	public void User_0072_enter_the_serial_number_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(testData.get("SLCodeFA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the BranchCode under TOAccount")
  	public void User_0072_enter_the_branch_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode()
  				.sendKeys(testData.get("BranchCodeTA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the CurrencyCode under TOAccount")
  	public void User_0072_enter_the_currency_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(testData.get("CYCodeTA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the GLCode under TOAccount")
  	public void User_0072_enter_the_gl_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(testData.get("GLCodeTA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the CIFCode under TOAccount")
  	public void User_0072_enter_the_cif_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(testData.get("CIFCodeTA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_0072 enter the SerialNumber under TOAccount")
  	public void User_0072_enter_the_serial_number_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(testData.get("SLCodeTA"));
  		AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(Keys.TAB);

  	}
  	
  	@And("User_0072 click the retrive button under maintenance screen")
  	public void User_0072_click_the_retrive_button_under_maintenance_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  	}

  	@And("User_0072 select the Record under TransferManagement screen")
  	public void User_0072_select_the_record_under_transfer_management_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceRecordselecting());

  	}

  	@And("User_0072 click the Save button under maintanance screen")
  	public void CSMCoreTransferAccountsMaintananceSaveButton() {
  		JavascriptHelper.scrollIntoView(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		waitHelper.waitForElementwithFluentwait(driver,
  				AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsMaintananceSaveButton());

  	}
  	@And("User_0072 click the Transfer field under TransferAccount field")
	public void user_click_the_transfer_field_under_transfer_account_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransfer());

	}

	@And("User_0072 enter the Record in Transfer field")
	public void user_enter_the_record_in_transfer_field() {
		//waitHelper.waitForElementwithFluentwait(driver,AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				
				JavascriptHelper.scrollIntoView(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord());
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(testData.get("GLCodeFA"));
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		

	}

	@And("User_0072 click the Transfer button under Transfer field")
	public void user_click_the_transfer_button_under_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());

	}
	@And("User_0072 click the Approve field under TransferAccount field")
	public void user_click_the_approve_field_under_transfer_account_field() {

		waitHelper.waitForElementwithFluentwait(driver,
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsApprove());
	}

	@And("User_0072 enter the Record in Approve field")
	public void user_enter_the_record_in_approve_field() {
//		waitHelper.waitForElementwithFluentwait(driver,
//				AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord()
						.sendKeys(testData.get("GLCodeFA"));
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(Keys.ENTER);
				break;
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	
	@And("User_0072 double click the record in approve field")
	public void user_double_click_the_record_in_approve_field() {
	    
	}
	@And("User_0072 double click the record in Transfer field")
	public void user_double_click_the_record_in_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.moveToElement(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.doubleClick(AmendTransferAccountRecordobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());

	}



}