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
import pageobjects.CardDetails_product;
import pageobjects.SMS_productCW;
import resources.BaseClass;

public class Product_cardCharge {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	CardDetails_product CardDetails_productobj = new CardDetails_product(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	@Given("^User login process to card Product$")
    public void user_login_process_to_card_product() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();    }

    @And("^user click on the Parameters12 in card management$")
    public void user_click_on_the_parameters12_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Parameters12(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Parameters12());
    	CardDetails_productobj.Parameters12().click();
    }

    @And("^user click on the SystemParameters in card management$")
    public void user_click_on_the_systemparameters_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.SystemParameters(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.SystemParameters());
    	CardDetails_productobj.SystemParameters().click();
    }

    @And("^user click on the Cardsbutton in card management$")
    public void user_click_on_the_cardsbutton_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Cardsbutton(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Cardsbutton());
    	CardDetails_productobj.Cardsbutton().click();
    }

    @And("^user click on the Cardstypebutton in card management$")
    public void user_click_on_the_cardstypebutton_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Cardstypebutton(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Cardstypebutton());
    	CardDetails_productobj.Cardstypebutton().click();
    }

    @And("^user click on the Maintenancebutton13 in card management$")
    public void user_click_on_the_maintenancebutton13_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Maintenancebutton13(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Maintenancebutton13());
    	CardDetails_productobj.Maintenancebutton13().click();
    }

    @And("^user click on the Cardcode in card management$")
    public void user_click_on_the_cardcode_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Cardcode(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Cardcode());
    	CardDetails_productobj.Cardcode().click();
    }

    @And("^user click on the Updatebutton1 in card management$")
    public void user_click_on_the_updatebutton1_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Updatebutton1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Parameters12());
    	CardDetails_productobj.Parameters12().click();
    }

    @And("^user click on the CardManagement in card management$")
    public void user_click_on_the_cardmanagement_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.Updatebutton1(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.Updatebutton1());
    	CardDetails_productobj.Updatebutton1().click();
    }

    @And("^user click on the CardRequest in card management$")
    public void user_click_on_the_cardrequest_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.CardRequest(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.CardRequest());
    	CardDetails_productobj.CardRequest().click();
    }

    @And("^user click on the CIFbutton in card management$")
    public void user_click_on_the_cifbutton_in_card_management() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, CardDetails_productobj.CIFbutton(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(CardDetails_productobj.CIFbutton());
    	CardDetails_productobj.CIFbutton().click();
    }
}
