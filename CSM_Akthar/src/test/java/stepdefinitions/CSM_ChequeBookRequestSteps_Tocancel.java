package stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CommonElements.CSMCommonWebElements;
import pageobjects.csm.ChequeBookRequestObj_Tocancel;
import resources.BaseClass;abstract
       

public class CSM_ChequeBookRequestSteps_Tocancel extends BaseClass {

	private static final boolean Status = false;
	WebDriver driver = BaseClass.driver;
	CSMLogin csmLogin = new CSMLogin(driver);
	ConfigFileReader configFileRead = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ChequeBookRequestObj_Tocancel chequeBookRequestObj = new ChequeBookRequestObj_Tocancel(driver);
	// String path = System.getProperty("user.dir") +
	// "\\TestData\\CSMTestData.xlsx";
//	ExcelData excelDataForChequeBookRequest = new ExcelData(path, "CSM_ChequeBookrequest", "DataSet ID");
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);

	@Given("navigate to CSM application and login with valid credentials")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileRead.getCSMApplicationUrl());
		csmLogin.loginIntoCSMApplication();
	}

	/// CHB-117/// & ///CHB-118///

	@Then("^Click the chequebook request$")
	public void click_the_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csmChequeBookRequestModule());
	}

	@And("^Click the To Cancel under chequebook request$")
	public void click_the_to_cancel_under_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_ChequeBookRequest_ToCancel());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_ToCancel());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_ToCancel());
	}

	@Then("^search and choose the existing data$")
	public void search_and_choose_the_existing_data() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch());
		chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch().sendKeys("1054");
		Thread.sleep(3000);
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.csm_chequeBookRequestCodeSearchDoubleClick());
		// chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch().sendKeys(Keys.ENTER);
		//clicksAndActionsHelper.doubleClick(chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch());
		Thread.sleep(2000);
	}   
        @And("^click the cancel reason to fill the reason$")
        public void click_the_cancel_reason_to_fill_the_reason() throws Throwable {
       waitHelper.waitForElementwithFluentwait(driver, null);
       clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_chequeBookRequestCancelReason());
       clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequestCancelReason());
       chequeBookRequestObj.csm_chequeBookRequestCancelReason().sendKeys("50"); 
       
    }
    

         @And("^Cancel that record by clicking the to cancel button$")
         public void cancel_that_record_by_clicking_the_to_cancel_button() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, null);
    	 clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch_CancelKeyFinal());
         clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch_CancelKeyFinal());
         chequeBookRequestObj.csm_ChequeBookRequest_CodeSearch_CancelKeyFinal().click();
         
    }

       @Then("^Select the record in the alert box$")
       public void select_the_record_in_the_alert_box() throws Throwable {
       waitHelper.waitForElementwithFluentwait(driver, null);
       clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_AlertClickChrisag());
       clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_AlertClickChrisag());
       clicksAndActionsHelper.doubleClick(chequeBookRequestObj.csm_ChequeBookRequest_AlertClickChrisag());
     
       
    }
    
         @And("^Approve the record by clicking approve button in the alert screen$")
         public void approve_the_record_by_clicking_approve_button_in_the_alert_screen() throws Throwable {
         waitHelper.waitForElementwithFluentwait(driver, null);
         clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_Alert_Approve());
         clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_Alert_Approve());
         chequeBookRequestObj.csm_ChequeBookRequest_Alert_Approve().click();
    }
    
         @Then("^Enter the teller User information$")
         public void enter_the_teller_user_information() throws Throwable {
    	 waitHelper.waitForElementwithFluentwait(driver, null);
    	 clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_UserName());
         clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_UserName());
         chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_UserName().sendKeys("CHRISAG");
         clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Password());
         clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Password());
         chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Password().sendKeys("321");
         clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Submit());
         clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Submit());
         chequeBookRequestObj.csm_ChequeBookRequest_UserInfo_Submit().click();
         
       }
        @Then("^Enter the reason under the teller account$")
        public void enter_the_reason_under_the_teller_account() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_ChequeBookRequest_ToCancel());

	 }

      @And("^Reject and validate the record$")
      public void reject_and_validate_the_record() throws Throwable {
        
      }
      
      //CHB_149//         

