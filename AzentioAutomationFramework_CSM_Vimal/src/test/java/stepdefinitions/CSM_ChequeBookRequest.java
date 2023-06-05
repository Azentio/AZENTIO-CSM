package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_AmendChequeStatusObj;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;


public class CSM_ChequeBookRequest extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	CSM_AmendChequeStatusObj amendChequeStatusObj = new CSM_AmendChequeStatusObj(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ChequebookRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	boolean status;
    @And("^User update Test data id for checking if the user is able to suspend a chequebook short process$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_suspend_a_chequebook_short_process() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_007");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_004$")
    public void user_update_the_test_data_id_for_chb004() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_004");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_001$")
    public void user_update_the_test_data_id_for_chb001() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_001");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_005$")
    public void user_update_the_test_data_id_for_chb005() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_005");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_002$")
    public void user_update_the_test_data_id_for_chb002() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_002");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User update Test data id for checking if the user is able approve cancellation reversal throught alert$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_approve_cancellation_reversal_throught_alert() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_036");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }

    @And("^User update Test data id for checking if the user is able reject cancellation reversal throught alert$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_reject_cancellation_reversal_throught_alert() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_037");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    
    @And("^User update Test data id for checking if the user is able to reverse cancellation with batch record$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_reverse_cancellation_with_batch_record() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_038");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    
    @And("^User update Test data id for checking if the user is able to approve reverse cancellation with batch record$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_approve_reverse_cancellation_with_batch_record() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_039");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_102$")
    public void user_update_the_test_data_id_for_chb102() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_102");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    
    @And("^User Update the test data id for CHB_103$")
    public void user_update_the_test_data_id_for_chb103() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_103");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
    @And("^User Update the test data id for CHB_114$")
    public void user_update_the_test_data_id_for_chb114() throws Throwable {
    	testExecutionData = testExecution.getTestdata("CHB_114");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
    }
	@Then("^User Validate the suspended chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_suspended_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.suspendRecordValidationInCBMaintenance().isDisplayed());
	}

	@Then("^User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_cancelled_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.cancelledRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.cancelledRecordValidationInCBMaintenance().isDisplayed());
    }
    @And("^User Click Suspend Sub Menu$")
    public void user_click_suspend_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendScreen());
    }

    @And("^User search the chequebook code in chequebook request Maintenance Screen$")
    public void user_search_the_chequebook_code_in_chequebook_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendSearchCheuqueCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendSearchCheuqueCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendSearchCheuqueCode());
		chequeBookRequestObj.suspendSearchCheuqueCode().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.suspendSearchCheuqueCode().sendKeys(Keys.ENTER);
		
    }

    @And("^User Select the Searched Record in chequebook request Maintenance Screen$")
    public void user_select_the_searched_record_in_chequebook_request_maintenance_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendSelectCheuqueCode());
				seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.suspendSelectCheuqueCode());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	try {
    		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.viewMemoPopupClose());
    		chequeBookRequestObj.viewMemoPopupClose().click();
		} catch (Exception e) {
			
		}
		
		
    }

    @And("^User click suspend button to suspend the cheque book record$")
    public void user_click_suspend_button_to_suspend_the_cheque_book_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.suspendButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.suspendButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.suspendButton());
    }
    @And("^User Click Approve Sub Menu$")
    public void user_click_approve_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveSubMenu());
    }
    @And("^User Search Cheque Book Code in Approve Screen$")
    public void user_search_cheque_book_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInApproveScreen());
		chequeBookRequestObj.searchChequeBookCodeInApproveScreen().sendKeys(testData.get("ChequeBookCode"),Keys.ENTER);
		//chequeBookRequestObj.searchChequeBookCodeInApproveScreen().sendKeys(Keys.ENTER);
			for (int i = 0; i <200; i++) {
				try {
					chequeBookRequestObj.selectChequeBookCodeInApproveScreen().getText().equalsIgnoreCase(testData.get("ChequeBookCode"));
					break;
				} catch (Exception e) {
					if (i==199) {
						Assert.fail("Cheque book code not found ");
					}
				}
			}
    }

    @And("^User Select Cheque Book Code in Approve Screen$")
    public void user_select_cheque_book_code_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.selectChequeBookCodeInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInApproveScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInApproveScreen());
    }

    @And("^User Click Approve button in Approve Screen$")
    public void user_click_approve_buttonin_approve_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveButton());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveButton());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    @And("^User Click Maintanence sub menu in chequebook request$")
    public void user_click_maintanence_sub_menu_in_chequebook_request() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.CBMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.CBMaintenanceScreen());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
    @And("^User Click Search button in chequebook request Maintenance Screen$")
    public void user_click_search_button_in_chequebook_request_maintenance_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchButtonInCBMaintenance());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }
    
    
    @And("^User Search Suspended chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_suspended_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
		
    }
    // cheque book creation
    
    @And("^User Enter the Number of Cheque Books$")
    public void user_enter_the_number_of_cheque_books() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.noOfChequeBooks());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.noOfChequeBooks());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.noOfChequeBooks());
		chequeBookRequestObj.noOfChequeBooks().sendKeys(testData.get("No of Cheque boooks"));
    }

    @And("^User Cheque Code in Cheque book Maintenance Screen$")
    public void user_cheque_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_chequeCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_chequeCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_chequeCode());
		chequeBookRequestObj.chequeBookCreation_chequeCode().sendKeys(testData.get("Cheque Code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
		
    }
    

    @And("^User Enter the Branch Code in Cheque book Maintenance Screen$")
    public void user_enter_the_branch_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_BranchCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_BranchCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_BranchCode());
		chequeBookRequestObj.chequeBookCreation_BranchCode().sendKeys(testData.get("Branch code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
    }
    @And("^User Enter the Currency Code in Cheque book Maintenance Screen$")
    public void user_enter_the_currency_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_CurrencyCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_CurrencyCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_CurrencyCode());
		chequeBookRequestObj.chequeBookCreation_CurrencyCode().sendKeys(testData.get("Currency code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
    }


    @And("^User Enter the GL Code in Cheque book Maintenance Screen$")
    public void user_enter_the_gl_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_GlCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_GlCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_GlCode());
		chequeBookRequestObj.chequeBookCreation_GlCode().sendKeys(testData.get("GL code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
    }
    
    @And("^User Enter the CIF Code in Cheque book Maintenance Screen$")
    public void user_enter_the_cif_code_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_CifCode());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_CifCode());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_CifCode());
		chequeBookRequestObj.chequeBookCreation_CifCode().sendKeys(testData.get("CIF code"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
    }

    @And("^User Enter the Serial No in Cheque book Maintenance Screen$")
    public void user_enter_the_serial_no_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_SerialNo());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_SerialNo());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_SerialNo());
		chequeBookRequestObj.chequeBookCreation_SerialNo().sendKeys(testData.get("Serial No"));
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookMaintenance());
    }

    @And("^User Click Save button in Cheque book Maintenance Screen$")
    public void user_click_save_button_in_cheque_book_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_Save());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_Save());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_Save());
    }
    @And("^User click ok button for no signatures and no finger print pop up warning Message$")
    public void user_click_ok_button_for_no_signatures_and_no_finger_print_pop_up_warning_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
    }

    @And("^User Validate Cheque book created$")
    public void user_validate_cheque_book_created() throws Throwable {
        String xpath ="//td[text()='Active']/preceding-sibling::td[text()='0']"
        		+ "/preceding-sibling::td[text()='"+testData.get("CIF code")+"']"
        		+ "/preceding-sibling::td[text()='"+testData.get("GL code")+"']"
        		+ "/preceding-sibling::td[text()='"+testData.get("Currency code")+"']/preceding-sibling::td[3]";
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

    @And("^User Store the newly created Cheque book code$")
    public void user_store_the_newly_created_cheque_book_code() throws Throwable {
    	 String xpath ="//td[text()='Active']/preceding-sibling::td[text()='0']"
         		+ "/preceding-sibling::td[text()='"+testData.get("CIF code")+"']"
         		+ "/preceding-sibling::td[text()='"+testData.get("GL code")+"']"
         		+ "/preceding-sibling::td[text()='"+testData.get("Currency code")+"']/preceding-sibling::td[3]";
        for (int i = 0; i <200; i++) {
			try {
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.println(text);
				excelData.updateTestData(testExecutionData.get("Data Set ID"), "Created Cheque Book Code", text);
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    //**********************Cancel ChequeBook *****************************************
    @And("^User Click To Cancel Sub Menu$")
    public void user_click_to_cancel_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toCancelScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.toCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.toCancelScreen());
    }

    @And("^User Search Cheque Book Code in To Cancel Screen$")
    public void user_search_cheque_book_code_in_to_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		chequeBookRequestObj.searchChequeBookCodeInToCancelScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInToCancelScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select Cheque Book Code in To Cancel Screen$")
    public void user_select_cheque_book_code_in_to_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInToCancelScreen());
    }

    @And("^User Click To Cancel button	in To Cancel Screen$")
    public void user_click_to_cancel_buttonin_to_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.toCancelButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.toCancelButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.toCancelButton());
    }

    @And("^User Click Approve Cancel Sub Menu$")
    public void user_click_approve_cancel_sub_menu() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveCancelScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveCancelScreen());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}	
    }

    @And("^User Search Cheque Book Code in Approve Cancel Screen$")
    public void user_search_cheque_book_code_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select Cheque Book Code in Approve Cancel Screen$")
    public void user_select_cheque_book_code_in_approve_cancel_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
    		
			try {
				System.out.println(chequeBookRequestObj.selectChequeBookCodeInApproveCancelScreen().getText());
				chequeBookRequestObj.selectChequeBookCodeInApproveCancelScreen().getText().equalsIgnoreCase(testData.get("ChequeBookCode"));
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("Cheque book code not found ");
				}
			}
		}
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInApproveCancelScreen());;
    			break;
    		} catch (Exception e) {
    			if (i==199) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
		
		
    }

    @And("^User Click Cancel button in Approve Cancel Screen$")
    public void user_click_cancel_button_in_approve_cancel_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.cancelButton());
    			seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.cancelButton());
    			break;
    		} catch (Exception e) {
    			if (i==199) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
		
    }
    @And("^User Validate Missing Reason Pop up$")
    public void user_validate_missing_reason_pop_up() throws Throwable {
       status=false;
       String xpath ="//div[text()='Cancel Reason']";
       for (int i = 0; i <200; i++) {
		try {
			if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
				Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.okButtonInCancelReasonPopUp());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.okButtonInCancelReasonPopUp());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.okButtonInCancelReasonPopUp());
				status=true;
				break;
			}
			
		} catch (Exception e) {
			if (i==199) {
				
			}
		}
	}  
    }

    @And("^User Enter Cancel Reason in To Cancel Screen$")
    public void user_enter_cancel_reason_in_to_cancel_screen() throws Throwable {
       //199
    	if (status) {
    		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.cancelReason());
    		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.cancelReason());
    		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.cancelReason());
    		chequeBookRequestObj.cancelReason().sendKeys("199");
    		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.chequebookRequestToCancel());
    		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequebookRequestToCancel());
    		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequebookRequestToCancel());
    		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.toCancelButton());
    		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.toCancelButton());
    		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.toCancelButton());
    	}
    }
    @And("^enter the request no in amend cheque$")
	public void enter_the_request_no_in_amend_cheque() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardRequestNoInput());
    	seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
    	seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeStatusObj.amendChequeCardRequestNoInput());
    	amendChequeStatusObj.amendChequeCardRequestNoInput().sendKeys(testData.get("ChequeBookCode"));
	}
    @And("^Select the chequebook Status as cancelled$")
	public void give_the_status_in_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardStatusDropdown());
    	seleniumActions.getDropDownHelper().SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardStatusDropdown(),
				"Cancelled");
	}
    @And("^User Click Ok button in Warning pop up Message in Approve Cancel Screen$")
    public void user_click_ok_button_in_warning_pop_up_message_in_approve_cancel_screen() throws Throwable {
		for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper()
				.moveToElement(chequeBookRequestObj.closeIconInWarningPopUpcancelScreen());
		seleniumActions.getClickAndActionsHelper()
				.clickOnElement(chequeBookRequestObj.closeIconInWarningPopUpcancelScreen());
		break;
			} catch (Exception e) {
				if (i==199) {
				Assert.fail(e.getMessage());	
				}
			}
		}
		  				
}
    @And("^User Click Ok button in Warning pop up Message in Approve Screen$")
    public void user_click_ok_button_in_warning_pop_up_message_in_approve_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				if (chequeBookRequestObj.closeIconInWarningPopUpcancelScreen().isDisplayed()) {
					seleniumActions.getClickAndActionsHelper()
					.moveToElement(chequeBookRequestObj.closeIconInWarningPopUpcancelScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(chequeBookRequestObj.closeIconInWarningPopUpcancelScreen());
			break;
				}
				
		
			} catch (Exception e) {
				if (i==199) {
				Assert.fail(e.getMessage());	
				}
			}
		}
    }
  //**********************************************Submit****************************************************
    @And("^User Click Apply to Submit Sub Menu$")
    public void user_click_apply_to_submit_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.applyToSubmitSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.applyToSubmitSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.applyToSubmitSubMenu());
    }

    @And("^User Search Cheque Book Code in Apply to Submit Screen$")
    public void user_search_cheque_book_code_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInApplyToSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInApplyToSubmitScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInApplyToSubmitScreen());
		chequeBookRequestObj.searchChequeBookCodeInApplyToSubmitScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInApplyToSubmitScreen().sendKeys(Keys.ENTER);
		
    }

    @And("^User Select Cheque Book Code in Apply to Submit Screen$")
    public void user_select_cheque_book_code_in_apply_to_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInApplyToSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInApplyToSubmitScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInApplyToSubmitScreen());
    }

    @And("^User Click Apply to Submit button$")
    public void user_click_apply_to_submit_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.applyToSubmitButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.applyToSubmitButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.applyToSubmitButton());
    }

    @And("^User Submit Sub Menu$")
    public void user_submit_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.submitSubMenuInChequebookRequest());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.submitSubMenuInChequebookRequest());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.submitSubMenuInChequebookRequest());
		
    }

    @And("^User Search Cheque Book Code in Submit Screen$")
    public void user_search_cheque_book_code_in_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		chequeBookRequestObj.searchChequeBookCodeInSubmitScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInSubmitScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select Cheque Book Code in Submit Screen$")
    public void user_select_cheque_book_code_in_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());
    }

    @And("^User Click Submit button$")
    public void user_click_submit_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.submitButton());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.submitButton());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.submitButton());
    }
 //************************************Reversal Cancellation **************************************************************//
    @And("^User Click To Reverse Cancellation Sub Menu$")
    public void user_click_to_reverse_cancellation_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.toReverseCancellationSubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.toReverseCancellationSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.toReverseCancellationSubMenu());  
    }
    @And("^User Search the chequebook code in To Reverse Cancellation Screen$")
    public void user_search_the_chequebook_code_in_to_reverse_cancellation_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInToReverseCancellationScreen());
		chequeBookRequestObj.searchChequeBookCodeInToReverseCancellationScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInToReverseCancellationScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select the chequebook code in To Reverse Cancellation Screen$")
    public void user_select_the_chequebook_code_in_to_reverse_cancellation_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInToReverseCancellationScreen());
		
    }

    @And("^User Click Reverse button in To Reverse Cancellation Screen$")
    public void user_click_reverse_button_in_to_reverse_cancellation_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.reverseButtonInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.reverseButtonInToReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.reverseButtonInToReverseCancellationScreen());
    }

    @And("^User Click Approve Cancellation Reversal Sub Menu$")
    public void user_click_approve_cancellation_reversal_sub_menu() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.reverseButtonInToReverseCancellationScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.reverseButtonInToReverseCancellationScreen());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }

    @And("^User Search the chequebook code in Approve Cancellation Reversal Screen$")
    public void user_search_the_chequebook_code_in_approve_cancellation_reversal_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInApproveCancellationReversalScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancellationReversalScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancellationReversalScreen());
		chequeBookRequestObj.searchChequeBookCodeInApproveCancellationReversalScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInApproveCancellationReversalScreen().sendKeys(Keys.ENTER);
    }

    @And("^User Select the chequebook code in Approve Cancellation Reversal Screen$")
    public void user_select_the_chequebook_code_in_approve_cancellation_reversal_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInApproveCancellationReversalScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInApproveCancellationReversalScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.selectChequeBookCodeInApproveCancellationReversalScreen());
    }

    @And("^User Click Reverse button in Approve Cancellation Reversal Screen$")
    public void user_click_reverse_button_in_approve_cancellation_reversal_screen() throws Throwable {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.reverseButtonInApproveCancellationReversalScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.reverseButtonInApproveCancellationReversalScreen());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
    }
    @Then("^User Validate the Reversed Cancellation chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_reversed_cancellation_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
		
    }
    

    @And("^User Search the Reversed Cancellation chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_the_reversed_cancellation_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toReverseCancellationRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.toReverseCancellationRecordValidationInCBMaintenance().isDisplayed());
    }
    
    @Then("^User Validate the To be Cancelled chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_to_be_cancelled_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeCancelledRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.toBeCancelledRecordValidationInCBMaintenance().isDisplayed());
    }

    @And("^User Search the To be Cancelled  chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_the_to_be_cancelled_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
    	
    }

    @And("^User Click Approve button in Send Alert To Reverse Cancellation Screen$")
    public void user_click_approve_button_in_send_alert_to_reverse_cancellation_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveButtonInSendAlertReverseCancellationScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveButtonInSendAlertReverseCancellationScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveButtonInSendAlertReverseCancellationScreen());
    }

    @And("^User Enter BM User Name in User Information pop up$")
    public void user_enter_bm_user_name_in_user_information_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.userNameInUserInformatioPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.userNameInUserInformatioPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.userNameInUserInformatioPopUp());
		chequeBookRequestObj.userNameInUserInformatioPopUp().sendKeys(testData.get("ChequeBookCode"));
		
    }

    @And("^User Enter BM Password in User Information pop up$")
    public void user_enter_bm_password_in_user_information_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.passwordInUserInformatioPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.passwordInUserInformatioPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.passwordInUserInformatioPopUp());
		chequeBookRequestObj.passwordInUserInformatioPopUp().sendKeys(testData.get("ChequeBookCode"));
		
    }

    @And("^User Click Submit button in User Information pop up$")
    public void user_click_submit_button_in_user_information_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.submitButtonInUserInformatioPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.submitButtonInUserInformatioPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.submitButtonInUserInformatioPopUp());
    }

    @And("^User Click Approve button in approve item pop up$")
    public void user_click_approve_button_in_approve_item_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveButtonInApproveItemPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveButtonInApproveItemPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveButtonInApproveItemPopUp());
    }
    @And("^User Click Reject button in approve item pop up$")
    public void user_click_reject_button_in_approve_item_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectButtonInApproveItemPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectButtonInApproveItemPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectButtonInApproveItemPopUp());
    }
    
    @And("^User Click To Reverse Cancellation Batch Sub Menu$")
    public void user_click_to_reverse_cancellation_batch_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toReverseCancellationBatchSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.toReverseCancellationBatchSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.toReverseCancellationBatchSubMenu());
    }

    @And("^User Click the Retrieve button in To Reverse Cancellation Batch Screen$")
    public void user_click_the_retrieve_button_in_to_reverse_cancellation_batch_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.retrievebuttonInToReverseCancellationBatchScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.retrievebuttonInToReverseCancellationBatchScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.retrievebuttonInToReverseCancellationBatchScreen());
    }

    @And("^User Select the Chequebook code in To Reverse Cancellation Batch Screen$")
    public void user_select_the_chequebook_code_in_to_reverse_cancellation_batch_screen() throws Throwable {
        String xpath = "//td[text()='"+testData.get("ChequeBookCode")+"']/preceding-sibling::td[@id='td_chequeBookBulkCancelGridTbl_Id_Q000BTQ_0_cb']/input";
        for (int i = 0; i < 200; i++) {
        	try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    }

    @And("^User Click Reverse button in To Reverse Cancellation Batch Screen$")
    public void user_click_reverse_button_in_to_reverse_cancellation_batch_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.reversebuttonInToReverseCancellationBatchScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.reversebuttonInToReverseCancellationBatchScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.reversebuttonInToReverseCancellationBatchScreen());  
    }
    
    @Then("^User Validate the To Reverse Cancellation chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_to_reverse_cancellation_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
    }

    @And("^User Search To Reverse Cancellation chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_to_reverse_cancellation_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toReverseCancellationRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.toReverseCancellationRecordValidationInCBMaintenance().isDisplayed());
    }
    
    @And("^User Click Approve Reversal of Cancellation Batch Sub Menu$")
    public void user_click_approve_reversal_of_cancellation_batch_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveReversalOfCancellationBatchSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveReversalOfCancellationBatchSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveReversalOfCancellationBatchSubMenu());
    }

    @And("^User Click the Retrieve button in Approve Reversal of Cancellation Batch Screen$")
    public void user_click_the_retrieve_button_in_approve_reversal_of_cancellation_batch_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    }

    @And("^User Select the Chequebook code in Approve Reversal of Cancellation Batch Screen$")
    public void user_select_the_chequebook_code_in_approve_reversal_of_cancellation_batch_screen() throws Throwable {
    	String xpath = "//td[text()='"+testData.get("ChequeBookCode")+"']/preceding-sibling::td[@id='td_chequeBookBulkCancelGridTbl_Id_Q000BAQ_0_cb']/input";
        for (int i = 0; i < 200; i++) {
        	try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
			
		}
    }

    @And("^User Click Approve Reverse button in Approve Reversal of Cancellation Batch Screen$")
    public void user_click_approve_reverse_button_in_approve_reversal_of_cancellation_batch_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveReverseButtonInApproveReversalOfCancellationBatch());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveReverseButtonInApproveReversalOfCancellationBatch());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveReverseButtonInApproveReversalOfCancellationBatch());
    }
 
