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
import io.cucumber.java.en.Then;
import pageobjects.FunctionalTesting_ChequeBook;
import pageobjects.StandingOrder_product;
import resources.BaseClass;

public class ChargeWaiver_Cheaquebook {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	FunctionalTesting_ChequeBook FunctionalTesting_ChequeBookobg = new FunctionalTesting_ChequeBook (driver);
	ClicksAndActionsHelper ClicksAndActionsHelperobj = new ClicksAndActionsHelper(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader =  new ConfigFileReader();
	Map<String, String> testData = new HashMap<>();
	Map<String, String> loginTestData = new HashMap<>();
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	
	
	
	
	@Given("^user login to CSM in charge waiver$")
    public void user_login_to_chequebook_in_charge_waiver() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMApplication();
    }

    @Given("^User login to CSM Param in Charge Waiver$")
    public void user_login_to_csm_param_in_charge_waiver() throws Throwable {
        driver.get(configFileReader.getCSMApplicationUrl());
        login.loginIntoCSMParamApplication();
    }
    
    @And("^user click on the chequebook request in functional testing$")
    public void user_click_on_the_chequebook_request_in_functional_testing() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.chequebook1(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.chequebook1());
        FunctionalTesting_ChequeBookobg.chequebook1().click();
    }

    @And("^user click on the Maintenance in functional testing$")
    public void user_click_on_the_maintenance_in_functional_testing() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Maintenancebutton12(), 60, 2);
         ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Maintenancebutton12());
         FunctionalTesting_ChequeBookobg.Maintenancebutton12().click();
        
    }

    @And("^user click on the Searchbox in functional testing$")
    public void user_click_on_the_searchbox_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.SearchBUTTOn(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.SearchBUTTOn());
        FunctionalTesting_ChequeBookobg.SearchBUTTOn().click();
       
    }

    @And("^user click on the Code in functional testing$")
    public void user_click_on_the_code_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.CODESEARCHbox(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.CODESEARCHbox());
        FunctionalTesting_ChequeBookobg.CODESEARCHbox().click();
        FunctionalTesting_ChequeBookobg.CODESEARCHbox().sendKeys(testData.get("code"));
    }

    @And("^user click on the GLcode in functional testing$")
    public void user_click_on_the_glcode_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.GLCode(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.GLCode());
        FunctionalTesting_ChequeBookobg.GLCode().click();
        FunctionalTesting_ChequeBookobg.GLCode().sendKeys(testData.get("GLcode"));
    
    }

    @And("^user click on the Charges in functional testing$")
    public void user_click_on_the_charges_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Charges(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Charges());
        FunctionalTesting_ChequeBookobg.Charges().click();
    }

    @And("^user click on the Save in functional testing$")
    public void user_click_on_the_save_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Savebox(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Savebox());
        FunctionalTesting_ChequeBookobg.Savebox().click();
    }

    @And("^user click on the Parameters in functional testing$")
    public void user_click_on_the_parameters_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Parameters12(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Parameters12());
        FunctionalTesting_ChequeBookobg.Parameters12().click();
    }

    @And("^user click on the System Parameters in functional testing$")
    public void user_click_on_the_system_parameters_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.SystemParameters(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.SystemParameters());
        FunctionalTesting_ChequeBookobg.SystemParameters().click();
        
    }

    @And("^user click on the Transaction Type in functional testing$")
    public void user_click_on_the_transaction_type_in_functional_testing() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Transactiontype(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Transactiontype());
        FunctionalTesting_ChequeBookobg.Transactiontype().click();
    }

    @And("^user click on the Update after Approve$")
    public void user_click_on_the_update_after_approve() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE());
        FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE().click();
    }

    @And("^user click on the Short DIscription$")
    public void user_click_on_the_short_discription() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.ShortDESCRIPTION(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.ShortDESCRIPTION());
        FunctionalTesting_ChequeBookobg.ShortDESCRIPTION().click();
        FunctionalTesting_ChequeBookobg.ShortDESCRIPTION().sendKeys(testData.get("Short Discription$"));
    }

    @And("^user Click on the Allowuser to clear Charges$")
    public void user_click_on_the_allowuser_to_clear_charges() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.AllowUSERbox(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.AllowUSERbox());
        FunctionalTesting_ChequeBookobg.AllowUSERbox().click();
        }

    @And("^user click on the Approve$")
    public void user_click_on_the_approve() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE12(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE12());
        FunctionalTesting_ChequeBookobg.UpdateAfterAPPROVE12().click();
    }
    @Then("^Click on the Submit button$")
    public void click_on_the_submit_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.okBUTTON(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.okBUTTON());
        FunctionalTesting_ChequeBookobg.okBUTTON().click();
    }
    @And("^user click on the Code$")
    public void user_click_on_the_code() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, FunctionalTesting_ChequeBookobg.Chequecode(), 60, 2);
        ClicksAndActionsHelperobj.moveToElement(FunctionalTesting_ChequeBookobg.Chequecode());
        FunctionalTesting_ChequeBookobg.Chequecode().click();
    
    }

}

	

