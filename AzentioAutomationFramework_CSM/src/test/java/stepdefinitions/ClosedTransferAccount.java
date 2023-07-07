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
import pageobjects.TransfercreateNewAccount;
import resources.BaseClass;

public class ClosedTransferAccount {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
    ConfigFileReader ConfigFileReaderobj = new ConfigFileReader();
    ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
    ConfigFileReader configFileReader =  new ConfigFileReader();
    CSMLogin login = new CSMLogin(driver);
    Selenium_Actions seleniumActions = new Selenium_Actions(driver);
    TransfercreateNewAccount TransfercreateNewAccountobj = new TransfercreateNewAccount(driver);
    DropDownHelper dropDownHelper = new DropDownHelper(driver);
    JavascriptHelper JavascriptHelper = new JavascriptHelper(driver);
    String path = System.getProperty("User_7210_0072.dir") +"\\TestData\\CSMparamTestData.xlsx";
	  ExcelData CsmTransactionExcelData = new ExcelData(path,"CSM_Transactions_TestData","DataSet ID");
	  Map<String, String> testData;

		
		
	  @And("^User_7210 click on Date to Change the Current Date in the CSM core application$")
      public void User_7210_0072ClickOnDateToChangeTheCurrentDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMDateToChangeTheCurrentDate());
          ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMDateToChangeTheCurrentDate());
      }

      @And("^User_7210 Enters the Date in User_7210_0072 Running Date in the CSM core application$")
      public void User_7210_0072EntersTheDateInUser_7210_0072RunningDateInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMDateInUserRunningDate());
          ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMDateInUserRunningDate());
          TransfercreateNewAccountobj.CSMDateInUserRunningDate().clear();
          //TransfercreateNewAccountobj.CSMDateInUser_7210_0072RunningDate().sendKeys(testData.get("Dates"));
          DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate date =LocalDate.now();
          String format = date.format(dtFormatter);
          TransfercreateNewAccountobj.CSMDateInUserRunningDate().sendKeys(format);
     }

      @And("^User_7210 click on Use Button in Change Running Date Popup in the CSM core application$")
      public void User_7210_0072ClickOnUseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMUseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMUseButtonInChangeRunningDate());
     }

      @And("^User_7210 click Ok Button in Information PopUp menu in the CSM core application$")
      public void User_7210_0072ClickOkButtonInInformationPopupMenuInTheCsmcoreApplication() {
    	  ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMOkButtonInAccessDeniedPopUpMenu());
     }
      
      
      @And("User_7210 Click Ok Button for confirmation PopUp for Company Holiday")
      public void User_7210_0072_click_ok_button_for_confirmation_pop_up_for_company_holiday() {
      	for (int i = 0; i < 50; i++) {

              try {

                  if (TransfercreateNewAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday().isDisplayed()) {
                      waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
                      ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.csmOkButtonForConfirmationPopUpForCompanyHoliday());
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
      

      @And("^User_7210 click on Close Button in Change Running Date Popup in the CSM core application$")
      public void User_7210_0072ClickOnCloseButtonInChangeRunningDatePopupInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMCloseButtonInChangeRunningDate());
    	  ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMCloseButtonInChangeRunningDate());
     }

      @And("^User_7210 click on Technical Details Icon in the CSM core application$")
      public void User_7210_0072ClickOnTechnicalDetailsIconInTheCsmcoreApplication() {
    	  waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMTechnicalDetailsIcon());
    	  ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMTechnicalDetailsIcon());
     }

      @And("^User_7210 click Clear Cache in Technical Details Icon in the CSM core application$")
      public void User_7210_0072ClickClearCacheInTechnicalDetailsIconInTheCsmcoreApplication() {
//    	  waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	  for (int i = 0; i < 200; i++) {
    		  try {
    			  ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSM_ClearCacheInTechnicalDetailsIcon());
    	    	  break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
			
		}
    	  

      }

      @And("^User_7210 click Ok Button Under Information PopUp Menu in the CSM core application$")
      public void User_7210_0072ClickOkButtonUnderInformationPopupMenuInTheCsmcoreApplication() {

          waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMOkButtonUnderInformationPopUp());
          ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMOkButtonUnderInformationPopUp());

      }
      @And("User_7210 click TransferAccount field on CSMCore")
  	public void User_7210_click_transfer_account_field_on_csm_core() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccounts());

  		ClicksAndActionsHelperobj.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccounts());
  		ClicksAndActionsHelperobj.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccounts());

  	}

  	@And("User_7210 click maintenance field under TransferAccount")
  	public void User_7210_click_maintenance_field_under_transfer_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintanance());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintanance());

  	}

  	@And("User_7210 enter the TransferType under maintanence screen")
  	public void User_7210_enter_the_transfer_type_under_maintanence_screen() {
  		// JavascriptHelper.scrollIntoView(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType());

  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  		ClicksAndActionsHelperobj
  		.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  ClicksAndActionsHelperobj
  		.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType());
  System.out.println("dropdown "+testData.get("DropDown"));
  		dropDownHelper.SelectUsingVisibleText(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType(),
  				testData.get("DropDown"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTransferType().sendKeys(Keys.ENTER);

  	}

  	@And("User_7210 enter the Reason under maintanence screen")
  	public void User_7210_enter_the_reason_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceReason());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(testData.get("Reason"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceReason().sendKeys(Keys.ENTER);

  	}

  	@And("User_7210 enter the Destination Branch under maintanence screen")
  	public void User_7210_enter_the_destination_branch_under_maintanence_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch()
  				.sendKeys(testData.get("DestinationBranch"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceDestinationBranch().sendKeys(Keys.ENTER);

  	}

  	@And("User_7210 enter the BranchCode under FromAccount")
  	public void User_7210_enter_the_branch_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode()
  				.sendKeys(testData.get("BranchCodeFA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the CurrencyCode under FromAccount")
  	public void User_7210_enter_the_currency_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(testData.get("CYCodeFA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCyCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the GLCode under FromAccount")
  	public void User_7210_enter_the_gl_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(testData.get("GLCodeFA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccGLCode().sendKeys(Keys.TAB);
  	}

  	@And("User_7210 enter the CIFCode under FromAccount")
  	public void User_7210_enter_the_cif_code_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(testData.get("CIFCodeFA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the SerialNumber under FromAccount")
  	public void User_7210_enter_the_serial_number_under_from_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(testData.get("SLCodeFA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceFromAccSLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the BranchCode under TOAccount")
  	public void User_7210_enter_the_branch_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode()
  				.sendKeys(testData.get("BranchCodeTA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccBranchCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the CurrencyCode under TOAccount")
  	public void User_7210_enter_the_currency_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(testData.get("CYCodeTA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCYCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the GLCode under TOAccount")
  	public void User_7210_enter_the_gl_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(testData.get("GLCodeTA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccGLCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the CIFCode under TOAccount")
  	public void User_7210_enter_the_cif_code_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(testData.get("CIFCodeTA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccCIFCode().sendKeys(Keys.TAB);

  	}

  	@And("User_7210 enter the SerialNumber under TOAccount")
  	public void User_7210_enter_the_serial_number_under_to_account() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode());
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(testData.get("SLCodeTA"));
  		TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceTOAccSLCode().sendKeys(Keys.TAB);

  	}
  	
  	@And("User_7210 click the retrive button under maintenance screen")
  	public void User_7210_click_the_retrive_button_under_maintenance_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRetriveButton());
  	}

  	@And("User_7210 select the Record under TransferManagement screen")
  	public void User_7210_select_the_record_under_transfer_management_screen() {
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceRecordselecting());

  	}

  	@And("User_7210 click the Save button under maintanance screen")
  	public void CSMCoreTransferAccountsMaintananceSaveButton() {
  		JavascriptHelper.scrollIntoView(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		waitHelper.waitForElementwithFluentwait(driver,
  				TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());
  		ClicksAndActionsHelperobj
  				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsMaintananceSaveButton());

  	}
  	@And("User_7210 click the Transfer field under TransferAccount field")
	public void user_click_the_transfer_field_under_transfer_account_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransfer());
		ClicksAndActionsHelperobj
				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransfer());

	}

	@And("User_7210 enter the Record in Transfer field")
	public void user_enter_the_record_in_transfer_field() {
		//waitHelper.waitForElementwithFluentwait(driver,TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				
				JavascriptHelper.scrollIntoView(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord());
				TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(testData.get("GLCodeFA"));
				TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecord().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		

	}

	@And("User_7210 click the Transfer button under Transfer field")
	public void user_click_the_transfer_button_under_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());
		ClicksAndActionsHelperobj
				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferRetriveRecordTransferButton());

	}
	@And("User_7210 click the Approve field under TransferAccount field")
	public void user_click_the_approve_field_under_transfer_account_field() {

		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsApprove());
		ClicksAndActionsHelperobj
				.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsApprove());
	}

	@And("User_7210 enter the Record in Approve field")
	public void user_enter_the_record_in_approve_field() {
//		waitHelper.waitForElementwithFluentwait(driver,
//				TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
		for (int i = 0; i < 200; i++) {
			try {
				JavascriptHelper.scrollIntoView(TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
//				waitHelper.waitForElementwithFluentwait(driver,
//						TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				ClicksAndActionsHelperobj
						.clickOnElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord());
				TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord()
						.sendKeys(testData.get("GLCodeFA"));
				TransfercreateNewAccountobj.CSMCoreTransferAccountsApproveEnterGlforRetriveRecord().sendKeys(Keys.ENTER);
				break;
				
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

	}

	
	@And("User_7210 double click the record in approve field")
	public void user_double_click_the_record_in_approve_field() {
	    
	}
	@And("User_7210 double click the record in Transfer field")
	public void user_double_click_the_record_in_transfer_field() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.CSMCoreTransferAccountsTransferEnterGlforRetriveRecorddoubleclick());

	}

	@Given("User_{int} click the Accounts in Transfer Accounts")
	public void user_click_the_accounts_in_transfer_accounts() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_Accounts_MenuOptions_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_Accounts_MenuOptions_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_Accounts_MenuOptions_615());

	}

	 

	@Given("User_{int} click the General Account in Transfer Account")
	public void user_click_the_general_account_in_transfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_615());

	}

	 

	@Given("User_{int} Click the Opening Account in Transfer")
	public void user_click_the_opening_account_in_transfer() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_Opening_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_Opening_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_Accounts_GeneralAccounts_Opening_615());

	}

	 

	@Given("User_{int} Click the Maintenance")
	public void user_click_the_maintenance() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());

	}

	 

	@Given("User_{int} click the Batch No in Tarnsfer Account")
	public void user_click_the_batch_no_in_tarnsfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_BatchNo_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_BatchNo_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_BatchNo_615());

	}

	 

	@Given("User_{int} click the Authorized in Transfer Account")
	public void user_click_the_authorized_in_transfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_Validate_Status_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_Validate_Status_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_Validate_Status_615());

	}

	 

	@Given("User_{int} click the Maintenance button in Transfer Account")
	public void user_click_the_maintenance_button_in_transfer_account() {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_TransferAccounts_Maintenance_SearchIcon_615());

	}

	 

	@Given("User_{int} Click the closed status view in Accounts")
	public void user_click_the_closed_status_view_in_accounts(Integer int1) {
		waitHelper.waitForElementwithFluentwait(driver,
				TransfercreateNewAccountobj.csm_AccountsMenu_Gl_Code_Input_615());
		ClicksAndActionsHelperobj
				.moveToElement(TransfercreateNewAccountobj.csm_AccountsMenu_Gl_Code_Input_615());
		ClicksAndActionsHelperobj
				.doubleClick(TransfercreateNewAccountobj.csm_AccountsMenu_Gl_Code_Input_615());

	}

	

}
