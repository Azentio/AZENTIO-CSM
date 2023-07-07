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
import pageobjects.GLExceptionTransferAccount;
import resources.BaseClass;

public class AccountGLTransferprocess {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
    ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
    ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
    ConfigFileReader configFileReader =  new ConfigFileReader();
    CSMLogin login = new CSMLogin(driver);
    Selenium_Actions seleniumActions = new Selenium_Actions(driver);
    GLExceptionTransferAccount GLExceptionTransferAccountobj = new GLExceptionTransferAccount(driver);
    DropDownHelper dropDownHelper = new DropDownHelper(driver);
    JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
    String path = System.getProperty("User_inin72_0072.dir") +"\\TestData\\CSMparamTestData.xlsx";
	  ExcelData CsmTransactionExcelData = new ExcelData(path,"CSM_Transactions_TestData","DataSet ID");
	  Map<String, String> testData;
	  
	  @Given("User_inin72 Login to CSM Param in Transfer Account")
		public void User_inin72_0072_login_to_csm_param_in_transfer_account()throws Throwable {
			driver.get(configFileReader.getCSMApplicationUrl());
			login.loginIntoCSMParamApplication();
		}

		 

		@And("User_inin72 click the Parameters in Transfer Account$")
		public void User_inin72_0072_click_the_parameters_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.Parameterbutton(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.Parameterbutton());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.Parameterbutton());
			
		}

		 

		@And("User_inin72 click the System Parameters in Transfer Account")
		public void User_inin72_0072_click_the_system_parameters_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.SystemParametersbutton(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.SystemParametersbutton());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.SystemParametersbutton());
			
		}

		 

		@And("User_inin72 Click the Control Record in Transfer Account")
		public void User_inin72_0072_click_the_control_record_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.ControlRecord_Tranfer72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.ControlRecord_Tranfer72());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.ControlRecord_Tranfer72());
			
		}

		 

		@And("User_inin72 Click the Update after Approve")
		public void User_inin72_0072_click_the_update_after_approve()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.UpdateAfterApprove_Transaferbranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.UpdateAfterApprove_Transaferbranch());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.UpdateAfterApprove_Transaferbranch());
			
		}

		 

		@And("User_inin72 Click the Alert Activation in Transfer Account$")
		public void User_inin72_0072_click_the_alert_activation_in_transfer_account()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.AlertActivation_transferBranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.AlertActivation_transferBranch());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.AlertActivation_transferBranch());
			
		}

		 

		@And("User_inin72 Click the No Access Privilege button")
		public void User_inin72_0072_click_the_no_access_privilege_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.NoAccessprivilege_transfer72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.NoAccessprivilege_transfer72());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.NoAccessprivilege_transfer72());
			
		}

		 

		@And("User_inin72 Click the Submit Update After Aprrove button")
		public void User_inin72_0072_click_the_submit_update_after_aprrove_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.UpdateAfterApprove_TransaferSubmit(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.UpdateAfterApprove_TransaferSubmit());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.UpdateAfterApprove_TransaferSubmit());
			
		}

		 

		@And("User_inin72 Click the ok button Popup menu")
		public void User_inin72_0072_click_the_ok_button_popup_menu()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.Confirmokbutton72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.Confirmokbutton72());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.Confirmokbutton72());
		}

		 

		@And("User_inin72 Click the Success button in Popup menu")
		public void User_inin72_0072_click_the_success_button_in_popup_menu()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.Popupsuccessmsgbutton72(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.Popupsuccessmsgbutton72());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.Popupsuccessmsgbutton72());
		}

		@And("User_inin72 Click the transfer Branch creation uncheck button")

		public void User_inin72_0072_click_the_transfer_branch_creation_uncheck_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.AlertActivation_transferBranch(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.AlertActivation_transferBranch());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.AlertActivation_transferBranch());
		}

		 

		@And("User_inin72 Click the Transfer Cancellation uncheck button")

		public void User_inin72_0072_click_the_transfer_cancellation_uncheck_button()throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.TransactionCancellation_Uncheckbutton072(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.TransactionCancellation_Uncheckbutton072());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.TransactionCancellation_Uncheckbutton072());

		}

		 

		@And("User_inin72 Click the No Access Privelege uncheck button")

		public void User_inin72_0072_click_the_no_access_privelege_uncheck_button()throws Throwable {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.NoAccessprivelegeUncheckbutton_072(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.NoAccessprivelegeUncheckbutton_072());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.NoAccessprivelegeUncheckbutton_072());

		}
		@Given("User_inin72 Enter the Transfer creation process uncheck")

		public void User_inin72_enter_the_transfer_creation_process_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.TransferBatchCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.TransferBatchCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.TransferBatchCreationAccount());

		}

		 

		@Given("User_inin72 Enter the Cancel process in uncheck")

		public void User_inin72_enter_the_cancel_process_in_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.TransferCancellationCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.TransferCancellationCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.TransferCancellationCreationAccount());

		}

		 

		@Given("User_inin72 Enter the Privilege Access process uncheck")

		public void User_inin72_enter_the_privilege_access_process_uncheck() {

			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.TransferNoAccessCreationAccount(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.TransferNoAccessCreationAccount());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.TransferNoAccessCreationAccount());


		}

		 

		@Given("User_inin72 click the Approve button in Tansfer Account")

		public void User_inin72_click_the_approve_button_in_tansfer_account() {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.ApprovebuttonAlert(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.ApprovebuttonAlert());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.ApprovebuttonAlert());

		}

		 

		@Given("User_inin72 click submit Approve Box in Transfer Account")

		public void User_inin72_click_submit_approve_box_in_transfer_account() {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, GLExceptionTransferAccountobj.SubmitApproveAlert(), 60, 2);
			ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.SubmitApproveAlert());  
			ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.SubmitApproveAlert());

		}
	  @And("^User_inin72 click on Date to Change the Current Date in the CSM core application$")
      public void User_inin72_0072ClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMDateToChangeTheCurrentDate());
      }

      @And("^User_inin72 Enters the Date in User_inin72_0072 Running Date in the CSM core application$")
      public void User_inin72_0072EntersTheDateInUser_inin72_0072RunningDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMDateInUserRunningDate());
          GLExceptionTransferAccountobj.CSMDateInUserRunningDate().clear();
          //GLExceptionTransferAccountobj.CSMDateInUser_inin72_0072RunningDate().sendKeys(testData.get("Dates"));
          DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate date =LocalDate.now();
          String format = date.format(dtFormatter);
          GLExceptionTransferAccountobj.CSMDateInUserRunningDate().sendKeys(format);
     }

      @And("^User_inin72 click on Use Button in Change Running Date Popup in the CSM core application$")
      public void User_inin72_0072ClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMUseButtonInChangeRunningDate());
     }

      @And("^User_inin72 click Ok Button in Information PopUp menu in the CSM core application$")
      public void User_inin72_0072ClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
    	  ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMOkButtonInAccessDeniedPopUpMenu());
     }
      
      
      @And("User_inin72 Click Ok Button for confirmation PopUp for Company Holiday")
      public void User_inin72_0072_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
      	for (int i = 0; i < 50; i++) {

              try {

                  if (GLExceptionTransferAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
                      waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
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
      

      @And("^User_inin72 click on Close Button in Change Running Date Popup in the CSM core application$")
      public void User_inin72_0072ClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMCloseButtonInChangeRunningDate());
     }

      @And("^User_inin72 click on Technical Details Icon in the CSM core application$")
      public void User_inin72_0072ClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMTechnicalDetailsIcon());
     }

      @And("^User_inin72 click Clear Cache in Technical Details Icon in the CSM core application$")
      public void User_inin72_0072ClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