//      @And("^user click the maintenance screen under chequebook request$")
//       public void user_click_the_maintenance_screen_under_chequebook_request() throws Throwable {
//        for (int i = 0; i < 200; i++) {
//      try {
//       clicksAndActionsHelper.moveToElement(chequeBookRequestObj.MaintenanceButton());
//            chequeBookRequestObj.MaintenanceButton().click();
//      break;}
//                   catch (Exception e) {
//       if (i==199) {
//         Assert.fail(e.getMessage());
//         
//                          
//       }
//     }
//
//               
//        }     
//                             }
//
//    
//
//      @And("^user click the number of chequebooks button$")
//      public void user_click_the_number_of_chequebooks_button() throws Throwable {
//    	  waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.numberOfChequeBooksInMaintenance());
//          clicksAndActionsHelper.moveToElement(chequeBookRequestObj.numberOfChequeBooksInMaintenance());
//      
//          }    
//
//          @And("^user enter the value in number of chequebooks$")
//     public void user_enter_the_value_in_number_of_chequebooks() throws Throwable {
//      waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.numberOfChequeBooksInMaintenance());
//      clicksAndActionsHelper.moveToElement(chequeBookRequestObj.numberOfChequeBooksInMaintenance());
//      chequeBookRequestObj.numberOfChequeBooksInMaintenance().sendKeys(testData.get("No of Cheque boooks"));
//      
//          }
//
//      
//
//      @And("^user click the cheque code$")
//      public void user_click_the_cheque_code() throws Throwable {
//      waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeCodeInMaintenanceScreen());
//      clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeCodeInMaintenanceScreen());
//      
//          }     
//
//       @And("^user enter the value in cheque code under chequebook request screen$")
//      public void user_enter_the_value_in_cheque_code_under_chequebook_request_screen() throws Throwable {
//      waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeCodeInMaintenanceScreen());
//      clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeCodeInMaintenanceScreen());
//      chequeBookRequestObj.chequeCodeInMaintenanceScreen().sendKeys(testData.get("Cheque Code"));
//          }     
//
//      @And("^user click the chequebook request/maintenance icon$")
//      public void user_click_the_chequebook_requestmaintenance_icon() throws Throwable {
//      waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.randomClickInChequeBookCreation());
//      clicksAndActionsHelper.moveToElement(chequeBookRequestObj.randomClickInChequeBookCreation());
//      chequeBookRequestObj.randomClickInChequeBookCreation().click();
//          }    
//
//      @And("^user click the branch code$")
//      public void user_click_the_branch_code() throws Throwable {
//    	  waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.branchCodeInMaintenanceScreen());
//    	  clicksAndActionsHelper.moveToElement(chequeBookRequestObj.branchCodeInMaintenanceScreen());
//    	  chequeBookRequestObj.branchCodeInMaintenanceScreen().click();
//          }
//   
//
//      @And("^user enter the value in branch code$")
//      public void user_enter_the_value_in_branch_code() throws Throwable {
//      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.branchCodeInMaintenanceScreen());
//      seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.branchCodeInMaintenanceScreen());
//      ChequeBookRequestObject.branchCodeInMaintenanceScreen().sendKeys(testData.get("Branch code"));
//          }
//
//              @And("^user click the currency code$")
//              public void user_click_the_currency_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
//              ChequeBookRequestObject.currencyCodeInMaintenanceScreen().click();
//          }       
//
//          @And("^user enter the value in currency code$")
//          public void user_enter_the_value_in_currency_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.currencyCodeInMaintenanceScreen());
//              ChequeBookRequestObject.currencyCodeInMaintenanceScreen().sendKeys(testData.get("Currency code"));
//          }      
//     
//
//      @And("^user click the gl code$")
//          public void user_click_the_gl_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.glCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.glCodeInMaintenanceScreen());
//              ChequeBookRequestObject.glCodeInMaintenanceScreen().click();
//          }
//       
//
//          @And("^user enter the value in gl code$")
//          public void user_enter_the_value_in_gl_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.glCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.glCodeInMaintenanceScreen());
//              ChequeBookRequestObject.glCodeInMaintenanceScreen().sendKeys(testData.get("GL code"));
//          }
//
//       
//
//          @And("^user click the cif code$")
//          public void user_click_the_cif_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cifCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cifCodeInMaintenanceScreen());
//              ChequeBookRequestObject.cifCodeInMaintenanceScreen().click();
//          }
//       
//
//          @And("^user enter the value in cif code$")
//          public void user_enter_the_value_in_cif_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.cifCodeInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.cifCodeInMaintenanceScreen());
//              ChequeBookRequestObject.cifCodeInMaintenanceScreen().sendKeys(testData.get("CIF code"));
//          }
//       
//
//          @And("^user click the serial number$")
//          public void user_click_the_serial_number() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.serialNoInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.serialNoInMaintenanceScreen());
//              ChequeBookRequestObject.serialNoInMaintenanceScreen().click();
//          }
//
//       
//
//          @And("^user enter the value in serial number$")
//          public void user_enter_the_value_in_serial_number() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.serialNoInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.serialNoInMaintenanceScreen());
//              ChequeBookRequestObject.serialNoInMaintenanceScreen().sendKeys(testData.get("Serial No"));
//          }
//       
//
//          @And("^user click the     save button under chequebook request$")
//          public void user_click_the_save_button_under_chequebook_request() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.saveButtonInMaintenanceScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.saveButtonInMaintenanceScreen());
//              ChequeBookRequestObject.saveButtonInMaintenanceScreen().click();
//          }
//     
//
//      @And("^User Click Approve Sub Menu$")
//          public void user_click_approve_sub_menu() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.approveSubMenu());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveSubMenu());
//              seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.approveSubMenu());
//          }
//
//          @And("^User Search Cheque Book Code in Approve Screen$")
//          public void user_search_cheque_book_code_in_approve_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
//              seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.searchChequeBookCodeInApproveScreen());
//              ChequeBookRequestObject.searchChequeBookCodeInApproveScreen().sendKeys(testData.get("Approve ChequeBookCode"));
//              ChequeBookRequestObject.searchChequeBookCodeInApproveScreen().sendKeys(Keys.ENTER);
//          }
//
//          @And("^User Select Cheque Book Code in Approve Screen$")
//          public void user_select_cheque_book_code_in_approve_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
//              seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.selectChequeBookCodeInApproveScreen());
//          }
//
//
//          @And("^User Click Approve button in Approve Screen$")
//          public void user_click_approve_buttonin_approve_screen() throws Throwable {
//              for (int i = 0; i <200; i++) {
//                  try {
//                      seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.approveButton());
//                      seleniumActions.getClickAndActionsHelper().clickOnElement(ChequeBookRequestObject.approveButton());
//                      break;
//                  } catch (Exception e) {
//                      if (i==199) {
//                          Assert.fail(e.getMessage());
//                      }
//                  }
//              }
//          }
//
//          @And("^User Click Ok button in Warning pop up Message in Approve Screen$")
//          public void user_click_ok_button_in_warning_pop_up_message_in_approve_screen() throws Throwable {
//              for (int i = 0; i <200; i++) {
//                  try {
//                      if (ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen().isDisplayed()) {
//                          seleniumActions.getClickAndActionsHelper()
//                          .moveToElement(ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen());
//                  seleniumActions.getClickAndActionsHelper()
//                          .clickOnElement(ChequeBookRequestObject.closeIconInWarningPopUpcancelScreen());
//                  break;
//                      }
//
//
//                  } catch (Exception e) {
//                      if (i==199) {
//                      Assert.fail(e.getMessage());    
//                      }
//                  }
//              }
//          }     
//      
//
//      @And("^user click the to be reversed chequebook screen$")
//          public void user_click_the_to_be_reversed_chequebook_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.toBeReversedChequeBook());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.toBeReversedChequeBook());
//              ChequeBookRequestObject.toBeReversedChequeBook().click();
//          }     
//      
//
//      @And("^user click the checkbook code in to be reversed chequebook screen$")
//          public void user_click_the_checkbook_code_in_to_be_reversed_chequebook_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCodeToBeReversed());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCodeToBeReversed());
//              ChequeBookRequestObject.chequeBookCodeToBeReversed().click();
//          }
//      
//
//      @And("^user enter the value in chequebook code$")
//          public void user_enter_the_value_in_chequebook_code() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.chequeBookCodeToBeReversed());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.chequeBookCodeToBeReversed());
//              ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(testData.get("To Be Reversed ChequeBook Code"));
//              ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(Keys.ENTER);
//              seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickTheRecord());
//              //ChequeBookRequestObject.chequeBookCodeToBeReversed().sendKeys(Keys.ENTER);
//
//          }
//     
//
//      @And("^user click the to be reversed button$")
//          public void user_click_the_to_be_reversed_button() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.clickTheToBeReversedButton());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.clickTheToBeReversedButton());
//              ChequeBookRequestObject.clickTheToBeReversedButton().click();
//          }
//      
//
//      @And("^user click the reverse chequebook screen$")
//          public void user_click_the_reverse_chequebook_screen() throws Throwable {
//      //        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookScreen());
//      //      seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookScreen());
//      //      ChequeBookRequestObject.reverseChequeBookScreen().click();
//              for(int i=0;i<200;i++) {
//                  try {
//                      seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookScreen());
//                      seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookScreen());
//                      ChequeBookRequestObject.reverseChequeBookScreen().click();
//                      break;
//                  } catch (Exception e) {
//                   if(i==199) {
//                      Assert.fail(e.getMessage());
//                   }
//                  }
//              }
//
//          }   
//   
//    
//
//      @And("^user click the chequebook code in reverse chequebook screen$")
//          public void user_click_the_chequebook_code_in_reverse_chequebook_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookCode());
//              ChequeBookRequestObject.reverseChequeBookCode().click();
//          } 
//     
//
//      @And("^user enter the value in chequebook code under reverse chequebook screen$")
//          public void user_enter_the_value_in_chequebook_code_under_reverse_chequebook_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.reverseChequeBookCode());
//              ChequeBookRequestObject.reverseChequeBookCode().sendKeys(testData.get("Reverse ChequeBook Code"));
//              ChequeBookRequestObject.reverseChequeBookCode().sendKeys(Keys.ENTER);
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.reverseChequeBookCode());
//              seleniumActions.getClickAndActionsHelper().doubleClick(ChequeBookRequestObject.doubleClickTheRecord());
//          }   
//  
//
//      @And("^user click the reject button under reverse chequebook screen$")
//          public void user_click_the_reject_button_under_reverse_chequebook_screen() throws Throwable {
//              seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu());
//              seleniumActions.getClickAndActionsHelper().moveToElement(ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu());
//              ChequeBookRequestObject.rejectButtonInReverseChequeBookSubMenu().click();
//          }
//
//     
      

