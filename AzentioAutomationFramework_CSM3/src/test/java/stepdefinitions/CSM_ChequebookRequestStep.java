package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM.CSM_ChequebookRequestObj;
import pageobjects.CSM.ChequeBookRequestObj;
import resources.BaseClass;

public class CSM_ChequebookRequestStep extends BaseClass{
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSMLogin login = new CSMLogin(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clickandactionhelper = new ClicksAndActionsHelper(driver);
	//CSM_Passbook_OBJ csmPassbookObject = new CSM_Passbook_OBJ(driver);
	CSM_ChequebookRequestObj csmChequebookReqestObject = new CSM_ChequebookRequestObj(driver);
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	SoftAssert softassert = new SoftAssert();
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData csmTransactionsExcelData = new ExcelData(path,"ChequebookRequest","DatasetID");
	Map<String, String> testData;
	
	@Given("^user login as csm core application$")
    public void user_login_as_csm_core_application() throws Throwable {
		String csmApplicationUrl = configFileReader.getCSMApplicationUrl();
		driver.get(csmApplicationUrl);
		login.loginIntoCSMApplication();
    }

    @And("^user update test data set id for CHB_014$")
    public void user_update_test_data_set_id_for_chb014() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_014");
    }

    @And("^Navigate to Chequebook request section$")
    public void navigate_to_chequebook_request_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookRequestSection());
    	csmChequebookReqestObject.csm_ChequebookRequestSection().click();
    }

    @And("^Navigate to Sent to branch page in chequebook request$")
    public void navigate_to_sent_to_branch_page_in_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SentToBranch());
    	csmChequebookReqestObject.csm_SentToBranch().click();
    }

    @And("^Search the particular code in sent to branch page$")
    public void search_the_particular_code_in_sent_to_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SentToBranch_CodeSearchField());
    	csmChequebookReqestObject.csm_SentToBranch_CodeSearchField().click();
    	csmChequebookReqestObject.csm_SentToBranch_CodeSearchField().sendKeys(testData.get("SendToBranchCode"));
    	csmChequebookReqestObject.csm_SentToBranch_CodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in sent to branch page$")
    public void click_on_the_particular_record_in_sent_to_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SentToBranch_FirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_SentToBranch_FirstRecord());
    }

    @And("^Click on Sent to branch button$")
    public void click_on_sent_to_branch_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SentToBranch_SentToBranchButton());
    	csmChequebookReqestObject.csm_SentToBranch_SentToBranchButton().click();
    }

    @And("^Navigate to Maintanence page in chequebook request$")
    public void navigate_to_maintanence_page_in_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookRequest_Maintenance());
    	csmChequebookReqestObject.csm_ChequebookRequest_Maintenance().click();
    }

    @And("^Click on Search icon in maintenance page$")
    public void click_on_search_icon_in_maintenance_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Maintenance_SearchButton());
    	for (int i = 0; i <= 500; i++) {
			try {
				csmChequebookReqestObject.csm_Maintenance_SearchButton().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}	
    }

    @And("^Search the particular code in maintenance page$")
    public void search_the_particular_code_in_maintenance_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Maintenance_FirstRecord());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Maintenance_CodeSearchField());
    	csmChequebookReqestObject.csm_Maintenance_CodeSearchField().click();
    	csmChequebookReqestObject.csm_Maintenance_CodeSearchField().sendKeys(testData.get("MaintenanceCode"));
    	csmChequebookReqestObject.csm_Maintenance_CodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Validate the record is present with sent to branch status$")
    public void validate_the_record_is_present_with_sent_to_branch_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Maintenance_SentToBranchText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_Maintenance_SentToBranchText().isDisplayed());
    }
    @And("^user update test data set id for CHB_015$")
    public void user_update_test_data_set_id_for_chb015() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_015");
    }

    @And("^Navigate to Received by branch page in chequebook request$")
    public void navigate_to_received_by_branch_page_in_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ReceivedByBranchSection());
    	csmChequebookReqestObject.csm_ReceivedByBranchSection().click();
    }

    @And("^Search the particular code in Received by branch page$")
    public void search_the_particular_code_in_received_by_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ReceivedByBranch_ChequebookCodeSearchField());
    	csmChequebookReqestObject.csm_ReceivedByBranch_ChequebookCodeSearchField().click();
    	csmChequebookReqestObject.csm_ReceivedByBranch_ChequebookCodeSearchField().sendKeys(testData.get("ReceivedByBranchChequebookCode"));
    	csmChequebookReqestObject.csm_ReceivedByBranch_ChequebookCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record chequebox in Received by branch page$")
    public void click_on_the_particular_record_chequebox_in_received_by_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ReceivedByBranch_FirstRecordCheckbox());
    	csmChequebookReqestObject.csm_ReceivedByBranch_FirstRecordCheckbox().click();
    }

    @And("^Click on Proceed button in Received by branch page$")
    public void click_on_proceed_button_in_received_by_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ReceivedByBranch_ProceedButton());
    	csmChequebookReqestObject.csm_ReceivedByBranch_ProceedButton().click();
    }

    @And("^Validate the record is present with Received by branch status$")
    public void validate_the_record_is_present_with_received_by_branch_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Maintenance_ReceivedByBranchText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_Maintenance_ReceivedByBranchText().isDisplayed());
    }
    @And("^user update test data set id for CHB_016$")
    public void user_update_test_data_set_id_for_chb016() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_016");
    }

    @And("^Navigate to In branch page in chequebook request$")
    public void navigate_to_in_branch_page_in_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_InBranchSection());
    	csmChequebookReqestObject.csm_InBranchSection().click();
    }

    @And("^Search the particular code in In branch page$")
    public void search_the_particular_code_in_in_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_InBranchCodeField());
    	csmChequebookReqestObject.csm_InBranchCodeField().click();
    	csmChequebookReqestObject.csm_InBranchCodeField().sendKeys(testData.get("ReceivedByBranchChequebookCode"));
    	csmChequebookReqestObject.csm_InBranchCodeField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in In branch page$")
    public void click_on_the_particular_record_in_in_branch_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_InBranchFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_InBranchFirstRecord());
    }

    @And("^Click on In branch button$")
    public void click_on_in_branch_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_InBranchButton());
    	csmChequebookReqestObject.csm_InBranchButton().click();
    }

    @And("^Validate the record is present with In branch status$")
    public void validate_the_record_is_present_with_in_branch_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_InBranchText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_InBranchText().isDisplayed());
    }
    @And("^user update test data set id for CHB_017$")
    public void user_update_test_data_set_id_for_chb017() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_017");
    }

    @And("^Navigate to Apply to submit section$")
    public void navigate_to_apply_to_submit_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit());
    	csmChequebookReqestObject.csm_ApplyToSubmit().click();
    }

    @And("^Search the particular code in Apply to submit$")
    public void search_the_particular_code_in_apply_to_submit() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit_FirstRecord());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit_CodeSearchField());
    	csmChequebookReqestObject.csm_ApplyToSubmit_CodeSearchField().click();
    	csmChequebookReqestObject.csm_ApplyToSubmit_CodeSearchField().sendKeys(testData.get("ApplyToSubmitCode"));
    	csmChequebookReqestObject.csm_ApplyToSubmit_CodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in Apply to submit$")
    public void click_on_the_particular_record_in_apply_to_submit() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit_FirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ApplyToSubmit_FirstRecord());
    }

    @And("^Click on Apply submit button$")
    public void click_on_apply_submit_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplySubmitButton());
    	csmChequebookReqestObject.csm_ApplySubmitButton().click();
    }

    @And("^Navigate to submit section$")
    public void navigate_to_submit_section() throws Throwable {
    	for (int i = 0; i <= 50; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit());
		    	csmChequebookReqestObject.csm_Submit().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
    	
    }

    @And("^Search the particular code in submit$")
    public void search_the_particular_code_in_submit() throws Throwable {
    	
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit_CodeSearchField());
    	csmChequebookReqestObject.csm_Submit_CodeSearchField().click();
    	csmChequebookReqestObject.csm_Submit_CodeSearchField().sendKeys(testData.get("SubmitCode"));
    	csmChequebookReqestObject.csm_Submit_CodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular code in submit$")
    public void click_on_the_particular_code_in_submit() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit_FirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_Submit_FirstRecord());
    }

    @And("^Click on Submit button in Submit section$")
    public void click_on_submit_button_in_submit_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SubmitButton());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_SubmitButton());
    }

    @And("^Validate the record is present with Submitted status$")
    public void validate_the_record_is_present_with_submitted_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SubmittedText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_SubmittedText().isDisplayed());
    }
    @And("^user update test data set id for CHB_018$")
    public void user_update_test_data_set_id_for_chb018() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_018");
    }

    @And("^Navigate to To cancel section$")
    public void navigate_to_to_cancel_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelSection());
    	csmChequebookReqestObject.csm_ToCancelSection().click();
    }

    @And("^Search the particular code in To Cancel$")
    public void search_the_particular_code_in_to_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelCodeSearchField());
    	csmChequebookReqestObject.csm_ToCancelCodeSearchField().click();
    	csmChequebookReqestObject.csm_ToCancelCodeSearchField().sendKeys(testData.get("ToCancelCode"));
    	csmChequebookReqestObject.csm_ToCancelCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in To Cancel$")
    public void click_on_the_particular_record_in_to_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ToCancelFirstRecord());
    }

    @And("^Select the Cancel reason in To Cancel$")
    public void select_the_cancel_reason_in_to_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelCancelReasonIcon());
    	csmChequebookReqestObject.csm_ToCancelCancelReasonIcon().click();
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelCancelReasonText());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ToCancelCancelReasonText());
    }

    @And("^Click on To Cancel button$")
    public void click_on_to_cancel_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToCancelToCancelButton());
    	csmChequebookReqestObject.csm_ToCancelToCancelButton().click();
    }

    @And("^Navigate to Approve Cancel section$")
    public void navigate_to_approve_cancel_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveCancelSection());
    	csmChequebookReqestObject.csm_ApproveCancelSection().click();
    }

    @And("^Search the particular code in Approve Cancel$")
    public void search_the_particular_code_in_approve_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveCancelCodeSearchField());
    	csmChequebookReqestObject.csm_ApproveCancelCodeSearchField().click();
    	csmChequebookReqestObject.csm_ApproveCancelCodeSearchField().sendKeys(testData.get("ApproveCancelCode"));
    	csmChequebookReqestObject.csm_ApproveCancelCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in Approve Cancel$")
    public void click_on_the_particular_record_in_approve_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveCancelFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ApproveCancelFirstRecord());
    }

    @And("^Click on Cancel button in Approve Cancel$")
    public void click_on_cancel_button_in_approve_cancel() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveCancelCancelButton());
    	csmChequebookReqestObject.csm_ApproveCancelCancelButton().click();
    }

    @And("^Validate the record is present with Cancelled status$")
    public void validate_the_record_is_present_with_cancelled_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_CancelledText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_CancelledText().isDisplayed());
    }
    @And("^user update test data set id for CHB_019$")
    public void user_update_test_data_set_id_for_chb019() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_019");
    }

    @And("^Navigate to To be destroyed section$")
    public void navigate_to_to_be_destroyed_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToBeDestroyedSection());
    	csmChequebookReqestObject.csm_ToBeDestroyedSection().click();
    }

    @And("^Search the particular code in To be destroyed$")
    public void search_the_particular_code_in_to_be_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToBeDestroyedCodeSearchField());
    	csmChequebookReqestObject.csm_ToBeDestroyedCodeSearchField().click();
    	csmChequebookReqestObject.csm_ToBeDestroyedCodeSearchField().sendKeys(testData.get("ToBeDestroyedCode"));
    	csmChequebookReqestObject.csm_ToBeDestroyedCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in To be destroyed$")
    public void click_on_the_particular_record_in_to_be_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToBeDestroyedFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ToBeDestroyedFirstRecord());
    }

    @And("^Enter the Cancel reason in To be destroyed$")
    public void enter_the_cancel_reason_in_to_be_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToBeDestroyedRemarksField());
    	csmChequebookReqestObject.csm_ToBeDestroyedRemarksField().click();
    	csmChequebookReqestObject.csm_ToBeDestroyedRemarksField().sendKeys(testData.get("ToBeDestroyedReason"));
    }

    @And("^Click on To Destroy button$")
    public void click_on_to_destroy_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToBeDestroyedToDestroyButton());
    	csmChequebookReqestObject.csm_ToBeDestroyedToDestroyButton().click();
    }

    @And("^Navigate to Approve Destroyed section$")
    public void navigate_to_approve_destroyed_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveDestroyedSection());
    	csmChequebookReqestObject.csm_ApproveDestroyedSection().click();
    }

    @And("^Search the particular code in Approve Destroyed$")
    public void search_the_particular_code_in_approve_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveDestroyedCodeSearchField());
    	csmChequebookReqestObject.csm_ApproveDestroyedCodeSearchField().click();
    	csmChequebookReqestObject.csm_ApproveDestroyedCodeSearchField().sendKeys(testData.get("ApproveDestroyedCode"));
    	csmChequebookReqestObject.csm_ApproveDestroyedCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in Approve Destroyed$")
    public void click_on_the_particular_record_in_approve_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveDestroyedFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ApproveDestroyedFirstRecord());
    }

    @And("^Click on Destroy buttonin Approve Destroyed$")
    public void click_on_destroy_buttonin_approve_destroyed() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApproveDestroyedDestroyButton());
    	csmChequebookReqestObject.csm_ApproveDestroyedDestroyButton().click();
    }

    @And("^Validate the record is present with Destroyed status$")
    public void validate_the_record_is_present_with_destroyed_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_DestroyedText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_DestroyedText().isDisplayed());
    }
    @And("^user update test data set id for CHB_020$")
    public void user_update_test_data_set_id_for_chb020() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_020");
    }

    @And("^Navigate to To Suspend section$")
    public void navigate_to_to_suspend_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToSuspendSection());
    	csmChequebookReqestObject.csm_ToSuspendSection().click();
    }

    @And("^Search the particular code in To Suspend$")
    public void search_the_particular_code_in_to_suspend() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToSuspendSectionCodeSearchField());
    	csmChequebookReqestObject.csm_ToSuspendSectionCodeSearchField().click();
    	csmChequebookReqestObject.csm_ToSuspendSectionCodeSearchField().sendKeys(testData.get("ToSuspendCode"));
    	csmChequebookReqestObject.csm_ToSuspendSectionCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in To Suspend$")
    public void click_on_the_particular_record_in_to_suspend() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToSuspendFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_ToSuspendFirstRecord());
    }

    @And("^Click on To Suspend button$")
    public void click_on_to_suspend_button() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ToSuspendToSuspendButton());
    	csmChequebookReqestObject.csm_ToSuspendToSuspendButton().click();
    }

    @And("^Navigate to Suspend section$")
    public void navigate_to_suspend_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SuspendSection());
    	csmChequebookReqestObject.csm_SuspendSection().click();
    }

    @And("^Search the particular code in Suspend$")
    public void search_the_particular_code_in_suspend() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SuspendCodeSearchField());
    	csmChequebookReqestObject.csm_SuspendCodeSearchField().click();
    	csmChequebookReqestObject.csm_SuspendCodeSearchField().sendKeys(testData.get("SuspendCode"));
    	csmChequebookReqestObject.csm_SuspendCodeSearchField().sendKeys(Keys.ENTER);
    }

    @And("^Click on the particular record in Suspend$")
    public void click_on_the_particular_record_in_suspend() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SuspendFirstRecord());
    	clickandactionhelper.doubleClick(csmChequebookReqestObject.csm_SuspendFirstRecord());
    }

    @And("^Click on Suspend button in Suspend$")
    public void click_on_suspend_button_in_suspend() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SuspendSuspendButton());
    	csmChequebookReqestObject.csm_SuspendSuspendButton().click();
    }

    @And("^Validate the record is present with Suspended status$")
    public void validate_the_record_is_present_with_suspended_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_SuspendedText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_SuspendedText().isDisplayed());
    }
    @And("^user update test data set id for CHB_046$")
    public void user_update_test_data_set_id_for_chb046() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_046");
    }

    @And("^Click on Request Information section$")
    public void click_on_request_information_section() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_RequestInformation());
    	csmChequebookReqestObject.csm_RequestInformation().click();
    }

    @And("^Validate Collected by field is disable in Submit screen$")
    public void validate_collected_by_field_is_disable_in_submit_screen() throws Throwable {
    	boolean status = false;
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit_RequestInformation_CollectedByField());
    	csmChequebookReqestObject.csm_Submit_RequestInformation_CollectedByField().click();
    	try
    	{
    		csmChequebookReqestObject.csm_Submit_RequestInformation_CollectedByField().sendKeys("abc");
    	} catch(Exception e) {
    		status = true;
    	}
    	Assert.assertTrue(status);	
    }
    @And("^user update test data set id for CHB_045$")
    public void user_update_test_data_set_id_for_chb045() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_045");
    }

    @And("^Validate that Collected by id field is editable in Apply to submit screen$")
    public void validate_that_collected_by_id_field_is_editable_in_apply_to_submit_screen() throws Throwable {
    	boolean status = true;
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByIDField());
    	csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByIDField().click();
    	try
    	{
    		csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByIDField().sendKeys("abc");
    	} catch(Exception e) {
    		status = true;
    	}
    	Assert.assertTrue(status);
    }
    @And("^user update test data set id for CHB_044$")
    public void user_update_test_data_set_id_for_chb044() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_044");
    }

    @And("^Validate that Collected by field is editable in Apply to submit screen$")
    public void validate_that_collected_by_field_is_editable_in_apply_to_submit_screen() throws Throwable {
    	boolean status = true;
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByField());
    	csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByField().click();
    	try
    	{
    		csmChequebookReqestObject.csm_ApplyToSubmit_RequestInformation_CollectedByField().sendKeys("abc");
    	} catch(Exception e) {
    		status = true;
    	}
    	Assert.assertTrue(status);
    }
    @And("^user update test data set id for CHB_042$")
    public void user_update_test_data_set_id_for_chb042() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_042");
    }

    @And("^Navigate to List section in Chequebook request$")
    public void navigate_to_list_section_in_chequebook_request() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookRequest_ListSection());
    	csmChequebookReqestObject.csm_ChequebookRequest_ListSection().click();
    }

    @And("^Enter Branch code in list page$")
    public void enter_branch_code_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_BranchCode());
    	csmChequebookReqestObject.csm_ChequebookList_BranchCode().click();
    	csmChequebookReqestObject.csm_ChequebookList_BranchCode().sendKeys(testData.get("ListBranchCode"));
    }

    @And("^Enter From CIF in list page$")
    public void enter_from_cif_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_FromCIF());
    	csmChequebookReqestObject.csm_ChequebookList_FromCIF().click();
    	csmChequebookReqestObject.csm_ChequebookList_FromCIF().sendKeys(testData.get("ListFromCIF"));
    }

    @And("^Enter To CIF in list page$")
    public void enter_to_cif_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToCIF());
    	csmChequebookReqestObject.csm_ChequebookList_ToCIF().click();
    	csmChequebookReqestObject.csm_ChequebookList_ToCIF().sendKeys(testData.get("ListToCIF"));
    }

    @And("^Enter Status as Active in list page$")
    public void enter_status_as_active_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusActive"));
    }

    @And("^Click on Retrieve button in list page$")
    public void click_on_retrieve_button_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_RetrieveButton());
    	csmChequebookReqestObject.csm_ChequebookList_RetrieveButton().click();
    }

    @And("^Validate the record is retrieved with Active status$")
    public void validate_the_record_is_retrieved_with_active_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ActiveText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ActiveText().isDisplayed());
    }

    @And("^Click on Parameters section in list page$")
    public void click_on_parameters_section_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Parameters());
    	csmChequebookReqestObject.csm_ChequebookList_Parameters().click();
    }

    @And("^Enter Status as Approved in list page$")
    public void enter_status_as_approved_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusApproved"));
    }

    @And("^Validate the record is retrieved with Approved status$")
    public void validate_the_record_is_retrieved_with_approved_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ApprovedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ApprovedText().isDisplayed());
    }

    @And("^Enter Status as Sent to Provider in list page$")
    public void enter_status_as_sent_to_provider_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusSentToProvider"));
    }

    @And("^Validate the record is retrieved with Sent to Provider status$")
    public void validate_the_record_is_retrieved_with_sent_to_provider_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_SentToProviderText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_SentToProviderText().isDisplayed());
    }

    @And("^Enter Status as Received from Provider in list page$")
    public void enter_status_as_received_from_provider_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusReceivedFromProvider"));
    }

    @And("^Validate the record is retrieved with Received from Provider status$")
    public void validate_the_record_is_retrieved_with_received_from_provider_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ReceivedFromProviderText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ReceivedFromProviderText().isDisplayed());
    }

    @And("^Enter Status as In Branch in list page$")
    public void enter_status_as_in_branch_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusInBranch"));
    }

    @And("^Validate the record is retrieved with In Branch status$")
    public void validate_the_record_is_retrieved_with_in_branch_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_InBranchText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_InBranchText().isDisplayed());
    }

    @And("^Enter Status as Send To Branch in list page$")
    public void enter_status_as_send_to_branch_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusSentToBranch"));
    }

    @And("^Validate the record is retrieved with Send To Branch status$")
    public void validate_the_record_is_retrieved_with_send_to_branch_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_SendToBranchText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_SendToBranchText().isDisplayed());
    }

    @And("^Enter Status as Apply To Submit in list page$")
    public void enter_status_as_apply_to_submit_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusApplyToSubmit"));
    }

    @And("^Validate the record is retrieved with Apply To Submit status$")
    public void validate_the_record_is_retrieved_with_apply_to_submit_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ApplyToSubmitText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ApplyToSubmitText().isDisplayed());
    }

    @And("^Enter Status as Submitted in list page$")
    public void enter_status_as_submitted_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusSubmitted"));
    }

    @And("^Validate the record is retrieved with Submitted status$")
    public void validate_the_record_is_retrieved_with_submitted_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_SubmittedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_SubmittedText().isDisplayed());
    }

    @And("^Enter Status as to cancel in list page$")
    public void enter_status_as_to_cancel_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusToBeCancelled"));
    }

    @And("^Validate the record is retrieved with to cancel status$")
    public void validate_the_record_is_retrieved_with_to_cancel_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToCancelText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToCancelText().isDisplayed());
    }

    @And("^Enter Status as cancelled in list page$")
    public void enter_status_as_cancelled_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusCancelled"));
    }

    @And("^Validate the record is retrieved with cancelled status$")
    public void validate_the_record_is_retrieved_with_cancelled_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_CancelledText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_CancelledText().isDisplayed());
    }

    @And("^Enter Status as to destroy in list page$")
    public void enter_status_as_to_destroy_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusToBeDestroyed"));
    }

    @And("^Validate the record is retrieved with to destroy status$")
    public void validate_the_record_is_retrieved_with_to_destroy_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToDestroyText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToDestroyText().isDisplayed());
    }

    @And("^Enter Status as destroyed in list page$")
    public void enter_status_as_destroyed_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusDestroyed"));
    }

    @And("^Validate the record is retrieved with destroyed status$")
    public void validate_the_record_is_retrieved_with_destroyed_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_DestroyedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_DestroyedText().isDisplayed());
    }

    @And("^Enter Status as to suspend in list page$")
    public void enter_status_as_to_suspend_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusSuspended"));
    }

    @And("^Validate the record is retrieved with to suspend status$")
    public void validate_the_record_is_retrieved_with_to_suspend_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToSuspendText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToSuspendText().isDisplayed());
    }

    @And("^Enter Status as suspended in list page$")
    public void enter_status_as_suspended_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusSuspended"));
    }

    @And("^Validate the record is retrieved with suspended status$")
    public void validate_the_record_is_retrieved_with_suspended_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_SuspendedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_SuspendedText().isDisplayed());
    }

    @And("^Enter Status as to reverse in list page$")
    public void enter_status_as_to_reverse_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("SuspendCode"));
    }

    @And("^Validate the record is retrieved with to reverse status$")
    public void validate_the_record_is_retrieved_with_to_reverse_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToReverseText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToReverseText().isDisplayed());
    }

    @And("^Enter Status as reversed in list page$")
    public void enter_status_as_reversed_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusToReverseCancellation"));
    }

    @And("^Validate the record is retrieved with reversed status$")
    public void validate_the_record_is_retrieved_with_reversed_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ReversedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ReversedText().isDisplayed());
    }

    @And("^Enter Status as To Reverse Cancellation in list page$")
    public void enter_status_as_to_reverse_cancellation_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusToReverseCancellation"));
    }

    @And("^Validate the record is retrieved with To Reverse Cancellation status$")
    public void validate_the_record_is_retrieved_with_to_reverse_cancellation_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToReverseCancellationText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToReverseCancellationText().isDisplayed());
    }

    @And("^Enter Status as to reactivate in list page$")
    public void enter_status_as_to_reactivate_in_list_page() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_Status());
    	csmChequebookReqestObject.csm_ChequebookList_Status().click();
    	csmChequebookReqestObject.csm_ChequebookList_Status().sendKeys(testData.get("ListStatusCancelledUnutilized"));
    }

    @And("^Validate the record is retrieved with to reactivate status$")
    public void validate_the_record_is_retrieved_with_to_reactivate_status() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookList_ToReactivateText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookList_ToReactivateText().isDisplayed());
    }
    @And("^Validate all status of list page$")
    public void validate_all_status_of_list_page() throws Throwable {
       softassert.assertAll();
    }
    @And("^user update test data set id for CHB_043$")
    public void user_update_test_data_set_id_for_chb043() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_043");
    }

    @And("^Navigate to Chequebook query screen$")
    public void navigate_to_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuerySection());
    	csmChequebookReqestObject.csm_ChequebookQuerySection().click();
    }

    @And("^Enter the Branch code in Chequebook query$")
    public void enter_the_branch_code_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuery_BranchCode());
    	csmChequebookReqestObject.csm_ChequebookQuery_BranchCode().click();
    	csmChequebookReqestObject.csm_ChequebookQuery_BranchCode().sendKeys(testData.get("ChequebookQueryBranchCode"));
    }

    @And("^Enter the Currency code in Chequebook query$")
    public void enter_the_currency_code_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuery_CurrencyCode());
    	csmChequebookReqestObject.csm_ChequebookQuery_CurrencyCode().click();
    	csmChequebookReqestObject.csm_ChequebookQuery_CurrencyCode().sendKeys(testData.get("ChequebookQueryCurrencyCode"));
    }

    @And("^Enter the GL code in Chequebook query$")
    public void enter_the_gl_code_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuery_GLCode());
    	csmChequebookReqestObject.csm_ChequebookQuery_GLCode().click();
    	csmChequebookReqestObject.csm_ChequebookQuery_GLCode().sendKeys(testData.get("ChequebookQueryGLCode"));
    }

    @And("^Enter the CIF code in Chequebook query$")
    public void enter_the_cif_code_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuery_CIFCode());
    	csmChequebookReqestObject.csm_ChequebookQuery_CIFCode().click();
    	csmChequebookReqestObject.csm_ChequebookQuery_CIFCode().sendKeys(testData.get("ChequebookQueryCIFCode"));
    }

    @And("^Enter the Serial in Chequebook query$")
    public void enter_the_serial_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQuery_Serial());
    	csmChequebookReqestObject.csm_ChequebookQuery_Serial().click();
    	csmChequebookReqestObject.csm_ChequebookQuery_Serial().sendKeys(testData.get("ChequebookQuerySerial"));
    }

    @And("^Click on Chequebook query header$")
    public void click_on_chequebook_query_header() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryHeader());
    	csmChequebookReqestObject.csm_ChequebookQueryHeader().click();
    }

    @And("^Validate the record with Active status in Chequebook query$")
    public void validate_the_record_with_active_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusActive"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ActiveText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ActiveText().isDisplayed());
    }

    @And("^Validate the record with Approved status in Chequebook query$")
    public void validate_the_record_with_approved_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusApproved"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ApprovedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ApprovedText().isDisplayed());
    }

    @And("^Validate the record with Sent to provider status in Chequebook query$")
    public void validate_the_record_with_sent_to_provider_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusSentToProvider"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_SentToProviderText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_SentToProviderText().isDisplayed());
    }

    @And("^Validate the record with Received from provider status in Chequebook query$")
    public void validate_the_record_with_received_from_provider_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusReceivedFromProvider"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ReceivedFromProviderText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ReceivedFromProviderText().isDisplayed());
    }

    @And("^Validate the record with In branch status in Chequebook query$")
    public void validate_the_record_with_in_branch_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusInBranch"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_InBranchText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_InBranchText().isDisplayed());
    }

    @And("^Validate the record with Sent to branch status in Chequebook query$")
    public void validate_the_record_with_sent_to_branch_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusSentToBranch"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_SendToBranchText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_SendToBranchText().isDisplayed());
    }

    @And("^Validate the record with Apply to submit status in Chequebook query$")
    public void validate_the_record_with_apply_to_submit_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusApplyToSubmit"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ApplyToSubmitText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ApplyToSubmitText().isDisplayed());
    }

    @And("^Validate the record with Submitted status in Chequebook query$")
    public void validate_the_record_with_submitted_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusSubmitted"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_SubmittedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_SubmittedText().isDisplayed());
    }

    @And("^Validate the record with To Cancel status in Chequebook query$")
    public void validate_the_record_with_to_cancel_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToCancel"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToCancelText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToCancelText().isDisplayed());
    }

    @And("^Validate the record with Cancelled status in Chequebook query$")
    public void validate_the_record_with_cancelled_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusCancelled"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_CancelledText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_CancelledText().isDisplayed());
    }

    @And("^Validate the record with To Destroy status in Chequebook query$")
    public void validate_the_record_with_to_destroy_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToDestroy"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToDestroyText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToDestroyText().isDisplayed());
    }

    @And("^Validate the record with Destroyed status in Chequebook query$")
    public void validate_the_record_with_destroyed_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusDestroyed"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_DestroyedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_DestroyedText().isDisplayed());
    }

    @And("^Validate the record with To Suspend status in Chequebook query$")
    public void validate_the_record_with_to_suspend_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToSuspend"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToSuspendText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToSuspendText().isDisplayed());
    }

    @And("^Validate the record with Suspended status in Chequebook query$")
    public void validate_the_record_with_suspended_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusSuspended"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_SuspendedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_SuspendedText().isDisplayed());
    }

    @And("^Validate the record with To Reverse status in Chequebook query$")
    public void validate_the_record_with_to_reverse_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToReverse"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReverseText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReverseText().isDisplayed());
    }

    @And("^Validate the record with Reversed status in Chequebook query$")
    public void validate_the_record_with_reversed_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusReversed"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ReversedText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ReversedText().isDisplayed());
    }

    @And("^Validate the record with To Reverse cancellation status in Chequebook query$")
    public void validate_the_record_with_to_reverse_cancellation_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToReverseCancellation"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReverseCancellationText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReverseCancellationText().isDisplayed());
    }

    @And("^Validate the record with To Reactivate status in Chequebook query$")
    public void validate_the_record_with_to_reactivate_status_in_chequebook_query() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatusField());
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().click();
    	csmChequebookReqestObject.csm_ChequebookQueryStatusField().sendKeys(testData.get("ChequebookQueryStatusToReactivate"));
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReactivateText());
    	softassert.assertTrue(csmChequebookReqestObject.csm_ChequebookQueryStatus_ToReactivateText().isDisplayed());
    }
    @And("^Validate all status of chequebookquery$")
    public void validate_all_status_of_chequebookquery() throws Throwable {
    	softassert.assertAll();
    }
    @Then("^User Validate the cancelled chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_cancelled_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.cancelledRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.cancelledRecordValidationInCBMaintenance().isDisplayed());
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

    @And("^User update Test data id for checking if the user is able to reverse cancellation with batch record$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_reverse_cancellation_with_batch_record() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_041");
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
		chequeBookRequestObj.userNameInUserInformatioPopUp().sendKeys(testData.get("BMUserName"));
    }

    @And("^User Enter BM Password in User Information pop up$")
    public void user_enter_bm_password_in_user_information_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.passwordInUserInformatioPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.passwordInUserInformatioPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.passwordInUserInformatioPopUp());
		chequeBookRequestObj.passwordInUserInformatioPopUp().sendKeys(testData.get("BMPassword"));
    }

    @And("^User Click Submit button in User Information pop up$")
    public void user_click_submit_button_in_user_information_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.submitButtonInUserInformatioPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.submitButtonInUserInformatioPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.submitButtonInUserInformatioPopUp());
    }

    @And("^User Click Reject button in approve item pop up$")
    public void user_click_reject_button_in_approve_item_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.rejectButtonInApproveItemPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.rejectButtonInApproveItemPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.rejectButtonInApproveItemPopUp());
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

    @And("^User Search the To be Cancelled  chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_the_to_be_cancelled_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeCancelledRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.toBeCancelledRecordValidationInCBMaintenance().isDisplayed());
    }
    @And("^User Search Cancelled chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_cancelled_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
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
    @Then("^User Validate the To be cancelled chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_to_be_cancelled_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
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

    @And("^User Click Approve button in approve item pop up$")
    public void user_click_approve_button_in_approve_item_pop_up() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approveButtonInApproveItemPopUp());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.approveButtonInApproveItemPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.approveButtonInApproveItemPopUp());
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
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    }

    @And("^User update Test data id for checking if the user is able to approve reverse cancellation with batch record$")
    public void user_update_test_data_id_for_checking_if_the_user_is_able_to_approve_reverse_cancellation_with_batch_record() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_040");
    }

    @And("^User Click Approve Reverse button in Approve Reversal of Cancellation Batch Screen$")
    public void user_click_approve_reverse_button_in_approve_reversal_of_cancellation_batch_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.retrieveButtonInApproveReversalOfCancellationBatchScreen());
    }
    @And("^user update test data set id for CHB_104$")
    public void user_update_test_data_set_id_for_chb104() throws Throwable {
    	testData = csmTransactionsExcelData.getTestdata("DS01_TC_CHB_104");
    }

    @And("^Click on the Reject button in Submit$")
    public void click_on_the_reject_button_in_submit() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit_RejectButton());
    	csmChequebookReqestObject.csm_Submit_RejectButton().click();
    }

    @And("^Validate the Missing reason code popup$")
    public void validate_the_missing_reason_code_popup() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, csmChequebookReqestObject.csm_Submit_MissingReasonCodeText());
    	Assert.assertTrue(csmChequebookReqestObject.csm_Submit_MissingReasonCodeText().isDisplayed());
    }
}