//****************************************************CHB_102****************************************************//
    @And("^User Click Reverse Chequebook Sub Menu$")
    public void user_click_reverse_chequebook_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.reverseChequeBookSubMenu());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.reverseChequeBookSubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.reverseChequeBookSubMenu());
    }

    @And("^User Search ChequeBook Code in Reverse Chequebook Screen$")
    public void user_search_chequebook_code_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen());
		chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen().sendKeys(Keys.ENTER);
		for (int i = 0; i <200; i++) {
			try {
				chequeBookRequestObj.selectChequeBookCodeInApproveScreen().getText().equalsIgnoreCase(testData.get("ChequeBookCode"));
				System.out.println(chequeBookRequestObj.selectChequeBookCodeInApproveScreen().getText());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail("Cheque book code not found ");
				}
			}
		}
    }

    @And("^User Select the Chequebook code in Reverse Chequebook Screen$")
    public void user_select_the_chequebook_code_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInReverseChequeBookScreen());
    }

    @And("^User Click Reject button in Reverse Chequebook Screen$")
    public void user_click_reject_button_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectButtonReverseChequeBookScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectButtonReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectButtonReverseChequeBookScreen());
    }

    @And("^User Validate Reject Reason Missing Pop up in Reverse Chequebook Screen$")
    public void user_validate_reject_reason_missing_pop_up_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectReasonPopupValidationReverseChequeBookScreen());
    	Assert.assertTrue(chequeBookRequestObj.rejectReasonPopupValidationReverseChequeBookScreen().isDisplayed());
    }

    @And("^User Click Ok button in Cannot Proceed Pop up in Reverse Chequebook Screen$")
    public void user_click_ok_button_in_cannot_proceed_pop_up_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.okButtonInCannotProceedPopupReverseChequeBookScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.okButtonInCannotProceedPopupReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.okButtonInCannotProceedPopupReverseChequeBookScreen());
    }

    @And("^User Enter Reason for rejecting reverse chequebook record in Reverse Chequebook Screen$")
    public void user_enter_reason_for_rejecting_reverse_chequebook_record_in_reverse_chequebook_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.rejectReasonFieldInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectReasonFieldInReverseChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectReasonFieldInReverseChequeBookScreen());
		chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen().sendKeys(testData.get("Reason"));
    }
    @Then("^User Validate the Rejected chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_rejected_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectedRecordValidationInCBMaintenance());
    	Assert.assertTrue(chequeBookRequestObj.rejectedRecordValidationInCBMaintenance().isDisplayed());
    }

    @And("^User Search Rejected chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_rejected_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
    }
  //************************************************************CHB_103************************************************
    @And("^User Click Reject button in Approve Screen$")
    public void user_click_reject_button_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.rejectButtonInApproveScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectButtonInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectButtonInApproveScreen());
    }

    @And("^User Validate Reject Reason Missing Pop up in Approve Screen$")
    public void user_validate_reject_reason_missing_pop_up_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectReasonPopupValidationInApproveChequeBookScreen());
    	Assert.assertTrue(chequeBookRequestObj.rejectReasonPopupValidationInApproveChequeBookScreen().isDisplayed());
    }

    @And("^User Click Ok button in Cannot Proceed Pop up in Approve Screen$")
    public void user_click_ok_button_in_cannot_proceed_pop_up_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.okButtonInCannotProceedPopupInApproveChequeBookScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.okButtonInCannotProceedPopupInApproveChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.okButtonInCannotProceedPopupInApproveChequeBookScreen());
    }

    @And("^User Enter Reason for rejecting reverse chequebook record in Approve Screen$")
    public void user_enter_reason_for_rejecting_reverse_chequebook_record_in_approve_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.rejectReasonFieldInApproveScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectReasonFieldInApproveScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectReasonFieldInApproveScreen());
		chequeBookRequestObj.rejectReasonFieldInApproveScreen().sendKeys(testData.get("Reason"));
    }
    //********************************************************CHB_114****************************************************//
    @And("^User Click Reject Button in Approve Cancel Screen$")
    public void user_click_reject_button_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectButtonInApproveCancelScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectButtonInApproveCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectButtonInApproveCancelScreen());
    }

    @And("^User Validate Reject Reason Missing Pop up in Approve Cancel Screen$")
    public void user_validate_reject_reason_missing_pop_up_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectReasonPopupValidationInApproveCancelChequeBookScreen());
    	Assert.assertTrue(chequeBookRequestObj.rejectReasonPopupValidationInApproveCancelChequeBookScreen().isDisplayed());
    }
    @And("^User Click Ok button in Cannot Proceed Pop up in Approve Cancel Screen$")
    public void user_click_ok_button_in_cannot_proceed_pop_up_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.okButtonInCannotProceedPopupInApproveCancelChequeBookScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.okButtonInCannotProceedPopupInApproveCancelChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.okButtonInCannotProceedPopupInApproveCancelChequeBookScreen());
    }

    @And("^User Enter Reason for rejecting reverse chequebook record in Approve Cancel Screen$")
    public void user_enter_reason_for_rejecting_reverse_chequebook_record_in_approve_cancel_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.rejectReasonFieldInApproveCancelChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectReasonFieldInApproveCancelChequeBookScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectReasonFieldInApproveCancelChequeBookScreen());
		chequeBookRequestObj.searchChequeBookCodeInReverseChequeBookScreen().sendKeys(testData.get("Reason"));
    }
}
    
    


