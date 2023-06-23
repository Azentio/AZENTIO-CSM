package stepdefinitions; 

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_Chequebook_RejectObj;
import resources.BaseClass;

public class CSM_ChequebookRejectSteps extends BaseClass  {
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSM_Chequebook_RejectObj ChequebookRejectObj = new CSM_Chequebook_RejectObj(driver);
	CSMLogin login  = new CSMLogin(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
    ExcelData CSM_TransactionsStepsExcelData = new ExcelData(path,"CSM_ChequeBookrequest","DataSet ID");
    Map<String, String> testData;

	@Given("^Navigate to CSM application and login with valid credentials$")
    public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configfilereader.getCSMApplicationUrl());
    	login.loginIntoCSMApplication();
    }

    @And("^User_612 update test data set id for CHB_115$")
    public void User_update_test_data_set_id_for_CHB_115() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_115_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_116$")
    public void User_update_test_data_set_id_for_CHB_116() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_116_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_164$")
    public void User_update_test_data_set_id_for_CHB_164() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_164_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_165$")
    public void User_update_test_data_set_id_for_CHB_165() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_165_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_166$")
    public void User_update_test_data_set_id_for_CHB_166() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_166_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_167$")
    public void User_update_test_data_set_id_for_CHB_167() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_167_D1");
	 
    }
    @And("^User_612 update test data set id for CHB_168$")
    public void User_update_test_data_set_id_for_CHB_168() throws Throwable {
    	testData = CSM_TransactionsStepsExcelData.getTestdata("CHB_168_D1");
	 
    }
	 @And("^Click the chequebook request flag under CSM$")
	    public void click_the_chequebook_request_flag_under_csm() throws Throwable {
		 waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_flag());
		 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_flag());
		 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_flag());
			
	    }

    @Then("^Click the approve cancel button under chequebook request$")
    public void click_the_approve_cancel_button_under_chequebook_request() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel());
		 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel());
		 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel());
		 
    	 
    }

       
    @And("^Search the Code and select the existing record under approve cancel$")
    public void search_the_code_and_select_the_existing_record_under_approve_cancel() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Code());
		 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Code());
		 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Code());
		ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Code().sendKeys(testData.get("CODE_D1"),Keys.ENTER);
		//ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Code().sendKeys("987",Keys.ENTER);
		       
    }
    @And("^double tab the existing record under approve cancel$")
    public void double_tab_the_existing_record_under_approve_cancel() throws Throwable {
    	 for (int i = 0; i <200; i++) {
		try {
			clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab());  
			 clicksAdActionsHelper.doubleClick(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab());
			 break;
		} catch (Exception e) {
			if (i==199) {
				Assert.fail(e.getMessage());
			}
		}	
		}
		 
		 for (int i = 0; i <200; i++) {
			try {
				ChequebookRejectObj.closeIconInViewMemoPopup().click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @Then("^Click the reject that record by clicking the reject button under approve cancel$")
    public void click_the_reject_that_record_by_clicking_the_reject_button_under_approve_cancel() throws Throwable {
    	
    	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());
		 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());
		 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());
		 ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject().click();
		 
          }

@And("^click the ok  popmsg when enter reject that record$")
public void click_the_ok_popmsg_when_enter_reject_that_record() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject_popup());
	 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject_popup());
	 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject_popup());
	
	}

@And("^enter the reason under approve cancel$")
public void enter_the_reason_under_approve_cancel() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reason());
	 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reason());
	 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reason());
	 //ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reason().sendKeys("the  reason");
	 ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reason().sendKeys(testData.get("Reason_D1"));
	 
	}

@Then("^Click the reject that record by clicking the reject button under approve cancell$")
public void click_the_reject_that_record_by_clicking_the_reject_button_under_approve_cancell() throws Throwable {
	waitHelper.waitForElementwithFluentwait(driver, ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());
	 clicksAdActionsHelper.moveToElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());
	 clicksAdActionsHelper.clickOnElement(ChequebookRejectObj.CSM_ChequebookRequest_Approvecancel_Reject());

}
}