//    	  waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	  for (int i = 0; i < 200; i++) {
    		  try {
    			  ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
			
		}
    	  

      }

      @And("^User_inin72 click Ok Button Under Information PopUp Menu in the CSM core application$")
      public void User_inin72_0072ClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMOkButtonUnderInformationPopUp());

      }
      @And("User_inin72 click TransferAccount field on CSMCore")
  	public void User_inin72_click_transfer_account_field_on_csm_core() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccounts());

  		ClicksAndActionsHelperobj.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccounts());
  		ClicksAndActionsHelperobj.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccounts());

  	}

  	@And("User_inin72 click maintenance field under TransferAccount")
  	public void User_inin72_click_maintenance_field_under_transfer_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintanance());

  	}

  	@And("User_inin72 enter the TransferType under maintanence screen")
  	public void User_inin72_enter_the_transfer_type_under_maintanence_screen() {
  		// JavascriptHelper.scrollIntoView(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType());

  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  		ClicksAndActionsHelperobj
  		.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  ClicksAndActionsHelperobj
  		.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  System.out.println("dropdown "+testData.get("DropDown"));
  		dropDownHelper.SelectUsingVisibleText(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType(),
  				testData.get("DropDown"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTransferType().sendKeys(Keys.ENTER);

  	}

  	@And("User_inin72 enter the Reason under maintanence screen")
  	public void User_inin72_enter_the_reason_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(testData.get("Reason"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(Keys.ENTER);

  	}

  	@And("User_inin72 enter the Destination Branch under maintanence screen")
  	public void User_inin72_enter_the_destination_branch_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
  				.sendKeys(testData.get("DestinationBranch"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.ENTER);

  	}

  	@And("User_inin72 enter the BranchCode under FromAccount")
  	public void User_inin72_enter_the_branch_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode()
  				.sendKeys(testData.get("BranchCodeFA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the CurrencyCode under FromAccount")
  	public void User_inin72_enter_the_currency_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(testData.get("CYCodeFA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the GLCode under FromAccount")
  	public void User_inin72_enter_the_gl_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(testData.get("GLCodeFA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(Keys.TAB);
  	}

  	@And("User_inin72 enter the CIFCode under FromAccount")
  	public void User_inin72_enter_the_cif_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(testData.get("CIFCodeFA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the SerialNumber under FromAccount")
  	public void User_inin72_enter_the_serial_number_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(testData.get("SLCodeFA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the BranchCode under TOAccount")
  	public void User_inin72_enter_the_branch_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode()
  				.sendKeys(testData.get("BranchCodeTA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the CurrencyCode under TOAccount")
  	public void User_inin72_enter_the_currency_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(testData.get("CYCodeTA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the GLCode under TOAccount")
  	public void User_inin72_enter_the_gl_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(testData.get("GLCodeTA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the CIFCode under TOAccount")
  	public void User_inin72_enter_the_cif_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(testData.get("CIFCodeTA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_inin72 enter the SerialNumber under TOAccount")
  	public void User_inin72_enter_the_serial_number_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(testData.get("SLCodeTA"));
  		GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(Keys.TAB);

  	}
  	
  	@And("User_inin72 click the retrive button under maintenance screen")
  	public void User_inin72_click_the_retrive_button_under_maintenance_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  	}

  	@And("User_inin72 select the Record under TransferManagement screen")
  	public void User_inin72_select_the_record_under_transfer_management_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());

  	}

  	@And("User_inin72 click the Save button under maintanance screen")
  	public void CSMCoreTransferAccountsMaintananceSaveButton() {
  		JavascriptHelper.scrollIntoView(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		waitHelper.waitForElementwithFluentwait(driver,
  				GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());

  	}
  	@And("User_inin72 click the Transfer field under TransferAccount field")
	public void user_click_the_transfer_field_under_transfer_account_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransfer());

	}

	@And("User_inin72 enter the Record in Transfer field")
	public void user_enter_the_record_in_transfer_field() {
		//waitHelper.waitForElementwithFluentwait(driver,GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				
				JavascriptHelper.scrollIntoView(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(testData.get("GLCodeFA"));
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		

	}

	@And("User_inin72 click the Transfer button under Transfer field")
	public void user_click_the_transfer_button_under_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());

	}
	@And("User_inin72 click the Approve field under TransferAccount field")
	public void user_click_the_approve_field_under_transfer_account_field() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsApprove());
	}

	@And("User_inin72 enter the Record in Approve field")
	public void user_enter_the_record_in_approve_field() {
//		waitHelper.waitForElementwithFluentwait(driver,
//				GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord()
						.sendKeys(testData.get("GLCodeFA"));
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(Keys.ENTER);
				break;
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	
	@And("User_inin72 double click the record in approve field")
	public void user_double_click_the_record_in_approve_field() {
	    
	}
	@And("User_inin72 double click the record in Transfer field")
	public void user_double_click_the_record_in_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());

	}


	@Given("User_inin72 click the Set Exceptions in Transfer Account")

	public void user_inin72_click_the_set_exceptions_in_transfer_account() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.transferAccountsSetExceptionButton());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.transferAccountsSetExceptionButton());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.transferAccountsSetExceptionButton());

	}

	 

	@Given("User_inin72 click the Add Button Transfer Account")

	public void user_inin72_click_the_add_button_transfer_account() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.AddtransferAccounts_RetriveButton());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.AddtransferAccounts_RetriveButton());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.AddtransferAccounts_RetriveButton());
	}

	 

	@Given("User_inin72 click the Transfer Accounts Criteria Tb")

	public void user_inin72_click_the_transfer_accounts_criteria_tb() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
	}

	 

	@Given("User_inin72 click the Exception Select filed Transfer Account")

	public void user_inin72_click_the_exception_select_filed_transfer_account() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorFirstGridInput());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorFirstGridInput());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorFirstGridInput());
	}

	 

	@Given("User_inin72 click the Search Button Transfer Account")

	public void user_inin72_click_the_search_button_transfer_account() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorSecondGridInput());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorSecondGridInput());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.transferAccountsBlankExceptionfactorSecondGridInput());

	}

	 

	@Given("User_inin72 click the GL Code TransferAccount")

	public void user_inin72_click_the_gl_code_transfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
	}

	 

	@Given("User_inin72 Double Click on the GL Code Transfer Account")

	public void user_inin72_double_click_on_the_gl_code_transfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.transferAccountsExceptionFactorDropdown());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.transferAccountsExceptionFactorDropdown());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.transferAccountsExceptionFactorDropdown());
	}

	 

	@Given("User_inin72 click the Click Ok Button Transfer Account")

	public void user_inin72_click_the_click_ok_button_transfer_account() {

		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.transferAccountsExceptionOkButton());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.transferAccountsExceptionOkButton());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.transferAccountsExceptionOkButton());
	}
	@Given("User_inin72 click the GL Code TransferAccount11")

	public void user_inin72_click_the_gl_code_transfer_account11() {
		waitHelper.waitForElementwithFluentwait(driver,
				GLExceptionTransferAccountobj.AccountcurrencyTransfer());
		ClicksAndActionsHelperobj
				.moveToElement(GLExceptionTransferAccountobj.AccountcurrencyTransfer());
		ClicksAndActionsHelperobj
				.doubleClick(GLExceptionTransferAccountobj.AccountcurrencyTransfer());
	}


}
