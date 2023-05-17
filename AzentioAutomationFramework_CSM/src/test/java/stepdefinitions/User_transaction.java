package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Transaction_Suspend;
import resources.BaseClass;

public class User_transaction {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Transaction_Suspend Transaction_Suspendobj = new Transaction_Suspend(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\ININDC00075\\git\\AZENTIO-CSM_sridhar10\\AzentioAutomationFramework_CSM\\TestData\\CSM_Transaction", "User_Transaction", "Data Set ID");
	
	
	@Given("^User login to CSM Param application$")
    public void user_login_to_csm_param_application() throws Throwable {
		driver.get(configFileReader.getCSMparamsUrl());
        login.loginIntoCSMParamApplication();
    }

    @And("^click the parameter under transaction$")
    public void click_the_parameter_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.Parameters12(), 60, 2);
    	//ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.Parameters12());
    	//ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.Parameters12());
    	for (int i = 0; i < 50; i++) {
			try {
				Assert.assertTrue(Transaction_Suspendobj.Parameters12().isDisplayed());		
				Transaction_Suspendobj.Parameters12().click();
				break;
			} catch (Exception e) {
				if (i==50) {
					Assert.fail();
				}
			}
		}

	}
    	
    

    @And("^click the System parameter under transaction$")
    public void click_the_system_parameter_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.SystemParameters(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.SystemParameters());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.SystemParameters());
    	Transaction_Suspendobj.SystemParameters().click();
    }

    @And("^click the user under transaction$")
    public void click_the_user_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.User_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.User_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.User_Transaction());
    	Transaction_Suspendobj.User_Transaction().click();
    }

    @And("^click the update after approve under transaction$")
    public void click_the_update_after_approve_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.UpdateafterApprove_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.UpdateafterApprove_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.UpdateafterApprove_Transaction());
    	Transaction_Suspendobj.UpdateafterApprove_Transaction().click();
    }

    @And("^enter the value user Id in under transaction$")
    public void enter_the_value_user_id_in_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.UserId_transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.UserId_transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.UserId_transaction());
    	Transaction_Suspendobj.UserId_transaction().click();
    	Transaction_Suspendobj.UserId_transaction().sendKeys(testData.get("UserId"));
    }

    @And("^click the Populate user under transaction$")
    public void click_the_populate_user_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.PopulateUser_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.PopulateUser_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.PopulateUser_Transaction());
    	Transaction_Suspendobj.PopulateUser_Transaction().click();
    }

    @And("^click the Maintenance under transaction$")
    public void click_the_maintenance_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.Maintenance_transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.Maintenance_transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.Maintenance_transaction());
    	Transaction_Suspendobj.Maintenance_transaction().click();
    }

    @And("^enter the code value under transaction$")
    public void enter_the_code_value_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.Populationcode_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.Populationcode_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.Populationcode_Transaction());
    	Transaction_Suspendobj.Populationcode_Transaction().click(); 
    	Transaction_Suspendobj.Populationcode_Transaction().sendKeys("Code");
    }

    @And("^click the Suspend button under transaction$")
    public void click_the_suspend_button_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.PopulateUser_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.PopulateUser_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.PopulateUser_Transaction());
    	Transaction_Suspendobj.PopulateUser_Transaction().click();
    }

    @And("^click the update button under transaction$")
    public void click_the_update_button_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.Update_Transaction(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.Update_Transaction());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.Update_Transaction());
    	Transaction_Suspendobj.Update_Transaction().click();
    }

    @And("^click the popup msg in ok$")
    public void click_the_popup_msg_in_ok() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.popup_msg(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.popup_msg());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.popup_msg());
    	Transaction_Suspendobj.popup_msg().click();
    }

    @And("^ok done in under transaction$")
    public void ok_done_in_under_transaction() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Transaction_Suspendobj.popup_msg(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(Transaction_Suspendobj.popup_msg());
    	ClicksAndActionsHelperobj.clickOnElement(Transaction_Suspendobj.popup_msg());
    	Transaction_Suspendobj.popup_msg().click();
    }
}
