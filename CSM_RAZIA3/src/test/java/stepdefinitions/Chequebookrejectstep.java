package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;import com.google.inject.Key;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.CSM_Chequebookrejectobj;
import resources.BaseClass;

public class Chequebookrejectstep  extends BaseClass{
	WebDriver  driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
	WaitHelper waitHelper = new WaitHelper(driver) ;
	ClicksAndActionsHelper clicksAdActionsHelper =  new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Action = new Selenium_Actions(driver);
	CSM_Chequebookrejectobj  CSMChequebookreject = new CSM_Chequebookrejectobj(driver);
	CSMLogin login  = new CSMLogin(driver);
//	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
//	ExcelData cSMChequeBookrequestExcelData= new ExcelData(path,"CSM_ChequeBookrequest","DataSet ID");
//	Map<String, String> testData;

	    @Then("^Click the approve cancel button under chequebookrequest$")
	    public void click_the_approve_cancel_button_under_chequebookrequest() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookreject.CSM_ChequebookRequest_Approvecancel());
			 clicksAdActionsHelper.moveToElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel());
			 clicksAdActionsHelper.clickOnElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel());	  	 
		 	
	    	
	     }
	    @And("^Search the Code and select the existingrecord under approve cancel$")
	    public void search_the_code_and_select_the_existingrecord_under_approve_cancel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Code());
			 clicksAdActionsHelper.moveToElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Code());
			 clicksAdActionsHelper.clickOnElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Code());	
			 CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Code().sendKeys("987",Keys.ENTER);
	       
	    }

	    @And("^double tab the existing record in under approvecancel$")
	    public void double_tab_the_existing_record_in_under_approvecancel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab());
			 clicksAdActionsHelper.moveToElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab());
			 clicksAdActionsHelper.clickOnElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab());	
			// CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_to_Becontinue_Doubletab().click();
	    
	    }
	    
	    @And("^enter the Reason under the approvecancel$")
	    public void enter_the_reason_under_the_approvecancel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reason());
			 clicksAdActionsHelper.moveToElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reason());
			 clicksAdActionsHelper.clickOnElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reason());
			 CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reason().sendKeys("give reason");
		  
	    }
	    
	       
	    @Then("^Click the reject button under approve cancel$")
	    public void click_the_reject_button_under_approve_cancel() throws Throwable {
	    	waitHelper.waitForElementwithFluentwait(driver, CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reject());
			 clicksAdActionsHelper.moveToElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reject());
			 clicksAdActionsHelper.clickOnElement(CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reject());
			 //CSMChequebookreject.CSM_ChequebookRequest_Approvecancel_Reject().click();
	       
	    }

	  
	    

}
