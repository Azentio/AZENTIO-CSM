package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CSM_CB_DestroytheRecord;
import resources.BaseClass;

public class CSM_CB_DestroytheRecord_steps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	CSM_CB_DestroytheRecord csmChequeBookRequestdestoryobj = new CSM_CB_DestroytheRecord(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	CSMLogin login = new CSMLogin(driver);

	@Given("^navigate to CSM application and login with valid credentials$")
	public void navigate_to_csm_application_and_login_with_valid_credentials() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication();

	}

	@And("^Click the ChequeBook request under CSM application$")
	public void click_the_chequebook_request_under_csm_application() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest());
		clicksAndActionsHelper.moveToElement(csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest());
		csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest().click();
		Thread.sleep(3000);
	}

	@And("^click the todestory button$")
	public void click_the_todestory_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest());
		clicksAndActionsHelper.moveToElement(csmChequeBookRequestdestoryobj.getCsm_CB_ToBeDestoy());
		csmChequeBookRequestdestoryobj.getCsm_CB_ToBeDestoy().click();
	}
	
//	 @And("^Click on search existing checkbook record$")
//	 public void click_on_search_existing_checkbook_record() throws Throwable {
//		 waitHelper.waitForElementwithFluentwait(driver, csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest());
//			clicksAndActionsHelper.moveToElement(csmChequeBookRequestdestoryobj.getTobedestory_searchcode_click());
//		 csmChequeBookRequestdestoryobj.getTobedestory_searchcode_click().click();
//	    }

	@And("^search a existing checkbook record$")
	public void search_a_existing_checkbook_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmChequeBookRequestdestoryobj.getCsm_chequeBookRequest());
		clicksAndActionsHelper.moveToElement(csmChequeBookRequestdestoryobj.getCsm_CB_code());
		csmChequeBookRequestdestoryobj.getCsm_CB_code().sendKeys("614");
		csmChequeBookRequestdestoryobj.getCsm_CB_code().sendKeys(Keys.ENTER);
	}

	@Then("^double click the approve option$")
	public void double_click_the_approve_option() throws Throwable {
		Actions act = new Actions(driver);
		act.doubleClick(csmChequeBookRequestdestoryobj.getSearchcodeAfter_Approve()).perform();
	}

	@Then("^Click the to be destory button under ChequeBook request$")
	public void click_the_to_be_destory_button_under_chequebook_request() throws Throwable {
		csmChequeBookRequestdestoryobj.getCsm_CB_ToBeDestoy().click();
	}

}