//CHB_150//	   

	@And("^Click the Bulk Destroy$")
	public void click_the_Bulk_Destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_BulkDestroy());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_BulkDestroy());
	}

	@Then("^Choose the Existing data from Bulk Destroy$")
	public void choose_the_existing_data_from_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_CodeSearching());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_CodeSearching());
	}

	@And("^Enter the ok in Remarks$")
	public void enter_the_ok_in_remarks() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Remarks());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Remarks());
	}

	@Then("^Click the To Destroy button$")
	public void click_the_to_destroy_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_ToDestry());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_ToDestry());
	}

	@And("^Select the Approve Reject Bulk Destroy$")
	public void select_the_approve_reject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_ApproveRejectBulkDestroy());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_ApproveRejectBulkDestroy());
	}

	@And("^Click the Retrive buton$")
	public void click_the_retrive_buton() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Retrive_btnn());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Retrive_btnn());
	}

	@Then("^Same data will Appear in Approve Reject Bulk Destroy$")
	public void same_data_will_appear_in_approve_reject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_SameData());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_SameData());
	}

	// CHB_151//
	
	  @And("^Enter the value in search box$")
	    public void Enter_the_value_in_search_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Searchbox());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Searchbox()); 
			chequeBookRequestObj.csm_chequeBookRequest_Searchbox().sendKeys("432");
			Thread.sleep(3000);
	    }
	  
	  @And("^enter the value in the code box$")
	    public void enter_the_value_in_the_code_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Codevalue());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Codevalue());
			chequeBookRequestObj.csm_chequeBookRequest_Codevalue().sendKeys("432");
			chequeBookRequestObj.csm_chequeBookRequest_Codevalue().sendKeys(Keys.ENTER);
	    }
	  
	  @Then("^check the same Data will Appear in To be Destroy$")
	    public void check_the_same_data_will_Appear_in_to_be_Destroy() throws Throwable {
	    	    	String xpath="//input[@id='jqg2']='"+432+"']";
	    	    	Thread.sleep(3000);
	    	    	for (int i = 0; i <200; i++) {
						try {
							Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
							break;
						} catch (Exception e) {
							if (i==199) {
								Assert.fail(e.getMessage());
							}
						}
					}
	    	 }

