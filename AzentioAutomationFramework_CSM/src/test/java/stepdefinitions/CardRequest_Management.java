package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Card_Management;
import resources.BaseClass;

public class CardRequest_Management {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	Card_Management Card_Managementobj = new Card_Management(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	 @Given("^User login Cards Management Card Request111$")
	    public void user_login_cards_management_card_request() throws Throwable {
		 driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
	    }

	    @Given("^User login in CSM Param in waive charge$")
	    public void user_login_in_csm_param_in_waive_charge() throws Throwable {
	    	driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMParamApplication();
	    }

	    @And("^User click  the Cards Management tab$")
	    public void user_click_the_cards_management_tab() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.CardManagement_Waive(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.CardManagement_Waive());
	    	Card_Managementobj.CardManagement_Waive().click();
	    	
	    }

	    @And("^User clicks  the Card Request tab$")
	    public void user_clicks_the_card_request_tab() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.CardRequest_CW(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.CardRequest_CW());
	    	Card_Managementobj.CardRequest_CW().click();
	    }

	    @And("^click the Approve tab button$")
	    public void click_the_approve_tab_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.Approve_CW(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.Approve_CW());
	    	Card_Managementobj.Approve_CW().click();
	    }

	    @And("^enter the search button$")
	    public void enter_the_search_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.SearchBUTTOn1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.SearchBUTTOn1());
	    	Card_Managementobj.SearchBUTTOn1().click();
	    }

	    @And("^enter the Card type under Card management$")
	    public void enter_the_card_type_under_card_management() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.CardType_CW(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.CardType_CW());
	    	Card_Managementobj.CardType_CW().click();
	    	Card_Managementobj.CardType_CW().sendKeys(testData.get("Card type"));
	    }

	    @And("^enter the CIF No under Card management$")
	    public void enter_the_cif_no_under_card_management() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.CIF_CW(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.CIF_CW());
	    	Card_Managementobj.CIF_CW().click();
	    	Card_Managementobj.CIF_CW().sendKeys(testData.get("CIF No"));
	    }

	    @And("^user click the Charges button$")
	    public void user_click_the_charges_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.Charges_CW(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.Charges_CW());
	    	Card_Managementobj.Charges_CW().click();
	    }

	    @And("^User click the  Parameters12 tab$")
	    public void user_click_the_parameters12_tab() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.Parameters12(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.Parameters12());
	    	Card_Managementobj.Parameters12().click();
	    }

	    @And("^User click the SystemParameters tab$")
	    public void user_click_the_systemparameters_tab() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.SystemParameters(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.SystemParameters());
	    	Card_Managementobj.SystemParameters().click();
	    }

	    @And("^User click the Transactiontype1 tab$")
	    public void user_click_the_transactiontype1_tab() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.Transactiontype1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.Transactiontype1());
	    	Card_Managementobj.Transactiontype1().click();
	    }

	    @And("^click the search button$")
	    public void click_the_search_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.SearchBUTTOn1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.SearchBUTTOn1());
	    	Card_Managementobj.SearchBUTTOn1().click();
	    }

	    @And("^Enter the code value in COdesearchbox$")
	    public void enter_the_code_value_in_codesearchbox() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.CODESEARCHbox1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.CODESEARCHbox1());
	    	Card_Managementobj.CODESEARCHbox1().click();
	    	Card_Managementobj.CODESEARCHbox1().sendKeys(testData.get("Code"));
	    }

	    @And("^Click the element short discription$")
	    public void click_the_element_short_discription() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.ShortDESCRIPTIONs(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.ShortDESCRIPTIONs());
	    	Card_Managementobj.ShortDESCRIPTIONs().click();
	    	Card_Managementobj.ShortDESCRIPTIONs().sendKeys(testData.get("Short Discription"));
	    }

	    @And("^Click the Element Allow User to clear$")
	    public void click_the_element_allow_user_to_clear() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.AllowUSERbox1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.AllowUSERbox1());
	    	Card_Managementobj.AllowUSERbox1().click(); 
	    }

	    @And("^Click the Update button$")
	    public void click_the_update_button() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.UpdateAfterAPPROVE123(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.UpdateAfterAPPROVE123());
	    	Card_Managementobj.UpdateAfterAPPROVE123().click();
	    }

	    @And("^Click the ok in successful$")
	    public void click_the_ok_in_successful() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Card_Managementobj.SearchBUTTOn1(), 60, 2);
	    	ClicksAndActionsHelperobj.moveToElement(Card_Managementobj.SearchBUTTOn1());
	    	Card_Managementobj.SearchBUTTOn1().click();
	    }


}
