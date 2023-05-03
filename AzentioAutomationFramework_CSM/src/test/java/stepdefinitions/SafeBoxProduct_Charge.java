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
import pageobjects.SafeBox_product;
import resources.BaseClass;

public class SafeBoxProduct_Charge {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	SafeBox_product SafeBox_productobj = new SafeBox_product(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	
	@Given("^Login in to SafeBox Product$")
    public void login_in_to_safebox_product() throws Throwable {
		  driver.get(configFileReader.getCSMApplicationUrl());
	        login.loginIntoCSMApplication();
    }

    @And("^User Click on the SafeBoxproduct in to SafeBox CW$")
    public void user_click_on_the_safeboxproduct_in_to_safebox_cw() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SafeBoxproduct(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SafeBoxproduct());
        SafeBox_productobj.SafeBoxproduct().click();
    }

    @And("^User Click on the RequestButton in to SafeBox CW$")
    public void user_click_on_the_requestbutton_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.RequestButton(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.RequestButton());
         SafeBox_productobj.RequestButton().click();
    }

    @And("^User Click on the SafeboxtransactionNo in to SafeBox CW$")
    public void user_click_on_the_safeboxtransactionno_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SafeboxtransactionNo(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SafeboxtransactionNo());
         SafeBox_productobj.SafeboxtransactionNo().click();
    }

    @And("^User Click on the MAHMOUD123 in to SafeBox CW$")
    public void user_click_on_the_mahmoud123_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.MAHMOUD123(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.MAHMOUD123());
         SafeBox_productobj.MAHMOUD123().click();
    }

    @And("^User Click on the closebutton in to SafeBox CW$")
    public void user_click_on_the_closebutton_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.closebutton(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.closebutton());
         SafeBox_productobj.closebutton().click();
    }

    @And("^User Click on the SystemParameters in to SafeBox CW$")
    public void user_click_on_the_systemparameters_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SystemParameters(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SystemParameters());
         SafeBox_productobj.SystemParameters().click();
    }

    @And("^User Click on the safeboxparam in to SafeBox CW$")
    public void user_click_on_the_safeboxparam_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.safeboxparam(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.safeboxparam());
         SafeBox_productobj.safeboxparam().click();
    }

    @And("^User Click on the SafeBoxCharges in to SafeBox CW$")
    public void user_click_on_the_safeboxcharges_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SafeBoxCharges(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SafeBoxCharges());
         SafeBox_productobj.SafeBoxCharges().click();
    }

    @And("^User Click on the Maintenancebutton12 in to SafeBox CW$")
    public void user_click_on_the_maintenancebutton12_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.Maintenancebutton12(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.Maintenancebutton12());
         SafeBox_productobj.Maintenancebutton12().click();
    }

    @And("^User Click on the Safeboxfee in to SafeBox CW$")
    public void user_click_on_the_safeboxfee_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.Safeboxfee(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.Safeboxfee());
         SafeBox_productobj.Safeboxfee().click();
    }

    @And("^User Click on the SmallBoxFee in to SafeBox CW$")
    public void user_click_on_the_smallboxfee_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SmallBoxFee(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SmallBoxFee());
         SafeBox_productobj.SmallBoxFee().click();
    }

    @And("^User Click on the CIFTypesCharges in to SafeBox CW$")
    public void user_click_on_the_ciftypescharges_in_to_safebox_cw() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.CIFTypesCharges(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.CIFTypesCharges());
         SafeBox_productobj.CIFTypesCharges().click();
    }

}