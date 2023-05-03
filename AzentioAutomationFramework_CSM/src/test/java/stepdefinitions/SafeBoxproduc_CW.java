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
import pageobjects.StandingOrder_product;
import resources.BaseClass;

public class SafeBoxproduc_CW {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	StandingOrder_product SafeBox_productobj = new StandingOrder_product(driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);

	
	@Given("^User safebox in product login$")
    public void user_safebox_in_product_login() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();
    }

    @And("^User click on the Parameters12 in SafeBox product$")
    public void user_click_on_the_parameters12_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.Parameters12(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.Parameters12());
    	SafeBox_productobj.Parameters12().click();
    }

    @And("^User click on the SystemParameters in SafeBox product$")
    public void user_click_on_the_systemparameters_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.SystemParameters(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.SystemParameters());
    	SafeBox_productobj.SystemParameters().click();    }

    @And("^User click on the TransactionType in SafeBox product$")
    public void user_click_on_the_transactiontype_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.TransactionType(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.TransactionType());
    	SafeBox_productobj.TransactionType().click();    }

    @And("^User click on the UpdateAA in SafeBox product$")
    public void user_click_on_the_updateaa_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.UpdateAA(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.UpdateAA());
    	SafeBox_productobj.UpdateAA().click();
    }

    @And("^User click on the codeSO in SafeBox product$")
    public void user_click_on_the_codeso_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.codeSO(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.codeSO());
    	SafeBox_productobj.codeSO().click();
    	SafeBox_productobj.codeSO().sendKeys("code");
    	}

    @And("^User click on the StandingOrder in SafeBox product$")
    public void user_click_on_the_standingorder_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.StandingOrder(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.StandingOrder());
    	SafeBox_productobj.StandingOrder().click();    
    	}

    @And("^User click on the StandingOrderclick in SafeBox product$")
    public void user_click_on_the_standingorderclick_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.StandingOrderclick(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.StandingOrderclick());
    	SafeBox_productobj.StandingOrderclick().click(); 
    }

    @And("^User click on the Periodecil in SafeBox product$")
    public void user_click_on_the_periodecil_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.Periodecil(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.Periodecil());
    	SafeBox_productobj.Periodecil().click(); 
    }

    @And("^User click on the Codedaily in SafeBox product$")
    public void user_click_on_the_codedaily_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.Codedaily(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.Codedaily());
    	SafeBox_productobj.Codedaily().click(); 
    }

    @And("^User click on the DailySodoubleclick in SafeBox product$")
    public void user_click_on_the_dailysodoubleclick_in_safebox_product() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, SafeBox_productobj.DailySodoubleclick(), 60, 2);
    	ClicksAndActionsHelperobj.moveToElement(SafeBox_productobj.DailySodoubleclick());
    	SafeBox_productobj.DailySodoubleclick().click(); 
    }
}
