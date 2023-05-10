package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.csm.ChequebookReqBulkDestroy;
import resources.BaseClass;

public class CSM_ChequebookReqBulDes extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	ChequebookReqBulkDestroy chequebookRequestObj = new ChequebookReqBulkDestroy(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@And("^Click the Chequebook Request flag$")
	public void click_the_chequebook_request_flag() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ChequebookRequest_Flag());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ChequebookRequest_Flag());
		chequebookRequestObj.ChequebookRequest_Flag().click();
	}
	
	@Then("^Click the Bulk Destroy under Chequebook Request$")
    public void click_the_bulk_destroy_under_chequebook_request() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ChequebookRequest_BulkDestroy());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ChequebookRequest_BulkDestroy());
		chequebookRequestObj.ChequebookRequest_BulkDestroy().click();
	}
	
	@Then("^Click the retrieve button under Bulk Destroy$")
    public void click_the_retrieve_button_under_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.BulkDestroy_Retrieve());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.BulkDestroy_Retrieve());
		chequebookRequestObj.BulkDestroy_Retrieve().click();
	}
	
	@And("^Choose the existing record under Bulk Destroy$")
    public void choose_the_existing_record_under_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.BulkDestroy_FirstCheckbox());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.BulkDestroy_FirstCheckbox());
		chequebookRequestObj.BulkDestroy_FirstCheckbox().click();
	}
	
	@Then("^Destroy the record by clicking To Destroy button under Bulk Destroy$")
    public void destroy_the_record_by_clicking_to_destroy_button_under_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,chequebookRequestObj.BulkDestroy_ToDestroy());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.BulkDestroy_ToDestroy());
		chequebookRequestObj.BulkDestroy_ToDestroy().click();
    }
	
	@And("^Navigate to Approve Reject Bulk Destroy$")
    public void navigate_to_approve_reject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ChequeBook_ApproveReject());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ApproveReject_ToDestroy());
		chequebookRequestObj.ApproveReject_ToDestroy().click();
	}
	
	@Then("^Click the retrieve button under Approve Reject Bulk Destroy$")
    public void click_the_retrieve_button_under_approve_reject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ApproveReject_Retrieve());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ApproveReject_Retrieve());
		chequebookRequestObj.ApproveReject_Retrieve().click();
	}
	
	@And("^Click the search icon under Approve Reject Bulk Destroy$")
    public void click_the_search_icon_under_approvereject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ApproveReject_SearchIcon());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ApproveReject_SearchIcon());
		chequebookRequestObj.ApproveReject_SearchIcon().click();
		
	}
	
	@Then("^Click the Search Box under Approve Reject Bulk Destroy$")
    public void click_the_search_box_under_approvereject_bulk_destroy() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequebookRequestObj.ApproveReject_SearchBox());
		clicksAndActionsHelper.moveToElement(chequebookRequestObj.ApproveReject_SearchBox());
		chequebookRequestObj.ApproveReject_SearchBox().click();
		
	}
}
	
	
	
	
	