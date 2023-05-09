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
	
	
	
	
	
	
	
}