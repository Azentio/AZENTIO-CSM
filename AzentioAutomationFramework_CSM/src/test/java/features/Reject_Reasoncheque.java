package features;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.ChequeBook_Cancel;
import pageobjects.Delete_chequeBook;
import pageobjects.Reason_Rejectchequebook;
import resources.BaseClass;
import stepdefinitions.CSMLogin;

public class Reject_Reasoncheque {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Reason_Rejectchequebook Reason_Rejectchequebookobj = new Reason_Rejectchequebook(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	 @Given("^User Login to CSM Application process$")
	    public void user_login_to_csm_param_application_process() throws Throwable {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
	    }

	    @Given("^User Login to CSM Param Application process$")
	    public void user_login_to_csm_application_process() throws Throwable {
	    	 driver.get(configFileReader.getCSMparamsUrl());
		        login.loginIntoCSMParamApplication();
	    }

	    @And("^Click the parameters in CSM Param$")
	    public void click_the_parameters_in_csm_param() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Parameters1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Parameters1());
	    	Reason_Rejectchequebookobj.Parameters1().click();
	    	
	    }

	    @And("^Click the System parameters in CSM Param$")
	    public void click_the_system_parameters_in_csm_param() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.SystemParameters(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.SystemParameters());
	    	Reason_Rejectchequebookobj.SystemParameters().click();
	    }

	    @And("^Click the Control Record$")
	    public void click_the_control_record() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Controlrecord(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Controlrecord());
	    	Reason_Rejectchequebookobj.Controlrecord().click();
	    }

	    @And("^Click the other information button$")
	    public void click_the_other_information_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.information(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.information());
	    	Reason_Rejectchequebookobj.information().click(); 
	    }

	    @And("^Click the cheque book button$")
	    public void click_the_cheque_book_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Chequebook2(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Chequebook2());
	    	Reason_Rejectchequebookobj.Chequebook2().click(); 
	    }

	    @And("^Click the Maintenance button$")
	    public void click_the_maintenance_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Maintenance12(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Maintenance12());
	    	Reason_Rejectchequebookobj.Maintenance12().click(); 
	    }

	    @And("^Enter the code Value$")
	    public void enter_the_code_value() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.code_Value(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.code_Value());
	    	Reason_Rejectchequebookobj.code_Value().click(); 
	    	Reason_Rejectchequebookobj.code_Value().sendKeys(testData.get("code")); 
	    	Reason_Rejectchequebookobj.code_Value().sendKeys(Keys.ENTER); 
	    }

	    @And("^Click the Save button$")
	    public void click_the_save_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Maintenance12(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Maintenance12());
	    	Reason_Rejectchequebookobj.Maintenance12().click(); 
	    }

	    @And("^Click the Approve Screen$")
	    public void click_the_approve_screen() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Approve11(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Approve11());
	    	Reason_Rejectchequebookobj.Approve11().click(); 
	    }

	    @And("^Click the Reject button$")
	    public void click_the_reject_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Rejectbutton(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Rejectbutton());
	    	Reason_Rejectchequebookobj.Rejectbutton().click(); 
	    }
	    @And("^Click the Approve Cancel Screen$")
	    public void click_the_approve_cancel_screen() throws Throwable {
	     	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Approvecancel(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Approvecancel());
	    	Reason_Rejectchequebookobj.Approvecancel().click(); 
	    }

	    @And("^Enter the cheque code value$")
	    public void enter_the_cheque_code_value() throws Throwable {
	     	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.ChequeCode_value(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.ChequeCode_value());
	    	Reason_Rejectchequebookobj.ChequeCode_value().click(); 
	    	Reason_Rejectchequebookobj.ChequeCode_value().sendKeys(testData.get("Chequecode")); 
	    	Reason_Rejectchequebookobj.ChequeCode_value().sendKeys(Keys.ENTER); 
	    }
	    @And("^Enter the code value1$")
	    public void enter_the_code_value1() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.code_Value(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.code_Value());
	    	Reason_Rejectchequebookobj.code_Value().click(); 
	    }
	    @And("^Click the Submit button$")
	    public void click_the_submit_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Reason_Rejectchequebookobj.Submitbutton(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Reason_Rejectchequebookobj.Submitbutton());
	    	Reason_Rejectchequebookobj.Submitbutton().click(); 
	    }
}