//CHB_152
	

	    @And("^click the Retrive buton$")
	    public void click_the_Retrive_buton() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Retrive_Btn());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Retrive_Btn());
	    }   

	  
	   @Then("^click the Search button$")
	    public void click_the_search_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Searchbtn());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Searchbtn());
	    }

	  
	    @And("^enter the value in search box$")
	    public void enter_the_value_in_search_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Searchbox());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Searchbox()); 
			chequeBookRequestObj.csm_chequeBookRequest_Searchbox().sendKeys("32");
	    }

	    @And("^click the Find button$")
	    public void click_the_find_button() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Findbtn());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Findbtn()); 
	    }  

	    @And("^click the To be Destroy$")
	    public void click_the_to_be_destroy()  throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Tobedestroy());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Tobedestroy()); 
	    	
	    }
	    @And("^Enter the value in the code box$")
	    public void Enter_the_value_in_the_code_box() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csm_chequeBookRequest_Codevalue());
			clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csm_chequeBookRequest_Codevalue());
			chequeBookRequestObj.csm_chequeBookRequest_Codevalue().sendKeys("32");
			chequeBookRequestObj.csm_chequeBookRequest_Codevalue().sendKeys(Keys.ENTER);
	    }
}
//
//	    @Then("^check the same Data will Appear in To be Destroy$")
//	    public void check_the_same_data_will_appear_in_to_be_destroy() throws Throwable {
//	    	    	String xpath="//td[text()='"+32+"']";
//	    	    	Thread.sleep(3000);
//	    	    	for (int i = 0; i <200; i++) {
//						try {
//							Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
//							break;
//						} catch (Exception e) {
//							if (i==199) {
//								Assert.fail(e.getMessage());
//							}
//						}
//					}
//	    	 }
// 
// }


